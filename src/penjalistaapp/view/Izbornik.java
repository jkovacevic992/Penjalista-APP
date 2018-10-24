/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penjalistaapp.view;

import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.awt.AWTException;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Image;
import java.awt.SystemTray;
import java.awt.Toolkit;
import java.awt.TrayIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Date;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import penjalistaapp.controller.ObradaAutor;
import penjalistaapp.controller.ObradaPenjac;
import penjalistaapp.controller.ObradaPenjaliste;
import penjalistaapp.controller.ObradaSektor;
import penjalistaapp.controller.ObradaSmjer;
import penjalistaapp.model.Autor;
import penjalistaapp.model.Entitet;

import penjalistaapp.model.Operater;
import penjalistaapp.model.Penjac;
import penjalistaapp.model.Penjaliste;
import penjalistaapp.model.Sektor;
import penjalistaapp.model.Smjer;

/**
 *
 * @author Josip
 */
public class Izbornik extends javax.swing.JFrame {

    /**
     * Creates new form Izbornik
     */
    private Operater operater;
    Image image = Toolkit.getDefaultToolkit().getImage("Slike/climbingIcon.png");
    final TrayIcon icon = new TrayIcon(image, "Penjališta APP");
    private Date pocetakRada;
    
    public Izbornik(Operater operater) {
        
        initComponents();
        this.operater = operater;
        setTitle("Penjališta APP " + operater.getIme() + " " + operater.getPrezime());
        promjenaIzgleda();
        pocetakRada = new Date();
        
        definirajTimer();
        
        minimizeToSysTray();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlIzbornik = new javax.swing.JPanel();
        btnPenjaliste = new javax.swing.JButton();
        btnAutor = new javax.swing.JButton();
        btnPenjac = new javax.swing.JButton();
        btnGit = new javax.swing.JButton();
        btnEra = new javax.swing.JButton();
        lblSlika = new javax.swing.JLabel();
        lblVrijeme = new javax.swing.JLabel();
        btnSektori = new javax.swing.JButton();
        btnSmjerovi = new javax.swing.JButton();
        jmbMenu = new javax.swing.JMenuBar();
        menFile = new javax.swing.JMenu();
        jmiExit = new javax.swing.JMenuItem();
        menExport = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jmiJsonPenjalista = new javax.swing.JMenuItem();
        jmiCsvPenjalista = new javax.swing.JMenuItem();
        jmiExcelPenjalista = new javax.swing.JMenuItem();
        jmnAutori = new javax.swing.JMenu();
        jmiJsonAutori = new javax.swing.JMenuItem();
        jmiCsvAutori = new javax.swing.JMenuItem();
        jmiExcelAutori = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jmiJsonPenjaci = new javax.swing.JMenuItem();
        jmiCsvPenjaci = new javax.swing.JMenuItem();
        jmiExcelPenjaci = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jmiJsonSektori = new javax.swing.JMenuItem();
        jmiCsvSektori = new javax.swing.JMenuItem();
        jmiExcelSektori = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jmiJsonSmjerovi = new javax.swing.JMenuItem();
        jmiCsvSmjerovi = new javax.swing.JMenuItem();
        jmiExcelSmjerovi = new javax.swing.JMenuItem();
        menHelp = new javax.swing.JMenu();
        jmiOAplikaciji = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Penjališta APP");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.white);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowIconified(java.awt.event.WindowEvent evt) {
                formWindowIconified(evt);
            }
        });

        btnPenjaliste.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        btnPenjaliste.setText("Penjališta");
        btnPenjaliste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPenjalisteActionPerformed(evt);
            }
        });

        btnAutor.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        btnAutor.setText("Autori");
        btnAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAutorActionPerformed(evt);
            }
        });

        btnPenjac.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        btnPenjac.setText("Penjači");
        btnPenjac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPenjacActionPerformed(evt);
            }
        });

        btnGit.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        btnGit.setText("GitHub");
        btnGit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGitActionPerformed(evt);
            }
        });

        btnEra.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        btnEra.setText("ERA dijagram");
        btnEra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEraActionPerformed(evt);
            }
        });

        lblSlika.setIcon(new javax.swing.ImageIcon(getClass().getResource("/penjalistaapp/view/climber1.png"))); // NOI18N

        lblVrijeme.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        lblVrijeme.setForeground(new java.awt.Color(255, 255, 255));

        btnSektori.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        btnSektori.setText("Sektori");
        btnSektori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSektoriActionPerformed(evt);
            }
        });

        btnSmjerovi.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        btnSmjerovi.setText("Smjerovi");
        btnSmjerovi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSmjeroviActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlIzbornikLayout = new javax.swing.GroupLayout(pnlIzbornik);
        pnlIzbornik.setLayout(pnlIzbornikLayout);
        pnlIzbornikLayout.setHorizontalGroup(
            pnlIzbornikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlIzbornikLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlIzbornikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnGit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPenjac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAutor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPenjaliste, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                    .addComponent(btnSektori, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSmjerovi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblVrijeme, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(lblSlika, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        pnlIzbornikLayout.setVerticalGroup(
            pnlIzbornikLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlIzbornikLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnPenjaliste)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAutor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPenjac)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSektori)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSmjerovi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblVrijeme, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(68, 68, 68))
            .addGroup(pnlIzbornikLayout.createSequentialGroup()
                .addComponent(lblSlika)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        menFile.setText("File");

        jmiExit.setText("Zatvori");
        jmiExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiExitActionPerformed(evt);
            }
        });
        menFile.add(jmiExit);

        jmbMenu.add(menFile);

        menExport.setText("Export");

        jMenu2.setText("Penjališta");

        jmiJsonPenjalista.setText("JSON");
        jmiJsonPenjalista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiJsonPenjalistaActionPerformed(evt);
            }
        });
        jMenu2.add(jmiJsonPenjalista);

        jmiCsvPenjalista.setText("CSV");
        jmiCsvPenjalista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCsvPenjalistaActionPerformed(evt);
            }
        });
        jMenu2.add(jmiCsvPenjalista);

        jmiExcelPenjalista.setText("MS Excel");
        jmiExcelPenjalista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiExcelPenjalistaActionPerformed(evt);
            }
        });
        jMenu2.add(jmiExcelPenjalista);

        menExport.add(jMenu2);

        jmnAutori.setText("Autori");

        jmiJsonAutori.setText("JSON");
        jmiJsonAutori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiJsonAutoriActionPerformed(evt);
            }
        });
        jmnAutori.add(jmiJsonAutori);

        jmiCsvAutori.setText("CSV");
        jmiCsvAutori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCsvAutoriActionPerformed(evt);
            }
        });
        jmnAutori.add(jmiCsvAutori);

        jmiExcelAutori.setText("MS Excel");
        jmiExcelAutori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiExcelAutoriActionPerformed(evt);
            }
        });
        jmnAutori.add(jmiExcelAutori);

        menExport.add(jmnAutori);

        jMenu1.setText("Penjači");

        jmiJsonPenjaci.setText("JSON");
        jmiJsonPenjaci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiJsonPenjaciActionPerformed(evt);
            }
        });
        jMenu1.add(jmiJsonPenjaci);

        jmiCsvPenjaci.setText("CSV");
        jmiCsvPenjaci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCsvPenjaciActionPerformed(evt);
            }
        });
        jMenu1.add(jmiCsvPenjaci);

        jmiExcelPenjaci.setText("MS Excel");
        jmiExcelPenjaci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiExcelPenjaciActionPerformed(evt);
            }
        });
        jMenu1.add(jmiExcelPenjaci);

        menExport.add(jMenu1);

        jMenu3.setText("Sektori");

        jmiJsonSektori.setText("JSON");
        jmiJsonSektori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiJsonSektoriActionPerformed(evt);
            }
        });
        jMenu3.add(jmiJsonSektori);

        jmiCsvSektori.setText("CSV");
        jmiCsvSektori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCsvSektoriActionPerformed(evt);
            }
        });
        jMenu3.add(jmiCsvSektori);

        jmiExcelSektori.setText("MS Excel");
        jmiExcelSektori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiExcelSektoriActionPerformed(evt);
            }
        });
        jMenu3.add(jmiExcelSektori);

        menExport.add(jMenu3);

        jMenu4.setText("Smjerovi");

        jmiJsonSmjerovi.setText("JSON");
        jmiJsonSmjerovi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiJsonSmjeroviActionPerformed(evt);
            }
        });
        jMenu4.add(jmiJsonSmjerovi);

        jmiCsvSmjerovi.setText("CSV");
        jmiCsvSmjerovi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCsvSmjeroviActionPerformed(evt);
            }
        });
        jMenu4.add(jmiCsvSmjerovi);

        jmiExcelSmjerovi.setText("MS Excel");
        jmiExcelSmjerovi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiExcelSmjeroviActionPerformed(evt);
            }
        });
        jMenu4.add(jmiExcelSmjerovi);

        menExport.add(jMenu4);

        jmbMenu.add(menExport);

        menHelp.setText("Help");

        jmiOAplikaciji.setText("O aplikaciji");
        jmiOAplikaciji.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiOAplikacijiActionPerformed(evt);
            }
        });
        menHelp.add(jmiOAplikaciji);

        jmbMenu.add(menHelp);

        setJMenuBar(jmbMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlIzbornik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlIzbornik, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEraActionPerformed
        Slika slika = new Slika();
        slika.setVisible(true);
    }//GEN-LAST:event_btnEraActionPerformed

    private void btnGitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGitActionPerformed
        
        try {
            Desktop.getDesktop().browse(new URL("https://github.com/jkovacevic992/Penjalista-APP").toURI());
        } catch (URISyntaxException | IOException ex) {
            ex.printStackTrace();
        }
        

    }//GEN-LAST:event_btnGitActionPerformed

    private void btnPenjalisteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPenjalisteActionPerformed
        Penjalista penjaliste = new Penjalista();
        penjaliste.setVisible(true);
    }//GEN-LAST:event_btnPenjalisteActionPerformed

    private void btnPenjacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPenjacActionPerformed
        Penjaci osoba = new Penjaci();
        osoba.setVisible(true);
    }//GEN-LAST:event_btnPenjacActionPerformed

    private void btnAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAutorActionPerformed
        Autori autor = new Autori();
        autor.setVisible(true);
    }//GEN-LAST:event_btnAutorActionPerformed

    private void formWindowIconified(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowIconified
        setVisible(false);
    }//GEN-LAST:event_formWindowIconified

    private void jmiExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiExitActionPerformed
        dispose();
        System.exit(0);
    }//GEN-LAST:event_jmiExitActionPerformed

    private void jmiOAplikacijiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiOAplikacijiActionPerformed
        OAplikaciji oAplikaciji = new OAplikaciji();
        oAplikaciji.setVisible(true);
    }//GEN-LAST:event_jmiOAplikacijiActionPerformed

    private void jmiJsonAutoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiJsonAutoriActionPerformed
        ObradaAutor o = new ObradaAutor();
        spremiJSON(o.getListEntitet());
        

    }//GEN-LAST:event_jmiJsonAutoriActionPerformed

    private void jmiCsvAutoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCsvAutoriActionPerformed
        ObradaAutor o = new ObradaAutor();
        spremiCSV(o.getListEntitet());
    }//GEN-LAST:event_jmiCsvAutoriActionPerformed

    private void jmiJsonPenjaciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiJsonPenjaciActionPerformed
        ObradaPenjac o = new ObradaPenjac();
        spremiJSON(o.getListEntitet());
    }//GEN-LAST:event_jmiJsonPenjaciActionPerformed

    private void jmiCsvPenjaciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCsvPenjaciActionPerformed
        ObradaPenjac o = new ObradaPenjac();
        spremiCSV(o.getListEntitet());
    }//GEN-LAST:event_jmiCsvPenjaciActionPerformed

    private void jmiJsonPenjalistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiJsonPenjalistaActionPerformed
        ObradaPenjaliste o = new ObradaPenjaliste();
        spremiJSON(o.getListEntitet());
    }//GEN-LAST:event_jmiJsonPenjalistaActionPerformed

    private void jmiCsvPenjalistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCsvPenjalistaActionPerformed
        ObradaPenjaliste o = new ObradaPenjaliste();
        spremiCSV(o.getListEntitet());
    }//GEN-LAST:event_jmiCsvPenjalistaActionPerformed

    private void btnSektoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSektoriActionPerformed
        Sektori sektor = new Sektori();
        sektor.setVisible(true);
    }//GEN-LAST:event_btnSektoriActionPerformed

    private void btnSmjeroviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSmjeroviActionPerformed
        Smjerovi smjer = new Smjerovi();
        smjer.setVisible(true);
    }//GEN-LAST:event_btnSmjeroviActionPerformed

    private void jmiExcelAutoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiExcelAutoriActionPerformed
        ObradaAutor o = new ObradaAutor();
        List<Autor> lista = o.getEntiteti();
        try (HSSFWorkbook wb = new HSSFWorkbook()) { //or new HSSFWorkbook();

            HSSFSheet s = wb.createSheet("Podaci");
            int rownum;
            for (rownum = 0; rownum < lista.size(); rownum++) {
                HSSFRow r = s.createRow(rownum);
                HSSFCell c = r.createCell(0);
                c.setCellValue(lista.get(rownum).getIme());
                c = r.createCell(1);
                c.setCellValue(lista.get(rownum).getPrezime());
                if (lista.get(rownum).getSmjerovi() != null) {
                    c = r.createCell(2);
                    c.setCellValue(lista.get(rownum).getSmjerovi().toString());
                }
            }
            
            HSSFRow r = s.createRow(++rownum);

            // Create various cells and rows for spreadsheet.
            spremiExcel("autori.xls", wb, true);
            
        } catch (IOException e) {
            
        }
    }//GEN-LAST:event_jmiExcelAutoriActionPerformed

    private void jmiExcelPenjalistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiExcelPenjalistaActionPerformed
        ObradaPenjaliste o = new ObradaPenjaliste();
        List<Penjaliste> lista = o.getEntiteti();
        try (HSSFWorkbook wb = new HSSFWorkbook()) { //or new HSSFWorkbook();
           
            HSSFSheet s = wb.createSheet("Podaci");
            int rownum;
            for (rownum = 0; rownum < lista.size(); rownum++) {
                HSSFRow r = s.createRow(rownum);
                HSSFCell c = r.createCell(0);
                c.setCellValue(lista.get(rownum).getNaziv());
                c = r.createCell(1);
                c.setCellValue(lista.get(rownum).getLon());
                c = r.createCell(2);
                c.setCellValue(lista.get(rownum).getLat());
                if (lista.get(rownum).getSektori() != null) {
                    c = r.createCell(3);
                    c.setCellValue(lista.get(rownum).getSektori().toString());
                }
                
                
            }
            HSSFRow r = s.createRow(++rownum);

            // Create various cells and rows for spreadsheet.
            spremiExcel("penjalista.xls", wb, true);
            
        } catch (IOException e) {
            
        }
    }//GEN-LAST:event_jmiExcelPenjalistaActionPerformed

    private void jmiExcelPenjaciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiExcelPenjaciActionPerformed
        ObradaPenjac o = new ObradaPenjac();
        List<Penjac> lista = o.getEntiteti();
        try (HSSFWorkbook wb = new HSSFWorkbook()) { //or new HSSFWorkbook();

            HSSFSheet s = wb.createSheet("Podaci");
            int rownum;
            for (rownum = 0; rownum < lista.size(); rownum++) {
                HSSFRow r = s.createRow(rownum);
                HSSFCell c = r.createCell(0);
                c.setCellValue(lista.get(rownum).getIme());
                c = r.createCell(1);
                c.setCellValue(lista.get(rownum).getPrezime());
                
            }
            HSSFRow r = s.createRow(++rownum);

            // Create various cells and rows for spreadsheet.
            spremiExcel("penjaci.xls", wb, true);
            
        } catch (IOException e) {
            
        }
    }//GEN-LAST:event_jmiExcelPenjaciActionPerformed

    private void jmiJsonSektoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiJsonSektoriActionPerformed
        ObradaSektor o = new ObradaSektor();
        spremiJSON(o.getListEntitet());
    }//GEN-LAST:event_jmiJsonSektoriActionPerformed

    private void jmiCsvSektoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCsvSektoriActionPerformed
        ObradaSektor o = new ObradaSektor();
        spremiCSV(o.getListEntitet());
    }//GEN-LAST:event_jmiCsvSektoriActionPerformed

    private void jmiExcelSektoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiExcelSektoriActionPerformed
        ObradaSektor o = new ObradaSektor();
        List<Sektor> lista = o.getEntiteti();
        try (HSSFWorkbook wb = new HSSFWorkbook()) { //or new HSSFWorkbook();

            HSSFSheet s = wb.createSheet("Podaci");
            int rownum;
            for (rownum = 0; rownum < lista.size(); rownum++) {
                HSSFRow r = s.createRow(rownum);
                HSSFCell c = r.createCell(0);
                c.setCellValue(lista.get(rownum).getNaziv());
                c = r.createCell(1);
                c.setCellValue(lista.get(rownum).getLon());
                c = r.createCell(2);
                c.setCellValue(lista.get(rownum).getLat());
                if (lista.get(rownum).getPenjaliste() != null) {
                    c = r.createCell(3);
                    c.setCellValue(lista.get(rownum).getPenjaliste().toString());
                }
                if (lista.get(rownum).getSmjerovi()!= null) {
                    c = r.createCell(4);
                    c.setCellValue(lista.get(rownum).getSmjerovi().toString());
                }
                
            }
            HSSFRow r = s.createRow(++rownum);

            // Create various cells and rows for spreadsheet.
            spremiExcel("sektori.xls", wb, true);
            
        } catch (IOException e) {
            
        }
    }//GEN-LAST:event_jmiExcelSektoriActionPerformed

    private void jmiJsonSmjeroviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiJsonSmjeroviActionPerformed
        ObradaSmjer o = new ObradaSmjer();
        spremiJSON(o.getListEntitet());
    }//GEN-LAST:event_jmiJsonSmjeroviActionPerformed

    private void jmiCsvSmjeroviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCsvSmjeroviActionPerformed
        ObradaSmjer o = new ObradaSmjer();
        spremiCSV(o.getListEntitet());
    }//GEN-LAST:event_jmiCsvSmjeroviActionPerformed

    private void jmiExcelSmjeroviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiExcelSmjeroviActionPerformed
        ObradaSmjer o = new ObradaSmjer();
        List<Smjer> lista = o.getEntiteti();
        try (HSSFWorkbook wb = new HSSFWorkbook()) { //or new HSSFWorkbook();

            HSSFSheet s = wb.createSheet("Podaci");
            int rownum;
            for (rownum = 0; rownum < lista.size(); rownum++) {
                HSSFRow r = s.createRow(rownum);
                HSSFCell c = r.createCell(0);
                c.setCellValue(lista.get(rownum).getNaziv());
                c = r.createCell(1);
                c.setCellValue(lista.get(rownum).getOcjena());
                c = r.createCell(2);
                c.setCellValue(lista.get(rownum).getDuzina() + "m");
                if (lista.get(rownum).getSektor() != null) {
                    c = r.createCell(3);
                    c.setCellValue(lista.get(rownum).getSektor().toString());
                }
                
            }
            HSSFRow r = s.createRow(++rownum);

            // Create various cells and rows for spreadsheet.
            spremiExcel("smjerovi.xls", wb, true);
            
        } catch (IOException e) {
            
        }
    }//GEN-LAST:event_jmiExcelSmjeroviActionPerformed
    
    private void spremiCSV(List<Entitet> lista) {
        String naziv = "podaci";
        if (lista.size() > 0) {
            Entitet e = lista.get(0);
            naziv = e.getClass().getSimpleName().toLowerCase();
            StringBuilder s = new StringBuilder();
            lista.forEach((en) -> {
                s.append(en.getCSV());
                s.append("\n");
            });
            spremiTekst(s.toString(), "CSV DATOTEKA", "csv", naziv, false);
            
        }
    }
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAutor;
    private javax.swing.JButton btnEra;
    private javax.swing.JButton btnGit;
    private javax.swing.JButton btnPenjac;
    private javax.swing.JButton btnPenjaliste;
    private javax.swing.JButton btnSektori;
    private javax.swing.JButton btnSmjerovi;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jmbMenu;
    private javax.swing.JMenuItem jmiCsvAutori;
    private javax.swing.JMenuItem jmiCsvPenjaci;
    private javax.swing.JMenuItem jmiCsvPenjalista;
    private javax.swing.JMenuItem jmiCsvSektori;
    private javax.swing.JMenuItem jmiCsvSmjerovi;
    private javax.swing.JMenuItem jmiExcelAutori;
    private javax.swing.JMenuItem jmiExcelPenjaci;
    private javax.swing.JMenuItem jmiExcelPenjalista;
    private javax.swing.JMenuItem jmiExcelSektori;
    private javax.swing.JMenuItem jmiExcelSmjerovi;
    private javax.swing.JMenuItem jmiExit;
    private javax.swing.JMenuItem jmiJsonAutori;
    private javax.swing.JMenuItem jmiJsonPenjaci;
    private javax.swing.JMenuItem jmiJsonPenjalista;
    private javax.swing.JMenuItem jmiJsonSektori;
    private javax.swing.JMenuItem jmiJsonSmjerovi;
    private javax.swing.JMenuItem jmiOAplikaciji;
    private javax.swing.JMenu jmnAutori;
    private javax.swing.JLabel lblSlika;
    private javax.swing.JLabel lblVrijeme;
    private javax.swing.JMenu menExport;
    private javax.swing.JMenu menFile;
    private javax.swing.JMenu menHelp;
    private javax.swing.JPanel pnlIzbornik;
    // End of variables declaration//GEN-END:variables

    private void minimizeToSysTray() {
        
        if (SystemTray.isSupported()) {
            SystemTray tray = SystemTray.getSystemTray();
            
            icon.setImageAutoSize(true);
            icon.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    setVisible(true);
                    setExtendedState(JFrame.NORMAL);
                    
                }
            });
            
            try {
                tray.add(icon);
            } catch (AWTException e) {
                System.err.println("Nije moguće dodati ikonu.");
            }
        }
    }
    
    private void promjenaIzgleda() {
        
        getContentPane().setBackground(Color.decode("#082F4E"));
        pnlIzbornik.setBackground(Color.decode("#082F4E"));
        try {
            setIconImage(ImageIO.read(new File("Slike/climbingIcon.png")));
        } catch (IOException exc) {
            exc.printStackTrace();
        }
    }
    
    private void spremiJSON(List<Entitet> lista) {
        Gson gson = new GsonBuilder()
                .setExclusionStrategies(new IzbjegniPovratno())
                //                .setExclusionStrategies(new IzbjegniPovratnoPenjalista())
                .setDateFormat("yyyy-MM-dd'T'HH:mm:ssZ")
                .create();
        
        String json = gson.toJson(lista);
        
        String naziv = "podaci";
        if (lista.size() > 0) {
            Entitet e = lista.get(0);
            naziv = e.getClass().getSimpleName().toLowerCase();
            spremiTekst(json, "JSON DATOTEKA", "json", naziv, false);
        }
        
    }
    
    private void spremiTekst(String s, String nazivEkstenzije, String ekstenzija, String nazivDatoteke, boolean otvoriNakonSpremanja) {
        JFileChooser spremiKao = new JFileChooser();
        spremiKao.setSelectedFile(new File(System.getProperty("user.home") + File.separator + nazivDatoteke));
        spremiKao.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filter = new FileNameExtensionFilter(nazivEkstenzije, ekstenzija);
        
        spremiKao.setFileFilter(filter);
        if (spremiKao.showSaveDialog(getParent()) == JFileChooser.APPROVE_OPTION) {
            String putanja = spremiKao.getSelectedFile().getAbsolutePath();
            if (!putanja.endsWith("." + ekstenzija)) {
                putanja += "." + ekstenzija;
            }
            File dat = new File(putanja);
            if (!(!dat.exists()
                    || JOptionPane.showConfirmDialog(getRootPane(), "Datoteka postoji, zamijeniti?", "Datoteka postoji", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION)) {
                return;
            }
            try {
                FileWriter fw = new FileWriter(putanja);
                fw.write(s);
                fw.close();
                if (otvoriNakonSpremanja) {
                    Desktop d = Desktop.getDesktop();
                    d.open(dat);
                }
                
            } catch (IOException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(getRootPane(), "Problem kod spremanja datoteke.");
            }
            
        }
    }
    
    private void definirajTimer() {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                
                long diffInSeconds = (new Date().getTime() - pocetakRada.getTime()) / 1000;
                
                long diff[] = new long[]{0, 0, 0, 0};
                /* sec */
                diff[3] = (diffInSeconds >= 60 ? diffInSeconds % 60 : diffInSeconds);
                /* min */
                diff[2] = (diffInSeconds = (diffInSeconds / 60)) >= 60 ? diffInSeconds % 60 : diffInSeconds;
                /* hours */
                diff[1] = (diffInSeconds = (diffInSeconds / 60)) >= 24 ? diffInSeconds % 24 : diffInSeconds;
                /* days */
                diff[0] = (diffInSeconds = (diffInSeconds / 24));
                
                lblVrijeme.setText(String.format(
                        "%s%d:%s%d:%s%d",
                        diff[1] < 10 ? "0" : "",
                        diff[1],
                        diff[2] < 10 ? "0" : "",
                        diff[2],
                        diff[3] < 10 ? "0" : "",
                        diff[3]));
            }
        }, 0, 1000);
    }
    
    private void spremiExcel(String nazivDatoteke, HSSFWorkbook wb, boolean otvoriNakonSpremanja) {
        JFileChooser spremiKao = new JFileChooser();
        spremiKao.setSelectedFile(new File(System.getProperty("user.home") + File.separator + nazivDatoteke));
        spremiKao.setCurrentDirectory(new File(System.getProperty("user.home")));
        spremiKao.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        if (spremiKao.showSaveDialog(getParent()) == JFileChooser.APPROVE_OPTION) {
            FileOutputStream fileOut = null;
            try {
                String putanja = spremiKao.getSelectedFile().getAbsolutePath();
                File dat = new File(spremiKao.getSelectedFile() + File.separator + nazivDatoteke);
                fileOut = new FileOutputStream(dat);
                wb.write(fileOut);
                if (otvoriNakonSpremanja) {
                    Desktop d = Desktop.getDesktop();
                    d.open(dat);
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Izbornik.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Izbornik.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    fileOut.close();
                } catch (IOException ex) {
                    Logger.getLogger(Izbornik.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
        }
    }
    
    private class IzbjegniPovratno implements ExclusionStrategy {
        
        public boolean shouldSkipClass(Class<?> arg0) {
            return false;
        }
        
        public boolean shouldSkipField(FieldAttributes f) {
            
            return (f.getDeclaringClass() == Smjer.class && f.getName().equals("sektor")
                    || f.getDeclaringClass() == Sektor.class && f.getName().equals("penjaliste")
                    || f.getDeclaringClass() == Smjer.class && f.getName().equals("autor")
                    || f.getDeclaringClass() == Smjer.class && f.getName().equals("penjac")
                    || f.getDeclaringClass() == Penjac.class && f.getName().equals("smjer"));
        }
        
    }
//       private class IzbjegniPovratnoPenjalista implements ExclusionStrategy {
//
//        public boolean shouldSkipClass(Class<?> arg0) {
//            return false;
//        }
//
//        public boolean shouldSkipField(FieldAttributes f) {
//
//            return (f.getDeclaringClass() == Sektor.class && f.getName().equals("penjaliste")
//                    );
//        }
//
//    }
}
