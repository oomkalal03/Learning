import java.util.Scanner;

public class converKgintoGrmsandMgs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter weight in kgs ");
        double weightKgs = sc.nextDouble();
        convert(weightKgs);
    }
    public static void convert(double kgs){
        double intoGrams, intoMs;
        intoGrams = kgs * 1000;
        intoMs = intoGrams * 1000;
        System.out.println("the converted weight in grams " + intoGrams);
        System.out.println("The converted weight in miligrams" + intoMs);

    }
}
