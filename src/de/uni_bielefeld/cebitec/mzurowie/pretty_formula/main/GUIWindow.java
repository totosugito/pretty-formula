/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package de.uni_bielefeld.cebitec.mzurowie.pretty_formula.main;

import java.awt.Color;
import java.awt.image.BufferedImage;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter.DefaultHighlightPainter;

/**
 *
 * @author martin
 */
public class GUIWindow extends javax.swing.JFrame {
   
   private final DefaultHighlightPainter errorHighlighter;

   /**
    * Creates new form GUIWindow
    */
   public GUIWindow() {
      initComponents();
      this.errorHighlighter = new DefaultHighlightPainter(Color.red);
   }

   /**
    * This method is called from within the constructor to initialize the form.
    * WARNING: Do NOT modify this code. The content of this method is always
    * regenerated by the Form Editor.
    */
   @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      jLabel1 = new javax.swing.JLabel();
      jLabel2 = new javax.swing.JLabel();
      jScrollPane1 = new javax.swing.JScrollPane();
      jTextPane1 = new javax.swing.JTextPane();

      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

      jLabel1.setForeground(new java.awt.Color(176, 1, 1));

      jLabel2.setBorder(null);

      jTextPane1.addKeyListener(new java.awt.event.KeyAdapter() {
         public void keyReleased(java.awt.event.KeyEvent evt) {
            jTextPane1KeyReleased(evt);
         }
         public void keyTyped(java.awt.event.KeyEvent evt) {
            jTextPane1KeyTyped(evt);
         }
      });
      jScrollPane1.setViewportView(jTextPane1);

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
               .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE))
            .addContainerGap())
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(7, 7, 7)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap())
      );

      pack();
   }// </editor-fold>//GEN-END:initComponents

   private void jTextPane1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextPane1KeyTyped
      // disallow multiple lines
      String formula = this.jTextPane1.getText();
      if (formula.contains("\n")) {
         this.jTextPane1.setText(formula.replace("\n", ""));
      }
   }//GEN-LAST:event_jTextPane1KeyTyped

   private void jTextPane1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextPane1KeyReleased
      this.jLabel1.setText("");
      
      this.jLabel2.getGraphics().clearRect(0, 0, this.jLabel2.getWidth(), this.jLabel2.getHeight());
      this.jTextPane1.getHighlighter().removeAllHighlights();

      try {
         BufferedImage image = FormulaParser.parseToImage(this.jTextPane1.getText());
         this.jLabel2.getGraphics().drawImage(image, 0, 0, null);
         
      } catch (DetailedParseCancellationException e) {
        
         try {
            // highlight the position at which the error occurred
            this.jTextPane1.getHighlighter().addHighlight(e.getCharPositionInLine(), e.getEndCharPositionInLine(), this.errorHighlighter);
         } catch (BadLocationException ex) {
            // simply don't highlight
         }
         
         this.jLabel1.setText(e.getMessage());
      }
   }//GEN-LAST:event_jTextPane1KeyReleased

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JLabel jLabel1;
   private javax.swing.JLabel jLabel2;
   private javax.swing.JScrollPane jScrollPane1;
   private javax.swing.JTextPane jTextPane1;
   // End of variables declaration//GEN-END:variables
}