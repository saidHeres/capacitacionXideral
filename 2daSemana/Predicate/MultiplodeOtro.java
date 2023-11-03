import java.util.function.Predicate;

public class MultiplodeOtro extends Observer{
    int a;
    int b;

    public MultiplodeOtro(int a, int b, Operaciones op){
        super(op);
        this.a = a;
        this.b = b;
    }

    Predicate<Integer> esMultiplo = (numero) -> b % a == 0;

    @Override
    void update(){
        boolean resultado = esMultiplo.test(this.a);
        System.out.println("El numero " + this.a + " es multiplo de " + this.b 
        + "? : " + resultado);
    }
}
