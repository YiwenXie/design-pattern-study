package com.yiwen.study.strategy;

/**
 * @author ywxie
 * @date 2022/4/18 23:04
 * @describe
 */
public class StrategyPatternApplication {

    public static void main(String[] args) {
        Context context = new Context(new AddOperation());
        System.out.print(context.executeStrategy(10, 5));

        context = new Context(new SubtractionOperation());
        System.out.print(context.executeStrategy(10, 5));

        context = new Context(new MultiplicationOperation());
        System.out.print(context.executeStrategy(10, 5));
    }
}
