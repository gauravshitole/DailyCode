package thread;

public class TestEnhancedTryCloseCall implements  AutoCloseable {
    public static void main(String[] args) {
        try(TestEnhancedTryCloseCall testEnhancedTryCloseCall=new TestEnhancedTryCloseCall()){
            System.out.println("In try block");
        }catch (Exception e){
            System.out.println(e);
        }
    }

    @Override
    public void close() throws Exception {
        System.out.println("closing testfinally call");
    }
}
