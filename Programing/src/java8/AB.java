package java8;

public class AB implements A,B{
    @Override
    public void display() {
        A.super.display();
        B.super.display();
    }
}
