public class ImprimirUnoRunnable implements Runnable {

    @Override
    public void run(){
        for(int i=1; i <= 1000; i++){
            System.out.println("1 - Runnable");
        }
    }  

}