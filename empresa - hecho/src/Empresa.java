import java.util.Arrays;

public class Empresa {
    int cuit;
    String razonSocial;
    Empleado [] empleados;

    public Empresa(int cuit, String razonSocial, Empleado [] e) {
        this.cuit = cuit;
        this.razonSocial = razonSocial;
        this.empleados = e;
    }
    public static void main(String [] args){
        Empleado temp1 = new Temporal(true,0,80);
        Empleado perm1 = new Permanente(true,2,80,6);
        Empleado perm2 = new Permanente(false,0,160,4);
        Empleado ger1 = new Gerente(true,1,160,10);
        Empleado empleados [] = {temp1,perm1,perm2,ger1};
        Empresa emp1 = new Empresa(27203214,"LR Centurion",empleados);
        emp1.getListarSueldos();
        System.out.println("monto requerido pago total empleados: $" + emp1.getmontoTotal());

    }
    public void getListarSueldos() {
        double aux = 0;
        for (int i = 0; i < empleados.length; i++) {
            System.out.println(empleados[i].getSalario());

        }
    }
    public double getmontoTotal(){
        double aux = 0;
        for (int i = 0; i < empleados.length; i++) {
            aux += empleados[i].getSalario();

        }
        return aux;
    }
}
