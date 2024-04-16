import tarifas.Producto;

public class Main {
    public static void main(String[] args) {

        Producto producto1 = new Producto("Producto A", 10000, 8,10);
        System.out.println("Detalles del producto:");
        System.out.println(producto1);

        double tarifaFinal = producto1.calcularTarifaFinal();
        System.out.println("Tarifa final del producto: $" + tarifaFinal);
    }
    }