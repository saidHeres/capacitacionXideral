// Ejemplo Polimorfismo con interfaces y clases abstractas

import java.util.ArrayList;
import java.util.List;

interface Animal {
    void emitirSonido();
}

abstract class Mamifero implements Animal {
    
    // Método abstracto a implementar
    public abstract void mover();
}

class Persona extends Mamifero {
    @Override
    public void emitirSonido() {
        System.out.println("Habla una persona.");
    }

    @Override
    public void mover() {
        System.out.println("La persona camina.");
    }
}

class Perro extends Mamifero {
    @Override
    public void emitirSonido() {
        System.out.println("Un perro ladra.");
    }

    @Override
    public void mover() {
        System.out.println("El perro corre.");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a1 = new Persona();
        Animal a2 = new Perro(); 
        Animal a3 = new Persona();
        Animal a4 = new Perro();
        
        List<Animal> animales = new ArrayList<>();

        animales.add(a1);
        animales.add(a2);
        animales.add(a3);
        animales.add(a4);

        for (Animal A : animales) {
            A.emitirSonido();
            if (A instanceof Mamifero) {
                ((Mamifero)A).mover();
            }
            System.out.println("----------");
        }
        
    }
}
