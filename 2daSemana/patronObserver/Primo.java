public class Primo extends Observer {

    int num;

    public Primo(int num, Operaciones op){
        super(op);
        this.num = num;
    }

    boolean comprobarPrimo(){
        for (int i = 2; i < this.num; i++) {
            if (this.num % i == 0) {
                return false;
            }
        }
        return true; 
    }

    @Override
    void update(){
        System.out.println("El numero "+ this.num+ " es primo? : " 
        + comprobarPrimo());
    }
    
}
