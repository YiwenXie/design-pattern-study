package com.yiwen.study.strategy;

/**
 * @author ywxie
 * @date 2022/4/19 22:55
 * @describe
 */
public class MultiplicationOperation implements  Strategy{
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
