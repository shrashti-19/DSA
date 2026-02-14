public class six{
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static void tobedeleted(Node node){
            node.data = node.next.data;
            node.next = node.next.next;

        
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(4);
        head.next.next = new Node(2);
        head.next.next.next = new Node(3);

        tobedeleted(head.next.next);
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data + "->");
            temp = temp.next;
        }

    }
}