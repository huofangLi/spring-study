package com.spring.orm.aop;

public class Tank implements Move {
    @Override
    public void move() {
        System.out.println("Tank is moving...");
    }
}
