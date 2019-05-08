/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIEWS.ADMIN;

import DAO.funcionarioDAO;
import javax.swing.JOptionPane;
import model.modelFuncionario;

/**
 *
 * @author Alunos
 */
public class viewAdminCadastrar extends javax.swing.JFrame {

    /**
     * Creates new form viewAdminCadastrar
     */
    public viewAdminCadastrar() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        senhaAtendente = new javax.swing.JTextField();
        nomeAtdn = new javax.swing.JTextField();
        nascatd = new javax.swing.JTextField();
        emailatd = new javax.swing.JTextField();
        telatd = new javax.swing.JTextField();
        endatd = new javax.swing.JTextField();
        cpfatd = new javax.swing.JTextField();
        slratd = new javax.swing.JTextField();
        loginAtendente = new javax.swing.JTextField();
        btnsalvar = new javax.swing.JButton();

        jScrollPane1.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 169, -1, -1));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 206, 209));
        jLabel10.setText("Nome");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 110, 20));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/icon.png"))); // NOI18N
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 206, 209));
        jLabel12.setText("Data de Nascimento");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 210, 20));

        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 206, 209));
        jLabel13.setText("Endereço");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 130, 20));

        jLabel14.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 206, 209));
        jLabel14.setText("CPF");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 100, 30));

        jLabel15.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 206, 209));
        jLabel15.setText("Email");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 110, 20));

        jLabel16.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 206, 209));
        jLabel16.setText("Salário Base");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 150, 20));

        jLabel17.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 206, 209));
        jLabel17.setText("Telefone");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 130, 20));

        jLabel18.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 206, 209));
        jLabel18.setText("Login Funcionário");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 230, 20));

        jLabel19.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 206, 209));
        jLabel19.setText("Senha Usuário");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, 200, 20));

        jSeparator2.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator2.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 800, 10));

        senhaAtendente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(72, 209, 204)));
        jPanel1.add(senhaAtendente, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 450, 370, 20));

        nomeAtdn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(72, 209, 204)));
        jPanel1.add(nomeAtdn, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 330, 20));

        nascatd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(72, 209, 204)));
        jPanel1.add(nascatd, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 330, 20));

        emailatd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(72, 209, 204)));
        jPanel1.add(emailatd, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 330, 20));

        telatd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(72, 209, 204)));
        jPanel1.add(telatd, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 330, 20));

        endatd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(72, 209, 204)));
        jPanel1.add(endatd, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 330, 20));

        cpfatd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(72, 209, 204)));
        jPanel1.add(cpfatd, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 330, 20));

        slratd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(72, 209, 204)));
        jPanel1.add(slratd, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, 330, 20));

        loginAtendente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(72, 209, 204)));
        jPanel1.add(loginAtendente, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 420, 370, 20));

        btnsalvar.setForeground(new java.awt.Color(142, 229, 238));
        btnsalvar.setText("Salvar");
        btnsalvar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnsalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnsalvarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnsalvarMouseExited(evt);
            }
        });
        btnsalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalvarActionPerformed(evt);
            }
        });
        jPanel1.add(btnsalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 440, 80, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
viewPrincipalAdmin b = new viewPrincipalAdmin();
b.setVisible(true);
dispose();
 
    }//GEN-LAST:event_jLabel11MouseClicked

    private void btnsalvarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsalvarMouseEntered
    btnsalvar.setBackground(new java.awt.Color(72, 209, 204));
    btnsalvar.setForeground(new java.awt.Color(245, 245, 245));
                                       
    }//GEN-LAST:event_btnsalvarMouseEntered

    private void btnsalvarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsalvarMouseExited
btnsalvar.setBackground(new java.awt.Color(245,245,245));
    btnsalvar.setForeground(new java.awt.Color(72, 209, 204));
                                       
        
    }//GEN-LAST:event_btnsalvarMouseExited

    private void btnsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalvarActionPerformed
        modelFuncionario f  = new modelFuncionario();
        funcionarioDAO fdao = new funcionarioDAO();
        
        f.setNome(nomeAtdn.getText());
        f.setCpf(cpfatd.getText());
        f.setEmail(emailatd.getText());
        f.setEndereco(endatd.getText());
        f.setNascimento(nascatd.getText());
        f.setTelefone(telatd.getText());
        f.setSalario(Double.parseDouble(slratd.getText()));
        f.setLogin(loginAtendente.getText());
        f.setSenha(senhaAtendente.getText());
        
        fdao.CadastrarFunc(f);
        JOptionPane.showMessageDialog(null,"Usuário cadastrado");
        
    }//GEN-LAST:event_btnsalvarActionPerformed

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
                if ("Windows Classic".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(viewAdminCadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewAdminCadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewAdminCadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewAdminCadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewAdminCadastrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnsalvar;
    private javax.swing.JTextField cpfatd;
    private javax.swing.JTextField emailatd;
    private javax.swing.JTextField endatd;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField loginAtendente;
    private javax.swing.JTextField nascatd;
    private javax.swing.JTextField nomeAtdn;
    private javax.swing.JTextField senhaAtendente;
    private javax.swing.JTextField slratd;
    private javax.swing.JTextField telatd;
    // End of variables declaration//GEN-END:variables
}
