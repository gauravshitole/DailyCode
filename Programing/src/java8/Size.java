package java8;

public interface Size {
    public  abstract  int getSize();

    default  boolean isEmpty(){
        System.out.println("Calling default method");
        return  getSize()==0;
    }
}
