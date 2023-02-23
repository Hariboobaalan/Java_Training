
public class Q11 {
    static void displayNumberMatrix(int[][] matrix){
        for(int indexI=0;indexI<matrix.length;indexI++){
            for(int indexJ=0;indexJ<matrix[indexI].length;indexJ++){
                System.out.print(matrix[indexI][indexJ]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] matrix  = {{1},{2,3},{4,5,6},{7,8,9,10}};
        System.out.println("Matrix is: ");
        displayNumberMatrix(matrix); 
    }
}