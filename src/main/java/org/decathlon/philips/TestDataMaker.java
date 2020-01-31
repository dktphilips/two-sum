package org.decathlon.philips;

import java.io.*;

public class TestDataMaker {
    public static void main(String[] args)
    {
        String fullPath = new String("/tmp/input.txt");
        File file = new File(fullPath);
        BufferedWriter bw = null;
        try{
            bw = new BufferedWriter(new FileWriter(file));
            /**
             * 写入target
             */
            bw.write("9");
            bw.newLine();

            for (int i = 0; i < 10000; i++) {
                bw.write(Integer.valueOf(i+10000).toString());
                bw.newLine();
            }
            bw.write("7");
            bw.newLine();
            bw.write("2");
            bw.newLine();
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
            if(bw != null)
            {
                try{
                    bw.close();
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }

            }
        }
    }
}
