package org.decathlon.philips;

import lombok.Data;
import java.io.*;
import java.util.*;

@Data
public class DataReader {

    private List<Integer> dataList;
    private Integer target;
    private String method;

    /**
     * 默认构造函数
     */
    public DataReader()
    {
        this.dataList=new ArrayList<Integer>();
        this.target = 0;
        this.method = "Reader/InputStream";
    }

    public DataReader(String fileName)
    {
        this();
        readFileWithInputStream(fileName);
    }

    /**
     * 通过InputStream读取文件
     * @param fileName
     */
    private void readFileWithInputStream(String fileName)
    {

        File file = new File(fileName);
        BufferedReader br = null;
        try{
            br = new BufferedReader(new FileReader(file));
            String lineText = null;
            /**
             * 读取target
             */
            if((lineText = br.readLine()) != null)
            {
                this.target = Integer.parseInt(lineText);
            }

            /**
             * 读取整数数组
             */
            while((lineText = br.readLine()) != null)
            {
                this.dataList.add(Integer.parseInt(lineText));
            }
        }
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally
        {
            if(br != null)
            {
                try{
                    br.close();
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }

            }
        }
    }

    private void readFileWithFileChannel()
    {

    }
}
