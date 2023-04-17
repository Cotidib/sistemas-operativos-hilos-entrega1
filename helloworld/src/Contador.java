public class Contador extends Thread {
    
    //static member variable
    public static int cuenta;
    private String nombre;
    public static int limite = 15000;
    
    public Contador(String nombre){
        this.nombre = nombre;
    }

    @Override
    public void run(){
        if (cuenta<limite){
            cuenta+=5000;
        }
        System.out.println("Contador de " + nombre + ":" + cuenta);
    }

}
