public class ImprimirCeroThread extends Thread{

    @Override
    public void run(){
        for(int i=1; i <= 1000; i++){
            System.out.println("0 - Thread");
        }
    } 
    
}