package Questions.remove_Duplicates;

public class Main{
    public static void main(String[] args) {
        RemoveDuplicates list = new RemoveDuplicates();
        list.insertLast(1);
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(3);
        list.insertLast(4);
        list.display();
        list.deleteDuplicates();
        list.display();
    }
}
