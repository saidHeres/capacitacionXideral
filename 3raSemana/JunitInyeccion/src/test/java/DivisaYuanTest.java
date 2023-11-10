import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DivisaYuanTest {

    @Test
    void testConversion() {
        DivisaYuan divisaYuan = new DivisaYuan();
        double cantidad = 7.0;

        // Asegurarse de que la conversión es correcta
        assertEquals(7.0 * divisaYuan.tipoDeCambio, divisaYuan.conversion(cantidad));
    }
}
