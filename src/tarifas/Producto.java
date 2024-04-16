package tarifas;

public class Producto {
    private String nombre;
    private double precio;
    private double iva;
    private double descuento;


    public String getNombre() {return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre;}
    public double getPrecio() {return precio; }
    public void setPrecio(double precio) { this.precio = precio; }
    public double getDescuento() { return descuento; }
    public double getIva() { return iva;}
    public void setIva(double iva) {this.iva = iva;}
    public void setDescuento(double descuento) {this.descuento = descuento;}

    public Producto(String nombre, double precio, double iva,double descuento) {
        this.nombre = nombre;
        this.precio = precio;
        this.iva = iva;
        this.descuento = descuento;
    }

    // Método para calcular la tarifa final
    public double calcularTarifaFinal() {
        double tarifaFinal = precio;
        // Aplicar descuento si es mayor que cero
        if (descuento > 0) {
            tarifaFinal -= precio * (descuento / 100);
            // Agregar el IVA
            tarifaFinal *= 1+(iva/100);
        }
        else {
            System.out.println("Descuento menor a cero");
            tarifaFinal *= 1+(iva/100);
        }
        return tarifaFinal;
    }


    // Método para imprimir los detalles del producto
    @Override
    public String toString() {
        return "Producto:" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", iva=" + iva +
                ", descuento=" + descuento;
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        Producto producto1 = new Producto("Producto A", 100, 10,10);
        System.out.println("Detalles del producto:");
        System.out.println(producto1);

        double tarifaFinal = producto1.calcularTarifaFinal();
        System.out.println("Tarifa final del producto: $" + tarifaFinal);
    }
}

