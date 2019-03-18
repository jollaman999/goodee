package chap18.network;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleWebServerEx2 {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(8080);
        //noinspection InfiniteLoopStatement
        while (true) {
            System.out.println("클라이언트 접속 대기");
            Socket client = server.accept();
            HttpThread ht = new HttpThread(client); // 1 thread = 1 브라우저 (클라이언트)
            ht.start();
        }
    }

    static class HttpThread extends Thread {
        private Socket client;
        BufferedInputStream bis;
        BufferedOutputStream bos;

        HttpThread(Socket client) {
            this.client = client;
            try {
                bis = new BufferedInputStream(client.getInputStream());
                bos = new BufferedOutputStream(client.getOutputStream());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public void run() {
            FileInputStream fis = null;
            try {
                byte[] buf = new byte[8096];
                int len = bis.read(buf);
                String line = new String(buf, 0, len);
                System.out.println("Http Header : " + line);
                int start = line.indexOf("/") + 1;
                int end = line.lastIndexOf("HTTP") - 1;
                String filename = line.substring(start, end);
                if (filename.equals(""))
                    filename = "index.html";
                fis = new FileInputStream(filename);
                while((len = fis.read(buf)) != -1) {
                    bos.write(buf, 0, len);
                    bos.flush();
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (fis != null)
                        fis.close();
                    if (bis != null)
                        bis.close();
                    if (bos != null)
                        bos.close();
                    if (client != null)
                        client.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
