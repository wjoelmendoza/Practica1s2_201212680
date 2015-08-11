/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gui;

import estructura.ListaDoble;
import estructura.Matriz;
import estructura.Objeto;
import java.awt.datatransfer.DataFlavor;


/**
 *
 * @author walter
 */
public class CreacionTablero extends javax.swing.JFrame {
    DataFlavor dataFlavor = new DataFlavor(Objeto.class, Objeto.class.getSimpleName());
    //destino
    PanelTablero ptb;
    //origen
    PanelView pv;
    LabelObjeto lblo;
    ListaDoble ld;
    Matriz m;

    /** Creates new form CreacionTablero
     * @param ld */
    public CreacionTablero(ListaDoble ld) {
        initComponents();
        this.setTitle("Crear Mundo");
        this.ld = ld;
        m = new Matriz(this.ld);
        lblo = new LabelObjeto(this.ld);
        lblo.setBounds(0, 0, 50, 50);
        //DragSource ds = new DragSource();
        pv = new PanelView(this.ld);
        pv.setLayout(null);
        pv.add(lblo);
        ptb = new PanelTablero(this.ld,m,lblo);
        this.add(ptb);
        this.lypSig.add(pv);
       
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGraficar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnDatos = new javax.swing.JButton();
        lypSig = new javax.swing.JLayeredPane();
        lbltPreview = new javax.swing.JLabel();
        btnAddColumna = new javax.swing.JButton();
        btnAddFila = new javax.swing.JButton();
        btnDrcha = new javax.swing.JButton();
        btnIzda = new javax.swing.JButton();
        btnBajar = new javax.swing.JButton();
        btnSubir = new javax.swing.JButton();
        btnJugar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnGraficar.setText("Graficar");
        btnGraficar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGraficarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnDatos.setText("Datos");
        btnDatos.setMaximumSize(new java.awt.Dimension(90, 25));
        btnDatos.setMinimumSize(new java.awt.Dimension(90, 25));
        btnDatos.setPreferredSize(new java.awt.Dimension(90, 25));
        btnDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDatosActionPerformed(evt);
            }
        });

        lypSig.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lbltPreview.setText("Siguiente:");

        javax.swing.GroupLayout lypSigLayout = new javax.swing.GroupLayout(lypSig);
        lypSig.setLayout(lypSigLayout);
        lypSigLayout.setHorizontalGroup(
            lypSigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lypSigLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbltPreview)
                .addGap(99, 99, 99))
        );
        lypSigLayout.setVerticalGroup(
            lypSigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lypSigLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(lbltPreview)
                .addGap(43, 43, 43))
        );
        lypSig.setLayer(lbltPreview, javax.swing.JLayeredPane.DEFAULT_LAYER);

        btnAddColumna.setText("+Columna");
        btnAddColumna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddColumnaActionPerformed(evt);
            }
        });

        btnAddFila.setText("+Fila");
        btnAddFila.setMaximumSize(new java.awt.Dimension(105, 25));
        btnAddFila.setMinimumSize(new java.awt.Dimension(105, 25));
        btnAddFila.setPreferredSize(new java.awt.Dimension(105, 25));
        btnAddFila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddFilaActionPerformed(evt);
            }
        });

        btnDrcha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/ic_action_next_item.png"))); // NOI18N
        btnDrcha.setPreferredSize(new java.awt.Dimension(50, 25));
        btnDrcha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDrchaActionPerformed(evt);
            }
        });

        btnIzda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/ic_action_previous_item.png"))); // NOI18N
        btnIzda.setMaximumSize(new java.awt.Dimension(44, 25));
        btnIzda.setMinimumSize(new java.awt.Dimension(44, 25));
        btnIzda.setPreferredSize(new java.awt.Dimension(50, 25));
        btnIzda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIzdaActionPerformed(evt);
            }
        });

        btnBajar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/ic_action_expand.png"))); // NOI18N
        btnBajar.setMaximumSize(new java.awt.Dimension(44, 25));
        btnBajar.setMinimumSize(new java.awt.Dimension(25, 50));
        btnBajar.setPreferredSize(new java.awt.Dimension(44, 25));
        btnBajar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBajarActionPerformed(evt);
            }
        });

        btnSubir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/ic_action_collapse.png"))); // NOI18N
        btnSubir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubirActionPerformed(evt);
            }
        });

        btnJugar.setText("Jugar");
        btnJugar.setMaximumSize(new java.awt.Dimension(90, 25));
        btnJugar.setMinimumSize(new java.awt.Dimension(90, 25));
        btnJugar.setPreferredSize(new java.awt.Dimension(90, 25));
        btnJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJugarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnIzda, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 586, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnDrcha, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnAddFila, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnBajar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnSubir, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lypSig, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnAddColumna))
                                .addGap(120, 120, 120))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnGraficar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar)
                        .addGap(18, 18, 18)
                        .addComponent(btnDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnJugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar)
                    .addComponent(btnGraficar)
                    .addComponent(btnJugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(btnAddFila, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSubir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(494, 494, 494)
                        .addComponent(btnBajar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(39, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnDrcha, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnIzda, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lypSig, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAddColumna)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGraficarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGraficarActionPerformed
        // TODO add your handling code here:
        ld.grafica();
        m.graficar();
    }//GEN-LAST:event_btnGraficarActionPerformed

    private void btnAddColumnaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddColumnaActionPerformed
        // TODO add your handling code here:
        m.agregarColumna();
        ptb.adjMatriz();
        ptb.repaint();
    }//GEN-LAST:event_btnAddColumnaActionPerformed

    private void btnAddFilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddFilaActionPerformed
        // TODO add your handling code here:
        m.agregarFila();
        ptb.adjMatriz();
        ptb.repaint();
    }//GEN-LAST:event_btnAddFilaActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        Eliminar el = new Eliminar(this,true,m);
        el.setVisible(true);
        ptb.repaint();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDatosActionPerformed
        // TODO add your handling code here:
        ReporteDatos rd = new ReporteDatos(this,true,ld);
        rd.setVisible(true);
    }//GEN-LAST:event_btnDatosActionPerformed

    private void btnDrchaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDrchaActionPerformed
          ptb.moverXder();
    }//GEN-LAST:event_btnDrchaActionPerformed

    private void btnIzdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzdaActionPerformed
        // TODO add your handling code here:
        ptb.moverXIzq();
    }//GEN-LAST:event_btnIzdaActionPerformed

    private void btnSubirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubirActionPerformed
        // TODO add your handling code here:
        ptb.moverYArriba();
    }//GEN-LAST:event_btnSubirActionPerformed

    private void btnBajarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBajarActionPerformed
        // TODO add your handling code here:
        ptb.moverYAbajo();
    }//GEN-LAST:event_btnBajarActionPerformed

    private void btnJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugarActionPerformed
        // TODO add your handling code here:
        m.asignarPosiciones();
        TBJuego tbj = new TBJuego(this.m);
        tbj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnJugarActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddColumna;
    private javax.swing.JButton btnAddFila;
    private javax.swing.JButton btnBajar;
    private javax.swing.JButton btnDatos;
    private javax.swing.JButton btnDrcha;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGraficar;
    private javax.swing.JButton btnIzda;
    private javax.swing.JButton btnJugar;
    private javax.swing.JButton btnSubir;
    private javax.swing.JLabel lbltPreview;
    private javax.swing.JLayeredPane lypSig;
    // End of variables declaration//GEN-END:variables


}
