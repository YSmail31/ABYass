package Simulation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class Interface extends javax.swing.JFrame {

    static Modele liens;
    static ModeleResultat resultat;
    static Scenario scenario;
    static String[][] mat = new String[256][256];
    static ArrayList<String> algorithm = new ArrayList<String>();
    public Interface() {
        initComponents();
        setLocationRelativeTo(null);
        jTabbedPane1.setSelectedIndex(4);
        tableau.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        liens = new Modele();
        scenario = new Scenario();
        resultat = new ModeleResultat();
        tableLien.setModel(liens);
        tableRes.setModel(resultat);
        tableScen.setModel(scenario);
        liens.addLien(new String[]{"samplerate.xml","modem.xml","h263encoder.xml","h263encoder.xml","jpegusecaseModified.xml","mp3playback.xml"});
        scenario.addScenario(new String[]{"scene1.scn"});
        remplirTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableLien = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableScen = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableRes = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tempsEnvoiPaquet = new javax.swing.JTextField();
        energieEnvoiPaquet = new javax.swing.JTextField();
        nbAPP = new javax.swing.JTextField();
        e0 = new javax.swing.JTextField();
        f0 = new javax.swing.JTextField();
        e1 = new javax.swing.JTextField();
        f1 = new javax.swing.JTextField();
        e2 = new javax.swing.JTextField();
        f2 = new javax.swing.JTextField();
        e3 = new javax.swing.JTextField();
        f3 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        algorithmePlacement = new javax.swing.JComboBox();
        defaultTokenSize = new javax.swing.JTextField();
        nbAPP1 = new javax.swing.JTextField();
        energieEnvoiPaquet1 = new javax.swing.JTextField();
        tempsEnvoiPaquet1 = new javax.swing.JTextField();
        defaultPaquetSize = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        peType0Freq = new javax.swing.JTextField();
        peType0Energie = new javax.swing.JTextField();
        peType1Freq = new javax.swing.JTextField();
        peType1Energie = new javax.swing.JTextField();
        peType2Freq = new javax.swing.JTextField();
        peType2Energie = new javax.swing.JTextField();
        peType3Freq = new javax.swing.JTextField();
        peType3Energie = new javax.swing.JTextField();
        tailleLien = new javax.swing.JTextField();
        tailleCluster = new javax.swing.JTextField();
        tailleNOC = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tableau = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tableLien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                "Chemin"
            }
        ));
        jScrollPane1.setViewportView(tableLien);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 755, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton1.setText("+");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("-");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(588, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Applications", jPanel1);

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tableScen.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                "Chemin"
            }
        ));
        jScrollPane3.setViewportView(tableScen);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 755, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton3.setText("+");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("-");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap(588, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Scenario", jPanel5);

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tableRes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                "Chemin"
            }
        ));
        jScrollPane2.setViewportView(tableRes);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 867, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Resultat", jPanel4);

        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setText("Temps_envoi_paquet(ms)");

        jLabel3.setText("Energie_envoi_paquet(uJ)");

        jLabel4.setText("NB_APP");

        jLabel11.setText("FREQUENCE (mips)");

        jLabel10.setText("ENERGIE (uJ)");

        jLabel6.setText("PE TYPE0");

        jLabel7.setText("PE TYPE1");

        tempsEnvoiPaquet.setText("1");
        tempsEnvoiPaquet.setMinimumSize(new java.awt.Dimension(22, 34));
        tempsEnvoiPaquet.setPreferredSize(new java.awt.Dimension(22, 34));

        energieEnvoiPaquet.setText("2");
        energieEnvoiPaquet.setMinimumSize(new java.awt.Dimension(22, 34));
        energieEnvoiPaquet.setPreferredSize(new java.awt.Dimension(22, 34));

        nbAPP.setText("3");
        nbAPP.setMinimumSize(new java.awt.Dimension(22, 34));
        nbAPP.setPreferredSize(new java.awt.Dimension(22, 34));

        e0.setText("4");
        e0.setMinimumSize(new java.awt.Dimension(22, 31));
        e0.setPreferredSize(new java.awt.Dimension(22, 31));

        f0.setText("5");
        f0.setMinimumSize(new java.awt.Dimension(22, 31));
        f0.setPreferredSize(new java.awt.Dimension(22, 31));

        e1.setText("6");
        e1.setMinimumSize(new java.awt.Dimension(22, 31));
        e1.setPreferredSize(new java.awt.Dimension(22, 31));

        f1.setText("7");
        f1.setMinimumSize(new java.awt.Dimension(22, 31));
        f1.setPreferredSize(new java.awt.Dimension(22, 31));

        e2.setText("8");
        e2.setMinimumSize(new java.awt.Dimension(22, 31));
        e2.setPreferredSize(new java.awt.Dimension(22, 31));

        f2.setText("9");
        f2.setMinimumSize(new java.awt.Dimension(22, 31));
        f2.setPreferredSize(new java.awt.Dimension(22, 31));

        e3.setText("10");
        e3.setMinimumSize(new java.awt.Dimension(22, 31));
        e3.setPreferredSize(new java.awt.Dimension(22, 31));

        f3.setText("11");
        f3.setMinimumSize(new java.awt.Dimension(22, 31));
        f3.setPreferredSize(new java.awt.Dimension(22, 31));

        jButton5.setText("Enregistrer Scenario");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel8.setText("PE TYPE2");

        jLabel9.setText("PE TYPE3");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 374, Short.MAX_VALUE)
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel9Layout.createSequentialGroup()
                    .addGap(80, 80, 80)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(nbAPP, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18))
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(15, 15, 15)))
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tempsEnvoiPaquet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(energieEnvoiPaquet, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel9Layout.createSequentialGroup()
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel9Layout.createSequentialGroup()
                                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(e2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(e3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(e0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(e1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel9Layout.createSequentialGroup()
                                            .addGap(1, 1, 1)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(3, 3, 3)
                                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel11)
                                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(f0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(f1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(f2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(f3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addComponent(jButton5))))
                    .addContainerGap(50, Short.MAX_VALUE)))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 598, Short.MAX_VALUE)
            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel9Layout.createSequentialGroup()
                    .addGap(19, 19, 19)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tempsEnvoiPaquet, javax.swing.GroupLayout.PREFERRED_SIZE, 23, Short.MAX_VALUE)
                        .addComponent(jLabel2))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(energieEnvoiPaquet, javax.swing.GroupLayout.PREFERRED_SIZE, 24, Short.MAX_VALUE)
                        .addComponent(jLabel3))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nbAPP, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(jLabel11))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel9Layout.createSequentialGroup()
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(e0, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(e1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(e2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(e3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9)))
                        .addGroup(jPanel9Layout.createSequentialGroup()
                            .addComponent(f0, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(f1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(f2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(f3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jButton5)
                    .addGap(20, 20, 20)))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(501, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Creer Scenario", jPanel8);

        jPanel11.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 153)));

        algorithmePlacement.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "FF", "NN_MANHATAN", "BN_MANHATAN", "NN_GBHD", "BN_GBHD" }));

        defaultTokenSize.setText("10000");
        defaultTokenSize.setMinimumSize(new java.awt.Dimension(22, 34));
        defaultTokenSize.setPreferredSize(new java.awt.Dimension(22, 34));

        nbAPP1.setEditable(false);
        nbAPP1.setMinimumSize(new java.awt.Dimension(22, 34));
        nbAPP1.setPreferredSize(new java.awt.Dimension(22, 34));

        energieEnvoiPaquet1.setText("20");
        energieEnvoiPaquet1.setMinimumSize(new java.awt.Dimension(22, 34));
        energieEnvoiPaquet1.setPreferredSize(new java.awt.Dimension(22, 34));

        tempsEnvoiPaquet1.setText("15");
        tempsEnvoiPaquet1.setMinimumSize(new java.awt.Dimension(22, 34));
        tempsEnvoiPaquet1.setPreferredSize(new java.awt.Dimension(22, 34));

        defaultPaquetSize.setText("50");
        defaultPaquetSize.setMinimumSize(new java.awt.Dimension(22, 34));
        defaultPaquetSize.setPreferredSize(new java.awt.Dimension(22, 34));

        jLabel1.setText("Default_Paquet_Size(octet)");

        jLabel5.setText("Temps_envoi_paquet(ms)");

        jLabel12.setText("Energie_envoi_paquet(uJ)");

        jLabel13.setText("NB_APP");

        jLabel14.setText("Default_token_size(octet)");

        jLabel15.setText("ALGORITHME_PLACEMENT");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(18, 18, 18))
                        .addGroup(jPanel11Layout.createSequentialGroup()
                            .addComponent(jLabel12)
                            .addGap(15, 15, 15)))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(9, 9, 9)))
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(defaultPaquetSize, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                    .addComponent(tempsEnvoiPaquet1, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                    .addComponent(energieEnvoiPaquet1, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 376, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(jLabel15))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(defaultTokenSize, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                        .addComponent(nbAPP1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(algorithmePlacement, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nbAPP1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(defaultPaquetSize, javax.swing.GroupLayout.PREFERRED_SIZE, 23, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(defaultTokenSize, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(tempsEnvoiPaquet1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, Short.MAX_VALUE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(energieEnvoiPaquet1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, Short.MAX_VALUE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel15)
                    .addComponent(algorithmePlacement, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel12.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 153)));

        jPanel13.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 102)));

        peType0Freq.setEditable(false);
        peType0Freq.setMinimumSize(new java.awt.Dimension(22, 31));
        peType0Freq.setPreferredSize(new java.awt.Dimension(22, 31));

        peType0Energie.setEditable(false);
        peType0Energie.setMinimumSize(new java.awt.Dimension(22, 31));
        peType0Energie.setPreferredSize(new java.awt.Dimension(22, 31));

        peType1Freq.setEditable(false);
        peType1Freq.setMinimumSize(new java.awt.Dimension(22, 31));
        peType1Freq.setPreferredSize(new java.awt.Dimension(22, 31));

        peType1Energie.setEditable(false);
        peType1Energie.setMinimumSize(new java.awt.Dimension(22, 31));
        peType1Energie.setPreferredSize(new java.awt.Dimension(22, 31));

        peType2Freq.setEditable(false);
        peType2Freq.setMinimumSize(new java.awt.Dimension(22, 31));
        peType2Freq.setPreferredSize(new java.awt.Dimension(22, 31));

        peType2Energie.setEditable(false);
        peType2Energie.setMinimumSize(new java.awt.Dimension(22, 31));
        peType2Energie.setPreferredSize(new java.awt.Dimension(22, 31));

        peType3Freq.setEditable(false);
        peType3Freq.setMinimumSize(new java.awt.Dimension(22, 31));
        peType3Freq.setPreferredSize(new java.awt.Dimension(22, 31));

        peType3Energie.setEditable(false);
        peType3Energie.setMinimumSize(new java.awt.Dimension(22, 31));
        peType3Energie.setPreferredSize(new java.awt.Dimension(22, 31));

        tailleLien.setText("250");
        tailleLien.setMinimumSize(new java.awt.Dimension(22, 31));
        tailleLien.setPreferredSize(new java.awt.Dimension(22, 31));

        tailleCluster.setText("4");
        tailleCluster.setMinimumSize(new java.awt.Dimension(22, 31));
        tailleCluster.setPreferredSize(new java.awt.Dimension(22, 31));

        tailleNOC.setText("16");
        tailleNOC.setMinimumSize(new java.awt.Dimension(20, 31));
        tailleNOC.setPreferredSize(new java.awt.Dimension(20, 31));

        jLabel16.setText("PE TYPE0");

        jLabel17.setText("PE TYPE1");

        jLabel18.setText("PE TYPE2");

        jLabel19.setText("PE TYPE3");

        jLabel20.setText("ENERGIE (uJ)");

        jLabel21.setText("FREQUENCE (mips)");

        jLabel22.setText("Taille_lien (octet)");

        jLabel23.setText("Taille_cluster");

        jLabel24.setText("Taille_NOC");

        jButton6.setText("Demmarer");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel13Layout.createSequentialGroup()
                            .addGap(27, 27, 27)
                            .addComponent(jLabel23))
                        .addGroup(jPanel13Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel22))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING))))
                    .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(19, 19, 19)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(peType2Energie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(peType3Energie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(peType0Energie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(peType1Energie, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21)
                            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(peType0Freq, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(peType1Freq, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(peType2Freq, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(peType3Freq, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jButton6)
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(tailleNOC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tailleCluster, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                        .addComponent(tailleLien, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(peType0Energie, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(peType1Energie, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(peType2Energie, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(peType3Energie, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19)))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(peType0Freq, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(peType1Freq, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(peType2Freq, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(peType3Freq, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 120, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(tailleLien, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(tailleCluster, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(tailleNOC, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jButton6)
                .addGap(37, 37, 37))
        );

        jPanel14.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 0, 102)));

        tableau.setModel(new Modele());
        jScrollPane4.setViewportView(tableau);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 492, Short.MAX_VALUE)
            .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel14Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel14Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Simulation", jPanel10);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        liens.addLien(ouvrirLiens());
        liens.fireTableDataChanged();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int[] selected = tableLien.getSelectedRows();
        if(selected != null)
            for(int i=selected.length-1;i>=0;i--)
                liens.removeLien(selected[i]);
        liens.fireTableDataChanged();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        scenario.addScenario(ouvrirScenario());
        scenario.fireTableDataChanged();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int[] selected = tableScen.getSelectedRows();
        if(selected != null)
            for(int i=selected.length-1;i>=0;i--)
                scenario.removeScenario(selected[i]);
        scenario.fireTableDataChanged();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        JFileChooser jf=new JFileChooser();
        jf.addChoosableFileFilter(new FileNameExtensionFilter("Scneraio", "scn"));
        jf.setAcceptAllFileFilterUsed(false);
        jf.setCurrentDirectory(new File("."));
        int res=jf.showSaveDialog(this);
        if(res == JFileChooser.APPROVE_OPTION)
        {
            String pathFile = jf.getSelectedFile().getAbsolutePath();
            if(!pathFile.endsWith(".scn"))
                pathFile += ".scn";
            EnregistrerScen(pathFile);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        
        FileWriter fichier = null;
        intit();
        for(String scenario:Scenario.scenario)
        {
            try {
                ModeleResultat.clear();
                ouvrir(scenario);
                //SimulatorSdf.main(null);
                
                ParametreSdf.init();
                ParametreSdf.ALGORITHME_PLACEMENT = "FF";
                SimulatorSdf.main(null);
                algorithm.add("FF");
                
                ParametreSdf.init();
                ParametreSdf.ALGORITHME_PLACEMENT = "BN_MANHATAN";
                SimulatorSdf.main(null);
                algorithm.add("BN_MANHATAN");
                
                ParametreSdf.init();
                ParametreSdf.ALGORITHME_PLACEMENT = "NN_GBHD";
                SimulatorSdf.main(null);
                algorithm.add("NN_GBHD");
                
                ParametreSdf.init();
                ParametreSdf.ALGORITHME_PLACEMENT = "BN_GBHD";
                SimulatorSdf.main(null);
                algorithm.add("BN_GBHD");
                
                ParametreSdf.init();
                ParametreSdf.ALGORITHME_PLACEMENT = "NN_MANHATAN";
                SimulatorSdf.main(null);
                algorithm.add("NN_MANHATAN");
                
                exporter(scenario);
            } catch (Throwable ex) {
                Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private String[] ouvrirLiens() {
        JFileChooser jf=new JFileChooser();
        jf.setMultiSelectionEnabled(true);
        jf.addChoosableFileFilter(new FileNameExtensionFilter("XML", "xml", "xml"));
        jf.setAcceptAllFileFilterUsed(false);
        jf.setCurrentDirectory(new File("."));
        int res=jf.showOpenDialog(jPanel1);
        if(res == JFileChooser.APPROVE_OPTION)
        {
            File[] files = jf.getSelectedFiles();
            String[] paths = new String[files.length];
            for(int i=0;i<files.length;i++)
                paths[i] = files[i].getAbsolutePath();
            return paths;
        }
        return null;
    }
    private String[] ouvrirScenario() {
        JFileChooser jf=new JFileChooser();
        jf.setMultiSelectionEnabled(true);
        jf.addChoosableFileFilter(new FileNameExtensionFilter("Scenario", "scn", "scn"));
        jf.setAcceptAllFileFilterUsed(false);
        jf.setCurrentDirectory(new File("."));
        int res=jf.showOpenDialog(jPanel1);
        if(res == JFileChooser.APPROVE_OPTION)
        {
            File[] files = jf.getSelectedFiles();
            String[] paths = new String[files.length];
            for(int i=0;i<files.length;i++)
                paths[i] = files[i].getAbsolutePath();
            return paths;
        }
        return null;
    }
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(simghrap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(simghrap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(simghrap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(simghrap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> algorithmePlacement;
    private javax.swing.JTextField defaultPaquetSize;
    private javax.swing.JTextField defaultTokenSize;
    private javax.swing.JTextField e0;
    private javax.swing.JTextField e1;
    private javax.swing.JTextField e2;
    private javax.swing.JTextField e3;
    private javax.swing.JTextField energieEnvoiPaquet;
    private javax.swing.JTextField energieEnvoiPaquet1;
    private javax.swing.JTextField f0;
    private javax.swing.JTextField f1;
    private javax.swing.JTextField f2;
    private javax.swing.JTextField f3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
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
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField nbAPP;
    private javax.swing.JTextField nbAPP1;
    private javax.swing.JTextField peType0Energie;
    private javax.swing.JTextField peType0Freq;
    private javax.swing.JTextField peType1Energie;
    private javax.swing.JTextField peType1Freq;
    private javax.swing.JTextField peType2Energie;
    private javax.swing.JTextField peType2Freq;
    private javax.swing.JTextField peType3Energie;
    private javax.swing.JTextField peType3Freq;
    private javax.swing.JTable tableLien;
    private javax.swing.JTable tableRes;
    private javax.swing.JTable tableScen;
    private javax.swing.JTable tableau;
    private javax.swing.JTextField tailleCluster;
    private javax.swing.JTextField tailleLien;
    private javax.swing.JTextField tailleNOC;
    private javax.swing.JTextField tempsEnvoiPaquet;
    private javax.swing.JTextField tempsEnvoiPaquet1;
    // End of variables declaration//GEN-END:variables

    private void EnregistrerScen(String pathFile) {
        try {
            FileWriter fw = new FileWriter(pathFile);
            fw.write("Temps Envoi Paquet :\t"+tempsEnvoiPaquet.getText());
            fw.write("\nEnergie Envoi Paquet :\t"+energieEnvoiPaquet.getText());
            fw.write("\nNombre Application :\t"+nbAPP.getText());
            fw.write("\nEnergie Proc Type 0 :\t"+e0.getText());
            fw.write("\nFrequence Proc Type 0 :\t"+f0.getText());
            fw.write("\nEnergie Proc Type 1 :\t"+e1.getText());
            fw.write("\nFrequence Proc Type 1 :\t"+f1.getText());
            fw.write("\nEnergie Proc Type 2 :\t"+e2.getText());
            fw.write("\nFrequence Proc Type 2 :\t"+f2.getText());
            fw.write("\nEnergie Proc Type 3 :\t"+e3.getText());
            fw.write("\nFrequence Proc Type 3 :\t"+f3.getText());
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    static void ecrire(String path)
    {
        FileWriter fw = null;
        try {
            String sortie = "ResultatV2"+path.replace(".scn", ".txt");
            fw = new FileWriter(sortie);
            fw.write("N=°APP \t Energie \t Latence \t Temps Execution \n");
            int nbapp = ParametreSdf.NB_APP;
            for(int i=0;i<nbapp;i++)
            {
                fw.write(i+"\t");
                for(int j=0;j < ModeleResultat.mat.size()/(nbapp+2);j++)
                {
                    int indice = (nbapp+2)*j + i;
                    fw.write(ModeleResultat.mat.get(indice)[1]+"\t"+ModeleResultat.mat.get(indice)[2]+"\t"+ModeleResultat.mat.get(indice)[3]);
                }
                fw.write("\n");
            }
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fw.close();
            } catch (IOException ex) {
                Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private void intit() {
        FileWriter fichier = null;
        
        ParametreSdf.Default_Paquets_Size = Integer.parseInt(defaultPaquetSize.getText());
        ParametreSdf.Default_token_size = Integer.parseInt(defaultTokenSize.getText());
        StaticParametre.TAILLE_CLUSTER = Integer.parseInt(tailleCluster.getText());
        StaticParametre.LEGNHT_NOC = Integer.parseInt(tailleNOC.getText());
        ParametreSdf.Debit = Integer.parseInt(tailleLien.getText());
        
        if (StaticParametre.LEGNHT_NOC % StaticParametre.TAILLE_CLUSTER == 0) {
            StaticParametre.nbcluster = (StaticParametre.LEGNHT_NOC / StaticParametre.TAILLE_CLUSTER) * (StaticParametre.LEGNHT_NOC / StaticParametre.TAILLE_CLUSTER);
        } else {
            StaticParametre.nbcluster = (StaticParametre.LEGNHT_NOC / StaticParametre.TAILLE_CLUSTER + 1) * (StaticParametre.LEGNHT_NOC / StaticParametre.TAILLE_CLUSTER + 1);
        }
        
        try {
            ParametreSdf.init();
            fichier = new FileWriter("value_lien.txt");
            String line = "";
            for (int i = 0; i < tableau.getRowCount(); i++) {
                for (int j = 1; j < tableau.getColumnCount(); j++) {
                        line = line + (String) tableau.getModel().getValueAt(i, j) + ",";
                }
                line = line.substring(0, line.length() - 1);
                line = line + "\r\n";
            }   fichier.write(line);
            fichier.close();
        } catch (IOException ex) {
            Logger.getLogger(simghrap.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fichier.close();
            } catch (IOException ex) {
                Logger.getLogger(simghrap.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private void ouvrir(String path) {
        try {
            Scanner sc = new Scanner(new File(path));
            String[] ligne = new String[2];
            ligne = sc.nextLine().split("\t");
            StaticParametre.Temps_envoie = Integer.parseInt(ligne[1]);
            
            ligne = sc.nextLine().split("\t");
            StaticParametre.Energie_envoi = Integer.parseInt(ligne[1]);
            StaticParametre.Energie_attente_envoie = StaticParametre.Energie_envoi / 10;
            
            ligne = sc.nextLine().split("\t");
            ParametreSdf.NB_APP = Integer.parseInt(ligne[1]);
            
            /*ligne = sc.nextLine().split("\t");
            ParametreSdf.Debit = Integer.parseInt(ligne[1]);*/
            ligne = sc.nextLine().split("\t");
            ParametreSdf.ENERGIE_TYPE0 = Integer.parseInt(ligne[1]);
            
            ligne = sc.nextLine().split("\t");
            ParametreSdf.FREQUENCE_TYPE0 = Integer.parseInt(ligne[1]);
            
            ligne = sc.nextLine().split("\t");
            ParametreSdf.ENERGIE_TYPE1 = Integer.parseInt(ligne[1]);
            
            ligne = sc.nextLine().split("\t");
            ParametreSdf.FREQUENCE_TYPE1 = Integer.parseInt(ligne[1]);
            
            ligne = sc.nextLine().split("\t");
            ParametreSdf.ENERGIE_TYPE2 = Integer.parseInt(ligne[1]);
            
            ligne = sc.nextLine().split("\t");
            ParametreSdf.FREQUENCE_TYPE2 = Integer.parseInt(ligne[1]);
            
            ligne = sc.nextLine().split("\t");
            ParametreSdf.ENERGIE_TYPE3 = Integer.parseInt(ligne[1]);
            
            ligne = sc.nextLine().split("\t");
            ParametreSdf.FREQUENCE_TYPE3 = Integer.parseInt(ligne[1]);
        
            sc.close();
            
            tempsEnvoiPaquet1.setText(""+StaticParametre.Temps_envoie);
            energieEnvoiPaquet1.setText(""+StaticParametre.Energie_envoi);
            nbAPP1.setText(""+ParametreSdf.NB_APP);
            peType0Energie.setText(""+ParametreSdf.ENERGIE_TYPE0);
            peType0Freq.setText(""+ParametreSdf.FREQUENCE_TYPE0);
            peType1Energie.setText(""+ParametreSdf.ENERGIE_TYPE1);
            peType1Freq.setText(""+ParametreSdf.FREQUENCE_TYPE1);
            peType2Energie.setText(""+ParametreSdf.ENERGIE_TYPE2);
            peType2Freq.setText(""+ParametreSdf.FREQUENCE_TYPE2);
            peType3Energie.setText(""+ParametreSdf.ENERGIE_TYPE3);
            peType3Freq.setText(""+ParametreSdf.FREQUENCE_TYPE3);
        }   catch (FileNotFoundException ex) {
            Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    void remplirTable()
    {
        BufferedReader in = null;
                try {
                    in = new BufferedReader(new FileReader("lien.txt"));
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
                int compteurLigne = 0;
                int id = 0;
                while (true) {
                    String line = null;
                    try {
                        line = in.readLine();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    if (line == null)
                        break;
                    String word;
                    StringTokenizer tok = new StringTokenizer(line, ",");
                    int count_word = tok.countTokens();
                    for (int i = 1; i < count_word + 1; i++) {
                        word = tok.nextToken();
                        mat[compteurLigne][i] = word;
                    }
                    compteurLigne++;
                }
                String[] NomColonne = new String[StaticParametre.LEGNHT_NOC + 1];
                NomColonne[0] = "  ";
                for (int i = 1; i < StaticParametre.LEGNHT_NOC + 1; i++) {
                    NomColonne[i] = "P" + Integer.toString(i - 1);
                }
                String[][] Donnees = new String[StaticParametre.LEGNHT_NOC][StaticParametre.LEGNHT_NOC + 1];
                for (int i = 0; i < StaticParametre.LEGNHT_NOC; i++) 
                {
                    Donnees[i][0] = "P"+ i;
                    for (int j = 1; j < StaticParametre.LEGNHT_NOC + 1; j++) 
                        Donnees[i][j] = mat[i][j];
                }
                DefaultTableModel model = new DefaultTableModel(Donnees, NomColonne);
                tableau.setModel(model);
    }
    static void exporter(String path)
    {
        
        String sortie = "ResultatV2"+path.replace(".scn", ".xls");
        int nbapp = ParametreSdf.NB_APP;
        ArrayList<String[]> mat = ModeleResultat.mat;

        WritableWorkbook workbook = null;
        try {
                /* On créé un nouveau worbook et on l'ouvre en écriture */
                workbook = Workbook.createWorkbook(new File(sortie));

                /* On créé une nouvelle feuille*/
                WritableSheet sheet = workbook.createSheet("Resultat", 0); 
                int k=0;
                Label label = new Label(k, 1, "N=°APP");
                sheet.addCell(label);
                k++;
                for(int j=0;j < mat.size()/(nbapp+2);j++)
                {
                    label = new Label(k, 1, "Energie");
                    sheet.addCell(label);
                    label = new Label(k+1, 1, "Latence");
                    sheet.addCell(label);
                    label = new Label(k+2, 1, "Temps Execution");
                    sheet.addCell(label);
                    sheet.mergeCells(k, 0, k+2, 0);
                    k +=3;
                }
                for(int j=0;j < mat.size()/(nbapp+2);j++)
                {
                    label = new Label(j*3+1, 0, algorithm.get(j));
                    sheet.addCell(label);
                }
                for(int i=0;i<nbapp;i++)
                {
                    k=0;
                    
                    jxl.write.Number number = new jxl.write.Number(k, i+2, i);
                    sheet.addCell(number); 
                    k++;
                    for(int j=0;j < mat.size()/(nbapp+2);j++)
                    {
                        int indice = (nbapp+2)*j + i;
                        number = new jxl.write.Number(k, i+2, Integer.parseInt(mat.get(indice)[1]));
                        sheet.addCell(number); 
                        number = new jxl.write.Number(k+1, i+2, Integer.parseInt(mat.get(indice)[2]));
                        sheet.addCell(number); 
                        number = new jxl.write.Number(k+2, i+2, Integer.parseInt(mat.get(indice)[3]));
                        sheet.addCell(number); 
                        k += 3;
                    }
                }
                for(int i=0;i<k;i++)
                {
                    sheet.setColumnView(i, 15);
                }
                workbook.write(); 

        } 
        catch (IOException e) {
                e.printStackTrace();
        } 
        catch (RowsExceededException e) {
                e.printStackTrace();
        }
        catch (WriteException e) {
                e.printStackTrace();
        }
        finally {
                if(workbook!=null){
                        /* On ferme le worbook pour libérer la mémoire */
                        try {
                                workbook.close();
                        } 
                        catch (WriteException e) {
                                e.printStackTrace();
                        } 
                        catch (IOException e) {
                                e.printStackTrace();
                        } 
                }
        }

    }
}
