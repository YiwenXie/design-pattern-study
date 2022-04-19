package com.yiwen.study.strategy;

/**
 * @author ywxie
 * @date 2022/4/19 22:56
 * @describe
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2){
        return strategy.doOperation(num1, num2);
    }
}
