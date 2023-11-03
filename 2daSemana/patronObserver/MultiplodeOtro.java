public class MultiplodeOtro extends Observer{
    int a;
    int b;

    public MultiplodeOtro(int a, int b, Operaciones op){
        super(op);
        this.a = a;
        this.b = b;
    }

    boolean comprobarMultiplo(){
        if (b%a == 0) {
            return true;
        }
        return false;
    }

    @Override
    void update(){
        System.out.println("El numero " + this.a + " es multiplo de " + this.b 
        + "? : " + comprobarMultiplo());
    }
}
