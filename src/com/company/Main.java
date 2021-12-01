package com.company;

import java.lang.annotation.Annotation;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    private static AtomicInteger atomicInteger = new AtomicInteger(0);

    public static void main(String[] args) {
	// write your code here
        System.out.println("11111111111111111111222333333333333333333");
        Number asdf ;
        Annotation a;
        while (true){
            System.out.println(nextOutTradeNo());
            try
            {
                Thread.sleep(1000);
            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
    public static synchronized String nextOutTradeNo() {
//        String pre = DateUtil.format(DateTime.now(), DatePattern.PURE_DATETIME_PATTERN);
        // 递增生成最大9999的递增ID
        if (atomicInteger.get() == 9999) {
            atomicInteger.set(0);
        }
        int i = atomicInteger.getAndIncrement();
        String af = String.format("%04d", i);
        String outNo = "" + af;
        return outNo;
    }
}

