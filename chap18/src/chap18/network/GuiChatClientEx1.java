package chap18.network;

/*
멀티 채팅 클라이언트 프로그램
GUI 환경 : AWT 자바 SPI 사용하여 코딩

Frame : 윈도우창.
ActionListener : Action 이벤트 처리 관련 인터페이스
 */

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class GuiChatClientEx1 extends Frame implements ActionListener {
    private CardLayout c1;
    Button btnexit, btnsend, btnconnect;
    private TextArea talist;
    private TextField tfip, tfname, tfinput;

    private ObjectOutputStream oos;
    private ObjectInputStream ois;

    public static void main(String[] args) {
        new GuiChatClientEx1();
    }

    private GuiChatClientEx1() {
        super("채팅프로그램 예제");
        c1 = new CardLayout();
        setLayout(c1);

        Panel connect = new Panel();
        connect.setLayout(new BorderLayout());
        connect.add("North", new Label("채팅접속화면", Label.CENTER));

        Panel conn_sub = new Panel();
        conn_sub.setLayout(new GridLayout(10, 1));
        conn_sub.add(new Label("서버 IP", Label.CENTER));

        tfip = new TextField("127.0.0.1", 15);
        conn_sub.add(tfip);
        conn_sub.add(new Label("사용자 ID", Label.CENTER));
        tfname = new TextField("홍길동", 15);
        conn_sub.add(tfname);

        connect.add("Center", conn_sub);

        // 버튼 클릭시 발생되는 이벤트
        // ActionEvent의 관리 리스너 : ActionListener
        // ActionListener 에 등록하기 위해서는 ActionListener 타입의 인터페이스 객체로 통합
        btnconnect = new Button("서버 접속");
        connect.add("South", btnconnect);
        btnconnect.addActionListener(this);

        Panel chat = new Panel();
        chat.setLayout(new BorderLayout());
        chat.add("North", new Label("채팅 ver1.0"));
        talist = new TextArea();
        chat.add("Center", talist);

        Panel chat_sub = new Panel();
        tfinput = new TextField("", 25);
        btnexit = new Button("종료");
        btnsend = new Button("전송");

        chat_sub.add(tfinput);
        chat_sub.add(btnexit);
        chat_sub.add(btnsend);

        tfinput.addActionListener(this);
        btnexit.addActionListener(this);
        btnsend.addActionListener(this);

        chat.add("South", chat_sub);
        add(connect, "접속창");
        add(chat, "채팅창");
        c1.show(this, "접속창");
        setSize(500, 500);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    // 이벤트 핸들러
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            Object obj = e.getSource();
            if (obj == btnconnect)
                init();
            else if (obj == btnexit)
                System.exit(0);
            else {
                String sendData = tfinput.getText();
                oos.writeObject(sendData);
                oos.flush();
                tfinput.setText("");
                tfinput.requestFocus();
            }
        } catch (IOException ie) {
            ie.printStackTrace();
        }
    }

    private void init() {
        try {
            String ip = tfip.getText();
            Socket client = new Socket(ip, 6000);

            oos = new ObjectOutputStream(client.getOutputStream());
            ois = new ObjectInputStream(client.getInputStream());
            String userid = tfname.getText();
            oos.writeObject(userid);
            oos.flush();

            ReceiveDataThread rt = new ReceiveDataThread();
            rt.setDaemon(true);
            rt.start();

            c1.show(this, "채팅창");
            setTitle(userid + "채팅창");
            tfinput.requestFocus();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    class ReceiveDataThread extends Thread {
        String rcvData;

        public void run() {
            try {
                //noinspection InfiniteLoopStatement
                while (true) {
                    rcvData = (String)ois.readObject();
                    talist.append(rcvData + "\n");
                }
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
}
