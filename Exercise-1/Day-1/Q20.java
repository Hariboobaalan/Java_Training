public class Q20 {
    
    static void findLargestElements(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            int max=0; // matrix[0][0]
            for(int j=0;j<matrix[0].length;j++){
                max=max>matrix[i][j]?max:matrix[i][j];
            }
            System.out.println("row "+i+" max = "+max);
        }
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        findLargestElements(matrix);
    }
}
