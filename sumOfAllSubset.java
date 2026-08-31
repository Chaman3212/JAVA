import java.util.ArrayList;

public class sumOfAllSubset {

    public static int sumOfAllSubset(int idx , int[] arr , ArrayList<Integer> l, int sum ){
        if(idx == arr.length){
            for (int i = 0; i < l.size(); i++) {
                sum += l.get(i);
                System.out.println(l.get(i)+" ");
            }
            System.out.println(" ");
            return sum;
        }
       int k=  sumOfAllSubset(idx+1, arr, l,sum);
        l.add(arr[idx]);
        int r =sumOfAllSubset(idx+1, arr, l,sum);
        l.remove(l.size()-1);
        return k + r;
    }

    static void main(String[] args) {
        int[] arr = {1,2,3};
        ArrayList<Integer> l = new ArrayList<>();
        System.out.println(sumOfAllSubset(0, arr, l,0));
    }

}
