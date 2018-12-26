package com.cn.hogwarts.interfacestudy.car;

/**
 * Function：
 * 生产汽车
 *
 * @author YangWang
 * @date 2018-12-21
 * Created by YangWang on 2018-12-21 23:24.
 */
public class Car {
    // FieId
    // 引擎
    // 面向接口编程
    Engine e;

    // costruct
    Car(Engine e) {
        this.e = e;
    }

    // 汽车应该能够测试引擎
    public void testEngine() {
        e.start();// 面向接口调用
    }
}
