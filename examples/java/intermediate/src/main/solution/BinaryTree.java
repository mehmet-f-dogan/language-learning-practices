package solution;

class Node<T extends Comparable<T>> {
    private T value;
    Node<T> lChild;
    Node<T> rChild;

    public Node(T value) {
        this.value = value;
    }

    public void addValue(T value) {
        if (this.value.compareTo(value) > 0) {
            if (lChild == null) {
                lChild = new Node<>(value);
            } else {
                lChild.addValue(value);
            }
        } else {
            if (rChild == null) {
                rChild = new Node<>(value);
            } else {
                rChild.addValue(value);
            }
        }
    }

    public Node<T> deleteValue(T value) {
        if (value.compareTo(this.value) < 0) {
            if (lChild != null) {
                lChild = lChild.deleteValue(value);
            }
        } else if (value.compareTo(this.value) > 0) {
            if (rChild != null) {
                rChild = rChild.deleteValue(value);
            }
        } else {
            if (lChild == null && rChild == null) {
                return null;
            } else if (lChild == null) {
                return rChild;
            } else if (rChild == null) {
                return lChild;
            } else {
                Node<T> successor = rChild.findMin();
                this.value = successor.value;
                rChild = rChild.deleteValue(successor.value);
            }
        }
        return this;
    }

    private Node<T> findMin() {
        if (lChild == null) {
            return this;
        } else {
            return lChild.findMin();
        }
    }


}

public class BinaryTree {
    private Node<Integer> head;

    public BinaryTree(int[] values){
        head = new Node<Integer>(values[0]);
        for (int i = 1; i < values.length; i++) {
            head.addValue(values[i]);
        }
    }

    public void add(int value){
        head.addValue(value);
    }

    public void remove(int value){
        head.deleteValue(value);
    }

    public void traversePreOrder(){
        traversePreOrder(head);
    }

    private void traversePreOrder(Node<Integer> node){
        if (node == null) {
            return;
        }
        processNode(node);
        traversePreOrder(node.lChild);
        traversePreOrder(node.rChild);
    }

    public void traverseInOrder(){
        traverseInOrder(head);
    }

    private void traverseInOrder(Node<Integer> node){
        if (node == null) {
            return;
        }
        traverseInOrder(node.lChild);
        processNode(node);
        traverseInOrder(node.rChild);
    }

    public void traversePostOrder(){
        traversePostOrder(head);
    }

    private void traversePostOrder(Node<Integer> node){
        if (node == null) {
            return;
        }
        traversePostOrder(node.lChild);
        traversePostOrder(node.rChild);
        processNode(node);
    }

    private void processNode(Node<Integer> n){}
}
