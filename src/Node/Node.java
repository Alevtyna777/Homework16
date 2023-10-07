package Node;

import lombok.Data;

@Data
public class Node {
    int value;
    Node right;
    Node left;

    public Node(int value) {
        this.value = value;
    }

}