package poo_4;

//Hecho por Santiago Candia y Alejo García :)

public class Desayuno {
    Cliente nom;
    Pedido precio;

    public Desayuno(Cliente nom, String tipo, Pedido precio) {
        this.nom = nom;
        this.precio = precio;
    }
    public static void mostrarDatos (Cliente nom, double precio){
        System.out.println("nombre: " + nom);
        System.out.println("costo: " + precio);
    }
}
