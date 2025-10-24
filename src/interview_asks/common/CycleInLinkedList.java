package interview_asks.common;

import java.util.HashSet;
import java.util.Set;

public class CycleInLinkedList {

    public static void main(String[] args) {
        Node head = new Node(10);
        Node one = new Node(20);
        head.next = one;
        Node two = new Node(30);
        head.next.next =two;
        Node three = new Node(40);
        head.next.next.next = one;

        Node curr = head;
        Set<Node> set = new HashSet<>();

        while (curr != null) {
            boolean v = set.add(curr);
            if (!v) {
                System.out.println("Cycle detected");
                break;
            }
            curr = curr.next;
        }
    }
}
