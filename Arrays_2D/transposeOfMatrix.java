package Arrays_2D;

import java.lang.reflect.Array;
import java.util.Arrays;

public class transposeOfMatrix {
    public static int[][] transpose(int[][] matrix){
        int[][] newMatrix = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length ; j++) {
                int val =  matrix[i][j];
                newMatrix[j][i]=val;
            }
        }
        return newMatrix;
    }

    static void main(String[] args) {
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.print(Arrays.deepToString(transpose(matrix)));;
    }
}
