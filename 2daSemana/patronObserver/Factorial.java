public class Factorial extends Observer{
    
    int base;
    int fact;

    public Factorial(int base, int fact, Operaciones op){
        super(op);
        this.base = base;
        this.fact = fact;
    }

    boolean comprobarFactorial(){
        //si fact es mayor a base se descarta desde un inicio la comprobacion
        if(base > fact)
            return false;

        int aux=1;
        for (int i = 1; i <= base; i++) {
            aux *= i;
        }
        if (aux == fact) {
            return true;
        }else
        return false;

    }

    @Override
    void update(){
        System.out.println("El numero " + this.fact + " es el factorial de " + this.base 
        + "? : " + comprobarFactorial());
    }

}
