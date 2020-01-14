package com;

public class Sync {
    synchronized void syncMethod(){}
    public void add(){
        synchronized (this) {

        }
    }
}
