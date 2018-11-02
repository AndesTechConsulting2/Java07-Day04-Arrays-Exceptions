package org.andestech.learning.rfb18.g2;


public class App 
{

    private static int div(int a, int b)
    {return a/b;}

    public static void main( String[] args )
    {

       int a =23-21-1, res;
       String statusText = "Ok";


       try {
          // Class.forName("org.aaa.ClassB");
           //if(a==1)
           //throw new ClassCastException("Мой мессидж....");
           res = div(123, (a - 1));
           System.out.println("res=" + res);
           //..
           //..
       }
       catch (ArrayIndexOutOfBoundsException ex){
           statusText="Arrays False";
           //...
       }
       catch (ArithmeticException ex)
       {

           for(StackTraceElement st : ex.getStackTrace())
           {
               System.out.println("file: " +st.getFileName() +
                               ", class: " +st.getClassName() +
                               ", method: " +st.getMethodName() +
                               ", line: " +st.getLineNumber() + "."

                       );
           }

           statusText="Div False";

           //.... write logs
           //....

          // throw ex;
           //...
       }
       catch (Exception ex)
       {
           for(StackTraceElement st : ex.getStackTrace())
           {
               System.out.println("file: " +st.getFileName() +
                       ", class: " +st.getClassName() +
                       ", method: " +st.getMethodName() +
                       ", line: " +st.getLineNumber() + "."

               );
           }



           //.... write logs
           //....

           throw ex;

       }
       finally {
           System.out.println("finally block");
       }


       try{}
       finally {

       }

       System.out.println("Status:" + statusText);
       int b = 11;
       System.out.println("b="+b);


    }
}
