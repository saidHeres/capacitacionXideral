public class Singleton {
    
    private static Singleton instancia;

    private Singleton() {}

    public static Singleton getinstancia() {
        if (instancia == null) {
            instancia = new Singleton();
        }
        return instancia;
    }

    public void mostrarMensaje() {
        System.out.println("Este es un Singleton");
    }
}
