package Strings;

public class practice_prblm {
    static void main(String[] args) {
        String str = "Hey my name is chirag";
//        for(int i=0;i<str.length()-1;i++){
//            System.out.println(str.charAt(i));
//        }


//        Printing length without the length funciton
//        int count =0;
//        for( char ch : str.toCharArray()){
//            count++;
//        }
//        System.out.println(count);

        int vowelCount =0;
        for(char ch : str.toLowerCase().toCharArray()){
            if(ch =='a' || ch =='e' || ch == 'i' || ch== 'o' || ch== 'u' ){
                vowelCount++;
            }
        }
        System.out.println(vowelCount);
    }
}
