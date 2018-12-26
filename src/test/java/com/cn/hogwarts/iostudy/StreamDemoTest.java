package com.cn.hogwarts.iostudy;

import org.junit.Test;

import java.io.*;

/**
 * Function：
 *
 * @author YangWang
 * @date 2018-12-22
 * Created by YangWang on 2018-12-22 15:51.
 */
public class StreamDemoTest {

    @Test
    public void fun() throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\YangWang\\IdeaProjects\\helloworld20181221\\src\\main\\resources\\a.txt");
        int num = 0;
        while ((num = fis.read()) != -1) {
            System.out.print((char) num);
        }
    }

    @Test
    public void fun1() throws IOException {
        FileOutputStream fis = new FileOutputStream("C:\\Users\\YangWang\\IdeaProjects\\helloworld20181221\\src\\main\\resources\\b2.txt");
        fis.write("我亲爱的你".getBytes());
        fis.close();
    }

    @Test
    public void fun2() throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:\\Users\\YangWang\\IdeaProjects\\helloworld20181221\\src\\main\\resources\\a.txt"));
        byte[] bt = new byte[102*10];
        int num=0;

        while ((num=bis.read())!=-1){
            System.out.println(num);
        }
    }
}
