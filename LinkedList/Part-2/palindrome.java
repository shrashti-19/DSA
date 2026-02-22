public class palindrome{
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static boolean isPalindrome(Node head){
        if(head == null) return true;

        Node slow = head;
        Node fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        Node temp = slow.next;
        Node secondHalf = reverse(temp);

        Node pointer1 = head;
        Node pointer2 = secondHalf;
        while(pointer2!=null){
            if(pointer1.data!=pointer2.data){
                return false;
            }

            pointer1 = pointer1.next;
            pointer2 = pointer2.next;
        }

        return true;

    }

    public static Node reverse(Node temp){
        Node curr = temp;
        Node prev = null;
        while(curr!=null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public static void main(String args[]){
        Node head = new Node(3);
        head.next = new Node(7);
        head.next.next = new Node(5);
        head.next.next.next = new Node(7);
        head.next.next.next.next = new Node(3);

        System.out.println(isPalindrome(head));
    }
}