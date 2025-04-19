package observer;

import observer.impl.Subscriber;
import observer.impl.YouTubeChannel;

public class Main {
    public static void main(String[] args) {

        // Create a YouTube channel (Subject)
        YouTubeChannel channel = new YouTubeChannel("CodeWithRitesh");

        // Create some subscribers (Observers)
        Subscriber s1 = new Subscriber("Alice");
        Subscriber s2 = new Subscriber("Bob");
        Subscriber s3 = new Subscriber("Charlie");

        // Subscribers subscribe to the channel
        channel.subscribe(s1);
        channel.subscribe(s2);
        channel.subscribe(s3);

        // Upload a new video
        channel.uploadNewVideo("Observer Pattern Explained in Java");

        // One subscriber unsubscribes
        channel.unsubscribe(s2);

        // Upload another video
        channel.uploadNewVideo("Strategy Pattern Deep Dive");
    }
}
