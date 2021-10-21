/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package br.edu.ifnmg.apresentacao_desktop.TelaCaixa;

import static br.edu.ifnmg.apresentacao_desktop.TelaCaixa.CaixaTela.cliente;
import br.edu.ifnmg.enums.FormaPagamento;
import br.edu.ifnmg.enums.TipoPagamento;
import br.edu.ifnmg.logicaAplicacao.Cliente;
import br.edu.ifnmg.logicaAplicacao.Pagamento;
import br.edu.ifnmg.logicaAplicacao.PagamentoPorCrediario;
import br.edu.ifnmg.logicaAplicacao.PagamentoPorDinheiro;
import br.edu.ifnmg.logicaAplicacao.PagamentoRepositorio;
import br.edu.ifnmg.logicaAplicacao.TransacaoFinanceira;
import br.edu.ifnmg.repositorioFactory.RepositorioFactory;
import java.util.Calendar;

/**
 *
 * @author murilo
 */
public class PagamentoTela extends javax.swing.JInternalFrame {

    PagamentoPorDinheiro pagamentoPorDinheiro;
    PagamentoPorCrediario pagamentoPorCrediario;
    /**
     * Creates new form
     * @param cliente
     */
    public PagamentoTela(Cliente cliente) {
        pagamentoPorCrediario = new PagamentoPorCrediario();
        pagamentoPorDinheiro = new PagamentoPorDinheiro();
        
        initComponents();
        setComponetes(cliente);
    }
    
    private void setComponetes(Cliente cliente){
        
        if(CaixaTela.cliente != null){
            if(cliente.getIdentificaoDoCliente().equals("0") &&
                    CaixaTela.cliente.getSenha().equals("0")){
                
                this.cbxTipoPagamento.addItem(TipoPagamento.AVista.toString());       
                this.cbxFormaPagamento.addItem(FormaPagamento.Dinheiro.toString());
                this.cbxFormaPagamento.addItem(FormaPagamento.Cartao.toString());   
                
            }else if(!CaixaTela.cliente.getIdentificaoDoCliente().equals("0") && 
                    !CaixaTela.cliente.getSenha().equals("0")){
                
                this.cbxTipoPagamento.addItem(TipoPagamento.AVista.toString());
                this.cbxTipoPagamento.addItem(TipoPagamento.APrazo.toString());
                this.cbxFormaPagamento.addItem(FormaPagamento.Dinheiro.toString());
                this.cbxFormaPagamento.addItem(FormaPagamento.Cartao.toString());
                this.cbxFormaPagamento.addItem(FormaPagamento.Crediario.toString());
            } 
        }
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnProximo = new javax.swing.JButton();
        cbxTipoPagamento = new javax.swing.JComboBox<>();
        cbxFormaPagamento = new javax.swing.JComboBox<>();

        jPanel2.setBackground(new java.awt.Color(208, 208, 208));

        jPanel1.setBackground(new java.awt.Color(140, 71, 71));

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Pagamento ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(8, 8, 8));
        jLabel2.setText("Tipo de Pagamento");

        jLabel4.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(8, 8, 8));
        jLabel4.setText("Forma de Pagamento");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jButton1.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnProximo.setBackground(new java.awt.Color(140, 71, 71));
        btnProximo.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        btnProximo.setForeground(new java.awt.Color(255, 255, 255));
        btnProximo.setText("Próximo");
        btnProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProximoActionPerformed(evt);
            }
        });

        cbxTipoPagamento.setBackground(new java.awt.Color(255, 255, 255));
        cbxTipoPagamento.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cbxTipoPagamento.setForeground(new java.awt.Color(0, 0, 0));
        cbxTipoPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTipoPagamentoActionPerformed(evt);
            }
        });

        cbxFormaPagamento.setBackground(new java.awt.Color(255, 255, 255));
        cbxFormaPagamento.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cbxFormaPagamento.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                        .addComponent(btnProximo, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4)
                            .addComponent(cbxTipoPagamento, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbxFormaPagamento, 0, 214, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxTipoPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxFormaPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProximo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxTipoPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTipoPagamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxTipoPagamentoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximoActionPerformed
        //finalizar venda
        
        // se for cartão só registrar
        
        //se for crediario só guardar o cliente
        
        if(this.cbxTipoPagamento.getSelectedItem().toString().equals(
                TipoPagamento.AVista.toString()) ){
            if(cbxFormaPagamento.getSelectedItem().toString().equals(
                        FormaPagamento.Dinheiro.toString())){
                pagamentoPorDinheiro.setData(Calendar.getInstance());
                pagamentoPorDinheiro.setTipo(TipoPagamento.AVista);
                pagamentoPorDinheiro.setFormaPagamento(FormaPagamento.Dinheiro);
                CaixaTela.pagamento = pagamentoPorDinheiro;
                
                this.dispose();
            }     
           
        }else if(this.cbxTipoPagamento.getSelectedItem().toString().equals(
                TipoPagamento.APrazo.toString()) ){
            
           
        }    
        
    }//GEN-LAST:event_btnProximoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnProximo;
    private javax.swing.JComboBox<String> cbxFormaPagamento;
    private javax.swing.JComboBox<String> cbxTipoPagamento;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
