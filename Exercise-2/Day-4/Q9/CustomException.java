package Q9;

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
    public static int processInput(int number) throws NumberExceptions{
        if(number<0){
            throw new NegativeNumberException("Input is not Integer");    
        }
        else if(number>100){
            throw new NotInRangeException("Number not in range of (0 - 100)");
        }else{
            return number;
        }
    }
}


public class CustomException {
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
                    currentMark = GetInput.processInput(scan.nextInt());
                }
                catch(NumberExceptions ne){
                    ne.handlerCall();
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