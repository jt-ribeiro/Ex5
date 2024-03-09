/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio5;

/**
 *
 * @author volte
 */
public class Petroleiro extends Navio {
    private float capacidadeCarga;

    public Petroleiro(String matricula, String nome, float comprimento, float capacidadeCarga) {
        super(matricula, nome, comprimento);
        this.capacidadeCarga = capacidadeCarga;
    }

    public float getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(float capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }
}
