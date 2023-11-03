import java.util.function.Predicate;

public class Primo extends Observer {

    int num;

    public Primo(int num, Operaciones op){
        super(op);
        this.num = num;
    }

    Predicate<Integer> esPrimo = (numero) -> {
        for (int i = 2; i < numero; i++) {
            if (numero%i==0) {
                return false;
            }
        }
        return true;
    };

    @Override
    void update(){
        boolean resultado = esPrimo.test(this.num);
        System.out.println("El numero "+ this.num+ " es primo? : " 
        + resultado);
    }
    
}
