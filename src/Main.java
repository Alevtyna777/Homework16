import SimpleTree.SimpleTree;

public class Main {

    public static void main(String[] args) {
        SimpleTree tree = new SimpleTree();
        tree.add(8);
        tree.add(3);
        tree.add(10);
        tree.add(1);
        tree.add(6);
        tree.add(14);

        System.out.println("Обхід в порядку виникнення (ітерування):");
        tree.traverseInOrder();
    }
}