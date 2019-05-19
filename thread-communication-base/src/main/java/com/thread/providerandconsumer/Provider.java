package com.thread.providerandconsumer;

/**
 * @Author: 西门小狼狗
 * @Date: 2019/5/19 15:53
 */
public class Provider extends Thread {

    public void run(){
        while (true){
            synchronized (Kuang.kuang){
                if(Kuang.kuang.size() == 10){
                    //当筐中已经存在10个apple唤醒小孩吃苹果
                    Kuang.kuang.notify();
                    try {
//                        Kuang.kuang.wait();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }else{
                    Kuang.kuang.add("Apple");
                    System.out.println("添加Apple,剩余："+Kuang.kuang.size()+"个");
                }
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
