package com;

import java.io.*;

public class TestSerializable {
    public static void main(String[] args) throws Exception, IOException {
        SerializeUser();
        DeSerializeUser();
        System.gc();
    }
    private static void SerializeUser() throws FileNotFoundException, IOException{
        User user = new User();
        user.setName("LYB");
        user.setAge(24);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("E://Nacelle-Rent/back-end/test.txt"));
        oos.writeObject(user);
        oos.close();
        System.out.println("序列化对象成功");
    }
    private static void DeSerializeUser() throws FileNotFoundException, IOException{
        File file = new File("E://Nacelle-Rent/back-end/test.txt");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        User newUser= null;
        try {
            newUser = (User) ois.readObject();
        }catch (Exception e){
            e.printStackTrace();
        }
        int age = newUser.getAge();
        newUser.setAge(32);
        System.out.println(age);
        System.out.println("反序列化对象成功" + newUser.toString());
    }
}
