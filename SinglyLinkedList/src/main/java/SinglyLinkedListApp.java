

public class SinglyLinkedListApp {
    public static void main(String[] args) {

        SinglyLinkedList sll = new SinglyLinkedList();
        sll.head= new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(11);

        //Now we connect them together to form a chain

        sll.head.next=second;       //10 -->1
        second.next = third;        //10 -->1-->8
        third.next = fourth;        //10 -->1-->8-->null


        sll.printElement();
        System.out.println("Length is - " + sll.length());
        sll.insetFirst(11);
        sll.printElement();
        sll.insetLast(12);
        sll.printElement();
        sll.insert(2,200);
        sll.printElement();
    }
}
