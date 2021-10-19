package com.Bootcamp;

public class Collinear {
    public static void main(String args[])
    {
        double x1 = 1, x2 = 1, x3 = 1,
                y1 = 1, y2 = 4, y3 = 5;
        checkCollinear(x1, y1, x2, y2, x3, y3);

    }
    static void checkCollinear(double x1, double y1, double x2,
                               double y2, double x3, double y3)
    {
        double area = 0.5*(x1 * (y2 - y3) +  x2 * (y3 - y1) +  x3 * (y1 - y2));
        System.out.println("Area formed by triangle:"+area);

        if (area == 0)
            System.out.println("Area is equal to zero. So, 3 lines are collinear.");
        else
            System.out.println("Area is not equal to zero. So, 3 lines are not collinear.");
    }
}
