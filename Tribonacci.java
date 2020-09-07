/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tribonacci;

/**
 *
 * @author Esteban
 */
public class Tribonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        tribonacci(11);
    }
    
    private static void tribonacci(int n, int a, int b, int c) {

        if (n == 0) {
            return;
        } else {
            System.out.print(a + " ");
            tribonacci(n - 1, b, c, (a + b + c));
        }
    }
    public static void tribonacci(int n) {
        tribonacci(n, 0, 0, 1);
    }
}
