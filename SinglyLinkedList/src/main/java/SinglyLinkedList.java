public class SinglyLinkedList {

    ListNode head;


    public void printElement(){
        ListNode current = head;
        while (current!=null){
            System.out.print(current.data+" --> ");
            current=current.next;
        }
        System.out.println("null");
    }

    public int length(){
        if(head==null){
            return 0;
        }
        int count=0;
        ListNode current = head;
        while (current!=null){
            count++;
            current=current.next;
        }
        return count;
    }

    public void insetFirst(int value){
        ListNode newNode = new ListNode(value);
        newNode.next=head;
        head=newNode;
    }

    public void insetLast(int value){
        ListNode newNode = new ListNode(value);
        if(head==null){
            head=newNode;
            return;
        }
        ListNode current = head;
        while (null!=current.next){
            current=current.next;
        }
        current.next=newNode;
    }

    public void insert(int position, int value){
        // 1 -> 4 -> 5
        // 1 -> 6 -> 4 -> 5

        ListNode node = new ListNode(value);
        if(position == 1){
            node.next = head;
            head = node;
        } else{
            ListNode previous = head;
            int count = 1; //position-1

            while(count<position-1){
                previous=previous.next;
                count++;
            }
            ListNode current = previous.next;
            previous.next=node;
            node.next=current;
        }
    }



}

