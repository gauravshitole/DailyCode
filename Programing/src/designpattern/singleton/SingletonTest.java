package designpattern.singleton;

public class SingletonTest {
    public static void main(String[] args) {
Thread thread1=new Thread(()->{
    Singleton FirstSingleTone=Singleton.getInstance();
    System.out.println(FirstSingleTone);

    Singleton FirstSingleTone1=Singleton.getInstance();
    System.out.println(FirstSingleTone1);

});
        Thread thread2=new Thread(()->{
            Singleton FirstSingleTone=Singleton.getInstance();
            System.out.println(FirstSingleTone);

            Singleton FirstSingleTone1=Singleton.getInstance();
            System.out.println(FirstSingleTone1);

        });
thread2.start();
thread1.start();

    }
}
