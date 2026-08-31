//package tree;
//
//import java.util.ArrayList;
//
//public class treePathPrinting_257 {
//    public List<String> binaryTreePaths(Node root) {
//        List<Integer> res = new ArrayList<>();
//        if(root == null) return new ArrayList<>() ;
//        res.add(root.val);
//        binaryTreePaths(root.left);
//        binaryTreePaths(root.right);
//        return res;
//    }
//
//    public class Node{
//        int data;
//        Node left;
//        Node right;
//         public Node(int data){
//             this.data=data;
//         }
//    }
//    static void main(String[] args) {
//        Node root = new Node(1);
//        Node a = new Node(2);
//        Node b = new Node(3);
//        Node c = new Node(4);
//        Node d = new Node(5);
//        Node e = new Node(6);
//        Node f = new Node(7);
//        Node g = new Node(8);
//
//        root.left=a;root.right=b;root.left.left=c;root.left.right=d;root.right.right=e;root.right.left=f;
//        root.left.left.left=g;
//    }
//}
