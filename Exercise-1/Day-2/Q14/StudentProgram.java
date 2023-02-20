package Q14;



/**
 * Student is a class that has a name and a rollNo.
 */
class Student{
    String name="Java";
    int rollNo=1995;
}

/**
 * Exam is a Student that has subject1Marks, subject2Marks and subject3Marks
 */
class Exam extends Student{
    int subject1Marks = 100;
    int subject2Marks = 200;
    int subject3Marks = 300;
}

/**
 * The Result class extends the Exam class and adds a method to calculate the total marks and a method
 * to get the total marks
 */
class Result extends Exam{
    int totalMarks;
    public void calculateMarks(){
        this.totalMarks+=super.subject1Marks+super.subject2Marks+super.subject3Marks;
    }
    public int getMarks(){
        return this.totalMarks;
    }
}

public class StudentProgram {
    /**
     * 
     * @param args
     */
    public static void main(String[] args) {
        Result res = new Result();
        res.calculateMarks();
        System.out.println(res.getMarks());
    }
}
