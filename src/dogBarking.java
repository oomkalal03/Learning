import  java.util.Scanner;
public class dogBarking {
    public static void main(String[] args) {
        boolean response = shouldWkeUp(true, 4);
        System.out.println(response);
    }

    public static boolean shouldWkeUp(boolean bark, int time) {
        if (time>=1 && time<=23){
            if((bark==true)&&(time<8 || time>22))
            {
                return true;
            }
            else {
                return false;
            }

        }
        else {
            return false;
        }

    }

}
