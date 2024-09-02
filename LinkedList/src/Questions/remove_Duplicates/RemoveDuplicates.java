package Questions.remove_Duplicates;
public class RemoveDuplicates {

    private ListNode head;
    private ListNode tail;

    int size;
    public RemoveDuplicates(){
        this.size = 0;
    }

    public void deleteDuplicates() {
        ListNode node = head;

        while(node.next != null){
            if(node.value == node.next.value){
                node.next = node.next.next;
                size--;
            }
            else {
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
    }

    public void insertFirst(int value) {
        ListNode node = new ListNode(value);
        node.next = head;
        head = node;

        if(tail == null) {
            tail = head;
        }

        size += 1;                  // size = size + 1;

    }

    public void insertLast(int value) {

        if(tail == null) {
            insertFirst(value);
            return;
        }

        ListNode node = new ListNode(value);
        tail.next = node;
        tail = node;
        size++;

    }

    public void insert(int index, int value){

        if(index == 0) {
            insertFirst(value);
            return;
        }

        if(index == size) {
            insertLast(value);
            return;
        }

        ListNode temp = head;
        for(int i=0; i<index - 1; i++) {
            temp = temp.next;
        }
        ListNode node = new ListNode(value, temp.next);
        temp.next = node;

        size++;
    }

    public void display(){
        ListNode temp = head;
        System.out.print("HEAD -> ");
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    class ListNode{
        int value;
        ListNode next;

        public ListNode(){}

        public ListNode(int value){
            this.value = value;
        }

        public ListNode(int value, ListNode next){
            this.value = value;
            this.next = next;
        }
    }
}

