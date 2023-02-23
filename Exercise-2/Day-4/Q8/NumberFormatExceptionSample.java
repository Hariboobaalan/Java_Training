package Q8;

import java.util.Scanner;

class MyClass{
    public static boolean isInteger(String numberString){
        try{
            Integer.parseInt(numberString);
            return true;
        }
        catch(Exception e){
            return false;
        }
    }
}

class GetInput{
    public static int processInput(String numberString) throws NumberExceptions{
        if(!MyClass.isInteger(numberString)){
            throw new NonIntegerException("Input is not Integer");
            
        }
        else{
            return Integer.parseInt(numberString);
        }
    }
}


public class NumberFormatExceptionSample {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Number of Students:");
        int noOfStudents = Integer.parseInt(scan.nextLine());
        
        System.out.println("Enter Number of Subjects:");
        int noOfSubjects = Integer.parseInt(scan.nextLine());
        
        int totalMarks,currentMark,temp=1;
        
        while(temp<=noOfStudents){
            
            totalMarks=0;
            currentMark=0;
            
            for(int indexI=1;indexI<=noOfSubjects;indexI++){
                
                System.out.println("Enter Student"+temp+" Mark"+indexI+" :");
                
                try{
                    currentMark = GetInput.processInput(scan.nextLine());
                }
                catch(NumberExceptions nfe){
                    nfe.handlerCall();
                    indexI--;
                }
                finally{
                    totalMarks+=currentMark;
                }
            }

            System.out.println("Average Marks = "+totalMarks / noOfSubjects);
            
            temp++;
        }
        
        scan.close();
    }
}