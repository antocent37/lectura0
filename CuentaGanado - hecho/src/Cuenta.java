public class Cuenta {
    //atributos
    public int valor;
    // constructor
    public static void main(String[] args) {
        Cuenta c = new Cuenta();
        c.mostrar();
        c.contar();
        c.mostrar();
        c.contar();
        c.mostrar();
        c.setear();
        c.mostrar();

    }
    //metodos
    public void contar(){
        this.valor++;
    }
    public void mostrar(){
        System.out.println(this.valor);
    }
    public void setear() {
        this.valor = 0;
    }
}
