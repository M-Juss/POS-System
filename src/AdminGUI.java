/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import java.awt.Color;
import java.awt.Font;
import java.sql.*;  
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
        
public class AdminGUI extends javax.swing.JFrame {
    Connection conn;

    public AdminGUI() {
        initComponents();
        
        JTableHeader header = SalesTable.getTableHeader();
        Font font = new Font("Segoe UI", Font.BOLD, 12 );
        header.setFont(font);
        SalesTable.setBackground(Color.white);
        SalesTable.setForeground(Color.black);
        
        JTableHeader header1 = DailyTable.getTableHeader();
        Font font1 = new Font("Segoe UI", Font.BOLD, 12 );
        header1.setFont(font1);
        DailyTable.setBackground(Color.white);
        DailyTable.setForeground(Color.black);
        
        
        JTableHeader header2 = MonthlyTable.getTableHeader();
        Font font2 = new Font("Segoe UI", Font.BOLD, 12 );
        header2.setFont(font2);
        MonthlyTable.setBackground(Color.white);
        MonthlyTable.setForeground(Color.black);
        
        JTableHeader header3 = YearlyTable.getTableHeader();
        Font font3 = new Font("Segoe UI", Font.BOLD, 12 );
        header3.setFont(font3);
        YearlyTable.setBackground(Color.white);
        YearlyTable.setForeground(Color.black);
        
        JTableHeader header4 = StocksTable.getTableHeader();
        Font font4 = new Font("Segoe UI", Font.BOLD, 12 );
        header4.setFont(font4);
        StocksTable.setBackground(Color.white);
        StocksTable.setForeground(Color.black);
        
        SalesTable.setRowHeight(40);
        DailyTable.setRowHeight(40);
        MonthlyTable.setRowHeight(40);
        YearlyTable.setRowHeight(40);
        
        try{
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/micmiccolors", "root", "password");
        PreparedStatement selectProduct = conn.prepareStatement("SELECT * FROM products WHERE quantity > 0 ");
        
        ResultSet rs = selectProduct.executeQuery();
        
            double totalProfit = 0;
            
            LocalDate date = LocalDate.now();
            
            
            while(rs.next()){
              
             int quantity = rs.getInt("quantity");
             String name = rs.getString("product_name");
             int price = rs.getInt("selling_price");
             int total = rs.getInt("total_price");
             int profit = rs.getInt("profit");
             
             
                
            DefaultTableModel salestable = (DefaultTableModel) SalesTable.getModel();
            
            salestable.addRow(new Object[]{quantity, name, price, total, profit, date});
            
            totalProfit += profit;
           
            }
             labelTotalProfit.setText(String.valueOf(totalProfit));       
             
            
        }
        
        catch(SQLException sqle){
            System.out.println(sqle.getMessage());
        }
        
        try{
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/micmiccolors", "root", "password");
        PreparedStatement selectProduct = conn.prepareStatement("SELECT * FROM dailyincome WHERE profit > 0");
        
        ResultSet rs = selectProduct.executeQuery();
            
            
            while (rs.next()) {
            int profit = rs.getInt("profit");
            String date = rs.getString("daily");
            
            DefaultTableModel dailytable = (DefaultTableModel) DailyTable.getModel();
            dailytable.addRow(new Object[]{ date, profit});
           
            }
            
        }
        catch(SQLException sqle){
            System.out.println(sqle.getMessage());
        }

        
        try{
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/micmiccolors", "root", "password");
        PreparedStatement showMonthlyIncome = conn.prepareStatement("SELECT DATE_FORMAT(daily, '%M %Y') AS Months, SUM(profit) AS Profit " + "FROM dailyincome " + "GROUP BY Months");
        
        ResultSet rs = showMonthlyIncome.executeQuery();
            
        try{
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/micmiccolors", "root", "password");
        PreparedStatement insertToMonthly = conn.prepareStatement("INSERT INTO monthlyincome (month, profit) VALUES (?,?)" + " ON DUPLICATE KEY UPDATE profit =  VALUES(Profit);");
        
            while (rs.next()) {
            int totalProfit = rs.getInt("Profit");
            String month = rs.getString("Months");
            
            insertToMonthly.setString(1, month);
            insertToMonthly.setInt(2, totalProfit);
            insertToMonthly.executeUpdate();
            
            
            DefaultTableModel monthlytable = (DefaultTableModel) MonthlyTable.getModel();
            monthlytable.addRow(new Object[]{ month, totalProfit});
        }    
           
            }
                 catch(SQLException sqle){
            System.out.println(sqle.getMessage());
        }   
        }
        
        catch(SQLException sqle){
            System.out.println(sqle.getMessage());
        }
        
        try{
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/micmiccolors", "root", "password");
        PreparedStatement showMonthlyIncome = conn.prepareStatement("SELECT DATE_FORMAT(daily, '%Y') AS Years, SUM(profit) AS Profit " + "FROM dailyincome " + "GROUP BY Years");
        
        ResultSet rs = showMonthlyIncome.executeQuery();
            
        try{
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/micmiccolors", "root", "password");
        PreparedStatement insertToMonthly = conn.prepareStatement("INSERT INTO yearlyincome (year, profit) VALUES (?,?)" + " ON DUPLICATE KEY UPDATE profit =  VALUES(Profit);");
        
            while (rs.next()) {
            int totalProfit = rs.getInt("Profit");
            String years = rs.getString("Years");
            
            insertToMonthly.setString(1, years);
            insertToMonthly.setInt(2, totalProfit);
            insertToMonthly.executeUpdate();
            
            
            DefaultTableModel yearlytable = (DefaultTableModel) YearlyTable.getModel();
            yearlytable.addRow(new Object[]{ years, totalProfit});
        }    
           
            }
                 catch(SQLException sqle){
            System.out.println(sqle.getMessage());
        }   
        }
        
        catch(SQLException sqle){
            System.out.println(sqle.getMessage());
        }
       
        
    }

    

      
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        SalesButton = new javax.swing.JButton();
        DailyButton = new javax.swing.JButton();
        YearlyButton = new javax.swing.JButton();
        StockButton = new javax.swing.JButton();
        MonthlyButton = new javax.swing.JButton();
        RegisterButton = new javax.swing.JButton();
        AddButton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        DashboardTable = new javax.swing.JTabbedPane();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        SalesTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        labelTotalProfit = new javax.swing.JTextField();
        salesSave = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        DailyTable = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        MonthlyTable = new javax.swing.JTable();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        YearlyTable = new javax.swing.JTable();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        StocksTable = new javax.swing.JTable();
        RestockButton = new javax.swing.JButton();
        search = new javax.swing.JTextField();
        jPanel16 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        productName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        addItemButton = new javax.swing.JButton();
        costPrice = new javax.swing.JTextField();
        sellingPrice = new javax.swing.JTextField();
        stockNumber = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        regUsername = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        regPassword = new javax.swing.JPasswordField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        regConfirmPassword = new javax.swing.JPasswordField();
        registerButtom1 = new javax.swing.JButton();
        regType = new javax.swing.JComboBox<>();

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(227, 193, 55));
        jTextField1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(0, 0, 0));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(81, 154, 52));

        jPanel3.setBackground(new java.awt.Color(227, 193, 55));

        jPanel2.setBackground(new java.awt.Color(81, 154, 52));

        jLabel1.setBackground(new java.awt.Color(81, 154, 52));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DASHBOARD");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        SalesButton.setBackground(new java.awt.Color(0, 153, 0));
        SalesButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        SalesButton.setForeground(new java.awt.Color(255, 255, 255));
        SalesButton.setText("TODAY SALES");
        SalesButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        SalesButton.setBorderPainted(false);
        SalesButton.setFocusPainted(false);
        SalesButton.setFocusable(false);
        SalesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalesButtonActionPerformed(evt);
            }
        });

        DailyButton.setBackground(new java.awt.Color(0, 153, 0));
        DailyButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        DailyButton.setForeground(new java.awt.Color(255, 255, 255));
        DailyButton.setText("DAILY INCOME");
        DailyButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        DailyButton.setBorderPainted(false);
        DailyButton.setFocusPainted(false);
        DailyButton.setFocusable(false);
        DailyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DailyButtonActionPerformed(evt);
            }
        });

        YearlyButton.setBackground(new java.awt.Color(0, 153, 0));
        YearlyButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        YearlyButton.setForeground(new java.awt.Color(255, 255, 255));
        YearlyButton.setText("YEARLY INCOME");
        YearlyButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        YearlyButton.setBorderPainted(false);
        YearlyButton.setFocusPainted(false);
        YearlyButton.setFocusable(false);
        YearlyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YearlyButtonActionPerformed(evt);
            }
        });

        StockButton.setBackground(new java.awt.Color(0, 153, 0));
        StockButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        StockButton.setForeground(new java.awt.Color(255, 255, 255));
        StockButton.setText("ITEM STOCKS");
        StockButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        StockButton.setBorderPainted(false);
        StockButton.setFocusPainted(false);
        StockButton.setFocusable(false);
        StockButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StockButtonActionPerformed(evt);
            }
        });

        MonthlyButton.setBackground(new java.awt.Color(0, 153, 0));
        MonthlyButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        MonthlyButton.setForeground(new java.awt.Color(255, 255, 255));
        MonthlyButton.setText("MONTHLY INCOME");
        MonthlyButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        MonthlyButton.setBorderPainted(false);
        MonthlyButton.setFocusPainted(false);
        MonthlyButton.setFocusable(false);
        MonthlyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MonthlyButtonActionPerformed(evt);
            }
        });

        RegisterButton.setBackground(new java.awt.Color(0, 153, 0));
        RegisterButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        RegisterButton.setForeground(new java.awt.Color(255, 255, 255));
        RegisterButton.setText("REGISTER NEW USERS");
        RegisterButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        RegisterButton.setBorderPainted(false);
        RegisterButton.setFocusPainted(false);
        RegisterButton.setFocusable(false);
        RegisterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterButtonActionPerformed(evt);
            }
        });

        AddButton.setBackground(new java.awt.Color(0, 153, 0));
        AddButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        AddButton.setForeground(new java.awt.Color(255, 255, 255));
        AddButton.setText("ADD NEW ITEM");
        AddButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        AddButton.setBorderPainted(false);
        AddButton.setFocusPainted(false);
        AddButton.setFocusable(false);
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(YearlyButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(MonthlyButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(StockButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(DailyButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SalesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(RegisterButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(AddButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(SalesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DailyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(MonthlyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(YearlyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(StockButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(RegisterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(227, 193, 55));

        jPanel6.setBackground(new java.awt.Color(81, 154, 52));

        jLabel3.setBackground(new java.awt.Color(81, 154, 52));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("MICMIC COLORS PAINT CENTER");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        DashboardTable.setBackground(java.awt.SystemColor.controlLtHighlight);
        DashboardTable.setForeground(new java.awt.Color(0, 0, 0));
        DashboardTable.setAutoscrolls(true);
        DashboardTable.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jPanel7.setBackground(new java.awt.Color(81, 154, 52));

        SalesTable.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        SalesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "     Qty", "                          Product  Name  ", "    Price", "    Total ", "    Profit", "          Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        SalesTable.setShowGrid(true);
        SalesTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(SalesTable);
        if (SalesTable.getColumnModel().getColumnCount() > 0) {
            SalesTable.getColumnModel().getColumn(0).setResizable(false);
            SalesTable.getColumnModel().getColumn(0).setPreferredWidth(1);
            SalesTable.getColumnModel().getColumn(1).setResizable(false);
            SalesTable.getColumnModel().getColumn(1).setPreferredWidth(200);
            SalesTable.getColumnModel().getColumn(2).setResizable(false);
            SalesTable.getColumnModel().getColumn(2).setPreferredWidth(15);
            SalesTable.getColumnModel().getColumn(3).setResizable(false);
            SalesTable.getColumnModel().getColumn(3).setPreferredWidth(15);
            SalesTable.getColumnModel().getColumn(4).setResizable(false);
            SalesTable.getColumnModel().getColumn(4).setPreferredWidth(15);
            SalesTable.getColumnModel().getColumn(5).setResizable(false);
            SalesTable.getColumnModel().getColumn(5).setPreferredWidth(50);
        }

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("TOTAL PROFIT: ");

        labelTotalProfit.setEditable(false);
        labelTotalProfit.setBackground(new java.awt.Color(81, 154, 52));
        labelTotalProfit.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelTotalProfit.setForeground(new java.awt.Color(255, 255, 255));
        labelTotalProfit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                labelTotalProfitActionPerformed(evt);
            }
        });

        salesSave.setBackground(new java.awt.Color(227, 193, 55));
        salesSave.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        salesSave.setForeground(new java.awt.Color(0, 0, 0));
        salesSave.setText("Save");
        salesSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salesSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 622, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelTotalProfit, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(salesSave, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelTotalProfit)
                    .addComponent(salesSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        DashboardTable.addTab("Today", jPanel7);

        jPanel8.setBackground(new java.awt.Color(81, 154, 52));

        DailyTable.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        DailyTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "                                        Date", "                                         Profit "
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        DailyTable.setShowGrid(true);
        DailyTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(DailyTable);
        if (DailyTable.getColumnModel().getColumnCount() > 0) {
            DailyTable.getColumnModel().getColumn(0).setResizable(false);
            DailyTable.getColumnModel().getColumn(1).setResizable(false);
        }

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 622, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE)
        );

        DashboardTable.addTab("Daily", jPanel8);

        jPanel9.setBackground(new java.awt.Color(81, 154, 52));

        MonthlyTable.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        MonthlyTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "                                        Date", "                                         Profit "
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        MonthlyTable.setShowGrid(true);
        MonthlyTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(MonthlyTable);
        if (MonthlyTable.getColumnModel().getColumnCount() > 0) {
            MonthlyTable.getColumnModel().getColumn(0).setResizable(false);
            MonthlyTable.getColumnModel().getColumn(1).setResizable(false);
        }

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 622, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE)
        );

        DashboardTable.addTab("Monthly", jPanel9);

        jPanel10.setBackground(new java.awt.Color(81, 154, 52));

        YearlyTable.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        YearlyTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "                                        Date", "                                         Profit "
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        YearlyTable.setShowGrid(true);
        YearlyTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane5.setViewportView(YearlyTable);
        if (YearlyTable.getColumnModel().getColumnCount() > 0) {
            YearlyTable.getColumnModel().getColumn(0).setResizable(false);
            YearlyTable.getColumnModel().getColumn(1).setResizable(false);
        }

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 622, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE)
        );

        DashboardTable.addTab("Yearly", jPanel10);

        jPanel11.setBackground(new java.awt.Color(81, 154, 52));

        StocksTable.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        StocksTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "                                                       Product name", "                  Stocks "
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        StocksTable.setShowGrid(true);
        StocksTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(StocksTable);
        if (StocksTable.getColumnModel().getColumnCount() > 0) {
            StocksTable.getColumnModel().getColumn(0).setResizable(false);
            StocksTable.getColumnModel().getColumn(0).setPreferredWidth(300);
            StocksTable.getColumnModel().getColumn(1).setResizable(false);
            StocksTable.getColumnModel().getColumn(1).setPreferredWidth(10);
        }

        RestockButton.setBackground(new java.awt.Color(227, 193, 55));
        RestockButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        RestockButton.setForeground(new java.awt.Color(0, 0, 0));
        RestockButton.setText("Re-Stock");
        RestockButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestockButtonActionPerformed(evt);
            }
        });

        search.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchKeyReleased(evt);
            }
        });

        jPanel16.setBackground(new java.awt.Color(227, 193, 55));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Search");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 622, Short.MAX_VALUE)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(RestockButton, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(242, 242, 242))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RestockButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        DashboardTable.addTab("Stocks", jPanel11);

        jPanel5.setBackground(new java.awt.Color(81, 154, 52));
        jPanel5.setForeground(new java.awt.Color(81, 154, 52));

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Product name:");

        productName.setHighlighter(null);
        productName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productNameActionPerformed(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Cost price:");

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Stocks:");

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Selling price:");

        addItemButton.setBackground(new java.awt.Color(227, 193, 55));
        addItemButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        addItemButton.setForeground(new java.awt.Color(0, 0, 0));
        addItemButton.setText("Add Item");
        addItemButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        addItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addItemButtonActionPerformed(evt);
            }
        });

        costPrice.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        costPrice.setHighlighter(null);
        costPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                costPriceActionPerformed(evt);
            }
        });
        costPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                costPriceKeyTyped(evt);
            }
        });

        sellingPrice.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sellingPrice.setHighlighter(null);
        sellingPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellingPriceActionPerformed(evt);
            }
        });
        sellingPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                sellingPriceKeyTyped(evt);
            }
        });

        stockNumber.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        stockNumber.setHighlighter(null);
        stockNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockNumberActionPerformed(evt);
            }
        });
        stockNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                stockNumberKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(192, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9)
                    .addComponent(productName)
                    .addComponent(addItemButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                    .addComponent(costPrice)
                    .addComponent(sellingPrice)
                    .addComponent(stockNumber))
                .addGap(189, 189, 189))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(productName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(costPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sellingPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(stockNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(addItemButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(103, Short.MAX_VALUE))
        );

        DashboardTable.addTab("Add", jPanel5);

        jPanel13.setBackground(new java.awt.Color(81, 154, 52));
        jPanel13.setForeground(new java.awt.Color(81, 154, 52));

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Username :");

        regUsername.setHighlighter(null);
        regUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regUsernameActionPerformed(evt);
            }
        });

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Password:");

        regPassword.setHighlighter(null);
        regPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regPasswordActionPerformed(evt);
            }
        });

        jLabel13.setBackground(new java.awt.Color(0, 0, 0));
        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Type :");

        jLabel14.setBackground(new java.awt.Color(0, 0, 0));
        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Confirm Password:");

        regConfirmPassword.setHighlighter(null);
        regConfirmPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regConfirmPasswordActionPerformed(evt);
            }
        });

        registerButtom1.setBackground(new java.awt.Color(227, 193, 55));
        registerButtom1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        registerButtom1.setForeground(new java.awt.Color(0, 0, 0));
        registerButtom1.setText("Register");
        registerButtom1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        registerButtom1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtom1ActionPerformed(evt);
            }
        });

        regType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cashier" }));
        regType.setFocusable(false);
        regType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regTypeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(192, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel14)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11)
                    .addComponent(jLabel13)
                    .addComponent(regUsername)
                    .addComponent(regPassword)
                    .addComponent(regConfirmPassword)
                    .addComponent(regType, javax.swing.GroupLayout.Alignment.TRAILING, 0, 241, Short.MAX_VALUE)
                    .addComponent(registerButtom1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(189, 189, 189))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(regUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(regPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(regConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(regType, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(registerButtom1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(103, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 622, Short.MAX_VALUE)
            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel12Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 482, Short.MAX_VALUE)
            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel12Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        DashboardTable.addTab("Register", jPanel12);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(DashboardTable)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(DashboardTable, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18))
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

    private void SalesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalesButtonActionPerformed
    DashboardTable.setSelectedIndex(0);
    }//GEN-LAST:event_SalesButtonActionPerformed

    private void DailyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DailyButtonActionPerformed
        DashboardTable.setSelectedIndex(1);
        
    }//GEN-LAST:event_DailyButtonActionPerformed

    private void YearlyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YearlyButtonActionPerformed
        DashboardTable.setSelectedIndex(3);
    }//GEN-LAST:event_YearlyButtonActionPerformed

    private void StockButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StockButtonActionPerformed
        DashboardTable.setSelectedIndex(4);
        
        try{
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/micmiccolors", "root", "password");
        PreparedStatement selectProduct = conn.prepareStatement("SELECT * FROM products WHERE stocks >= 0");
        
        ResultSet rs = selectProduct.executeQuery();
        
        while(rs.next()){
            String product = rs.getString("product_name");
            int stocks = rs.getInt("stocks");
            
            DefaultTableModel stockstable = (DefaultTableModel) StocksTable.getModel();
            
            stockstable.addRow(new Object[]{product, stocks});
           
            if (stocks <= 5) {
                JOptionPane.showMessageDialog(null, "Item: " + product +" stocks is running low","Notification Message", JOptionPane.INFORMATION_MESSAGE);
                
            }
        }

                }
        catch(SQLException sqle){
            System.out.println(sqle.getMessage());
        }
    }//GEN-LAST:event_StockButtonActionPerformed

    private void MonthlyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MonthlyButtonActionPerformed
       DashboardTable.setSelectedIndex(2);
    }//GEN-LAST:event_MonthlyButtonActionPerformed

    private void salesSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salesSaveActionPerformed

          int result = JOptionPane.showConfirmDialog(null, "Are you sure do you want to save the daily table?", "Confirmation Message", JOptionPane.YES_NO_OPTION);
    if (result == JOptionPane.YES_OPTION) {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/micmiccolors", "root", "password");
            PreparedStatement insertToDaily = conn.prepareStatement("INSERT INTO dailyincome (daily, profit) VALUES (?,?)");
            PreparedStatement updateSales = conn.prepareStatement("UPDATE products SET quantity = 0, total_price = 0, profit = 0 WHERE quantity > 0");
            
            DefaultTableModel salestable = (DefaultTableModel) SalesTable.getModel();
            int totalprofit = 0;
            for (int row = 0; row < salestable.getRowCount(); row++) {
                int profit = (int) salestable.getValueAt(row, 4);
                totalprofit += profit;
            }
            
            LocalDate date = LocalDate.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("LLLL d, yyyy");
            String formattedDate = date.format(formatter);
            
            // Convert formattedDate to java.sql.Date
            Date sqlDate = Date.valueOf(LocalDate.parse(formattedDate, DateTimeFormatter.ofPattern("LLLL d, yyyy")));
            
            insertToDaily.setDate(1, sqlDate);
            insertToDaily.setInt(2, totalprofit);
            insertToDaily.executeUpdate();
            updateSales.executeUpdate();
            
            System.out.println("Insert to Daily Successful");
            
            this.dispose();
            AdminGUI admin = new AdminGUI();
            admin.setVisible(true);
        } catch(Exception e) {
            System.out.println("Error:" + e.getMessage());
        }
    }
        
    }//GEN-LAST:event_salesSaveActionPerformed

    private void RestockButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestockButtonActionPerformed
        
        
        try{
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/micmiccolors", "root", "password");
        
        String product = JOptionPane.showInputDialog("Enter product name:");
      
        int stock = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of stocks that you wanted to add:"));
        
        String stck = String.valueOf(stock);
        
            if (product.isBlank() || stck.isBlank()) {
                JOptionPane.showMessageDialog(null, "Pls enter all data!", "Error Message", JOptionPane.ERROR_MESSAGE);
            }
            
        
        PreparedStatement selectProduct = conn.prepareStatement("SELECT * FROM products WHERE product_name = ?");
        PreparedStatement updateStocks = conn.prepareStatement("UPDATE products SET stocks = ? WHERE product_name = ?");
        
        selectProduct.setString(1, product);
        ResultSet rs = selectProduct.executeQuery();
        
            if(rs.next()) {
                int stocksDb = rs.getInt("stocks");
                
                int newStocks = stocksDb + stock;
                updateStocks.setInt(1,newStocks);
                updateStocks.setString(2, product);
                updateStocks.executeUpdate();
                
                this.dispose();
                AdminGUI admin = new AdminGUI();
                admin.setVisible(true);
                
            }
            
            else {
        JOptionPane.showMessageDialog(null, "Product not found!");
            
            }

        
        }
        
        catch(SQLException sqle){
            System.out.println(sqle.getMessage());
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_RestockButtonActionPerformed

    private void RegisterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterButtonActionPerformed
        DashboardTable.setSelectedIndex(6);
        
    }//GEN-LAST:event_RegisterButtonActionPerformed

    private void productNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productNameActionPerformed

    private void addItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addItemButtonActionPerformed

        String name = productName.getText();
        String cost = costPrice.getText();
        String selling = sellingPrice.getText();
        String stock = stockNumber.getText();
        int quantity = 0;
        int total = 0;
        int profit = 0;
        
        
        if (name.isEmpty() || cost.isEmpty() || selling.isEmpty() || stock.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Pls complete the needed information", "Message", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
            try{
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/micmiccolors", "root", "password");
            PreparedStatement insertInfo = conn.prepareStatement("INSERT INTO products (quantity, product_name, cost_price, selling_price, total_price, stocks, profit) VALUE (?,?,?,?,?,?,?)");
            
            insertInfo.setInt(1, quantity);
            insertInfo.setString(2, name);
            insertInfo.setString(3, cost);
            insertInfo.setString(4, selling);
            insertInfo.setInt(5, total);
            insertInfo.setString(6, stock);
            insertInfo.setInt(7, profit);
            
            insertInfo.executeUpdate();
            
            System.out.println("Informations inserted successfully!");
            
            JOptionPane.showMessageDialog(null, "New item added!", "Message", JOptionPane.INFORMATION_MESSAGE);
            
        productName.setText("");
        costPrice.setText("");
        sellingPrice.setText("");
        stockNumber.setText("");
        
            }
            catch(SQLException sqle){
                System.out.println(sqle.getMessage());
            }
    }//GEN-LAST:event_addItemButtonActionPerformed

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        DashboardTable.setSelectedIndex(5);
    }//GEN-LAST:event_AddButtonActionPerformed

    private void regUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regUsernameActionPerformed

    private void regPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regPasswordActionPerformed

    private void regConfirmPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regConfirmPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regConfirmPasswordActionPerformed

    private void registerButtom1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtom1ActionPerformed
        String username = regUsername.getText();
        String password = regPassword.getText();
        String confirmPassword = regConfirmPassword.getText();
        String type = regType.getSelectedItem().toString();

        // ichecheck kung may laman yung username and password at kung wala uulit sa gui with error message
        if (username.isEmpty() || password.isEmpty() || type.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Pls complete the registraion form", "Message", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try{
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/micmiccolors", "root", "password");
        PreparedStatement selectUser= conn.prepareStatement("SELECT username FROM users");
        
        
        ResultSet rs = selectUser.executeQuery();
        
        while(rs.next()){
        String uname = rs.getString("username");
        
        if(username.equals(uname)){
            JOptionPane.showMessageDialog(null, "Username is already used! Try another one!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
     
            }
        }
        
        }
        catch(Exception sqle){
            System.out.println(sqle.getMessage());
        }

        if (password.equals(confirmPassword) ) {
            try{
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/micmiccolors", "root", "password");
            PreparedStatement insertInfo = conn.prepareStatement("INSERT INTO users (username, password, type) VALUE (?,?,?)");
            
            insertInfo.setString(1, username);
            insertInfo.setString(2, password);
            insertInfo.setString(3, type);
            
            insertInfo.executeUpdate();
            
            System.out.println("Informations inserted successfully!");
            
            JOptionPane.showMessageDialog(null, "New user is added! Registered Successfully!", "Message", JOptionPane.INFORMATION_MESSAGE);
            
            regUsername.setText("");
            regPassword.setText("");
            regConfirmPassword.setText("");
            }
            catch(SQLException sqle){
                System.out.println(sqle.getMessage());
            }
        }
        else JOptionPane.showMessageDialog(null, "Password doesn't match! Pls try again!", "Message",JOptionPane.ERROR_MESSAGE);
                                         
    }//GEN-LAST:event_registerButtom1ActionPerformed

    private void regTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regTypeActionPerformed

    private void costPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_costPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_costPriceActionPerformed

    private void sellingPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellingPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sellingPriceActionPerformed

    private void stockNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stockNumberActionPerformed

    private void labelTotalProfitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_labelTotalProfitActionPerformed

    }//GEN-LAST:event_labelTotalProfitActionPerformed

    private void costPriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_costPriceKeyTyped
        char cost = evt.getKeyChar();
        
        if (!Character.isDigit(cost) || cost == '0') {
            evt.consume();
        }
    }//GEN-LAST:event_costPriceKeyTyped

    private void sellingPriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sellingPriceKeyTyped
        char selling = evt.getKeyChar();
        
        if (!Character.isDigit(selling) || selling == '0') {
            evt.consume();
        }
    }//GEN-LAST:event_sellingPriceKeyTyped

    private void stockNumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_stockNumberKeyTyped
               char stock = evt.getKeyChar();
        
        if (!Character.isDigit(stock) || stock == '0') {
            evt.consume();
        }
        

         
    }//GEN-LAST:event_stockNumberKeyTyped

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchActionPerformed

    private void searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyReleased

        String searchText = search.getText().trim().toLowerCase(); // assuming 'search' is a text field or similar component

        // Using try-with-resources to ensure all resources are closed
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/micmiccolors", "root", "password");
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM products WHERE LOWER(product_name) LIKE ?")) {

            // Set the parameter using a wildcard for LIKE
            stmt.setString(1, "%" + searchText + "%");

            try (ResultSet rs = stmt.executeQuery()) {
                DefaultTableModel stockstable = (DefaultTableModel) StocksTable.getModel(); // assuming overallTable is your JTable
                stockstable.setRowCount(0); // Clear the existing rows

                while (rs.next()) {
                    String name = rs.getString("product_name");
                    int stock = rs.getInt("stocks");

                    stockstable.addRow(new Object[] {name, stock}); // Object array for proper data type handling
                }

            }

        }

        catch (SQLException sqle) {
            // Handle SQL exceptions
            System.err.println("SQL error: " + sqle.getMessage());
            sqle.printStackTrace(); // Print stack trace for detailed error info
        } catch (Exception e) {
            // Handle other exceptions
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace(); // Print stack trace for detailed error info
        }

    }//GEN-LAST:event_searchKeyReleased

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(AdminGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
        new AdminGUI().setVisible(true);
    }
        
});

    }   
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JButton DailyButton;
    private javax.swing.JTable DailyTable;
    private javax.swing.JTabbedPane DashboardTable;
    private javax.swing.JButton MonthlyButton;
    private javax.swing.JTable MonthlyTable;
    private javax.swing.JButton RegisterButton;
    private javax.swing.JButton RestockButton;
    private javax.swing.JButton SalesButton;
    private javax.swing.JTable SalesTable;
    private javax.swing.JButton StockButton;
    private javax.swing.JTable StocksTable;
    private javax.swing.JButton YearlyButton;
    private javax.swing.JTable YearlyTable;
    private javax.swing.JButton addItemButton;
    private javax.swing.JTextField costPrice;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField labelTotalProfit;
    private javax.swing.JTextField productName;
    private javax.swing.JPasswordField regConfirmPassword;
    private javax.swing.JPasswordField regPassword;
    private javax.swing.JComboBox<String> regType;
    private javax.swing.JTextField regUsername;
    private javax.swing.JButton registerButtom1;
    private javax.swing.JButton salesSave;
    private javax.swing.JTextField search;
    private javax.swing.JTextField sellingPrice;
    private javax.swing.JTextField stockNumber;
    // End of variables declaration//GEN-END:variables
}
