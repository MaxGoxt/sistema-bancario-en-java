package querymysql.contas;

import java.awt.Color;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Login extends javax.swing.JPanel {

    Color gris = new Color(204, 204, 204);

    public Login() {
        initComponents();
        this.emailErr.setVisible(false);
        this.senhaErr.setVisible(false);
        this.email.setForeground(gris);
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
        email.setForeground(new java.awt.Color(204, 204, 204));
        email.setText("abner@gmail.com");
        email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                emailFocusLost(evt);
            }
        });

        emailErr.setBackground(new java.awt.Color(255, 63, 65));
        emailErr.setForeground(new java.awt.Color(255, 0, 0));
        emailErr.setText("Error");

        senhaLabel.setText("Senha");

        senha.setBackground(new java.awt.Color(255, 255, 255));
        senha.setForeground(new java.awt.Color(204, 204, 204));
        senha.setText("                   ");
        senha.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        senha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                senhaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                senhaFocusLost(evt);
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
        this.email.setForeground(Color.BLACK);
        this.email.setText("");
    }//GEN-LAST:event_emailFocusGained

    private void senhaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_senhaFocusGained
        this.senhaErr.setVisible(false);
        this.senha.setForeground(Color.BLACK);
        this.senha.setText("");
    }//GEN-LAST:event_senhaFocusGained

    private void emailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFocusLost
        if (this.email.getText().isBlank()) {
            this.email.setText("abner@gmail.com");
            this.email.setForeground(gris);
        }
    }//GEN-LAST:event_emailFocusLost

    private void senhaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_senhaFocusLost
        if (this.getSenha().isBlank()) {
            this.senha.setText("           ");
            this.senha.setForeground(gris);
        }
    }//GEN-LAST:event_senhaFocusLost

    public String getEmail() {
        return this.email.getText();
    }

    public String getSenha() {
        return String.valueOf(this.senha.getPassword());
    }

    public Boolean checkEmail() {
        String email = this.email.getText();
        if (email.isBlank() || this.email.getForeground() == gris) {
            this.emailErr.setVisible(true);
            this.emailErr.setText("Campo obligatorio");
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
        if (this.getSenha().isBlank()) {
            this.senhaErr.setVisible(true);
            this.senhaErr.setText("Campo obligatorio");
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
