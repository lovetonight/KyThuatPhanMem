/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import Bean.DanhMucBean;
import controllers.MainController;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;


public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        setTitle("QUẢN LÝ NHÂN KHẨU");
        List<DanhMucBean> listDanhMuc = new ArrayList<>();
        listDanhMuc.add(new DanhMucBean("TrangChu", Home, jblTrangChu));
        listDanhMuc.add(new DanhMucBean("NhanKhau", NhanKhauBtn, jlbNhanKhau));
        listDanhMuc.add(new DanhMucBean("HoKhau", HoKhauBtn, jlbHoKhau));
        listDanhMuc.add(new DanhMucBean("ThongKe", ThongKeBtn, jlbThongKe));
        listDanhMuc.add(new DanhMucBean("CuocHop", QuanLyHopBtn, jlbQuanLyHop));
        
        MainController controller = new MainController(jpnBean, this);
        controller.setView(Home, jblTrangChu, "TrangChu");
        controller.setEvent(listDanhMuc);
        
        // confirm de thuc hien dong
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                if (JOptionPane.showConfirmDialog(null, "Are you sure to close??", "Confirm", JOptionPane.YES_NO_OPTION) == 0) {
                    dispose();
                }
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnContainer = new javax.swing.JPanel();
        jpnMenu = new javax.swing.JPanel();
        Home = new javax.swing.JPanel();
        jblTrangChu = new javax.swing.JLabel();
        NhanKhauBtn = new javax.swing.JPanel();
        jlbNhanKhau = new javax.swing.JLabel();
        HoKhauBtn = new javax.swing.JPanel();
        jlbHoKhau = new javax.swing.JLabel();
        ThongKeBtn = new javax.swing.JPanel();
        jlbThongKe = new javax.swing.JLabel();
        QuanLyHopBtn = new javax.swing.JPanel();
        jlbQuanLyHop = new javax.swing.JLabel();
        jpnBean = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpnContainer.setBackground(new java.awt.Color(255, 255, 255));

        jpnMenu.setBackground(new java.awt.Color(153, 153, 153));

        Home.setBackground(new java.awt.Color(79, 166, 209));

        jblTrangChu.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jblTrangChu.setForeground(new java.awt.Color(255, 255, 255));
        jblTrangChu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-smiling-browser-64.png"))); // NOI18N
        jblTrangChu.setText("Trang chủ");

        javax.swing.GroupLayout HomeLayout = new javax.swing.GroupLayout(Home);
        Home.setLayout(HomeLayout);
        HomeLayout.setHorizontalGroup(
            HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jblTrangChu)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        HomeLayout.setVerticalGroup(
            HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HomeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jblTrangChu)
                .addGap(21, 21, 21))
        );

        NhanKhauBtn.setBackground(new java.awt.Color(102, 102, 102));
        NhanKhauBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jlbNhanKhau.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlbNhanKhau.setForeground(new java.awt.Color(255, 255, 255));
        jlbNhanKhau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-user-groups-32.png"))); // NOI18N
        jlbNhanKhau.setText("Nhân Khẩu");

        javax.swing.GroupLayout NhanKhauBtnLayout = new javax.swing.GroupLayout(NhanKhauBtn);
        NhanKhauBtn.setLayout(NhanKhauBtnLayout);
        NhanKhauBtnLayout.setHorizontalGroup(
            NhanKhauBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NhanKhauBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbNhanKhau)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        NhanKhauBtnLayout.setVerticalGroup(
            NhanKhauBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NhanKhauBtnLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlbNhanKhau)
                .addContainerGap())
        );

        HoKhauBtn.setBackground(new java.awt.Color(102, 102, 102));

        jlbHoKhau.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlbHoKhau.setForeground(new java.awt.Color(255, 255, 255));
        jlbHoKhau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-country-house-32.png"))); // NOI18N
        jlbHoKhau.setText("Hộ Khẩu");

        javax.swing.GroupLayout HoKhauBtnLayout = new javax.swing.GroupLayout(HoKhauBtn);
        HoKhauBtn.setLayout(HoKhauBtnLayout);
        HoKhauBtnLayout.setHorizontalGroup(
            HoKhauBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HoKhauBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbHoKhau)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        HoKhauBtnLayout.setVerticalGroup(
            HoKhauBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HoKhauBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbHoKhau)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ThongKeBtn.setBackground(new java.awt.Color(102, 102, 102));

        jlbThongKe.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlbThongKe.setForeground(new java.awt.Color(255, 255, 255));
        jlbThongKe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-analytics-32.png"))); // NOI18N
        jlbThongKe.setText("Thống Kê");

        javax.swing.GroupLayout ThongKeBtnLayout = new javax.swing.GroupLayout(ThongKeBtn);
        ThongKeBtn.setLayout(ThongKeBtnLayout);
        ThongKeBtnLayout.setHorizontalGroup(
            ThongKeBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ThongKeBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbThongKe)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ThongKeBtnLayout.setVerticalGroup(
            ThongKeBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ThongKeBtnLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlbThongKe)
                .addContainerGap())
        );

        QuanLyHopBtn.setBackground(new java.awt.Color(102, 102, 102));

        jlbQuanLyHop.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlbQuanLyHop.setForeground(new java.awt.Color(255, 255, 255));
        jlbQuanLyHop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-group-task-32 (1).png"))); // NOI18N
        jlbQuanLyHop.setText("Quản Lý Họp");

        javax.swing.GroupLayout QuanLyHopBtnLayout = new javax.swing.GroupLayout(QuanLyHopBtn);
        QuanLyHopBtn.setLayout(QuanLyHopBtnLayout);
        QuanLyHopBtnLayout.setHorizontalGroup(
            QuanLyHopBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QuanLyHopBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbQuanLyHop)
                .addContainerGap(45, Short.MAX_VALUE))
        );
        QuanLyHopBtnLayout.setVerticalGroup(
            QuanLyHopBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, QuanLyHopBtnLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlbQuanLyHop)
                .addContainerGap())
        );

        jlbQuanLyHop.getAccessibleContext().setAccessibleParent(jlbQuanLyHop);

        javax.swing.GroupLayout jpnMenuLayout = new javax.swing.GroupLayout(jpnMenu);
        jpnMenu.setLayout(jpnMenuLayout);
        jpnMenuLayout.setHorizontalGroup(
            jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpnMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NhanKhauBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(HoKhauBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ThongKeBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jpnMenuLayout.createSequentialGroup()
                        .addComponent(QuanLyHopBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jpnMenuLayout.setVerticalGroup(
            jpnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnMenuLayout.createSequentialGroup()
                .addComponent(Home, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(NhanKhauBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(HoKhauBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ThongKeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(QuanLyHopBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpnBeanLayout = new javax.swing.GroupLayout(jpnBean);
        jpnBean.setLayout(jpnBeanLayout);
        jpnBeanLayout.setHorizontalGroup(
            jpnBeanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 791, Short.MAX_VALUE)
        );
        jpnBeanLayout.setVerticalGroup(
            jpnBeanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 481, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpnContainerLayout = new javax.swing.GroupLayout(jpnContainer);
        jpnContainer.setLayout(jpnContainerLayout);
        jpnContainerLayout.setHorizontalGroup(
            jpnContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnContainerLayout.createSequentialGroup()
                .addComponent(jpnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpnBean, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnContainerLayout.setVerticalGroup(
            jpnContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpnContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpnBean, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel HoKhauBtn;
    private javax.swing.JPanel Home;
    private javax.swing.JPanel NhanKhauBtn;
    private javax.swing.JPanel QuanLyHopBtn;
    private javax.swing.JPanel ThongKeBtn;
    private javax.swing.JLabel jblTrangChu;
    private javax.swing.JLabel jlbHoKhau;
    private javax.swing.JLabel jlbNhanKhau;
    private javax.swing.JLabel jlbQuanLyHop;
    private javax.swing.JLabel jlbThongKe;
    private javax.swing.JPanel jpnBean;
    private javax.swing.JPanel jpnContainer;
    private javax.swing.JPanel jpnMenu;
    // End of variables declaration//GEN-END:variables
}
