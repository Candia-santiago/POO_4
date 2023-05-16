/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//Hecho por Santiago Candia y Alejo García :)

package poo_4;

public class  Cliente extends Persona {
   int telefono ;
   int cantDesayuno;

    public Cliente(int telefono, int cantDesayuno, String nom) {
        super(nom);
        this.telefono = telefono;
        this.cantDesayuno = cantDesayuno;
    }
   
}
