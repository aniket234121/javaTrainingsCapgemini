package DataStructures.Tree;

public class TreeMain {
    public static void main(String[] args) {

        Tree tree = new Tree();
        tree.add(12);
        tree.add(13);
        tree.add(1221);
        tree.add(1222);
        tree.add(1);
        tree.add(2);
        tree.print();
        System.out.println("\n"+tree.find(123));
    }
}
