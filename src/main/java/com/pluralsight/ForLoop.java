package com.pluralsight;

import org.w3c.dom.ls.LSOutput;

public class ForLoop {
    public static void main(String[] args) throws InterruptedException{

        for (int count = 10; count >= 1; count--) {
            Thread.sleep(1000);
            System.out.println(count);
        }
        System.out.println("Launch!");
    }
}
