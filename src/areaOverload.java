public class areaOverload {
    public static double area(double radius){
        if (radius<0){
            return (-1.0);
        }

        double areaTri = radius * radius* Math.PI;
        return areaTri;
    }
    public static double area(double x, double y){
        if ((x<0)||(y<0)){
            return (-1.0);
        }
        double areaRect = x * y;
        return areaRect;
    }

    public static void main(String[] args) {
        double areaOfCircle = area (5.0);
        double areaOfRectangle = area (5.0, 4.0);
        System.out.println ("Area of Circle is " + areaOfCircle);
        System.out.println ("Area of Rectangle is " + areaOfRectangle);
    }
}
