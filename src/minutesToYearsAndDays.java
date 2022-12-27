public class minutesToYearsAndDays {
    public static void printYearsAndDays(long minutes) {
        if (minutes<0){
            System.out.println("Invalid value");
        }
        else {
            long years = minutes/(60*24*365);
            long remaMinutes = minutes-(years*(60*24*365));
            long daysRemaining = remaMinutes/(60*24);
            System.out.println(minutes+" min= "+years+"y and"+daysRemaining+" d");
        }
    }

    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }
}
