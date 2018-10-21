/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penjalistaapp.view;

import java.awt.Color;
import java.awt.Component;
import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import javax.imageio.ImageIO;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import penjalistaapp.controller.ObradaPenjac;
import penjalistaapp.controller.ObradaSmjer;
import penjalistaapp.model.Penjac;
import penjalistaapp.model.Smjer;
import penjalistaapp.pomocno.HibernateUtil;
import penjalistaapp.pomocno.MojException;

/**
 *
 * @author Josip
 */
public class Penjaci extends javax.swing.JFrame {

    private ObradaPenjac o;
    private Penjac penjac;
    final private DecimalFormat df;
    private List<Smjer> smjeroviUBazi;

    public Penjaci() {
        initComponents();
        promjenaIzgleda();

        o = new ObradaPenjac();
        ucitajSmjerove();
        ucitajIzBaze();
        NumberFormat nf = NumberFormat.getNumberInstance(new Locale("hr", "HR"));
        df = (DecimalFormat) nf;
        df.applyPattern("###,##0.00");

        lstSmjeroviPenjac.setModel(new DefaultListModel<>());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lstPenjaci = new javax.swing.JList<>();
        pnlPodaci = new javax.swing.JPanel();
        txtIme = new javax.swing.JTextField();
        lblPrezime = new javax.swing.JLabel();
        txtPrezime = new javax.swing.JTextField();
        btnDodaj = new javax.swing.JButton();
        btnPromjena = new javax.swing.JButton();
        btnObrisi = new javax.swing.JButton();
        prbBrisanje = new javax.swing.JProgressBar();
        lblIme = new javax.swing.JLabel();
        lblSmjerovi = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstSmjeroviUBazi = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstSmjeroviPenjac = new javax.swing.JList<>();
        btnPlus = new javax.swing.JButton();
        btnMinus = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Penjači");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lstPenjaci.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstPenjaciValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstPenjaci);

        lblPrezime.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        lblPrezime.setForeground(new java.awt.Color(255, 255, 255));
        lblPrezime.setText("Prezime");

        btnDodaj.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        btnDodaj.setText("Dodaj");
        btnDodaj.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDodajMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDodajMouseExited(evt);
            }
        });
        btnDodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajActionPerformed(evt);
            }
        });

        btnPromjena.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        btnPromjena.setText("Promjena");
        btnPromjena.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPromjenaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPromjenaMouseExited(evt);
            }
        });
        btnPromjena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPromjenaActionPerformed(evt);
            }
        });

        btnObrisi.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        btnObrisi.setText("Obriši");
        btnObrisi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnObrisiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnObrisiMouseExited(evt);
            }
        });
        btnObrisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObrisiActionPerformed(evt);
            }
        });

        lblIme.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        lblIme.setForeground(new java.awt.Color(255, 255, 255));
        lblIme.setText("Ime");

        lblSmjerovi.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        lblSmjerovi.setForeground(new java.awt.Color(255, 255, 255));
        lblSmjerovi.setText("Smjerovi");

        lstSmjeroviUBazi.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(lstSmjeroviUBazi);

        jScrollPane3.setViewportView(lstSmjeroviPenjac);

        btnPlus.setText("+");
        btnPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlusActionPerformed(evt);
            }
        });

        btnMinus.setText("-");
        btnMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlPodaciLayout = new javax.swing.GroupLayout(pnlPodaci);
        pnlPodaci.setLayout(pnlPodaciLayout);
        pnlPodaciLayout.setHorizontalGroup(
            pnlPodaciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPodaciLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPodaciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPodaciLayout.createSequentialGroup()
                        .addComponent(lblIme)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblSmjerovi)
                        .addGap(154, 154, 154))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPodaciLayout.createSequentialGroup()
                        .addGroup(pnlPodaciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(prbBrisanje, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(pnlPodaciLayout.createSequentialGroup()
                                .addComponent(btnDodaj, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnPromjena, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnObrisi, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                                .addGroup(pnlPodaciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pnlPodaciLayout.createSequentialGroup()
                                .addGroup(pnlPodaciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPrezime)
                                    .addComponent(txtIme, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPrezime, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(pnlPodaciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(68, 68, 68))))
        );
        pnlPodaciLayout.setVerticalGroup(
            pnlPodaciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPodaciLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(pnlPodaciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIme)
                    .addComponent(lblSmjerovi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlPodaciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPodaciLayout.createSequentialGroup()
                        .addComponent(txtIme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPrezime)
                        .addGap(18, 18, 18)
                        .addComponent(txtPrezime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlPodaciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPlus)
                    .addComponent(btnMinus))
                .addGroup(pnlPodaciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPodaciLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(pnlPodaciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDodaj)
                            .addComponent(btnPromjena)
                            .addComponent(btnObrisi)))
                    .addGroup(pnlPodaciLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(prbBrisanje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Penjači");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(pnlPodaci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnlPodaci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lstPenjaciValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstPenjaciValueChanged
        if (evt.getValueIsAdjusting()) {
            return;
        }

        Penjac p = lstPenjaci.getSelectedValue();
        if (p == null) {
            return;
        }
        ocistiPolja();

        txtIme.setText(p.getIme());
        txtPrezime.setText(p.getPrezime());

        if (p.getSmjerovi() != null) {

            DefaultListModel<Smjer> m2 = new DefaultListModel<>();
            p.getSmjerovi().forEach((s) -> {
                // System.out.println( s + " - " + s.hashCode());
                m2.addElement(s);
            });
            lstSmjeroviPenjac.setModel(m2);
        }


    }//GEN-LAST:event_lstPenjaciValueChanged

    private void btnDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajActionPerformed
        penjac = new Penjac();

        if (!popuniSvojstva()) {
            return;
        }
        try {
            o.dodaj(penjac);
            ucitajIzBaze();
        } catch (MojException ex) {
            JOptionPane.showMessageDialog(getRootPane(), ex.getPoruka());
        }

    }//GEN-LAST:event_btnDodajActionPerformed

    private void btnPromjenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromjenaActionPerformed

        penjac = lstPenjaci.getSelectedValue();

        if (penjac == null) {
            JOptionPane.showMessageDialog(getRootPane(), "Prvo odaberi penjača.");
            return;
        }
        if (!popuniSvojstva()) {
            return;
        }

        try {
            o.promjena(penjac);
            ucitajIzBaze();
        } catch (MojException ex) {
            JOptionPane.showMessageDialog(getRootPane(), ex.getPoruka());
        }

    }//GEN-LAST:event_btnPromjenaActionPerformed

    private void btnObrisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObrisiActionPerformed
        //penjac = lstPenjaci.getSelectedValue();
        if (lstPenjaci.getSelectedValuesList().size() == 0) {
            JOptionPane.showMessageDialog(getRootPane(), "Prvo odaberi penjača.");
            return;
        }
        if (lstPenjaci.getSelectedValuesList().size() == 1) {
            try {
                o.obrisi(lstPenjaci.getSelectedValuesList().get(0));
            } catch (Exception ex) {
                HibernateUtil.getSession().clear();
                JOptionPane.showMessageDialog(getRootPane(), "Penjača "
                        + lstPenjaci.getSelectedValuesList().get(0)
                        + " ne mogu obrisati.");
            }
            ucitajIzBaze();
        } else {
            new BrisanjePenjaca().start();
        }
        ocistiPolja();


    }//GEN-LAST:event_btnObrisiActionPerformed

    private void btnDodajMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDodajMouseEntered
        btnDodaj.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btnDodajMouseEntered

    private void btnDodajMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDodajMouseExited
        btnDodaj.setBackground(new JButton().getBackground());
    }//GEN-LAST:event_btnDodajMouseExited

    private void btnPromjenaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPromjenaMouseEntered
        btnPromjena.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btnPromjenaMouseEntered

    private void btnPromjenaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPromjenaMouseExited
        btnPromjena.setBackground(new JButton().getBackground());
    }//GEN-LAST:event_btnPromjenaMouseExited

    private void btnObrisiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnObrisiMouseEntered
        btnObrisi.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btnObrisiMouseEntered

    private void btnObrisiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnObrisiMouseExited
        btnObrisi.setBackground(new JButton().getBackground());
    }//GEN-LAST:event_btnObrisiMouseExited

    private void btnPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlusActionPerformed
        if (lstSmjeroviUBazi.getSelectedValue() == null) {
            return;
        }
        Smjer s = lstSmjeroviUBazi.getSelectedValue();
        if (!((DefaultListModel<Smjer>) lstSmjeroviPenjac.getModel()).contains(s)) {
            ((DefaultListModel<Smjer>) lstSmjeroviPenjac.getModel()).addElement(s);
            lstSmjeroviPenjac.repaint();
            lstSmjeroviPenjac.revalidate();
        }
    }//GEN-LAST:event_btnPlusActionPerformed

    private void btnMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinusActionPerformed
        if (lstSmjeroviPenjac.getSelectedValue() == null) {
            return;
        }

        DefaultListModel<Smjer> m2 = (DefaultListModel<Smjer>) lstSmjeroviPenjac.getModel();

        m2.removeElement(lstSmjeroviPenjac.getSelectedValue());

        lstSmjeroviPenjac.repaint();
        lstSmjeroviPenjac.revalidate();
    }//GEN-LAST:event_btnMinusActionPerformed

    /**
     * @param args the command line arguments
     */
    private void ocistiPolja() {

        for (Component c : pnlPodaci.getComponents()) {

            if (c instanceof JTextField) {
                ((JTextField) c).setText("");
            }

        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodaj;
    private javax.swing.JButton btnMinus;
    private javax.swing.JButton btnObrisi;
    private javax.swing.JButton btnPlus;
    private javax.swing.JButton btnPromjena;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblIme;
    private javax.swing.JLabel lblPrezime;
    private javax.swing.JLabel lblSmjerovi;
    private javax.swing.JList<Penjac> lstPenjaci;
    private javax.swing.JList<Smjer> lstSmjeroviPenjac;
    private javax.swing.JList<Smjer> lstSmjeroviUBazi;
    private javax.swing.JPanel pnlPodaci;
    private javax.swing.JProgressBar prbBrisanje;
    private javax.swing.JTextField txtIme;
    private javax.swing.JTextField txtPrezime;
    // End of variables declaration//GEN-END:variables
private void ucitajIzBaze() {
        DefaultListModel<Penjac> m = new DefaultListModel<>();
        o.getEntiteti().forEach((s) -> {
            m.addElement(s);
        });
        lstPenjaci.setModel(m);

    }

    private boolean popuniSvojstva() {
        try {
            penjac.setIme(txtIme.getText());
            penjac.setPrezime(txtPrezime.getText());

            List<Smjer> smjerovi = new ArrayList<>();
            DefaultListModel<Smjer> m = (DefaultListModel<Smjer>) lstSmjeroviPenjac.getModel();
            for (int i = 0; i < m.getSize(); i++) {
                smjerovi.add(m.getElementAt(i));
            }
            penjac.setSmjerovi(smjerovi);
        } catch (StringIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(getRootPane(), "Nisu upisani svi potrebni podaci");
            return false;
        }

        return true;
    }

    private void promjenaIzgleda() {
        getContentPane().setBackground(Color.decode("#082F4E"));
        pnlPodaci.setBackground(Color.decode("#082F4E"));
        try {
            setIconImage(ImageIO.read(new File("Slike/climbingIcon.png")));
        } catch (IOException exc) {
            exc.printStackTrace();
        }
    }

    private class BrisanjePenjaca extends Thread {

        public void run() {
            prbBrisanje.setMinimum(0);
            prbBrisanje.setMaximum(lstPenjaci.getSelectedValuesList().size());
            int i = 0;

            for (Penjac e : lstPenjaci.getSelectedValuesList()) {
                prbBrisanje.setValue(++i);
                try {
                    o.obrisi(e);
                } catch (Exception ex) {
                    HibernateUtil.getSession().clear();

                }
            }
            ucitajIzBaze();
            prbBrisanje.setValue(0);
        }
    }

    public void ucitajSmjerove() {
        ObradaSmjer opo = new ObradaSmjer();
        DefaultListModel<Smjer> m2 = new DefaultListModel<>();
        smjeroviUBazi = opo.getEntiteti();
        smjeroviUBazi.forEach((s) -> {

            m2.addElement(s);
        });
        lstSmjeroviUBazi.setModel(m2);

    }

}
