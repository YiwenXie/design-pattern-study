package com.yiwen.study.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ywxie
 * @date 2022/4/18 23:04
 * @describe
 */
public class Observable {
    private int state;
    private List<Observer> observers = new ArrayList<Observer>();

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public List<Observer> getObservers() {
        return observers;
    }

    public void setObservers(List<Observer> observers) {
        this.observers = observers;
    }

    public void update(Observer observer){
        observer.update();
    }

    public void remove(){

    }

    public void add(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        for (Observer observer: observers) {
            update(observer);
        }
    }
}
