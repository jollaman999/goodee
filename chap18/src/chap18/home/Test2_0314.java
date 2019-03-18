package chap18.home;

/*
간단한 웹서버 구현하기
 */

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Test2_0314 {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(8080);
        //noinspection InfiniteLoopStatement
        while (true) {
            System.out.println("클라이언트 접속 대기");
            Socket client = server.accept();
            new Thread(new HttpThread(client)).start();
        }
    }

    static class HttpThread implements Runnable {
        private Socket client;
        BufferedReader br;
        PrintWriter pw;

        HttpThread(Socket client) {
            this.client = client;
            try {
                br = new BufferedReader(new InputStreamReader(client.getInputStream()));
                pw = new PrintWriter(client.getOutputStream());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public void run() {
            BufferedReader fbr = null;
            try {
                String line = br.readLine();
                System.out.println("Http Header : " + line);
                int start = line.indexOf("/") + 1;
                int end = line.lastIndexOf("HTTP") - 1;
                String filename = line.substring(start, end);
                if (filename.equals(""))
                    filename = "index.html";
                fbr = new BufferedReader(new FileReader(filename));
                String fline;
                while((fline = fbr.readLine()) != null) {
                    pw.println(fline);
                    pw.flush();
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (fbr != null)
                        fbr.close();
                    if (br != null)
                        br.close();
                    if (pw != null)
                        pw.close();
                    if (client != null)
                        client.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
