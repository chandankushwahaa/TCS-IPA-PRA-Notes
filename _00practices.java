import java.util.Scanner;

public class _00practices {
    public static void main(String args[]) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        int x1, y1, x2, y2;
        Scanner scn = new Scanner(System.in);
        x1 = scn.nextInt();
        y1 = scn.nextInt();
        x2 = scn.nextInt();
        y2 = scn.nextInt();
        Point p1 = new Point(x1, y1);
        Point p2 = new Point(x2, y2);
        double distance = findDistance(p1, p2);
        System.out.format("%.3f", distance);
    }

    public static double findDistance(Point p1, Point p2) {
        double distance = Math.sqrt((p2.x - p1.x) * (p2.x - p1.x) + (p2.y - p1.y) * (p2.y - p1.y));
        return distance;
    }
}


class Point
{
    int x,y;
    Point(int x,int y)
    {
        this.x=x;
        this.y=y;

    }

}

