public class first{
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node rotateByK(Node head, int k){
        int count = 0;
        Node temp = head;
        Node lastNode = null;
        while(temp!=null){
            count++;
            lastNode = temp;
            temp = temp.next;
        }
        k = k%count;
        if(k==0){
            return head;
        }else{
            lastNode.next = head;
        }

        int newTailindex = count-k-1;
        Node newTail = head;
        for(int i = 0; i < newTailindex; i++){
            newTail = newTail.next;
        }
        Node newHead = newTail.next;
        newTail.next = null;
        return newHead;


    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        int k = 2;
        Node ans = rotateByK(head,k);
        Node temp = ans;
        while(temp!=null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("");
    }
}