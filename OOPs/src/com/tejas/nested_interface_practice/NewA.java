package com.tejas.nested_interface_practice;


public interface NewA {
    void read();
    void status();
    public class InnerClass{
        String bookName;
        int quantity;
        InnerClass(String bookName, int quantity){
            this.bookName = bookName;
            this.quantity = quantity;
        }
    }
}

class NewB implements NewA {

    @Override
    public void read() {
        System.out.println("Reading..");
    }

    @Override
    public void status() {
        System.out.println("In progress..");
    }

    public void bookCheck(InnerClass b1){
        System.out.println("Book name is checked..");
    }
    public int bookQuantity(int b1){
        return bookQuantity(4);
    }

    public static void main(String[] args) {
        NewB newBook = new NewB();

        newBook.bookCheck(new NewA.InnerClass("Hopes", 4));
        newBook.bookQuantity(4);

    }

}

