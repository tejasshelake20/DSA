package singlyLL;

import singlyLL.LL;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
//        list.insertFirst(9);
//        list.insertFirst(4);
//        list.insertFirst(5);
//        list.insertFirst(4);
//        list.display();
//        list.insertLast(17);
//        list.display();
////        list.insertFirst(64);
////        list.display();
//        list.insert(2,18);
//        list.insert(2,14);
//        list.display();
//        list.insertFirst(64);
//        list.display();
//        System.out.println(list.deleteFirst());
//        list.display();
//        System.out.println(list.deleteLast());
//        list.display();
//        System.out.println(list.delete(3));
//        list.display();
//        System.out.println(list.delete(4));
//        list.display();
//        list.insert(2,3);
//        list.display();
//        list.insert(4,12);
//        list.display();
//        //list.displayRev();
//        list.insert(0,3);
//        list.display();
//        System.out.println(list.get(1));

        list.insertRec(1,0);
        list.display();
        list.insertRec(1,1);
        list.display();
        list.insertRec(4,2);
        list.display();
        list.insertRec(4,3);
        list.display();
        list.deleteDuplicates();
        list.display();
        list.reverseList();
        list.display();
        list.insertFirst(6);
        list.insertFirst(8);
        list.display();
        //System.out.println("List 1 --> Sorted");
        list.sortList();
        list.display();
//        list.displayRev(); // Not Working

        LL list2 = new LL();
        list2.insertLast(4);
        list2.insertLast(6);
        list2.insertLast(2);
        list2.insertLast(3);
        list2.display();
        System.out.println("List 2 --> Sorted");
        list2.sortList();
        list2.display();

        LL res = LL.mergeTwoLists(list, list2);
        res.display();

    }
}



