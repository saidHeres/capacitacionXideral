import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class DivisaDolarTest {

    @Test
    void testConversion() {
        DivisaDolar divisaDolar = new DivisaDolar();
        double cantidad = 5.0;

        // Asegurarse de que la conversión es correcta
        assertEquals(5.0 * divisaDolar.tipoDeCambio, 
        divisaDolar.conversion(cantidad));
    }
}
