package test;

import org.junit.Test;
import tarifas.Producto;

import static org.junit.Assert.*;

public class ProductTest {

    @Test
    public void testCalcularTarifaFinalSinDescuento() {
        Producto producto = new Producto("Producto A", 100, 10, 0);
        assertEquals(110.0, producto.calcularTarifaFinal(), 0.001);
    }

    @Test
    public void testCalcularTarifaFinalConDescuento() {
        Producto producto = new Producto("Producto B", 200, 10, 20);
        assertEquals(176.0, producto.calcularTarifaFinal(), 0.001);
    }

    @Test
    public void testCalcularTarifaFinalDescuentoNegativo() {
        Producto producto = new Producto("Producto C", 150, 10, -5);
        assertEquals(165.0, producto.calcularTarifaFinal(), 0.001);
    }

    @Test
    public void testCalcularTarifaFinalIvaCero() {
        Producto producto = new Producto("Producto D", 120, 0, 15);
        assertEquals(102.0, producto.calcularTarifaFinal(), 0.001);
    }

    @Test
    public void testCalcularTarifaFinalIvaNegativo() {
        Producto producto = new Producto("Producto E", 180, -5, 10);
        assertEquals(153.9, producto.calcularTarifaFinal(), 0.001);
    }
}

