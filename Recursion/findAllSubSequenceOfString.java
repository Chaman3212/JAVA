package Recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class findAllSubSequenceOfString {
   public static void findAllSubSequenceOfString(String str, int idx , ArrayList<ArrayList<Character>> list,ArrayList<Character> l ){

       if(idx == str.length()){
           list.add(new ArrayList<>(l));
           return ;
       }
       l.add(str.charAt(idx));
       findAllSubSequenceOfString(str, idx+1,list, l);
       l.remove(l.size()-1);
       findAllSubSequenceOfString(str,idx+1,list,l);

   }
// Geek for Geeks Solution

    ///  /////////////////////////////
    public void solve(String s , int idx , ArrayList<String> l , StringBuilder str){

        if(idx == s.length()){
            l.add(str.toString());
            return;
        }
        str.append(s.charAt(idx));
        solve(s , idx+1 ,l , str);
        str.deleteCharAt(str.length()-1);
        solve(s , idx+1 ,l , str);




    }


        static void main(String[] args) {
     String str = "abc";
     ArrayList<ArrayList<Character>> list = new ArrayList<>();
     ArrayList<Character> l = new ArrayList<>();
     findAllSubSequenceOfString(str,0,list, l);

      System.out.println(l);
    }
}
