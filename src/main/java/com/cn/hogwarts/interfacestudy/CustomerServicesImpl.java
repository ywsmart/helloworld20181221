package com.cn.hogwarts.interfacestudy;

/**
 * Function：
 * 编写接口实现类
 *
 * @author YangWang
 * @date 2018-12-21
 * Created by YangWang on 2018-12-21 3:39.
 */
public class CustomerServicesImpl implements CustomerService {

    @Override
    public void logout() {
        System.out.println("成功退出系统");
    }
}
