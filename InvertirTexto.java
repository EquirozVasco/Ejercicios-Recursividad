/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invertirtexto;

/**
 *
 * @author Esteban
 */
public class InvertirTexto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String texto = "Yvan eht nioj";
        System.out.println(invertirTexto(texto, texto.length()-1));
    }
     public static String invertirTexto (String texto, int longitud){
     
        if (longitud==0){
            return texto.charAt (longitud)+"";
        } else{
            return texto.charAt(longitud) + (invertirTexto(texto,longitud-1));
        }   
    }
}
