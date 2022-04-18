package com.yiwen.study.observer;

/**
 * @author ywxie
 * @date 2022/4/18 23:05
 * @describe
 */
public abstract class Observer {

    protected Observable observable;

    abstract void update();
}
