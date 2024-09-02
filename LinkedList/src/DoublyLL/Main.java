package DoublyLL;

public class Main {
    public static void main(String[] args) {
        DLL list = new DLL();

//        list.insertFirst(8);
//        list.insertFirst(3);
//        list.insertFirst(2);
//        list.insertFirst(5);

        list.display();
        list.insertLast(3);
        list.insertLast(8);
        list.insertFirst(17);
        list.insertLast(6);
        list.display();
        list.insert(2,10);
        list.display();
        list.insert(0,12);
        list.display();
        list.insertAfter(8,42);
        list.display();
        list.insertAfter(6 ,42);
        list.display();

    }
}
