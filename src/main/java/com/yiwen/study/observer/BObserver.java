package com.yiwen.study.observer;

/**
 * @author ywxie
 * @date 2022/4/18 23:15
 * @describe
 */
public class BObserver extends Observer {

    private Observable observable;

    public BObserver(Observable observable) {
        this.observable = observable;
        this.observable.add(this);
    }

    @Override
    void update() {
        System.out.print("BObserver");
    }
}
