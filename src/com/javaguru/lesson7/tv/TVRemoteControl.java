package com.javaguru.lesson7.tv;

public class TVRemoteControl {

    private TV tv;

    public TVRemoteControl(TV tv) {
        this.tv = tv;
    }

    public void power() {
        if (tv.isPower()) {
            System.out.println("POWER: OFF");
            tv.setPower(false);
        } else {
            System.out.println("POWER: ON");
            tv.setPower(true);
        }
    }

    public void channelIncrease() {

        int currentChannel = tv.getChannel();
        tv.setChannel(++currentChannel);
    }

    public void channelDecrease() {
        int currentChannel = tv.getChannel();
        tv.setChannel(--currentChannel);
    }

    public void volumeIncrease() {
        int currentVolume = tv.getVolume();
        tv.setVolume(++currentVolume);
    }

    public void volumeDecrease() {
        int currentVolume = tv.getVolume();
        tv.setVolume(--currentVolume);
    }

}
