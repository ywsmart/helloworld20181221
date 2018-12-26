package com.cn.hogwarts.interfacestudy.car;

/**
 * Function：
 *
 * @author YangWang
 * @date 2018-12-21
 * Created by YangWang on 2018-12-21 23:22.
 */
public class HONDA implements Engine {
    @Override
    public void start() {
        System.out.println("HONDA启动");
    }
}
