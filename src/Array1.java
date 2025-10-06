class Student{
    private final int[] marks;
    private final char[] Grade;

    public Student(int[] marks) {
    this.marks=marks;
        this.Grade = new char[marks.length];
    }

    public char[] getGrade() {
        return Grade;
    }

    public void findGrade() {
        for (int i =0; i< marks.length ; i++){
            if (marks[i]>=90&& marks[i]<100){
                //setGrade(new char[]{'A'});
                Grade[i]='A';
            } else if (marks[i] >= 80) {
                Grade[i]='B';
            } else if (marks[i] >= 70) {
                Grade[i]='C';
            } else if (marks[i] >= 60) {
                Grade[i]='D';
            } else {
                Grade[i]='F';
            }
        }
    }
}

public class Array1 {
    public static void main(String[] args) {
        int[] marks = { 79, 87, 97, 65, 78, 99, 66 };
        Student student = new Student(marks);
        student.findGrade();
        System.out.println("Grades corresponding to the marks are : ");
        char[] grades = student.getGrade();
        for (char grade : grades) {
            System.out.print(grade + " ");
        }
    }
}
