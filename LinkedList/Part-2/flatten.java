public class flatten{
    static class ListNode{
        int data;
        ListNode next;
        ListNode child;

        public ListNode(int data){
            this.data = data;
            this.next = null;
            this.child = null;
        }
    }
    public static ListNode flatten(ListNode head){
        if(head == null || head.next == null) return head;
        head.next = flatten(head.next);
        head = merge(head,head.next);

        return head;
    }
    public static ListNode merge(ListNode a, ListNode b){
        if(a==null) return b;
        if(b==null) return a;

        ListNode result;
        if(a.data<b.data){
            result = a;
            result.child = merge(a.child,b);
        }else{
            result = b;
            result.child = merge(b.child, a);
        }

        result.next = null;
        return result;
    }

    public static void printLinkedList(ListNode head){
        ListNode temp = head;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.child;
        }
    }
    public static void main(String args[]){
    ListNode head = new ListNode(5);
    head.child = new ListNode(7);
    head.child.child = new ListNode(8);
    head.child.child.child = new ListNode(30);

    head.next = new ListNode(10);
    head.next.child = new ListNode(20);

    head.next.next = new ListNode(19);
    head.next.next.child = new ListNode(22);
    head.next.next.child.child = new ListNode(50);

   head.next.next.next = new ListNode(28);
   head.next.next.next.child = new ListNode(35);
   head.next.next.next.child.child = new ListNode(40);
   head.next.next.next.child.child.child = new ListNode(45);
        ListNode flattened = flatten(head);

        // Print flattened version
        System.out.print("\nFlattened linked list: ");
        printLinkedList(flattened);
    }
}