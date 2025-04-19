package observer.impl;

import observer.Observer;

public class Subscriber implements Observer {

    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String videoTitle) {
        System.out.println("Hey " + name + ", new video uploaded: " + videoTitle);
    }
}
