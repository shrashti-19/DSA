import java.util.*;

public class second{
    static class Node{
        int data;
        Node next;
        Node random;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.random = null;
        }
    }
    public static Node copyRandomList(Node head){
        if(head == null) return head;
        HashMap<Node,Node> map = new HashMap<>();
        Node curr = head;
        while(curr!=null){
            Node copy = new Node(curr.data);
            map.put(curr,copy);
            curr = curr.next;
        }
        curr  = head;
        while(curr!=null){
            Node copy = map.get(curr);
            copy.next = map.get(curr.next);
            copy.random = map.get(curr.random);
            curr = curr.next;
        }

        return map.get(head);
    }
    public static Node copyRandomList2(Node head){
        if(head==null) return head;
        Node curr = head;
        while(curr!=null){
            Node copy = new Node(curr.data);
            Node nextOriginal = curr.next;

            curr.next = copy;
            copy.next = nextOriginal;

            curr = nextOriginal;
        }
        curr = head;
        while(curr!=null){
            if(curr.random!=null){
                curr.next.random = curr.random.next;
            }
            curr = curr.next.next;
        }

        curr = head;
        Node clonedHead = head.next;
        while(curr!=null){
            Node copy = curr.next;
            curr.next = copy.next;

            if(copy.next!=null){
                copy.next = copy.next.next;
            }
            curr = curr.next;
        }
        return clonedHead;
    }

        public static void main(String[] args) {
            Node head = new Node(7);
            head.next = new Node(14);
            head.next.next = new Node(21);
            head.next.next.next = new Node(28);

    // Assigning random pointers
            head.random = head.next.next;
            head.next.random = head;
            head.next.next.random = head.next.next.next;
            head.next.next.next.random = head.next;

            Node ans = copyRandomList2(head);
            Node temp = ans;
            while(temp!=null){
                System.out.print(temp.data + "'");
                temp = temp.next;
            }
            System.out.println("");
        }
    }
