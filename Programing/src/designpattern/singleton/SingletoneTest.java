package designpattern.singleton;

public class SingletoneTest {
    public static void main(String[] args) {

        Singleton FirstSingleTonObject=Singleton.getInstance();
        System.out.println(FirstSingleTonObject);

        Singleton FirstSingleTonObject2=Singleton.getInstance();
        System.out.println(FirstSingleTonObject2);
  Thread thread1=new Thread(()->{
      Singleton Fs=Singleton.getInstance();
      System.out.println("its is"+Fs);
  });
  Thread thread2=new Thread(()->{Singleton.getInstance();});
  thread1.start();
  thread2.start();

    }
}
