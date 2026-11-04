public class inventario {
    public static int calcularSubtotal(int precio, int cantidad) {
        return precio * cantidad;
    }
    public static void main(String[] args) {
        int precio = 50;
        int cantidad = 4;    // TODO code application logic here
        int valorTotal = precio * cantidad;
        System.out.println("subtotal: " + valorTotal);
    }
}