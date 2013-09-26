/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.view;

import br.com.controller.FuncionarioController;
import br.com.model.negocio.Funcionario;
import javax.swing.JOptionPane;

/**
 *
 * @author leticia_macena
 */
public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
    }

    /**
     * Método responsavel de verificar o login e senha dos funcionarios
     * cadastrado na base de dados
     */
    private void validarLogin() {
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        centro = new javax.swing.JPanel();
        cabecalho = new javax.swing.JPanel();
        rodape = new javax.swing.JPanel();
        painelLogin = new javax.swing.JPanel();
        loginTxt = new javax.swing.JLabel();
        senhaTxt = new javax.swing.JLabel();
        campoLogin = new javax.swing.JTextField();
        campoSenha = new javax.swing.JPasswordField();
        entraJB = new javax.swing.JButton();
        esqueceuSenhaTxt = new javax.swing.JLabel();
        esqueceuSenhaJB = new javax.swing.JButton();
        imagen = new javax.swing.JLabel();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu9 = new javax.swing.JMenu();
        jMenu10 = new javax.swing.JMenu();
        jMenu11 = new javax.swing.JMenu();
        jMenu12 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        centro.setBackground(new java.awt.Color(255, 255, 255));
        centro.setLayout(null);

        cabecalho.setBackground(new java.awt.Color(204, 153, 255));

        javax.swing.GroupLayout cabecalhoLayout = new javax.swing.GroupLayout(cabecalho);
        cabecalho.setLayout(cabecalhoLayout);
        cabecalhoLayout.setHorizontalGroup(
            cabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 810, Short.MAX_VALUE)
        );
        cabecalhoLayout.setVerticalGroup(
            cabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        centro.add(cabecalho);
        cabecalho.setBounds(0, 10, 810, 40);

        rodape.setBackground(new java.awt.Color(204, 153, 255));

        javax.swing.GroupLayout rodapeLayout = new javax.swing.GroupLayout(rodape);
        rodape.setLayout(rodapeLayout);
        rodapeLayout.setHorizontalGroup(
            rodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 810, Short.MAX_VALUE)
        );
        rodapeLayout.setVerticalGroup(
            rodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        centro.add(rodape);
        rodape.setBounds(0, 630, 810, 40);

        painelLogin.setBackground(new java.awt.Color(204, 153, 255));
        painelLogin.setLayout(null);

        loginTxt.setText("Login:     ");
        painelLogin.add(loginTxt);
        loginTxt.setBounds(30, 50, 60, 14);

        senhaTxt.setText("Senha:    ");
        painelLogin.add(senhaTxt);
        senhaTxt.setBounds(30, 90, 50, 14);
        painelLogin.add(campoLogin);
        campoLogin.setBounds(90, 50, 260, 20);
        painelLogin.add(campoSenha);
        campoSenha.setBounds(90, 80, 260, 20);

        entraJB.setBackground(new java.awt.Color(255, 255, 255));
        entraJB.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        entraJB.setForeground(new java.awt.Color(153, 0, 255));
        entraJB.setText("ENTRAR");
        entraJB.setBorder(null);
        entraJB.setBorderPainted(false);
        entraJB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entraJBActionPerformed(evt);
            }
        });
        painelLogin.add(entraJB);
        entraJB.setBounds(240, 150, 110, 40);

        esqueceuSenhaTxt.setBackground(new java.awt.Color(153, 0, 255));
        esqueceuSenhaTxt.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        esqueceuSenhaTxt.setForeground(new java.awt.Color(153, 0, 255));
        esqueceuSenhaTxt.setText("Esqueceu sua senha?");
        painelLogin.add(esqueceuSenhaTxt);
        esqueceuSenhaTxt.setBounds(160, 110, 150, 14);

        esqueceuSenhaJB.setBackground(new java.awt.Color(204, 153, 255));
        esqueceuSenhaJB.setBorder(null);
        esqueceuSenhaJB.setBorderPainted(false);
        esqueceuSenhaJB.setFocusPainted(false);
        esqueceuSenhaJB.setFocusable(false);
        esqueceuSenhaJB.setOpaque(false);
        esqueceuSenhaJB.setRequestFocusEnabled(false);
        painelLogin.add(esqueceuSenhaJB);
        esqueceuSenhaJB.setBounds(130, 100, 190, 40);

        centro.add(painelLogin);
        painelLogin.setBounds(380, 180, 400, 200);

        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/rosicleiafrasson/view/imagens/Rosto.fw.png"))); // NOI18N
        imagen.setText("jLabel3");
        centro.add(imagen);
        imagen.setBounds(-160, 30, 610, 550);

        getContentPane().add(centro);
        centro.setBounds(0, 0, 810, 670);

        jMenuBar3.setBackground(new java.awt.Color(204, 153, 255));

        jMenu9.setBackground(new java.awt.Color(204, 153, 255));
        jMenu9.setText("File");
        jMenuBar3.add(jMenu9);

        jMenu10.setBackground(new java.awt.Color(204, 153, 255));
        jMenu10.setText("Edit");
        jMenuBar3.add(jMenu10);

        jMenu11.setBackground(new java.awt.Color(204, 153, 255));
        jMenu11.setText("jMenu11");
        jMenuBar3.add(jMenu11);

        jMenu12.setBackground(new java.awt.Color(204, 153, 255));
        jMenu12.setText("jMenu12");
        jMenuBar3.add(jMenu12);

        setJMenuBar(jMenuBar3);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void entraJBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entraJBActionPerformed
        String login = campoLogin.getText();
        String senha = new String(campoSenha.getPassword());
        FuncionarioController fc = new FuncionarioController();
        Funcionario fu = new Funcionario();
        boolean resposta = fc.validaLogin(login, senha);
        Menu me = new Menu();

        if (resposta == true) {
            me.setVisible(true);
            JOptionPane.showMessageDialog(null, "login realizado com sucesso!");
            this.dispose();

        } else {
            JOptionPane.showMessageDialog(null, "login não realizado!\n Favor conferir o usuario e senha digitado!");

        }
    }//GEN-LAST:event_entraJBActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel cabecalho;
    private javax.swing.JTextField campoLogin;
    private javax.swing.JPasswordField campoSenha;
    private javax.swing.JPanel centro;
    private javax.swing.JButton entraJB;
    private javax.swing.JButton esqueceuSenhaJB;
    private javax.swing.JLabel esqueceuSenhaTxt;
    private javax.swing.JLabel imagen;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JLabel loginTxt;
    private javax.swing.JPanel painelLogin;
    private javax.swing.JPanel rodape;
    private javax.swing.JLabel senhaTxt;
    // End of variables declaration//GEN-END:variables
}
