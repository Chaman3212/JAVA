package Strings.printAllPrime1_N;

public class lava {

    public static boolean isPrime(int n){
        int count =0;
        for(int i =2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void printPrimeTillN(int n){
        for(int i=2;i<=n;i++){
            boolean isPrime = isPrime(i);
            if(isPrime==true){
                System.out.println(i);
            }
        }
    }

    static void main(String[] args) {
        printPrimeTillN(12);
    }
}
