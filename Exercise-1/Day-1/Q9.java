import java.util.Arrays;

public class Q9 {
    static void reverse(int[] array){
        for(int i=0;i<array.length/2;i++){
            int temp=array[i];
            array[i]=array[array.length-i-1];
            array[array.length-i-1]=temp;
        }
    }
    public static void main(String[] args) {
        int[] array={1,3,5,7,6,4,2,9,8,0};
        reverse(array);
        System.out.println("Reverse Order: " +Arrays.toString(array));
    }
}
