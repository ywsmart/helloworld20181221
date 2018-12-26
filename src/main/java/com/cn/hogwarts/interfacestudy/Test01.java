package com.cn.hogwarts.interfacestudy;

/**
 * Function：
 * 测试类
 * @author YangWang
 * @date 2018-12-21
 * Created by YangWang on 2018-12-21 3:41.
 */
public class Test01 {
    public static void main(String[] args) {
        // 要执行CustomerServicesImp中的logout方法

        // 以下程序面向接口调用，多态
        CustomerService cs = new CustomerServicesImpl();

        //调用
        cs.logout();
    }
}
