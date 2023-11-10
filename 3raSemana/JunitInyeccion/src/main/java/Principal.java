public class Principal {
    public static void main(String[] args) {
        Usuario u1 = new Usuario('D',10.5);
        Usuario u2 = new Usuario('E',10);
        Usuario u3 = new Usuario('Y',10);

        Inyector.inyectarConversion(u1);
        Inyector.inyectarConversion(u2);
        Inyector.inyectarConversion(u3);

        u1.realizaConversion();
        u2.realizaConversion();
        u3.realizaConversion();
    }
}
