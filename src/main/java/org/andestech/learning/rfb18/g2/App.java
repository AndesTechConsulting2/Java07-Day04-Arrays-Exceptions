package org.andestech.learning.rfb18.g2;


public class App 
{


    public static void main( String[] args )
    {

       int a =23-21-1, res;
       String statusText = "Ok";


       try {
           res = 123 / (a - 1);
           System.out.println("res=" + res);
           //..
           //..
       }
       catch (ArithmeticException ex){
           statusText="False";
           //...
       }


       System.out.println("Status:" + statusText);
       int b = 11;
       System.out.println("b="+b);


    }
}
