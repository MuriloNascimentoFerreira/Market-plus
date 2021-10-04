/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package br.edu.ifnmg.apresentacao_desktop.TelaCaixa;

import br.edu.ifnmg.apresentacao_desktop.TelaPrincipal;
import br.edu.ifnmg.apresentacao_desktop.TelaProduto.ProdutoEditar;
import br.edu.ifnmg.auxiliares.Estoque;
import br.edu.ifnmg.auxiliares.EstoqueRepositorio;
import br.edu.ifnmg.logicaAplicacao.Produto;
import br.edu.ifnmg.logicaAplicacao.ProdutoRepositorio;
import br.edu.ifnmg.repositorioFactory.RepositorioFactory;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.beans.PropertyVetoException;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.event.InternalFrameEvent;
import javax.swing.event.InternalFrameListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author gabriel
 */
public class ListarProdutos extends javax.swing.JInternalFrame implements KeyListener, InternalFrameListener{
    private ProdutoRepositorio produtoRepositorio;
    private EstoqueRepositorio estoqueRepositorio;
    public static Produto produto;
    /**
     * Creates new form ListarProdutos
     */
    public ListarProdutos() {
        this.produtoRepositorio = RepositorioFactory.getProdutoRepositorio();
        this.estoqueRepositorio = RepositorioFactory.getEstoqueRepositorio();
        this.produto = new Produto();
        initComponents();
        initTable();
        this.btnBuscaAvancada.addKeyListener(this);
        try {
            this.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(ListarProdutos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void initTable(){
        List<Produto> resultado = this.produtoRepositorio.Buscar(this.produto);
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("#");
        modelo.addColumn("Código");
        modelo.addColumn("Nome");
        modelo.addColumn("Descrição");
        modelo.addColumn("QTDE. nas Prateleiras");
        modelo.addColumn("QTDE. MÍN. Atacado");
        modelo.addColumn("UND. Venda");
        modelo.addColumn("VAL. Varejo");
        modelo.addColumn("VAL. Atacado");
        
        for(int i=0;i<resultado.size(); i++){
            Estoque estoqueResultado = this.estoqueRepositorio.Abrir(resultado.get(i).getEstoque().getId());
            if(estoqueResultado.getSomaPrateleiras() > 0){
                Vector linha = new Vector();
            
                linha.add((i+1));
                linha.add(resultado.get(i).getId());
                linha.add(resultado.get(i).getNome());
                linha.add(resultado.get(i).getDescricao());
                linha.add(estoqueResultado.getSomaPrateleiras());
                linha.add(resultado.get(i).getMinimoParaAtacado());
                linha.add(resultado.get(i).getUnidadeMedidaVenda());
                linha.add(resultado.get(i).getValorVarejo().toString().replace(".", ","));
                linha.add(resultado.get(i).getValorAtacado().toString().replace(".", ","));
                modelo.addRow(linha);
            }
        }
        tableViewProdutos.setModel(modelo);
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
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableViewProdutos = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnBuscaAvancada = new javax.swing.JButton();

        setClosable(true);

        jPanel1.setBackground(new java.awt.Color(208, 208, 208));

        jButton1.setBackground(new java.awt.Color(109, 46, 46));
        jButton1.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tableViewProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableViewProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableViewProdutosMouseClicked(evt);
            }
        });
        tableViewProdutos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tableViewProdutosKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tableViewProdutos);

        jPanel2.setBackground(new java.awt.Color(140, 71, 71));

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("LISTAGEM AVANÇADA DE PRODUTOS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(21, 21, 21))
        );

        btnBuscaAvancada.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        btnBuscaAvancada.setText("Busca Avançada");
        btnBuscaAvancada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaAvancadaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1230, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBuscaAvancada, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBuscaAvancada, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tableViewProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableViewProdutosMouseClicked
        int linha = tableViewProdutos.getSelectedRow();
        String id = tableViewProdutos.getValueAt(linha, 1).toString();
        
        CaixaTela.txtCode.setText(id);
        this.dispose();
    }//GEN-LAST:event_tableViewProdutosMouseClicked

    private void tableViewProdutosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableViewProdutosKeyPressed
        if(evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER && tableViewProdutos.getSelectedRow() >= 0){
           int linha = tableViewProdutos.getSelectedRow();
            String id = tableViewProdutos.getValueAt(linha, 1).toString();

            CaixaTela.txtCode.setText(id);
            this.dispose();
       }
    }//GEN-LAST:event_tableViewProdutosKeyPressed

    private void btnBuscaAvancadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaAvancadaActionPerformed
        ProdutoEditar produtoEditar = new ProdutoEditar(produto, "Buscar Produto");
        CaixaTela.jDesktopPane1.add(produtoEditar);
        produtoEditar.addInternalFrameListener(this);
        produtoEditar.setVisible(true);
    }//GEN-LAST:event_btnBuscaAvancadaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscaAvancada;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableViewProdutos;
    // End of variables declaration//GEN-END:variables

    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == java.awt.event.KeyEvent.VK_ESCAPE){
            this.dispose();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }

    @Override
    public void internalFrameOpened(InternalFrameEvent e) {
       
    }

    @Override
    public void internalFrameClosing(InternalFrameEvent e) {
       
    }

    @Override
    public void internalFrameClosed(InternalFrameEvent e) {
        this.initTable();
    }

    @Override
    public void internalFrameIconified(InternalFrameEvent e) {
        
    }

    @Override
    public void internalFrameDeiconified(InternalFrameEvent e) {
      
    }

    @Override
    public void internalFrameActivated(InternalFrameEvent e) {
       
    }

    @Override
    public void internalFrameDeactivated(InternalFrameEvent e) {
        
    }
}
