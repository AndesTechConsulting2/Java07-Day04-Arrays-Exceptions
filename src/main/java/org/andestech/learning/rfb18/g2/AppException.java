package org.andestech.learning.rfb18.g2;


public class AppException
{

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


    }
}
