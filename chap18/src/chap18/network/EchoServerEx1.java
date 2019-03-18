package chap18.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServerEx1 {
    public static void main(String[] args) throws IOException {
        // 8000번 포트 binding 하고 대기 상태.
        // binding : OS로 부터 포트를 할당 받는 기능.
        ServerSocket server = new ServerSocket(8000);
        System.out.println("클라이언트 접속 대기 중");

        // 클라이언트 접속 대기 중
        // client : 클라이언트가 생성한 Socket 객체
        Socket client = server.accept();

        System.out.println("server ip : " + client.getLocalAddress());
        System.out.println("server port : " + client.getLocalPort());
        System.out.println("client ip : " + client.getInetAddress());
        System.out.println("client port : " + client.getPort());

        // out : client.getOutputStream() : 클라이언트로 데이터를 전송 객체
        // in : client.getInputStream() : 클라이언트로 부터 데이터를 수신 객체
        PrintWriter out = new PrintWriter(client.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));

        String input;
        while ((input = in.readLine()) != null) {
            System.out.println("client msg : " + input);
            out.println(input); // println 으로 해야 readLine 으로 읽어짐
            out.flush();
        }

        in.close();
        out.close();
        client.close();
        server.close();
    }
}
