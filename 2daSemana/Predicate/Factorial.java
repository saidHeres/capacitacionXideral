import java.util.function.Predicate;

public class Factorial extends Observer{
    
    int base;
    int fact;

    public Factorial(int base, int fact, Operaciones op){
        super(op);
        this.base = base;
        this.fact = fact;
    }

    Predicate<Integer> esFactorial = (numero) -> {
        if(base > fact){
            return false;
        }

        int aux=1;

        for (int i = 1; i <= base; i++) {
            aux *= i;
        }

        return fact == aux;
        
    };

    @Override
    void update(){
        boolean resultado = esFactorial.test(this.fact);
        System.out.println("El numero " + this.fact + " es el factorial de " + this.base 
        + "? : " + resultado);
    }

}
