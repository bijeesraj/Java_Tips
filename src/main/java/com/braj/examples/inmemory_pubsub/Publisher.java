package com.braj.examples.inmemory_pubsub;

public interface Publisher {
    //Publishes new message to PubSubService
    void publish(Message message, PubSubService pubSubService);
}
