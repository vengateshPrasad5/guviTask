package com.training.DesignPattern.ObserverDP;

public class Subscriber {
    private String name;
    private Channel channel;

    public Subscriber(String name) {
        this.name = name;
    }

    public void update(){
        System.out.println("Hi " +name+" Video Uploaded : "+channel.title);
    }

    public void subscribeChannel(Channel channel){
        this.channel = channel;
    }
}
