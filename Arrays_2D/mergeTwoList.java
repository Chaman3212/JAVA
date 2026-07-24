//package Arrays_2D;
//
//import java.util.ArrayList;
//import java.util.LinkedList;
//public class Node{
//    int data ;
//    Node next;
//    public Node(int data ){
//        this.data = data;
//    }
//}
//
//public class mergeTwoList {
//    public LinkedList<Integer> mergeTwoLists(LinkedList<Integer> list1, LinkedList<Integer> list2) {
//        LinkedList<Integer> temp = list1;
//        while(list1.next != null){
//            list1 = list1.next;
//        }
//
//        list1.next = list2;
//        return list1;
//    }
//    static void main(String[] args) {
//        LinkedList<Integer> list1 = new LinkedList<>();
//        LinkedList<Integer> list2 = new LinkedList<>();
//        list1.add(1);
//        list1.add(2);
//        list1.add(4);
//        list2.add(1);
//        list2.add(3);
//        list2.add(4);
//        mergeTwoList(list1,list2);
//    }
//}
