public class Even {
    public static boolean isEven(int number){
        if(number<0){
            return false;
        } else if (number%2==0) {
            return true;
        }else {
            return false;
        }
    }
    public static int sumEven(int start, int end){
        if (end<start)
            return -1;
        if (end<=0||start<=0)
            return -1;
        int sum =0;
        for (int i =start;i<=end;i++){
            if(isEven(i))
                sum+=i;
        }
        return sum;
    }
    public static void forLoop(){
        int count =1;
        for (int i = count;i<10;i++){
            System.out.println("The count is : "+i);
        }
    }

    public static void whileLoop(){
        int count = 1;
        while (true){
            if (count==6){
                break;
            }
            System.out.println("The count is : "+ count);
            count++;
        }
    }
    public static void doWhile(){
        int count =1;
        do {
            System.out.println("The count is : "+ count);
            count++;
        }while (count!=6);
    }

    public static boolean predictOddNumber(int n){
        if (n%2==1)
            return true;
        else return false;
    }

    public static void main(String[] args) {
//        System.out.println(sumEven(1,10));
//        forLoop();
//        whileLoop();
//        doWhile();
//        int number =4;
//        int mavVal =30;
//          while (number<=mavVal){
//              number++;
//              if (!predictOddNumber(number)){
//                  continue;
//              }
//              System.out.println("the odd number is : " + number);
//          }
//    }
        int n = 9, i = 1, table;
        while (i <= 15) {
            table = n * i;
            System.out.println(n + " * " + i + " = "+table);
            i++;
        }
    }

}
