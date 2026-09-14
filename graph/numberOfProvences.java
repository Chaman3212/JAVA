package graph;

import java.util.ArrayDeque;
import java.util.Queue;

public class numberOfProvences {
    public static int solve(int[][] isConnected){
        int n = isConnected.length;
        boolean[] visited = new boolean[n];
        int count =0;
        for(int i=0;i<n;i++){
            Queue<Integer> q = new ArrayDeque<>();
            if(!visited[i]){
               bfs(i, visited, isConnected);
               count++;
            }


        }
        return count;
    }

    private static void bfs(int i, boolean[] visited, int[][] isConnected) {
        Queue<Integer> q = new ArrayDeque<>();
        visited[i]=true;
        q.add(i);
        while (!q.isEmpty()){
            int n = isConnected.length;
            int temp = q.poll();
            for (int j = 0; j < n ; j++) {
                if(isConnected[temp][j]==1 && !visited[j]){
                    visited[j]=true;
                }
            }
        }
    }

    static void main(String[] args) {
        int[][] isConnected = {{1,1,0},{1,1,0},{0,0,1}};
        System.out.println(solve(isConnected));

    }
}
