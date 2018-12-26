package com.cn.hogwarts.interfacestudy;

/**
 * Function：
 * 1. 定义接口，语法：{修饰符} interface 接口名{}
 * 2. 接口中只能出现常量和抽象方法
 * 3. 借口其实是一个特殊的抽象类，特殊在接口完全抽象
 * 4. 接口中没有构造方法，无法被实例化
 * 5. 借口和接口之间可以多继承
 * 6. 一个类可以实现多个接口（此实现可以看做“继承”）
 * 7. 一个非抽象的实现接口，需要将接口中所有的方法“实现/覆写/覆盖”
 *
 * @author YangWang
 * @date 2018-12-21
 * Created by YangWang on 2018-12-21 3:20.
 */
public interface A {
    // 常量
    public static final String SUCCES = "succes";
    public static final double PI = 3.14;
    byte MAX_VALUE = 127;

    // 抽象方法(接口中所有的抽象方法都是public abstract）
    public abstract void m1();

    void m2();

    interface B {
        void m1();
    }

    interface C {
        void m2();
    }

    interface D {
        void m3();
    }

    interface E extends B, C, D {
        void m4();
    }

    // implements 是实现的意思，是一个关键字
    // implement和extends意义相同，但是extends已经写死，只能单纯继承，所有引入implement
    class MyClass implements B, C {

        @Override
        public void m1() {
        }

        @Override
        public void m2() {
        }
    }

    class F implements E {

        @Override
        public void m1() {
        }

        @Override
        public void m2() {
        }

        @Override
        public void m3() {
        }

        @Override
        public void m4() {
        }
    }
}