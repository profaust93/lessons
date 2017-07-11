package com.javaguru.lesson7.tv;

public class TV {

    private int volume;
    private int channel;
    private boolean power;

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        if (channel > 10) {
            channel = 0;
        } else if (channel <= 0) {
            channel = 10;
        }
        this.channel = channel;
        System.out.println("Current channel: " + channel);
    }

    public boolean isPower() {
        return power;
    }

    public void setPower(boolean power) {
        this.power = power;
    }
}
