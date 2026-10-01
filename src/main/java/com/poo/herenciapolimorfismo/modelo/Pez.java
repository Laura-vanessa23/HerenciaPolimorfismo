/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poo.herenciapolimorfismo.modelo;

/**
 *
 * @author Estudiante
 */
public class Pez extends Animal {
    private int profundidad;
    
    public Pez(String nombre) {
        super(nombre);
         this.profundidad = 0;
    }
       public Pez() {
        super("sofio");
    }
       
   public void nadar() {
    profundidad =+ 10;
    System.out.println(super.getNombre()+ " esta a la profundidad de :" + profundidad);
  }
       
  @Override
  public void hacerSonido() {
    
    System.out.println(super.getNombre()+ " hace glu glu!");
  }
  
   public void Comer(int concentrado) {
    
    System.out.println(super.getNombre()+ " come" + concentrado + "concentrado de alimento");
  }
}
    

