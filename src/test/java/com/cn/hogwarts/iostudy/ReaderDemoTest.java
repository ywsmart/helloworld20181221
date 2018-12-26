package com.cn.hogwarts.iostudy;

import org.junit.Test;

import java.io.*;

/**
 * Function：
 *
 * @author YangWang
 * @date 2018-12-21
 * Created by YangWang on 2018-12-21 23:53.
 */
public class ReaderDemoTest {
    @Test
    public void fun() throws IOException {
        FileReader fr = new FileReader("C:\\Users\\YangWang\\IdeaProjects\\helloworld20181221\\src\\main\\resources\\a.txt");
        int num = 0;
        while ((num = fr.read()) != -1) {
            System.out.print((char) num);
        }
        fr.close();
    }

    @Test
    public void fun1() {
        FileWriter fw = null;
        try {
            fw = new FileWriter("C:\\Users\\YangWang\\IdeaProjects\\helloworld20181221\\src\\main\\resources\\b.txt", true);
//            fw.write("xyz");
//            fw.write("what F");
            fw.append("wllll");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void fun2() throws IOException {
        BufferedReader bfr = new BufferedReader(new FileReader("C:\\Users\\YangWang\\IdeaProjects\\helloworld20181221\\src\\main\\resources\\a.txt"));
        String data = null;
        while ((data = bfr.readLine()) != null) {
            System.out.println(data);
        }
    }

    @Test
    public void fun3() throws IOException {
        BufferedWriter bfw = new BufferedWriter(new FileWriter("C:\\Users\\YangWang\\IdeaProjects\\helloworld20181221\\src\\main\\resources\\b.txt", true));
        bfw.newLine();
        bfw.write("qwqdasdawd");
        bfw.flush();
    }

    @Test
    public void fun4() throws IOException {
        String data = null;
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\YangWang\\IdeaProjects\\helloworld20181221\\src\\main\\resources\\a1.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\YangWang\\IdeaProjects\\helloworld20181221\\src\\main\\resources\\b1.txt"));
        while ((data = br.readLine()) != null) {
            bw.write(data);
            bw.newLine();
            bw.flush();
        }
        br.close();
        bw.close();
    }
}
