package querymysql.contas;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Login extends javax.swing.JPanel {

    public Login() {
        initComponents();
        this.emailErr.setVisible(false);
        this.senhaErr.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        emailLabel = new javax.swing.JLabel();
        email = new javax.swing.JFormattedTextField();
        emailErr = new javax.swing.JLabel();
        senhaLabel = new javax.swing.JLabel();
        senha = new javax.swing.JPasswordField();
        senhaErr = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        emailLabel.setText("Email");

        email.setBackground(new java.awt.Color(255, 255, 255));
        email.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        email.setText("abner@gmail.com");
        email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emailFocusGained(evt);
            }
        });

        emailErr.setBackground(new java.awt.Color(255, 63, 65));
        emailErr.setForeground(new java.awt.Color(255, 0, 0));
        emailErr.setText("Error");

        senhaLabel.setText("Senha");

        senha.setBackground(new java.awt.Color(255, 255, 255));
        senha.setText("                   ");
        senha.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        senha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                senhaFocusGained(evt);
            }
        });
        senha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhaActionPerformed(evt);
            }
        });

        senhaErr.setBackground(new java.awt.Color(255, 63, 65));
        senhaErr.setForeground(new java.awt.Color(255, 0, 0));
        senhaErr.setText("Error");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(senhaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(emailErr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(emailLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(email)
                    .addComponent(senhaErr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(senha, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(emailLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailErr)
                .addGap(25, 25, 25)
                .addComponent(senhaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(senha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(senhaErr)
                .addGap(40, 40, 40))
        );
    }// </editor-fold>//GEN-END:initComponents

    public static void main() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    private void emailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFocusGained
        this.emailErr.setVisible(false);
        this.email.setText("");
    }//GEN-LAST:event_emailFocusGained

    private void senhaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_senhaFocusGained
        this.senhaErr.setVisible(false);
        this.senha.setText("");
    }//GEN-LAST:event_senhaFocusGained

    private void senhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_senhaActionPerformed

    public String getEmail() {
        return this.email.getText();
    }

    public String getSenha() {
        return String.valueOf(this.senha.getPassword());
    }

    public Boolean checkEmail() {
        String email = this.email.getText();
        
        if (email.isBlank()) {
            this.emailErr.setVisible(true);
            this.emailErr.setText("Campo obrigatorio");
            return false;
        }

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

    public Boolean checkSenha() {
        String senha = String.valueOf(this.senha.getPassword());

        if (senha.isBlank()) {
            this.senhaErr.setVisible(true);
            this.senhaErr.setText("La contraseña no puede estar vacia");
            return false;
        }
        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField email;
    private javax.swing.JLabel emailErr;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JPasswordField senha;
    private javax.swing.JLabel senhaErr;
    private javax.swing.JLabel senhaLabel;
    // End of variables declaration//GEN-END:variables
}
