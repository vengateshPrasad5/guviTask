package com.training.DesignPattern.ObserverDP;

import java.util.ArrayList;
import java.util.List;

public class Channel {
    public String title;
    public List<Subscriber> subs = new ArrayList<>();

    public void addSubscriber(Subscriber subscriber){
        subs.add(subscriber);
    }

    public void removeSubscriber(Subscriber subscriber){
        subs.remove(subscriber);
    }

    public void uploadVideo(String name){
        title = name;
        for (Subscriber sub: subs){
            sub.update();
        }
    }
}
