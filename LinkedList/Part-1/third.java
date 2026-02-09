public class third{
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node merge(Node head1, Node head2){
        if(head1==null) return head2;
        if(head2==null) return head1;

        Node dummy = new Node(-1);
        Node tail = dummy;

        Node curr1 = head1;
        Node curr2 = head2;

        while(curr1!=null && curr2!=null){
            if(curr1.data<=curr2.data){
                tail.next = curr1;
                curr1 = curr1.next;
            }else{
                tail.next = curr2;
                curr2 = curr2.next;
            }

            tail = tail.next;
        }

        while(curr1!=null){
            tail.next = curr1;
            curr1 = curr1.next;

            tail = tail.next;
        }

        while(curr2!=null){
            tail.next = curr2;
            curr2 = curr2.next;

            tail = tail.next;
        }

        return dummy.next;


    }
    public static void main(String[] args) {
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(4);

        Node head2 = new Node(1);
        head2.next = new Node(3);
        head2.next.next = new Node(4);

        Node ans = merge(head1,head2);
        Node temp = ans;
        while(temp!=null){
            System.out.println(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("");

    }
}