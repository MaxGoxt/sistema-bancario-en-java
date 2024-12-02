package querymysql.contas;

import javax.swing.JOptionPane;

public class Dashboard extends javax.swing.JFrame{
    
    Conta conta;
    private String email_;
    private Double saldo_;
    private String nome_;
    private String sobreNome_;
    private String date_;
    private String senha_;
    private Integer id;

    public Dashboard(Conta conta) {
        this.conta = conta;
        
        initComponents();
        setNome(conta.nome + " " + conta.sobreNome);
        setEmail(conta.email);
        setSaldo(conta.saldo);
        setSenha(conta.senha);
        setDate(conta.data);
        setId(conta.id);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        nome = new javax.swing.JLabel();
        saldo = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        senha = new javax.swing.JLabel();
        data = new javax.swing.JLabel();
        depositar = new javax.swing.JButton();
        retirar = new javax.swing.JButton();
        cerrarSs = new javax.swing.JButton();
        tranferir = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nome.setBackground(new java.awt.Color(255, 255, 255));
        nome.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        nome.setForeground(new java.awt.Color(0, 0, 0));
        nome.setText("Nombre del titular:");
        bg.add(nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 380, 30));

        saldo.setBackground(new java.awt.Color(255, 255, 255));
        saldo.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        saldo.setForeground(new java.awt.Color(0, 0, 0));
        saldo.setText("Saldo:");
        bg.add(saldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 380, 30));

        email.setBackground(new java.awt.Color(255, 255, 255));
        email.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        email.setForeground(new java.awt.Color(0, 0, 0));
        email.setText("Email: ");
        bg.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 140, 270, 20));

        senha.setBackground(new java.awt.Color(255, 255, 255));
        senha.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        senha.setForeground(new java.awt.Color(0, 0, 0));
        senha.setText("Contraseña:");
        bg.add(senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 160, 270, 20));

        data.setBackground(new java.awt.Color(255, 255, 255));
        data.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        data.setForeground(new java.awt.Color(0, 0, 0));
        data.setText("Activo desde:");
        bg.add(data, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 180, 270, 20));

        depositar.setBackground(new java.awt.Color(51, 204, 0));
        depositar.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        depositar.setForeground(new java.awt.Color(255, 255, 255));
        depositar.setText("Depositar");
        depositar.setBorder(null);
        depositar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                depositarMouseClicked(evt);
            }
        });
        bg.add(depositar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 460, 40));

        retirar.setBackground(new java.awt.Color(76, 0, 0));
        retirar.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        retirar.setForeground(new java.awt.Color(255, 255, 255));
        retirar.setText("Retirar");
        retirar.setBorder(null);
        retirar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                retirarMouseClicked(evt);
            }
        });
        bg.add(retirar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 460, 40));

        cerrarSs.setBackground(new java.awt.Color(102, 102, 102));
        cerrarSs.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        cerrarSs.setForeground(new java.awt.Color(255, 255, 255));
        cerrarSs.setText("Cerrar sesión");
        cerrarSs.setBorder(null);
        cerrarSs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrarSsMouseClicked(evt);
            }
        });
        bg.add(cerrarSs, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 350, 180, 40));

        tranferir.setBackground(new java.awt.Color(0, 153, 255));
        tranferir.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        tranferir.setForeground(new java.awt.Color(255, 255, 255));
        tranferir.setText("Transferir");
        tranferir.setBorder(null);
        tranferir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tranferirMouseClicked(evt);
            }
        });
        bg.add(tranferir, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, 460, 40));

        jButton1.setText("jButton1");
        bg.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Eliminar Cuenta");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        bg.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 410, 180, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 815, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void depositarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_depositarMouseClicked
        // TODO add your handling code here:
        try {
            Float cant = Float.parseFloat(JOptionPane.showInputDialog("Indique la cantidade a depositar"));
            if (cant > 0) {
                String res = DataBase.setSaldo(this.id, this.saldo_ + cant);
                if (res == "ok") {
                    setSaldo(this.saldo_ + cant);
                }
            } else {
                JOptionPane.showMessageDialog(null, "El valor deve ser mayor a 0", " ", 0);
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "La cantidade debe ser um valor numerico", "Error!", 0);
            return;
        } catch (NullPointerException e) {
            return;
        } catch (Throwable e) {
            System.out.println(e);
            return;
        }

    }//GEN-LAST:event_depositarMouseClicked

    private void retirarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_retirarMouseClicked

        if (this.saldo_ <= 0) {
            JOptionPane.showMessageDialog(null, "Saldo mínimo ya alcanzado", "Error!", 0);
            return;
        }
        try {
            Float cant = Float.parseFloat(JOptionPane.showInputDialog("Indique la cantidade a retirar"));
            if (this.saldo_ - cant < 0) {
                JOptionPane.showMessageDialog(null, "Saldo insuficiente", "Error!", 0);
                return;
            }
            if (cant > 0) {
                String res = DataBase.setSaldo(this.id, this.saldo_ - cant);
                if (res == "ok") {
                    setSaldo(this.saldo_ - cant);
                }
            } else {
                JOptionPane.showMessageDialog(null, "El valor debe ser mayor a 0", "Error!", 0);
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "La cantidade debe ser um valor numerico", "Error!", 0);
            return;
        } catch (NullPointerException e) {
            return;
        } catch (Throwable e) {
            System.out.println(e);
            return;
        }
    }//GEN-LAST:event_retirarMouseClicked

    private void cerrarSsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarSsMouseClicked
        String[] ops = {"Si", "No"};
        int confirm = JOptionPane.showInternalOptionDialog(null, "Seguro que quieres salir?", "Confirmar", 0, 3, null, ops, "No");
        if (confirm == 0) {
            Main.main(null);
            this.setVisible(false);
        } else {
            return;
        }
    }//GEN-LAST:event_cerrarSsMouseClicked

    private void tranferirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tranferirMouseClicked

        if (this.saldo_ <= 0) {
            JOptionPane.showMessageDialog(null, "Saldo mínimo ya alcanzado", "Error!", 0);
            return;
        }
        
        

        new Transferir(this.id, this.saldo_, this);
    }//GEN-LAST:event_tranferirMouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        String[] ops = {"Si", "No"};
        int confirm = JOptionPane.showInternalOptionDialog(null, "Seguro que quieres eliminar tu cuenta?", "Confirmar", 0, 3, null, ops, "No");
        if (confirm == 0) {
            DataBase.deleteCount(this.id);
            Main.main(null);
            this.setVisible(false);
        } else {
            return;
        }
    }//GEN-LAST:event_jButton2MouseClicked

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard(new Conta(id, nome_, sobreNome_, saldo_, senha_, email_, date_)).setVisible(true);
            }
        });
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email_ = email;
        this.email.setText("Email: " + email_);
    }

    public void setNome(String nome) {
        this.nome_ = nome;
        this.nome.setText("Nombre del titular: " + nome_);
    }

    public void setSaldo(Double saldo) {
        this.saldo_ = saldo;
        this.saldo.setText("Saldo disponivel: " + saldo_.toString());
    }

    public void setDate(String date) {
        this.date_ = date;
        this.data.setText("Activo desde: " + date_);
    }

    public void setSenha(String senha) {
        this.senha_ = senha;
        this.senha.setText("Senha: " + senha_);
    }
    
    public String getEmail(){
        return this.email_;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton cerrarSs;
    private javax.swing.JLabel data;
    private javax.swing.JButton depositar;
    private javax.swing.JLabel email;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel nome;
    private javax.swing.JButton retirar;
    private javax.swing.JLabel saldo;
    private javax.swing.JLabel senha;
    private javax.swing.JButton tranferir;
    // End of variables declaration//GEN-END:variables

}
