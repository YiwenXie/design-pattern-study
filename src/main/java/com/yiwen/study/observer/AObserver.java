package com.yiwen.study.observer;

/**
 * @author ywxie
 * @date 2022/4/18 23:14
 * @describe
 */
public class AObserver extends Observer {

    private Observable observable;

    public AObserver(Observable observable) {
        this.observable = observable;
        this.observable.add(this);
    }

    @Override
    void update() {
        System.out.print("AObserver");
    }
}
