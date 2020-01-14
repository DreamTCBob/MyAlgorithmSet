package com;

public class SubjectService implements Subject{

    @Override
    public void rent() {
        System.out.println("I want to rent my house");
    }

    @Override
    public void hello(String string) {
        System.out.println("hello:" + string);
    }
}
