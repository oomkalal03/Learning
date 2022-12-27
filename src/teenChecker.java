import java.util.Scanner;

public class teenChecker {
    public static boolean hasNotTeen(int a, int b, int c) {
        if (a>=13 && a<20){
            return false;
        }else if (b>=13 && b<20){
            return false;
        }else if (c>=13 && c<20){
            return false;
        }else {
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values of a b c ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        boolean response = hasNotTeen(a,b,c);
        System.out.println(response);
    }
}
