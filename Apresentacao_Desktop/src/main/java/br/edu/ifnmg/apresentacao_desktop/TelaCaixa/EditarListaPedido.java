package br.edu.ifnmg.apresentacao_desktop.TelaCaixa;

import Util.Util;
import br.edu.ifnmg.auxiliares.ItemVenda;
import br.edu.ifnmg.auxiliares.ItemVendaRepositorio;
import br.edu.ifnmg.logicaAplicacao.UsuarioRepositorio;
import br.edu.ifnmg.repositorioFactory.RepositorioFactory;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.math.BigDecimal;

/**
 *
 * @author gabriel
 */
public class EditarListaPedido extends javax.swing.JInternalFrame implements KeyListener {
    ItemVenda itemVenda;
    Util util;
    ItemVendaRepositorio itemVendaRepositorio;
    /**
     * Creates new form EditarLista
     */
    public EditarListaPedido(ItemVenda itemVenda) {
        this.itemVenda = itemVenda;
        this.util = new Util();
        this.itemVendaRepositorio = RepositorioFactory.getItemVendaRepositorio();
        initComponents();
        setComponentes();
        this.txtQuantidade.addKeyListener(this);
    }

    public boolean setComponentes(){
        this.txtCode.setText(itemVenda.getProduto().getId().toString());
        this.txtProductName.setText(itemVenda.getProduto().getNome());
        this.txtQuantidade.setText(itemVenda.getQuantidade().toString());
        this.txtSubTotal.setText(itemVenda.getSubTotal().toString());
        if(CaixaTela.isVarejo(itemVenda)){
            this.txtValor.setText(itemVenda.getProduto().getValorVarejo().toString());
        }else{
            this.txtValor.setText(itemVenda.getProduto().getValorAtacado().toString());
        }
        
        
        return true;
    }
    
    public boolean getComponentes(){
        if(this.txtQuantidade.getText().equals("0") || this.txtQuantidade.getText().isEmpty()){
            util.abrirJOptionPane("erro", "A quantidade deve ser maior que 0", this);
            return false;
        }
        
        itemVenda.setQuantidade(new BigDecimal(this.txtQuantidade.getText()));
        if(CaixaTela.isVarejo(itemVenda)){
            itemVenda.setSubTotal(new BigDecimal(this.txtQuantidade.getText()).multiply(itemVenda.getProduto().getValorVarejo()));
        }else{
            itemVenda.setSubTotal(new BigDecimal(this.txtQuantidade.getText()).multiply(itemVenda.getProduto().getValorAtacado()));
        }
        
        return true;
    }
    
    private void salvarOperacao(){
        if(getComponentes()){
            util.abrirJOptionPane("sucesso", "A quantidade foi alterada!", this);
            this.dispose();
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

        jPanel1 = new javax.swing.JPanel();
        txtCode = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        txtProductName = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtSubTotal = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        txtQuantidade = new javax.swing.JFormattedTextField();

        setClosable(true);

        jPanel1.setBackground(new java.awt.Color(208, 208, 208));

        txtCode.setEditable(false);
        txtCode.setBackground(new java.awt.Color(255, 255, 255));
        txtCode.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        txtCode.setForeground(new java.awt.Color(8, 8, 8));
        txtCode.setEnabled(false);

        jPanel2.setBackground(new java.awt.Color(140, 71, 71));

        txtProductName.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        txtProductName.setForeground(new java.awt.Color(255, 255, 255));
        txtProductName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtProductName.setText("[PRODUCT NAME]");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtProductName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(txtProductName)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(134, 134, 134));
        jLabel2.setText("Código");

        txtValor.setEditable(false);
        txtValor.setBackground(new java.awt.Color(255, 255, 255));
        txtValor.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        txtValor.setForeground(new java.awt.Color(8, 8, 8));
        txtValor.setEnabled(false);

        jLabel3.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(134, 134, 134));
        jLabel3.setText("Valor");

        jLabel4.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(8, 8, 8));
        jLabel4.setText("Quantidade");

        txtSubTotal.setEditable(false);
        txtSubTotal.setBackground(new java.awt.Color(255, 255, 255));
        txtSubTotal.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        txtSubTotal.setForeground(new java.awt.Color(8, 8, 8));
        txtSubTotal.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(134, 134, 134));
        jLabel5.setText("Subtotal");

        jButton1.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jButton1.setText("Fechar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(8, 8, 8));
        jButton2.setText("Remover");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(140, 71, 71));
        jButton3.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Salvar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        txtQuantidade.setBackground(new java.awt.Color(255, 255, 255));
        txtQuantidade.setForeground(new java.awt.Color(8, 8, 8));
        txtQuantidade.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txtQuantidade.setFont(new java.awt.Font("sansserif", 0, 16)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addComponent(txtValor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                            .addComponent(jLabel2)
                            .addComponent(txtCode, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                            .addComponent(jLabel5)
                            .addComponent(txtSubTotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                            .addComponent(jLabel4)
                            .addComponent(txtQuantidade, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(116, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(2, 2, 2)
                .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(2, 2, 2)
                .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(2, 2, 2)
                .addComponent(txtSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(2, 2, 2)
                .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
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

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        salvarOperacao();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        UsuarioRepositorio usuarioRepositorio = RepositorioFactory.getUsuarioRepositorio();
        
        String email = util.abrirInputPasswordDialog("Informe o EMAIL do administrador", false, this);
        if(!email.isEmpty()){
            String senha = util.abrirInputPasswordDialog("Informe a SENHA do administrador", true, this);
            if(usuarioRepositorio.Autenticar(email, senha) != null){
                CaixaTela.transacaoFinanceira.getItens().remove(itemVenda);
            }else if(!senha.isEmpty()){
                util.abrirJOptionPane("erro", "Email ou senha incorretos", this);
            }
        }
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtCode;
    private javax.swing.JLabel txtProductName;
    private javax.swing.JFormattedTextField txtQuantidade;
    private javax.swing.JTextField txtSubTotal;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables

    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == java.awt.event.KeyEvent.VK_ESCAPE){
            this.dispose();
        }else if(e.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER){
            salvarOperacao();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }
}
