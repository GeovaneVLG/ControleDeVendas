/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import model.bean.Produto;
import model.dao.ProdutoDAO;

/**
 *
 * @author geova
 */
public class TelaVendas extends javax.swing.JFrame {
    ProdutoDAO dao = new ProdutoDAO();
    double valor = 0;
    String nomeCliente;
    List<Produto> produtosLista = new ArrayList<>();
    /**
     * Creates new form Tbia
     */
    public TelaVendas() {
        initComponents();
        jBRemover.setEnabled(false);
        jBFinalizar.setEnabled(false);
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTAbelaProdutosCompra = new javax.swing.JTable();
        jTCliente = new javax.swing.JTextField();
        jTProduto = new javax.swing.JTextField();
        jTQuantidade = new javax.swing.JTextField();
        jBAdicionar = new javax.swing.JButton();
        jBRemover = new javax.swing.JButton();
        jBFinalizar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLValor = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("VENDAS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("CLIENTE:");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("PRODUTO:");

        jLabel4.setText("QUANTIDADE:");

        jTAbelaProdutosCompra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PRODUTO", "QUANTIDADE", "ESTOQUE", "PREÇO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTAbelaProdutosCompra.setCellSelectionEnabled(true);
        jTAbelaProdutosCompra.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTAbelaProdutosCompra.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTAbelaProdutosCompra.getTableHeader().setReorderingAllowed(false);
        jTAbelaProdutosCompra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTAbelaProdutosCompraMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTAbelaProdutosCompra);
        jTAbelaProdutosCompra.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jTCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTClienteActionPerformed(evt);
            }
        });

        jTProduto.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTQuantidade.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jBAdicionar.setBackground(new java.awt.Color(0, 51, 51));
        jBAdicionar.setForeground(new java.awt.Color(255, 255, 255));
        jBAdicionar.setText("ADICIONAR");
        jBAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAdicionarActionPerformed(evt);
            }
        });

        jBRemover.setBackground(new java.awt.Color(0, 51, 51));
        jBRemover.setForeground(new java.awt.Color(255, 255, 255));
        jBRemover.setText("REMOVER ITEM");
        jBRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRemoverActionPerformed(evt);
            }
        });

        jBFinalizar.setBackground(new java.awt.Color(0, 51, 51));
        jBFinalizar.setForeground(new java.awt.Color(255, 255, 255));
        jBFinalizar.setText("FINALIZAR");
        jBFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBFinalizarActionPerformed(evt);
            }
        });

        jLabel5.setText("VALOR:");

        jLValor.setText("R$ 0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTProduto)
                    .addComponent(jTCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBAdicionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBRemover, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(jBFinalizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(36, 36, 36))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel5)
                .addGap(165, 165, 165)
                .addComponent(jLValor)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jBAdicionar)
                    .addComponent(jTCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jBRemover)
                    .addComponent(jTProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jBFinalizar)
                    .addComponent(jTQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLValor))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTClienteActionPerformed
    }//GEN-LAST:event_jTClienteActionPerformed

    private void jBFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBFinalizarActionPerformed
        abrirTela(nomeCliente,valor,produtosLista);
        fechar();
    }//GEN-LAST:event_jBFinalizarActionPerformed

    private void jBAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAdicionarActionPerformed
        nomeCliente = jTCliente.getText();
        Produto p = (Produto) dao.readProduto(jTProduto.getText().toLowerCase());        
        
        if (p != null){
            if(!"".equals(jTQuantidade.getText())){
                if (p.getQuantidade() >= Integer.parseInt(jTQuantidade.getText())){
                    DefaultTableModel dm = (DefaultTableModel) jTAbelaProdutosCompra.getModel();
                    Object[] dados = {jTProduto.getText().toLowerCase(),jTQuantidade.getText(), p.getQuantidade(), p.getPreco()};
                    dm.addRow(dados);
                    p.setQuantidade(Integer.parseInt(jTQuantidade.getText()));
                    produtosLista.add(p);
                    valor = valor + (Integer.parseInt(jTQuantidade.getText()) * p.getPreco());
                    jLValor.setText("R$ " + valor);
                    jTProduto.setText("");
                    jTQuantidade.setText("");
                }else{
                    JOptionPane.showMessageDialog(null,"Apenas " + p.getQuantidade() + " unidades do Produto " + jTProduto.getText() + "!");
                }
            }else{
                JOptionPane.showMessageDialog(null,"Quantidade não informada!");
            }
        }else{
            JOptionPane.showMessageDialog(null,"Produto " + jTProduto.getText() + " não existe!");
            jTProduto.setText("");
            jTQuantidade.setText("");
        }
        
        if(jTAbelaProdutosCompra.getRowCount() > 0){
            jBFinalizar.setEnabled(true);
        }
    }//GEN-LAST:event_jBAdicionarActionPerformed

    private void jBRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRemoverActionPerformed
        DefaultTableModel dm = (DefaultTableModel) jTAbelaProdutosCompra.getModel();
        Produto p = (Produto) dao.readProduto(jTProduto.getText().toLowerCase());
        valor = valor - (p.getPreco() * Integer.parseInt(jTQuantidade.getText()));
        if(valor < 0){
            valor = valor * -1;
        }
        for(int i=0;i<produtosLista.size();i++){
            Produto prod = produtosLista.get(i);
            if(prod.getNome().equals(p.getNome())){
                produtosLista.remove(prod);
            }
        }
        dm.removeRow(jTAbelaProdutosCompra.getSelectedRow());
        jLValor.setText("R$ " + valor);
        jBRemover.setEnabled(false);
        jTProduto.setText("");
        jTQuantidade.setText("");
        
        if(jTAbelaProdutosCompra.getRowCount() == 0){
            jBFinalizar.setEnabled(false);
        }
    }//GEN-LAST:event_jBRemoverActionPerformed

    private void jTAbelaProdutosCompraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTAbelaProdutosCompraMousePressed
        int linhaSelecionada = jTAbelaProdutosCompra.getSelectedRow();
        jBRemover.setEnabled(true);
        jTAbelaProdutosCompra.getSelectedRow();
        jTProduto.setText(String.valueOf(jTAbelaProdutosCompra.getValueAt(linhaSelecionada,0)));
        jTQuantidade.setText(String.valueOf(jTAbelaProdutosCompra.getValueAt(linhaSelecionada,1)));
    }//GEN-LAST:event_jTAbelaProdutosCompraMousePressed

    public void abrirTela(String nome,double valor,List<Produto> listprod){
        TelaCaixa s = new TelaCaixa(nome,valor,listprod);
        s.setVisible(true);
    }
    
    public void fechar(){
        this.setVisible(false);
    }
    
    
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaVendas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAdicionar;
    private javax.swing.JButton jBFinalizar;
    private javax.swing.JButton jBRemover;
    private javax.swing.JLabel jLValor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTAbelaProdutosCompra;
    private javax.swing.JTextField jTCliente;
    private javax.swing.JTextField jTProduto;
    private javax.swing.JTextField jTQuantidade;
    // End of variables declaration//GEN-END:variables
}