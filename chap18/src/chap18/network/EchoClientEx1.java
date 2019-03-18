package chap18.network;

import java.io.*;
import java.net.Socket;

public class EchoClientEx1 {
    public static void main(String[] args) throws IOException {
        // stdin : 키보드 입력
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        // new Socket(IP 주소, 포트)
        Socket client = new Socket("192.168.10.100", 8000);
        // Socket 으로 부터 IO 스트림 객체를 할당
        // in : client.getInputStream() => 입력스트림
        //         서버의 데이터를 입력받는 객체
        // out : client.getOutputStream() => 출력스트림
        //         서버로 데이터를 출력하는 객체
        BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
        PrintWriter out = new PrintWriter(client.getOutputStream());

        System.out.println("local ip : " + client.getOutputStream());
        System.out.println("local port : " + client.getLocalAddress());
        System.out.println("server ip : " + client.getInetAddress());
        System.out.println("server port : " + client.getPort());
        System.out.println("메세지를 입력하세요");

        String input;
        while ((input = stdin.readLine()) != null) {
            if (input.equals("bye"))
                break;
            // 키보드로부터 입력된 내용을 서버로 전송
            out.println(input); // println 으로 해야 readLine 으로 읽어짐
            out.flush();
            // in.readLine() : 서버에서 보내준 내용을 수신
            System.out.println("server echo : " + in.readLine());
            System.out.println("메세지를 입력하세요");
        }

        out.close();
        in.close();
        stdin.close();
        client.close();
    }
}
