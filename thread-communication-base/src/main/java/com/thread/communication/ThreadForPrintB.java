package com.thread.communication;

/**
 * @Author: 西门小狼狗
 * @Date: 2019/5/19 14:26
 */
public class ThreadForPrintB extends Thread {

    public void run(){
        for (int i = 0 ; i < 10 ; i++){
            synchronized (LockObj.object){
                //1.工作
                System.out.println("B");
                //2.唤醒
                LockObj.object.notify();
                //3.等待
                try {
                    LockObj.object.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
