public class SinglyLinkedListApp {
    public static void main(String[] args) {

        // Let's create a linked list demonstrated in slide
        //10 --> 8 --> 11 --> null
        ListNode head = new ListNode(10);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(1);
        ListNode fourth = new ListNode(11);

        //Now we connect them together to form a chain

        head.next=second;       //10 -->1
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

        System.out.println(sll.deleteFirst().data);
        sll.printElement();

        System.out.println(sll.deleteLast().data);
        sll.printElement();

        sll.delete(1);
        sll.printElement();

        System.out.println("---------------------");

        if(sll.find(sll.head,11)){
            System.out.println("Search key found !!!");
        }else {
            System.out.println("Sear key not found !!!");
        }

        ListNode sll1 = sll.reverse(sll.head);
        sll.printElement(sll1.);

    }
}

