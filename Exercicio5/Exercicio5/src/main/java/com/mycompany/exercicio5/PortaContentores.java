/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio5;

/**
 *
 * @author volte
 */
public class PortaContentores extends Navio {
    private int numeroMaximoContentores;

    public PortaContentores(String matricula, String nome, float comprimento, int numeroMaximoContentores) {
        super(matricula, nome, comprimento);
        this.numeroMaximoContentores = numeroMaximoContentores;
    }

    public int getNumeroMaximoContentores() {
        return numeroMaximoContentores;
    }

    public void setNumeroMaximoContentores(int numeroMaximoContentores) {
        this.numeroMaximoContentores = numeroMaximoContentores;
    }
}
