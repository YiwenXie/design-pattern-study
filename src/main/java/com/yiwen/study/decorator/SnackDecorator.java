package com.yiwen.study.decorator;

/**
 * @author ywxie
 * @date 2022/4/25 22:58
 * @describe
 */
public abstract class SnackDecorator extends Beverage{

    @Override
    public abstract String getDesc();

    @Override
    public abstract int cost();
}
