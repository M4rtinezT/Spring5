package spring5.testdemo;

import org.junit.Test;

import java.util.*;

/**
 * @author TJ
 * @create 2021-0715 12:34
 */
public class Book {
    private List<String> list;

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "Book{" +
                "list=" + list +
                '}';
    }
    @Test
    public void testa(){
        System.out.println("s");

    }
}
