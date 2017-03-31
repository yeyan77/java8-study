package com.crystal.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by crystal on 2017-03-31.
 */
public class lambda {

    public static void main(String[] arg){
        System.out.println("----Collections sort-------");
        sort();
        System.out.println("------------map-------");
        mapLambda();
    }

    /**
     * 用于统计、统一处理集合数据
     */
    private static void mapLambda(){
        List<String> names = new ArrayList<>();
        names.add("WWeewww");
        names.add("w423GG");
        List<String> lowercaseNames = names.stream().map((String name) -> {
            return name.toLowerCase();
        }).collect(Collectors.toList());

        lowercaseNames.forEach(System.out::println);
    }


    /**
     * 用于排序
     */
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




}
