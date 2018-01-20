/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gustavo De Leon 17085
 * @author Luis Esturban 17256
 * Algoritmos y Estructura de Datos
 * 19/01/2018
 */
public class GUI extends javax.swing.JFrame {
    private Radio rad;
    private String eFrec="";
    private String frecA = "";

    /** Creates new form GUI */
    public GUI() {
        initComponents();
        rad = new Radio();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnON = new javax.swing.JButton();
        btnOFF = new javax.swing.JButton();
        tfEstacion = new javax.swing.JTextField();
        btnAtras = new javax.swing.JButton();
        btnAdelante = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn10 = new javax.swing.JButton();
        btn11 = new javax.swing.JButton();
        btn12 = new javax.swing.JButton();
        btnAM = new javax.swing.JButton();
        btnFM = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tfLugar = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnON.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnON.setText("ON");
        btnON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnONActionPerformed(evt);
            }
        });
        getContentPane().add(btnON, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, 40));

        btnOFF.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnOFF.setText("OFF");
        btnOFF.setEnabled(false);
        btnOFF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOFFActionPerformed(evt);
            }
        });
        getContentPane().add(btnOFF, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 60, 40));

        tfEstacion.setEditable(false);
        tfEstacion.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        tfEstacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfEstacionActionPerformed(evt);
            }
        });
        getContentPane().add(tfEstacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 120, 40));

        btnAtras.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnAtras.setText("<");
        btnAtras.setEnabled(false);
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 60, 40));

        btnAdelante.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnAdelante.setText(">");
        btnAdelante.setEnabled(false);
        btnAdelante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdelanteActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdelante, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 60, 40));

        btn1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn1.setText("1");
        btn1.setEnabled(false);
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 60, -1));

        btn2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn2.setText("2");
        btn2.setEnabled(false);
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 60, -1));

        btn3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn3.setText("3");
        btn3.setEnabled(false);
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        getContentPane().add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 60, -1));

        btn4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn4.setText("4");
        btn4.setEnabled(false);
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        getContentPane().add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 60, -1));

        btn5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn5.setText("5");
        btn5.setEnabled(false);
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        getContentPane().add(btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 60, -1));

        btn6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn6.setText("6");
        btn6.setEnabled(false);
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        getContentPane().add(btn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, 60, -1));

        btn7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn7.setText("7");
        btn7.setEnabled(false);
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        getContentPane().add(btn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 60, 40));

        btn8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn8.setText("8");
        btn8.setEnabled(false);
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        getContentPane().add(btn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 60, 40));

        btn9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn9.setText("9");
        btn9.setEnabled(false);
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        getContentPane().add(btn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 60, 40));

        btn10.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btn10.setText("10");
        btn10.setEnabled(false);
        btn10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn10ActionPerformed(evt);
            }
        });
        getContentPane().add(btn10, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 60, 40));

        btn11.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btn11.setText("11");
        btn11.setEnabled(false);
        btn11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn11ActionPerformed(evt);
            }
        });
        getContentPane().add(btn11, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, 60, 40));

        btn12.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btn12.setText("12");
        btn12.setEnabled(false);
        btn12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn12ActionPerformed(evt);
            }
        });
        getContentPane().add(btn12, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, 60, 40));

        btnAM.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnAM.setText("AM");
        btnAM.setEnabled(false);
        btnAM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAMActionPerformed(evt);
            }
        });
        getContentPane().add(btnAM, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 180, 40));

        btnFM.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnFM.setText("FM");
        btnFM.setEnabled(false);
        btnFM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFMActionPerformed(evt);
            }
        });
        getContentPane().add(btnFM, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 180, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Ingrese el numero en el cual \ndesea guardar la estacion ");
        jLabel1.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, 20));

        tfLugar.setEditable(false);
        tfLugar.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        tfLugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfLugarActionPerformed(evt);
            }
        });
        getContentPane().add(tfLugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 180, 50));

        btnGuardar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setEnabled(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 180, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOFFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOFFActionPerformed
        // TODO add your handling code here:
        rad.apagar();
        tfEstacion.setText("");
        btn1.setEnabled(false);
        btn2.setEnabled(false);
        btn3.setEnabled(false);
        btn4.setEnabled(false);
        btn5.setEnabled(false);
        btn6.setEnabled(false);
        btn7.setEnabled(false);
        btn8.setEnabled(false);
        btn9.setEnabled(false);
        btn10.setEnabled(false);
        btn11.setEnabled(false);
        btn12.setEnabled(false);
        btnAdelante.setEnabled(false);
        btnAtras.setEnabled(false);
        btnFM.setEnabled(false);
        btnAM.setEnabled(false);
        btnGuardar.setEnabled(false);
        btnOFF.setEnabled(false);
        btnON.setEnabled(true);
        tfLugar.setEnabled(false);
        tfEstacion.setEnabled(false);
   
        
        
    }//GEN-LAST:event_btnOFFActionPerformed

    private void btnONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnONActionPerformed
        // TODO add your handling code here:
        rad.prender();
        tfEstacion.setText(rad.cambioFrecuencia());
        btn1.setEnabled(true);
        btn2.setEnabled(true);
        btn3.setEnabled(true);
        btn4.setEnabled(true);
        btn5.setEnabled(true);
        btn6.setEnabled(true);
        btn7.setEnabled(true);
        btn8.setEnabled(true);
        btn9.setEnabled(true);
        btn10.setEnabled(true);
        btn11.setEnabled(true);
        btn12.setEnabled(true);
        btnAdelante.setEnabled(true);
        btnAtras.setEnabled(true);
        btnFM.setEnabled(true);
        btnAM.setEnabled(true);
        btnGuardar.setEnabled(true);
        btnOFF.setEnabled(true);
        btnON.setEnabled(false);
         tfLugar.setEnabled(true);
        tfEstacion.setEnabled(true);
    }//GEN-LAST:event_btnONActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
        //rad.setFrecA(frecA);
        String est = rad.obtenerEstacion(1);
        tfEstacion.setText(est);
        
    }//GEN-LAST:event_btn1ActionPerformed

    private void btnAdelanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdelanteActionPerformed
        // TODO add your handling code here:
        tfEstacion.setText(rad.frecAdelante());
    }//GEN-LAST:event_btnAdelanteActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        // TODO add your handling code here:
        tfEstacion.setText(rad.frecAtras());
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnFMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFMActionPerformed
        // TODO add your handling code here:
         eFrec="FM";
         rad.setEFrec(eFrec);
         tfEstacion.setText(rad.cambioFrecuencia());
    }//GEN-LAST:event_btnFMActionPerformed

    private void btnAMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAMActionPerformed
        eFrec="AM";   
        rad.setEFrec(eFrec);
        tfEstacion.setText(rad.cambioFrecuencia());
    }//GEN-LAST:event_btnAMActionPerformed

    private void tfEstacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfEstacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfEstacionActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        
        frecA = tfEstacion.getText();
        rad.setFrecA(frecA);
        rad.guardarEstacionActual(Integer.parseInt(tfLugar.getText()));
         
         //System.out.println(Integer.parseInt(jButton19.getText()));
       
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void tfLugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfLugarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfLugarActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
            // TODO add your handling code here:
        /*rad.setFrecA(frecA);
        System.out.println(rad.mostrarEstacion());
        //System.out.println("esta debe ser la fecuencia actual"+frecA);
        tfEstacion.setText(rad.mostrarEstacion()); */
        
        String est = rad.obtenerEstacion(2);
        tfEstacion.setText(est);
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        // TODO add your handling code here:
        String est = rad.obtenerEstacion(3);
        tfEstacion.setText(est);
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        // TODO add your handling code here:
        String est = rad.obtenerEstacion(4);
        tfEstacion.setText(est);
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        // TODO add your handling code here:
        String est = rad.obtenerEstacion(5);
        tfEstacion.setText(est);
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        // TODO add your handling code here:
        String est = rad.obtenerEstacion(6);
        tfEstacion.setText(est);
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        // TODO add your handling code here:
        String est = rad.obtenerEstacion(7);
        tfEstacion.setText(est);
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        // TODO add your handling code here:
        String est = rad.obtenerEstacion(8);
        tfEstacion.setText(est);
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        // TODO add your handling code here:
        String est = rad.obtenerEstacion(9);
        tfEstacion.setText(est);
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn10ActionPerformed
        // TODO add your handling code here:
        String est = rad.obtenerEstacion(10);
        tfEstacion.setText(est);
    }//GEN-LAST:event_btn10ActionPerformed

    private void btn11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn11ActionPerformed
        // TODO add your handling code here:
        String est = rad.obtenerEstacion(11);
        tfEstacion.setText(est);
    }//GEN-LAST:event_btn11ActionPerformed

    private void btn12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn12ActionPerformed
        // TODO add your handling code here:
        String est = rad.obtenerEstacion(12);
        tfEstacion.setText(est);
    }//GEN-LAST:event_btn12ActionPerformed
    
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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn10;
    private javax.swing.JButton btn11;
    private javax.swing.JButton btn12;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnAM;
    private javax.swing.JButton btnAdelante;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnFM;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnOFF;
    private javax.swing.JButton btnON;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField tfEstacion;
    private javax.swing.JTextField tfLugar;
    // End of variables declaration//GEN-END:variables

}
