package com.yiwen.study.decorator;

/**
 * @author ywxie
 * @date 2022/4/25 22:55
 * @describe
 */
public class Coffee extends Beverage{

    @Override
    public String getDesc() {
        return "我是咖啡";
    }

    @Override
    public int cost() {
        return 2;
    }
}
