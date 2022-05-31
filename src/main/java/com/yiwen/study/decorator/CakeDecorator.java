package com.yiwen.study.decorator;

/**
 * @author ywxie
 * @date 2022/4/25 23:00
 * @describe
 */
public class CakeDecorator extends SnackDecorator {

    private Beverage beverage;

    public CakeDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDesc() {
        return this.beverage.getDesc() + "加蛋糕";
    }

    @Override
    public int cost() {
        return this.beverage.cost() + 5;
    }
}
