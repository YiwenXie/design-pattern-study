package com.yiwen.study.decorator;

/**
 * @author ywxie
 * @date 2022/4/25 22:57
 * @describe
 */
public class Coke extends Beverage {

    @Override
    public String getDesc() {
        return "我是可乐";
    }

    @Override
    public int cost() {
        return 3;
    }
}
