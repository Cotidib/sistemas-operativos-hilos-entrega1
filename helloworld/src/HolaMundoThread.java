public class HolaMundoThread extends Thread{

    private int numero;
    public HolaMundoThread (int num){
        this.numero = num;
    }
    
    @Override
    public void run(){
        try {
            Thread.sleep(numero*1000);
        } catch (InterruptedException e) {
        }
        System.out.println("Hola Mundo desde el Thread N " + numero);
    }

}
