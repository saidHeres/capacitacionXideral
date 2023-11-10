public class Inyector{
    static void inyectarConversion(Usuario user){
        if (user.getTipo() == 'D') {
            user.setmyDivisa(new DivisaDolar());
        }
        
        if (user.getTipo() == 'E') {
            user.setmyDivisa(new DivisaEuro());
        }

        if (user.getTipo() == 'Y') {
            user.setmyDivisa(new DivisaYuan());
        }
    }
}