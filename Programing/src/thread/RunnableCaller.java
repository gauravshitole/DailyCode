package thread;

public class RunnableCaller implements Runnable {

    private  final String  messsage;
    private  final DisplayService displayService;

    public RunnableCaller(String messsage, DisplayService displayService) {
        this.messsage = messsage;
        this.displayService = displayService;
    }

    @Override
    public void run() {
        displayService.Display(messsage);
    }
}
