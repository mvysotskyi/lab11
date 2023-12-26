package com.lab.task3;

public class Main {
    public static void main(String[] args) {
        MyImage image = new ProxyImage("image.jpg");
        image.display();

        System.out.println("");
        image.display();
    }
}
