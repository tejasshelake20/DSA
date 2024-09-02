package com.tejas.nested_interface3;
// Nested Class within an interface
public interface A {
    void read();
    void status();
    public class InnerClass{
        int bookName;
        int quantity;
        public InnerClass(){
            this.bookName = bookName;
            this.quantity = quantity;
        }
    }
}

class B implements A{

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
    public void bookQuantity(InnerClass b1){
        System.out.println("Books calculated..");
    }

    public static void main(String[] args) {
        B newBook = new B();

        newBook.bookCheck(new A.InnerClass());
        newBook.bookQuantity(new A.InnerClass());

    }

}
