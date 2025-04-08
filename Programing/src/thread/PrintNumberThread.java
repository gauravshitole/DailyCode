package thread;

public class PrintNumberThread extends Thread{
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            PrintNumberThread printNumberThread=new PrintNumberThread();
           printNumberThread.start();
        }
        System.out.println("Finished main program"+Thread.currentThread());
    }
    public  void run(){
        for(int i=0;i<50;i++){
            System.out.println(i+"Thread is"+Thread.currentThread().getName());
        }
        System.out.println("Fininsh method"+Thread.currentThread().getName());
    }

}
