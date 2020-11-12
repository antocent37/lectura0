public class Cuerda extends Instrumento implements Afinar{
    public Cuerda(String nom, String descri) {
        super(nom, descri);
    }

    @Override
    public void tocar() {
        System.out.println("tocando instrumento de cuerda");
    }

    @Override
    public void afinadoAutomatico(Instrumento instru1) {
        System.out.println("Afinado automatico de instrumento de cuerda");
    }

    @Override
    public void afinadoManual(Instrumento instru2) {
        System.out.println("Afinado manual de instrumento de cuerda");
    }
}
