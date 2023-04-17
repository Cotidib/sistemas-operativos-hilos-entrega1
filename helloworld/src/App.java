
public class App {
    public static void main(String[] args) throws Exception {

        //Ejercicio 1
        //Threads creados como subclases de Thread

        // ImprimirCeroThread threadCeros = new ImprimirCeroThread();
        // threadCeros.start();
        // ImprimirUnoThread threadUnos = new ImprimirUnoThread();
        // threadUnos.start();

        //Theads creados con interfaz Runnable

        // ImprimirUnoRunnable runnableUnos = new ImprimirUnoRunnable();
        // Thread runnableUnosThread = new Thread(runnableUnos);
        // runnableUnosThread.start();
        // ImprimirCeroRunnable runnableCeros = new ImprimirCeroRunnable();
        // Thread runnableCerosThread = new Thread(runnableCeros);
        // runnableCerosThread.start();

        //Ejercicio 2
        // for(int i=0; i < 10; i++){
        //     HolaMundoThread holaMundoThread = new HolaMundoThread(i);
        //     holaMundoThread.start();
        // }

        //Ejrcicio 3
        // Nota: La clase tiene implementada un limite, ya que se utilizo la clase para el ej5.
        // for(int i=0; i < 4; i++){
        //     Contador contador = new Contador("Ej3");
        //     contador.start();
        // }

        //Ejercicio 4
        // HiloNumerosLetras hilosNumerosLetras = new HiloNumerosLetras(2);
        // Thread hilosNumerosLetrasThread = new Thread(hilosNumerosLetras);
        // hilosNumerosLetrasThread.start();

        //Ejercicio 5
        for(int i=0; i < 4; i++){
            Contador contador = new Contador("Ej5." + i);
            contador.start();
        }

    }
}
