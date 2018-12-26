package com.cn.hogwarts.interfacestudy.car;

/**
 * Function：
 *
 * @author YangWang
 * @date 2018-12-21
 * Created by YangWang on 2018-12-21 23:29.
 */
public class Test {
    public static void main(String[] args) {
        // 1.生产引擎
        Engine e = new YAMAHA();
        // 2.生产汽车
        Car c = new Car(e);// Engine e=e1
        // 3.测试引擎
        c.testEngine();
        // 换HONDA
        c.e = new HONDA();
        c.testEngine();
    }
}
