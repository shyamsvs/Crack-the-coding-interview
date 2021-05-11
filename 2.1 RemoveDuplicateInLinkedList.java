public class LinkedList {
    static Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }

    public void removeDup(){
        Node pt1 = null;
        Node pt2 = null;
        pt1 = head;
        while (pt1 != null && pt1.next != null){
            pt2 = pt1;
            while (pt2.next != null){
                if (pt1.data == pt2.next.data){
                    pt2.next = pt2.next.next;
                    System.gc();
                }
                else {
                    pt2 = pt2.next;
                }
            }
            pt1 = pt1.next;
        }
    }

    public void print(Node n){
        while (n != null){
            System.out.println(n.data + " ");
            n = n.next;
        }
    }
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.head = new Node(10);
        list.head.next = new Node(30);
        list.head.next.next = new Node(50);
        list.head.next.next.next = new Node(10);
        list.head.next.next.next.next = new Node(70);
        list.head.next.next.next.next.next = new Node(90);
        list.head.next.next.next.next.next.next = new Node(50);
        System.out.println("Before\n");
        list.print(head);
        System.out.println("After\n");
        list.removeDup();
        list.print(head);
    }
}
