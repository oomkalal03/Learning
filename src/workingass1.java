public class workingass1 {
    public static void main(String[] args) {
        String name = "Prem";
        int mark = 99;
        char gradeOfStudent = studentGrade(99);
        displayStudent(name, gradeOfStudent);

    }
    public static char studentGrade(int marks){
        char grade;
        if (marks>90 && marks<=100){
            grade = 'S';
        } else if (marks>80 && marks<=90) {
            grade = 'A';
        } else if (marks>70 && marks<=80) {
            grade = 'B';
        }else {
            grade = 'F';
        }
        return grade;
    }
    public static void displayStudent(String names, char grades){
        System.out.println("The name of the student is : " + names);
        System.out.println("The grade of the student is : " + grades);
    }
}
