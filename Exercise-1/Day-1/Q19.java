public class Q19 {
    static void reverseElements(int[][] matrix){
        for(int j=0;j<matrix.length;j++){
        for(int i=0;i<matrix[j].length/2;i++){
            int temp=matrix[j][i];
            matrix[j][i]=matrix[j][matrix[j].length-i-1];
            matrix[j][matrix.length-i-1]=temp;
        }
    }
    }
    static void displayMatrix(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println("Original Matrix");
        displayMatrix(matrix);
        reverseElements(matrix);
        System.out.println("Reversed Matrix");
        displayMatrix(matrix); 
    }
}