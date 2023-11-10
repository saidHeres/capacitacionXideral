public class DivisaDolar implements Divisa{

    double tipoDeCambio = 20;

    @Override
    public void conversion(double cantidad){
        System.out.println(" 1 USD -> MXP : " + tipoDeCambio + " pesos mex");
        System.out.println(cantidad + 
        " Dolares en pesos mexicanos son: " + (cantidad*tipoDeCambio) + "\n" );
    }
    
}
