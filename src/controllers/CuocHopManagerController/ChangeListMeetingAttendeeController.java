package controllers.CuocHopManagerController;

import java.util.EventObject;
import java.util.List;

import javax.print.Doc;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.BorderLayout;

import Bean.HoKhauBean;
import Bean.MemOfMeeting;
import Bean.NhanKhauBean;
import services.CuocHopService;
import services.HoKhauService;
import services.NhanKhauService;
import utility.TableModelCuocHop;

public class ChangeListMeetingAttendeeController {
    
    private JButton addBtn;
    private JButton removeBtn;
    private JTextField searchJtf;
    private JPanel peopleJpn;
    private JPanel memJpn;
    private List<MemOfMeeting> listMember;
    private List<NhanKhauBean> listPeople;
    private final NhanKhauService nhanKhauService = new NhanKhauService();
    private final CuocHopService cuocHopService = new CuocHopService();
    private final TableModelCuocHop tableModelCuocHop = new TableModelCuocHop();
    private final String[] COLUMNS_1 = {"Họ tên", "Giới tính", "Ngày sinh", "Địa chỉ hiện nay", "Số CMT"};
    private final String[] COLUMNS_2 = {"Họ tên", "Ngày Sinh", "Giới tính"};
    private NhanKhauBean peopleSelected;
    private MemOfMeeting memSelected;

    /**
     * Create Controller of ChangeMeetinJFrame
     * 
     * @param listMember
     * @param addBtn
     * @param removeBtn
     * @param searchJtf
     * @param peopleJpn
     * @param memJpn
    */
    public ChangeListMeetingAttendeeController(List<MemOfMeeting> listMember, JButton addBtn, JButton removeBtn, JTextField searchJtf, JPanel peopleJpn, JPanel memJpn) {
        this.listMember = listMember;
        this.listPeople = nhanKhauService.getListNhanKhau();
        this.addBtn = addBtn;
        this.removeBtn = removeBtn;
        this.searchJtf = searchJtf;
        this.peopleJpn = peopleJpn;
        this.memJpn = memJpn;
        setData();
        initAction();
    }  

    public void initAction() {
        this.searchJtf.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                String key = searchJtf.getText();
                listPeople = nhanKhauService.search(key.trim());
                setData();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                String key = searchJtf.getText();
                listPeople = nhanKhauService.search(key.trim());
                setData();
            }

            @Override 
            public void changedUpdate(DocumentEvent e) {
                String key = searchJtf.getText();
                listPeople = nhanKhauService.search(key.trim());
                setData();
            }

        });

        addBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
            }

            @Override 
            public void mouseClicked(MouseEvent e) {
                try {
                    MemOfMeeting temp = new MemOfMeeting();
                    temp.setNhanKhau(peopleSelected);
                    listMember.add(temp);
                    setData();
                } catch (Exception exception) {
                    System.err.print(exception.getMessage());
                }
            }
        });

        removeBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                listMember.remove(memSelected);
                setData();
            }
        });
    }

    void setData() {
        DefaultTableModel model_people = this.tableModelCuocHop.setTableNhanKhau(listPeople, COLUMNS_1);
        JTable table_people = new JTable(model_people){
            @Override
            public boolean editCellAt(int row, int column, EventObject e) {
                return false;   //To change body of generated methods, choose Tools | Templates.
            }
        };

        DefaultTableModel model_mem = this.tableModelCuocHop.setTableMember(listMember, COLUMNS_2);
        JTable table_mem = new JTable(model_mem){
            @Override
            public boolean editCellAt(int row, int column, EventObject e) {
                return false;   //To change body of generated methods, choose Tools | Templates.
            }
        };

        //thiet ke bang
        table_people.getTableHeader().setFont(new Font("Arial", Font.BOLD, 14));
        table_people.getTableHeader().setPreferredSize(new Dimension(100, 30));
        table_people.setRowHeight(30);
        table_people.validate();
        table_people.repaint();
        table_people.setFont(new Font("Arial", Font.PLAIN, 14));
        table_people.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
//                JOptionPane.showConfirmDialog(null, table.getSelectedRow());
                peopleSelected = listPeople.get(table_people.getSelectedRow());
            } 
        });

        table_mem.getTableHeader().setFont(new Font("Arial", Font.BOLD, 14));
        table_mem.getTableHeader().setPreferredSize(new Dimension(100, 30));
        table_mem.setRowHeight(30);
        table_mem.validate();
        table_mem.repaint();
        table_mem.setFont(new Font("Arial", Font.PLAIN, 14));
        table_mem.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
//                JOptionPane.showConfirmDialog(null, table.getSelectedRow());
                memSelected = listMember.get(table_mem.getSelectedRow());
            }
        });

        JScrollPane scroll_1 = new JScrollPane();
        scroll_1.getViewport().add(table_people);
        peopleJpn.removeAll();
        peopleJpn.setLayout(new BorderLayout());
        peopleJpn.add(scroll_1);
        peopleJpn.validate();
        peopleJpn.repaint();
        
        JScrollPane scroll_2 = new JScrollPane();
        scroll_2.getViewport().add(table_mem);
        memJpn.removeAll();
        memJpn.setLayout(new BorderLayout());
        memJpn.add(scroll_2);
        memJpn.validate();
        memJpn.repaint();
    }

    public JButton getAddBtn() {
        return addBtn;
    }

    public void setAddBtn(JButton addBtn) {
        this.addBtn = addBtn;
    }

    public JButton getRemoveBtn() {
        return removeBtn;
    }

    public void setRemoveBtn(JButton removeBtn) {
        this.removeBtn = removeBtn;
    }

    public JTextField getSearchJtf() {
        return searchJtf;
    }

    public void setSearchJtf(JTextField searchJtf) {
        this.searchJtf = searchJtf;
    }

    public JPanel getPeopleJpn() {
        return peopleJpn;
    }

    public void setPeopleJpn(JPanel peopleJpn) {
        this.peopleJpn = peopleJpn;
    }

    public JPanel getMemJpn() {
        return memJpn;
    }

    public void setMemJpn(JPanel memJpn) {
        this.memJpn = memJpn;
    }
}
