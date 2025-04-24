package java8;

public class MyList implements   Size {
    public  int counter;

    public  void add(){
counter++;

    }
    @Override
    public int getSize() {
        return counter++;
    }


    @Override
    public boolean isEmpty() {
        System.out.println("Calling MyList method");
        return false;
    }
}
