/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Selecionaveis.java
 *
 * Created on 30/09/2011, 21:34:14
 */

package padt7.aula2;

import java.util.Enumeration;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

/**
 *
 * @author david
 */
public class Selecionaveis extends javax.swing.JFrame {

    /** Creates new form Selecionaveis */
    public Selecionaveis() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        opcao1 = new javax.swing.JCheckBox();
        opcao2 = new javax.swing.JCheckBox();
        opcao3 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        opcao1.setText("Opção 1");

        opcao2.setText("Opção 2");

        opcao3.setText("Opção 3");

        jButton1.setText("Verificar Marcados");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Marcar Todos");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Desmarcar Todos");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Opção 1");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Opção 2");

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("Opção 3");

        buttonGroup2.add(jRadioButton4);
        jRadioButton4.setText("Outro 1");

        buttonGroup2.add(jRadioButton5);
        jRadioButton5.setText("Outro 2");

        buttonGroup2.add(jRadioButton6);
        jRadioButton6.setText("Outro 3");

        jButton4.setText("Verificar Marcados");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(28, 28, 28)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(44, 44, 44)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(opcao3)
                            .add(opcao2)
                            .add(opcao1))
                        .add(138, 138, 138)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(jRadioButton1)
                            .add(jRadioButton2)
                            .add(jRadioButton3))
                        .add(33, 33, 33)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(jRadioButton4)
                            .add(jRadioButton5)
                            .add(jRadioButton6))
                        .addContainerGap(73, Short.MAX_VALUE))
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(jButton3)
                            .add(jButton1)
                            .add(layout.createSequentialGroup()
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 13, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(jButton2)
                                .add(18, 18, 18)))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 134, Short.MAX_VALUE)
                        .add(jButton4)
                        .add(82, 82, 82))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .add(opcao1)
                .add(18, 18, 18)
                .add(opcao2)
                .add(18, 18, 18)
                .add(opcao3)
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jButton1)
                    .add(jButton4))
                .add(3, 3, 3)
                .add(jButton2)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jButton3)
                .add(38, 38, 38))
            .add(layout.createSequentialGroup()
                .add(62, 62, 62)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jRadioButton1)
                    .add(jRadioButton4))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jRadioButton2)
                    .add(jRadioButton5))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jRadioButton3)
                    .add(jRadioButton6))
                .addContainerGap(155, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        opcao1.setSelected(true);
        opcao2.setSelected(true);
        opcao3.setSelected(true);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        opcao1.setSelected(false);
        opcao2.setSelected(false);
        opcao3.setSelected(false);

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String mensagem = "As opções marcadas são: \n";

        if (opcao1.isSelected()) {
            mensagem += " - Opção 1\n";
        }

        if (opcao2.isSelected()) {
            mensagem += " - Opção 2\n";
        }

        if (opcao3.isSelected()) {
            mensagem += " - Opção 3\n";
        }

        JOptionPane.showMessageDialog(this, mensagem);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        String mensagem = "As opções marcadas são: \n";

        mensagem += verificaRadioButtons(buttonGroup1.getElements());
        mensagem += verificaRadioButtons(buttonGroup2.getElements());

        JOptionPane.showMessageDialog(this, mensagem);

    }//GEN-LAST:event_jButton4ActionPerformed

    private String verificaRadioButtons(Enumeration botoes) {
        String mensagem = "";

        while(botoes.hasMoreElements()) {
            JRadioButton botao = (JRadioButton) botoes.nextElement();
            if (botao.isSelected()) {
                mensagem += " - " + botao.getText() + "\n";
            }
        }

        return mensagem;
    }

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Selecionaveis().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JCheckBox opcao1;
    private javax.swing.JCheckBox opcao2;
    private javax.swing.JCheckBox opcao3;
    // End of variables declaration//GEN-END:variables

}