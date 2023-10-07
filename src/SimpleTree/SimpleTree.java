package SimpleTree;
import Node.Node;
import lombok.Data;

@Data
public class SimpleTree {
    Node root;

    private Node addRecursive(Node current, int value){
        if (current == null){
            return new Node(value);
        }
        if (current.getValue() > value) {
            current.setLeft(addRecursive(current.getLeft(), value));
        } else if (value > current.getValue()) {
            current.setRight(addRecursive(current.getRight(), value));
        }
        return current;
    }
    public void add(int value){
        root = addRecursive(root,value);
    }

    private void traverseInOrderRecursive(Node node){
        if (node != null){
            traverseInOrderRecursive(node.getLeft());
            System.out.print(" " + node.getValue());
            traverseInOrderRecursive(node.getRight());
        }
    }
    public void traversInOrder(){
        traverseInOrderRecursive(root);

    }

    public void traverseInOrder() {
    }
}