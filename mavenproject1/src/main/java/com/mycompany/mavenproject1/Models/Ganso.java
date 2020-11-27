/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1.Models;

import javax.swing.JOptionPane;

/**
 *
 * @author CLIENTE
 */
public class Ganso extends Heroi {

    public Ganso(String nome, Integer vida, Integer stamina, Integer especial, String nomeImg) {
        super(nome, vida, stamina, especial, nomeImg);
    }

    
    public void atacarFisico(Heroi inimigo) {

        JOptionPane.showMessageDialog(null, "O PODEROSO GANSO ARRANCA A CABEÇA DE SEU INIMIGO COM UMA UNICA BICADA");
        inimigo.setVida(0);
    }

    public void atacarMagico(Heroi inimigo) {

        JOptionPane.showMessageDialog(null, "O PODEROSO GANSO TRANSFORMA SEU INIMIGO EM UM BURACO NEGRO");
        inimigo.setVida(0);
    }

    public void lancarEspecial(Heroi inimigo) {
        JOptionPane.showMessageDialog(null, "O PODEROSO GANSO APAGA SEU INIMIGO DA EXISTÊNCIA");
        inimigo.setVida(0);
    }

    
    public void descansar(Heroi inimigo) {
        JOptionPane.showMessageDialog(null, "O PODEROSO GANSO DESCANSA...  \n SENTADO EM CIMA DO CADAVER DE SEU INIMIGO");
        inimigo.setVida(0);
    }

}
