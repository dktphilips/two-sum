package org.decathlon.philips;

import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        String fullPath = new String("/tmp/input.txt");
        DataReader dr = new DataReader(fullPath);
        long startTime = System.currentTimeMillis();
        List<Integer> result = TwoSumCal.calTwoSum(dr.getTarget(),dr.getDataList());
        long endTime = System.currentTimeMillis();
        System.out.println("程序运行时间：" + (endTime - startTime) + "ms");
        System.out.println(result);
    }

}
