public class Main {
    public static void main(String[] args) {
    String studentName = "Om Kalal";
    int marksOfStudent = 86;
    char studentGrade = calGradeOfStudent(marksOfStudent);
    displayStudentNameAndGrade(studentName, studentGrade);


    }

    public static char calGradeOfStudent(int marks){
        char grade;
        if(marks>90 && marks<=100){
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
    public static void displayStudentNameAndGrade(String Name, char grades){
        System.out.println("The student name is : " + Name);
        System.out.println(" He scored a grade : " + grades);

    }



}