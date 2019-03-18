package chap18.network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressEx1 {
    public static void main(String[] args) {
        InetAddress ip;
        try {
            ip = InetAddress.getByName("www.goodee.co.kr");
            System.out.println("getByName() 메서드를 이용한 InetAddress 객체 생성");
            System.out.println("hostname : " + ip.getHostName());
            System.out.println("ip address : " + ip.getHostAddress());
        } catch (UnknownHostException e) {
            System.out.println("알 수 없는 호스트!");
            return;
        }

        // byte 형으로 조회하기
        byte[] ipAddr = ip.getAddress();
        for (byte b : ipAddr)
            System.out.print((b < 0 ? b + 256 : b) + ".");
        System.out.println();

        System.out.println("getAllByName() 메서드를 이용한 InetAddress 객체 생성");
        try {
            InetAddress ips[] = InetAddress.getAllByName("www.google.com");
            for (InetAddress i : ips) {
                System.out.println("IP : " + i);
            }
        } catch (UnknownHostException e) {
            System.out.println("알 수 없는 호스트!");
        }

        System.out.println("자신의 컴퓨터 주소 : getLocalHost() 메서드를 이용한 InetAddress 객체 생성");
        try {
            InetAddress local = InetAddress.getLocalHost();
            System.out.println("내 컴퓨터 IP : " + local);
        } catch (UnknownHostException e) {
            System.out.println("알 수 없는 호스트!");
        }

        System.out.println("getByAddress() 메서드를 이용한 InetAddress 객체 생성");
        try {
            InetAddress ip2 = InetAddress.getByAddress(ip.getAddress());
            System.out.println(ip2);
        } catch (UnknownHostException e) {
            System.out.println("알 수 없는 호스트!");
        }
    }
}
