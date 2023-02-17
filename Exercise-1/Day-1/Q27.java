
public class Q27 {
    static void calculateAmount(int investment){
        investment*=1.40;
        System.out.println("During First year = "+investment);
        investment-=1500;
        System.out.println("During Second year = "+investment);
        investment*=1.12;
        System.out.println("During Third year = "+investment);
    }
    public static void main(String[] args) {
        int investment = 14000;
        calculateAmount(investment);
    }
}
