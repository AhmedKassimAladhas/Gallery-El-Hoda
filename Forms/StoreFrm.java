/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import Controls.Tools;
import DB.MethodsDB;
import Entity.Storage;
import Entity.Store;
import java.awt.Color;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author ahmed
 */
public class StoreFrm extends javax.swing.JFrame {

    /**
     * Creates new form StoreFrm
     */
    public StoreFrm() {
        initComponents();
        all.setVisible(false);
        all.setEnabled(false);
        section.setVisible(false);
        section.setEnabled(false);
        model.setVisible(false);
        model.setEnabled(false);
        stock.setVisible(false);
        stock.setEnabled(false);
        Tools.tableUI(jTSearch, 6);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        bar = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        close = new javax.swing.JPanel();
        closebtn = new javax.swing.JLabel();
        maxi = new javax.swing.JPanel();
        maxibtn = new javax.swing.JLabel();
        mini = new javax.swing.JPanel();
        minibtn = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        body = new javax.swing.JPanel();
        b = new javax.swing.JPanel();
        buttons = new javax.swing.JPanel();
        l = new javax.swing.JPanel();
        homebtn = new javax.swing.JButton();
        c = new javax.swing.JPanel();
        image = new javax.swing.JLabel();
        r = new javax.swing.JPanel();
        finishbtn = new javax.swing.JButton();
        onebtn = new javax.swing.JButton();
        allbtn = new javax.swing.JButton();
        search = new javax.swing.JPanel();
        searchLab = new javax.swing.JLabel();
        btnall = new javax.swing.JRadioButton();
        btnsec = new javax.swing.JRadioButton();
        btnmod = new javax.swing.JRadioButton();
        btnStock = new javax.swing.JRadioButton();
        stock = new javax.swing.JPanel();
        searchstore = new javax.swing.JComboBox<>();
        searchstorebtn = new javax.swing.JButton();
        model = new javax.swing.JPanel();
        searchmodel = new javax.swing.JComboBox<>();
        searchmodelbtn = new javax.swing.JButton();
        section = new javax.swing.JPanel();
        searchsec = new javax.swing.JComboBox<>();
        searchsecbtn = new javax.swing.JButton();
        all = new javax.swing.JPanel();
        searchtxt = new javax.swing.JTextField();
        searchallbtn = new javax.swing.JButton();
        table = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTSearch = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(26, 2, 2)));
        jPanel1.setLayout(new java.awt.BorderLayout());

        bar.setPreferredSize(new java.awt.Dimension(100, 30));
        bar.setLayout(new java.awt.BorderLayout());

        jPanel10.setBackground(new java.awt.Color(26, 2, 2));
        jPanel10.setLayout(new java.awt.BorderLayout());

        close.setBackground(new java.awt.Color(36, 2, 2));
        close.setPreferredSize(new java.awt.Dimension(30, 30));
        close.setLayout(new java.awt.BorderLayout());

        closebtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        closebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_close_window_26px.png"))); // NOI18N
        closebtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        closebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closebtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closebtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closebtnMouseExited(evt);
            }
        });
        close.add(closebtn, java.awt.BorderLayout.CENTER);

        jPanel10.add(close, java.awt.BorderLayout.LINE_END);

        maxi.setBackground(new java.awt.Color(26, 2, 2));
        maxi.setPreferredSize(new java.awt.Dimension(30, 30));
        maxi.setLayout(new java.awt.BorderLayout());

        maxibtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        maxibtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_maximize_window_26px_1.png"))); // NOI18N
        maxibtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        maxibtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                maxibtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                maxibtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                maxibtnMouseExited(evt);
            }
        });
        maxi.add(maxibtn, java.awt.BorderLayout.CENTER);

        jPanel10.add(maxi, java.awt.BorderLayout.CENTER);

        mini.setBackground(new java.awt.Color(26, 2, 2));
        mini.setPreferredSize(new java.awt.Dimension(30, 30));
        mini.setLayout(new java.awt.BorderLayout());

        minibtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minibtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_minimize_window_26px.png"))); // NOI18N
        minibtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minibtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minibtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minibtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minibtnMouseExited(evt);
            }
        });
        mini.add(minibtn, java.awt.BorderLayout.CENTER);

        jPanel10.add(mini, java.awt.BorderLayout.LINE_START);

        bar.add(jPanel10, java.awt.BorderLayout.LINE_END);

        jPanel13.setBackground(new java.awt.Color(26, 2, 2));
        jPanel13.setLayout(new java.awt.BorderLayout());

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(201, 201, 201));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("المخزن");
        jPanel13.add(jLabel2, java.awt.BorderLayout.CENTER);

        bar.add(jPanel13, java.awt.BorderLayout.CENTER);

        jPanel14.setBackground(new java.awt.Color(26, 2, 2));
        jPanel14.setPreferredSize(new java.awt.Dimension(50, 100));
        jPanel14.setLayout(new java.awt.BorderLayout());

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/minlo.png"))); // NOI18N
        jPanel14.add(jLabel4, java.awt.BorderLayout.CENTER);

        bar.add(jPanel14, java.awt.BorderLayout.LINE_START);

        jPanel1.add(bar, java.awt.BorderLayout.PAGE_START);

        body.setPreferredSize(new java.awt.Dimension(100, 294));
        body.setLayout(new java.awt.BorderLayout());

        b.setBackground(new java.awt.Color(255, 255, 255));
        b.setLayout(new java.awt.BorderLayout());

        buttons.setBackground(new java.awt.Color(255, 255, 255));
        buttons.setPreferredSize(new java.awt.Dimension(100, 220));
        buttons.setLayout(new java.awt.BorderLayout());

        l.setBackground(new java.awt.Color(255, 255, 255));
        l.setPreferredSize(new java.awt.Dimension(400, 100));
        l.setLayout(null);

        homebtn.setBackground(new java.awt.Color(26, 2, 2));
        homebtn.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        homebtn.setForeground(new java.awt.Color(201, 201, 201));
        homebtn.setText("الصفحة الرئيسية");
        homebtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        homebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homebtnActionPerformed(evt);
            }
        });
        l.add(homebtn);
        homebtn.setBounds(30, 80, 240, 40);

        buttons.add(l, java.awt.BorderLayout.LINE_START);

        c.setBackground(new java.awt.Color(255, 255, 255));
        c.setLayout(null);

        image.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c.add(image);
        image.setBounds(80, 40, 220, 150);

        buttons.add(c, java.awt.BorderLayout.CENTER);

        r.setBackground(new java.awt.Color(255, 255, 255));
        r.setPreferredSize(new java.awt.Dimension(500, 100));
        r.setLayout(null);

        finishbtn.setBackground(new java.awt.Color(26, 2, 2));
        finishbtn.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        finishbtn.setForeground(new java.awt.Color(201, 201, 201));
        finishbtn.setText(" المنتهية");
        finishbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        finishbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finishbtnActionPerformed(evt);
            }
        });
        r.add(finishbtn);
        finishbtn.setBounds(360, 80, 120, 40);

        onebtn.setBackground(new java.awt.Color(26, 2, 2));
        onebtn.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        onebtn.setForeground(new java.awt.Color(201, 201, 201));
        onebtn.setText(" بضاعة واحدة");
        onebtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        onebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onebtnActionPerformed(evt);
            }
        });
        r.add(onebtn);
        onebtn.setBounds(200, 80, 120, 40);

        allbtn.setBackground(new java.awt.Color(26, 2, 2));
        allbtn.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        allbtn.setForeground(new java.awt.Color(201, 201, 201));
        allbtn.setText("الكل");
        allbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        allbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allbtnActionPerformed(evt);
            }
        });
        r.add(allbtn);
        allbtn.setBounds(30, 80, 120, 40);

        buttons.add(r, java.awt.BorderLayout.LINE_END);

        b.add(buttons, java.awt.BorderLayout.PAGE_START);

        search.setBackground(new java.awt.Color(255, 255, 255));
        search.setLayout(new java.awt.GridBagLayout());

        searchLab.setBackground(new java.awt.Color(255, 255, 255));
        searchLab.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        searchLab.setForeground(new java.awt.Color(26, 2, 2));
        searchLab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        searchLab.setText("بحث بــــ :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 17;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 19, 0, 27);
        search.add(searchLab, gridBagConstraints);

        btnall.setBackground(new java.awt.Color(255, 255, 255));
        btnall.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnall.setForeground(new java.awt.Color(26, 2, 2));
        btnall.setText("الكل");
        btnall.setOpaque(false);
        btnall.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                btnallItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 18, 0, 0);
        search.add(btnall, gridBagConstraints);

        btnsec.setBackground(new java.awt.Color(255, 255, 255));
        btnsec.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnsec.setForeground(new java.awt.Color(26, 2, 2));
        btnsec.setText("القسم");
        btnsec.setOpaque(false);
        btnsec.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                btnsecItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 0);
        search.add(btnsec, gridBagConstraints);

        btnmod.setBackground(new java.awt.Color(255, 255, 255));
        btnmod.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnmod.setForeground(new java.awt.Color(26, 2, 2));
        btnmod.setText("الموديل");
        btnmod.setOpaque(false);
        btnmod.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                btnmodItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 11;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 100, 0, 0);
        search.add(btnmod, gridBagConstraints);

        btnStock.setBackground(new java.awt.Color(255, 255, 255));
        btnStock.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnStock.setForeground(new java.awt.Color(26, 2, 2));
        btnStock.setText("المخزن");
        btnStock.setOpaque(false);
        btnStock.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                btnStockItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 13;
        gridBagConstraints.ipady = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 30, 0, 0);
        search.add(btnStock, gridBagConstraints);

        stock.setBackground(new java.awt.Color(255, 255, 255));
        stock.setLayout(null);

        searchstore.setBackground(new java.awt.Color(201, 201, 201));
        searchstore.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        searchstore.setForeground(new java.awt.Color(26, 2, 2));
        stock.add(searchstore);
        searchstore.setBounds(109, 11, 500, 30);

        searchstorebtn.setBackground(new java.awt.Color(26, 2, 2));
        searchstorebtn.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        searchstorebtn.setForeground(new java.awt.Color(201, 201, 201));
        searchstorebtn.setText("بحث");
        searchstorebtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        searchstorebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchstorebtnActionPerformed(evt);
            }
        });
        stock.add(searchstorebtn);
        searchstorebtn.setBounds(20, 11, 70, 30);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 709;
        gridBagConstraints.ipady = 49;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 150, 10, 0);
        search.add(stock, gridBagConstraints);

        model.setBackground(new java.awt.Color(255, 255, 255));
        model.setLayout(null);

        searchmodel.setBackground(new java.awt.Color(201, 201, 201));
        searchmodel.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        searchmodel.setForeground(new java.awt.Color(26, 2, 2));
        model.add(searchmodel);
        searchmodel.setBounds(109, 11, 500, 30);

        searchmodelbtn.setBackground(new java.awt.Color(26, 2, 2));
        searchmodelbtn.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        searchmodelbtn.setForeground(new java.awt.Color(201, 201, 201));
        searchmodelbtn.setText("بحث");
        searchmodelbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        searchmodelbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchmodelbtnActionPerformed(evt);
            }
        });
        model.add(searchmodelbtn);
        searchmodelbtn.setBounds(20, 11, 70, 30);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 709;
        gridBagConstraints.ipady = 49;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 150, 10, 0);
        search.add(model, gridBagConstraints);

        section.setBackground(new java.awt.Color(255, 255, 255));
        section.setLayout(null);

        searchsec.setBackground(new java.awt.Color(201, 201, 201));
        searchsec.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        searchsec.setForeground(new java.awt.Color(26, 2, 2));
        section.add(searchsec);
        searchsec.setBounds(109, 11, 500, 30);

        searchsecbtn.setBackground(new java.awt.Color(26, 2, 2));
        searchsecbtn.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        searchsecbtn.setForeground(new java.awt.Color(201, 201, 201));
        searchsecbtn.setText("بحث");
        searchsecbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        searchsecbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchsecbtnActionPerformed(evt);
            }
        });
        section.add(searchsecbtn);
        searchsecbtn.setBounds(20, 11, 70, 30);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 709;
        gridBagConstraints.ipady = 49;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 150, 10, 0);
        search.add(section, gridBagConstraints);

        all.setBackground(new java.awt.Color(255, 255, 255));
        all.setLayout(null);

        searchtxt.setBackground(new java.awt.Color(201, 201, 201));
        searchtxt.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        searchtxt.setForeground(new java.awt.Color(26, 2, 2));
        searchtxt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        searchtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                searchtxtKeyTyped(evt);
            }
        });
        all.add(searchtxt);
        searchtxt.setBounds(109, 12, 510, 30);

        searchallbtn.setBackground(new java.awt.Color(26, 2, 2));
        searchallbtn.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        searchallbtn.setForeground(new java.awt.Color(201, 201, 201));
        searchallbtn.setText("بحث");
        searchallbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        searchallbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchallbtnActionPerformed(evt);
            }
        });
        all.add(searchallbtn);
        searchallbtn.setBounds(20, 12, 70, 30);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 709;
        gridBagConstraints.ipady = 49;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 150, 10, 0);
        search.add(all, gridBagConstraints);

        b.add(search, java.awt.BorderLayout.CENTER);

        body.add(b, java.awt.BorderLayout.CENTER);

        jPanel1.add(body, java.awt.BorderLayout.CENTER);

        table.setBackground(new java.awt.Color(255, 255, 255));
        table.setPreferredSize(new java.awt.Dimension(100, 350));
        table.setLayout(new java.awt.BorderLayout());

        jScrollPane1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTSearch.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "الملاحظات", "العدد", "اللون", "الموديل", "القسم", "رقم او اسم المخزن", "التسلسل"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTSearch.setFocusable(false);
        jTSearch.setIntercellSpacing(new java.awt.Dimension(0, 0));
        jTSearch.setSelectionBackground(new java.awt.Color(184, 26, 61));
        jTSearch.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jTSearch.getTableHeader().setReorderingAllowed(false);
        jTSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTSearchMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTSearch);
        if (jTSearch.getColumnModel().getColumnCount() > 0) {
            jTSearch.getColumnModel().getColumn(6).setMinWidth(0);
            jTSearch.getColumnModel().getColumn(6).setMaxWidth(0);
        }

        table.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel1.add(table, java.awt.BorderLayout.PAGE_END);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(1281, 674));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void homebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homebtnActionPerformed
        this.dispose();
        Tools.openFram(new HomeFrm());
    }//GEN-LAST:event_homebtnActionPerformed

    private void closebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closebtnMouseClicked
        int ifY = JOptionPane.showConfirmDialog(null, "هل تريد إغلاق البرنامج ؟");
        if (ifY == JOptionPane.YES_OPTION) {
            System.exit(0);
        } else {

        }
    }//GEN-LAST:event_closebtnMouseClicked

    private void closebtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closebtnMouseEntered
        close.setBackground(new Color(75, 50, 50));
    }//GEN-LAST:event_closebtnMouseEntered

    private void closebtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closebtnMouseExited
        close.setBackground(new Color(26, 2, 2));
    }//GEN-LAST:event_closebtnMouseExited

    private void maxibtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maxibtnMouseClicked
        if (this.getExtendedState() != HomeFrm.MAXIMIZED_BOTH) {
            this.setExtendedState(HomeFrm.MAXIMIZED_BOTH);
        } else {
            this.setExtendedState(HomeFrm.NORMAL);
        }
    }//GEN-LAST:event_maxibtnMouseClicked

    private void maxibtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maxibtnMouseEntered
        maxi.setBackground(new Color(75, 50, 50));
    }//GEN-LAST:event_maxibtnMouseEntered

    private void maxibtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maxibtnMouseExited
        maxi.setBackground(new Color(26, 2, 2));
    }//GEN-LAST:event_maxibtnMouseExited

    private void minibtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minibtnMouseClicked
        if (evt.getButton() == MouseEvent.BUTTON1) {
            this.setState(WIDTH);
        }
    }//GEN-LAST:event_minibtnMouseClicked

    private void minibtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minibtnMouseEntered
        mini.setBackground(new Color(75, 50, 50));
    }//GEN-LAST:event_minibtnMouseEntered

    private void minibtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minibtnMouseExited
        mini.setBackground(new Color(26, 2, 2));
    }//GEN-LAST:event_minibtnMouseExited
    Store s = new Store();
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        buttonGroup1.add(btnall);
        buttonGroup1.add(btnsec);
        buttonGroup1.add(btnmod);
        buttonGroup1.add(btnStock);
        s.getAllStored(jTSearch);
        MethodsDB.fillCompo("sections", "section", searchsec);
        MethodsDB.fillCompo("category", "model", searchmodel);
        DB.MethodsDB.fillCompo("STORED", "STORED", searchstore);
    }//GEN-LAST:event_formWindowOpened

    private void btnallItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_btnallItemStateChanged
        all.setVisible(true);
        all.setEnabled(true);
        section.setVisible(false);
        section.setEnabled(false);
        model.setVisible(false);
        model.setEnabled(false);
        stock.setVisible(false);
        stock.setEnabled(false);
    }//GEN-LAST:event_btnallItemStateChanged

    private void btnsecItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_btnsecItemStateChanged
        all.setVisible(false);
        all.setEnabled(false);
        section.setVisible(true);
        section.setEnabled(true);
        model.setVisible(false);
        model.setEnabled(false);
        stock.setVisible(false);
        stock.setEnabled(false);
    }//GEN-LAST:event_btnsecItemStateChanged

    private void btnmodItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_btnmodItemStateChanged
        all.setVisible(false);
        all.setEnabled(false);
        section.setVisible(false);
        section.setEnabled(false);
        model.setVisible(true);
        model.setEnabled(true);
        stock.setVisible(false);
        stock.setEnabled(false);
    }//GEN-LAST:event_btnmodItemStateChanged

    private void btnStockItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_btnStockItemStateChanged
        all.setVisible(false);
        all.setEnabled(false);
        section.setVisible(false);
        section.setEnabled(false);
        model.setVisible(false);
        model.setEnabled(false);
        stock.setVisible(true);
        stock.setEnabled(true);
    }//GEN-LAST:event_btnStockItemStateChanged

    private void onebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onebtnActionPerformed
        s.getOneProd(jTSearch);
        image.setIcon(null);
    }//GEN-LAST:event_onebtnActionPerformed

    private void finishbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finishbtnActionPerformed
        s.getFinishProd(jTSearch);
        image.setIcon(null);
    }//GEN-LAST:event_finishbtnActionPerformed

    private void searchallbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchallbtnActionPerformed
        s.getBySearch(searchtxt.getText(), jTSearch);
    }//GEN-LAST:event_searchallbtnActionPerformed

    private void searchtxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchtxtKeyTyped
        try {
            s.getBySearch(searchtxt.getText(), jTSearch);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_searchtxtKeyTyped

    private void searchsecbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchsecbtnActionPerformed
        s.getBySections(searchsec.getSelectedItem().toString(), jTSearch);
    }//GEN-LAST:event_searchsecbtnActionPerformed

    private void searchmodelbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchmodelbtnActionPerformed
        s.getByModel(searchmodel.getSelectedItem().toString(), jTSearch);
    }//GEN-LAST:event_searchmodelbtnActionPerformed

    private void searchstorebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchstorebtnActionPerformed
        s.getByStore(searchstore.getSelectedItem().toString(), jTSearch);
    }//GEN-LAST:event_searchstorebtnActionPerformed

    private void allbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allbtnActionPerformed
        s.getAllStored(jTSearch);
        image.setIcon(null);
    }//GEN-LAST:event_allbtnActionPerformed
    Storage sa = new Storage();
    private void jTSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTSearchMouseClicked
        try {
            int Ro = jTSearch.getSelectedRow();
            String num = jTSearch.getValueAt(Ro, 6).toString();

            sa.getImg(image, num);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jTSearchMouseClicked

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
            java.util.logging.Logger.getLogger(StoreFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StoreFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StoreFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StoreFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StoreFrm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel all;
    private javax.swing.JButton allbtn;
    private javax.swing.JPanel b;
    private javax.swing.JPanel bar;
    private javax.swing.JPanel body;
    private javax.swing.JRadioButton btnStock;
    private javax.swing.JRadioButton btnall;
    private javax.swing.JRadioButton btnmod;
    private javax.swing.JRadioButton btnsec;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel buttons;
    private javax.swing.JPanel c;
    private javax.swing.JPanel close;
    private javax.swing.JLabel closebtn;
    private javax.swing.JButton finishbtn;
    private javax.swing.JButton homebtn;
    private javax.swing.JLabel image;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTSearch;
    private javax.swing.JPanel l;
    private javax.swing.JPanel maxi;
    private javax.swing.JLabel maxibtn;
    private javax.swing.JPanel mini;
    private javax.swing.JLabel minibtn;
    private javax.swing.JPanel model;
    private javax.swing.JButton onebtn;
    private javax.swing.JPanel r;
    private javax.swing.JPanel search;
    private javax.swing.JLabel searchLab;
    private javax.swing.JButton searchallbtn;
    private javax.swing.JComboBox<String> searchmodel;
    private javax.swing.JButton searchmodelbtn;
    private javax.swing.JComboBox<String> searchsec;
    private javax.swing.JButton searchsecbtn;
    private javax.swing.JComboBox<String> searchstore;
    private javax.swing.JButton searchstorebtn;
    private javax.swing.JTextField searchtxt;
    private javax.swing.JPanel section;
    private javax.swing.JPanel stock;
    private javax.swing.JPanel table;
    // End of variables declaration//GEN-END:variables
}
