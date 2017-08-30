/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package primeirajanela;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Main extends JFrame {

    private JButton botao;

    public Main() {
        setSize(400, 300);
        setVisible(true);
        setTitle("Testando o Swing!");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        botao = new JButton("Meu primeiro botão");
        botao.setBounds(20, 20, 200, 30);
        botao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Teste!");
            }
        });
        
        add(botao);
    }

    public static void main(String[] args) {
        new Main();
    }

}
