/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dato.en.arreglo;

/**
 *
 * @author Esteban
 */
public class DatoEnArreglo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] datos = new int[]{1,5,2,5,8,2,1,9};
        System.out.println("El dato existe en el arreglo?\n");
        System.out.println(determinarSiExiste(datos, 3));
    }
        public static boolean determinarSiExiste(int[] a, int d) {
        return determinarSiExiste(a, d, 0);
    }

    private static boolean determinarSiExiste(int[] a, int d, int contador) {
        if (d == a[contador]) {
            return true;
        } else if (contador == (a.length - 1)) {
            return false;
        } else {
            return determinarSiExiste(a, d, ++contador);
        }
    }
}
