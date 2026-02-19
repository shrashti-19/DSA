public class reverse2{
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node reverseK(Node head, int k){
        if(head == null || k<=1) return head;

        Node temp = head;
        for(int i=0 ; i<k ; i++){
            if(temp==null) return head;
            temp = temp.next;
            
        }

        Node curr = head;
        Node prev = new Node(-1);
        for(int i=0 ; i<k ; i++){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head.next = reverseK(curr, k);
        return prev;

    }

    public static void main(String args[]){
        Node head = new Node(1);
        head.next = new Node(2);
        // head.next.next = new Node(3);
        // head.next.next.next = new Node(4);
        // head.next.next.next.next = new Node(5);
        int k = 2;
        Node ans = reverseK(head,k);
        Node temp = ans;
        while(temp!=null){
            System.out.println(temp.data + "->");
            temp = temp.next;
        }

    }
}