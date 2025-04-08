package thread;

public class DisplayService {
    public  synchronized  void Display( String message){
        System.out.println("Message is [" +message);
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            System.out.println("InterPriterException "+ e.getMessage());

        }
        System.out.println("]");
    }
}
