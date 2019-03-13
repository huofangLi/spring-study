package com.spring.orm.aop;

public class MoveApp {
    public static void main(String[] args) {
        Move t1 = new Tank();

        Move moveProxy = new TankProxy(t1);

        moveProxy.move();
    }
}
