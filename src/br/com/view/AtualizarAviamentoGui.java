package br.com.view;


import br.com.controller.FuncaoController;
import br.com.controller.AviamentoController;
import br.com.controller.FornecedorController;
import br.com.model.negocio.Funcao;
import br.com.model.negocio.Aviamento;
import br.com.model.negocio.Fornecedor;
import br.com.model.negocio.Fornecedor;
import br.com.validators.Validadores;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Rosicléia Frasson
 */
public class AtualizarAviamentoGui extends javax.swing.JFrame {
    int linhaSelecionada;
    int codigoMarca;
    AviamentoTableModel model;

    AtualizarAviamentoGui(int selecionado, Integer cdModelo, AviamentoTableModel mtb) {
         initComponents();
        
        linhaSelecionada = selecionado;
        cdModelo = cdModelo;
        model = mtb;
        


        AviamentoController mc = new AviamentoController();
        Aviamento  u = new Aviamento();
        u = mc.listarAviamentoById(cdModelo);

        campoNome.setText(u.getNome());
        campoCor.setText(u.getCor());
        campoDescricao.setText(u.getDescricao());

        
       if (u.getFuncaoComponenteOuDecorativo().equals("Componente")){
           radioComponente.setSelected(true);
        }else{
          radioDecorativo.setSelected(true);
        }
       
        if (u.getVisibilidade().equals("Aparente")){
           radioAparente.setSelected(true);
        }else{
          radioNaoAparente.setSelected(true);
        }
         carregarCombo(u.getFornecedor().getId()); 
         

    
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botaogrupo = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        painelCentro = new javax.swing.JPanel();
        nomeTxt = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();
        radioComponente = new javax.swing.JRadioButton();
        radioDecorativo = new javax.swing.JRadioButton();
        funcaoTxt = new javax.swing.JLabel();
        corTxt = new javax.swing.JLabel();
        fornecedorTxt = new javax.swing.JLabel();
        painelCabecalho = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        painelRodape = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        descricaoTxt = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        campoDescricao = new javax.swing.JTextField();
        radioAparente = new javax.swing.JRadioButton();
        radioNaoAparente = new javax.swing.JRadioButton();
        visibilidadeTxt = new javax.swing.JLabel();
        botaoLimpar = new javax.swing.JButton();
        botaoSalvar = new javax.swing.JButton();
        campoCor = new javax.swing.JTextField();
        comboFornecedor = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Inserir Marca");

        painelCentro.setBackground(new java.awt.Color(255, 255, 255));
        painelCentro.setLayout(null);

        nomeTxt.setText("Nome do aviamento:");
        painelCentro.add(nomeTxt);
        nomeTxt.setBounds(20, 130, 140, 14);
        painelCentro.add(campoNome);
        campoNome.setBounds(140, 130, 240, 20);

        radioComponente.setBackground(new java.awt.Color(255, 255, 255));
        botaogrupo.add(radioComponente);
        radioComponente.setText("Componente");
        painelCentro.add(radioComponente);
        radioComponente.setBounds(150, 210, 100, 23);

        radioDecorativo.setBackground(new java.awt.Color(255, 255, 255));
        botaogrupo.add(radioDecorativo);
        radioDecorativo.setText("Decorativo");
        painelCentro.add(radioDecorativo);
        radioDecorativo.setBounds(270, 210, 110, 23);

        funcaoTxt.setText("Função:");
        painelCentro.add(funcaoTxt);
        funcaoTxt.setBounds(80, 210, 50, 14);

        corTxt.setText("Cor do aviamento:");
        painelCentro.add(corTxt);
        corTxt.setBounds(420, 130, 140, 14);

        fornecedorTxt.setText("Nome do fornecedor:");
        painelCentro.add(fornecedorTxt);
        fornecedorTxt.setBounds(20, 170, 120, 14);

        painelCabecalho.setBackground(new java.awt.Color(204, 153, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/rosicleiafrasson/view/imagens/add_user-64.png"))); // NOI18N
        jLabel1.setText("Atualizar Aviamento");

        javax.swing.GroupLayout painelCabecalhoLayout = new javax.swing.GroupLayout(painelCabecalho);
        painelCabecalho.setLayout(painelCabecalhoLayout);
        painelCabecalhoLayout.setHorizontalGroup(
            painelCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCabecalhoLayout.createSequentialGroup()
                .addGap(305, 305, 305)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(398, Short.MAX_VALUE))
        );
        painelCabecalhoLayout.setVerticalGroup(
            painelCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCabecalhoLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        painelCentro.add(painelCabecalho);
        painelCabecalho.setBounds(-20, 20, 940, 60);

        painelRodape.setBackground(new java.awt.Color(204, 153, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/rosicleiafrasson/view/imagens/abbb.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/rosicleiafrasson/view/imagens/Cópia de ddd.png"))); // NOI18N

        javax.swing.GroupLayout painelRodapeLayout = new javax.swing.GroupLayout(painelRodape);
        painelRodape.setLayout(painelRodapeLayout);
        painelRodapeLayout.setHorizontalGroup(
            painelRodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelRodapeLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jLabel3)
                .addContainerGap(143, Short.MAX_VALUE))
        );
        painelRodapeLayout.setVerticalGroup(
            painelRodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelRodapeLayout.createSequentialGroup()
                .addGroup(painelRodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        painelCentro.add(painelRodape);
        painelRodape.setBounds(0, 420, 870, 70);

        descricaoTxt.setText("Descrição do aviamento:");
        painelCentro.add(descricaoTxt);
        descricaoTxt.setBounds(420, 170, 140, 14);

        jPanel1.setBackground(new java.awt.Color(204, 153, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 890, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        painelCentro.add(jPanel1);
        jPanel1.setBounds(0, 0, 890, 10);

        campoDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoDescricaoActionPerformed(evt);
            }
        });
        painelCentro.add(campoDescricao);
        campoDescricao.setBounds(450, 200, 260, 110);

        radioAparente.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup3.add(radioAparente);
        radioAparente.setText("Aparente");
        painelCentro.add(radioAparente);
        radioAparente.setBounds(150, 250, 71, 23);

        radioNaoAparente.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup3.add(radioNaoAparente);
        radioNaoAparente.setText("Não aparente");
        painelCentro.add(radioNaoAparente);
        radioNaoAparente.setBounds(270, 250, 91, 23);

        visibilidadeTxt.setText("Visibilidade:");
        painelCentro.add(visibilidadeTxt);
        visibilidadeTxt.setBounds(70, 250, 110, 14);

        botaoLimpar.setBackground(new java.awt.Color(204, 153, 255));
        botaoLimpar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botaoLimpar.setForeground(new java.awt.Color(153, 0, 255));
        botaoLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/rosicleiafrasson/view/imagens/limpar.png"))); // NOI18N
        botaoLimpar.setText("Limpar");
        botaoLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLimparActionPerformed(evt);
            }
        });
        painelCentro.add(botaoLimpar);
        botaoLimpar.setBounds(190, 360, 117, 41);

        botaoSalvar.setBackground(new java.awt.Color(204, 153, 255));
        botaoSalvar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botaoSalvar.setForeground(new java.awt.Color(153, 0, 255));
        botaoSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/rosicleiafrasson/view/imagens/salvar.png"))); // NOI18N
        botaoSalvar.setText("Salvar");
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });
        painelCentro.add(botaoSalvar);
        botaoSalvar.setBounds(390, 360, 130, 41);
        painelCentro.add(campoCor);
        campoCor.setBounds(520, 130, 190, 20);

        comboFornecedor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        painelCentro.add(comboFornecedor);
        comboFornecedor.setBounds(140, 170, 240, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(painelCentro, javax.swing.GroupLayout.PREFERRED_SIZE, 746, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelCentro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
        Aviamento m = new Aviamento();

        if ((campoNome.getText().length() <= 0)
            || ((campoDescricao.getText().length() <= 0)
                    || (campoCor.getText().length() <=0))){
                   

        } else {

            m.setNome(campoNome.getText());
            m.setDescricao(campoDescricao.getText());
            m.setCor(campoCor.getText());
        
            m.setFornecedor((Fornecedor)comboFornecedor.getSelectedItem()); 
            if (radioComponente.isSelected()){
                m.setFuncaoComponenteOuDecorativo("Componente");
            }else{
                m.setFuncaoComponenteOuDecorativo("Decorativo");
            }
            if (radioAparente.isSelected()){
                m.setVisibilidade("Aparente");
            }else{
                m.setVisibilidade("NãoAparente");
            }
            

            AviamentoController mc = new AviamentoController();
            if(mc.salvar(m)){
                model.addAviamento(pesquisar(m.getNome(), m.getDescricao()));
            }
            dispose();
        }
    }//GEN-LAST:event_botaoSalvarActionPerformed

    private void botaoLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLimparActionPerformed
        campoNome.setText("");
        comboFornecedor.setSelectedIndex(0);
        campoCor.setText("");
        campoDescricao.setText("");
        radioComponente.setSelected(false);
        radioAparente.setSelected(false);
        radioNaoAparente.setSelected(false);
        radioDecorativo.setSelected(false);
    }//GEN-LAST:event_botaoLimparActionPerformed

    private void campoDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoDescricaoActionPerformed

    private Aviamento pesquisar (String nome, String descricao){
        AviamentoController mc = new AviamentoController();
        return mc.listaAviamentoByNome(nome);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoLimpar;
    private javax.swing.JButton botaoSalvar;
    private javax.swing.ButtonGroup botaogrupo;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JTextField campoCor;
    private javax.swing.JTextField campoDescricao;
    private javax.swing.JTextField campoNome;
    private javax.swing.JComboBox comboFornecedor;
    private javax.swing.JLabel corTxt;
    private javax.swing.JLabel descricaoTxt;
    private javax.swing.JLabel fornecedorTxt;
    private javax.swing.JLabel funcaoTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nomeTxt;
    private javax.swing.JPanel painelCabecalho;
    private javax.swing.JPanel painelCentro;
    private javax.swing.JPanel painelRodape;
    private javax.swing.JRadioButton radioAparente;
    private javax.swing.JRadioButton radioComponente;
    private javax.swing.JRadioButton radioDecorativo;
    private javax.swing.JRadioButton radioNaoAparente;
    private javax.swing.JLabel visibilidadeTxt;
    // End of variables declaration//GEN-END:variables

    
    
      private void carregarCombo(int cdFornecedor) {
         //assim como é feito numa JTable, temos o DefaultComboBoxModel que é o model do JComboBox
        DefaultComboBoxModel comboModel = (DefaultComboBoxModel) comboFornecedor.getModel();
        //removendo todos os elementos do combo
        comboModel.removeAllElements();
        //cria a lista: java.util.List
        List<Fornecedor> fornecedores = new ArrayList<Fornecedor>();
        FornecedorController a = new FornecedorController();
        fornecedores = a.listarFornecedor();
        
     
        for (int linha = 0; linha <fornecedores.size(); linha++) {
            //pegando a categoria da lista
            Fornecedor funcionario = fornecedores.get(linha);
            //adicionando a categoria no combo
            comboModel.addElement(funcionario);
        }
    }
}
