package figurasGeometricas;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import java.util.Arrays;

public class figurasTest {
    @org.junit.Before
    public void setUp() throws Exception {
    }
    @Test
    public void cuadradoSePuedeMover(){
        //cuadrado se mueve desde (0,1) hacia (3,1)
        Cuadrado cuad1 = new Cuadrado(new Punto(1,0),"rojo",new Punto(4,2));
        System.out.println("Ubicacion actual: " + cuad1.getUbicacion());
        cuad1.mover(2,1);
        System.out.println("Ubicacion despues de moverse: "+ cuad1.getUbicacion());


    }

    @Test
    public void circuloSePuedeMover(){
        //circulo se mueve desde (1,0) hacia (-1,3)
        Circulo cir1 = new Circulo(new Punto(1,0),"verde",2);
        System.out.println("Ubicacion actual: " + cir1.getUbicacion());
        cir1.mover(-1,3);
        System.out.println("Ubicacion despues de moverse: "+ cir1.getUbicacion());


    }

    @Test
    public void pruebaFiguras(){
        Figure figs [] = new Figure[10];
        //cuadrados cuad1 y cuad2
        Cuadrado cuad1 = new Cuadrado(new Punto(1,0),"rojo",new Punto(4,2));
        Cuadrado cuad2 = new Cuadrado(new Punto(-2,1),"rojo",new Punto(0,4));
        figs[0] = cuad1;
        figs[1] = cuad2;
        //circulos cir1 y cir2
        Circulo cir1 = new Circulo(new Punto(1,0),"verde",2);
        Circulo cir2 = new Circulo(new Punto(-3,1),"rojo",4);
        figs[2] = cir1;
        figs[3] = cir2;
        //Rectangulos rect1, rect2 y rect3
        Rectangulo rect1 = new Rectangulo(new Punto(5,-3),"rosado",new Punto(1,-3));
        Rectangulo rect2 = new Rectangulo(new Punto(0,1),"negro",new Punto(2,4));
        Rectangulo rect3 = new Rectangulo(new Punto(-2,-3),"blanco",new Punto(-5,1));
        figs[4] = rect1;
        figs[5] = rect2;
        figs[6] = rect3;
        //Elipses eli1, eli2 y eli3
        Elipse eli1 = new Elipse(new Punto(1,0),"marron",2,5);
        Elipse eli2 = new Elipse(new Punto(-3,3),"fucsia",4,8);
        Elipse eli3 = new Elipse(new Punto(5,1),"celeste",1,3);
        figs[7] = eli1;
        figs[8] = eli2;
        figs[9] = eli3;
        System.out.println("Arreglo de Figuras sin ordenar por tamaño");
        for (int i = 0; i < figs.length; i++) {
            System.out.println(figs[i].getArea());
        }
        for(int i=0;i<(figs.length-1);i++){
            for(int j=i+1;j<figs.length;j++){
                if(figs[i].getArea()>figs[j].getArea()){
                    //Intercambiamos valores
                    Figure auxiliar=figs[i];
                    figs[i]=figs[j];
                    figs[j]=auxiliar;

                }
            }
        }
        System.out.println("Arreglo de Figuras ordenadas por tamaño");
        for (int i = 0; i < figs.length; i++) {
            System.out.println(figs[i].getArea());
        }

    }

}
