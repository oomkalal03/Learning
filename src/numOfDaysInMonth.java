import java.util.Scanner;

public class numOfDaysInMonth {
    public static boolean ifItIsALeapYear(int year){
        if ((year%4 == 0 && year%100!= 0) || (year %400 != 0))
            return true;
        else
            return false;
    }

    public static void getDayOfMonth(int month, int year) {
        if (month<1 || month>12){
            System.out.println("-1");
            return;
        }
        if (year<1 || year>9999){
            System.out.println("-1");
            return;
        }

        switch (month){
            case 1:
                System.out.println("january "+ year + " has 31 days");
                break;
            case 2:
                System.out.println("Feb "+ year + " has"+(ifItIsALeapYear(year)?" 29 days": " 28 days"));
                break;
            case 3:
                System.out.println("march "+ year + " has 31 days");
                break;
            case 4:
                System.out.println("April "+ year + " has 30 days");
                break;
            case 5:
                System.out.println("May "+ year + " has 31 days");
                break;
            case 6:
                System.out.println("Jun "+ year + " has 30 days");
                break;
            case 7:
                System.out.println("Jul "+ year + " has 31 days");
                break;
            case 8:
                System.out.println("Aug "+ year + " has 31 days");
                break;
            case 9:
                System.out.println("Sept "+ year + " has 30 days");
                break;
            case 10:
                System.out.println("Oct "+ year + " has 31 days");
                break;
            case 11:
                System.out.println("Nov "+ year + " has 30 days");
                break;
            case 12:
                System.out.println("Dec "+ year + " has 31 days");
                break;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month : ");
        int month = sc.nextInt();
        System.out.println("Enter the year : ");
        int year = sc.nextInt();
        getDayOfMonth(month,year);

    }
}
