public class prime {

    public static void main(String[] args) {
        int n=50;

        for (int i =1;i<=n;i++){
            primeNumber(i);
        }

    }

    public static void primeNumber(int n) {
        int count =0;
        for (int j =2;j<n;j++) {
            if (n % j == 0){
                count++;
            }

        }
        if (count == 0){
            System.out.println(n+" Is a prime number");
        }else{
            System.out.println(n+" is not a prime number");
        }
    }


}
