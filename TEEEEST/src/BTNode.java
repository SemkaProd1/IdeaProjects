
class BTNode extends BT
{
    BTNode left;
    BTNode right;



    BTNode parent;
    int data;

    public BTNode(int data) {
        this.data = data;
    }

    public BTNode getParent() {
        return parent;
    }

    public void setParent(BTNode parrent) {
        this.parent = parrent;
    }

    public BTNode getLeft()
    {
        return left;
    }

    public BTNode getRight()
    {
        return right;
    }

    public int getData()
    {
        return data;
    }

    public void setLeft(BTNode left) {
        this.left = left;
    }

    public void setRight(BTNode right) {
        this.right = right;
    }

    public static void main(String[] args) {
        BT bt = new BT();
        bt.add(5);
        bt.add(3);
        bt.add(7);
        System.out.println(bt.size());


    }
}
