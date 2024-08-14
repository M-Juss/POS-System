
import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import java.sql.*;
import java.util.Date;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableRowSorter;


public class GUI extends javax.swing.JFrame implements GuiFunctions {
Connection conn = null;
   
    public GUI() {
        initComponents();
        
        JTableHeader header = Cart.getTableHeader();
        Font font = new Font("Segoe UI", Font.BOLD, 12 );
        header.setFont(font);
        
        JTableHeader overall = overallTable.getTableHeader();
        Font font2 = new Font("Segoe UI", Font.BOLD, 12 );
        overall.setFont(font2);
        overallTable.setBackground(Color.white);
        overallTable.setForeground(Color.black);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        ButtonHolder = new javax.swing.JPanel();
        paintButton = new javax.swing.JButton();
        spraypaintButton = new javax.swing.JButton();
        tinnerButton = new javax.swing.JButton();
        bodyfillerButton = new javax.swing.JButton();
        undercoatButton = new javax.swing.JButton();
        hardwareButton = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        overallButton = new javax.swing.JButton();
        ReceiptHolder = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        Tableholder = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Cart = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        labelTotalPrice = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        inputPayment = new javax.swing.JTextField();
        Clear = new javax.swing.JButton();
        Checkout = new javax.swing.JButton();
        remove = new javax.swing.JButton();
        LogoutButton = new javax.swing.JButton();
        ItemHolder = new javax.swing.JTabbedPane();
        paintTab = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        paintHolder = new javax.swing.JPanel();
        jPanel94 = new javax.swing.JPanel();
        jLabel96 = new javax.swing.JLabel();
        pt1 = new javax.swing.JButton();
        spinnerpt1 = new javax.swing.JSpinner();
        jPanel99 = new javax.swing.JPanel();
        jLabel97 = new javax.swing.JLabel();
        pt2 = new javax.swing.JButton();
        spinnerpt2 = new javax.swing.JSpinner();
        jPanel108 = new javax.swing.JPanel();
        jLabel98 = new javax.swing.JLabel();
        pt3 = new javax.swing.JButton();
        spinnerpt3 = new javax.swing.JSpinner();
        jPanel111 = new javax.swing.JPanel();
        jLabel99 = new javax.swing.JLabel();
        pt4 = new javax.swing.JButton();
        spinnerpt4 = new javax.swing.JSpinner();
        jPanel112 = new javax.swing.JPanel();
        jLabel100 = new javax.swing.JLabel();
        pt5 = new javax.swing.JButton();
        spinnerpt5 = new javax.swing.JSpinner();
        jPanel113 = new javax.swing.JPanel();
        jLabel101 = new javax.swing.JLabel();
        pt6 = new javax.swing.JButton();
        spinnerpt6 = new javax.swing.JSpinner();
        jPanel114 = new javax.swing.JPanel();
        jLabel102 = new javax.swing.JLabel();
        pt7 = new javax.swing.JButton();
        spinnerpt7 = new javax.swing.JSpinner();
        jPanel115 = new javax.swing.JPanel();
        jLabel103 = new javax.swing.JLabel();
        pt8 = new javax.swing.JButton();
        spinnerpt8 = new javax.swing.JSpinner();
        jPanel116 = new javax.swing.JPanel();
        jLabel104 = new javax.swing.JLabel();
        pt9 = new javax.swing.JButton();
        spinnerpt9 = new javax.swing.JSpinner();
        jPanel117 = new javax.swing.JPanel();
        jLabel105 = new javax.swing.JLabel();
        pt10 = new javax.swing.JButton();
        spinnerpt10 = new javax.swing.JSpinner();
        jPanel118 = new javax.swing.JPanel();
        jLabel106 = new javax.swing.JLabel();
        pt11 = new javax.swing.JButton();
        spinnerpt11 = new javax.swing.JSpinner();
        jPanel119 = new javax.swing.JPanel();
        jLabel107 = new javax.swing.JLabel();
        pt12 = new javax.swing.JButton();
        spinnerpt12 = new javax.swing.JSpinner();
        jPanel120 = new javax.swing.JPanel();
        jLabel108 = new javax.swing.JLabel();
        pt13 = new javax.swing.JButton();
        spinnerpt13 = new javax.swing.JSpinner();
        jPanel121 = new javax.swing.JPanel();
        jLabel144 = new javax.swing.JLabel();
        pt14 = new javax.swing.JButton();
        spinnerpt14 = new javax.swing.JSpinner();
        jPanel122 = new javax.swing.JPanel();
        jLabel195 = new javax.swing.JLabel();
        pt15 = new javax.swing.JButton();
        spinnerpt15 = new javax.swing.JSpinner();
        jPanel123 = new javax.swing.JPanel();
        jLabel196 = new javax.swing.JLabel();
        pt16 = new javax.swing.JButton();
        spinnerpt16 = new javax.swing.JSpinner();
        jPanel124 = new javax.swing.JPanel();
        jLabel197 = new javax.swing.JLabel();
        pt17 = new javax.swing.JButton();
        spinnerpt17 = new javax.swing.JSpinner();
        jPanel125 = new javax.swing.JPanel();
        jLabel198 = new javax.swing.JLabel();
        pt18 = new javax.swing.JButton();
        spinnerpt18 = new javax.swing.JSpinner();
        jPanel126 = new javax.swing.JPanel();
        jLabel199 = new javax.swing.JLabel();
        pt19 = new javax.swing.JButton();
        spinnerpt19 = new javax.swing.JSpinner();
        jPanel127 = new javax.swing.JPanel();
        jLabel200 = new javax.swing.JLabel();
        pt20 = new javax.swing.JButton();
        spinnerpt20 = new javax.swing.JSpinner();
        jPanel128 = new javax.swing.JPanel();
        jLabel201 = new javax.swing.JLabel();
        pt21 = new javax.swing.JButton();
        spinnerpt21 = new javax.swing.JSpinner();
        jPanel129 = new javax.swing.JPanel();
        jLabel202 = new javax.swing.JLabel();
        pt22 = new javax.swing.JButton();
        spinnerpt22 = new javax.swing.JSpinner();
        jPanel130 = new javax.swing.JPanel();
        jLabel203 = new javax.swing.JLabel();
        pt23 = new javax.swing.JButton();
        spinnerpt23 = new javax.swing.JSpinner();
        jPanel131 = new javax.swing.JPanel();
        jLabel204 = new javax.swing.JLabel();
        pt24 = new javax.swing.JButton();
        spinnerpt24 = new javax.swing.JSpinner();
        jPanel132 = new javax.swing.JPanel();
        jLabel205 = new javax.swing.JLabel();
        pt25 = new javax.swing.JButton();
        spinnerpt25 = new javax.swing.JSpinner();
        jPanel133 = new javax.swing.JPanel();
        jLabel206 = new javax.swing.JLabel();
        pt26 = new javax.swing.JButton();
        spinnerpt26 = new javax.swing.JSpinner();
        jPanel134 = new javax.swing.JPanel();
        jLabel207 = new javax.swing.JLabel();
        pt27 = new javax.swing.JButton();
        spinnerpt27 = new javax.swing.JSpinner();
        jPanel135 = new javax.swing.JPanel();
        jLabel208 = new javax.swing.JLabel();
        pt28 = new javax.swing.JButton();
        spinnerpt28 = new javax.swing.JSpinner();
        jPanel136 = new javax.swing.JPanel();
        jLabel109 = new javax.swing.JLabel();
        pt29 = new javax.swing.JButton();
        spinnerpt29 = new javax.swing.JSpinner();
        jPanel148 = new javax.swing.JPanel();
        jLabel145 = new javax.swing.JLabel();
        pt41 = new javax.swing.JButton();
        spinnerpt41 = new javax.swing.JSpinner();
        jPanel149 = new javax.swing.JPanel();
        jLabel209 = new javax.swing.JLabel();
        pt42 = new javax.swing.JButton();
        spinnerpt42 = new javax.swing.JSpinner();
        pt48 = new javax.swing.JPanel();
        jLabel215 = new javax.swing.JLabel();
        ppt48 = new javax.swing.JButton();
        spinnerpt48 = new javax.swing.JSpinner();
        jPanel151 = new javax.swing.JPanel();
        jLabel211 = new javax.swing.JLabel();
        pt44 = new javax.swing.JButton();
        spinnerpt44 = new javax.swing.JSpinner();
        jPanel145 = new javax.swing.JPanel();
        jLabel118 = new javax.swing.JLabel();
        pt38 = new javax.swing.JButton();
        spinnerpt38 = new javax.swing.JSpinner();
        jPanel137 = new javax.swing.JPanel();
        jLabel110 = new javax.swing.JLabel();
        pt30 = new javax.swing.JButton();
        spinnerpt30 = new javax.swing.JSpinner();
        jPanel152 = new javax.swing.JPanel();
        jLabel212 = new javax.swing.JLabel();
        pt45 = new javax.swing.JButton();
        spinnerpt45 = new javax.swing.JSpinner();
        jPanel154 = new javax.swing.JPanel();
        jLabel214 = new javax.swing.JLabel();
        pt47 = new javax.swing.JButton();
        spinnerpt47 = new javax.swing.JSpinner();
        jPanel153 = new javax.swing.JPanel();
        jLabel213 = new javax.swing.JLabel();
        pt46 = new javax.swing.JButton();
        spinnerpt46 = new javax.swing.JSpinner();
        jPanel146 = new javax.swing.JPanel();
        jLabel119 = new javax.swing.JLabel();
        pt39 = new javax.swing.JButton();
        spinnerpt39 = new javax.swing.JSpinner();
        jPanel143 = new javax.swing.JPanel();
        jLabel116 = new javax.swing.JLabel();
        pt36 = new javax.swing.JButton();
        spinnerpt36 = new javax.swing.JSpinner();
        jPanel139 = new javax.swing.JPanel();
        jLabel112 = new javax.swing.JLabel();
        pt32 = new javax.swing.JButton();
        spinnerpt32 = new javax.swing.JSpinner();
        jPanel147 = new javax.swing.JPanel();
        jLabel120 = new javax.swing.JLabel();
        pt40 = new javax.swing.JButton();
        spinnerpt40 = new javax.swing.JSpinner();
        jPanel142 = new javax.swing.JPanel();
        jLabel115 = new javax.swing.JLabel();
        pt35 = new javax.swing.JButton();
        spinnerpt35 = new javax.swing.JSpinner();
        jPanel150 = new javax.swing.JPanel();
        jLabel210 = new javax.swing.JLabel();
        pt43 = new javax.swing.JButton();
        spinnerpt43 = new javax.swing.JSpinner();
        jPanel138 = new javax.swing.JPanel();
        jLabel111 = new javax.swing.JLabel();
        pt31 = new javax.swing.JButton();
        spinnerpt31 = new javax.swing.JSpinner();
        jPanel144 = new javax.swing.JPanel();
        jLabel117 = new javax.swing.JLabel();
        pt37 = new javax.swing.JButton();
        spinnerpt37 = new javax.swing.JSpinner();
        jPanel140 = new javax.swing.JPanel();
        jLabel113 = new javax.swing.JLabel();
        pt33 = new javax.swing.JButton();
        spinnerpt33 = new javax.swing.JSpinner();
        jPanel141 = new javax.swing.JPanel();
        jLabel114 = new javax.swing.JLabel();
        pt34 = new javax.swing.JButton();
        spinnerpt34 = new javax.swing.JSpinner();
        spraypaintTab = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        SprayPaintholder = new javax.swing.JPanel();
        jPanel80 = new javax.swing.JPanel();
        jLabel83 = new javax.swing.JLabel();
        sp1 = new javax.swing.JButton();
        spinnersp1 = new javax.swing.JSpinner();
        jPanel81 = new javax.swing.JPanel();
        jLabel84 = new javax.swing.JLabel();
        sp2 = new javax.swing.JButton();
        spinnersp2 = new javax.swing.JSpinner();
        jPanel82 = new javax.swing.JPanel();
        jLabel85 = new javax.swing.JLabel();
        sp3 = new javax.swing.JButton();
        spinnersp3 = new javax.swing.JSpinner();
        jPanel83 = new javax.swing.JPanel();
        jLabel86 = new javax.swing.JLabel();
        sp4 = new javax.swing.JButton();
        spinnersp4 = new javax.swing.JSpinner();
        jPanel84 = new javax.swing.JPanel();
        jLabel87 = new javax.swing.JLabel();
        sp5 = new javax.swing.JButton();
        spinnersp5 = new javax.swing.JSpinner();
        jPanel85 = new javax.swing.JPanel();
        jLabel88 = new javax.swing.JLabel();
        sp6 = new javax.swing.JButton();
        spinnersp6 = new javax.swing.JSpinner();
        jPanel86 = new javax.swing.JPanel();
        jLabel89 = new javax.swing.JLabel();
        sp7 = new javax.swing.JButton();
        spinnersp7 = new javax.swing.JSpinner();
        jPanel87 = new javax.swing.JPanel();
        jLabel90 = new javax.swing.JLabel();
        sp8 = new javax.swing.JButton();
        spinnersp8 = new javax.swing.JSpinner();
        jPanel88 = new javax.swing.JPanel();
        jLabel91 = new javax.swing.JLabel();
        sp9 = new javax.swing.JButton();
        spinnersp9 = new javax.swing.JSpinner();
        jPanel89 = new javax.swing.JPanel();
        jLabel92 = new javax.swing.JLabel();
        sp10 = new javax.swing.JButton();
        spinnersp10 = new javax.swing.JSpinner();
        jPanel90 = new javax.swing.JPanel();
        jLabel93 = new javax.swing.JLabel();
        sp11 = new javax.swing.JButton();
        spinnersp11 = new javax.swing.JSpinner();
        jPanel91 = new javax.swing.JPanel();
        jLabel94 = new javax.swing.JLabel();
        sp12 = new javax.swing.JButton();
        spinnersp12 = new javax.swing.JSpinner();
        jPanel92 = new javax.swing.JPanel();
        jLabel95 = new javax.swing.JLabel();
        sp13 = new javax.swing.JButton();
        spinnersp13 = new javax.swing.JSpinner();
        jPanel93 = new javax.swing.JPanel();
        jLabel143 = new javax.swing.JLabel();
        sp14 = new javax.swing.JButton();
        spinnersp14 = new javax.swing.JSpinner();
        tinnerTab = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        thinnerHolder = new javax.swing.JPanel();
        jPanel70 = new javax.swing.JPanel();
        jLabel73 = new javax.swing.JLabel();
        th1 = new javax.swing.JButton();
        spinnerth1 = new javax.swing.JSpinner();
        jPanel71 = new javax.swing.JPanel();
        jLabel74 = new javax.swing.JLabel();
        th2 = new javax.swing.JButton();
        spinnerth2 = new javax.swing.JSpinner();
        jPanel72 = new javax.swing.JPanel();
        jLabel75 = new javax.swing.JLabel();
        th3 = new javax.swing.JButton();
        spinnerth3 = new javax.swing.JSpinner();
        jPanel73 = new javax.swing.JPanel();
        jLabel76 = new javax.swing.JLabel();
        th4 = new javax.swing.JButton();
        spinnerth4 = new javax.swing.JSpinner();
        jPanel74 = new javax.swing.JPanel();
        jLabel77 = new javax.swing.JLabel();
        thh5 = new javax.swing.JButton();
        spinnerth5 = new javax.swing.JSpinner();
        jPanel75 = new javax.swing.JPanel();
        jLabel78 = new javax.swing.JLabel();
        th6 = new javax.swing.JButton();
        spinnerth6 = new javax.swing.JSpinner();
        jPanel76 = new javax.swing.JPanel();
        jLabel79 = new javax.swing.JLabel();
        th7 = new javax.swing.JButton();
        spinnerth7 = new javax.swing.JSpinner();
        jPanel77 = new javax.swing.JPanel();
        jLabel80 = new javax.swing.JLabel();
        th8 = new javax.swing.JButton();
        spinnerth8 = new javax.swing.JSpinner();
        jPanel78 = new javax.swing.JPanel();
        jLabel81 = new javax.swing.JLabel();
        th9 = new javax.swing.JButton();
        spinnerth9 = new javax.swing.JSpinner();
        jPanel79 = new javax.swing.JPanel();
        jLabel82 = new javax.swing.JLabel();
        th10 = new javax.swing.JButton();
        spinnerth10 = new javax.swing.JSpinner();
        bodyfillerTab = new javax.swing.JPanel();
        paintTab2 = new javax.swing.JPanel();
        bodyFiller = new javax.swing.JPanel();
        jPanel30 = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        bf1 = new javax.swing.JButton();
        spinnerbf1 = new javax.swing.JSpinner();
        jPanel31 = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        bf2 = new javax.swing.JButton();
        spinnerbf2 = new javax.swing.JSpinner();
        jPanel44 = new javax.swing.JPanel();
        jLabel63 = new javax.swing.JLabel();
        bf3 = new javax.swing.JButton();
        spinnerbf3 = new javax.swing.JSpinner();
        undercoatTab = new javax.swing.JPanel();
        paintTab3 = new javax.swing.JPanel();
        undercoatHolder = new javax.swing.JPanel();
        jPanel33 = new javax.swing.JPanel();
        jLabel52 = new javax.swing.JLabel();
        uc1 = new javax.swing.JButton();
        spinneruc1 = new javax.swing.JSpinner();
        hardwareTab = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        hardwareMaterial = new javax.swing.JPanel();
        jPanel28 = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        hm1 = new javax.swing.JButton();
        spinnerhm1 = new javax.swing.JSpinner();
        jPanel29 = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        hm2 = new javax.swing.JButton();
        spinnerhm2 = new javax.swing.JSpinner();
        jPanel35 = new javax.swing.JPanel();
        jLabel54 = new javax.swing.JLabel();
        hm3 = new javax.swing.JButton();
        spinnerhm3 = new javax.swing.JSpinner();
        jPanel34 = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        hm4 = new javax.swing.JButton();
        spinnerhm4 = new javax.swing.JSpinner();
        jPanel37 = new javax.swing.JPanel();
        jLabel56 = new javax.swing.JLabel();
        hm5 = new javax.swing.JButton();
        spinnerhm5 = new javax.swing.JSpinner();
        jPanel36 = new javax.swing.JPanel();
        jLabel55 = new javax.swing.JLabel();
        hm6 = new javax.swing.JButton();
        spinnerhm6 = new javax.swing.JSpinner();
        jPanel38 = new javax.swing.JPanel();
        jLabel57 = new javax.swing.JLabel();
        hm7 = new javax.swing.JButton();
        spinnerhm7 = new javax.swing.JSpinner();
        jPanel39 = new javax.swing.JPanel();
        jLabel58 = new javax.swing.JLabel();
        hm8 = new javax.swing.JButton();
        spinnerhm8 = new javax.swing.JSpinner();
        jPanel40 = new javax.swing.JPanel();
        jLabel59 = new javax.swing.JLabel();
        hm9 = new javax.swing.JButton();
        spinnerhm9 = new javax.swing.JSpinner();
        jPanel41 = new javax.swing.JPanel();
        jLabel60 = new javax.swing.JLabel();
        hm10 = new javax.swing.JButton();
        spinnerhm10 = new javax.swing.JSpinner();
        jPanel42 = new javax.swing.JPanel();
        jLabel61 = new javax.swing.JLabel();
        hm11 = new javax.swing.JButton();
        spinnerhm11 = new javax.swing.JSpinner();
        jPanel43 = new javax.swing.JPanel();
        jLabel62 = new javax.swing.JLabel();
        hm12 = new javax.swing.JButton();
        spinnerhm12 = new javax.swing.JSpinner();
        jPanel32 = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        hm13 = new javax.swing.JButton();
        spinnerhm13 = new javax.swing.JSpinner();
        jPanel54 = new javax.swing.JPanel();
        jLabel141 = new javax.swing.JLabel();
        hm14 = new javax.swing.JButton();
        spinnerhm14 = new javax.swing.JSpinner();
        jPanel55 = new javax.swing.JPanel();
        jLabel167 = new javax.swing.JLabel();
        hm15 = new javax.swing.JButton();
        spinnerhm15 = new javax.swing.JSpinner();
        jPanel56 = new javax.swing.JPanel();
        jLabel168 = new javax.swing.JLabel();
        hm16 = new javax.swing.JButton();
        spinnerhm16 = new javax.swing.JSpinner();
        jPanel57 = new javax.swing.JPanel();
        jLabel169 = new javax.swing.JLabel();
        hm17 = new javax.swing.JButton();
        spinnerhm17 = new javax.swing.JSpinner();
        jPanel58 = new javax.swing.JPanel();
        jLabel170 = new javax.swing.JLabel();
        hm18 = new javax.swing.JButton();
        spinnerhm18 = new javax.swing.JSpinner();
        jPanel59 = new javax.swing.JPanel();
        jLabel171 = new javax.swing.JLabel();
        hm19 = new javax.swing.JButton();
        spinnerhm19 = new javax.swing.JSpinner();
        jPanel60 = new javax.swing.JPanel();
        jLabel172 = new javax.swing.JLabel();
        hm20 = new javax.swing.JButton();
        spinnerhm20 = new javax.swing.JSpinner();
        jPanel61 = new javax.swing.JPanel();
        jLabel173 = new javax.swing.JLabel();
        hm21 = new javax.swing.JButton();
        spinnerhm21 = new javax.swing.JSpinner();
        jPanel95 = new javax.swing.JPanel();
        jLabel174 = new javax.swing.JLabel();
        hm22 = new javax.swing.JButton();
        spinnerhm22 = new javax.swing.JSpinner();
        jPanel96 = new javax.swing.JPanel();
        jLabel175 = new javax.swing.JLabel();
        hm23 = new javax.swing.JButton();
        spinnerhm23 = new javax.swing.JSpinner();
        jPanel100 = new javax.swing.JPanel();
        jLabel176 = new javax.swing.JLabel();
        hm24 = new javax.swing.JButton();
        spinnerhm24 = new javax.swing.JSpinner();
        jPanel101 = new javax.swing.JPanel();
        jLabel177 = new javax.swing.JLabel();
        hm25 = new javax.swing.JButton();
        spinnerhm25 = new javax.swing.JSpinner();
        jPanel103 = new javax.swing.JPanel();
        jLabel178 = new javax.swing.JLabel();
        hm26 = new javax.swing.JButton();
        spinnerhm26 = new javax.swing.JSpinner();
        jPanel106 = new javax.swing.JPanel();
        jLabel179 = new javax.swing.JLabel();
        hm27 = new javax.swing.JButton();
        spinnerhm27 = new javax.swing.JSpinner();
        jPanel109 = new javax.swing.JPanel();
        jLabel180 = new javax.swing.JLabel();
        hm28 = new javax.swing.JButton();
        spinnerhm28 = new javax.swing.JSpinner();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        overallTable = new javax.swing.JTable();
        overallSpinner = new javax.swing.JSpinner();
        addItem = new javax.swing.JButton();
        search = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        Background.setBackground(new java.awt.Color(66, 139, 37));

        ButtonHolder.setBackground(new java.awt.Color(227, 193, 55));

        paintButton.setBackground(new java.awt.Color(26, 99, 0));
        paintButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        paintButton.setForeground(new java.awt.Color(255, 255, 255));
        paintButton.setText("Paints");
        paintButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        paintButton.setBorderPainted(false);
        paintButton.setFocusable(false);
        paintButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paintButtonActionPerformed(evt);
            }
        });

        spraypaintButton.setBackground(new java.awt.Color(26, 99, 0));
        spraypaintButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        spraypaintButton.setForeground(new java.awt.Color(255, 255, 255));
        spraypaintButton.setText("Spray Paints");
        spraypaintButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        spraypaintButton.setBorderPainted(false);
        spraypaintButton.setFocusable(false);
        spraypaintButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spraypaintButtonActionPerformed(evt);
            }
        });

        tinnerButton.setBackground(new java.awt.Color(26, 99, 0));
        tinnerButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        tinnerButton.setForeground(new java.awt.Color(255, 255, 255));
        tinnerButton.setText("Thinner");
        tinnerButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tinnerButton.setBorderPainted(false);
        tinnerButton.setFocusable(false);
        tinnerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tinnerButtonActionPerformed(evt);
            }
        });

        bodyfillerButton.setBackground(new java.awt.Color(26, 99, 0));
        bodyfillerButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        bodyfillerButton.setForeground(new java.awt.Color(255, 255, 255));
        bodyfillerButton.setText("Body Filler");
        bodyfillerButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        bodyfillerButton.setBorderPainted(false);
        bodyfillerButton.setFocusPainted(false);
        bodyfillerButton.setFocusable(false);
        bodyfillerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bodyfillerButtonActionPerformed(evt);
            }
        });

        undercoatButton.setBackground(new java.awt.Color(26, 99, 0));
        undercoatButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        undercoatButton.setForeground(new java.awt.Color(255, 255, 255));
        undercoatButton.setText("Under Coat");
        undercoatButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        undercoatButton.setBorderPainted(false);
        undercoatButton.setFocusPainted(false);
        undercoatButton.setFocusable(false);
        undercoatButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                undercoatButtonActionPerformed(evt);
            }
        });

        hardwareButton.setBackground(new java.awt.Color(26, 99, 0));
        hardwareButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        hardwareButton.setForeground(new java.awt.Color(255, 255, 255));
        hardwareButton.setText("Hardware Materials");
        hardwareButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        hardwareButton.setBorderPainted(false);
        hardwareButton.setFocusPainted(false);
        hardwareButton.setFocusable(false);
        hardwareButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hardwareButtonActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(66, 139, 37));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ITEM ");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CATEGORY");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(72, 72, 72))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        overallButton.setBackground(new java.awt.Color(26, 99, 0));
        overallButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
        overallButton.setForeground(new java.awt.Color(255, 255, 255));
        overallButton.setText("Over-All Product");
        overallButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        overallButton.setBorderPainted(false);
        overallButton.setFocusPainted(false);
        overallButton.setFocusable(false);
        overallButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                overallButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ButtonHolderLayout = new javax.swing.GroupLayout(ButtonHolder);
        ButtonHolder.setLayout(ButtonHolderLayout);
        ButtonHolderLayout.setHorizontalGroup(
            ButtonHolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonHolderLayout.createSequentialGroup()
                .addGroup(ButtonHolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ButtonHolderLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(ButtonHolderLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(ButtonHolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hardwareButton, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(ButtonHolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(bodyfillerButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tinnerButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(paintButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(spraypaintButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE))
                            .addComponent(overallButton, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(undercoatButton, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 14, Short.MAX_VALUE)))
                .addContainerGap())
        );
        ButtonHolderLayout.setVerticalGroup(
            ButtonHolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonHolderLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(paintButton, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(spraypaintButton, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tinnerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bodyfillerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(undercoatButton, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(hardwareButton, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(overallButton, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        ReceiptHolder.setBackground(new java.awt.Color(227, 193, 55));

        jPanel5.setBackground(new java.awt.Color(66, 139, 37));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CART");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                .addContainerGap())
        );

        Tableholder.setBackground(new java.awt.Color(66, 139, 37));
        Tableholder.setToolTipText("");

        Cart.setAutoCreateRowSorter(true);
        Cart.setBackground(new java.awt.Color(255, 255, 255));
        Cart.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Cart.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                " Qty", "                     Product Name", "  Price", "  Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Cart.setGridColor(new java.awt.Color(70, 73, 75));
        Cart.setRowHeight(25);
        Cart.setSelectionBackground(new java.awt.Color(255, 255, 255));
        Cart.setSelectionForeground(new java.awt.Color(0, 0, 0));
        Cart.setShowGrid(true);
        Cart.getTableHeader().setReorderingAllowed(false);
        Cart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CartMouseClicked(evt);
            }
        });
        Cart.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CartKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(Cart);
        if (Cart.getColumnModel().getColumnCount() > 0) {
            Cart.getColumnModel().getColumn(0).setResizable(false);
            Cart.getColumnModel().getColumn(0).setPreferredWidth(1);
            Cart.getColumnModel().getColumn(1).setResizable(false);
            Cart.getColumnModel().getColumn(1).setPreferredWidth(180);
            Cart.getColumnModel().getColumn(2).setResizable(false);
            Cart.getColumnModel().getColumn(2).setPreferredWidth(25);
            Cart.getColumnModel().getColumn(3).setResizable(false);
            Cart.getColumnModel().getColumn(3).setPreferredWidth(30);
        }

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Total Price :");

        labelTotalPrice.setBackground(new java.awt.Color(0, 0, 0));
        labelTotalPrice.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelTotalPrice.setForeground(new java.awt.Color(255, 255, 255));
        labelTotalPrice.setText("0.00");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Payment : ");

        inputPayment.setBackground(new java.awt.Color(81, 154, 52));
        inputPayment.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        inputPayment.setForeground(new java.awt.Color(255, 255, 255));
        inputPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputPaymentActionPerformed(evt);
            }
        });
        inputPayment.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                inputPaymentKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout TableholderLayout = new javax.swing.GroupLayout(Tableholder);
        Tableholder.setLayout(TableholderLayout);
        TableholderLayout.setHorizontalGroup(
            TableholderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TableholderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TableholderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel2))
                .addGap(22, 22, 22)
                .addGroup(TableholderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        TableholderLayout.setVerticalGroup(
            TableholderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TableholderLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(TableholderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTotalPrice, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TableholderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(inputPayment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        Clear.setBackground(new java.awt.Color(0, 204, 204));
        Clear.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Clear.setForeground(new java.awt.Color(255, 255, 255));
        Clear.setText("CLEAR");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        Checkout.setBackground(new java.awt.Color(255, 153, 0));
        Checkout.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Checkout.setForeground(new java.awt.Color(255, 255, 255));
        Checkout.setText("CHECK OUT");
        Checkout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckoutActionPerformed(evt);
            }
        });

        remove.setBackground(new java.awt.Color(255, 0, 0));
        remove.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        remove.setForeground(new java.awt.Color(255, 255, 255));
        remove.setText("REMOVE");
        remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeActionPerformed(evt);
            }
        });

        LogoutButton.setBackground(new java.awt.Color(0, 204, 0));
        LogoutButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LogoutButton.setForeground(new java.awt.Color(255, 255, 255));
        LogoutButton.setText("LOG OUT");
        LogoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ReceiptHolderLayout = new javax.swing.GroupLayout(ReceiptHolder);
        ReceiptHolder.setLayout(ReceiptHolderLayout);
        ReceiptHolderLayout.setHorizontalGroup(
            ReceiptHolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReceiptHolderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ReceiptHolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LogoutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Tableholder, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(ReceiptHolderLayout.createSequentialGroup()
                        .addComponent(remove, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Checkout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(6, 6, 6)))
                .addContainerGap())
        );
        ReceiptHolderLayout.setVerticalGroup(
            ReceiptHolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReceiptHolderLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Tableholder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ReceiptHolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Checkout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(remove, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Clear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LogoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        paintTab.setBackground(new java.awt.Color(227, 193, 55));

        paintHolder.setBackground(new java.awt.Color(227, 193, 55));

        jPanel94.setBackground(new java.awt.Color(81, 154, 52));

        jLabel96.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Paint_Image/10001.png"))); // NOI18N

        pt1.setText("Add Item");
        pt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pt1ActionPerformed(evt);
            }
        });

        spinnerpt1.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel94Layout = new javax.swing.GroupLayout(jPanel94);
        jPanel94.setLayout(jPanel94Layout);
        jPanel94Layout.setHorizontalGroup(
            jPanel94Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel94Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel94Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel96, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel94Layout.createSequentialGroup()
                        .addComponent(spinnerpt1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pt1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel94Layout.setVerticalGroup(
            jPanel94Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel94Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel96, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel94Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pt1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(spinnerpt1))
                .addContainerGap())
        );

        jPanel99.setBackground(new java.awt.Color(81, 154, 52));

        jLabel97.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Paint_Image/10002.png"))); // NOI18N

        pt2.setText("Add Item");
        pt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pt2ActionPerformed(evt);
            }
        });

        spinnerpt2.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel99Layout = new javax.swing.GroupLayout(jPanel99);
        jPanel99.setLayout(jPanel99Layout);
        jPanel99Layout.setHorizontalGroup(
            jPanel99Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel99Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel99Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel97, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel99Layout.createSequentialGroup()
                        .addComponent(spinnerpt2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pt2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel99Layout.setVerticalGroup(
            jPanel99Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel99Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel97, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel99Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pt2, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(spinnerpt2))
                .addContainerGap())
        );

        jPanel108.setBackground(new java.awt.Color(81, 154, 52));

        jLabel98.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Paint_Image/10003.png"))); // NOI18N

        pt3.setText("Add Item");
        pt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pt3ActionPerformed(evt);
            }
        });

        spinnerpt3.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel108Layout = new javax.swing.GroupLayout(jPanel108);
        jPanel108.setLayout(jPanel108Layout);
        jPanel108Layout.setHorizontalGroup(
            jPanel108Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel108Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel108Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel98, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel108Layout.createSequentialGroup()
                        .addComponent(spinnerpt3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pt3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel108Layout.setVerticalGroup(
            jPanel108Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel108Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel98, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel108Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pt3, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(spinnerpt3))
                .addContainerGap())
        );

        jPanel111.setBackground(new java.awt.Color(81, 154, 52));

        jLabel99.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Paint_Image/10004.png"))); // NOI18N

        pt4.setText("Add Item");
        pt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pt4ActionPerformed(evt);
            }
        });

        spinnerpt4.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel111Layout = new javax.swing.GroupLayout(jPanel111);
        jPanel111.setLayout(jPanel111Layout);
        jPanel111Layout.setHorizontalGroup(
            jPanel111Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel111Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel111Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel99, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel111Layout.createSequentialGroup()
                        .addComponent(spinnerpt4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pt4, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel111Layout.setVerticalGroup(
            jPanel111Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel111Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel99, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel111Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pt4, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(spinnerpt4))
                .addContainerGap())
        );

        jPanel112.setBackground(new java.awt.Color(81, 154, 52));

        jLabel100.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Paint_Image/10005.png"))); // NOI18N

        pt5.setText("Add Item");
        pt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pt5ActionPerformed(evt);
            }
        });

        spinnerpt5.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel112Layout = new javax.swing.GroupLayout(jPanel112);
        jPanel112.setLayout(jPanel112Layout);
        jPanel112Layout.setHorizontalGroup(
            jPanel112Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel112Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel112Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel100, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel112Layout.createSequentialGroup()
                        .addComponent(spinnerpt5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pt5, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel112Layout.setVerticalGroup(
            jPanel112Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel112Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel100, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel112Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pt5, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(spinnerpt5))
                .addContainerGap())
        );

        jPanel113.setBackground(new java.awt.Color(81, 154, 52));

        jLabel101.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Paint_Image/10006.png"))); // NOI18N

        pt6.setText("Add Item");
        pt6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pt6ActionPerformed(evt);
            }
        });

        spinnerpt6.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel113Layout = new javax.swing.GroupLayout(jPanel113);
        jPanel113.setLayout(jPanel113Layout);
        jPanel113Layout.setHorizontalGroup(
            jPanel113Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel113Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel113Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel101, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel113Layout.createSequentialGroup()
                        .addComponent(spinnerpt6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pt6, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel113Layout.setVerticalGroup(
            jPanel113Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel113Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel101, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel113Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pt6, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(spinnerpt6))
                .addContainerGap())
        );

        jPanel114.setBackground(new java.awt.Color(81, 154, 52));

        jLabel102.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Paint_Image/10007.png"))); // NOI18N

        pt7.setText("Add Item");
        pt7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pt7ActionPerformed(evt);
            }
        });

        spinnerpt7.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel114Layout = new javax.swing.GroupLayout(jPanel114);
        jPanel114.setLayout(jPanel114Layout);
        jPanel114Layout.setHorizontalGroup(
            jPanel114Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel114Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel114Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel102, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel114Layout.createSequentialGroup()
                        .addComponent(spinnerpt7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pt7, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel114Layout.setVerticalGroup(
            jPanel114Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel114Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel102, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel114Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pt7, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(spinnerpt7))
                .addContainerGap())
        );

        jPanel115.setBackground(new java.awt.Color(81, 154, 52));

        jLabel103.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Paint_Image/10008.png"))); // NOI18N

        pt8.setText("Add Item");
        pt8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pt8ActionPerformed(evt);
            }
        });

        spinnerpt8.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel115Layout = new javax.swing.GroupLayout(jPanel115);
        jPanel115.setLayout(jPanel115Layout);
        jPanel115Layout.setHorizontalGroup(
            jPanel115Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel115Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel115Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel103, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel115Layout.createSequentialGroup()
                        .addComponent(spinnerpt8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pt8, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel115Layout.setVerticalGroup(
            jPanel115Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel115Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel103, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel115Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pt8, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(spinnerpt8))
                .addContainerGap())
        );

        jPanel116.setBackground(new java.awt.Color(81, 154, 52));

        jLabel104.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Paint_Image/10009.png"))); // NOI18N

        pt9.setText("Add Item");
        pt9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pt9ActionPerformed(evt);
            }
        });

        spinnerpt9.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel116Layout = new javax.swing.GroupLayout(jPanel116);
        jPanel116.setLayout(jPanel116Layout);
        jPanel116Layout.setHorizontalGroup(
            jPanel116Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel116Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel116Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel104, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel116Layout.createSequentialGroup()
                        .addComponent(spinnerpt9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pt9, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel116Layout.setVerticalGroup(
            jPanel116Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel116Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel104, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel116Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pt9, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(spinnerpt9))
                .addContainerGap())
        );

        jPanel117.setBackground(new java.awt.Color(81, 154, 52));

        jLabel105.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Paint_Image/10010.png"))); // NOI18N

        pt10.setText("Add Item");
        pt10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pt10ActionPerformed(evt);
            }
        });

        spinnerpt10.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel117Layout = new javax.swing.GroupLayout(jPanel117);
        jPanel117.setLayout(jPanel117Layout);
        jPanel117Layout.setHorizontalGroup(
            jPanel117Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel117Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel117Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel105, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel117Layout.createSequentialGroup()
                        .addComponent(spinnerpt10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pt10, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel117Layout.setVerticalGroup(
            jPanel117Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel117Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel105, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel117Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pt10, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(spinnerpt10))
                .addContainerGap())
        );

        jPanel118.setBackground(new java.awt.Color(81, 154, 52));

        jLabel106.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Paint_Image/10011.png"))); // NOI18N

        pt11.setText("Add Item");
        pt11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pt11ActionPerformed(evt);
            }
        });

        spinnerpt11.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel118Layout = new javax.swing.GroupLayout(jPanel118);
        jPanel118.setLayout(jPanel118Layout);
        jPanel118Layout.setHorizontalGroup(
            jPanel118Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel118Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel118Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel106, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel118Layout.createSequentialGroup()
                        .addComponent(spinnerpt11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pt11, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel118Layout.setVerticalGroup(
            jPanel118Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel118Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel106, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel118Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pt11, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(spinnerpt11))
                .addContainerGap())
        );

        jPanel119.setBackground(new java.awt.Color(81, 154, 52));

        jLabel107.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Paint_Image/10012.png"))); // NOI18N

        pt12.setText("Add Item");
        pt12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pt12ActionPerformed(evt);
            }
        });

        spinnerpt12.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel119Layout = new javax.swing.GroupLayout(jPanel119);
        jPanel119.setLayout(jPanel119Layout);
        jPanel119Layout.setHorizontalGroup(
            jPanel119Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel119Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel119Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel107, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel119Layout.createSequentialGroup()
                        .addComponent(spinnerpt12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pt12, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel119Layout.setVerticalGroup(
            jPanel119Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel119Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel107, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel119Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pt12, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(spinnerpt12))
                .addContainerGap())
        );

        jPanel120.setBackground(new java.awt.Color(81, 154, 52));

        jLabel108.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Paint_Image/10013.png"))); // NOI18N

        pt13.setText("Add Item");
        pt13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pt13ActionPerformed(evt);
            }
        });

        spinnerpt13.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel120Layout = new javax.swing.GroupLayout(jPanel120);
        jPanel120.setLayout(jPanel120Layout);
        jPanel120Layout.setHorizontalGroup(
            jPanel120Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel120Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel120Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel108, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel120Layout.createSequentialGroup()
                        .addComponent(spinnerpt13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pt13, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel120Layout.setVerticalGroup(
            jPanel120Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel120Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel108, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel120Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pt13, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(spinnerpt13))
                .addContainerGap())
        );

        jPanel121.setBackground(new java.awt.Color(81, 154, 52));

        jLabel144.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Paint_Image/10014.png"))); // NOI18N

        pt14.setText("Add Item");
        pt14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pt14ActionPerformed(evt);
            }
        });

        spinnerpt14.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel121Layout = new javax.swing.GroupLayout(jPanel121);
        jPanel121.setLayout(jPanel121Layout);
        jPanel121Layout.setHorizontalGroup(
            jPanel121Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel121Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel121Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel144, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel121Layout.createSequentialGroup()
                        .addComponent(spinnerpt14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pt14, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel121Layout.setVerticalGroup(
            jPanel121Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel121Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel144, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel121Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pt14, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(spinnerpt14))
                .addContainerGap())
        );

        jPanel122.setBackground(new java.awt.Color(81, 154, 52));

        jLabel195.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Paint_Image/10015.png"))); // NOI18N

        pt15.setText("Add Item");
        pt15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pt15ActionPerformed(evt);
            }
        });

        spinnerpt15.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel122Layout = new javax.swing.GroupLayout(jPanel122);
        jPanel122.setLayout(jPanel122Layout);
        jPanel122Layout.setHorizontalGroup(
            jPanel122Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel122Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel122Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel195, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel122Layout.createSequentialGroup()
                        .addComponent(spinnerpt15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pt15, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel122Layout.setVerticalGroup(
            jPanel122Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel122Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel195, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel122Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pt15, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(spinnerpt15))
                .addContainerGap())
        );

        jPanel123.setBackground(new java.awt.Color(81, 154, 52));

        jLabel196.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Paint_Image/10016.png"))); // NOI18N

        pt16.setText("Add Item");
        pt16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pt16ActionPerformed(evt);
            }
        });

        spinnerpt16.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel123Layout = new javax.swing.GroupLayout(jPanel123);
        jPanel123.setLayout(jPanel123Layout);
        jPanel123Layout.setHorizontalGroup(
            jPanel123Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel123Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel123Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel196, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel123Layout.createSequentialGroup()
                        .addComponent(spinnerpt16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pt16, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel123Layout.setVerticalGroup(
            jPanel123Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel123Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel196, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel123Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pt16, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(spinnerpt16))
                .addContainerGap())
        );

        jPanel124.setBackground(new java.awt.Color(81, 154, 52));

        jLabel197.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Paint_Image/10017.png"))); // NOI18N

        pt17.setText("Add Item");
        pt17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pt17ActionPerformed(evt);
            }
        });

        spinnerpt17.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel124Layout = new javax.swing.GroupLayout(jPanel124);
        jPanel124.setLayout(jPanel124Layout);
        jPanel124Layout.setHorizontalGroup(
            jPanel124Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel124Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel124Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel197, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel124Layout.createSequentialGroup()
                        .addComponent(spinnerpt17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pt17, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel124Layout.setVerticalGroup(
            jPanel124Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel124Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel197, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel124Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pt17, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(spinnerpt17))
                .addContainerGap())
        );

        jPanel125.setBackground(new java.awt.Color(81, 154, 52));

        jLabel198.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Paint_Image/10018.png"))); // NOI18N

        pt18.setText("Add Item");
        pt18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pt18ActionPerformed(evt);
            }
        });

        spinnerpt18.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel125Layout = new javax.swing.GroupLayout(jPanel125);
        jPanel125.setLayout(jPanel125Layout);
        jPanel125Layout.setHorizontalGroup(
            jPanel125Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel125Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel125Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel198, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel125Layout.createSequentialGroup()
                        .addComponent(spinnerpt18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pt18, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel125Layout.setVerticalGroup(
            jPanel125Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel125Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel198, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel125Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pt18, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(spinnerpt18))
                .addContainerGap())
        );

        jPanel126.setBackground(new java.awt.Color(81, 154, 52));

        jLabel199.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Paint_Image/10019.png"))); // NOI18N

        pt19.setText("Add Item");
        pt19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pt19ActionPerformed(evt);
            }
        });

        spinnerpt19.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel126Layout = new javax.swing.GroupLayout(jPanel126);
        jPanel126.setLayout(jPanel126Layout);
        jPanel126Layout.setHorizontalGroup(
            jPanel126Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel126Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel126Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel199, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel126Layout.createSequentialGroup()
                        .addComponent(spinnerpt19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pt19, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel126Layout.setVerticalGroup(
            jPanel126Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel126Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel199, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel126Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pt19, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(spinnerpt19))
                .addContainerGap())
        );

        jPanel127.setBackground(new java.awt.Color(81, 154, 52));

        jLabel200.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Paint_Image/10020.png"))); // NOI18N

        pt20.setText("Add Item");
        pt20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pt20ActionPerformed(evt);
            }
        });

        spinnerpt20.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel127Layout = new javax.swing.GroupLayout(jPanel127);
        jPanel127.setLayout(jPanel127Layout);
        jPanel127Layout.setHorizontalGroup(
            jPanel127Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel127Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel127Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel200, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel127Layout.createSequentialGroup()
                        .addComponent(spinnerpt20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pt20, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel127Layout.setVerticalGroup(
            jPanel127Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel127Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel200, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel127Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pt20, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(spinnerpt20))
                .addContainerGap())
        );

        jPanel128.setBackground(new java.awt.Color(81, 154, 52));

        jLabel201.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Paint_Image/10021.png"))); // NOI18N

        pt21.setText("Add Item");
        pt21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pt21ActionPerformed(evt);
            }
        });

        spinnerpt21.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel128Layout = new javax.swing.GroupLayout(jPanel128);
        jPanel128.setLayout(jPanel128Layout);
        jPanel128Layout.setHorizontalGroup(
            jPanel128Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel128Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel128Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel201, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel128Layout.createSequentialGroup()
                        .addComponent(spinnerpt21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pt21, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel128Layout.setVerticalGroup(
            jPanel128Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel128Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel201, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel128Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pt21, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(spinnerpt21))
                .addContainerGap())
        );

        jPanel129.setBackground(new java.awt.Color(81, 154, 52));

        jLabel202.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Paint_Image/10022.png"))); // NOI18N

        pt22.setText("Add Item");
        pt22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pt22ActionPerformed(evt);
            }
        });

        spinnerpt22.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel129Layout = new javax.swing.GroupLayout(jPanel129);
        jPanel129.setLayout(jPanel129Layout);
        jPanel129Layout.setHorizontalGroup(
            jPanel129Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel129Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel129Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel202, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel129Layout.createSequentialGroup()
                        .addComponent(spinnerpt22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pt22, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel129Layout.setVerticalGroup(
            jPanel129Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel129Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel202, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel129Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pt22, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(spinnerpt22))
                .addContainerGap())
        );

        jPanel130.setBackground(new java.awt.Color(81, 154, 52));

        jLabel203.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Paint_Image/10023.png"))); // NOI18N

        pt23.setText("Add Item");
        pt23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pt23ActionPerformed(evt);
            }
        });

        spinnerpt23.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel130Layout = new javax.swing.GroupLayout(jPanel130);
        jPanel130.setLayout(jPanel130Layout);
        jPanel130Layout.setHorizontalGroup(
            jPanel130Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel130Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel130Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel203, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel130Layout.createSequentialGroup()
                        .addComponent(spinnerpt23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pt23, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel130Layout.setVerticalGroup(
            jPanel130Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel130Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel203, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel130Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pt23, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(spinnerpt23))
                .addContainerGap())
        );

        jPanel131.setBackground(new java.awt.Color(81, 154, 52));

        jLabel204.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Paint_Image/10024.png"))); // NOI18N

        pt24.setText("Add Item");
        pt24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pt24ActionPerformed(evt);
            }
        });

        spinnerpt24.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel131Layout = new javax.swing.GroupLayout(jPanel131);
        jPanel131.setLayout(jPanel131Layout);
        jPanel131Layout.setHorizontalGroup(
            jPanel131Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel131Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel131Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel204, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel131Layout.createSequentialGroup()
                        .addComponent(spinnerpt24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pt24, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel131Layout.setVerticalGroup(
            jPanel131Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel131Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel204, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel131Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pt24, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(spinnerpt24))
                .addContainerGap())
        );

        jPanel132.setBackground(new java.awt.Color(81, 154, 52));

        jLabel205.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Paint_Image/10025.png"))); // NOI18N

        pt25.setText("Add Item");
        pt25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pt25ActionPerformed(evt);
            }
        });

        spinnerpt25.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel132Layout = new javax.swing.GroupLayout(jPanel132);
        jPanel132.setLayout(jPanel132Layout);
        jPanel132Layout.setHorizontalGroup(
            jPanel132Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel132Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel132Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel205, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel132Layout.createSequentialGroup()
                        .addComponent(spinnerpt25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pt25, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel132Layout.setVerticalGroup(
            jPanel132Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel132Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel205, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel132Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pt25, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(spinnerpt25))
                .addContainerGap())
        );

        jPanel133.setBackground(new java.awt.Color(81, 154, 52));

        jLabel206.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Paint_Image/10026.png"))); // NOI18N

        pt26.setText("Add Item");
        pt26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pt26ActionPerformed(evt);
            }
        });

        spinnerpt26.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel133Layout = new javax.swing.GroupLayout(jPanel133);
        jPanel133.setLayout(jPanel133Layout);
        jPanel133Layout.setHorizontalGroup(
            jPanel133Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel133Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel133Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel206, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel133Layout.createSequentialGroup()
                        .addComponent(spinnerpt26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pt26, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel133Layout.setVerticalGroup(
            jPanel133Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel133Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel206, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel133Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pt26, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(spinnerpt26))
                .addContainerGap())
        );

        jPanel134.setBackground(new java.awt.Color(81, 154, 52));

        jLabel207.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Paint_Image/10027.png"))); // NOI18N

        pt27.setText("Add Item");
        pt27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pt27ActionPerformed(evt);
            }
        });

        spinnerpt27.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel134Layout = new javax.swing.GroupLayout(jPanel134);
        jPanel134.setLayout(jPanel134Layout);
        jPanel134Layout.setHorizontalGroup(
            jPanel134Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel134Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel134Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel207, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel134Layout.createSequentialGroup()
                        .addComponent(spinnerpt27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pt27, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel134Layout.setVerticalGroup(
            jPanel134Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel134Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel207, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel134Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pt27, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(spinnerpt27))
                .addContainerGap())
        );

        jPanel135.setBackground(new java.awt.Color(81, 154, 52));

        jLabel208.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Paint_Image/10028.png"))); // NOI18N

        pt28.setText("Add Item");
        pt28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pt28ActionPerformed(evt);
            }
        });

        spinnerpt28.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel135Layout = new javax.swing.GroupLayout(jPanel135);
        jPanel135.setLayout(jPanel135Layout);
        jPanel135Layout.setHorizontalGroup(
            jPanel135Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel135Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel135Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel208, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel135Layout.createSequentialGroup()
                        .addComponent(spinnerpt28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pt28, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel135Layout.setVerticalGroup(
            jPanel135Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel135Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel208, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel135Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pt28, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(spinnerpt28))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel136.setBackground(new java.awt.Color(81, 154, 52));

        jLabel109.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Paint_Image/10029.png"))); // NOI18N

        pt29.setText("Add Item");
        pt29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pt29ActionPerformed(evt);
            }
        });

        spinnerpt29.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel136Layout = new javax.swing.GroupLayout(jPanel136);
        jPanel136.setLayout(jPanel136Layout);
        jPanel136Layout.setHorizontalGroup(
            jPanel136Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel136Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel136Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel109, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel136Layout.createSequentialGroup()
                        .addComponent(spinnerpt29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pt29, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel136Layout.setVerticalGroup(
            jPanel136Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel136Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel109, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel136Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pt29, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(spinnerpt29))
                .addContainerGap())
        );

        jPanel148.setBackground(new java.awt.Color(81, 154, 52));

        jLabel145.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Paint_Image/10041.png"))); // NOI18N

        pt41.setText("Add Item");
        pt41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pt41ActionPerformed(evt);
            }
        });

        spinnerpt41.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel148Layout = new javax.swing.GroupLayout(jPanel148);
        jPanel148.setLayout(jPanel148Layout);
        jPanel148Layout.setHorizontalGroup(
            jPanel148Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel148Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel148Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel145, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel148Layout.createSequentialGroup()
                        .addComponent(spinnerpt41)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pt41, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel148Layout.setVerticalGroup(
            jPanel148Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel148Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel145, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel148Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pt41, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(spinnerpt41))
                .addContainerGap())
        );

        jPanel149.setBackground(new java.awt.Color(81, 154, 52));

        jLabel209.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Paint_Image/10042.png"))); // NOI18N

        pt42.setText("Add Item");
        pt42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pt42ActionPerformed(evt);
            }
        });

        spinnerpt42.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel149Layout = new javax.swing.GroupLayout(jPanel149);
        jPanel149.setLayout(jPanel149Layout);
        jPanel149Layout.setHorizontalGroup(
            jPanel149Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel149Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel149Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel209, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel149Layout.createSequentialGroup()
                        .addComponent(spinnerpt42)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pt42, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel149Layout.setVerticalGroup(
            jPanel149Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel149Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel209, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel149Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pt42, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(spinnerpt42))
                .addContainerGap())
        );

        pt48.setBackground(new java.awt.Color(81, 154, 52));

        jLabel215.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Paint_Image/10048.png"))); // NOI18N

        ppt48.setText("Add Item");
        ppt48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ppt48ActionPerformed(evt);
            }
        });

        spinnerpt48.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout pt48Layout = new javax.swing.GroupLayout(pt48);
        pt48.setLayout(pt48Layout);
        pt48Layout.setHorizontalGroup(
            pt48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pt48Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pt48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel215, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pt48Layout.createSequentialGroup()
                        .addComponent(spinnerpt48)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ppt48, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pt48Layout.setVerticalGroup(
            pt48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pt48Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel215, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pt48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ppt48, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(spinnerpt48))
                .addContainerGap())
        );

        jPanel151.setBackground(new java.awt.Color(81, 154, 52));

        jLabel211.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Paint_Image/10044.png"))); // NOI18N

        pt44.setText("Add Item");
        pt44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pt44ActionPerformed(evt);
            }
        });

        spinnerpt44.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel151Layout = new javax.swing.GroupLayout(jPanel151);
        jPanel151.setLayout(jPanel151Layout);
        jPanel151Layout.setHorizontalGroup(
            jPanel151Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel151Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel151Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel211, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel151Layout.createSequentialGroup()
                        .addComponent(spinnerpt44)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pt44, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel151Layout.setVerticalGroup(
            jPanel151Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel151Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel211, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel151Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pt44, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(spinnerpt44))
                .addContainerGap())
        );

        jPanel145.setBackground(new java.awt.Color(81, 154, 52));

        jLabel118.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Paint_Image/10038.png"))); // NOI18N

        pt38.setText("Add Item");
        pt38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pt38ActionPerformed(evt);
            }
        });

        spinnerpt38.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel145Layout = new javax.swing.GroupLayout(jPanel145);
        jPanel145.setLayout(jPanel145Layout);
        jPanel145Layout.setHorizontalGroup(
            jPanel145Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel145Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel145Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel118, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel145Layout.createSequentialGroup()
                        .addComponent(spinnerpt38)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pt38, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel145Layout.setVerticalGroup(
            jPanel145Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel145Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel118, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel145Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pt38, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(spinnerpt38))
                .addContainerGap())
        );

        jPanel137.setBackground(new java.awt.Color(81, 154, 52));

        jLabel110.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Paint_Image/10030.png"))); // NOI18N

        pt30.setText("Add Item");
        pt30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pt30ActionPerformed(evt);
            }
        });

        spinnerpt30.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel137Layout = new javax.swing.GroupLayout(jPanel137);
        jPanel137.setLayout(jPanel137Layout);
        jPanel137Layout.setHorizontalGroup(
            jPanel137Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel137Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel137Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel110, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel137Layout.createSequentialGroup()
                        .addComponent(spinnerpt30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pt30, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel137Layout.setVerticalGroup(
            jPanel137Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel137Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel110, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel137Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pt30, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(spinnerpt30))
                .addContainerGap())
        );

        jPanel152.setBackground(new java.awt.Color(81, 154, 52));

        jLabel212.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Paint_Image/10045.png"))); // NOI18N

        pt45.setText("Add Item");
        pt45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pt45ActionPerformed(evt);
            }
        });

        spinnerpt45.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel152Layout = new javax.swing.GroupLayout(jPanel152);
        jPanel152.setLayout(jPanel152Layout);
        jPanel152Layout.setHorizontalGroup(
            jPanel152Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel152Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel152Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel212, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel152Layout.createSequentialGroup()
                        .addComponent(spinnerpt45)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pt45, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel152Layout.setVerticalGroup(
            jPanel152Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel152Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel212, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel152Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pt45, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(spinnerpt45))
                .addContainerGap())
        );

        jPanel154.setBackground(new java.awt.Color(81, 154, 52));

        jLabel214.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Paint_Image/10047.png"))); // NOI18N

        pt47.setText("Add Item");
        pt47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pt47ActionPerformed(evt);
            }
        });

        spinnerpt47.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel154Layout = new javax.swing.GroupLayout(jPanel154);
        jPanel154.setLayout(jPanel154Layout);
        jPanel154Layout.setHorizontalGroup(
            jPanel154Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel154Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel154Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel214, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel154Layout.createSequentialGroup()
                        .addComponent(spinnerpt47)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pt47, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel154Layout.setVerticalGroup(
            jPanel154Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel154Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel214, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel154Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pt47, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(spinnerpt47))
                .addContainerGap())
        );

        jPanel153.setBackground(new java.awt.Color(81, 154, 52));

        jLabel213.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Paint_Image/10046.png"))); // NOI18N

        pt46.setText("Add Item");
        pt46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pt46ActionPerformed(evt);
            }
        });

        spinnerpt46.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel153Layout = new javax.swing.GroupLayout(jPanel153);
        jPanel153.setLayout(jPanel153Layout);
        jPanel153Layout.setHorizontalGroup(
            jPanel153Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel153Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel153Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel213, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel153Layout.createSequentialGroup()
                        .addComponent(spinnerpt46)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pt46, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel153Layout.setVerticalGroup(
            jPanel153Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel153Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel213, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel153Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pt46, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(spinnerpt46))
                .addContainerGap())
        );

        jPanel146.setBackground(new java.awt.Color(81, 154, 52));

        jLabel119.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Paint_Image/10039.png"))); // NOI18N

        pt39.setText("Add Item");
        pt39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pt39ActionPerformed(evt);
            }
        });

        spinnerpt39.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel146Layout = new javax.swing.GroupLayout(jPanel146);
        jPanel146.setLayout(jPanel146Layout);
        jPanel146Layout.setHorizontalGroup(
            jPanel146Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel146Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel146Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel119, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel146Layout.createSequentialGroup()
                        .addComponent(spinnerpt39)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pt39, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel146Layout.setVerticalGroup(
            jPanel146Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel146Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel119, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel146Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pt39, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(spinnerpt39))
                .addContainerGap())
        );

        jPanel143.setBackground(new java.awt.Color(81, 154, 52));

        jLabel116.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Paint_Image/10036.png"))); // NOI18N

        pt36.setText("Add Item");
        pt36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pt36ActionPerformed(evt);
            }
        });

        spinnerpt36.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel143Layout = new javax.swing.GroupLayout(jPanel143);
        jPanel143.setLayout(jPanel143Layout);
        jPanel143Layout.setHorizontalGroup(
            jPanel143Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel143Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel143Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel116, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel143Layout.createSequentialGroup()
                        .addComponent(spinnerpt36)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pt36, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel143Layout.setVerticalGroup(
            jPanel143Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel143Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel116, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel143Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pt36, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(spinnerpt36))
                .addContainerGap())
        );

        jPanel139.setBackground(new java.awt.Color(81, 154, 52));

        jLabel112.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Paint_Image/10032.png"))); // NOI18N

        pt32.setText("Add Item");
        pt32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pt32ActionPerformed(evt);
            }
        });

        spinnerpt32.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel139Layout = new javax.swing.GroupLayout(jPanel139);
        jPanel139.setLayout(jPanel139Layout);
        jPanel139Layout.setHorizontalGroup(
            jPanel139Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel139Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel139Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel112, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel139Layout.createSequentialGroup()
                        .addComponent(spinnerpt32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pt32, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel139Layout.setVerticalGroup(
            jPanel139Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel139Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel112, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel139Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pt32, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(spinnerpt32))
                .addContainerGap())
        );

        jPanel147.setBackground(new java.awt.Color(81, 154, 52));

        jLabel120.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Paint_Image/10040.png"))); // NOI18N

        pt40.setText("Add Item");
        pt40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pt40ActionPerformed(evt);
            }
        });

        spinnerpt40.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel147Layout = new javax.swing.GroupLayout(jPanel147);
        jPanel147.setLayout(jPanel147Layout);
        jPanel147Layout.setHorizontalGroup(
            jPanel147Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel147Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel147Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel120, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel147Layout.createSequentialGroup()
                        .addComponent(spinnerpt40)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pt40, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel147Layout.setVerticalGroup(
            jPanel147Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel147Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel120, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel147Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pt40, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(spinnerpt40))
                .addContainerGap())
        );

        jPanel142.setBackground(new java.awt.Color(81, 154, 52));

        jLabel115.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Paint_Image/10035.png"))); // NOI18N

        pt35.setText("Add Item");
        pt35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pt35ActionPerformed(evt);
            }
        });

        spinnerpt35.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel142Layout = new javax.swing.GroupLayout(jPanel142);
        jPanel142.setLayout(jPanel142Layout);
        jPanel142Layout.setHorizontalGroup(
            jPanel142Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel142Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel142Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel115, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel142Layout.createSequentialGroup()
                        .addComponent(spinnerpt35)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pt35, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel142Layout.setVerticalGroup(
            jPanel142Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel142Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel115, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel142Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pt35, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(spinnerpt35))
                .addContainerGap())
        );

        jPanel150.setBackground(new java.awt.Color(81, 154, 52));

        jLabel210.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Paint_Image/10043.png"))); // NOI18N

        pt43.setText("Add Item");
        pt43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pt43ActionPerformed(evt);
            }
        });

        spinnerpt43.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel150Layout = new javax.swing.GroupLayout(jPanel150);
        jPanel150.setLayout(jPanel150Layout);
        jPanel150Layout.setHorizontalGroup(
            jPanel150Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel150Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel150Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel210, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel150Layout.createSequentialGroup()
                        .addComponent(spinnerpt43)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pt43, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel150Layout.setVerticalGroup(
            jPanel150Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel150Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel210, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel150Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pt43, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(spinnerpt43))
                .addContainerGap())
        );

        jPanel138.setBackground(new java.awt.Color(81, 154, 52));

        jLabel111.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Paint_Image/10031.png"))); // NOI18N

        pt31.setText("Add Item");
        pt31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pt31ActionPerformed(evt);
            }
        });

        spinnerpt31.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel138Layout = new javax.swing.GroupLayout(jPanel138);
        jPanel138.setLayout(jPanel138Layout);
        jPanel138Layout.setHorizontalGroup(
            jPanel138Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel138Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel138Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel111, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel138Layout.createSequentialGroup()
                        .addComponent(spinnerpt31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pt31, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel138Layout.setVerticalGroup(
            jPanel138Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel138Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel111, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel138Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pt31, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(spinnerpt31))
                .addContainerGap())
        );

        jPanel144.setBackground(new java.awt.Color(81, 154, 52));

        jLabel117.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Paint_Image/10037.png"))); // NOI18N

        pt37.setText("Add Item");
        pt37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pt37ActionPerformed(evt);
            }
        });

        spinnerpt37.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel144Layout = new javax.swing.GroupLayout(jPanel144);
        jPanel144.setLayout(jPanel144Layout);
        jPanel144Layout.setHorizontalGroup(
            jPanel144Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel144Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel144Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel117, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel144Layout.createSequentialGroup()
                        .addComponent(spinnerpt37)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pt37, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel144Layout.setVerticalGroup(
            jPanel144Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel144Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel117, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel144Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pt37, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(spinnerpt37))
                .addContainerGap())
        );

        jPanel140.setBackground(new java.awt.Color(81, 154, 52));

        jLabel113.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Paint_Image/10033.png"))); // NOI18N

        pt33.setText("Add Item");
        pt33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pt33ActionPerformed(evt);
            }
        });

        spinnerpt33.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel140Layout = new javax.swing.GroupLayout(jPanel140);
        jPanel140.setLayout(jPanel140Layout);
        jPanel140Layout.setHorizontalGroup(
            jPanel140Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel140Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel140Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel113, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel140Layout.createSequentialGroup()
                        .addComponent(spinnerpt33)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pt33, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel140Layout.setVerticalGroup(
            jPanel140Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel140Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel113, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel140Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pt33, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(spinnerpt33))
                .addContainerGap())
        );

        jPanel141.setBackground(new java.awt.Color(81, 154, 52));

        jLabel114.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Paint_Image/10034.png"))); // NOI18N

        pt34.setText("Add Item");
        pt34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pt34ActionPerformed(evt);
            }
        });

        spinnerpt34.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel141Layout = new javax.swing.GroupLayout(jPanel141);
        jPanel141.setLayout(jPanel141Layout);
        jPanel141Layout.setHorizontalGroup(
            jPanel141Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel141Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel141Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel114, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel141Layout.createSequentialGroup()
                        .addComponent(spinnerpt34)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pt34, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel141Layout.setVerticalGroup(
            jPanel141Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel141Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel114, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel141Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pt34, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(spinnerpt34))
                .addContainerGap())
        );

        javax.swing.GroupLayout paintHolderLayout = new javax.swing.GroupLayout(paintHolder);
        paintHolder.setLayout(paintHolderLayout);
        paintHolderLayout.setHorizontalGroup(
            paintHolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paintHolderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paintHolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paintHolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(paintHolderLayout.createSequentialGroup()
                            .addGroup(paintHolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(paintHolderLayout.createSequentialGroup()
                                    .addComponent(jPanel111, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(12, 12, 12)
                                    .addComponent(jPanel112, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(paintHolderLayout.createSequentialGroup()
                                    .addComponent(jPanel94, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel99, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(paintHolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel113, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPanel108, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paintHolderLayout.createSequentialGroup()
                            .addGroup(paintHolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(paintHolderLayout.createSequentialGroup()
                                    .addComponent(jPanel117, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(12, 12, 12)
                                    .addComponent(jPanel118, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(paintHolderLayout.createSequentialGroup()
                                    .addComponent(jPanel114, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jPanel115, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(paintHolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel116, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPanel119, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(paintHolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(paintHolderLayout.createSequentialGroup()
                            .addGroup(paintHolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(paintHolderLayout.createSequentialGroup()
                                    .addComponent(jPanel138, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(12, 12, 12)
                                    .addComponent(jPanel139, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(paintHolderLayout.createSequentialGroup()
                                    .addComponent(jPanel135, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(12, 12, 12)
                                    .addComponent(jPanel136, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(paintHolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel140, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPanel137, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paintHolderLayout.createSequentialGroup()
                            .addGroup(paintHolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(paintHolderLayout.createSequentialGroup()
                                    .addComponent(jPanel144, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(12, 12, 12)
                                    .addComponent(jPanel145, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(paintHolderLayout.createSequentialGroup()
                                    .addComponent(jPanel141, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jPanel142, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(paintHolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel143, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPanel146, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(paintHolderLayout.createSequentialGroup()
                        .addComponent(jPanel153, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel154, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pt48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(paintHolderLayout.createSequentialGroup()
                        .addGroup(paintHolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(paintHolderLayout.createSequentialGroup()
                                .addComponent(jPanel150, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jPanel151, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(paintHolderLayout.createSequentialGroup()
                                .addComponent(jPanel147, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel148, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(paintHolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel152, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel149, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(paintHolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paintHolderLayout.createSequentialGroup()
                            .addGroup(paintHolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(paintHolderLayout.createSequentialGroup()
                                    .addComponent(jPanel129, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(12, 12, 12)
                                    .addComponent(jPanel130, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(paintHolderLayout.createSequentialGroup()
                                    .addComponent(jPanel126, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jPanel127, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(paintHolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel128, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPanel131, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paintHolderLayout.createSequentialGroup()
                            .addComponent(jPanel132, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(12, 12, 12)
                            .addComponent(jPanel133, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jPanel134, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(paintHolderLayout.createSequentialGroup()
                        .addGroup(paintHolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(paintHolderLayout.createSequentialGroup()
                                .addComponent(jPanel123, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jPanel124, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(paintHolderLayout.createSequentialGroup()
                                .addComponent(jPanel120, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel121, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(paintHolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel125, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel122, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        paintHolderLayout.setVerticalGroup(
            paintHolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paintHolderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paintHolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paintHolderLayout.createSequentialGroup()
                        .addComponent(jPanel108, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel113, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(paintHolderLayout.createSequentialGroup()
                        .addGroup(paintHolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel99, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel94, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(paintHolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel111, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel112, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(paintHolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel115, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel114, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel116, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(paintHolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel119, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel117, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel118, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(paintHolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paintHolderLayout.createSequentialGroup()
                        .addComponent(jPanel122, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel125, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(paintHolderLayout.createSequentialGroup()
                        .addGroup(paintHolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel121, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel120, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(paintHolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel123, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel124, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(paintHolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel127, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel126, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel128, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(paintHolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel131, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel129, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel130, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(paintHolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel134, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel132, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel133, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(paintHolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paintHolderLayout.createSequentialGroup()
                        .addComponent(jPanel137, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel140, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(paintHolderLayout.createSequentialGroup()
                        .addGroup(paintHolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel136, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel135, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(paintHolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel138, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel139, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(paintHolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel142, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel141, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel143, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(paintHolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel146, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel144, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel145, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(paintHolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paintHolderLayout.createSequentialGroup()
                        .addComponent(jPanel149, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel152, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(paintHolderLayout.createSequentialGroup()
                        .addGroup(paintHolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel148, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel147, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(paintHolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel150, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel151, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(paintHolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel154, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel153, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pt48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane7.setViewportView(paintHolder);

        javax.swing.GroupLayout paintTabLayout = new javax.swing.GroupLayout(paintTab);
        paintTab.setLayout(paintTabLayout);
        paintTabLayout.setHorizontalGroup(
            paintTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paintTabLayout.createSequentialGroup()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );
        paintTabLayout.setVerticalGroup(
            paintTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 647, Short.MAX_VALUE)
        );

        ItemHolder.addTab("Paints", paintTab);

        spraypaintTab.setBackground(new java.awt.Color(227, 193, 55));

        SprayPaintholder.setBackground(new java.awt.Color(227, 193, 55));

        jPanel80.setBackground(new java.awt.Color(81, 154, 52));

        jLabel83.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Spray_Image/20001.png"))); // NOI18N

        sp1.setText("Add Item");
        sp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sp1ActionPerformed(evt);
            }
        });

        spinnersp1.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel80Layout = new javax.swing.GroupLayout(jPanel80);
        jPanel80.setLayout(jPanel80Layout);
        jPanel80Layout.setHorizontalGroup(
            jPanel80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel80Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel83, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel80Layout.createSequentialGroup()
                        .addComponent(spinnersp1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sp1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel80Layout.setVerticalGroup(
            jPanel80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel80Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel83, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sp1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(spinnersp1))
                .addContainerGap())
        );

        jPanel81.setBackground(new java.awt.Color(81, 154, 52));

        jLabel84.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Spray_Image/20002.png"))); // NOI18N

        sp2.setText("Add Item");
        sp2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sp2ActionPerformed(evt);
            }
        });

        spinnersp2.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel81Layout = new javax.swing.GroupLayout(jPanel81);
        jPanel81.setLayout(jPanel81Layout);
        jPanel81Layout.setHorizontalGroup(
            jPanel81Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel81Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel81Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel84, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel81Layout.createSequentialGroup()
                        .addComponent(spinnersp2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sp2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel81Layout.setVerticalGroup(
            jPanel81Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel81Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel84, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel81Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sp2, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(spinnersp2))
                .addContainerGap())
        );

        jPanel82.setBackground(new java.awt.Color(81, 154, 52));

        jLabel85.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Spray_Image/20003.png"))); // NOI18N

        sp3.setText("Add Item");
        sp3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sp3ActionPerformed(evt);
            }
        });

        spinnersp3.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel82Layout = new javax.swing.GroupLayout(jPanel82);
        jPanel82.setLayout(jPanel82Layout);
        jPanel82Layout.setHorizontalGroup(
            jPanel82Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel82Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel82Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel85, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel82Layout.createSequentialGroup()
                        .addComponent(spinnersp3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sp3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel82Layout.setVerticalGroup(
            jPanel82Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel82Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel85, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel82Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sp3, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(spinnersp3))
                .addContainerGap())
        );

        jPanel83.setBackground(new java.awt.Color(81, 154, 52));

        jLabel86.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Spray_Image/20004.png"))); // NOI18N

        sp4.setText("Add Item");
        sp4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sp4ActionPerformed(evt);
            }
        });

        spinnersp4.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel83Layout = new javax.swing.GroupLayout(jPanel83);
        jPanel83.setLayout(jPanel83Layout);
        jPanel83Layout.setHorizontalGroup(
            jPanel83Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel83Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel83Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel86, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel83Layout.createSequentialGroup()
                        .addComponent(spinnersp4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sp4, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel83Layout.setVerticalGroup(
            jPanel83Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel83Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel86, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel83Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sp4, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(spinnersp4))
                .addContainerGap())
        );

        jPanel84.setBackground(new java.awt.Color(81, 154, 52));

        jLabel87.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Spray_Image/20005.png"))); // NOI18N

        sp5.setText("Add Item");
        sp5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sp5ActionPerformed(evt);
            }
        });

        spinnersp5.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel84Layout = new javax.swing.GroupLayout(jPanel84);
        jPanel84.setLayout(jPanel84Layout);
        jPanel84Layout.setHorizontalGroup(
            jPanel84Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel84Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel84Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel87, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel84Layout.createSequentialGroup()
                        .addComponent(spinnersp5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sp5, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel84Layout.setVerticalGroup(
            jPanel84Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel84Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel87, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel84Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sp5, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(spinnersp5))
                .addContainerGap())
        );

        jPanel85.setBackground(new java.awt.Color(81, 154, 52));

        jLabel88.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Spray_Image/20006.png"))); // NOI18N

        sp6.setText("Add Item");
        sp6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sp6ActionPerformed(evt);
            }
        });

        spinnersp6.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel85Layout = new javax.swing.GroupLayout(jPanel85);
        jPanel85.setLayout(jPanel85Layout);
        jPanel85Layout.setHorizontalGroup(
            jPanel85Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel85Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel85Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel88, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel85Layout.createSequentialGroup()
                        .addComponent(spinnersp6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sp6, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel85Layout.setVerticalGroup(
            jPanel85Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel85Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel88, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel85Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sp6, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(spinnersp6))
                .addContainerGap())
        );

        jPanel86.setBackground(new java.awt.Color(81, 154, 52));

        jLabel89.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Spray_Image/20007.png"))); // NOI18N

        sp7.setText("Add Item");
        sp7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sp7ActionPerformed(evt);
            }
        });

        spinnersp7.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel86Layout = new javax.swing.GroupLayout(jPanel86);
        jPanel86.setLayout(jPanel86Layout);
        jPanel86Layout.setHorizontalGroup(
            jPanel86Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel86Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel86Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel89, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel86Layout.createSequentialGroup()
                        .addComponent(spinnersp7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sp7, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel86Layout.setVerticalGroup(
            jPanel86Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel86Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel89, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel86Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sp7, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(spinnersp7))
                .addContainerGap())
        );

        jPanel87.setBackground(new java.awt.Color(81, 154, 52));

        jLabel90.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Spray_Image/20008.png"))); // NOI18N

        sp8.setText("Add Item");
        sp8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sp8ActionPerformed(evt);
            }
        });

        spinnersp8.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel87Layout = new javax.swing.GroupLayout(jPanel87);
        jPanel87.setLayout(jPanel87Layout);
        jPanel87Layout.setHorizontalGroup(
            jPanel87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel87Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel90, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel87Layout.createSequentialGroup()
                        .addComponent(spinnersp8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sp8, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel87Layout.setVerticalGroup(
            jPanel87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel87Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel90, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel87Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sp8, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(spinnersp8))
                .addContainerGap())
        );

        jPanel88.setBackground(new java.awt.Color(81, 154, 52));

        jLabel91.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Spray_Image/20009.png"))); // NOI18N

        sp9.setText("Add Item");
        sp9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sp9ActionPerformed(evt);
            }
        });

        spinnersp9.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel88Layout = new javax.swing.GroupLayout(jPanel88);
        jPanel88.setLayout(jPanel88Layout);
        jPanel88Layout.setHorizontalGroup(
            jPanel88Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel88Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel88Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel91, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel88Layout.createSequentialGroup()
                        .addComponent(spinnersp9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sp9, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel88Layout.setVerticalGroup(
            jPanel88Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel88Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel91, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel88Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sp9, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(spinnersp9))
                .addContainerGap())
        );

        jPanel89.setBackground(new java.awt.Color(81, 154, 52));

        jLabel92.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Spray_Image/20010.png"))); // NOI18N

        sp10.setText("Add Item");
        sp10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sp10ActionPerformed(evt);
            }
        });

        spinnersp10.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel89Layout = new javax.swing.GroupLayout(jPanel89);
        jPanel89.setLayout(jPanel89Layout);
        jPanel89Layout.setHorizontalGroup(
            jPanel89Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel89Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel89Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel92, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel89Layout.createSequentialGroup()
                        .addComponent(spinnersp10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sp10, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel89Layout.setVerticalGroup(
            jPanel89Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel89Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel92, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel89Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sp10, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(spinnersp10))
                .addContainerGap())
        );

        jPanel90.setBackground(new java.awt.Color(81, 154, 52));

        jLabel93.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Spray_Image/20011.png"))); // NOI18N

        sp11.setText("Add Item");
        sp11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sp11ActionPerformed(evt);
            }
        });

        spinnersp11.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel90Layout = new javax.swing.GroupLayout(jPanel90);
        jPanel90.setLayout(jPanel90Layout);
        jPanel90Layout.setHorizontalGroup(
            jPanel90Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel90Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel90Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel93, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel90Layout.createSequentialGroup()
                        .addComponent(spinnersp11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sp11, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel90Layout.setVerticalGroup(
            jPanel90Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel90Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel93, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel90Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sp11, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(spinnersp11))
                .addContainerGap())
        );

        jPanel91.setBackground(new java.awt.Color(81, 154, 52));

        jLabel94.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Spray_Image/20012.png"))); // NOI18N

        sp12.setText("Add Item");
        sp12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sp12ActionPerformed(evt);
            }
        });

        spinnersp12.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel91Layout = new javax.swing.GroupLayout(jPanel91);
        jPanel91.setLayout(jPanel91Layout);
        jPanel91Layout.setHorizontalGroup(
            jPanel91Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel91Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel91Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel94, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel91Layout.createSequentialGroup()
                        .addComponent(spinnersp12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sp12, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel91Layout.setVerticalGroup(
            jPanel91Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel91Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel94, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel91Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sp12, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(spinnersp12))
                .addContainerGap())
        );

        jPanel92.setBackground(new java.awt.Color(81, 154, 52));

        jLabel95.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Spray_Image/20013.png"))); // NOI18N

        sp13.setText("Add Item");
        sp13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sp13ActionPerformed(evt);
            }
        });

        spinnersp13.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel92Layout = new javax.swing.GroupLayout(jPanel92);
        jPanel92.setLayout(jPanel92Layout);
        jPanel92Layout.setHorizontalGroup(
            jPanel92Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel92Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel92Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel95, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel92Layout.createSequentialGroup()
                        .addComponent(spinnersp13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sp13, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel92Layout.setVerticalGroup(
            jPanel92Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel92Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel95, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel92Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sp13, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(spinnersp13))
                .addContainerGap())
        );

        jPanel93.setBackground(new java.awt.Color(81, 154, 52));

        jLabel143.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Spray_Image/20014.png"))); // NOI18N

        sp14.setText("Add Item");
        sp14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sp14ActionPerformed(evt);
            }
        });

        spinnersp14.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel93Layout = new javax.swing.GroupLayout(jPanel93);
        jPanel93.setLayout(jPanel93Layout);
        jPanel93Layout.setHorizontalGroup(
            jPanel93Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel93Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel93Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel143, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel93Layout.createSequentialGroup()
                        .addComponent(spinnersp14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sp14, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel93Layout.setVerticalGroup(
            jPanel93Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel93Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel143, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel93Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sp14, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(spinnersp14))
                .addContainerGap())
        );

        javax.swing.GroupLayout SprayPaintholderLayout = new javax.swing.GroupLayout(SprayPaintholder);
        SprayPaintholder.setLayout(SprayPaintholderLayout);
        SprayPaintholderLayout.setHorizontalGroup(
            SprayPaintholderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SprayPaintholderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SprayPaintholderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SprayPaintholderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(SprayPaintholderLayout.createSequentialGroup()
                            .addGroup(SprayPaintholderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(SprayPaintholderLayout.createSequentialGroup()
                                    .addComponent(jPanel83, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(12, 12, 12)
                                    .addComponent(jPanel84, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(SprayPaintholderLayout.createSequentialGroup()
                                    .addComponent(jPanel80, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel81, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(SprayPaintholderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel85, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPanel82, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SprayPaintholderLayout.createSequentialGroup()
                            .addGroup(SprayPaintholderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(SprayPaintholderLayout.createSequentialGroup()
                                    .addComponent(jPanel89, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(12, 12, 12)
                                    .addComponent(jPanel90, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(SprayPaintholderLayout.createSequentialGroup()
                                    .addComponent(jPanel86, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jPanel87, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(SprayPaintholderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel88, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPanel91, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(SprayPaintholderLayout.createSequentialGroup()
                        .addComponent(jPanel92, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel93, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(109, Short.MAX_VALUE))
        );
        SprayPaintholderLayout.setVerticalGroup(
            SprayPaintholderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SprayPaintholderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SprayPaintholderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SprayPaintholderLayout.createSequentialGroup()
                        .addComponent(jPanel82, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel85, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(SprayPaintholderLayout.createSequentialGroup()
                        .addGroup(SprayPaintholderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel81, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel80, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(SprayPaintholderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel83, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel84, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(SprayPaintholderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel87, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel86, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel88, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(SprayPaintholderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel91, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel89, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel90, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(SprayPaintholderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel93, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel92, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane5.setViewportView(SprayPaintholder);

        javax.swing.GroupLayout spraypaintTabLayout = new javax.swing.GroupLayout(spraypaintTab);
        spraypaintTab.setLayout(spraypaintTabLayout);
        spraypaintTabLayout.setHorizontalGroup(
            spraypaintTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 638, Short.MAX_VALUE)
        );
        spraypaintTabLayout.setVerticalGroup(
            spraypaintTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 647, Short.MAX_VALUE)
        );

        ItemHolder.addTab("Spray Paint", spraypaintTab);

        tinnerTab.setBackground(new java.awt.Color(227, 193, 55));

        thinnerHolder.setBackground(new java.awt.Color(227, 193, 55));

        jPanel70.setBackground(new java.awt.Color(81, 154, 52));

        jLabel73.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Thinner_Image/30001.png"))); // NOI18N

        th1.setText("Add Item");
        th1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                th1ActionPerformed(evt);
            }
        });

        spinnerth1.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel70Layout = new javax.swing.GroupLayout(jPanel70);
        jPanel70.setLayout(jPanel70Layout);
        jPanel70Layout.setHorizontalGroup(
            jPanel70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel70Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel73, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel70Layout.createSequentialGroup()
                        .addComponent(spinnerth1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(th1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel70Layout.setVerticalGroup(
            jPanel70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel70Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel70Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(th1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(spinnerth1))
                .addContainerGap())
        );

        jPanel71.setBackground(new java.awt.Color(81, 154, 52));

        jLabel74.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Thinner_Image/30001 (2).png"))); // NOI18N

        th2.setText("Add Item");
        th2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                th2ActionPerformed(evt);
            }
        });

        spinnerth2.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel71Layout = new javax.swing.GroupLayout(jPanel71);
        jPanel71.setLayout(jPanel71Layout);
        jPanel71Layout.setHorizontalGroup(
            jPanel71Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel71Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel71Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel74, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel71Layout.createSequentialGroup()
                        .addComponent(spinnerth2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(th2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel71Layout.setVerticalGroup(
            jPanel71Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel71Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel71Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(th2, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(spinnerth2))
                .addContainerGap())
        );

        jPanel72.setBackground(new java.awt.Color(81, 154, 52));

        jLabel75.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Thinner_Image/30001 (3).png"))); // NOI18N

        th3.setText("Add Item");
        th3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                th3ActionPerformed(evt);
            }
        });

        spinnerth3.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel72Layout = new javax.swing.GroupLayout(jPanel72);
        jPanel72.setLayout(jPanel72Layout);
        jPanel72Layout.setHorizontalGroup(
            jPanel72Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel72Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel72Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel75, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel72Layout.createSequentialGroup()
                        .addComponent(spinnerth3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(th3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel72Layout.setVerticalGroup(
            jPanel72Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel72Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel72Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(th3, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(spinnerth3))
                .addContainerGap())
        );

        jPanel73.setBackground(new java.awt.Color(81, 154, 52));

        jLabel76.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Thinner_Image/30001 (4).png"))); // NOI18N

        th4.setText("Add Item");
        th4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                th4ActionPerformed(evt);
            }
        });

        spinnerth4.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel73Layout = new javax.swing.GroupLayout(jPanel73);
        jPanel73.setLayout(jPanel73Layout);
        jPanel73Layout.setHorizontalGroup(
            jPanel73Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel73Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel73Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel76, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel73Layout.createSequentialGroup()
                        .addComponent(spinnerth4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(th4, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel73Layout.setVerticalGroup(
            jPanel73Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel73Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel73Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(th4, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(spinnerth4))
                .addContainerGap())
        );

        jPanel74.setBackground(new java.awt.Color(81, 154, 52));

        jLabel77.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Thinner_Image/30001 (5).png"))); // NOI18N

        thh5.setText("Add Item");
        thh5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thh5ActionPerformed(evt);
            }
        });

        spinnerth5.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel74Layout = new javax.swing.GroupLayout(jPanel74);
        jPanel74.setLayout(jPanel74Layout);
        jPanel74Layout.setHorizontalGroup(
            jPanel74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel74Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel77, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel74Layout.createSequentialGroup()
                        .addComponent(spinnerth5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(thh5, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel74Layout.setVerticalGroup(
            jPanel74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel74Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(thh5, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(spinnerth5))
                .addContainerGap())
        );

        jPanel75.setBackground(new java.awt.Color(81, 154, 52));

        jLabel78.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Thinner_Image/30001 (6).png"))); // NOI18N

        th6.setText("Add Item");
        th6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                th6ActionPerformed(evt);
            }
        });

        spinnerth6.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel75Layout = new javax.swing.GroupLayout(jPanel75);
        jPanel75.setLayout(jPanel75Layout);
        jPanel75Layout.setHorizontalGroup(
            jPanel75Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel75Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel75Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel78, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel75Layout.createSequentialGroup()
                        .addComponent(spinnerth6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(th6, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel75Layout.setVerticalGroup(
            jPanel75Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel75Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel75Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(th6, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(spinnerth6))
                .addContainerGap())
        );

        jPanel76.setBackground(new java.awt.Color(81, 154, 52));

        jLabel79.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Thinner_Image/30001 (7).png"))); // NOI18N

        th7.setText("Add Item");
        th7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                th7ActionPerformed(evt);
            }
        });

        spinnerth7.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel76Layout = new javax.swing.GroupLayout(jPanel76);
        jPanel76.setLayout(jPanel76Layout);
        jPanel76Layout.setHorizontalGroup(
            jPanel76Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel76Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel76Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel79, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel76Layout.createSequentialGroup()
                        .addComponent(spinnerth7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(th7, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel76Layout.setVerticalGroup(
            jPanel76Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel76Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel76Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(th7, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(spinnerth7))
                .addContainerGap())
        );

        jPanel77.setBackground(new java.awt.Color(81, 154, 52));

        jLabel80.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Thinner_Image/30001 (8).png"))); // NOI18N

        th8.setText("Add Item");
        th8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                th8ActionPerformed(evt);
            }
        });

        spinnerth8.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel77Layout = new javax.swing.GroupLayout(jPanel77);
        jPanel77.setLayout(jPanel77Layout);
        jPanel77Layout.setHorizontalGroup(
            jPanel77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel77Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel80, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel77Layout.createSequentialGroup()
                        .addComponent(spinnerth8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(th8, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel77Layout.setVerticalGroup(
            jPanel77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel77Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(th8, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(spinnerth8))
                .addContainerGap())
        );

        jPanel78.setBackground(new java.awt.Color(81, 154, 52));

        jLabel81.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Thinner_Image/30001 (9).png"))); // NOI18N

        th9.setText("Add Item");
        th9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                th9ActionPerformed(evt);
            }
        });

        spinnerth9.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel78Layout = new javax.swing.GroupLayout(jPanel78);
        jPanel78.setLayout(jPanel78Layout);
        jPanel78Layout.setHorizontalGroup(
            jPanel78Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel78Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel78Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel81, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel78Layout.createSequentialGroup()
                        .addComponent(spinnerth9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(th9, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel78Layout.setVerticalGroup(
            jPanel78Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel78Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel78Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(th9, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(spinnerth9))
                .addContainerGap())
        );

        jPanel79.setBackground(new java.awt.Color(81, 154, 52));

        jLabel82.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Thinner_Image/30001 (10).png"))); // NOI18N

        th10.setText("Add Item");
        th10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                th10ActionPerformed(evt);
            }
        });

        spinnerth10.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel79Layout = new javax.swing.GroupLayout(jPanel79);
        jPanel79.setLayout(jPanel79Layout);
        jPanel79Layout.setHorizontalGroup(
            jPanel79Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel79Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel79Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel82, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel79Layout.createSequentialGroup()
                        .addComponent(spinnerth10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(th10, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel79Layout.setVerticalGroup(
            jPanel79Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel79Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel82, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel79Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(th10, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(spinnerth10))
                .addContainerGap())
        );

        javax.swing.GroupLayout thinnerHolderLayout = new javax.swing.GroupLayout(thinnerHolder);
        thinnerHolder.setLayout(thinnerHolderLayout);
        thinnerHolderLayout.setHorizontalGroup(
            thinnerHolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(thinnerHolderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(thinnerHolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(thinnerHolderLayout.createSequentialGroup()
                        .addGroup(thinnerHolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(thinnerHolderLayout.createSequentialGroup()
                                .addComponent(jPanel73, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jPanel74, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(thinnerHolderLayout.createSequentialGroup()
                                .addComponent(jPanel70, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel71, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(thinnerHolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel75, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel72, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, thinnerHolderLayout.createSequentialGroup()
                        .addGroup(thinnerHolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel79, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(thinnerHolderLayout.createSequentialGroup()
                                .addComponent(jPanel76, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel77, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel78, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        thinnerHolderLayout.setVerticalGroup(
            thinnerHolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(thinnerHolderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(thinnerHolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(thinnerHolderLayout.createSequentialGroup()
                        .addComponent(jPanel72, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel75, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(thinnerHolderLayout.createSequentialGroup()
                        .addGroup(thinnerHolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel71, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel70, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(thinnerHolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel73, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel74, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(thinnerHolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel77, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel76, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel78, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel79, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane4.setViewportView(thinnerHolder);

        javax.swing.GroupLayout tinnerTabLayout = new javax.swing.GroupLayout(tinnerTab);
        tinnerTab.setLayout(tinnerTabLayout);
        tinnerTabLayout.setHorizontalGroup(
            tinnerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tinnerTabLayout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 632, Short.MAX_VALUE)
                .addContainerGap())
        );
        tinnerTabLayout.setVerticalGroup(
            tinnerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 647, Short.MAX_VALUE)
        );

        ItemHolder.addTab("Thinner", tinnerTab);

        bodyfillerTab.setBackground(new java.awt.Color(227, 193, 55));

        paintTab2.setBackground(new java.awt.Color(227, 193, 55));

        bodyFiller.setBackground(new java.awt.Color(227, 193, 55));

        jPanel30.setBackground(new java.awt.Color(81, 154, 52));

        jLabel49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Filler_Image/10001_1.png"))); // NOI18N

        bf1.setText("Add Item");
        bf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bf1ActionPerformed(evt);
            }
        });

        spinnerbf1.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel49, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addComponent(spinnerbf1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bf1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bf1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(spinnerbf1))
                .addContainerGap())
        );

        jPanel31.setBackground(new java.awt.Color(81, 154, 52));

        jLabel50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Filler_Image/10001 (2)_1.png"))); // NOI18N

        bf2.setText("Add Item");
        bf2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bf2ActionPerformed(evt);
            }
        });

        spinnerbf2.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel50, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel31Layout.createSequentialGroup()
                        .addComponent(spinnerbf2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bf2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bf2, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(spinnerbf2))
                .addContainerGap())
        );

        jPanel44.setBackground(new java.awt.Color(81, 154, 52));

        jLabel63.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Filler_Image/10001 (3)_1.png"))); // NOI18N

        bf3.setText("Add Item");
        bf3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bf3ActionPerformed(evt);
            }
        });

        spinnerbf3.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel44Layout = new javax.swing.GroupLayout(jPanel44);
        jPanel44.setLayout(jPanel44Layout);
        jPanel44Layout.setHorizontalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel44Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel63, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel44Layout.createSequentialGroup()
                        .addComponent(spinnerbf3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bf3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel44Layout.setVerticalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel44Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bf3, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(spinnerbf3))
                .addContainerGap())
        );

        javax.swing.GroupLayout bodyFillerLayout = new javax.swing.GroupLayout(bodyFiller);
        bodyFiller.setLayout(bodyFillerLayout);
        bodyFillerLayout.setHorizontalGroup(
            bodyFillerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyFillerLayout.createSequentialGroup()
                .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jPanel44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );
        bodyFillerLayout.setVerticalGroup(
            bodyFillerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyFillerLayout.createSequentialGroup()
                .addGroup(bodyFillerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout paintTab2Layout = new javax.swing.GroupLayout(paintTab2);
        paintTab2.setLayout(paintTab2Layout);
        paintTab2Layout.setHorizontalGroup(
            paintTab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paintTab2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bodyFiller, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(109, Short.MAX_VALUE))
        );
        paintTab2Layout.setVerticalGroup(
            paintTab2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paintTab2Layout.createSequentialGroup()
                .addComponent(bodyFiller, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 258, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout bodyfillerTabLayout = new javax.swing.GroupLayout(bodyfillerTab);
        bodyfillerTab.setLayout(bodyfillerTabLayout);
        bodyfillerTabLayout.setHorizontalGroup(
            bodyfillerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyfillerTabLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(paintTab2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        bodyfillerTabLayout.setVerticalGroup(
            bodyfillerTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bodyfillerTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(paintTab2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 137, Short.MAX_VALUE))
        );

        ItemHolder.addTab("Body Filler", bodyfillerTab);

        undercoatTab.setBackground(new java.awt.Color(227, 193, 55));

        paintTab3.setBackground(new java.awt.Color(227, 193, 55));

        javax.swing.GroupLayout paintTab3Layout = new javax.swing.GroupLayout(paintTab3);
        paintTab3.setLayout(paintTab3Layout);
        paintTab3Layout.setHorizontalGroup(
            paintTab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 193, Short.MAX_VALUE)
        );
        paintTab3Layout.setVerticalGroup(
            paintTab3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );

        undercoatHolder.setBackground(new java.awt.Color(227, 193, 55));

        javax.swing.GroupLayout undercoatHolderLayout = new javax.swing.GroupLayout(undercoatHolder);
        undercoatHolder.setLayout(undercoatHolderLayout);
        undercoatHolderLayout.setHorizontalGroup(
            undercoatHolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 205, Short.MAX_VALUE)
        );
        undercoatHolderLayout.setVerticalGroup(
            undercoatHolderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 246, Short.MAX_VALUE)
        );

        jPanel33.setBackground(new java.awt.Color(81, 154, 52));

        jLabel52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/undercoat_Image/10001 (2).png"))); // NOI18N

        uc1.setText("Add Item");
        uc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uc1ActionPerformed(evt);
            }
        });

        spinneruc1.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel52, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel33Layout.createSequentialGroup()
                        .addComponent(spinneruc1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(uc1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(uc1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(spinneruc1))
                .addContainerGap())
        );

        javax.swing.GroupLayout undercoatTabLayout = new javax.swing.GroupLayout(undercoatTab);
        undercoatTab.setLayout(undercoatTabLayout);
        undercoatTabLayout.setHorizontalGroup(
            undercoatTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, undercoatTabLayout.createSequentialGroup()
                .addGap(0, 445, Short.MAX_VALUE)
                .addComponent(paintTab3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(undercoatTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(undercoatHolder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        undercoatTabLayout.setVerticalGroup(
            undercoatTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, undercoatTabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(undercoatTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(undercoatHolder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 149, Short.MAX_VALUE)
                .addComponent(paintTab3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        ItemHolder.addTab("Under Coat", undercoatTab);

        hardwareTab.setBackground(new java.awt.Color(227, 193, 55));

        hardwareMaterial.setBackground(new java.awt.Color(227, 193, 55));

        jPanel28.setBackground(new java.awt.Color(81, 154, 52));

        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Material_Image/1.jpg"))); // NOI18N

        hm1.setText("Add Item");
        hm1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hm1ActionPerformed(evt);
            }
        });

        spinnerhm1.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addComponent(spinnerhm1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hm1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(hm1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(spinnerhm1))
                .addContainerGap())
        );

        jPanel29.setBackground(new java.awt.Color(81, 154, 52));

        jLabel48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Material_Image/2.jpg"))); // NOI18N

        hm2.setText("Add Item");
        hm2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hm2ActionPerformed(evt);
            }
        });

        spinnerhm2.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addComponent(spinnerhm2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hm2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(hm2, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(spinnerhm2))
                .addContainerGap())
        );

        jPanel35.setBackground(new java.awt.Color(81, 154, 52));

        jLabel54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Material_Image/3.jpg"))); // NOI18N

        hm3.setText("Add Item");
        hm3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hm3ActionPerformed(evt);
            }
        });

        spinnerhm3.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel54, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel35Layout.createSequentialGroup()
                        .addComponent(spinnerhm3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hm3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(hm3, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(spinnerhm3))
                .addContainerGap())
        );

        jPanel34.setBackground(new java.awt.Color(81, 154, 52));

        jLabel53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Material_Image/4.jpg"))); // NOI18N

        hm4.setText("Add Item");
        hm4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hm4ActionPerformed(evt);
            }
        });

        spinnerhm4.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel53, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel34Layout.createSequentialGroup()
                        .addComponent(spinnerhm4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hm4, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(hm4, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(spinnerhm4))
                .addContainerGap())
        );

        jPanel37.setBackground(new java.awt.Color(81, 154, 52));

        jLabel56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Material_Image/5.jpg"))); // NOI18N

        hm5.setText("Add Item");
        hm5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hm5ActionPerformed(evt);
            }
        });

        spinnerhm5.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel56, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel37Layout.createSequentialGroup()
                        .addComponent(spinnerhm5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hm5, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(hm5, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(spinnerhm5))
                .addContainerGap())
        );

        jPanel36.setBackground(new java.awt.Color(81, 154, 52));

        jLabel55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Material_Image/6.jpg"))); // NOI18N

        hm6.setText("Add Item");
        hm6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hm6ActionPerformed(evt);
            }
        });

        spinnerhm6.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel55, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel36Layout.createSequentialGroup()
                        .addComponent(spinnerhm6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hm6, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(hm6, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(spinnerhm6))
                .addContainerGap())
        );

        jPanel38.setBackground(new java.awt.Color(81, 154, 52));

        jLabel57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Material_Image/7.jpg"))); // NOI18N

        hm7.setText("Add Item");
        hm7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hm7ActionPerformed(evt);
            }
        });

        spinnerhm7.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel57, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel38Layout.createSequentialGroup()
                        .addComponent(spinnerhm7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hm7, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(hm7, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(spinnerhm7))
                .addContainerGap())
        );

        jPanel39.setBackground(new java.awt.Color(81, 154, 52));

        jLabel58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Material_Image/8.jpg"))); // NOI18N

        hm8.setText("Add Item");
        hm8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hm8ActionPerformed(evt);
            }
        });

        spinnerhm8.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
        jPanel39.setLayout(jPanel39Layout);
        jPanel39Layout.setHorizontalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel58, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel39Layout.createSequentialGroup()
                        .addComponent(spinnerhm8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hm8, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel39Layout.setVerticalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel39Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(hm8, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(spinnerhm8))
                .addContainerGap())
        );

        jPanel40.setBackground(new java.awt.Color(81, 154, 52));

        jLabel59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Material_Image/9.jpg"))); // NOI18N

        hm9.setText("Add Item");
        hm9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hm9ActionPerformed(evt);
            }
        });

        spinnerhm9.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel40Layout = new javax.swing.GroupLayout(jPanel40);
        jPanel40.setLayout(jPanel40Layout);
        jPanel40Layout.setHorizontalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel40Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel59, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel40Layout.createSequentialGroup()
                        .addComponent(spinnerhm9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hm9, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel40Layout.setVerticalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel40Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel59, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(hm9, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(spinnerhm9))
                .addContainerGap())
        );

        jPanel41.setBackground(new java.awt.Color(81, 154, 52));

        jLabel60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Material_Image/10.jpg"))); // NOI18N

        hm10.setText("Add Item");
        hm10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hm10ActionPerformed(evt);
            }
        });

        spinnerhm10.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel41Layout = new javax.swing.GroupLayout(jPanel41);
        jPanel41.setLayout(jPanel41Layout);
        jPanel41Layout.setHorizontalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel60, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel41Layout.createSequentialGroup()
                        .addComponent(spinnerhm10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hm10, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel41Layout.setVerticalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(hm10, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(spinnerhm10))
                .addContainerGap())
        );

        jPanel42.setBackground(new java.awt.Color(81, 154, 52));

        jLabel61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Material_Image/11.jpg"))); // NOI18N

        hm11.setText("Add Item");
        hm11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hm11ActionPerformed(evt);
            }
        });

        spinnerhm11.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel42Layout = new javax.swing.GroupLayout(jPanel42);
        jPanel42.setLayout(jPanel42Layout);
        jPanel42Layout.setHorizontalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel61, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel42Layout.createSequentialGroup()
                        .addComponent(spinnerhm11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hm11, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel42Layout.setVerticalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(hm11, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(spinnerhm11))
                .addContainerGap())
        );

        jPanel43.setBackground(new java.awt.Color(81, 154, 52));

        jLabel62.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Material_Image/12.jpg"))); // NOI18N

        hm12.setText("Add Item");
        hm12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hm12ActionPerformed(evt);
            }
        });

        spinnerhm12.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel43Layout = new javax.swing.GroupLayout(jPanel43);
        jPanel43.setLayout(jPanel43Layout);
        jPanel43Layout.setHorizontalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel43Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel62, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel43Layout.createSequentialGroup()
                        .addComponent(spinnerhm12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hm12, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel43Layout.setVerticalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel43Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel62, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(hm12, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(spinnerhm12))
                .addContainerGap())
        );

        jPanel32.setBackground(new java.awt.Color(81, 154, 52));

        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Material_Image/13.jpg"))); // NOI18N

        hm13.setText("Add Item");
        hm13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hm13ActionPerformed(evt);
            }
        });

        spinnerhm13.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel51, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel32Layout.createSequentialGroup()
                        .addComponent(spinnerhm13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hm13, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(hm13, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(spinnerhm13))
                .addContainerGap())
        );

        jPanel54.setBackground(new java.awt.Color(81, 154, 52));

        jLabel141.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Material_Image/14.jpg"))); // NOI18N

        hm14.setText("Add Item");
        hm14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hm14ActionPerformed(evt);
            }
        });

        spinnerhm14.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel54Layout = new javax.swing.GroupLayout(jPanel54);
        jPanel54.setLayout(jPanel54Layout);
        jPanel54Layout.setHorizontalGroup(
            jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel54Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel141, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel54Layout.createSequentialGroup()
                        .addComponent(spinnerhm14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hm14, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel54Layout.setVerticalGroup(
            jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel54Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel141, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel54Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(hm14, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(spinnerhm14))
                .addContainerGap())
        );

        jPanel55.setBackground(new java.awt.Color(81, 154, 52));

        jLabel167.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Material_Image/15.jpg"))); // NOI18N

        hm15.setText("Add Item");
        hm15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hm15ActionPerformed(evt);
            }
        });

        spinnerhm15.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel55Layout = new javax.swing.GroupLayout(jPanel55);
        jPanel55.setLayout(jPanel55Layout);
        jPanel55Layout.setHorizontalGroup(
            jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel55Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel167, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel55Layout.createSequentialGroup()
                        .addComponent(spinnerhm15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hm15, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel55Layout.setVerticalGroup(
            jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel55Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel167, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel55Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(hm15, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(spinnerhm15))
                .addContainerGap())
        );

        jPanel56.setBackground(new java.awt.Color(81, 154, 52));

        jLabel168.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Material_Image/16.jpg"))); // NOI18N

        hm16.setText("Add Item");
        hm16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hm16ActionPerformed(evt);
            }
        });

        spinnerhm16.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel56Layout = new javax.swing.GroupLayout(jPanel56);
        jPanel56.setLayout(jPanel56Layout);
        jPanel56Layout.setHorizontalGroup(
            jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel56Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel168, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel56Layout.createSequentialGroup()
                        .addComponent(spinnerhm16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hm16, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel56Layout.setVerticalGroup(
            jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel56Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel168, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel56Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(hm16, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(spinnerhm16))
                .addContainerGap())
        );

        jPanel57.setBackground(new java.awt.Color(81, 154, 52));

        jLabel169.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Material_Image/17.jpg"))); // NOI18N

        hm17.setText("Add Item");
        hm17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hm17ActionPerformed(evt);
            }
        });

        spinnerhm17.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel57Layout = new javax.swing.GroupLayout(jPanel57);
        jPanel57.setLayout(jPanel57Layout);
        jPanel57Layout.setHorizontalGroup(
            jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel57Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel169, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel57Layout.createSequentialGroup()
                        .addComponent(spinnerhm17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hm17, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel57Layout.setVerticalGroup(
            jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel57Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel169, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel57Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(hm17, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(spinnerhm17))
                .addContainerGap())
        );

        jPanel58.setBackground(new java.awt.Color(81, 154, 52));

        jLabel170.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Material_Image/18.jpg"))); // NOI18N

        hm18.setText("Add Item");
        hm18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hm18ActionPerformed(evt);
            }
        });

        spinnerhm18.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel58Layout = new javax.swing.GroupLayout(jPanel58);
        jPanel58.setLayout(jPanel58Layout);
        jPanel58Layout.setHorizontalGroup(
            jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel58Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel170, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel58Layout.createSequentialGroup()
                        .addComponent(spinnerhm18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hm18, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel58Layout.setVerticalGroup(
            jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel58Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel170, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel58Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(hm18, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(spinnerhm18))
                .addContainerGap())
        );

        jPanel59.setBackground(new java.awt.Color(81, 154, 52));

        jLabel171.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Material_Image/19.jpg"))); // NOI18N

        hm19.setText("Add Item");
        hm19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hm19ActionPerformed(evt);
            }
        });

        spinnerhm19.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel59Layout = new javax.swing.GroupLayout(jPanel59);
        jPanel59.setLayout(jPanel59Layout);
        jPanel59Layout.setHorizontalGroup(
            jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel59Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel171, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel59Layout.createSequentialGroup()
                        .addComponent(spinnerhm19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hm19, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel59Layout.setVerticalGroup(
            jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel59Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel171, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel59Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(hm19, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(spinnerhm19))
                .addContainerGap())
        );

        jPanel60.setBackground(new java.awt.Color(81, 154, 52));

        jLabel172.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Material_Image/20.jpg"))); // NOI18N

        hm20.setText("Add Item");
        hm20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hm20ActionPerformed(evt);
            }
        });

        spinnerhm20.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel60Layout = new javax.swing.GroupLayout(jPanel60);
        jPanel60.setLayout(jPanel60Layout);
        jPanel60Layout.setHorizontalGroup(
            jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel60Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel172, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel60Layout.createSequentialGroup()
                        .addComponent(spinnerhm20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hm20, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel60Layout.setVerticalGroup(
            jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel60Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel172, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel60Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(hm20, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(spinnerhm20))
                .addContainerGap())
        );

        jPanel61.setBackground(new java.awt.Color(81, 154, 52));

        jLabel173.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Material_Image/21.jpg"))); // NOI18N

        hm21.setText("Add Item");
        hm21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hm21ActionPerformed(evt);
            }
        });

        spinnerhm21.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel61Layout = new javax.swing.GroupLayout(jPanel61);
        jPanel61.setLayout(jPanel61Layout);
        jPanel61Layout.setHorizontalGroup(
            jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel61Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel173, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel61Layout.createSequentialGroup()
                        .addComponent(spinnerhm21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hm21, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel61Layout.setVerticalGroup(
            jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel61Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel173, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel61Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(hm21, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(spinnerhm21))
                .addContainerGap())
        );

        jPanel95.setBackground(new java.awt.Color(81, 154, 52));

        jLabel174.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Material_Image/22.jpg"))); // NOI18N

        hm22.setText("Add Item");
        hm22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hm22ActionPerformed(evt);
            }
        });

        spinnerhm22.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel95Layout = new javax.swing.GroupLayout(jPanel95);
        jPanel95.setLayout(jPanel95Layout);
        jPanel95Layout.setHorizontalGroup(
            jPanel95Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel95Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel95Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel174, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel95Layout.createSequentialGroup()
                        .addComponent(spinnerhm22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hm22, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel95Layout.setVerticalGroup(
            jPanel95Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel95Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel174, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel95Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(hm22, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(spinnerhm22))
                .addContainerGap())
        );

        jPanel96.setBackground(new java.awt.Color(81, 154, 52));

        jLabel175.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Material_Image/23.jpg"))); // NOI18N

        hm23.setText("Add Item");
        hm23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hm23ActionPerformed(evt);
            }
        });

        spinnerhm23.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel96Layout = new javax.swing.GroupLayout(jPanel96);
        jPanel96.setLayout(jPanel96Layout);
        jPanel96Layout.setHorizontalGroup(
            jPanel96Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel96Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel96Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel175, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel96Layout.createSequentialGroup()
                        .addComponent(spinnerhm23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hm23, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel96Layout.setVerticalGroup(
            jPanel96Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel96Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel175, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel96Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(hm23, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(spinnerhm23))
                .addContainerGap())
        );

        jPanel100.setBackground(new java.awt.Color(81, 154, 52));

        jLabel176.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Material_Image/24.jpg"))); // NOI18N

        hm24.setText("Add Item");
        hm24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hm24ActionPerformed(evt);
            }
        });

        spinnerhm24.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel100Layout = new javax.swing.GroupLayout(jPanel100);
        jPanel100.setLayout(jPanel100Layout);
        jPanel100Layout.setHorizontalGroup(
            jPanel100Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel100Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel100Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel176, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel100Layout.createSequentialGroup()
                        .addComponent(spinnerhm24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hm24, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel100Layout.setVerticalGroup(
            jPanel100Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel100Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel176, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel100Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(hm24, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(spinnerhm24))
                .addContainerGap())
        );

        jPanel101.setBackground(new java.awt.Color(81, 154, 52));

        jLabel177.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Material_Image/25.jpg"))); // NOI18N

        hm25.setText("Add Item");
        hm25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hm25ActionPerformed(evt);
            }
        });

        spinnerhm25.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel101Layout = new javax.swing.GroupLayout(jPanel101);
        jPanel101.setLayout(jPanel101Layout);
        jPanel101Layout.setHorizontalGroup(
            jPanel101Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel101Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel101Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel177, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel101Layout.createSequentialGroup()
                        .addComponent(spinnerhm25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hm25, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel101Layout.setVerticalGroup(
            jPanel101Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel101Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel177, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel101Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(hm25, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(spinnerhm25))
                .addContainerGap())
        );

        jPanel103.setBackground(new java.awt.Color(81, 154, 52));

        jLabel178.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Material_Image/26.jpg"))); // NOI18N

        hm26.setText("Add Item");
        hm26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hm26ActionPerformed(evt);
            }
        });

        spinnerhm26.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel103Layout = new javax.swing.GroupLayout(jPanel103);
        jPanel103.setLayout(jPanel103Layout);
        jPanel103Layout.setHorizontalGroup(
            jPanel103Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel103Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel103Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel178, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel103Layout.createSequentialGroup()
                        .addComponent(spinnerhm26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hm26, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel103Layout.setVerticalGroup(
            jPanel103Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel103Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel178, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel103Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(hm26, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(spinnerhm26))
                .addContainerGap())
        );

        jPanel106.setBackground(new java.awt.Color(81, 154, 52));

        jLabel179.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Material_Image/27.jpg"))); // NOI18N

        hm27.setText("Add Item");
        hm27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hm27ActionPerformed(evt);
            }
        });

        spinnerhm27.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel106Layout = new javax.swing.GroupLayout(jPanel106);
        jPanel106.setLayout(jPanel106Layout);
        jPanel106Layout.setHorizontalGroup(
            jPanel106Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel106Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel106Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel179, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel106Layout.createSequentialGroup()
                        .addComponent(spinnerhm27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hm27, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel106Layout.setVerticalGroup(
            jPanel106Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel106Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel179, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel106Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(hm27, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(spinnerhm27))
                .addContainerGap())
        );

        jPanel109.setBackground(new java.awt.Color(81, 154, 52));

        jLabel180.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Material_Image/28.jpg"))); // NOI18N

        hm28.setText("Add Item");
        hm28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hm28ActionPerformed(evt);
            }
        });

        spinnerhm28.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        javax.swing.GroupLayout jPanel109Layout = new javax.swing.GroupLayout(jPanel109);
        jPanel109.setLayout(jPanel109Layout);
        jPanel109Layout.setHorizontalGroup(
            jPanel109Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel109Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel109Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel180, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel109Layout.createSequentialGroup()
                        .addComponent(spinnerhm28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hm28, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel109Layout.setVerticalGroup(
            jPanel109Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel109Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel180, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel109Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(hm28, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(spinnerhm28))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout hardwareMaterialLayout = new javax.swing.GroupLayout(hardwareMaterial);
        hardwareMaterial.setLayout(hardwareMaterialLayout);
        hardwareMaterialLayout.setHorizontalGroup(
            hardwareMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hardwareMaterialLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(hardwareMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(hardwareMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(hardwareMaterialLayout.createSequentialGroup()
                            .addGroup(hardwareMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(hardwareMaterialLayout.createSequentialGroup()
                                    .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(12, 12, 12)
                                    .addComponent(jPanel37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(hardwareMaterialLayout.createSequentialGroup()
                                    .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(hardwareMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPanel35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, hardwareMaterialLayout.createSequentialGroup()
                            .addGroup(hardwareMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(hardwareMaterialLayout.createSequentialGroup()
                                    .addComponent(jPanel41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(12, 12, 12)
                                    .addComponent(jPanel42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(hardwareMaterialLayout.createSequentialGroup()
                                    .addComponent(jPanel38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jPanel39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(hardwareMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPanel43, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jPanel109, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(hardwareMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, hardwareMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(hardwareMaterialLayout.createSequentialGroup()
                                .addGroup(hardwareMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(hardwareMaterialLayout.createSequentialGroup()
                                        .addComponent(jPanel56, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(jPanel57, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(hardwareMaterialLayout.createSequentialGroup()
                                        .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jPanel54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(hardwareMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel58, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, hardwareMaterialLayout.createSequentialGroup()
                                .addGroup(hardwareMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(hardwareMaterialLayout.createSequentialGroup()
                                        .addComponent(jPanel95, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(jPanel96, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(hardwareMaterialLayout.createSequentialGroup()
                                        .addComponent(jPanel59, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jPanel60, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(hardwareMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel61, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanel100, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, hardwareMaterialLayout.createSequentialGroup()
                            .addComponent(jPanel101, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(12, 12, 12)
                            .addComponent(jPanel103, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jPanel106, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(109, Short.MAX_VALUE))
        );
        hardwareMaterialLayout.setVerticalGroup(
            hardwareMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hardwareMaterialLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(hardwareMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(hardwareMaterialLayout.createSequentialGroup()
                        .addComponent(jPanel35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(hardwareMaterialLayout.createSequentialGroup()
                        .addGroup(hardwareMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(hardwareMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(hardwareMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(hardwareMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(hardwareMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(hardwareMaterialLayout.createSequentialGroup()
                        .addComponent(jPanel55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel58, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(hardwareMaterialLayout.createSequentialGroup()
                        .addGroup(hardwareMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(hardwareMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel56, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel57, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(hardwareMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel60, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel59, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel61, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(hardwareMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel100, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel95, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel96, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(hardwareMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel106, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel101, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel103, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel109, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(hardwareMaterial);

        javax.swing.GroupLayout hardwareTabLayout = new javax.swing.GroupLayout(hardwareTab);
        hardwareTab.setLayout(hardwareTabLayout);
        hardwareTabLayout.setHorizontalGroup(
            hardwareTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 638, Short.MAX_VALUE)
        );
        hardwareTabLayout.setVerticalGroup(
            hardwareTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 647, Short.MAX_VALUE)
        );

        ItemHolder.addTab("Hardware Materials", hardwareTab);

        jPanel2.setBackground(new java.awt.Color(227, 193, 55));

        overallTable.setBackground(new java.awt.Color(255, 255, 255));
        overallTable.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        overallTable.setForeground(new java.awt.Color(0, 0, 0));
        overallTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "                                      Product", "                                         Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        overallTable.setShowGrid(true);
        overallTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(overallTable);
        if (overallTable.getColumnModel().getColumnCount() > 0) {
            overallTable.getColumnModel().getColumn(1).setResizable(false);
        }

        overallSpinner.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        overallSpinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        addItem.setBackground(new java.awt.Color(0, 204, 0));
        addItem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addItem.setForeground(new java.awt.Color(255, 255, 255));
        addItem.setText("Add Item");
        addItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addItemActionPerformed(evt);
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

        jPanel3.setBackground(new java.awt.Color(66, 139, 37));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Search");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 638, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(overallSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addItem, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)))
                .addContainerGap(144, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(overallSpinner, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                    .addComponent(addItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        ItemHolder.addTab("All ", jPanel2);

        jPanel1.setBackground(new java.awt.Color(227, 193, 55));

        jLabel1.setBackground(new java.awt.Color(227, 193, 55));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 41)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText(" P A I N T  C E N T E R");

        jLabel7.setBackground(new java.awt.Color(227, 193, 55));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 41)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("M I C M I C   C O L O R S ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ButtonHolder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ItemHolder, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(ReceiptHolder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addComponent(ButtonHolder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(ReceiptHolder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ItemHolder))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tinnerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tinnerButtonActionPerformed
        ItemHolder.setSelectedIndex(2);
    }//GEN-LAST:event_tinnerButtonActionPerformed

    private void bodyfillerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bodyfillerButtonActionPerformed
        ItemHolder.setSelectedIndex(3);        
    }//GEN-LAST:event_bodyfillerButtonActionPerformed

    private void hardwareButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hardwareButtonActionPerformed
        ItemHolder.setSelectedIndex(5);        
    }//GEN-LAST:event_hardwareButtonActionPerformed

    private void spraypaintButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spraypaintButtonActionPerformed
        ItemHolder.setSelectedIndex(1);        
    }//GEN-LAST:event_spraypaintButtonActionPerformed

    private void undercoatButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_undercoatButtonActionPerformed
        ItemHolder.setSelectedIndex(4);        
    }//GEN-LAST:event_undercoatButtonActionPerformed

    private void paintButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paintButtonActionPerformed
        ItemHolder.setSelectedIndex(0);
    }//GEN-LAST:event_paintButtonActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        int result = JOptionPane.showConfirmDialog(null, "Are you sure do want to clear all the items?", "Confirmation Message", JOptionPane.YES_NO_OPTION);
        if ( result == JOptionPane.YES_OPTION) {
        DefaultTableModel clear = (DefaultTableModel) Cart.getModel();
        clear.setRowCount(0);
        labelTotalPrice.setText("0.00");
        }

    }//GEN-LAST:event_ClearActionPerformed

        private int count = 1;
        
    private void CheckoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckoutActionPerformed
        
        double total = 0;
        for (int i = 0; i < Cart.getRowCount(); i++) {
            double value = (double) Cart.getValueAt(i, 3);
            total = total + value;
        }
         String pay = inputPayment.getText();
 
         
        if(Cart.getRowCount() >  0){
                    
            try{
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/micmiccolors", "root", "password");
            PreparedStatement selectItem = conn.prepareStatement("SELECT * FROM products WHERE product_name = ?");
            
            
            DefaultTableModel cart = (DefaultTableModel) Cart.getModel();
                for (int row = 0; row < cart.getRowCount(); row++) {
                    String pname = (String) cart.getValueAt(row, 1);
                    
                    selectItem.setString(1, pname);
                    
                    ResultSet rs = selectItem.executeQuery();
                    
                    while (rs.next()) {
                        int stocks = rs.getInt("stocks");
                        
                        if (stocks <= 0 ) {
                            JOptionPane.showMessageDialog(null, pname + " is not enough stock", "Warning", JOptionPane.ERROR_MESSAGE);
                        }   
                    }   
                }
            }
            catch(Exception sqle){
                System.out.println(sqle.getMessage());
            }
            if (!pay.isBlank()){
             
            int payment = Integer.parseInt(inputPayment.getText());
            if (payment >= total) {
                        int result = JOptionPane.showConfirmDialog(null, "Are you sure do you want to proceed to Checkout?", "Confirmation Message", JOptionPane.YES_NO_OPTION);
            if (result == JOptionPane.YES_OPTION) {
        try{
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/micmiccolors", "root", "password");
        PreparedStatement selectProduct = conn.prepareStatement("SELECT * FROM products WHERE product_name = ? ");
        PreparedStatement updateQuantityStocks = conn.prepareStatement("UPDATE products SET quantity = ?, stocks = ? WHERE product_name = ?");
        PreparedStatement updateTotal = conn.prepareStatement("UPDATE products SET quantity = ?, selling_price = ?, total_price = ? WHERE product_name = ?");
        PreparedStatement updateProfit = conn.prepareStatement("UPDATE products SET quantity = ?, selling_price = ?, cost_price = ?, profit = ? WHERE product_name = ?");
        
        DefaultTableModel cartDb = (DefaultTableModel) Cart.getModel(); 
        
        
            for (int row = 0; row < cartDb.getRowCount(); row++) {
            String productName = (String) cartDb.getValueAt(row, 1);
            int quantityTb = (int) cartDb.getValueAt(row, 0);
            
            selectProduct.setString(1, productName);
            
            ResultSet select = selectProduct.executeQuery();
            
                if (select.next()) {
                    int quantityDb = select.getInt("quantity");
                    int stocksDb = select.getInt("stocks");
                    
                    int quantity = quantityTb + quantityDb;
                    int stocks =  stocksDb - quantityTb;
                    
                    updateQuantityStocks.setInt(1, quantity);
                    updateQuantityStocks.setInt(2, stocks);
                    updateQuantityStocks.setString(3, productName);
                    updateQuantityStocks.executeUpdate();
                    
                }
            }
            
            
            for (int row = 0; row < cartDb.getRowCount(); row++) {
            String productName = cartDb.getValueAt(row, 1).toString();
            int quantityTb = (int) cartDb.getValueAt(row, 0);
            
            selectProduct.setString(1, productName);
            
            ResultSet select = selectProduct.executeQuery();
            
                    if (select.next()) {
                        int quantityDb = select.getInt("quantity");
                    int sellingDb = select.getInt("selling_price");
                    
                    
                    int total_price = quantityDb * sellingDb;   
                    
                    updateTotal.setInt(1, quantityDb);
                    updateTotal.setInt(2, sellingDb);
                    updateTotal.setInt(3, total_price);
                    updateTotal.setString(4, productName);
                    updateTotal.executeUpdate();
                    }
            
            }
            
            for (int row = 0; row < cartDb.getRowCount(); row++) {
            String productName = cartDb.getValueAt(row, 1).toString();
            int quantityTb = (int) cartDb.getValueAt(row, 0);
            
            selectProduct.setString(1, productName);
            
            ResultSet select = selectProduct.executeQuery();
            
                    if (select.next()) {
                    int quantityDb = select.getInt("quantity");
                    int sellingDb = select.getInt("selling_price");  
                    int costDb = select.getInt("cost_price"); 
                    
                    int profit = (sellingDb - costDb) * quantityDb;
                    
                    updateProfit.setInt(1, quantityDb);
                    updateProfit.setInt(2, sellingDb);
                    updateProfit.setInt(3, costDb);
                    updateProfit.setInt(4, profit);
                    updateProfit.setString(5, productName);
                    updateProfit.executeUpdate();
                    
                    }
            }
        }
        catch(SQLException sqle){
            System.out.println(sqle.getMessage());
        }
                
        Date d = new Date();
        SimpleDateFormat dt = new SimpleDateFormat("MMMM d, yyyy");
        String date = dt.format(d);
        
        StringBuilder receiptHeader = new StringBuilder();
        
        receiptHeader.append("                  Micmic Colors Paint Center    " + "\n" +"\n")
                     .append("                 Brgy. Apolonia, Naic, Cavite   " + "\n")
                     .append("                      Monday to Saturday        " + "\n")
                     .append("                     7:00 AM  to  4:00 PM        " + "\n")
                     .append("                       Sunday -- Closed          " + "\n"+"\n")
                     .append("                            Receipt ")
                     .append("\n  "+"---------------------------------------------------------"+"\n")
                     .append("    Transaction No. " +  count++ + "                         " +  date )
                     .append("\n  " + "---------------------------------------------------------");
        
        StringBuilder receiptData = new StringBuilder();
        DefaultTableModel cart = (DefaultTableModel) Cart.getModel();
        
        for (int row = 0; row < Cart.getRowCount(); row++) {
                String qty = cart.getValueAt(row, 0).toString();
                String itm = cart.getValueAt(row, 1).toString();
                String prc = cart.getValueAt(row, 2).toString();
                String ttl = cart.getValueAt(row, 3).toString();
        double Total = 0;
        for (int i = 0; i < Cart.getRowCount(); i++) {
            double value = (double) Cart.getValueAt(i, 3);
            Total = Total + value;
        }
        
         receiptData  
                    .append("  " + String.format("%-50s", itm)).append("₱"+ ttl + "  ")
                    .append("\n").append("  " + qty).append(" x ").append("₱" + prc)
                    .append("\n"+"  ---------------------------------------------------------"+"\n");   
        }
        
        StringBuilder receiptFooter = new StringBuilder();
        double Total = 0;
        for (int row = 0; row < Cart.getRowCount(); row++) {
            double value = (double) Cart.getValueAt(row, 3);
            Total = Total + value;
        }
        
        labelTotalPrice.setText(String.valueOf(Total));
        double change = payment - total;
       
        
        receiptFooter.append("    Amount Due:                                  " + " ₱ " + Total +"\n")
                     .append("    Payment:                                     " + " ₱ " + payment+"\n")
                     .append("    Change:                                      " + " ₱ " + change+"\n  ")
                     .append("--------------------------------------------------------" + "\n")
                     .append("            Thank you for your order! God Bless! ")
                     .append( "\n  " +"--------------------------------------------------------" );
                
        
        
        new Receipt(receiptHeader.toString(),receiptData.toString(), receiptFooter.toString()).setVisible(true);
        
        cart.setRowCount(0);    
        labelTotalPrice.setText("0.00");
        inputPayment.setText("");
        
        
        
            }
            }
            
            else{
                JOptionPane.showMessageDialog(null, "Insufficient payment!", "Message", JOptionPane.ERROR_MESSAGE);
                inputPayment.setText("");
            } 
            }
            
            else{
            JOptionPane.showMessageDialog(null, "Pls Input Payment!", "Message", JOptionPane.ERROR_MESSAGE);
            }

}      
        
        else{
        JOptionPane.showMessageDialog(null, "Please choose any item before proceeding to checkout!", "Message", JOptionPane.ERROR_MESSAGE);
        }
        
        
        
    }//GEN-LAST:event_CheckoutActionPerformed

    private void removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeActionPerformed

        if (Cart.getSelectedRow() >= 0) {
             int result = JOptionPane.showConfirmDialog(null, "Are you sure you want to remove this item?", "Confirm Delete", JOptionPane.YES_NO_OPTION);    
            if (result == JOptionPane.YES_OPTION) {
                DefaultTableModel cart = (DefaultTableModel) Cart.getModel();
                 cart.removeRow(Cart.getSelectedRow());
            }
        }
        
                double Total = 0.00;
        for (int i = 0; i < Cart.getRowCount(); i++) {
            double value = (double) Cart.getValueAt(i, 3);
            Total = Total + value;
        }
        labelTotalPrice.setText(String.valueOf(Total));
        
        
        
    }//GEN-LAST:event_removeActionPerformed
    
    private void CartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CartMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_CartMouseClicked

    private void inputPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputPaymentActionPerformed
    
    }//GEN-LAST:event_inputPaymentActionPerformed

    private void inputPaymentKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputPaymentKeyTyped
        char pay = evt.getKeyChar();
        
        if (!Character.isDigit(pay)) {
            evt.consume();
        }
    }//GEN-LAST:event_inputPaymentKeyTyped

    private void LogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutButtonActionPerformed
        int result = JOptionPane.showConfirmDialog(null, "Are you sure do you want to log out?","Message", JOptionPane.YES_NO_OPTION);
        if (result == JOptionPane.YES_OPTION) {
        this.dispose();
        Login login = new Login();
        login.setVisible(true);
        }
     
    }//GEN-LAST:event_LogoutButtonActionPerformed

    private void CartKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CartKeyPressed

    }//GEN-LAST:event_CartKeyPressed

    private void overallButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_overallButtonActionPerformed
        ItemHolder.setSelectedIndex(6);
        
        try{
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/micmiccolors", "root", "password");
        PreparedStatement allProduct = conn.prepareStatement("SELECT * FROM products WHERE stocks >= 0");
        
        ResultSet rs = allProduct.executeQuery();
        
        while(rs.next()){
        
        String name = rs.getString("product_name");
        int price = rs.getInt("selling_price");
        
        DefaultTableModel overall = (DefaultTableModel) overallTable.getModel();
        overall.addRow(new Object[] {name, price});
            
        }
            
            
        }
        catch(SQLException sqle){
            System.out.println(sqle.getMessage());
        }
        
    }//GEN-LAST:event_overallButtonActionPerformed

    private void addItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addItemActionPerformed
        DefaultTableModel overall = (DefaultTableModel) overallTable.getModel();
        
        int selected = overallTable.getSelectedRow();
        
        if (overallTable.getSelectedRow() >= 0) {
            String name = overall.getValueAt(selected, 0).toString();
            int price = (int) overall.getValueAt(selected, 1);
            
            int quantity = (int) overallSpinner.getValue();
            
            double totalPrice = price * quantity;
            
        DefaultTableModel cart = (DefaultTableModel) Cart.getModel();
        
        cart.addRow(new Object[]{quantity, name, price, totalPrice});
        
        overallSpinner.setValue(1);
        
        double Total = 0;
        for (int row = 0; row < Cart.getRowCount(); row++) {
            double value = (double) Cart.getValueAt(row, 3);
            Total = Total + value;
        }
        
        labelTotalPrice.setText(String.valueOf(Total));   
        }
    }//GEN-LAST:event_addItemActionPerformed

    private void searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyReleased
        
  String searchText = search.getText().trim().toLowerCase(); // assuming 'search' is a text field or similar component
    
    // Using try-with-resources to ensure all resources are closed
    try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/micmiccolors", "root", "password");
         PreparedStatement stmt = conn.prepareStatement("SELECT * FROM products WHERE LOWER(product_name) LIKE ?")) {
        
        // Set the parameter using a wildcard for LIKE
        stmt.setString(1, "%" + searchText + "%");
        
        try (ResultSet rs = stmt.executeQuery()) {
            DefaultTableModel overallModel = (DefaultTableModel) overallTable.getModel(); // assuming overallTable is your JTable
            overallModel.setRowCount(0); // Clear the existing rows
            
            while (rs.next()) {
                String name = rs.getString("product_name");
                int price = rs.getInt("selling_price");
                
                overallModel.addRow(new Object[] {name, price}); // Object array for proper data type handling
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

    private void bf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bf1ActionPerformed
        GuiFunctions.onButtonClick("Body Filler Time Out 1 gallon", 580, spinnerbf1, Cart, labelTotalPrice);
    }//GEN-LAST:event_bf1ActionPerformed

    private void bf2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bf2ActionPerformed
        GuiFunctions.onButtonClick("Body Filler Polituff 1 gallon", 680, spinnerbf2, Cart, labelTotalPrice);
    }//GEN-LAST:event_bf2ActionPerformed

    private void bf3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bf3ActionPerformed
         GuiFunctions.onButtonClick("Body Filler Polituff 1 gallon", 700, spinnerbf3, Cart, labelTotalPrice);
    }//GEN-LAST:event_bf3ActionPerformed

    private void uc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uc1ActionPerformed
        GuiFunctions.onButtonClick("3M Undercoat 1 gallon", 1800, spinneruc1, Cart, labelTotalPrice);
    }//GEN-LAST:event_uc1ActionPerformed

    private void th1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_th1ActionPerformed
        GuiFunctions.onButtonClick("Puree Paint Thinner  1 Bottle", 60, spinnerth1, Cart, labelTotalPrice);
    }//GEN-LAST:event_th1ActionPerformed

    private void th2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_th2ActionPerformed
        GuiFunctions.onButtonClick("Puree Paint Thinner 1 gallon", 400, spinnerth2, Cart, labelTotalPrice);
    }//GEN-LAST:event_th2ActionPerformed

    private void th3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_th3ActionPerformed
        GuiFunctions.onButtonClick("Puree Lacquer Thinner 1 Bottle", 50, spinnerth3, Cart, labelTotalPrice);
    }//GEN-LAST:event_th3ActionPerformed

    private void th4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_th4ActionPerformed
        GuiFunctions.onButtonClick("Puree Lacquer Thinner 1 gallon", 320, spinnerth4, Cart, labelTotalPrice);
    }//GEN-LAST:event_th4ActionPerformed

    private void thh5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thh5ActionPerformed
        GuiFunctions.onButtonClick("Puree Neutralizer 1 liter", 70, spinnerth5, Cart, labelTotalPrice);
    }//GEN-LAST:event_thh5ActionPerformed

    private void th6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_th6ActionPerformed
        GuiFunctions.onButtonClick("Anzahl Urethane Thinner 1 gallon", 650, spinnerth6, Cart, labelTotalPrice);
    }//GEN-LAST:event_th6ActionPerformed

    private void th7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_th7ActionPerformed
        GuiFunctions.onButtonClick("Anzahl Urethane Thinner 1 liter", 200, spinnerth7, Cart, labelTotalPrice);
    }//GEN-LAST:event_th7ActionPerformed

    private void th8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_th8ActionPerformed
        GuiFunctions.onButtonClick("Time Out Urethane Thinner 1 gallon", 500, spinnerth8, Cart, labelTotalPrice);
    }//GEN-LAST:event_th8ActionPerformed

    private void th9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_th9ActionPerformed
        GuiFunctions.onButtonClick("Gold Urethane Thinner 1 gallon", 580, spinnerth9, Cart, labelTotalPrice);
    }//GEN-LAST:event_th9ActionPerformed

    private void th10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_th10ActionPerformed
        GuiFunctions.onButtonClick("Weber Urethane Thinner 1 gallon", 630, spinnerth10, Cart, labelTotalPrice);
    }//GEN-LAST:event_th10ActionPerformed

    private void sp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sp1ActionPerformed
        GuiFunctions.onButtonClick("Nikko Spray Paint Black", 120, spinnersp1, Cart, labelTotalPrice);
    }//GEN-LAST:event_sp1ActionPerformed

    private void sp2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sp2ActionPerformed
        GuiFunctions.onButtonClick("Nikko Spray Paint High-Temp Black", 200, spinnersp2, Cart, labelTotalPrice);
    }//GEN-LAST:event_sp2ActionPerformed

    private void sp3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sp3ActionPerformed
        GuiFunctions.onButtonClick("Nikko Spray Paint Plat Black", 120, spinnersp3, Cart, labelTotalPrice);
    }//GEN-LAST:event_sp3ActionPerformed

    private void sp4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sp4ActionPerformed
        GuiFunctions.onButtonClick("Nikko Spray Paint White", 120, spinnersp4, Cart, labelTotalPrice);
    }//GEN-LAST:event_sp4ActionPerformed

    private void sp5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sp5ActionPerformed
        GuiFunctions.onButtonClick("Nikko Spray Paint Blue", 120, spinnersp5, Cart, labelTotalPrice);
    }//GEN-LAST:event_sp5ActionPerformed

    private void sp6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sp6ActionPerformed
        GuiFunctions.onButtonClick("Nikko Spray Paint Red", 120, spinnersp6, Cart, labelTotalPrice);
    }//GEN-LAST:event_sp6ActionPerformed

    private void sp7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sp7ActionPerformed
        GuiFunctions.onButtonClick("Nikko Spray Paint Primer", 120, spinnersp7, Cart, labelTotalPrice);
    }//GEN-LAST:event_sp7ActionPerformed

    private void sp8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sp8ActionPerformed
        GuiFunctions.onButtonClick("Nikko Spray Paint Clear", 120, spinnersp8, Cart, labelTotalPrice);
    }//GEN-LAST:event_sp8ActionPerformed

    private void sp9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sp9ActionPerformed
        GuiFunctions.onButtonClick("Nikko Spray Paint Silver", 120, spinnersp9, Cart, labelTotalPrice);
    }//GEN-LAST:event_sp9ActionPerformed

    private void sp10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sp10ActionPerformed
        GuiFunctions.onButtonClick("Nikko Spray Paint Bright Silver", 120, spinnersp10, Cart, labelTotalPrice);
    }//GEN-LAST:event_sp10ActionPerformed

    private void sp11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sp11ActionPerformed
        GuiFunctions.onButtonClick("Nikko Spray Paint Gray", 120, spinnersp11, Cart, labelTotalPrice);
    }//GEN-LAST:event_sp11ActionPerformed

    private void sp12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sp12ActionPerformed
        GuiFunctions.onButtonClick("Nikko Spray Paint Green", 120, spinnersp12, Cart, labelTotalPrice);     
    }//GEN-LAST:event_sp12ActionPerformed

    private void sp13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sp13ActionPerformed
        GuiFunctions.onButtonClick("Nikko Spray Paint Fluorescent Green", 160, spinnersp13, Cart, labelTotalPrice);
    }//GEN-LAST:event_sp13ActionPerformed

    private void sp14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sp14ActionPerformed
        GuiFunctions.onButtonClick("Nikko Spray Paint Fluorescent Pink", 160, spinnersp14, Cart, labelTotalPrice);
    }//GEN-LAST:event_sp14ActionPerformed

    private void pt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pt1ActionPerformed
        GuiFunctions.onButtonClick("Boysen Flat White 1 gallon", 600, spinnerpt1, Cart, labelTotalPrice);
    }//GEN-LAST:event_pt1ActionPerformed

    private void pt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pt2ActionPerformed
        GuiFunctions.onButtonClick("Boysen Gloss White 1 gallon", 680, spinnerpt2, Cart, labelTotalPrice);
    }//GEN-LAST:event_pt2ActionPerformed

    private void pt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pt3ActionPerformed
        GuiFunctions.onButtonClick("Boysen Semi-gloss White 1 gallon", 680, spinnerpt3, Cart, labelTotalPrice);
    }//GEN-LAST:event_pt3ActionPerformed

    private void pt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pt4ActionPerformed
        GuiFunctions.onButtonClick("Boysen Flatwall White1 gallon", 720, spinnerpt4, Cart, labelTotalPrice);
    }//GEN-LAST:event_pt4ActionPerformed

    private void pt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pt5ActionPerformed
        GuiFunctions.onButtonClick("Boysen White QDE 1 gallon", 780, spinnerpt5, Cart, labelTotalPrice);
    }//GEN-LAST:event_pt5ActionPerformed

    private void pt6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pt6ActionPerformed
        GuiFunctions.onButtonClick("Meyer Hansa Yellow 1 gallon", 600, spinnerpt6, Cart, labelTotalPrice);
    }//GEN-LAST:event_pt6ActionPerformed

    private void pt7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pt7ActionPerformed
        GuiFunctions.onButtonClick("Meyer Thalo Blue 1 gallon", 600, spinnerpt7, Cart, labelTotalPrice);
    }//GEN-LAST:event_pt7ActionPerformed

    private void pt8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pt8ActionPerformed
        GuiFunctions.onButtonClick("Meyer Thalo Green 1 gallon", 600, spinnerpt8, Cart, labelTotalPrice);
    }//GEN-LAST:event_pt8ActionPerformed

    private void pt9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pt9ActionPerformed
       GuiFunctions.onButtonClick("Meyer Bulletin Red 1 gallon", 600, spinnerpt9, Cart, labelTotalPrice);
    }//GEN-LAST:event_pt9ActionPerformed

    private void pt10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pt10ActionPerformed
        GuiFunctions.onButtonClick("Meyer Raw Sienna 1 gallon", 600, spinnerpt10, Cart, labelTotalPrice);
    }//GEN-LAST:event_pt10ActionPerformed

    private void pt11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pt11ActionPerformed
        GuiFunctions.onButtonClick("Domino Quick Dry White 1 gallon", 600, spinnerpt11, Cart, labelTotalPrice);
    }//GEN-LAST:event_pt11ActionPerformed

    private void pt12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pt12ActionPerformed
        GuiFunctions.onButtonClick("Domino Quick Dry Lemon Yellow 1 gallon", 600, spinnerpt12, Cart, labelTotalPrice);
    }//GEN-LAST:event_pt12ActionPerformed

    private void pt13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pt13ActionPerformed
        GuiFunctions.onButtonClick("Domino Quick Dry Thalo Blue 1 gallon", 600, spinnerpt13, Cart, labelTotalPrice);
    }//GEN-LAST:event_pt13ActionPerformed

    private void pt14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pt14ActionPerformed
        GuiFunctions.onButtonClick("Domino Quick Dry Thalo Green 1 gallon", 600, spinnerpt14, Cart, labelTotalPrice);
    }//GEN-LAST:event_pt14ActionPerformed

    private void pt15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pt15ActionPerformed
        GuiFunctions.onButtonClick("Domino Quick Dry Choco Brown 1 gallon", 600, spinnerpt15, Cart, labelTotalPrice);
    }//GEN-LAST:event_pt15ActionPerformed

    private void pt16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pt16ActionPerformed
        GuiFunctions.onButtonClick("Minnesota QDE White 1 gallon", 600, spinnerpt16, Cart, labelTotalPrice);
    }//GEN-LAST:event_pt16ActionPerformed

    private void pt17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pt17ActionPerformed
        GuiFunctions.onButtonClick("Minnesota QDE Crystal Green 1 gallon", 600, spinnerpt17, Cart, labelTotalPrice);
    }//GEN-LAST:event_pt17ActionPerformed

    private void pt18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pt18ActionPerformed
        GuiFunctions.onButtonClick("Minnesota QDE Crystal Blue 1 gallon", 600, spinnerpt18, Cart, labelTotalPrice);
    }//GEN-LAST:event_pt18ActionPerformed

    private void pt19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pt19ActionPerformed
        GuiFunctions.onButtonClick("Minnesota QDE Bright Red 1 gallon", 600, spinnerpt19, Cart, labelTotalPrice);
    }//GEN-LAST:event_pt19ActionPerformed

    private void pt20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pt20ActionPerformed
        GuiFunctions.onButtonClick("Minnesota QDE Orange 1 gallon", 600, spinnerpt20, Cart, labelTotalPrice);
    }//GEN-LAST:event_pt20ActionPerformed

    private void pt21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pt21ActionPerformed
        GuiFunctions.onButtonClick("Guilder Epoxy Primer  Gray 1 gallon", 850, spinnerpt21, Cart, labelTotalPrice);
    }//GEN-LAST:event_pt21ActionPerformed

    private void pt22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pt22ActionPerformed
        GuiFunctions.onButtonClick("Guilder Epoxy Primer Black 1 gallon", 850, spinnerpt22, Cart, labelTotalPrice);
    }//GEN-LAST:event_pt22ActionPerformed

    private void pt23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pt23ActionPerformed
        GuiFunctions.onButtonClick("Guilder Epoxy Primer Red Oxide 1 gallon", 850, spinnerpt23, Cart, labelTotalPrice);
    }//GEN-LAST:event_pt23ActionPerformed

    private void pt24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pt24ActionPerformed
        GuiFunctions.onButtonClick("Guilder Epoxy Primer White  1 gallon", 900, spinnerpt24, Cart, labelTotalPrice);
    }//GEN-LAST:event_pt24ActionPerformed

    private void pt25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pt25ActionPerformed
        GuiFunctions.onButtonClick("Guilder Epoxy Enamel  Gray 1 gallon", 1200, spinnerpt25, Cart, labelTotalPrice);
    }//GEN-LAST:event_pt25ActionPerformed

    private void pt26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pt26ActionPerformed
        GuiFunctions.onButtonClick("Guilder Epoxy Enamel  Black 1 gallon", 1200, spinnerpt26, Cart, labelTotalPrice);
    }//GEN-LAST:event_pt26ActionPerformed

    private void pt27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pt27ActionPerformed
        GuiFunctions.onButtonClick("Guilder Epoxy Enamel  White 1 gallon", 1200, spinnerpt27, Cart, labelTotalPrice);
    }//GEN-LAST:event_pt27ActionPerformed

    private void pt28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pt28ActionPerformed
        GuiFunctions.onButtonClick("Guilder Epoxy Enamel  Yellow 1 gallon", 1200, spinnerpt28, Cart, labelTotalPrice);
    }//GEN-LAST:event_pt28ActionPerformed

    private void pt29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pt29ActionPerformed
        GuiFunctions.onButtonClick("Guilder Epoxy Enamel  Orange 1 gallon", 1300, spinnerpt29, Cart, labelTotalPrice);
    }//GEN-LAST:event_pt29ActionPerformed

    private void pt41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pt41ActionPerformed
        GuiFunctions.onButtonClick("Delaware Lacquer Thalo Green 1 gallon", 850, spinnerpt41, Cart, labelTotalPrice);
    }//GEN-LAST:event_pt41ActionPerformed

    private void pt42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pt42ActionPerformed
        GuiFunctions.onButtonClick("Davies Sun and Rain Tulle White 1 gallon", 650, spinnerpt42, Cart, labelTotalPrice);
    }//GEN-LAST:event_pt42ActionPerformed

    private void ppt48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ppt48ActionPerformed
        GuiFunctions.onButtonClick("Davies Sun and Rain Seal Gray 1 gallon", 650, spinnerpt48, Cart, labelTotalPrice);
    }//GEN-LAST:event_ppt48ActionPerformed

    private void pt44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pt44ActionPerformed
        GuiFunctions.onButtonClick("Davies Sun and Rain Cream Surprise 1 gallon", 650, spinnerpt44, Cart, labelTotalPrice);
    }//GEN-LAST:event_pt44ActionPerformed

    private void pt38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pt38ActionPerformed
        GuiFunctions.onButtonClick("Delaware Lacquer Lemon Yellow 1 gallon", 850, spinnerpt38, Cart, labelTotalPrice);
    }//GEN-LAST:event_pt38ActionPerformed

    private void pt30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pt30ActionPerformed
        GuiFunctions.onButtonClick("Guilder Epoxy Enamel  Thalo Blue 1 gallon", 1200, spinnerpt30, Cart, labelTotalPrice);
    }//GEN-LAST:event_pt30ActionPerformed

    private void pt45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pt45ActionPerformed
        GuiFunctions.onButtonClick("Davies Sun and Rain Choco Brown 1 gallon", 650, spinnerpt45, Cart, labelTotalPrice);
    }//GEN-LAST:event_pt45ActionPerformed

    private void pt47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pt47ActionPerformed
        GuiFunctions.onButtonClick("Davies Sun and Rain Smoke Gray 1 gallon", 650, spinnerpt47, Cart, labelTotalPrice);
    }//GEN-LAST:event_pt47ActionPerformed

    private void pt46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pt46ActionPerformed
        GuiFunctions.onButtonClick("Davies Sun and Rain Black 1 gallon", 650, spinnerpt46, Cart, labelTotalPrice);
    }//GEN-LAST:event_pt46ActionPerformed

    private void pt39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pt39ActionPerformed
        GuiFunctions.onButtonClick("Delaware Lacquer Yellow Oxide 1 gallon", 850, spinnerpt39, Cart, labelTotalPrice);
    }//GEN-LAST:event_pt39ActionPerformed

    private void pt36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pt36ActionPerformed
        GuiFunctions.onButtonClick("Delaware Lacquer Black 1 gallon", 850, spinnerpt36, Cart, labelTotalPrice);
    }//GEN-LAST:event_pt36ActionPerformed

    private void pt32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pt32ActionPerformed
        GuiFunctions.onButtonClick("Guilder Epoxy Enamel  Red 1 gallon", 1200, spinnerpt32, Cart, labelTotalPrice);
    }//GEN-LAST:event_pt32ActionPerformed

    private void pt40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pt40ActionPerformed
        GuiFunctions.onButtonClick("Delaware Lacquer Thalo Blue 1 gallon", 850, spinnerpt40, Cart, labelTotalPrice);
    }//GEN-LAST:event_pt40ActionPerformed

    private void pt35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pt35ActionPerformed
        GuiFunctions.onButtonClick("Delaware Lacquer White 1 gallon", 850, spinnerpt35, Cart, labelTotalPrice);
    }//GEN-LAST:event_pt35ActionPerformed

    private void pt43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pt43ActionPerformed
        GuiFunctions.onButtonClick("Davies Sun and Rain Burger Brown 1 gallon", 650, spinnerpt43, Cart, labelTotalPrice);
    }//GEN-LAST:event_pt43ActionPerformed

    private void pt31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pt31ActionPerformed
        GuiFunctions.onButtonClick("Guilder Epoxy Enamel  Thalo Green 1 gallon", 1200, spinnerpt31, Cart, labelTotalPrice);
    }//GEN-LAST:event_pt31ActionPerformed

    private void pt37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pt37ActionPerformed
        GuiFunctions.onButtonClick("Delaware Lacquer International Red 1 gallon", 850, spinnerpt37, Cart, labelTotalPrice);
    }//GEN-LAST:event_pt37ActionPerformed

    private void pt33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pt33ActionPerformed
        GuiFunctions.onButtonClick("Delaware Lacquer Putty White 1 gallon", 750, spinnerpt33, Cart, labelTotalPrice);
    }//GEN-LAST:event_pt33ActionPerformed

    private void pt34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pt34ActionPerformed
        GuiFunctions.onButtonClick("Delaware Lacquer Primer White 1 gallon", 750, spinnerpt34, Cart, labelTotalPrice);
    }//GEN-LAST:event_pt34ActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchActionPerformed

    private void hm28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hm28ActionPerformed
        GuiFunctions.onButtonClick("Putty Knife w/o Handle 2pcs.", 70, spinnerhm28, Cart, labelTotalPrice);
    }//GEN-LAST:event_hm28ActionPerformed

    private void hm27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hm27ActionPerformed
        GuiFunctions.onButtonClick("Hippo Paint Roller #7", 70, spinnerhm27, Cart, labelTotalPrice);
    }//GEN-LAST:event_hm27ActionPerformed

    private void hm26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hm26ActionPerformed
        GuiFunctions.onButtonClick("Hippo  Paint Roller Baby", 65, spinnerhm26, Cart, labelTotalPrice);
    }//GEN-LAST:event_hm26ActionPerformed

    private void hm25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hm25ActionPerformed
        GuiFunctions.onButtonClick("Hippo Paint Brush 4\"\"", 120, spinnerhm25, Cart, labelTotalPrice);
    }//GEN-LAST:event_hm25ActionPerformed

    private void hm24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hm24ActionPerformed
        GuiFunctions.onButtonClick("Hippo Paint Brush 3\"\"", 100, spinnerhm24, Cart, labelTotalPrice);
    }//GEN-LAST:event_hm24ActionPerformed

    private void hm23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hm23ActionPerformed
        GuiFunctions.onButtonClick("Hippo Paint Brush 2 1/2\"\"", 50, spinnerhm23, Cart, labelTotalPrice);
    }//GEN-LAST:event_hm23ActionPerformed

    private void hm22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hm22ActionPerformed
        GuiFunctions.onButtonClick("Hippo Paint Brush 2\"\"", 50, spinnerhm22, Cart, labelTotalPrice);
    }//GEN-LAST:event_hm22ActionPerformed

    private void hm21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hm21ActionPerformed
        GuiFunctions.onButtonClick("Hippo Paint Brush 1 1/2\"\"", 40, spinnerhm21, Cart, labelTotalPrice);
    }//GEN-LAST:event_hm21ActionPerformed

    private void hm20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hm20ActionPerformed
        GuiFunctions.onButtonClick("Hippo Paint Brush 1\"\"", 30, spinnerhm20, Cart, labelTotalPrice);
    }//GEN-LAST:event_hm20ActionPerformed

    private void hm19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hm19ActionPerformed
        GuiFunctions.onButtonClick("Hippo Paint Brush 3/4\"\"", 20, spinnerhm19, Cart, labelTotalPrice);
    }//GEN-LAST:event_hm19ActionPerformed

    private void hm18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hm18ActionPerformed
        GuiFunctions.onButtonClick("Hippo Paint Brush 1/2\"\"", 10, spinnerhm18, Cart, labelTotalPrice);
    }//GEN-LAST:event_hm18ActionPerformed

    private void hm17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hm17ActionPerformed
        GuiFunctions.onButtonClick("Masking Tape 2\"\"", 60, spinnerhm17, Cart, labelTotalPrice);
    }//GEN-LAST:event_hm17ActionPerformed

    private void hm16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hm16ActionPerformed
        GuiFunctions.onButtonClick("Masking Tape 1\"\"", 40, spinnerhm16, Cart, labelTotalPrice);
    }//GEN-LAST:event_hm16ActionPerformed

    private void hm15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hm15ActionPerformed
        GuiFunctions.onButtonClick("Masking Tape 3/4\"\"", 35, spinnerhm15, Cart, labelTotalPrice);
    }//GEN-LAST:event_hm15ActionPerformed

    private void hm14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hm14ActionPerformed
        GuiFunctions.onButtonClick("Masking Tape 1/2\"\"", 25, spinnerhm14, Cart, labelTotalPrice);
    }//GEN-LAST:event_hm14ActionPerformed

    private void hm13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hm13ActionPerformed
        GuiFunctions.onButtonClick("Hippo Sand paper 4x4\" 2000 Grit\"", 25, spinnerhm13, Cart, labelTotalPrice);
    }//GEN-LAST:event_hm13ActionPerformed

    private void hm12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hm12ActionPerformed
        GuiFunctions.onButtonClick("Hippo Sand paper 4x4\" 1500 Grit\"", 10, spinnerhm12, Cart, labelTotalPrice);
    }//GEN-LAST:event_hm12ActionPerformed

    private void hm11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hm11ActionPerformed
        GuiFunctions.onButtonClick("Hippo Sand paper 4x4\" 1200 Grit\"", 10, spinnerhm11, Cart, labelTotalPrice);
    }//GEN-LAST:event_hm11ActionPerformed

    private void hm10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hm10ActionPerformed
        GuiFunctions.onButtonClick("Hippo Sand paper 4x4\" 1000 Grit\"", 10, spinnerhm10, Cart, labelTotalPrice);
    }//GEN-LAST:event_hm10ActionPerformed

    private void hm9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hm9ActionPerformed
        GuiFunctions.onButtonClick("Hippo Sand paper 4x4\" 800 Grit\"", 10, spinnerhm9, Cart, labelTotalPrice);
    }//GEN-LAST:event_hm9ActionPerformed

    private void hm8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hm8ActionPerformed
        GuiFunctions.onButtonClick("Hippo Sand paper 4x4\" 600 Grit\"", 10, spinnerhm8, Cart, labelTotalPrice);
    }//GEN-LAST:event_hm8ActionPerformed

    private void hm7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hm7ActionPerformed
        GuiFunctions.onButtonClick("Hippo Sand paper 4x4\" 400 Grit\"", 10, spinnerhm7, Cart, labelTotalPrice);
    }//GEN-LAST:event_hm7ActionPerformed

    private void hm6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hm6ActionPerformed
        GuiFunctions.onButtonClick("Hippo Sand paper 4x4\" 360 Grit\"", 10, spinnerhm6, Cart, labelTotalPrice);
    }//GEN-LAST:event_hm6ActionPerformed

    private void hm5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hm5ActionPerformed
        GuiFunctions.onButtonClick("Hippo Sand paper 4x4\" 320 Grit\"", 10, spinnerhm5, Cart, labelTotalPrice);
    }//GEN-LAST:event_hm5ActionPerformed

    private void hm4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hm4ActionPerformed
        GuiFunctions.onButtonClick("Hippo Sand paper 4x4\" 240 Grit\"", 10, spinnerhm4, Cart, labelTotalPrice);
    }//GEN-LAST:event_hm4ActionPerformed

    private void hm3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hm3ActionPerformed
        GuiFunctions.onButtonClick("Hippo Sand paper 4x4\" 220 Grit\"", 10, spinnerhm3, Cart, labelTotalPrice);
    }//GEN-LAST:event_hm3ActionPerformed

    private void hm2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hm2ActionPerformed
        GuiFunctions.onButtonClick("Hippo Sand paper 4x4\" 150 Grit\"", 10, spinnerhm2, Cart, labelTotalPrice);
    }//GEN-LAST:event_hm2ActionPerformed

    private void hm1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hm1ActionPerformed
        GuiFunctions.onButtonClick("Hippo Sand paper 4x4\" 120 Grit\"", 10, spinnerhm1, Cart, labelTotalPrice);
    }//GEN-LAST:event_hm1ActionPerformed
    
    
    
    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                new GUI().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JPanel ButtonHolder;
    private javax.swing.JTable Cart;
    public static javax.swing.JButton Checkout;
    private javax.swing.JButton Clear;
    private javax.swing.JTabbedPane ItemHolder;
    private javax.swing.JButton LogoutButton;
    private javax.swing.JPanel ReceiptHolder;
    private javax.swing.JPanel SprayPaintholder;
    private javax.swing.JPanel Tableholder;
    private javax.swing.JButton addItem;
    private javax.swing.JButton bf1;
    private javax.swing.JButton bf2;
    private javax.swing.JButton bf3;
    private javax.swing.JPanel bodyFiller;
    private javax.swing.JButton bodyfillerButton;
    private javax.swing.JPanel bodyfillerTab;
    private javax.swing.JButton hardwareButton;
    private javax.swing.JPanel hardwareMaterial;
    private javax.swing.JPanel hardwareTab;
    private javax.swing.JButton hm1;
    private javax.swing.JButton hm10;
    private javax.swing.JButton hm11;
    private javax.swing.JButton hm12;
    private javax.swing.JButton hm13;
    private javax.swing.JButton hm14;
    private javax.swing.JButton hm15;
    private javax.swing.JButton hm16;
    private javax.swing.JButton hm17;
    private javax.swing.JButton hm18;
    private javax.swing.JButton hm19;
    private javax.swing.JButton hm2;
    private javax.swing.JButton hm20;
    private javax.swing.JButton hm21;
    private javax.swing.JButton hm22;
    private javax.swing.JButton hm23;
    private javax.swing.JButton hm24;
    private javax.swing.JButton hm25;
    private javax.swing.JButton hm26;
    private javax.swing.JButton hm27;
    private javax.swing.JButton hm28;
    private javax.swing.JButton hm3;
    private javax.swing.JButton hm4;
    private javax.swing.JButton hm5;
    private javax.swing.JButton hm6;
    private javax.swing.JButton hm7;
    private javax.swing.JButton hm8;
    private javax.swing.JButton hm9;
    private javax.swing.JTextField inputPayment;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel141;
    private javax.swing.JLabel jLabel143;
    private javax.swing.JLabel jLabel144;
    private javax.swing.JLabel jLabel145;
    private javax.swing.JLabel jLabel167;
    private javax.swing.JLabel jLabel168;
    private javax.swing.JLabel jLabel169;
    private javax.swing.JLabel jLabel170;
    private javax.swing.JLabel jLabel171;
    private javax.swing.JLabel jLabel172;
    private javax.swing.JLabel jLabel173;
    private javax.swing.JLabel jLabel174;
    private javax.swing.JLabel jLabel175;
    private javax.swing.JLabel jLabel176;
    private javax.swing.JLabel jLabel177;
    private javax.swing.JLabel jLabel178;
    private javax.swing.JLabel jLabel179;
    private javax.swing.JLabel jLabel180;
    private javax.swing.JLabel jLabel195;
    private javax.swing.JLabel jLabel196;
    private javax.swing.JLabel jLabel197;
    private javax.swing.JLabel jLabel198;
    private javax.swing.JLabel jLabel199;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel200;
    private javax.swing.JLabel jLabel201;
    private javax.swing.JLabel jLabel202;
    private javax.swing.JLabel jLabel203;
    private javax.swing.JLabel jLabel204;
    private javax.swing.JLabel jLabel205;
    private javax.swing.JLabel jLabel206;
    private javax.swing.JLabel jLabel207;
    private javax.swing.JLabel jLabel208;
    private javax.swing.JLabel jLabel209;
    private javax.swing.JLabel jLabel210;
    private javax.swing.JLabel jLabel211;
    private javax.swing.JLabel jLabel212;
    private javax.swing.JLabel jLabel213;
    private javax.swing.JLabel jLabel214;
    private javax.swing.JLabel jLabel215;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel100;
    private javax.swing.JPanel jPanel101;
    private javax.swing.JPanel jPanel103;
    private javax.swing.JPanel jPanel106;
    private javax.swing.JPanel jPanel108;
    private javax.swing.JPanel jPanel109;
    private javax.swing.JPanel jPanel111;
    private javax.swing.JPanel jPanel112;
    private javax.swing.JPanel jPanel113;
    private javax.swing.JPanel jPanel114;
    private javax.swing.JPanel jPanel115;
    private javax.swing.JPanel jPanel116;
    private javax.swing.JPanel jPanel117;
    private javax.swing.JPanel jPanel118;
    private javax.swing.JPanel jPanel119;
    private javax.swing.JPanel jPanel120;
    private javax.swing.JPanel jPanel121;
    private javax.swing.JPanel jPanel122;
    private javax.swing.JPanel jPanel123;
    private javax.swing.JPanel jPanel124;
    private javax.swing.JPanel jPanel125;
    private javax.swing.JPanel jPanel126;
    private javax.swing.JPanel jPanel127;
    private javax.swing.JPanel jPanel128;
    private javax.swing.JPanel jPanel129;
    private javax.swing.JPanel jPanel130;
    private javax.swing.JPanel jPanel131;
    private javax.swing.JPanel jPanel132;
    private javax.swing.JPanel jPanel133;
    private javax.swing.JPanel jPanel134;
    private javax.swing.JPanel jPanel135;
    private javax.swing.JPanel jPanel136;
    private javax.swing.JPanel jPanel137;
    private javax.swing.JPanel jPanel138;
    private javax.swing.JPanel jPanel139;
    private javax.swing.JPanel jPanel140;
    private javax.swing.JPanel jPanel141;
    private javax.swing.JPanel jPanel142;
    private javax.swing.JPanel jPanel143;
    private javax.swing.JPanel jPanel144;
    private javax.swing.JPanel jPanel145;
    private javax.swing.JPanel jPanel146;
    private javax.swing.JPanel jPanel147;
    private javax.swing.JPanel jPanel148;
    private javax.swing.JPanel jPanel149;
    private javax.swing.JPanel jPanel150;
    private javax.swing.JPanel jPanel151;
    private javax.swing.JPanel jPanel152;
    private javax.swing.JPanel jPanel153;
    private javax.swing.JPanel jPanel154;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel54;
    private javax.swing.JPanel jPanel55;
    private javax.swing.JPanel jPanel56;
    private javax.swing.JPanel jPanel57;
    private javax.swing.JPanel jPanel58;
    private javax.swing.JPanel jPanel59;
    private javax.swing.JPanel jPanel60;
    private javax.swing.JPanel jPanel61;
    private javax.swing.JPanel jPanel70;
    private javax.swing.JPanel jPanel71;
    private javax.swing.JPanel jPanel72;
    private javax.swing.JPanel jPanel73;
    private javax.swing.JPanel jPanel74;
    private javax.swing.JPanel jPanel75;
    private javax.swing.JPanel jPanel76;
    private javax.swing.JPanel jPanel77;
    private javax.swing.JPanel jPanel78;
    private javax.swing.JPanel jPanel79;
    private javax.swing.JPanel jPanel80;
    private javax.swing.JPanel jPanel81;
    private javax.swing.JPanel jPanel82;
    private javax.swing.JPanel jPanel83;
    private javax.swing.JPanel jPanel84;
    private javax.swing.JPanel jPanel85;
    private javax.swing.JPanel jPanel86;
    private javax.swing.JPanel jPanel87;
    private javax.swing.JPanel jPanel88;
    private javax.swing.JPanel jPanel89;
    private javax.swing.JPanel jPanel90;
    private javax.swing.JPanel jPanel91;
    private javax.swing.JPanel jPanel92;
    private javax.swing.JPanel jPanel93;
    private javax.swing.JPanel jPanel94;
    private javax.swing.JPanel jPanel95;
    private javax.swing.JPanel jPanel96;
    private javax.swing.JPanel jPanel99;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JLabel labelTotalPrice;
    private javax.swing.JButton overallButton;
    private javax.swing.JSpinner overallSpinner;
    private javax.swing.JTable overallTable;
    private javax.swing.JButton paintButton;
    private javax.swing.JPanel paintHolder;
    private javax.swing.JPanel paintTab;
    private javax.swing.JPanel paintTab2;
    private javax.swing.JPanel paintTab3;
    private javax.swing.JButton ppt48;
    private javax.swing.JButton pt1;
    private javax.swing.JButton pt10;
    private javax.swing.JButton pt11;
    private javax.swing.JButton pt12;
    private javax.swing.JButton pt13;
    private javax.swing.JButton pt14;
    private javax.swing.JButton pt15;
    private javax.swing.JButton pt16;
    private javax.swing.JButton pt17;
    private javax.swing.JButton pt18;
    private javax.swing.JButton pt19;
    private javax.swing.JButton pt2;
    private javax.swing.JButton pt20;
    private javax.swing.JButton pt21;
    private javax.swing.JButton pt22;
    private javax.swing.JButton pt23;
    private javax.swing.JButton pt24;
    private javax.swing.JButton pt25;
    private javax.swing.JButton pt26;
    private javax.swing.JButton pt27;
    private javax.swing.JButton pt28;
    private javax.swing.JButton pt29;
    private javax.swing.JButton pt3;
    private javax.swing.JButton pt30;
    private javax.swing.JButton pt31;
    private javax.swing.JButton pt32;
    private javax.swing.JButton pt33;
    private javax.swing.JButton pt34;
    private javax.swing.JButton pt35;
    private javax.swing.JButton pt36;
    private javax.swing.JButton pt37;
    private javax.swing.JButton pt38;
    private javax.swing.JButton pt39;
    private javax.swing.JButton pt4;
    private javax.swing.JButton pt40;
    private javax.swing.JButton pt41;
    private javax.swing.JButton pt42;
    private javax.swing.JButton pt43;
    private javax.swing.JButton pt44;
    private javax.swing.JButton pt45;
    private javax.swing.JButton pt46;
    private javax.swing.JButton pt47;
    private javax.swing.JPanel pt48;
    private javax.swing.JButton pt5;
    private javax.swing.JButton pt6;
    private javax.swing.JButton pt7;
    private javax.swing.JButton pt8;
    private javax.swing.JButton pt9;
    private javax.swing.JButton remove;
    private javax.swing.JTextField search;
    private javax.swing.JButton sp1;
    private javax.swing.JButton sp10;
    private javax.swing.JButton sp11;
    private javax.swing.JButton sp12;
    private javax.swing.JButton sp13;
    private javax.swing.JButton sp14;
    private javax.swing.JButton sp2;
    private javax.swing.JButton sp3;
    private javax.swing.JButton sp4;
    private javax.swing.JButton sp5;
    private javax.swing.JButton sp6;
    private javax.swing.JButton sp7;
    private javax.swing.JButton sp8;
    private javax.swing.JButton sp9;
    private javax.swing.JSpinner spinnerbf1;
    private javax.swing.JSpinner spinnerbf2;
    private javax.swing.JSpinner spinnerbf3;
    private javax.swing.JSpinner spinnerhm1;
    private javax.swing.JSpinner spinnerhm10;
    private javax.swing.JSpinner spinnerhm11;
    private javax.swing.JSpinner spinnerhm12;
    private javax.swing.JSpinner spinnerhm13;
    private javax.swing.JSpinner spinnerhm14;
    private javax.swing.JSpinner spinnerhm15;
    private javax.swing.JSpinner spinnerhm16;
    private javax.swing.JSpinner spinnerhm17;
    private javax.swing.JSpinner spinnerhm18;
    private javax.swing.JSpinner spinnerhm19;
    private javax.swing.JSpinner spinnerhm2;
    private javax.swing.JSpinner spinnerhm20;
    private javax.swing.JSpinner spinnerhm21;
    private javax.swing.JSpinner spinnerhm22;
    private javax.swing.JSpinner spinnerhm23;
    private javax.swing.JSpinner spinnerhm24;
    private javax.swing.JSpinner spinnerhm25;
    private javax.swing.JSpinner spinnerhm26;
    private javax.swing.JSpinner spinnerhm27;
    private javax.swing.JSpinner spinnerhm28;
    private javax.swing.JSpinner spinnerhm3;
    private javax.swing.JSpinner spinnerhm4;
    private javax.swing.JSpinner spinnerhm5;
    private javax.swing.JSpinner spinnerhm6;
    private javax.swing.JSpinner spinnerhm7;
    private javax.swing.JSpinner spinnerhm8;
    private javax.swing.JSpinner spinnerhm9;
    private javax.swing.JSpinner spinnerpt1;
    private javax.swing.JSpinner spinnerpt10;
    private javax.swing.JSpinner spinnerpt11;
    private javax.swing.JSpinner spinnerpt12;
    private javax.swing.JSpinner spinnerpt13;
    private javax.swing.JSpinner spinnerpt14;
    private javax.swing.JSpinner spinnerpt15;
    private javax.swing.JSpinner spinnerpt16;
    private javax.swing.JSpinner spinnerpt17;
    private javax.swing.JSpinner spinnerpt18;
    private javax.swing.JSpinner spinnerpt19;
    private javax.swing.JSpinner spinnerpt2;
    private javax.swing.JSpinner spinnerpt20;
    private javax.swing.JSpinner spinnerpt21;
    private javax.swing.JSpinner spinnerpt22;
    private javax.swing.JSpinner spinnerpt23;
    private javax.swing.JSpinner spinnerpt24;
    private javax.swing.JSpinner spinnerpt25;
    private javax.swing.JSpinner spinnerpt26;
    private javax.swing.JSpinner spinnerpt27;
    private javax.swing.JSpinner spinnerpt28;
    private javax.swing.JSpinner spinnerpt29;
    private javax.swing.JSpinner spinnerpt3;
    private javax.swing.JSpinner spinnerpt30;
    private javax.swing.JSpinner spinnerpt31;
    private javax.swing.JSpinner spinnerpt32;
    private javax.swing.JSpinner spinnerpt33;
    private javax.swing.JSpinner spinnerpt34;
    private javax.swing.JSpinner spinnerpt35;
    private javax.swing.JSpinner spinnerpt36;
    private javax.swing.JSpinner spinnerpt37;
    private javax.swing.JSpinner spinnerpt38;
    private javax.swing.JSpinner spinnerpt39;
    private javax.swing.JSpinner spinnerpt4;
    private javax.swing.JSpinner spinnerpt40;
    private javax.swing.JSpinner spinnerpt41;
    private javax.swing.JSpinner spinnerpt42;
    private javax.swing.JSpinner spinnerpt43;
    private javax.swing.JSpinner spinnerpt44;
    private javax.swing.JSpinner spinnerpt45;
    private javax.swing.JSpinner spinnerpt46;
    private javax.swing.JSpinner spinnerpt47;
    private javax.swing.JSpinner spinnerpt48;
    private javax.swing.JSpinner spinnerpt5;
    private javax.swing.JSpinner spinnerpt6;
    private javax.swing.JSpinner spinnerpt7;
    private javax.swing.JSpinner spinnerpt8;
    private javax.swing.JSpinner spinnerpt9;
    private javax.swing.JSpinner spinnersp1;
    private javax.swing.JSpinner spinnersp10;
    private javax.swing.JSpinner spinnersp11;
    private javax.swing.JSpinner spinnersp12;
    private javax.swing.JSpinner spinnersp13;
    private javax.swing.JSpinner spinnersp14;
    private javax.swing.JSpinner spinnersp2;
    private javax.swing.JSpinner spinnersp3;
    private javax.swing.JSpinner spinnersp4;
    private javax.swing.JSpinner spinnersp5;
    private javax.swing.JSpinner spinnersp6;
    private javax.swing.JSpinner spinnersp7;
    private javax.swing.JSpinner spinnersp8;
    private javax.swing.JSpinner spinnersp9;
    private javax.swing.JSpinner spinnerth1;
    private javax.swing.JSpinner spinnerth10;
    private javax.swing.JSpinner spinnerth2;
    private javax.swing.JSpinner spinnerth3;
    private javax.swing.JSpinner spinnerth4;
    private javax.swing.JSpinner spinnerth5;
    private javax.swing.JSpinner spinnerth6;
    private javax.swing.JSpinner spinnerth7;
    private javax.swing.JSpinner spinnerth8;
    private javax.swing.JSpinner spinnerth9;
    private javax.swing.JSpinner spinneruc1;
    private javax.swing.JButton spraypaintButton;
    private javax.swing.JPanel spraypaintTab;
    private javax.swing.JButton th1;
    private javax.swing.JButton th10;
    private javax.swing.JButton th2;
    private javax.swing.JButton th3;
    private javax.swing.JButton th4;
    private javax.swing.JButton th6;
    private javax.swing.JButton th7;
    private javax.swing.JButton th8;
    private javax.swing.JButton th9;
    private javax.swing.JButton thh5;
    private javax.swing.JPanel thinnerHolder;
    private javax.swing.JButton tinnerButton;
    private javax.swing.JPanel tinnerTab;
    private javax.swing.JButton uc1;
    private javax.swing.JButton undercoatButton;
    private javax.swing.JPanel undercoatHolder;
    private javax.swing.JPanel undercoatTab;
    // End of variables declaration//GEN-END:variables
}
