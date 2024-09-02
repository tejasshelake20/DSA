package DoublyLL;

public class DLL  {

    Node head;
    Node tail;
    //int size;
//    public DLL(){
//        this.size = 0;
//    }
    private class Node{
        int value;
        Node next;
        Node prev;

        public Node(int value){
            this.value = value;
        }

        public Node(int value,Node next, Node prev){
            this.value = value;
            this.next = next;
            this.prev = prev;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        node.prev = null;

        if(head != null){
            head.prev = node;
        }
        head = node;
    }

    public void display(){
        Node node = head;
        System.out.print("HEAD -> ");
        while(node != null){
            System.out.print(node.value + " -> ");
            node = node.next;
        }
        System.out.println("END");
    }
    public void displayRev(){
        Node node = head;
        Node tail = null;
        while(node != null){
            tail = node;
            node = node.next;
        }
        System.out.print("END -> ");
        while(tail != null){
            System.out.print(tail.value + " -> ");
            tail = tail.prev;
        }
        System.out.println("HEAD");
    }

    public void insertLast(int value){

        Node node = new Node(value);
        Node last = head;
        node.next = null;

        if(head == null){
//            insertFirst(value);
            node.prev = null;
            head = node;
            return;
        }

        while(last.next != null){
            last = last.next;
        }
        node.prev = last;
        last.next = node;
    }

    public void insert(int index,int value){

        if(index == 0) {
            insertFirst(value);
            return;
        }

//        if(index == size) {
//            insertLast(value);
//            return;
//        }

        Node temp = head;
        for(int i=0; i<index - 1; i++) {
            temp = temp.next;
        }
        Node node = new Node(value, temp.next);
        temp.next = node;

    }

    public Node get(int index){
        Node node = head;
        for(int i=0; i<index; i++){
            node = node.next;
        }
        return node;
    }

    public Node find(int value){
        Node node = head;
        while(node != null){
            if(node.value == value){
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void insertAfter(int after, int value){
        Node p = find(after);
        if(p == null){
            System.out.println("does not exist..");
            return;
        }
        Node node = new Node(value);

            node.next = p.next;
            p.next = node;
            node.prev = p;
            if(node.next != null){
                node.next.prev = node;
            }

    }
}
