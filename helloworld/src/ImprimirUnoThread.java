public class ImprimirUnoThread extends Thread {

    @Override
    public void run(){
        for(int i=1; i <= 1000; i++){
            System.out.println("1 - Thread");
        }
    } 

}