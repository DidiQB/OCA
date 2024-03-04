package org.example;

import lets_get_certified.methods_and_encapsulation.Book;

class FictionBook extends Book {
    public void doThings(){
        read();
        this.read(); // same
        FictionBook fb = new FictionBook();
        fb.read();

        // What we can't do is create an instance of the superclass and access the protected method.
        Book b = new Book();
        b.read(); // 'read()' has protected access in 'lets_get_certified.methods_and_encapsulation.Book'

    }

class SpaceFictionBook extends FictionBook {
        public void doThings(){
            read();
            new Book().read();
            new FictionBook().read();
            new SpaceFictionBook().read();
        }
}
class Reader{
        public void doThings(){
            Book b = new Book();
            b.read();

            FictionBook fb = new FictionBook();
            fb.read();
        }
}
}
