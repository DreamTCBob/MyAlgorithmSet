package com;

import java.beans.EventHandler;

public class Son extends Father {

    @Override
    public void out() {
        System.out.println(2);
//        super.out();
    }

    public static void main(String[] args) {
        Son son = new Son();
        Father father = new Son();
        Father father1;
        try {
            father1 = (Father) father.clone();
        }catch (Exception e){
            father1 = null;
            e.printStackTrace();
        }
        father1.out();
        System.out.println(father.equals(father1));
        father.out();
    }


}
