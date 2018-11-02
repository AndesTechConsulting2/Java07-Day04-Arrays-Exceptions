package org.andestech.learning.rfb18.g2;


import java.util.Arrays;
import java.util.Random;

public class AppArray
{
    private static void arrAdd(int[] arr, int a)
    {
        for(int j=0; j< arr.length; j++) arr[j] += a;

    }


    private static int sum(int[] arr)
    {
       int s = 0;
       for(int d: arr) s+=d;
       return s;
    }

    private static int sum2(int[] arr)
    {
        int s = 0;
        for(int j=0; j< arr.length; j++) s += arr[j];//+arr[j+1];
        return s;
    }


    private static int[] generateArr(int N, int bound)
    {
    int[] arr = new int[N];
    Random r = new Random(System.currentTimeMillis());
    for(int j=0; j<N; j++) arr[j] = r.nextInt(bound);

    return arr;
    }

    private static int[] generateArr(int N) {
    return generateArr(N, 10000);
    }

    public static void main( String[] args ) throws InterruptedException {
       int[] arr1 = {1,23,45,6,2,344,-2};
       int arr2[] = {10,23,45,6,2,344,-2};

       arr1[3]=-77777;
       System.out.println(arr1[3]);
       System.out.println("L_arr1=" + arr1.length);

       for(int k =0; k< arr1.length; k++)
       {
           System.out.println("arr1[" + k + "]="+arr1[k]);
       }
        System.out.println("------------------------------");
       for(int data: arr1)
       {
           System.out.println(data);
       }

        int arr3[] = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("sum of ten: " + sum2(arr3));
        System.out.println(Arrays.toString(arr3));
        arrAdd(arr3,10);
        System.out.println(Arrays.toString(arr3));

        int N = 10;
        int arr4[] = new int[20];
        int arr5[] = new int[N];

        System.out.println(
        Arrays.toString(generateArr(10)));
        Thread.sleep(3);
        System.out.println(
        Arrays.toString(generateArr(10)));


    }
}
