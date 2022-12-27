public class studentDivision {
    public static void main(String[] args) {
        String student_name = "Om";
        int student_score = 90;
        char studentDiv = calDivision(student_score);
        display(student_score,studentDiv,student_name);
        
    }
    public static char calDivision(int marks){
        char grade;
        if (marks>=80){
            grade = 'A';
        } else if (marks>=60 && marks<80) {
            grade = 'B';
        } else if (marks>=40 && marks<60) {
            grade = 'C';
        }else {
            grade = 'F';
        }
        return grade;
    }

    public static void display(int marks, char div, String name){
        System.out.println("Student score " + marks);
        System.out.println("Student division " + div);
        System.out.println("Student name " + name);
    }
}
