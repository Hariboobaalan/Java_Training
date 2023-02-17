import java.util.Scanner;

public class Q13 {

    static void calculateResult(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of students");
        int noOfStudents = sc.nextInt();
        System.out.println("Enter number of subjects: ");
        int noOfSubjects = sc.nextInt();
        int[][] marksDB = new int[noOfStudents][noOfSubjects];
        for(int i=0;i<noOfStudents;i++){
            System.out.println("Enter Student"+(i+1)+" marks ");
            for(int j=0;j<noOfSubjects;j++){
                System.out.println("Enter mark"+(j+1));
                marksDB[i][j] = sc.nextInt();
            }
        }
        calculateMark(marksDB);
        sc.close();

    }

    static void calculateMark(int[][] marksDB){
        for(int i=0;i<marksDB.length;i++){
            int marks=0;
            for(int j=0;j<marksDB[0].length;j++){
                marks+=marksDB[i][j];
            }
            System.out.println("Marks of Student"+(i+1)+" = "+marks);
        }
    }

    public static void main(String[] args) {
        calculateResult();
    }
}
