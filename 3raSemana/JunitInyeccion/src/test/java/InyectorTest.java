import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class InyectorTest {

    @Test
    void testInyectarConversion() {
        Usuario usuario = new Usuario('E', 10);
        Inyector.inyectarConversion(usuario);

        assertEquals(DivisaEuro.class, usuario.getmyDivisa().getClass(), 
                "La divisa debería ser de tipo DivisaEuro");
    }
}
