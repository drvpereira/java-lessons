/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package padt7.aula1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author david
 */
public class Main extends JFrame {

    private JButton botao;

    public Main() {
        setSize(300, 200);
        setTitle("Minha primeira janela em Java");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        botao = new JButton();
        botao.setText("Clique aqui!");
        botao.setBounds(20, 20, 100, 30);

        // Anonymous Inner Class
        botao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                System.out.println("Botão funcionando!");
            }
        });
        
        setLayout(null);
        add(botao);
        setVisible(true);
    }

    public static void main(String[] args) {

        new Main();

    }

}
