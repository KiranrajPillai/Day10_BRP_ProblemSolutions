package com.Bootcamp;

public class CollinearSlope {
    public static void main (String[] args)
    {
        double x1 = 1, x2 = 1, x3 = 1,
                y1 = 1, y2 = 4, y3 = 5;
        checkColliner(x1, y1, x2, y2, x3, y3);
    }

    static void checkColliner(double x1, double y1, double x2, double y2, double x3, double y3)
    {
        if ((y3 - y2) * (x2 - x1) ==  (y2 - y1) * (x3 - x2))
            System.out.println("Slope are equal. So, 3 lines are collinear.");
        else
            System.out.println("Slope are not equal. So, 3 lines are not collinear.");
    }
}
