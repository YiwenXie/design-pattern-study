package com.yiwen.study.observer;

/**
 * @author ywxie
 * @date 2022/4/18 23:03
 * @describe
 */
public class ObserverPatternApplication {

    public static void main(String[] args) {
        Observable observable = new Observable();
        new AObserver(observable);
        new BObserver(observable);

        observable.setState(1);

    }
}
