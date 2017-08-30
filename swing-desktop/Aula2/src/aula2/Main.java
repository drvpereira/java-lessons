/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aula2;

/**
 *
 * @author david
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();

        StringBuilder texto = new StringBuilder("");

        for (int i = 0; i < 100000; i++) {
          texto.append("a");
        }

        long fim = System.currentTimeMillis();

        System.out.println((fim - inicio) + " ms");
    }

}
