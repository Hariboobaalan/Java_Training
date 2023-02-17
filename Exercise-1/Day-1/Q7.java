import java.util.Arrays;

public class Q7 {
    static void sortAscending(int[] array){
        for(int i=0;i<array.length;i++){
            int current = i;
            for(int j=i+1;j<array.length;j++){
                if(array[j]<array[current]){
                    current=j;
                }
            }
            int temp = array[current];
            array[current]=array[i];
            array[i]=temp;
        }
    }
    static void sortDescending(int[] array){
        for(int i=0;i<array.length;i++){
            int current = i;
            for(int j=i+1;j<array.length;j++){
                if(array[j]>array[current]){
                    current=j;
                }
            }
            int temp = array[current];
            array[current]=array[i];
            array[i]=temp;
        }
    }

    public static void main(String[] args) {
        int[] array = {10,9,5,2,6,1,4,3};
        sortAscending(array);
        System.out.println("Ascending Order: " +Arrays.toString(array));
        sortDescending(array);
        System.out.println("Descending Order: " +Arrays.toString(array));
    }
    
}
