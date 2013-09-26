package br.com.view;


import br.com.controller.AviamentoController;
import br.com.model.negocio.Funcao;
import br.com.model.negocio.Aviamento;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Rosicléia Frasson
 */
public class AviamentoGui extends javax.swing.JFrame {

    private AviamentoTableModel model;

    public AviamentoGui() {
        initComponents();
        List<Aviamento> lista = new ArrayList<Aviamento>();
        AviamentoController a = new AviamentoController();
        lista = a.listarAviamento();

        //cria o modelo de Produto      
        model = new AviamentoTableModel(lista);

        //atribui o modelo à tabela
        tabela.setModel(model);
        
        


    }//

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painel = new javax.swing.JPanel();
        campoPesquisa = new javax.swing.JTextField();
        botaoPesquisa = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        rodapePainel = new javax.swing.JPanel();
        cabecalhoPainel = new javax.swing.JPanel();
        usuarioTxt = new javax.swing.JLabel();
        btInserir = new javax.swing.JButton();
        btRemover = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        painel.setBackground(new java.awt.Color(255, 255, 255));
        painel.setLayout(null);

        campoPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoPesquisaActionPerformed(evt);
            }
        });
        campoPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                campoPesquisaKeyPressed(evt);
            }
        });
        painel.add(campoPesquisa);
        campoPesquisa.setBounds(70, 170, 500, 27);

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
        painel.add(botaoPesquisa);
        botaoPesquisa.setBounds(600, 170, 140, 40);

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nome ", "Fornecedor", "Cor", "Descrição", "Função", "Tamanho", "Visibilidade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabela.setPreferredSize(new java.awt.Dimension(800, 80));
        jScrollPane2.setViewportView(tabela);
        tabela.getColumnModel().getColumn(0).setResizable(false);
        tabela.getColumnModel().getColumn(0).setPreferredWidth(10);
        tabela.getColumnModel().getColumn(1).setResizable(false);
        tabela.getColumnModel().getColumn(2).setResizable(false);
        tabela.getColumnModel().getColumn(3).setResizable(false);
        tabela.getColumnModel().getColumn(4).setResizable(false);
        tabela.getColumnModel().getColumn(5).setResizable(false);
        tabela.getColumnModel().getColumn(6).setResizable(false);
        tabela.getColumnModel().getColumn(7).setResizable(false);

        painel.add(jScrollPane2);
        jScrollPane2.setBounds(70, 240, 680, 190);

        rodapePainel.setBackground(new java.awt.Color(204, 153, 255));
        rodapePainel.setLayout(null);
        painel.add(rodapePainel);
        rodapePainel.setBounds(0, 536, 1230, 80);

        cabecalhoPainel.setBackground(new java.awt.Color(204, 153, 255));

        usuarioTxt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        usuarioTxt.setForeground(new java.awt.Color(153, 0, 255));
        usuarioTxt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/rosicleiafrasson/view/imagens/user-64.png"))); // NOI18N
        usuarioTxt.setText("Aviamentos");

        org.jdesktop.layout.GroupLayout cabecalhoPainelLayout = new org.jdesktop.layout.GroupLayout(cabecalhoPainel);
        cabecalhoPainel.setLayout(cabecalhoPainelLayout);
        cabecalhoPainelLayout.setHorizontalGroup(
            cabecalhoPainelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(cabecalhoPainelLayout.createSequentialGroup()
                .add(344, 344, 344)
                .add(usuarioTxt, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 199, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(697, Short.MAX_VALUE))
        );
        cabecalhoPainelLayout.setVerticalGroup(
            cabecalhoPainelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(cabecalhoPainelLayout.createSequentialGroup()
                .addContainerGap()
                .add(usuarioTxt)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        painel.add(cabecalhoPainel);
        cabecalhoPainel.setBounds(-10, 0, 1240, 92);

        btInserir.setBackground(new java.awt.Color(255, 255, 255));
        btInserir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btInserir.setForeground(new java.awt.Color(153, 0, 255));
        btInserir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/rosicleiafrasson/view/imagens/add_user-26.png"))); // NOI18N
        btInserir.setText("Inserir");
        btInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInserirActionPerformed(evt);
            }
        });
        painel.add(btInserir);
        btInserir.setBounds(390, 500, 118, 38);

        btRemover.setBackground(new java.awt.Color(255, 255, 255));
        btRemover.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btRemover.setForeground(new java.awt.Color(153, 0, 255));
        btRemover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/rosicleiafrasson/view/imagens/remove_user-26.png"))); // NOI18N
        btRemover.setText("Remover");
        btRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoverActionPerformed(evt);
            }
        });
        painel.add(btRemover);
        btRemover.setBounds(190, 500, 125, 38);

        btEditar.setBackground(new java.awt.Color(255, 255, 255));
        btEditar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btEditar.setForeground(new java.awt.Color(153, 0, 255));
        btEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/rosicleiafrasson/view/imagens/edit_user-26.png"))); // NOI18N
        btEditar.setText("Editar");
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });
        painel.add(btEditar);
        btEditar.setBounds(570, 500, 117, 38);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(painel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 820, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(painel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 599, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInserirActionPerformed
        InserirAviamentoGui im = new InserirAviamentoGui(model);
        im.setVisible(true);

    }//GEN-LAST:event_btInserirActionPerformed

    private void btRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoverActionPerformed
        int selecionado = -1;
        selecionado = tabela.getSelectedRow();

        if (selecionado >= 0) {
            Integer i = (Integer) model.getValueAt(selecionado, 0);
            AviamentoController mc = new AviamentoController();
            if (mc.excluir(i)){
            model.removeAviamento(selecionado);
            }
        } else {
            JOptionPane.showMessageDialog(null, "É necesário selecionar uma tabela");
        }
    }//GEN-LAST:event_btRemoverActionPerformed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        int selecionado = -1;
        selecionado = tabela.getSelectedRow();

        if (selecionado >= 0) {
            Integer cdModelo = (Integer) model.getValueAt(selecionado, 0);
            AtualizarAviamentoGui am = new AtualizarAviamentoGui(selecionado, cdModelo, model);
            am.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "É necessário selecionar uma linha");
        }
    }//GEN-LAST:event_btEditarActionPerformed

    private void botaoPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPesquisaActionPerformed
        efetuaPesquisa();


    }//GEN-LAST:event_botaoPesquisaActionPerformed

    private void campoPesquisaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoPesquisaKeyPressed
    
        efetuaPesquisa();
       
    }//GEN-LAST:event_campoPesquisaKeyPressed

    private void campoPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoPesquisaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoPesquisa;
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btInserir;
    private javax.swing.JButton btRemover;
    private javax.swing.JPanel cabecalhoPainel;
    private javax.swing.JTextField campoPesquisa;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel painel;
    private javax.swing.JPanel rodapePainel;
    private javax.swing.JTable tabela;
    private javax.swing.JLabel usuarioTxt;
    // End of variables declaration//GEN-END:variables

    private void efetuaPesquisa() {
        String nome = campoPesquisa.getText();
        List<Aviamento> lista = new ArrayList<Aviamento>();
        AviamentoController a = new AviamentoController();
        lista = a.listarAviamentoByNome(nome);
        model.limpar();

        //cria o modelo de Produto      
        model = new AviamentoTableModel(lista);

        //atribui o modelo à tabela
        tabela.setModel(model);
    }
}
