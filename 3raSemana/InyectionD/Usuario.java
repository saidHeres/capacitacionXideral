public class Usuario {

    private char tipo;
    private double cantidad;
    private Divisa myDivisa;

    public Usuario(char tipo, double cantidad){
        this.tipo = tipo;
        this.cantidad = cantidad;
    }

    public Divisa getmyDivisa(){
        return myDivisa;
    }

    public void setmyDivisa(Divisa myDivisa){
        this.myDivisa = myDivisa;
    }

    public char getTipo(){
        return this.tipo;
    }

    void realizaConversion(){
        myDivisa.conversion(cantidad);
    }
}
