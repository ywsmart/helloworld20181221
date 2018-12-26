package com.cn.hogwarts.interfacestudy.car;

/**
 * Function：
 * 汽车和发动机的接口
 * 生产汽车的厂家面向接口生产
 * 生产发动机的厂家面向接口生产
 *
 * @author YangWang
 * @date 2018-12-21
 * Created by YangWang on 2018-12-21 23:18.
 */
public interface Engine {
    // 所有发动机都可以启动
    void start();
}
