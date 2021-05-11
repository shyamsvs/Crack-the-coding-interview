import java.util.Scanner;

public class LinkedListKthLargest {
    static Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }

    static int kThLargestSorting(int k){
        Node cur = null, nex = null;
        int temp;
        cur = head;
        while (cur != null){
            nex = cur.next;
            while (nex != null){
                if (cur.data < nex.data){
                    temp = cur.data;
                    cur.data = nex.data;
                    nex.data = temp;
                }
                nex = nex.next;
            }
            cur = cur.next;
        }
        Node c = head;
        int i = 0;
        while (c != null){
            i++;
            if(i == k){
                return c.data;
            }
            c = c.next;
        }
        return 0;
    }

    //need to do assending order for sorting
    static int kThLargestTwoPointerAfterSorting(int k){
        Node p1 = head, p2 = head;
        for(int i = 0;i < k;i++){
            if (p1 == null)return 0;
            p1 = p1.next;
        }
        while (p1 != null){
            p1 = p1.next;
            p2 = p2.next;
        }
        return p2.data;
    }

    static void print(Node node){
        while (node != null){
            System.out.println(node.data + " ");
            node = node.next;
        }
    }

    public static void main(String[] args){
        LinkedListKthLargest list = new LinkedListKthLargest();
        list.head = new Node(6);
        list.head.next = new Node(3);
        list.head.next.next = new Node(4);
        list.head.next.next.next = new Node(7);
        list.head.next.next.next.next = new Node(2);
        list.head.next.next.next.next.next = new Node(9);
        list.head.next.next.next.next.next.next = new Node(5);
        // 9 7 6 5 4 3 2
        System.out.println("Linked List\n");
        list.print(head);
        System.out.println("Enter the integer");
        Scanner scanner = new Scanner(System.in);
        int kThElement = scanner.nextInt();
        int ans = list.kThLargestSorting(kThElement);
        list.print(head);
        int ans1 = list.kThLargestTwoPointerAfterSorting(kThElement);
        System.out.println(ans);
        System.out.println(ans1);
    }
}
