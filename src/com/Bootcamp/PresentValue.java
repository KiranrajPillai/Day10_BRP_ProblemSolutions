package com.Bootcamp;

import java.util.Scanner;

public class PresentValue {
    private static double compoundInterest(double capital,double rateofinterst,double time) {
        double comp_int = capital /(Math.pow((1 + rateofinterst/100), time));
        return comp_int;
    }
    public static void main(String[] args) {
        PresentValue fv=new PresentValue();
        Scanner sc=new Scanner(System.in);
        System.out.println("capital Amount: ");
        double capital=sc.nextDouble();
        System.out.println("enter rate of interest ");
        double rate=sc.nextDouble();
        System.out.println("enter time period ");
        double time=sc.nextDouble();
        double presentvalue=compoundInterest(capital,rate,time);
        System.out.println("the compound interest is : "+presentvalue);
    }
}
