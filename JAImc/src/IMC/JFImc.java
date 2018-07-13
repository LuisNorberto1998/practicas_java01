/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IMC;

import javax.swing.JOptionPane;

/**
 *
 * @author Norberto
 */
public class JFImc extends javax.swing.JFrame {

    /**
     * Creates new form JFImc
     */
    public JFImc() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanelPeso = new javax.swing.JPanel();
        jTextFieldPeso = new javax.swing.JTextField();
        jPanelAltura = new javax.swing.JPanel();
        jTextFieldAltura = new javax.swing.JTextField();
        jPanelSexo = new javax.swing.JPanel();
        jComboBoxSexo = new javax.swing.JComboBox<>();
        jButtonCalcular = new javax.swing.JButton();
        jLabelTabla = new javax.swing.JLabel();
        jPanelVistaPrevia = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaImprimir = new javax.swing.JTextArea();
        jButtonBorrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Indice de Masa Corporal");
        setBackground(new java.awt.Color(204, 255, 204));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jPanelPeso.setBackground(new java.awt.Color(153, 153, 255));
        jPanelPeso.setBorder(javax.swing.BorderFactory.createTitledBorder("Peso (Kilogramos)"));

        javax.swing.GroupLayout jPanelPesoLayout = new javax.swing.GroupLayout(jPanelPeso);
        jPanelPeso.setLayout(jPanelPesoLayout);
        jPanelPesoLayout.setHorizontalGroup(
            jPanelPesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPesoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextFieldPeso, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelPesoLayout.setVerticalGroup(
            jPanelPesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPesoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextFieldPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelAltura.setBackground(new java.awt.Color(153, 153, 255));
        jPanelAltura.setBorder(javax.swing.BorderFactory.createTitledBorder("Altura (Centimetros)"));

        jTextFieldAltura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAlturaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelAlturaLayout = new javax.swing.GroupLayout(jPanelAltura);
        jPanelAltura.setLayout(jPanelAlturaLayout);
        jPanelAlturaLayout.setHorizontalGroup(
            jPanelAlturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAlturaLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jTextFieldAltura, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelAlturaLayout.setVerticalGroup(
            jPanelAlturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAlturaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextFieldAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanelSexo.setBackground(new java.awt.Color(153, 153, 255));
        jPanelSexo.setBorder(javax.swing.BorderFactory.createTitledBorder("Sexo"));

        jComboBoxSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Femenino", "Masculino" }));
        jComboBoxSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSexoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelSexoLayout = new javax.swing.GroupLayout(jPanelSexo);
        jPanelSexo.setLayout(jPanelSexoLayout);
        jPanelSexoLayout.setHorizontalGroup(
            jPanelSexoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSexoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboBoxSexo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelSexoLayout.setVerticalGroup(
            jPanelSexoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSexoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboBoxSexo, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButtonCalcular.setText("Calcular");
        jButtonCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalcularActionPerformed(evt);
            }
        });

        jLabelTabla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/tabla.jpg"))); // NOI18N

        jPanelVistaPrevia.setBackground(new java.awt.Color(153, 153, 255));
        jPanelVistaPrevia.setBorder(javax.swing.BorderFactory.createTitledBorder("Vista Previa"));

        jTextAreaImprimir.setEditable(false);
        jTextAreaImprimir.setColumns(20);
        jTextAreaImprimir.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextAreaImprimir.setRows(5);
        jScrollPane1.setViewportView(jTextAreaImprimir);

        javax.swing.GroupLayout jPanelVistaPreviaLayout = new javax.swing.GroupLayout(jPanelVistaPrevia);
        jPanelVistaPrevia.setLayout(jPanelVistaPreviaLayout);
        jPanelVistaPreviaLayout.setHorizontalGroup(
            jPanelVistaPreviaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelVistaPreviaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelVistaPreviaLayout.setVerticalGroup(
            jPanelVistaPreviaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
        );

        jButtonBorrar.setText("Borrar");
        jButtonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBorrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanelSexo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanelAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanelPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanelVistaPrevia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelTabla)
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanelVistaPrevia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 26, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanelPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanelAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanelSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxSexoActionPerformed

    private void jTextFieldAlturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAlturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAlturaActionPerformed

    private void jButtonCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCalcularActionPerformed
        try {
            double peso;
            double altura;
            double alturaMetros;
            String imcr = null;
            String estado = null;
            String sex = null;
            peso = Double.parseDouble(this.jTextFieldPeso.getText());
            altura = Double.parseDouble(this.jTextFieldAltura.getText());

            if (peso == 0 || altura == 0) {
                JOptionPane.showMessageDialog(this, "Error: No se puede dividir entre 0");
            } else if (peso < 0 || altura < 0) {
                JOptionPane.showMessageDialog(this, "Error: Solo se aceptan numeros positivos");
            } else if ((altura > 0 && altura < 50) || (altura > 280) || (peso > 0 && peso < 20) || (peso > 700)) {
                JOptionPane.showMessageDialog(this, "Error: Ingresa las medidas correctas \nAltura en centimetros\n Peso en Kilogramos\n ");
            } else {
                alturaMetros = altura / 100;
                double imc = peso / Math.pow(alturaMetros, 2);

                switch (jComboBoxSexo.getSelectedIndex()) {
                    case 0:
                        sex = "Femenino";
                        if (imc < 19) {
                            imcr = "Desnutricion";
                        } else if (imc >= 19 && imc < 24) {
                            imcr = "Normal";
                        } else if (imc >= 24 && imc < 27) {
                            imcr = "Sobrepeso";
                        } else if (imc >= 27 && imc < 32) {
                            imcr = "Obesidad";
                        } else if (imc >= 32) {
                            imcr = "Obesidad Grave";
                        }
                        break;

                    case 1:
                        sex = "Masculino";
                        if (imc < 20) {
                            imcr = "Desnutricion";
                        } else if (imc >= 20 && imc < 24.9) {
                            imcr = "Normal";
                        } else if (imc >= 25 && imc < 29.9) {
                            imcr = "Sobrepeso";
                        } else if (imc >= 30 && imc < 40) {
                            imcr = "Obesidad";
                        } else if (imc >= 40) {
                            imcr = "Obesidad Grave";
                        }
                        break;
                }
                estado = "\nEstado de IMC: " + imcr + "\n\nIndice de Masa Corporal: " + (String.format("%.2f", imc)) + "\n\nSexo: " + sex;
                jTextAreaImprimir.setText(estado);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: Solo se pueden ingresar valores numericos");
        }

    }//GEN-LAST:event_jButtonCalcularActionPerformed

    private void jButtonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBorrarActionPerformed
        jTextAreaImprimir.setText(null);
    }//GEN-LAST:event_jButtonBorrarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFImc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFImc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFImc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFImc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFImc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBorrar;
    private javax.swing.JButton jButtonCalcular;
    private javax.swing.JComboBox<String> jComboBoxSexo;
    private javax.swing.JLabel jLabelTabla;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanelAltura;
    private javax.swing.JPanel jPanelPeso;
    private javax.swing.JPanel jPanelSexo;
    private javax.swing.JPanel jPanelVistaPrevia;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaImprimir;
    private javax.swing.JTextField jTextFieldAltura;
    private javax.swing.JTextField jTextFieldPeso;
    // End of variables declaration//GEN-END:variables
}
