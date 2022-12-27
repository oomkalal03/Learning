public class dimensions {
    public static void main(String[] args) {
        int length =10, breath = 5;
        double height = 5;
        area(length);
        area(length,breath);
        area(breath,height);

    }

    public static void area(int l) {
        double areaOfSquare = l*l;
        System.out.println("the are of the square is : "+areaOfSquare);
    }

    public static void area(int l, int b) {
        double areaOfRectangle = l*b;
        System.out.println("the are of the square is : "+areaOfRectangle);
    }

    public static void area(int b, double height) {
        double areaOfTriangle = 0.5*b*height;
        System.out.println("the are of the square is : "+areaOfTriangle);
    }
}
