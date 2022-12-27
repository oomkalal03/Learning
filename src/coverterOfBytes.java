import java.util.Scanner;
public class coverterOfBytes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input in kilo bytes");
        int kiloBytes = sc.nextInt();
        printMegaBytes(kiloBytes);
    }

    public static void printMegaBytes(int Kb) {

        int megaBytes = Kb/1024;
        int kiloReminder = Kb%1024;

        System.out.println("After converting we get " + megaBytes+ " mb "+ kiloReminder+ "  kbs");
    }
}
