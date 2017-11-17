/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _1ocp.mal;

/**
 *
 * @author Israel
 */
public class AtaqueAire implements Ataque {

    private double danio = 0.80;
    @Override
    public double danioAtaque() {
        return this.danio;
    }
    
}
