package com;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.net.Socket;


public class Client {

    public static void main(String[] args) throws IOException {
        /**
         * 代理
         */
        //    我们要代理的真实对象
//        Subject realSubject = new SubjectService();
//        //    我们要代理哪个真实对象，就将该对象传进去，最后是通过该真实对象来调用其方法的
//        InvocationHandler handler = new DynamicProxy(realSubject);
//        /*
//         * 通过Proxy的newProxyInstance方法来创建我们的代理对象，我们来看看其三个参数
//         * 第一个参数 handler.getClass().getClassLoader() ，我们这里使用handler这个类的ClassLoader对象来加载我们的代理对象
//         * 第二个参数realSubject.getClass().getInterfaces()，我们这里为代理对象提供的接口是真实对象所实行的接口，表示我要代理的是该真实对象，这样我就能调用这组接口中的方法了
//         * 第三个参数handler， 我们这里将这个代理对象关联到了上方的 InvocationHandler 这个对象上
//         */
//        Subject subject = (Subject) Proxy.newProxyInstance(handler.getClass().getClassLoader(), realSubject.getClass().getInterfaces(), handler);
//        System.out.println(subject.getClass().getName());
//        subject.rent();
//        subject.hello("word");
        /**
         * Socket Client
         * 客户端连接Server发布的服务
         */
        Socket socket = new Socket("127.0.0.1", 9999);
        //接收服务端的消息
        InputStream inputStream = socket.getInputStream();
        byte[] bytes = new byte[100];
        inputStream.read(bytes);
        System.out.println("client接收到的消息为" + new String(bytes));
        //客户端向服务端做出反馈
        OutputStream outputStream = socket.getOutputStream();
        String s = "cnm";
        outputStream.write(s.getBytes());
    }
}
