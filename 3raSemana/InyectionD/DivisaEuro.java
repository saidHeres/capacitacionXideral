public class DivisaEuro implements Divisa {
    double tipoDeCambio = 22;

    @Override
    public void conversion(double cantidad) {
        System.out.println("1 EUR -> MXP : " + tipoDeCambio + " pesos mexicanos");
        System.out.println(cantidad + " Euros en pesos mexicanos son: " + (cantidad * tipoDeCambio) + "\n");
    }
}