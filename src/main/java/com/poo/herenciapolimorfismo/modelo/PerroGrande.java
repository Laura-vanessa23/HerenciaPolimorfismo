/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.poo.herenciapolimorfismo.modelo;

/**
 *
 * @author Estudiante
 */
public class PerroGrande  extends Perro {
    private int pesoKg ;

    public PerroGrande(int pesoKg, int edad, String raza, String nombre) {
        super(edad, raza, nombre);
        this.pesoKg = pesoKg;
    }

    public int getPesoKg() {
        return pesoKg;
    }
    
    @Override
  public void hacerSonido() {
    
    System.out.println(super.getNombre()+ " hace ¡¡GUAU!!");
  }
    
}
