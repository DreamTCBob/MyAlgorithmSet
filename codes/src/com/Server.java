package com;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        //绑定服务的端口 IP默认为本机IP
        //暴露一个服务，该服务的地址是本机IP:9999
        ServerSocket server = new ServerSocket(9999);
        //accept返回值是一个socket对象
        Socket socket = server.accept();
        System.out.println("客户端连接成功！");

        //服务端向客户端发送消息
        OutputStream outputStream = socket.getOutputStream();
        String info = "hello";
        outputStream.write(info.getBytes());
        InputStream inputStream  = socket.getInputStream();
        byte[] bytes = new byte[100];
        inputStream.read(bytes);
        System.out.println("服务端接收到的消息是：" + new String(bytes));
    }
}
