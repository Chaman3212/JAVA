//package tree;
//
//import javax.swing.tree.TreeNode;
//
//public class sizeOfBinaryTree {
//    public static class Node{
//        int data;
//        Node left;
//        Node right;
//        public Node(int data ){
//            this.data=data;
//
//        }
//    }
//    public static int size =0;
//    static int sizeOfTree(Node root ){
//
//        if(root == null) return 0;
//        size++;
//        sizeOfTree(root.left);
//        sizeOfTree(root.right);
//        return size;
//    }
////    public static int maxVal(Node root){
//        if(root == null) return ;
//        int leftMax =0,rightMax =0;
//        leftMax =Math.max(leftMax, maxVal(root.left));
//        rightMax =Math.max(rightMax, maxVal(root.right));
//        return Math.max(leftMax, rightMax);
//
//
//    }
//    public static int heightOfTree(Node root){
//        if(root == null) return 0;
//        int left = heightOfTree(root.left);
//        int right = heightOfTree(root.right);
//        return 1+ Math.max(left,right);
//    }
//    static void main(String[] args) {
////        Node root = new Node(1);
////        Node a = new Node(2);
////        Node b = new Node(3);
////        Node c = new Node(4);
////        Node d = new Node(5);
////        Node e = new Node(6);
////        Node f = new Node(7);
////        Node g = new Node(8);
////
////        root.left=a;root.right=b;root.left.left=c;root.left.right=d;root.right.right=e;root.right.left=f;
////        root.left.left.left=g;
////        System.out.println(sizeOfTree(root));
////        System.out.println(heightOfTree(root));
//        System.out.println(maxVal(root));
//    }
//}
