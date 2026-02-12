public class four{
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node deleteNode(Node head, int N){
        Node dummy = new Node(-1);
        dummy.next = head;
        Node slow = dummy, fast = dummy;
        for(int i=0 ; i<=N ; i++){
            fast = fast.next;
        }

        while(fast!=null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;

        return dummy.next;
    }
    public static void main(String args[]){
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        int N=2;
        Node ans = deleteNode(head,N);
        Node temp = ans;
        while(temp!=null){
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
    }
}