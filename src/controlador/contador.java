/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;


public class contador {
    private static int contador;

    
    public contador(){
    this.contador=this.contador+1;
    }
    public static int getContador() {
        return contador;
    }

  

   
}
