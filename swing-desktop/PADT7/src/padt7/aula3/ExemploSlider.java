/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ExemploSlider.java
 *
 * Created on 01/10/2011, 09:09:10
 */

package padt7.aula3;

import java.awt.Color;

/**
 *
 * @author david
 */
public class ExemploSlider extends javax.swing.JFrame {

    /** Creates new form ExemploSlider */
    public ExemploSlider() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        sliderVermelho = new javax.swing.JSlider();
        sliderVerde = new javax.swing.JSlider();
        sliderAzul = new javax.swing.JSlider();
        qtdVermelho = new javax.swing.JLabel();
        qtdVerde = new javax.swing.JLabel();
        qtdAzul = new javax.swing.JLabel();
        painelCores = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Vermelho:");

        jLabel2.setText("Verde:");

        jLabel3.setText("Azul:");

        sliderVermelho.setMaximum(255);
        sliderVermelho.setValue(0);
        sliderVermelho.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderVermelhoStateChanged(evt);
            }
        });

        sliderVerde.setMaximum(255);
        sliderVerde.setValue(0);
        sliderVerde.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderVerdeStateChanged(evt);
            }
        });

        sliderAzul.setMaximum(255);
        sliderAzul.setValue(0);
        sliderAzul.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderAzulStateChanged(evt);
            }
        });

        qtdVermelho.setText("0");

        qtdVerde.setText("0");

        qtdAzul.setText("0");

        painelCores.setBackground(new java.awt.Color(0, 0, 0));

        org.jdesktop.layout.GroupLayout painelCoresLayout = new org.jdesktop.layout.GroupLayout(painelCores);
        painelCores.setLayout(painelCoresLayout);
        painelCoresLayout.setHorizontalGroup(
            painelCoresLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 100, Short.MAX_VALUE)
        );
        painelCoresLayout.setVerticalGroup(
            painelCoresLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 100, Short.MAX_VALUE)
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .addContainerGap()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(jLabel2)
                            .add(jLabel1)
                            .add(jLabel3))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(sliderVermelho, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(qtdVermelho))
                            .add(layout.createSequentialGroup()
                                .add(sliderVerde, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(qtdVerde))
                            .add(layout.createSequentialGroup()
                                .add(sliderAzul, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(qtdAzul))))
                    .add(layout.createSequentialGroup()
                        .add(137, 137, 137)
                        .add(painelCores, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(23, 23, 23)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel1)
                    .add(sliderVermelho, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(qtdVermelho))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel2)
                    .add(sliderVerde, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(qtdVerde))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(qtdAzul)
                    .add(sliderAzul, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel3))
                .add(18, 18, 18)
                .add(painelCores, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sliderVermelhoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderVermelhoStateChanged

        slidersStateChanged();
        
    }//GEN-LAST:event_sliderVermelhoStateChanged

    private void sliderVerdeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderVerdeStateChanged

        slidersStateChanged();

    }//GEN-LAST:event_sliderVerdeStateChanged

    private void sliderAzulStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderAzulStateChanged

        slidersStateChanged();

    }//GEN-LAST:event_sliderAzulStateChanged

    private void slidersStateChanged() {
        int vermelho = sliderVermelho.getValue();
        int verde = sliderVerde.getValue();
        int azul = sliderAzul.getValue();

        Color novaCor = new Color(vermelho, verde, azul);
        painelCores.setBackground(novaCor);
        
        qtdVermelho.setText(String.valueOf(vermelho));
        qtdVerde.setText(String.valueOf(verde));
        qtdAzul.setText(String.valueOf(azul));
    }

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExemploSlider().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel painelCores;
    private javax.swing.JLabel qtdAzul;
    private javax.swing.JLabel qtdVerde;
    private javax.swing.JLabel qtdVermelho;
    private javax.swing.JSlider sliderAzul;
    private javax.swing.JSlider sliderVerde;
    private javax.swing.JSlider sliderVermelho;
    // End of variables declaration//GEN-END:variables

}
