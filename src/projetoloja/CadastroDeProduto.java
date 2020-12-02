package projetoloja;

import br.com.projetoloja.dao.ProdutoDao;
import br.com.projetoloja.modelo.Produtos;
import javax.swing.table.DefaultTableModel;

public class CadastroDeProduto extends javax.swing.JFrame {
    
    public CadastroDeProduto() {
        initComponents();
        loadTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        txtNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtQTD = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDesc = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtPreco = new javax.swing.JFormattedTextField();
        btnDeletar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        btnInserir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTProdutos = new javax.swing.JTable();
        txtAtualizar = new javax.swing.JButton();
        idField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Maiandra GD", 0, 14)); // NOI18N
        jLabel2.setText("Nome do Produto:");

        jLabel4.setFont(new java.awt.Font("Maiandra GD", 0, 14)); // NOI18N
        jLabel4.setText("Quantidade:");

        jLabel5.setFont(new java.awt.Font("Maiandra GD", 0, 14)); // NOI18N
        jLabel5.setText("Preço:");

        jLabel6.setFont(new java.awt.Font("Maiandra GD", 0, 14)); // NOI18N
        jLabel6.setText("Descrição:");

        try {
            txtPreco.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        btnDeletar.setBackground(new java.awt.Color(255, 255, 255));
        btnDeletar.setFont(new java.awt.Font("Maiandra GD", 0, 14)); // NOI18N
        btnDeletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/sair.png"))); // NOI18N
        btnDeletar.setText("Deletar");
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });

        btnSair.setBackground(new java.awt.Color(255, 255, 255));
        btnSair.setFont(new java.awt.Font("Maiandra GD", 0, 14)); // NOI18N
        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/setaPoha.png"))); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btnInserir.setBackground(new java.awt.Color(255, 255, 255));
        btnInserir.setFont(new java.awt.Font("Maiandra GD", 0, 14)); // NOI18N
        btnInserir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetoloja/livru.png"))); // NOI18N
        btnInserir.setText("Inserir");
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });

        jTProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Qtd", "Descrição", "Preço"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTProdutos.setGridColor(new java.awt.Color(255, 255, 255));
        jTProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTProdutosMouseClicked(evt);
            }
        });
        jTProdutos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTProdutosKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(jTProdutos);
        if (jTProdutos.getColumnModel().getColumnCount() > 0) {
            jTProdutos.getColumnModel().getColumn(0).setResizable(false);
            jTProdutos.getColumnModel().getColumn(1).setResizable(false);
            jTProdutos.getColumnModel().getColumn(2).setResizable(false);
            jTProdutos.getColumnModel().getColumn(3).setResizable(false);
            jTProdutos.getColumnModel().getColumn(4).setResizable(false);
        }

        txtAtualizar.setBackground(new java.awt.Color(255, 255, 255));
        txtAtualizar.setFont(new java.awt.Font("Maiandra GD", 0, 14)); // NOI18N
        txtAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/VOLTA.png"))); // NOI18N
        txtAtualizar.setText("Atualizar");
        txtAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAtualizarActionPerformed(evt);
            }
        });

        idField.setEditable(false);
        idField.setFocusable(false);
        idField.setOpaque(false);
        idField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idFieldActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Maiandra GD", 0, 14)); // NOI18N
        jLabel3.setText("ID:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel6)
                                    .addComponent(txtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(64, 64, 64))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(245, 245, 245)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtQTD, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQTD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Maiandra GD", 0, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/PENINHA.png"))); // NOI18N
        jLabel7.setText("Cadastro De Produtos");
        jPanel4.add(jLabel7);
        jLabel7.setBounds(0, 0, 400, 60);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/XINHOBAAAA.png"))); // NOI18N
        jPanel4.add(jLabel1);
        jLabel1.setBounds(0, 0, 410, 70);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        Produtos p = new Produtos();
        ProdutoDao dao = new ProdutoDao();
        
        p.setNomeProduto(txtNome.getText());
        p.setQtd(Integer.parseInt(txtQTD.getText()));
        p.setPrecoProduto(Double.parseDouble(txtPreco.getText()));
        p.setDescProduto(txtDesc.getText());
        
        dao.inserir(p);
        
        DefaultTableModel dtmProdutos = (DefaultTableModel) jTProdutos.getModel();
        Object[] dados = {null, txtNome.getText(),txtQTD.getText(), txtPreco.getText(), txtDesc.getText() };
        dtmProdutos.addRow(dados);  
        
        loadTable();
    }//GEN-LAST:event_btnInserirActionPerformed

    private void loadTable(){
        DefaultTableModel modelo = (DefaultTableModel) jTProdutos.getModel();
        modelo.setNumRows(0);
        
        jTProdutos.getColumnModel().getColumn(0).setPreferredWidth(3);
        jTProdutos.getColumnModel().getColumn(1).setPreferredWidth(20);  
        jTProdutos.getColumnModel().getColumn(2).setPreferredWidth(5);
        jTProdutos.getColumnModel().getColumn(3).setPreferredWidth(6);
        jTProdutos.getColumnModel().getColumn(4).setPreferredWidth(40);
        
        ProdutoDao dao = new ProdutoDao();
        
        for(Produtos p: dao.listar()){
            modelo.addRow(new Object[]{
                p.getIdProduto(),
                p.getNomeProduto(),
                p.getQtd(),
                p.getDescProduto(),
                p.getPrecoProduto()  
                
            });
        }
    }
    
    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        Produtos p = new Produtos();
        ProdutoDao dao = new ProdutoDao();
     
        int index = jTProdutos.getSelectedRow();
        
        p = dao.listar().get(index);
        
        p.setIdProduto(Integer.parseInt(idField.getText()));
        dao.remover(p);
        
        loadTable();
    }//GEN-LAST:event_btnDeletarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        CadastrarProduto cadP = new CadastrarProduto();
        this.dispose();
        cadP.setVisible(true);
    }//GEN-LAST:event_btnSairActionPerformed

    private void txtAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAtualizarActionPerformed
        Produtos p = new Produtos();
        ProdutoDao dao = new ProdutoDao();
        
        
        int index = jTProdutos.getSelectedRow();
        
        p = dao.listar().get(index);
        
        p.setNomeProduto(txtNome.getText());
        p.setQtd(Integer.parseInt(txtQTD.getText()));
        p.setDescProduto(txtDesc.getText());
        p.setPrecoProduto(Double.parseDouble(txtPreco.getText()));
        p.setIdProduto(Integer.parseInt(idField.getText()));
        
        dao.alterar(p);
        
        loadTable();
        
    }//GEN-LAST:event_txtAtualizarActionPerformed

    private void jTProdutosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTProdutosKeyReleased
        if(jTProdutos.getSelectedRow() != -1){
            
            txtNome.setText(jTProdutos.getValueAt(jTProdutos.getSelectedRow(), 1).toString());
            txtQTD.setText(jTProdutos.getValueAt(jTProdutos.getSelectedRow(), 2).toString());
            txtPreco.setText(jTProdutos.getValueAt(jTProdutos.getSelectedRow(), 3).toString());
            txtDesc.setText(jTProdutos.getValueAt(jTProdutos.getSelectedRow(), 4).toString());
        
        }
    }//GEN-LAST:event_jTProdutosKeyReleased

    private void jTProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTProdutosMouseClicked
        Produtos p = new Produtos();
        ProdutoDao dao = new ProdutoDao();
        
        int index = jTProdutos.getSelectedRow();
        
        p = dao.listar().get(index);
        
        txtNome.setText(p.getNomeProduto());
        txtQTD.setText(String.valueOf(p.getQtd()));
        txtDesc.setText(p.getDescProduto());
        txtPreco.setText(String.valueOf(p.getPrecoProduto()));
        idField.setText(String.valueOf(p.getIdProduto()));
    }//GEN-LAST:event_jTProdutosMouseClicked

    private void idFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idFieldActionPerformed

    
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
            java.util.logging.Logger.getLogger(CadastroDeProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroDeProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroDeProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroDeProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroDeProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnInserir;
    private javax.swing.JButton btnSair;
    private javax.swing.JTextField idField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTProdutos;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton txtAtualizar;
    private javax.swing.JTextField txtDesc;
    private javax.swing.JTextField txtNome;
    private javax.swing.JFormattedTextField txtPreco;
    private javax.swing.JTextField txtQTD;
    // End of variables declaration//GEN-END:variables
}
