public class Percusion extends Instrumento {
    public Percusion(String nom, String descri) {
        super(nom, descri);
    }

    @Override
    public void tocar() {
        System.out.println("Tocando instrumento percusion");
    }

}
