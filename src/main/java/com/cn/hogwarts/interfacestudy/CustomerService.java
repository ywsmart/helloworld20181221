package com.cn.hogwarts.interfacestudy;

/**
 * Function：
 * 客户业务接口
 * 接口作用：
 * 1.可以使项目分隔，所有层都面向接口开发，开发效率提高了。
 * 2.接口使代码和代码之间耦合度低，可随意切换，像内存条和主板的关系可插拔
 * 接口和抽象类都能完成某个功能，优先选择接口
 * 因为接口可以多实现，多继承
 * 并且一个类除了接口之外，还可以去继承其他类（保留了类的继承）
 *
 * @author YangWang
 * @date 2018-12-21
 * Created by YangWang on 2018-12-21 3:37.
 */
public interface CustomerService {
    // 定义一个退出系统的方法
    void logout();

}
