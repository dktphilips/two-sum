package org.decathlon.philips;

import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        String fullPath = null;
        if(null == args || args.length==0)
        {
            fullPath = "/tmp/input.txt";
        }
        else
        {
            fullPath =  args[0];
        }
        DataReader dr = new DataReader(fullPath);
        long startTime = System.currentTimeMillis();
        List<Integer> result = TwoSumCal.calTwoSum(dr.getTarget(),dr.getDataList());
        long endTime = System.currentTimeMillis();
        System.out.println("程序运行时间：" + (endTime - startTime) + "ms");
        System.out.println(result);
    }

}
