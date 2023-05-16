package poo_4;

//Hecho por Martín de Llano <3

import java.util.Scanner;

public class Pedido {
    Cliente c;

    public Pedido(Cliente c){
        this.c = c;     
        
    }
        int confir = 1;
        int cont = c.cantDesayuno;
    
    public int descuento(){
        
        Scanner teclado = new Scanner (System.in);

        while (confir==1){
            int precio = 1000;

            int precioFinal = precio * c.cantDesayuno; 
            if (cont>=11){
                int cantDescuento= c.cantDesayuno / 11;
                precioFinal= precioFinal - (cantDescuento * precio);
            }
            cont= cont - 11;
            System.out.println("quiere más desayunos?   1-si    2-no");
            confir = teclado.nextInt(); 
        }
        return precioFinal;
    }
    
    public void ticket(){
        System.out.println("Precio Final: " + descuento());
        System.out.println("Teléfono: " + c.telefono);
        System.out.println("Nombre del cliente: " + c.nom);
    }  
}
