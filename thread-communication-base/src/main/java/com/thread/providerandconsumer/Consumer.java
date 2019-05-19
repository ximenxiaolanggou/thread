package com.thread.providerandconsumer;

/**
 * @Author: 西门小狼狗
 * @Date: 2019/5/19 15:58
 */
public class Consumer extends Thread {

    public void run(){
        while (true){
            synchronized (Kuang.kuang){
                if(Kuang.kuang.size() == 0){
                    //唤醒农夫放苹果
                    Kuang.kuang.notify();
                    try {
//                        Kuang.kuang.wait();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }else{
                    Kuang.kuang.remove("Apple");
                    System.out.println("消费Apple,剩余："+Kuang.kuang.size()+"个");
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
