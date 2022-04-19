package com.yiwen.study.strategy;

/**
 * @author ywxie
 * @date 2022/4/19 22:53
 * @describe
 */
public class AddOperation implements Strategy {

    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}
