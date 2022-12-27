import java.util.Scanner;
public class productChecker {
    public static boolean hasEqualProduct(int a, int b, int c) {
        if ((a*b)==c){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values of a b c");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        boolean response=hasEqualProduct(a,b,c);
        System.out.println(response);

    }
}
