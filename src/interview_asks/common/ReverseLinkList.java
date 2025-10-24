package interview_asks.common;

public class ReverseLinkList {

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        Node reversed = solution(head);
        printList(reversed);

    }

    public static Node solution(Node head) {
        Node curr = head;
        Node temp;
        Node prev = null;

        while (curr != null) {
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }

    static void printList(Node node) {
        while (node != null) {
            System.out.print(node.x);
            if (node.next != null)
                System.out.print(" -> ");
            node = node.next;
        }
    }
}
