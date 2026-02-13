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
            int sum = curr1.data + curr2.data + carry;
            int digit = sum%10;
            carry = sum/10;
            tail.next = new Node(digit);
            tail = tail.next;
            curr1 = curr1.next;
            curr2 = curr2.next;
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