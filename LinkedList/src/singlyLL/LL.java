package singlyLL;

import java.util.List;

public class LL{
    private ListNode head;
    private ListNode tail;
    int size;
    public LL(){
        this.size = 0;
    }

    public void display() {
        ListNode node = head;
        System.out.print("HEAD -> ");
        while(node != null) {
            System.out.print(node.value + " -> ");
            node = node.next;
        }
        System.out.println("END");
    }

    public void displayRev(){
        ListNode current = head;
        ListNode prev = null;
        ListNode next = null;
        System.out.print("END -> ");
        while(current != null ){
            next = current.next;

            current.next = prev;
            prev = current;

            System.out.print(current.value + " -> ");

            current = next;



        }
        head = prev;
        System.out.println("HEAD");
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

    public int deleteFirst() {

        int value = head.value;
        head = head.next;

        if(head == null){
            tail = null;
        }

        size--;
        return value;

    }

    public int deleteLast() {
        if(size <= 1){
            return deleteFirst();
        }

        ListNode secondLast = get(size - 2);
        int value = tail.value;
        tail = secondLast;
        tail.next = null;
        size--;
        return value;
    }

    public int delete(int index) {
        if(index == 0){
            return deleteFirst();
        }
        if(index == size - 1){
            return deleteLast();
        }

        ListNode prev = get(index - 1);
        int value = prev.next.value;

        prev.next = prev.next.next;
        size--;
        return value;

    }

    public ListNode get(int index){
        ListNode node = head;
        for(int i=0; i<index; i++){
            node = node.next;
        }
        return node;
    }

    public ListNode find(int value){
        ListNode node = head;
        while(node != null){
            if(node.value == value){
                return node;
            }
            node = node.next;
        }
        return null;
    }

    // Reverse Linked list --> Iteratively

    public void reverseList(){
        ListNode prev = null;
        ListNode current = head;
        ListNode next;

        while(current != null){
            next = current.next;
            current.next = prev;

            prev = current;
            current = next;
        }
        head = prev;
    }

    // Sort
    public void sortList(){

        boolean swapped;
        ListNode node;

        if(head == null){
            return;
        }
        do{
            node = head;
            swapped = false;
            while(node.next != null){
                if(node.value > node.next.value){
                    swap2(node, node.next);
                    swapped = true;
                }
                node = node.next;
            }
        }while(swapped);

    }

    // Swap function
    public void swap2(ListNode node1, ListNode node2){
        int temp = node1.value;
        node1.value = node2.value;
        node2.value = temp;
    }

    // Insert Using Recursion:
    // 1. Make a function with void return type & make changes to it
    // 2. Make a function with return type node & return the node to change the structure of the list
    public void insertRec(int value, int index){
        head = insertRec(value, index, head);
    }
    public ListNode insertRec(int value, int index, ListNode node){
        if(index == 0){
            ListNode temp = new ListNode(value, node);
            size++;
            return temp;
        }
        node.next = insertRec(value, index-1, node.next);
        return node;
    }

    // Questions:
    // 1. Remove Duplicates --> https://leetcode.com/problems/remove-duplicates-from-sorted-list/

    public void deleteDuplicates(){
        ListNode node = head;

        while(node.next != null){
            if(node.value == node.next.value){
                node.next = node.next.next;
                size--;
            }
            else{
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
    }

    // Merge Two Sorted Linked Lists --> https://leetcode.com/problems/merge-two-sorted-lists/description/
    public static LL mergeTwoLists(LL list1, LL list2) {
        ListNode f = list1.head;
        ListNode s = list2.head;

        LL ans = new LL();

        while(f != null && s != null){
            if(f.value < s.value){
                ans.insertLast(f.value);
                f = f.next;
            }
            else{
                ans.insertLast(s.value);
                s = s.next;
            }
        }
        while(f != null){
            ans.insertLast(f.value);
            f = f.next;
        }
        while(s != null){
            ans.insertLast(s.value);
            s = s.next;
        }
        return ans;
    }

    // Linked List Cycle --> https://leetcode.com/problems/linked-list-cycle/description/
    public boolean cycleDetection(){
        ListNode head = new ListNode();
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow){
                return true;
            }
        }
        return false;
    }

    // Length of the cycle -->
    public int lengthOfCycle(){
        ListNode head = new ListNode();
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow){
                // Calculate the length of the cycle
                ListNode temp = slow;
                int length = 0;
                do{
                    temp = temp.next;
                    length++;
                }while(temp != slow);
                return length;
            }
        }
        return 0;
    }

    // Cycled Linked List II --> https://leetcode.com/problems/linked-list-cycle-ii/
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        int length = 0;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow){
                length = countNodesinLoop(slow);
                break;
            }
        }

        if(length == 0){
            return null;
        }

        // Find the start of the cycle
        ListNode f = head;
        ListNode s = head;

        while(length > 0){
            s = s.next;
            length--;
        }

        // Keep moving both forward and they will meet at cycle sort
        while(f != s){
            f = f.next;
            s = s.next;
        }

        return s;

    }

    public int countNodesinLoop(ListNode head)
    {

        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow){
                ListNode temp = slow;
                int count = 0;
                do{
                    temp = temp.next;
                    count++;
                }while(temp != slow);

                return count;
            }
        }
        return 0;
    }

    // Happy Number --> https://leetcode.com/problems/happy-number/description/
    public boolean isHappy(int n){
        int fast = n;
        int slow = n;

        do{
            slow = squareSum(n);
            fast = squareSum(squareSum(n));
        }while(slow != fast);

        if(slow == 1){
            return true;
        }
        return false;
    }

    public int squareSum(int n){
        int sum = 0;

        while(n != 0){
            int rem = n % 10;
            sum = sum + (rem * rem);
            n = n / 10;
        }
        return sum;
    }

    // Middle of the linked list --> https://leetcode.com/problems/middle-of-the-linked-list/description/
    // In the leetcode, returns the head node; In the GFG returns the node index of middle of the linked list.

    // Return type --> head
    public ListNode midNode(){
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    // Return type --> int midInt
    public int midInt(){
        ListNode fast = head;
        ListNode slow = head;
        int length = 1;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            length ++;
        }
        return (length + 1) / 2;
//        return slow.value;  // For value of the mid-node
    }

}



    class ListNode {
        public ListNode head;
        int value;
        ListNode next;

        public ListNode(int value, ListNode next) {
            this.value = value;
            this.next = next;
        }
        public ListNode(int value) {
            this.value = value;
        }

        public ListNode() {
        }
    }

