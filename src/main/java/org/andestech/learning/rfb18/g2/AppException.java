package org.andestech.learning.rfb18.g2;

import com.sun.istack.internal.NotNull;

import java.io.FileWriter;
import java.io.IOException;

class Data
{
    int d = 10;
}

public class AppException
{
    private static void testData(Data data)
    {
        System.out.println("d="+data.d);
    }

    private static Data d2;

    private static int div(int a, int b)
    {return a/b;}

    public static void main( String[] args )
    {
      Engine eng1 = new Engine();

     try {
         eng1.addFuel(12);

         eng1.addFuel(5);

         eng1.addFuel(20);
     }
    catch (FuelProcessingException ex)
    {
        System.out.println(ex);

    }

    Data dat = null;

  //  testData(dat);
     d2 = new Data();

     if(d2 != null) testData(d2);

     //-------------------------

     try(FileWriter fw =
             new FileWriter("E:\\datas\\file1.txt")){

         fw.write("Salute!!\r\n");
         fw.write("Привет!!\r\n");

       //  fw.close();
     }
     catch (IOException ex)
     {
         System.out.println(ex);
     }



    }
}
