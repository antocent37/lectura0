public class DeViento extends Instrumento implements Afinar,Lustrar {
    String material;
    public DeViento(String nom, String descri, String material) {
        super(nom, descri);
        this.material = material;

    }
    public void setMaterial(String material1){
        this.material = material1;
    }

    @Override
    public void tocar() {
        System.out.println("Tocando instrumento de viento");
    }

    @Override
    public void afinadoAutomatico(Instrumento instru1) {
        System.out.println("Afinado automatico de instrumento de viento");
    }

    @Override
    public void afinadoManual(Instrumento instru2) {
        System.out.println("Afinado manual de instrumento de viento");
    }

    @Override
    public void lustrarMadera(Instrumento instru1) {
        if (this.material == "madera"){
            System.out.println("lustrado de instrumento de madera");
        }
    }

    @Override
    public void lustrarMetal(Instrumento instru2) {
        if (this.material == "metal"){
            System.out.println("lustrado de instrumento de metal");
        }
    }
}
