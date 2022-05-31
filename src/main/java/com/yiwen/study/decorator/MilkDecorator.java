package com.yiwen.study.decorator;

/**
 * @author ywxie
 * @date 2022/4/25 23:04
 * @describe
 */
public class MilkDecorator extends SnackDecorator {

    private Beverage beverage;

    public MilkDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDesc() {
        return this.beverage.getDesc() + "加牛奶";
    }

    @Override
    public int cost() {
        return this.beverage.cost() + 4;
    }
}
