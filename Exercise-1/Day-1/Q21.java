import java.util.Scanner;

public class Q21 {
    static int getNumberOfDays(int month, int year){
        int days=-1;
        switch(month){
            case 1:days=31;break;
            case 2:days=28;break;
            case 3:days=31;break;
            case 4:days=30;break;
            case 5:days=31;break;
            case 6:days=30;break;
            case 7:days=31;break;
            case 8:days=31;break;
            case 9:days=30;break;
            case 10:days=31;break;
            case 11:days=30;break;
            case 12:days=31;break;
            default:;
        }
        if(month == 2 && ((year%4==0 && year%100!=0) || year%400==0)){
            days=29;
        }

        return days;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter month");
        int month = sc.nextInt();
        System.out.println("Enter year");
        int year = sc.nextInt();
        System.out.println("No. Of Days = "+getNumberOfDays(month, year));
        sc.close();
    }
}
