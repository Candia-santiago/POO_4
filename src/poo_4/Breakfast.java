
package poo_4;

import java.util.Scanner;



public class Breakfast {
    
    
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        System.out.println("cual es tu nombre");
        String nombre = teclado.nextLine();
        Persona persona = new Persona(nombre);
        System.out.println("ingrese su telefono");
        int telefono=teclado.nextInt();
        System.out.println("cuantos desayunos va a pedir ?");
        int cantDesayunos=teclado.nextInt();     
        Cliente cliente= new Cliente(telefono,cantDesayunos,nombre);
        Pedido p = new Pedido(cliente);
        p.ticket();
    }
    
}