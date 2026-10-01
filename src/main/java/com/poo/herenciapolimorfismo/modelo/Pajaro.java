/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poo.herenciapolimorfismo.modelo;

/**
 *
 * @author Estudiante
 */
public class Pajaro extends Animal {
    private int altura;
    
     public Pajaro(String nombre) {
        super(nombre);
        this.altura = 0;
    }
       public Pajaro() {
        super("canario");
    }
       
    public void volar() {
    altura=+10;
    System.out.println(super.getNombre()+ " esta a la altura  de :" + altura + "metros");
  }  
    
    @Override
  public void hacerSonido() {
    
    System.out.println(super.getNombre()+ " hace cocoroco!");
  }

    
    
}
