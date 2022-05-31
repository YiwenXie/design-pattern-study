package com.yiwen.study.decorator;

/**
 * @author ywxie
 * @date 2022/4/18 23:04
 * @describe
 */
public class DecoratorPatternApplication {


    public static void main(String[] args) {
        Beverage coffee = new MilkDecorator(new Coffee());
        System.out.print(coffee.getDesc() + "Price:" + coffee.cost());

        Beverage coke = new CakeDecorator(new Coke());
        System.out.print(coke.getDesc() + "Price:" + coke.cost());
    }
}
