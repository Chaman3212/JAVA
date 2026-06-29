package Arrays;

public class wavePrintOfAMatrix {
    static void wavePrint1(int[][] matrix){
        int idx =0;
        for (int k =0; k<matrix.length;k++){
            if(idx%2==0){
                for (int i = idx; i < matrix[0].length; i++) {
                    for (int j = 0; j < matrix.length; j++) {
                        System.out.print(matrix[j][i]+" ");

                    }
                    System.out.println();
                    idx+=1;
                    break;
                }
            }else {
                for (int i = idx; i < matrix[0].length; i++) {
                    for (int j = matrix.length-1; j >=0; j--) {
                        System.out.print(matrix[j][i]+" ");
                    }
                    System.out.println();
                    idx+=1;
                    break;
                }
            }
        }
    }
    public static void wavePrint(int[][] matrix){
        for (int i = 0; i < matrix[0].length; i++) {
            if(i%2==0){
                for (int j = 0; j < matrix.length; j++) {
                    System.out.print(matrix[j][i]+" ");
                }
                System.out.println();
            }else {
                for (int j = matrix.length-1; j >=0 ; j--) {
                    System.out.print(matrix[j][i]+" ");
                }
                System.out.println();
            }
        }
    }
    static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        wavePrint(matrix);
    }
}
