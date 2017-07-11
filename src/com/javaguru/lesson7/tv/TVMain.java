package com.javaguru.lesson7.tv;

public class TVMain {

    public static void main(String[] args) throws InterruptedException {
        TV tv = new TV();
        TVRemoteControl tvRemoteControl = new TVRemoteControl(tv);

        tvRemoteControl.power();
        tvRemoteControl.channelDecrease();

    }
}
