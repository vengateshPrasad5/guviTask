package com.training.DesignPattern.ObserverDP;

public class YT {
    public static void main(String[] args) {
        Channel coding = new Channel();

        Subscriber s1 = new Subscriber("V1");
        Subscriber s2 = new Subscriber("V2");
        Subscriber s3 = new Subscriber("V3");
        Subscriber s4 = new Subscriber("V4");
        Subscriber s5 = new Subscriber("V5");
        Subscriber s6 = new Subscriber("V6");

        coding.addSubscriber(s1);
        coding.addSubscriber(s2);
        coding.addSubscriber(s3);
        coding.addSubscriber(s4);
        coding.addSubscriber(s5);
        coding.addSubscriber(s6);

        s1.subscribeChannel(coding);
        s2.subscribeChannel(coding);
        s3.subscribeChannel(coding);
        s4.subscribeChannel(coding);
        s5.subscribeChannel(coding);
        s6.subscribeChannel(coding);

        coding.removeSubscriber(s3);

        coding.uploadVideo("Hello World");
    }
}
