import java.util.Scanner;
public class pythogoreanTriplet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a b c ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        pointsStatisfy(a,b,c);
    }

    public static void pointsStatisfy(int a, int b, int c) {
        int p = a*a;
        int q = b*b;
        int r = c*c;
        if ((p+q)==r){
            System.out.println(a+" "+b+" "+c+" "+" are pythegorean triplets");
        }else {
            System.out.println(a+" "+b+" "+c+" "+" are not pythegorean triplets");
        }
    }
}
