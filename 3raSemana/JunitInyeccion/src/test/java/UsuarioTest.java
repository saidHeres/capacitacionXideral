import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UsuarioTest {

    @Test
    void testRealizaConversion() {
        Usuario usuario = new Usuario('D', 10.5);
        usuario.setmyDivisa(new DivisaDolar());

        // Asegurarse de que no se produzca una excepción
        assertDoesNotThrow(() -> usuario.realizaConversion());
    }
}
