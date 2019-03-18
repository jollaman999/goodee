package chap18.network;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;

public class ChatServerEx1 {
    private static HashMap<String, ObjectOutputStream> hm =
            new HashMap<>();

    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(6000);
        //noinspection InfiniteLoopStatement
        while (true) {
            System.out.println("클라이언트 접속 대기 중");
            Socket client = server.accept();
            ChatServerThread ct = new ChatServerThread(client);
            ct.start();
        }
    }

    static class ChatServerThread extends Thread {
        Socket client;
        ObjectInputStream ois;
        ObjectOutputStream oos;
        String userid;

        ChatServerThread(Socket client) {
            this.client = client;
            try {
                ois = new ObjectInputStream(client.getInputStream());
                oos = new ObjectOutputStream(client.getOutputStream());
                userid = (String) ois.readObject();
                System.out.println(userid + " 접속함");
                synchronized (hm) {
                    hm.put(userid, oos);
                }
                broadcast(userid + "님이 입장하셨습니다.");
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }

        @Override
        public void run() {
            String rcvData;

            try {
                while (true) {
                    rcvData = (String) ois.readObject();
                    if (rcvData.equals("/bye"))
                        break;
                    else if (rcvData.startsWith("/to"))
                        sendMsg(rcvData);
                    else
                        broadcast(userid + ":" + rcvData);
                }
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            } finally {
                broadcast(userid + "님이 퇴장 하셨습니다.");
                hm.remove(userid);
                try {
                    if (client != null)
                        client.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        private void broadcast(String msg) {
            try {
                for (ObjectOutputStream o : hm.values()) {
                    o.writeObject(msg);
                    o.flush();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        private void sendMsg(String rcvData) {
            int begin = rcvData.indexOf(" ") + 1;
            int end = rcvData.indexOf(" ", begin);
            if (end != -1) {
                String id = rcvData.substring(begin, end);
                String msg = rcvData.substring(end + 1);
                ObjectOutputStream oos = hm.get(id);
                ObjectOutputStream oos2 = hm.get(userid);
                if (oos != null) {
                    try {
                        oos.writeObject(userid + "님의 귓속말 : " + msg);
                        oos.flush();
                        oos2.writeObject(id + "님에게 귓속말 전송" + msg);
                        oos2.flush();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
