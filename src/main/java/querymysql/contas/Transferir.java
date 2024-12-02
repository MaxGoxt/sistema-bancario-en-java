package querymysql.contas;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class Transferir extends javax.swing.JFrame {

    private Integer id;
    private Double saldo;
    private Dashboard dash;

    public Transferir(Integer id, Double saldo, Dashboard dash) {
        initComponents();
        this.id = id;
        this.saldo = saldo;
        this.dash = dash;
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.cantErr.setVisible(false);
        this.setDefaultCloseOperation(1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Confirm = new javax.swing.JButton();
        Cancel = new javax.swing.JButton();
        TranferirLabel = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        cantLabel = new javax.swing.JLabel();
        cant = new javax.swing.JTextField();
        emailErr = new javax.swing.JLabel();
        cantErr = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Transferir");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        Confirm.setBackground(new java.awt.Color(76, 0, 0));
        Confirm.setForeground(new java.awt.Color(255, 255, 255));
        Confirm.setText("Tranferir");
        Confirm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ConfirmMouseClicked(evt);
            }
        });

        Cancel.setBackground(new java.awt.Color(102, 102, 102));
        Cancel.setForeground(new java.awt.Color(255, 255, 255));
        Cancel.setText("Cancelar");
        Cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CancelMouseClicked(evt);
            }
        });

        TranferirLabel.setText("Transferir a:");

        email.setBackground(new java.awt.Color(255, 255, 255));
        email.setText("email@email.com");
        email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emailFocusGained(evt);
            }
        });

        cantLabel.setText("Cant:");

        cant.setBackground(new java.awt.Color(255, 255, 255));
        cant.setText("000");
        cant.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cantFocusGained(evt);
            }
        });

        emailErr.setForeground(new java.awt.Color(255, 0, 0));
        emailErr.setText("Error");

        cantErr.setForeground(new java.awt.Color(255, 0, 0));
        cantErr.setText("Error");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Cancel))
                    .addComponent(email)
                    .addComponent(TranferirLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cant)
                    .addComponent(cantLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(emailErr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cantErr, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(TranferirLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailErr)
                .addGap(18, 18, 18)
                .addComponent(cantLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cantErr)
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cancel)
                    .addComponent(Confirm))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ConfirmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConfirmMouseClicked
        try {
            Double cantidad = Double.parseDouble(this.cant.getText());

            if (!this.checkEmail()) {
                return;
            }

            if (this.saldo - cantidad < 0) {
                JOptionPane.showMessageDialog(null, "Saldo insuficiente", "Error!", 0);
                return;
            }

            if (dash.getEmail().equals(this.email.getText())) {
                JOptionPane.showMessageDialog(null, "Operación no permitida", "Error!", 0);
                return;
            }

            String res = DataBase.tranferir(id, email.getText(), cantidad);
            if (res == "ok") {
                JOptionPane.showMessageDialog(null, "Transferencia realizada", " ", 2);
                this.saldo -= cantidad;
                this.dash.setSaldo(this.saldo);
                this.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(null, "Ocurrió un problema", "Error!", 0);
            }
        } catch (NumberFormatException e) {
            this.cantErr.setText("La cantidad de tener valor numerico");
            this.cantErr.setVisible(true);
        } catch (Throwable e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Ocurrió un problema", "Error!", 0);
        }
    }//GEN-LAST:event_ConfirmMouseClicked

    private void CancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_CancelMouseClicked

    private void emailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFocusGained
        this.email.setText("");
        this.emailErr.setVisible(false);
    }//GEN-LAST:event_emailFocusGained

    private void cantFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cantFocusGained
        this.cant.setText("");
        this.cantErr.setVisible(false);
    }//GEN-LAST:event_cantFocusGained

    public void main() {
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
            java.util.logging.Logger.getLogger(Transferir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Transferir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Transferir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Transferir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Transferir(null, null, null).setVisible(true);
            }

        });
    }

    public Boolean checkEmail() {
        String email = this.email.getText();

        Pattern p = Pattern.compile("^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"
                + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$");
        Matcher m = p.matcher(email);
        if (!m.find()) {
            this.emailErr.setVisible(true);
            this.emailErr.setText("El email no es válido");
            return false;
        }
        return true;
    }

    public Double getCurrSaldo() {
        return this.saldo;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancel;
    private javax.swing.JButton Confirm;
    private javax.swing.JLabel TranferirLabel;
    private javax.swing.JTextField cant;
    private javax.swing.JLabel cantErr;
    private javax.swing.JLabel cantLabel;
    private javax.swing.JTextField email;
    private javax.swing.JLabel emailErr;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
