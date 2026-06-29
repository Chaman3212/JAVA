package Arrays_2D;

public class spiralOfMatrix {
    public static void spiralPrint(int[][] matrix){
        for(int[] n:matrix){
            System.out.println(n);
        }
    }

    static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        spiralPrint(matrix);
    }
}
