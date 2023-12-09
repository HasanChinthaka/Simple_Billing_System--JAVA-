/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.simple_billing_system;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class view extends javax.swing.JFrame {

    /**
     * Creates new form view
     */
    public view() {
        initComponents();
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
        jLabel1 = new javax.swing.JLabel();
        Title = new javax.swing.JLabel();
        Item_List = new javax.swing.JComboBox<>();
        Unit_Price_lbl = new javax.swing.JLabel();
        Total = new javax.swing.JLabel();
        Qty = new javax.swing.JTextField();
        Unit_Price = new javax.swing.JLabel();
        Add_Item = new javax.swing.JButton();
        Remove_Item = new javax.swing.JButton();
        Net_Total = new javax.swing.JLabel();
        Net_Total_lbl = new javax.swing.JLabel();
        currency_type = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        currency_type3 = new javax.swing.JLabel();
        Qty_lbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table_view = new javax.swing.JTable();
        Total_Price = new javax.swing.JLabel();
        Btn_Clear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Item Name");

        Title.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        Title.setForeground(new java.awt.Color(204, 204, 204));
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("Simple Billing System");

        Item_List.setBackground(new java.awt.Color(204, 204, 204));
        Item_List.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Item_List.setForeground(new java.awt.Color(0, 0, 0));
        Item_List.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Select Item -", "USB Mouse", "USB Keyboard", "24 inch Monitor", "Intel i3 13th Gen Processor", "Intel i5 13th Gen Processor", "Intel i7 13th Gen Processor", "Intel i9 13th Gen Processor", "AMD Ryzen 5 7600", "AMD Ryzen 5 5600G", "AMD Ryzen 7 5800X", "AMD Ryzen 9 7950X", "AMD Threadripper 3990X", "NVIDIA GeForce RTX 3060 8Gb - ASUS", "NVIDIA GeForce RTX 4090 24Gb - ASUS" }));
        Item_List.setToolTipText("Click the arrow to view the list of items");
        Item_List.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Item_ListActionPerformed(evt);
            }
        });

        Unit_Price_lbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Unit_Price_lbl.setForeground(new java.awt.Color(204, 204, 204));
        Unit_Price_lbl.setText("Unit Price");

        Total.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Total.setForeground(new java.awt.Color(204, 204, 204));
        Total.setText("Total Price");

        Qty.setBackground(new java.awt.Color(204, 204, 204));
        Qty.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Qty.setForeground(new java.awt.Color(0, 0, 0));
        Qty.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Qty.setToolTipText("Press 'ENTER' to calculate the total price");
        Qty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QtyActionPerformed(evt);
            }
        });
        Qty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                QtyKeyReleased(evt);
            }
        });

        Unit_Price.setBackground(new java.awt.Color(51, 51, 51));
        Unit_Price.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Unit_Price.setForeground(new java.awt.Color(204, 204, 204));
        Unit_Price.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Unit_Price.setText("0.00");

        Add_Item.setBackground(new java.awt.Color(0, 0, 153));
        Add_Item.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Add_Item.setForeground(new java.awt.Color(204, 204, 204));
        Add_Item.setText("Add Item");
        Add_Item.setToolTipText("Add a new item to the bill");
        Add_Item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_ItemActionPerformed(evt);
            }
        });

        Remove_Item.setBackground(new java.awt.Color(153, 0, 0));
        Remove_Item.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Remove_Item.setText("Remove Item");
        Remove_Item.setToolTipText("Remove an item from the bill");
        Remove_Item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Remove_ItemActionPerformed(evt);
            }
        });

        Net_Total.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Net_Total.setForeground(new java.awt.Color(0, 204, 204));
        Net_Total.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Net_Total.setText("0.00");

        Net_Total_lbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Net_Total_lbl.setForeground(new java.awt.Color(0, 204, 204));
        Net_Total_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Net_Total_lbl.setText(" Net Total");

        currency_type.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        currency_type.setText("LKR");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("LKR");

        currency_type3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        currency_type3.setForeground(new java.awt.Color(0, 204, 204));
        currency_type3.setText("LKR");

        Qty_lbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Qty_lbl.setForeground(new java.awt.Color(204, 204, 204));
        Qty_lbl.setText("Quantity");

        Table_view.setAutoCreateRowSorter(true);
        Table_view.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Black", 1, 18))); // NOI18N
        Table_view.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Table_view.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Name", "Unit Price", "Quantity", "Total"
            }
        ));
        jScrollPane1.setViewportView(Table_view);

        Total_Price.setBackground(new java.awt.Color(51, 51, 51));
        Total_Price.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Total_Price.setForeground(new java.awt.Color(204, 204, 204));
        Total_Price.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Total_Price.setText("0.00");

        Btn_Clear.setBackground(new java.awt.Color(204, 102, 0));
        Btn_Clear.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Btn_Clear.setForeground(new java.awt.Color(204, 204, 204));
        Btn_Clear.setText("Clear");
        Btn_Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Unit_Price_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Qty, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Item_List, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(Unit_Price, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(currency_type)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Net_Total_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(Add_Item)
                                        .addGap(42, 42, 42)
                                        .addComponent(Remove_Item))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(Total_Price, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel4)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(18, 73, Short.MAX_VALUE)
                                        .addComponent(Net_Total, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(currency_type3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(52, 52, 52)
                                        .addComponent(Btn_Clear)
                                        .addGap(0, 0, Short.MAX_VALUE))))))
                    .addComponent(Total, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Qty_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1)
                    .addComponent(Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(33, 33, 33))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(Title)
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Item_List, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Unit_Price, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(currency_type, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Unit_Price_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Qty_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Qty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Net_Total_lbl))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Total, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Total_Price)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(currency_type3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Net_Total, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Remove_Item)
                    .addComponent(Add_Item)
                    .addComponent(Btn_Clear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Item_ListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Item_ListActionPerformed
        String item = Item_List.getSelectedItem().toString();
        String unit_price = "0.00";
        if (item == "USB Mouse"){
            unit_price = "650.00";
        }
        else if (item == "USB Keyboard"){
            unit_price = "800.00";
        }
        else if (item == "24 inch Monitor"){
            unit_price = "33200.00";
        }
        else if (item == "Intel i3 13th Gen Processor"){
            unit_price = "52000.00";
        }
        else if (item == "Intel i5 13th Gen Processor"){
            unit_price = "113500.00";
        }
        else if (item == "Intel i7 13th Gen Processor"){
            unit_price = "145500.00";
        }
        else if (item == "Intel i9 13th Gen Processor"){
            unit_price = "215500.00";
        }
        else if (item == "AMD Ryzen 5 7600"){
            unit_price = "89000.00";
        }
        else if (item == "AMD Ryzen 5 5600G"){
            unit_price = "44500.00";
        }
        else if (item == "AMD Ryzen 7 5800X"){
            unit_price = "64000.00";
        }
        else if (item == "AMD Ryzen 9 7950X"){
            unit_price = "185000.00";
        }
        else if (item == "AMD Threadripper 3990X"){
            unit_price = "998500.00";
        }
        else if (item == "NVIDIA GeForce RTX 3060 8Gb - ASUS"){
            unit_price = "94000.00";
        }
        else if (item == "NVIDIA GeForce RTX 4090 24Gb - ASUS"){
            unit_price = "879500.00";
        }
        else{
            unit_price = "0.00";
        }
        Unit_Price.setText(unit_price);
    }//GEN-LAST:event_Item_ListActionPerformed

    private void QtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QtyActionPerformed
        
    }//GEN-LAST:event_QtyActionPerformed

    private void Add_ItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_ItemActionPerformed
//        Entry in item details table
        String item = Item_List.getSelectedItem().toString();
        int qty = Integer.parseInt(Qty.getText());
        Double total = Double.parseDouble(Total_Price.getText());
        Double net_total = Double.parseDouble(Net_Total.getText());
        Double unit_price = Double.parseDouble(Unit_Price.getText());
        
        DefaultTableModel table = (DefaultTableModel) Table_view.getModel();
        table.addRow(new Object[] {item,unit_price,qty,total});
//        Caculate Net Total        
        net_total = net_total + total;
        Net_Total.setText(String.valueOf(net_total));
//        Clear Form
        Item_List.setSelectedIndex(0);
        Unit_Price.setText("0.00");
        Qty.setText(null);
        Total_Price.setText("0.00");
    }//GEN-LAST:event_Add_ItemActionPerformed

    private void Btn_ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ClearActionPerformed
        Item_List.setSelectedIndex(0);
        Unit_Price.setText("0.00");
        Qty.setText(null);
        Total_Price.setText("0.00");
    }//GEN-LAST:event_Btn_ClearActionPerformed

    private void QtyKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_QtyKeyReleased
        int qty = Integer.parseInt(Qty.getText());
        Double unit_price = Double.parseDouble(Unit_Price.getText());
        Double total = qty * unit_price;
        Total_Price.setText(String.valueOf(total));
    }//GEN-LAST:event_QtyKeyReleased

    private void Remove_ItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Remove_ItemActionPerformed
        DefaultTableModel table = (DefaultTableModel) Table_view.getModel();
        int s_row = table.getSelectedRow();
        Double total = Double.parseDouble(table.getValueAt(s_row,3).toString());
        Double net_total = Double.parseDouble(Net_Total.getText());
        Double new_net_total = net_total - total;
        Net_Total.setText(String.valueOf(new_net_total));
        table.removeRow(s_row);
    }//GEN-LAST:event_Remove_ItemActionPerformed

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
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new view().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add_Item;
    private javax.swing.JButton Btn_Clear;
    private javax.swing.JComboBox<String> Item_List;
    private javax.swing.JLabel Net_Total;
    private javax.swing.JLabel Net_Total_lbl;
    private javax.swing.JTextField Qty;
    private javax.swing.JLabel Qty_lbl;
    private javax.swing.JButton Remove_Item;
    private javax.swing.JTable Table_view;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel Total;
    private javax.swing.JLabel Total_Price;
    private javax.swing.JLabel Unit_Price;
    private javax.swing.JLabel Unit_Price_lbl;
    private javax.swing.JLabel currency_type;
    private javax.swing.JLabel currency_type3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void elif(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}