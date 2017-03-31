package com.crystal;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hp on 2017-03-31.
 */
public class Lists {
    public static List<Integer> newArrayList(Integer ... is){
        List<Integer> nums = new ArrayList<>();
        for(Integer i : is){
            nums.add(i);
        }
        return nums;
    }
}
