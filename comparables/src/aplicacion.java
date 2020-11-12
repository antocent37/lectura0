import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class aplicacion {
    public static void main(String[] args){
        Persona p1 = new Persona("Mario" ,187 , 22);
        Persona p2 = new Persona("Pepe" , 173 , 52);
        Persona p3 = new Persona("David" ,158 , 27);
        Persona p4 = new Persona("Manuel" , 164 , 25);
        Persona p5 = new Persona("Alberto", 184, 80);
        ArrayList<Persona> personas = new ArrayList<>();
        personas.add(p1);
        personas.add(p2);
        personas.add(p3);
        personas.add(p4);
        personas.add(p5);
        Collections.sort(personas);
       // Collections.reverse(personas);
        for (Persona p: personas) {
            System.out.println(p);

        }
    }
}
