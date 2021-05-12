public class LinkedListDeleteMiddleNode {
    static Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }

    static void print(Node node){
        while (node != null){
            System.out.println(node.data + " ");
            node = node.next;
        }
    }

    static void deleteMiddleNode(int count){
        int index = 0;
        Node current = head;
        Node prev = head;
        while (current != null){
            if(index == count){
                prev.next = current.next;
            }
            prev = current;
            current = current.next;
            index++;
        }
    }

    static int nodeCount(){
        Node start = head;
        int count = 0;
        while (start != null){
            count++;
            start = start.next;
        }
        return count;
    }

    public static void main(String[] args){
        LinkedListDeleteMiddleNode list = new LinkedListDeleteMiddleNode();
        list.head = new LinkedListDeleteMiddleNode.Node(6);
        list.head.next = new LinkedListDeleteMiddleNode.Node(3);
        list.head.next.next = new LinkedListDeleteMiddleNode.Node(4);
        list.head.next.next.next = new LinkedListDeleteMiddleNode.Node(7);
        list.head.next.next.next.next = new LinkedListDeleteMiddleNode.Node(2);
        list.head.next.next.next.next.next = new LinkedListDeleteMiddleNode.Node(9);
        list.head.next.next.next.next.next.next = new LinkedListDeleteMiddleNode.Node(5);
        int count = list.nodeCount();
        list.print(head);
        System.out.println("*********");
        System.out.println("\n" + count );
        System.out.println("*********");
        System.out.println(count/2);
        System.out.println("*********");
        list.deleteMiddleNode(count/2);
        list.print(head);
    }
}
