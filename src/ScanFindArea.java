import java.util.Scanner;

public class ScanFindArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the width of the Triangle");
        double base = scan.nextDouble();
        System.out.println("Enter the length of the Triangle");
        double length = scan.nextDouble();
        double area =(base*length)/2;
        System.out.println("Area of Triangle is: " + area);
    }
}
