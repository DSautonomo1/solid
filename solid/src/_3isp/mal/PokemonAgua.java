/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _3isp.mal;

/**
 *
 * @author Palacios
 */
public class PokemonAgua extends Pokemon implements EntrenamientoPokemonAcuatico{

  
    
    /*Debido a que nuestra interfaz es muy general no podremos implementar este entrenamiento
    */
   

    @Override
    public void aprenderAtaqueCorte() {
        this.getMovimientos().add("Corte");
    }

    @Override
    public void aprenderAtaqueAgua() {
       this.getMovimientos().add("Agua");
    }
    
}
