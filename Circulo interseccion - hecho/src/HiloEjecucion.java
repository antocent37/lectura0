public class HiloEjecucion {
    private boolean []datos = new boolean[3];
    public String metodo(int i, boolean valor){
        String salida = "";
        try{
            salida += datos[i];
            datos[i] =valor;
            salida += "OK";
        }catch (Exception e){
            salida += "Exception ";
        }finally{
            salida += "Finally";
        }
        salida += "--";
        return salida;
    }
    public static void main(String[] args){
        HiloEjecucion hilo = new HiloEjecucion();
        System.out.println(hilo.metodo(0,true));
        System.out.println(hilo.metodo(3,false));
    }
}
