public class Main {
    public static void main(String[] args) {
        Comprobador c = new Comprobador();

        Primo p1 = new Primo(10, c);
        Primo p2 = new Primo(107, c);
      

        c.comprobar();
        c.detach(p2);
       

        System.out.println("----------------------");

        Factorial f1 = new Factorial(5, 120, c);

        c.comprobar();

        System.out.println("----------------------");

        MultiplodeOtro m1 = new MultiplodeOtro(3, 10, c);
        MultiplodeOtro m2 = new MultiplodeOtro(10, 100, c);

        c.comprobar();

    }
    
}
