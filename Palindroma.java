/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindroma;

/**
 *
 * @author Esteban
 */
public class Palindroma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Verificar palíndromo: \n");
        System.out.println(verificarPalindromo("juan"));
    }
    public static boolean verificarPalindromo(String s) {

        if (s.length() == 1 || s.length() == 0) {
            return true;
        } else if (s.charAt(0) != s.charAt(s.length() - 1)) {
            return false;
        } else {
            s = s.substring(1);
            s = s.substring(0, s.length() - 1);
            return verificarPalindromo(s);
        }
    }
}
