import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class inventarioTest {
    @Test
    public void testCalcularSubtotal() {
        int precio = 50;
        int cantidad = 4;
        int expectedSubtotal = 200;
        int actualSubtotal = inventario.calcularSubtotal(precio, cantidad);
        assertEquals(expectedSubtotal, actualSubtotal);
    }
}