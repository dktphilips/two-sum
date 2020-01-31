package org.decathlon.philips;

import java.util.*;

public class TwoSumCal {

    public static List<Integer> calTwoSum(Integer target, List<Integer> data)
    {
        List<Integer> resultArray = new ArrayList<Integer>();
        Integer resultLeftIndex;
        /**
         * 使用哈希表存储(数值,下标)
         */
        Map<Integer,Integer> twoSumMap= new HashMap<Integer, Integer>();
        for(int i = 0; i < data.size(); i++)
        {
            if((resultLeftIndex = twoSumMap.get(target - data.get(i))) != null)
            {
                resultArray.add(resultLeftIndex);
                resultArray.add(Integer.valueOf(i));
                return resultArray;
            }
            else
            {
                twoSumMap.put(data.get(i),i);
            }
        }
        return resultArray;
    }
}
