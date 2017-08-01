public class ElementFromTail {

    private ListNode head; //head of the list

    class ListNode {
        private int value;
        private ListNode next;
        ListNode (int v){
            value = v;
            next = null;
        }


        public ListNode next() {
            return this.next;
        }
    }
        private void printNthFromLast(int n)
        {
            int len = 0;
            ListNode temp = head;

            while (temp != null)
            {
                temp = temp.next;
                len++;
            }

            if (len < n)
                return;

            temp = head;

            for (int i = 1; i < len-n+1; i++)
                temp = temp.next;

            System.out.println(temp.value);
        }

        private void push(int newValue)
        {
            ListNode newNode = new ListNode(newValue);
            newNode.next = head;
            head = newNode;
        }

        public static void main(String [] args)
        {
            ElementFromTail list = new ElementFromTail();
            list.push(20);
            list.push(4);
            list.push(15);
            list.push(35);
            list.push(31);
            list.printNthFromLast(4);
        }
    }

