package querymysql.contas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Main extends javax.swing.JFrame {

    private Login lg = new Login();
    private SignUp su = new SignUp();
    private Boolean ok;
    private JPanel curr;
    public Color celeste = new Color(51,153,255);
    public Color gris = new Color(102,102,102);
    
    public Main() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.iniciarSs.requestFocus();
        showLG();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        iniciarSs = new javax.swing.JButton();
        crearCC = new javax.swing.JButton();
        container = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setBackground(new java.awt.Color(255, 255, 255));

        title.setBackground(new java.awt.Color(0, 0, 102));
        title.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        title.setForeground(new java.awt.Color(0, 0, 102));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Sistema Bancario Super Seguro");
        title.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        iniciarSs.setBackground(new java.awt.Color(51, 153, 255));
        iniciarSs.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        iniciarSs.setForeground(new java.awt.Color(255, 255, 255));
        iniciarSs.setText("Iniciar sesión");
        iniciarSs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iniciarSsMouseClicked(evt);
            }
        });
        iniciarSs.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                iniciarSsKeyPressed(evt);
            }
        });

        crearCC.setBackground(new java.awt.Color(102, 102, 102));
        crearCC.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        crearCC.setForeground(new java.awt.Color(255, 255, 255));
        crearCC.setText("Crear cuenta");
        crearCC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crearCCMouseClicked(evt);
            }
        });

        container.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout containerLayout = new javax.swing.GroupLayout(container);
        container.setLayout(containerLayout);
        containerLayout.setHorizontalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        containerLayout.setVerticalGroup(
            containerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 254, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iniciarSs, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(crearCC, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(container, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(container, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(iniciarSs, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(crearCC, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String[] args) {
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    private void iniciarSsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iniciarSsMouseClicked

        if (this.curr != this.lg) {
            this.iniciarSs.setBackground(celeste);
            this.crearCC.setBackground(gris);
            showLG();
            return;
        }

        this.ok = lg.checkEmail() && lg.checkSenha();

        if (this.ok) {
            HashMap<String, String> data = SQLService.getCC(lg.getEmail(), String.valueOf(lg.getSenha()));

            while (data.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No se encontró esta cuenta", "Problema", 2);
                return;
            }
            this.setVisible(false);
            Dashboard inicio = new Dashboard(Integer.parseInt(data.get("id")), data.get("nome") + " " + data.get("sobrenome"), data.get("email"), Float.parseFloat(data.get("saldo")), data.get("senha"), data.get("data"));
            inicio.main();
        }
    }//GEN-LAST:event_iniciarSsMouseClicked

    private void crearCCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearCCMouseClicked

        if (this.curr != this.su) {
            this.crearCC.setBackground(celeste);
            this.iniciarSs.setBackground(gris);
            showSU();
            return;
        }

        this.ok = su.checkNome() && su.checkSobrenome() && su.checkEmail() && su.checkSenha();

        if (this.ok) {
            try {
                String created = SQLService.createCC(su.getNome(), su.getSobrenome(), su.getEmail(), su.getSenha());
                System.out.println(created);
                if (created == "ok") {
                    JOptionPane.showMessageDialog(null, "Cuenta creada", "Felicidades!", 0, null);
                    showLG();
                } else {
                    JOptionPane.showMessageDialog(null, "No se pudo crear la cuenta", "Error!", 0);
                }
            } catch (Throwable e) {
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_crearCCMouseClicked

    private void iniciarSsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_iniciarSsKeyPressed
        System.out.println("aaaa");
    }//GEN-LAST:event_iniciarSsKeyPressed

    public void showLG() {
        this.lg.setSize(472, 254);
        this.container.removeAll();
        this.container.add(lg, BorderLayout.CENTER);
        this.container.revalidate();
        this.container.repaint();
        this.curr = this.lg;
    }

    public void showSU() {
        this.su.setSize(472, 254);
        this.container.removeAll();
        this.container.add(su, BorderLayout.CENTER);
        this.container.revalidate();
        this.container.repaint();
        this.curr = this.su;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JPanel container;
    private javax.swing.JButton crearCC;
    private javax.swing.JButton iniciarSs;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
