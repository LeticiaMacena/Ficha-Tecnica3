package br.com.view;


import br.com.controller.FuncaoController;
import br.com.model.negocio.Funcao;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Rosicléia Frasson
 */
public class FuncaoGui extends javax.swing.JFrame {

    private FuncaoTableModel model;

    public FuncaoGui() {
        initComponents();
        List<Funcao> lista = new ArrayList<Funcao>();
        FuncaoController a = new FuncaoController();
        lista = a.listarFuncao();

        //cria o automovel de Produto      
        model = new FuncaoTableModel(lista);

        //atribui o automovel à tabela
        jTable1.setModel(model);


    }//

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txPesquisa = new javax.swing.JTextField();
        botaoPesquisa = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        funcaoTxt = new javax.swing.JLabel();
        btInserir = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        btRemover = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        txPesquisa.setToolTipText("Ano de Fabricação");
        txPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txPesquisaKeyPressed(evt);
            }
        });
        jPanel1.add(txPesquisa);
        txPesquisa.setBounds(90, 97, 316, 27);

        botaoPesquisa.setBackground(new java.awt.Color(255, 255, 255));
        botaoPesquisa.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botaoPesquisa.setForeground(new java.awt.Color(153, 0, 255));
        botaoPesquisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/rosicleiafrasson/view/imagens/pequisar.png"))); // NOI18N
        botaoPesquisa.setText("Pesquisar");
        botaoPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPesquisaActionPerformed(evt);
            }
        });
        jPanel1.add(botaoPesquisa);
        botaoPesquisa.setBounds(441, 90, 123, 41);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Id", "Nome da função"
            }
        ));
        jScrollPane2.setViewportView(jTable1);
        jTable1.getColumnModel().getColumn(1).setResizable(false);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(60, 160, 648, 142);

        jPanel2.setBackground(new java.awt.Color(204, 153, 255));
        jPanel2.setLayout(null);
        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 375, 797, 80);

        jPanel3.setBackground(new java.awt.Color(204, 153, 255));

        funcaoTxt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        funcaoTxt.setForeground(new java.awt.Color(153, 0, 255));
        funcaoTxt.setText("Funções");

        org.jdesktop.layout.GroupLayout jPanel3Layout = new org.jdesktop.layout.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3Layout.createSequentialGroup()
                .add(333, 333, 333)
                .add(funcaoTxt, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 127, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(337, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel3Layout.createSequentialGroup()
                .add(27, 27, 27)
                .add(funcaoTxt)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(0, 0, 797, 84);

        btInserir.setBackground(new java.awt.Color(255, 255, 255));
        btInserir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btInserir.setForeground(new java.awt.Color(153, 0, 255));
        btInserir.setText("Inserir");
        btInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInserirActionPerformed(evt);
            }
        });
        jPanel1.add(btInserir);
        btInserir.setBounds(460, 340, 100, 34);

        btEditar.setBackground(new java.awt.Color(255, 255, 255));
        btEditar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btEditar.setForeground(new java.awt.Color(153, 0, 255));
        btEditar.setText("Editar");
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });
        jPanel1.add(btEditar);
        btEditar.setBounds(350, 340, 100, 32);

        btRemover.setBackground(new java.awt.Color(255, 255, 255));
        btRemover.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btRemover.setForeground(new java.awt.Color(153, 51, 255));
        btRemover.setText("Remover");
        btRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoverActionPerformed(evt);
            }
        });
        jPanel1.add(btRemover);
        btRemover.setBounds(220, 340, 100, 32);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 774, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInserirActionPerformed
        InserirFuncaoGui im = new InserirFuncaoGui(model);
        im.setVisible(true);

    }//GEN-LAST:event_btInserirActionPerformed

    private void btRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoverActionPerformed
        int selecionado = -1;
        selecionado = jTable1.getSelectedRow();

        if (selecionado >= 0) {
            Integer i = (Integer) model.getValueAt(selecionado, 0);
            FuncaoController mc = new FuncaoController();
            if (mc.excluir(i)){
            model.removeFuncao(selecionado);
            }

        } else {
            JOptionPane.showMessageDialog(null, "É necesário selecionar uma linha");
        }
    }//GEN-LAST:event_btRemoverActionPerformed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        int selecionado = -1;
        selecionado = jTable1.getSelectedRow();

        if (selecionado >= 0) {
            Integer cdFuncao = (Integer) model.getValueAt(selecionado, 0);
            AtualizarFuncaoGuii am = new AtualizarFuncaoGuii(selecionado, cdFuncao, model);
            am.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "É necessário selecionar uma linha");
        }
    }//GEN-LAST:event_btEditarActionPerformed

    private void botaoPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPesquisaActionPerformed
        efetuaPesquisa();


    }//GEN-LAST:event_botaoPesquisaActionPerformed

    private void txPesquisaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txPesquisaKeyPressed
    
        efetuaPesquisa();
       
    }//GEN-LAST:event_txPesquisaKeyPressed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoPesquisa;
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btInserir;
    private javax.swing.JButton btRemover;
    private javax.swing.JLabel funcaoTxt;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txPesquisa;
    // End of variables declaration//GEN-END:variables

    private void efetuaPesquisa() {
        String nome = txPesquisa.getText();
        List<Funcao> lista = new ArrayList<Funcao>();
        FuncaoController a = new FuncaoController();
        lista = a.listarFuncaoByNome(nome);
        model.limpar();

        //cria o automovel de Produto      
        model = new FuncaoTableModel(lista);

        //atribui o automovel à tabela
        jTable1.setModel(model);
    }
}
