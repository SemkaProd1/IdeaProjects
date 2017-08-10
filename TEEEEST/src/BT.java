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


    public static boolean contains(BTNode current, int data) {
            if (current.getData() == data) {
                return true;
            }
            boolean contains = false;
                if (current.left != null) {
                    contains = contains(current.getLeft(), data);
                }
            if (!contains && current.right !=null) {
                contains = contains(current.getRight(), data);
            }

            return contains;
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