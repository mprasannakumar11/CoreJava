package com.corejava.designpattrens;

import java.util.ArrayList;
import java.util.List;

interface Observer {
    void update(String message);
}

class User implements Observer {
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " received notification: " + message);
    }
}

interface Subject {
    void attach(Observer observer);

    void detach(Observer observer);

    void notifyObservers();
}

class NotificationService implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String message;

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    public void addMessage(String message) {
        this.message = message;
        notifyObservers();
    }
}

public class ObserverPatternExample {
    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService();

        Observer user1 = new User("User1");
        Observer user2 = new User("User2");
        Observer user3 = new User("User3");

        notificationService.attach(user1);
        notificationService.attach(user2);
        notificationService.attach(user3);

        notificationService.addMessage("New message received!");

        notificationService.detach(user2);

        notificationService.addMessage("Another message received!");
    }
}

