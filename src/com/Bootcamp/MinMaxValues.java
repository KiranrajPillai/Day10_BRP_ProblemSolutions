package com.Bootcamp;

import java.util.Scanner;

public class MinMaxValues {
    static int temp;
    public static int minArray(int [] arr,int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]>arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr[0];

    }
    public static int maxArray(int[] arr, int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(arr[0]<arr[i])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }


        }
        return temp;


    }
    public static void displayArray(int [] array,int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.println(array[i]);
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of an Array :");
        int size=sc.nextInt();
        int [] array=new int[size];
        int n=array.length;
        System.out.println("Enter the values of an Array :");
        for(int i=0;i<array.length;i++)
        {
            array[i]=sc.nextInt();
        }
        System.out.println("Minimum Value of the entered Array is "+ minArray(array,n));
        System.out.println("Maximum Value of the entered Array is "+ maxArray(array,n));
    }
}