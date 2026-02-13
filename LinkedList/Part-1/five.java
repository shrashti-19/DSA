public class five{
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node add(Node head1, Node head2){
        Node dummy = new Node(-1);
        Node curr1 = head1, curr2 = head2;
        int carry=0;
        Node tail = dummy;

        while(curr1!=null || curr2!=null){
            int val1=0, val2=0;
            if(curr1!=null){
                val1 = curr1.data;
            }
            if(curr2!=null){
                val2 = curr2.data;
            }
            int sum = val1 + val2 + carry;
            int digit = sum%10;
            carry = sum/10;
            tail.next = new Node(digit);
            tail = tail.next;
            if(curr1!=null) curr1 = curr1.next;
            if(curr2!=null) curr2 = curr2.next;
        }

        if(carry>0){
            tail.next = new Node(carry);
        }
        return dummy.next;

    }
    public static void main(String args[]){
        Node head1 = new Node(2);
        head1.next = new Node(4);
        head1.next.next = new Node(3);

        Node head2 = new Node(5);
        head2.next = new Node(6);
        head2.next.next = new Node(4);

        Node ans = add(head1,head2);
        Node temp = ans;
        while(temp!=null){
            System.out.println(temp.data + ", ");
            temp = temp.next;
        }
    }
}