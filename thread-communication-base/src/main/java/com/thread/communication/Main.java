package com.thread.communication;

/**
 * @Author: 西门小狼狗
 * @Date: 2019/5/19 14:25
 */
public class Main {

    public static void main(String[] args) {
        ThreadForPrintA printA = new ThreadForPrintA();
        ThreadForPrintB printB = new ThreadForPrintB();
        printA.start();
        printB.start();
    }
}
