//Ejemplo de Singleton - Said Hernandez 

public class Main {
    public static void main(String[] args) {

        Singleton singleton1 = Singleton.getinstancia();
        Singleton singleton2 = Singleton.getinstancia();

        //Comprobando que es el mismo objeto
        System.out.println("¿Son iguales? -> " + (singleton1 == singleton2));

        singleton1.mostrarMensaje();
        singleton2.mostrarMensaje();
    }


}