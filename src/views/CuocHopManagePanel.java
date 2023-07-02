
package views;

import controllers.CuocHopPanelController;
import views.CuocHopManagerFrame.DeleteCuocHop;
import views.CuocHopManagerFrame.EditCuocHop;
import views.CuocHopManagerFrame.ThemMoiCuocHop;

import javax.swing.*;


public class CuocHopManagePanel extends javax.swing.JPanel {

    private JFrame parentFrame;
    private CuocHopPanelController controller;
    /**
     * Creates new form CuocHopManagePanel
     */
    public CuocHopManagePanel(JFrame parentFrame) {
        this.parentFrame = parentFrame;
        initComponents();
        controller = new CuocHopPanelController(jtfSearch, tableJpn, StatusJcb);
        controller.setParentJFrame(parentFrame);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        themMoiBtn = new javax.swing.JButton();
        tableJpn = new javax.swing.JPanel();
        jtfSearch = new javax.swing.JTextField();
        showBtn = new javax.swing.JButton();
        StatusJcb = new javax.swing.JComboBox<>();
        statusChoose = new javax.swing.JLabel();
        editBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();

        themMoiBtn.setText("Thêm Mới");
        themMoiBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themMoiBtnActionPerformed(evt);
            }
        });

        tableJpn.setPreferredSize(new java.awt.Dimension(0, 0));

        javax.swing.GroupLayout tableJpnLayout = new javax.swing.GroupLayout(tableJpn);
        tableJpn.setLayout(tableJpnLayout);
        tableJpnLayout.setHorizontalGroup(
            tableJpnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 547, Short.MAX_VALUE)
        );
        tableJpnLayout.setVerticalGroup(
            tableJpnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 373, Short.MAX_VALUE)
        );

        jtfSearch.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtfSearch.setToolTipText("");
        jtfSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfSearchActionPerformed(evt);
            }
        });

        showBtn.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        showBtn.setText("Show");
        showBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showBtnActionPerformed(evt);
            }
        });

        StatusJcb.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        StatusJcb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Toàn bộ", "Hôm nay", "Đã họp", "Chưa họp" }));

        statusChoose.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        statusChoose.setText("Trạng thái");

        editBtn.setText("Sửa ");
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });

        deleteBtn.setText("Xóa Cuộc Họp");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tableJpn, javax.swing.GroupLayout.DEFAULT_SIZE, 547, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jtfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(statusChoose)
                        .addGap(18, 18, 18)
                        .addComponent(StatusJcb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(17, 17, 17)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(showBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(themMoiBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(editBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deleteBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(51, 51, 51))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtfSearch)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(showBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(StatusJcb, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(statusChoose, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tableJpn, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(themMoiBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void themMoiBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themMoiBtnActionPerformed
        ThemMoiCuocHop themMoiCuocHop = new ThemMoiCuocHop(this.parentFrame);
        themMoiCuocHop.setLocationRelativeTo(null);
        themMoiCuocHop.setResizable(false);
        themMoiCuocHop.setVisible(true);
        this.controller.setData();
    }//GEN-LAST:event_themMoiBtnActionPerformed

    private void jtfSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfSearchActionPerformed

    private void showBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showBtnActionPerformed
        this.controller.setData();
    }//GEN-LAST:event_showBtnActionPerformed

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        EditCuocHop editCuocHop = new EditCuocHop(this.parentFrame);
        editCuocHop.setLocationRelativeTo(null);
        editCuocHop.setResizable(false);
        editCuocHop.setVisible(true);
    }//GEN-LAST:event_editBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        DeleteCuocHop deleteCuocHop = new DeleteCuocHop(this.parentFrame);
        deleteCuocHop.setLocationRelativeTo(null);
        deleteCuocHop.setResizable(false);
        deleteCuocHop.setVisible(true);
    }//GEN-LAST:event_deleteBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> StatusJcb;
    private javax.swing.JButton themMoiBtn;
    private javax.swing.JButton showBtn;
    private javax.swing.JButton editBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel statusChoose;
    private javax.swing.JPanel tableJpn;
    private javax.swing.JTextField jtfSearch;
    // End of variables declaration//GEN-END:variables
}
