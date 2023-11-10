public class DivisaYuan implements Divisa {
    double tipoDeCambio = 5;

    @Override
    public double conversion(double cantidad) {
        System.out.println("1 CNY -> MXP : " + tipoDeCambio + " pesos mexicanos");
        System.out.println(cantidad + " Yuanes en pesos mexicanos son: " + (cantidad * tipoDeCambio) + "\n");

        return cantidad * tipoDeCambio;
    }
}