public class intersection{
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node intersectLL(Node head1, Node head2){
        Node d1 = head1;
        Node d2 = head2;

        while(d1!=d2){
            d1 = d1==null ? head2 : d1.next;
            d2 = d2==null ? head1 : d2.next;
        }
        return d1;
    }
    public static void main(String[] args) {
        Node head1 = new Node(1);
        head1.next = new Node(3);
        head1.next.next = new Node(1);
        head1.next.next.next = new Node(2);
        head1.next.next.next.next = new Node(4);

        Node head2 = new Node(3);
        head2.next = head1.next.next.next;

        Node ans = intersectLL(head1, head2);
        System.out.println(ans.data);
    }
}