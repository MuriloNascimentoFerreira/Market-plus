/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.apresentacao_desktop.TelaPessoas;

import Util.Util;
import br.edu.ifnmg.apresentacao_desktop.TelaPrincipal;
import br.edu.ifnmg.auxiliares.Telefone;
import br.edu.ifnmg.enums.Segmento;
import br.edu.ifnmg.logicaAplicacao.Fornecedor;
import br.edu.ifnmg.logicaAplicacao.FornecedorRepositorio;
import br.edu.ifnmg.repositorioFactory.RepositorioFactory;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gabriel
 */
public class FornecedorEditar extends javax.swing.JInternalFrame {

    private TelaPrincipal telaPrincipal;
    private Fornecedor fornecedor;
    private FornecedorRepositorio fornecedorRepositorio;
    private Util util;
    
    /**
     * Creates new form FornecedoreEditar
     * @param telaPrincipal
     * @param title
     * @param fornecedor
     */
    public FornecedorEditar(TelaPrincipal telaPrincipal, String title, Fornecedor fornecedor) {
        this.fornecedorRepositorio = RepositorioFactory.getFornecedorRepositorio();
        this.fornecedor = fornecedor;
        this.telaPrincipal = telaPrincipal;
        initComponents();
        setComponentes();
        this.util = new Util();
        this.labelTitulo.setText(title);
        
        if(title.equalsIgnoreCase("novo fornecedor")){
            btnDeletar.setVisible(false);
        }
    }

    private void setComponentes(){
        this.txtNome.setText(this.fornecedor.getNome());
        this.txtEndereco.setText(this.fornecedor.getEndereco());
        this.txtCnpj.setText(this.fornecedor.getNumeroDocumento());
        
        this.txtNascimento.setValue(Util.getStringDateFromCalendar(this.fornecedor.getDataNascimento()));
        
        if(this.fornecedor.getTelefones().size() > 0){
            this.txtTelefone1.setValue(this.fornecedor.getTelefones().get(0).getNumero());
            
            if(this.fornecedor.getTelefones().size() > 1){
                this.txtTelefone2.setValue(this.fornecedor.getTelefones().get(1).getNumero());
            }
        }
        
        this.comboSegmentoEditar.removeAllItems();
        for(int i = 0; i < Segmento.values().length ; i++){
            this.comboSegmentoEditar.addItem(Segmento.values()[i].toString());
            if(this.fornecedor.getSegmento() == Segmento.values()[i]){
                this.comboSegmentoEditar.setSelectedIndex(i);
            }
        }
    }

    private boolean getComponentes(){
        if(
                this.txtNome.getText() == null ||
                this.txtEndereco.getText() == null ||
                this.txtCnpj.getText() == null ||
                this.txtTelefone1.getValue() == null &&
                this.txtTelefone2.getValue() == null
          ){
            return false;
        }
        
        this.fornecedor.setNome(this.txtNome.getText());
        this.fornecedor.setEndereco(this.txtEndereco.getText());
        this.fornecedor.setNumeroDocumento(this.txtCnpj.getText());
        
        this.fornecedor.setDataNascimento(Util.getCalendarDateFromString(this.txtNascimento.getValue().toString()));
        
        List<Telefone> telefones = new ArrayList();
        if(this.txtTelefone1.getValue() != null){
            Telefone telefone1 = new Telefone(this.txtTelefone1.getValue().toString());
            telefones.add(telefone1);
            
        }
        
        if(this.txtTelefone2.getValue() != null){
            Telefone telefone2 = new Telefone(this.txtTelefone2.getValue().toString());
            telefones.add(telefone2);
        }
        
        for(Segmento segmento : Segmento.values()){
            if(segmento.toString().equals(this.comboSegmentoEditar.getSelectedItem())){
                this.fornecedor.setSegmento(segmento);
            }
        }
        
        this.fornecedor.setTelefones(telefones);
        return true;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        comboSegmentoEditar = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtCnpj = new javax.swing.JFormattedTextField();
        txtTelefone2 = new javax.swing.JFormattedTextField();
        txtTelefone1 = new javax.swing.JFormattedTextField();
        txtNascimento = new javax.swing.JFormattedTextField();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();

        setBackground(new java.awt.Color(140, 71, 71));
        setClosable(true);

        jPanel1.setBackground(new java.awt.Color(140, 71, 71));

        labelTitulo.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        labelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        labelTitulo.setText("Editar Fornecedor");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(labelTitulo)
                .addGap(19, 19, 19))
        );

        jPanel2.setBackground(new java.awt.Color(208, 208, 208));

        txtNome.setBackground(new java.awt.Color(255, 255, 255));
        txtNome.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        txtNome.setForeground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(54, 54, 54));
        jLabel2.setText("Nome");

        txtEndereco.setBackground(new java.awt.Color(255, 255, 255));
        txtEndereco.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        txtEndereco.setForeground(new java.awt.Color(0, 0, 0));

        jLabel3.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(54, 54, 54));
        jLabel3.setText("Endereço");

        jLabel4.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(54, 54, 54));
        jLabel4.setText("Telefone 1");

        jLabel5.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(54, 54, 54));
        jLabel5.setText("Telefone 2");

        jLabel6.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(54, 54, 54));
        jLabel6.setText("CNPJ");

        comboSegmentoEditar.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        comboSegmentoEditar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Frios" }));

        jLabel7.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(54, 54, 54));
        jLabel7.setText("Segmento");

        jLabel8.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(54, 54, 54));
        jLabel8.setText("Data de Nascimento");

        txtCnpj.setBackground(new java.awt.Color(255, 255, 255));
        txtCnpj.setForeground(new java.awt.Color(0, 0, 0));
        try {
            txtCnpj.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCnpj.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCnpj.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N

        txtTelefone2.setBackground(new java.awt.Color(255, 255, 255));
        txtTelefone2.setForeground(new java.awt.Color(0, 0, 0));
        try {
            txtTelefone2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) # ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefone2.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N

        txtTelefone1.setBackground(new java.awt.Color(255, 255, 255));
        txtTelefone1.setForeground(new java.awt.Color(0, 0, 0));
        try {
            txtTelefone1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) # ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefone1.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N

        txtNascimento.setBackground(new java.awt.Color(255, 255, 255));
        txtNascimento.setForeground(new java.awt.Color(0, 0, 0));
        try {
            txtNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtNascimento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNascimento.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N

        jPanel3.setBackground(new java.awt.Color(208, 208, 208));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(109, 46, 46));
        jButton1.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Salvar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 20, 114, 35));

        jButton2.setBackground(new java.awt.Color(181, 181, 181));
        jButton2.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        jButton2.setForeground(new java.awt.Color(8, 8, 8));
        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 114, 35));

        btnDeletar.setBackground(new java.awt.Color(208, 208, 208));
        btnDeletar.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        btnDeletar.setForeground(new java.awt.Color(8, 8, 8));
        btnDeletar.setText("Remover");
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });
        jPanel3.add(btnDeletar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, -1, 35));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(290, 290, 290))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(txtCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtTelefone1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel4))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtTelefone2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel5))))
                                        .addGap(152, 152, 152))
                                    .addComponent(txtNome))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(txtNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel7)
                        .addComponent(comboSegmentoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTelefone2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTelefone1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboSegmentoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(this.util.abrirJOptionPane("confirma","",this)){
            if(this.getComponentes()){
                if(this.fornecedorRepositorio.Salvar(this.fornecedor)){
                    util.abrirJOptionPane("sucesso","",this);
                    this.dispose();
                }else{
                    util.abrirJOptionPane("erro","",this);
                }
            }else{
                util.abrirJOptionPane("erro","Preencha todos os campos!",this);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        if(this.util.abrirJOptionPane("confirma","",this)){
            if(this.fornecedorRepositorio.Apagar(this.fornecedor)){
                util.abrirJOptionPane("sucesso","",this);
                this.dispose();
            }else{
                util.abrirJOptionPane("erro","",this);
            }
        }
    }//GEN-LAST:event_btnDeletarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeletar;
    private javax.swing.JComboBox<String> comboSegmentoEditar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JFormattedTextField txtCnpj;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JFormattedTextField txtNascimento;
    private javax.swing.JTextField txtNome;
    private javax.swing.JFormattedTextField txtTelefone1;
    private javax.swing.JFormattedTextField txtTelefone2;
    // End of variables declaration//GEN-END:variables
}
