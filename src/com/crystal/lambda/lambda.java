package com.crystal.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by hp on 2017-03-31.
 */
public class lambda {

    private static void sort(){
        List<String> names = new ArrayList<>();
        names.add("2222222");
        names.add("111111");
        names.add("666666666");
        names.add("333333");
        names.add("5555");

        Collections.sort(names,(o1,o2) -> o1.compareTo(o2));

        names.forEach(e->System.out.println(e));

    }

    public static void main(String[] arg){
        System.out.println("----Collections sort-------");
        sort();
    }
}
