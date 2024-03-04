package lets_get_certified.methods_and_encapsulation;

public class Book {
    protected void read(){}
}

class NonFictionBook extends Book {
    public void doThings() {
        read();
    }
}
