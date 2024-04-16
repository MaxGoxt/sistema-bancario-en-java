package querymysql.contas;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SignUp extends javax.swing.JPanel {

    public SignUp() {
        initComponents();
        this.nomeErr.setVisible(false);
        this.sobreNErr.setVisible(false);
        this.emailErr.setVisible(false);
        this.senhaErr.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nomeLabel = new javax.swing.JLabel();
        nome = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        sobreNLabel = new javax.swing.JLabel();
        sobrenome = new javax.swing.JTextField();
        senhaLabel = new javax.swing.JLabel();
        senha = new javax.swing.JPasswordField();
        nomeErr = new javax.swing.JLabel();
        sobreNErr = new javax.swing.JLabel();
        senhaErr = new javax.swing.JLabel();
        emailErr = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nomeLabel.setText("Nome");
        add(nomeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 44, 147, -1));

        nome.setBackground(new java.awt.Color(255, 255, 255));
        nome.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        nome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nomeFocusGained(evt);
            }
        });
        add(nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 66, 147, -1));

        emailLabel.setText("Email");
        add(emailLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 154, 147, -1));

        email.setBackground(new java.awt.Color(255, 255, 255));
        email.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emailFocusGained(evt);
            }
        });
        add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 176, 147, -1));

        sobreNLabel.setText("Sobrenome");
        add(sobreNLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 44, 147, -1));

        sobrenome.setBackground(new java.awt.Color(255, 255, 255));
        sobrenome.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        sobrenome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                sobrenomeFocusGained(evt);
            }
        });
        add(sobrenome, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 66, 147, -1));

        senhaLabel.setText("Senha");
        add(senhaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 154, 147, -1));

        senha.setBackground(new java.awt.Color(255, 255, 255));
        senha.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        senha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                senhaFocusGained(evt);
            }
        });
        add(senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 176, 147, -1));

        nomeErr.setBackground(new java.awt.Color(255, 0, 0));
        nomeErr.setForeground(new java.awt.Color(255, 0, 0));
        nomeErr.setText("Erro");
        add(nomeErr, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 150, -1));

        sobreNErr.setBackground(new java.awt.Color(255, 0, 0));
        sobreNErr.setForeground(new java.awt.Color(255, 0, 0));
        sobreNErr.setText("Erro");
        add(sobreNErr, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 147, 20));

        senhaErr.setBackground(new java.awt.Color(255, 0, 0));
        senhaErr.setForeground(new java.awt.Color(255, 0, 0));
        senhaErr.setText("Erro");
        add(senhaErr, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 147, 20));

        emailErr.setBackground(new java.awt.Color(255, 0, 0));
        emailErr.setForeground(new java.awt.Color(255, 0, 0));
        emailErr.setText("Erro");
        add(emailErr, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 147, 20));
    }// </editor-fold>//GEN-END:initComponents

    private void nomeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nomeFocusGained
        this.nomeErr.setVisible(false);
    }//GEN-LAST:event_nomeFocusGained

    private void sobrenomeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sobrenomeFocusGained
        this.sobreNErr.setVisible(false);
    }//GEN-LAST:event_sobrenomeFocusGained

    private void emailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFocusGained
        this.emailErr.setVisible(false);
    }//GEN-LAST:event_emailFocusGained

    private void senhaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_senhaFocusGained
        this.senhaErr.setVisible(false);
    }//GEN-LAST:event_senhaFocusGained

    public String getEmail() {
        return email.getText();
    }

    public String getNome() {
        return nome.getText();
    }

    public String getSenha() {
        return String.valueOf(senha.getPassword());
    }

    public String getSobrenome() {
        return sobrenome.getText();
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

    public Boolean checkNome() {
        String nome = String.valueOf(this.nome.getText());

        if (nome.isBlank()) {
            this.nomeErr.setVisible(true);
            this.nomeErr.setText("Campo obrigatorio");
            return false;
        }
        return true;
    }

    public Boolean checkSenha() {
        String senha = String.valueOf(this.senha.getPassword());

        if (senha.isBlank()) {
            this.senhaErr.setVisible(true);
            this.senhaErr.setText("Campo obrigatorio");
            return false;
        }
        return true;
    }

    public Boolean checkSobrenome() {
        String snome = String.valueOf(this.sobrenome.getText());

        if (snome.isBlank()) {
            this.sobreNErr.setVisible(true);
            this.sobreNErr.setText("Campo obrigatorio");
            return false;
        }
        return true;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField email;
    private javax.swing.JLabel emailErr;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField nome;
    private javax.swing.JLabel nomeErr;
    private javax.swing.JLabel nomeLabel;
    private javax.swing.JPasswordField senha;
    private javax.swing.JLabel senhaErr;
    private javax.swing.JLabel senhaLabel;
    private javax.swing.JLabel sobreNErr;
    private javax.swing.JLabel sobreNLabel;
    private javax.swing.JTextField sobrenome;
    // End of variables declaration//GEN-END:variables
}
