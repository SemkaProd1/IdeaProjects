import java.util.Stack;

class BT {
    private BTNode root;

    public BT() {
        root = null;
    }



    public void add(int data) {
        root = add(root, data);
    }

    private BTNode add(BTNode current, int data) {
        if (current == null)
            current = new BTNode(data);
        else {
            if (data < current.getData()) {
                current.setLeft(add(current.getLeft(), data));
            } else {
                current.setRight(add(current.getRight(), data));
            }
        }
        return current;
    }


    public boolean contains(BTNode node) {
        BTNode parent = root;
        while (node.data!=parent.data) {
            if (node.data < parent.data) {
                if (parent.left == null) {
                    return false;
                } else {
                    parent = parent.left;
                }
            } else {
                if (parent.right == null) {
                    return false;
                } else {
                    parent = parent.right;
                }
            }
        }
        return true;
    }


    public int size() {
        BTNode current = root;
        int size = 0;
        Stack<BTNode> stack = new Stack<>();
        while (!stack.isEmpty() || current != null) {
            if (current != null) {
                stack.push(current);
                current = current.left;
            } else {
                size++;
                current = stack.pop();
                current = current.right;
            }
        }
        return size;
    }

}