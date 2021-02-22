package deb.practice.reactive;

import java.util.List;
import java.util.concurrent.SubmissionPublisher;

public class Start {

    public static void main(String[] args) throws InterruptedException {
        SubmissionPublisher<String> publisher = new SubmissionPublisher<>();
        NumberSubscriber<String> subscriber = new NumberSubscriber<>();
        publisher.subscribe(subscriber);
        List<String> items = List.of("1", "x", "2", "x", "3", "x");

        items.forEach(publisher::submit);
        Thread.sleep(1000);
        publisher.close();


    }
}
