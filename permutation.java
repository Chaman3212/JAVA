//import java.util.*;
//public class permutation {
//    ArrayList<ArrayList<Integer>> list = new ArrayList<>();
//    public  void solve(int n , int[] arr , boolean[] use , ArrayList<Integer> res ){
//        if(n == res.size()){
//            list.add(new ArrayList<>(res));
//            return;
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//          if(!use[i]){
//              res.add(arr[i]);
////              use[i]=true;
//              solve(n, arr , use , res);
//              res.remove(res.size()-1);
//          }
//
//        }
//    }
//     void main(String[] args) {
//        int[] arr = {1,2,3};
//        boolean[] use = new boolean[arr.length];
//        int n = arr.length;
//        ArrayList<Integer> res = new ArrayList<>();
//        solve( n , arr , use , res);
//        System.out.println(res);
//    }
//    }
//
