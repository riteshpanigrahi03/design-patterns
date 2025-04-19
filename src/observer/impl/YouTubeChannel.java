package observer.impl;

import observer.Observer;
import observer.Subject;

import java.util.ArrayList;
import java.util.List;

public class YouTubeChannel implements Subject {

    private List<Observer> subscribers = new ArrayList<>();
    private String channelName;

    public YouTubeChannel(String channelName) {
        this.channelName = channelName;
    }

    @Override
    public void subscribe(Observer o) {
        subscribers.add(o);
    }

    @Override
    public void unsubscribe(Observer o) {
        subscribers.remove(o);
    }

    @Override
    public void notifyObservers(String videoTitle) {
        for (Observer subscriber : subscribers) {
            subscriber.update(videoTitle);
        }
    }

    // Simulate video upload
    public void uploadNewVideo(String videoTitle) {
        System.out.println(channelName + " uploaded a new video: " + videoTitle);
        notifyObservers(videoTitle);
    }
}
