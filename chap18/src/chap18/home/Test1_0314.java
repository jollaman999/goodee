package chap18.home;

/*
멀티 echo 서버 구현하기
하나의 서버가 여러개의 클라이언트와 통신하기.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Test1_0314 {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(8000);

        //noinspection InfiniteLoopStatement
        while (true) {
            System.out.println("클라이언트 접속 대기 중");
            Socket client = server.accept();
            new Thread(new EchoServerThread(client)).start();
        }
    }

    static class EchoServerThread implements Runnable {
        Socket client;
        PrintWriter out;
        BufferedReader in;

        EchoServerThread(Socket client) {
            this.client = client;
            try {
                out = new PrintWriter(client.getOutputStream(), true);
                in = new BufferedReader(new InputStreamReader(client.getInputStream()));
            } catch (IOException e) {
                e.printStackTrace();
            }

            System.out.println("server ip : " + client.getLocalAddress());
            System.out.println("server port : " + client.getLocalPort());
            System.out.println("client ip : " + client.getInetAddress());
            System.out.println("client port : " + client.getPort());
        }

        @Override
        public void run() {
            String input;
            try {
                while ((input = in.readLine()) != null) {
                    System.out.println("client msg : " + input);
                    out.println(input); // println 으로 해야 readLine 으로 읽어짐
                    out.flush();
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    in.close();
                    out.close();
                    client.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
