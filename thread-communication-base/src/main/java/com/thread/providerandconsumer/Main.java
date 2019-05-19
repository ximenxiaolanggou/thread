package com.thread.providerandconsumer;

/**
 * @Author: 西门小狼狗
 * @Date: 2019/5/19 16:01
 */
public class Main {
    public static void main(String[] args) {
        Provider provider = new Provider();
        Consumer consumer = new Consumer();
        provider.start();
        consumer.start();
    }
}
