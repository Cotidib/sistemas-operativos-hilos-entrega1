public class HiloNumerosLetras implements Runnable{
    private int tipo;
    public HiloNumerosLetras(int tipo){
        this.tipo = tipo;
    }

    @Override
    public void run(){
        String mostrar = "";
        if (tipo == 1){
            for(int i=1; i <= 30; i++){
                mostrar += i + " ";
            }
        } else if (tipo == 2){
            for(char i='A'; i <= 'Z'; ++i){
                mostrar += i + " ";
            }
        }
        System.out.println(mostrar);
    } 
}
