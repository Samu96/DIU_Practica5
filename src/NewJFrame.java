import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

public class NewJFrame extends javax.swing.JFrame {

    public NewJFrame() {
        initComponents();
        umbralMenuItem.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelImagen1 = new PanelImagen();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuFile = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        menuEdit = new javax.swing.JMenu();
        umbralMenuItem = new javax.swing.JMenuItem();
        menuHelp = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mega Umbralizador Max 5.1.2.985.325");

        panelImagen1.setEnabled(false);

        javax.swing.GroupLayout panelImagen1Layout = new javax.swing.GroupLayout(panelImagen1);
        panelImagen1.setLayout(panelImagen1Layout);
        panelImagen1Layout.setHorizontalGroup(
            panelImagen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 694, Short.MAX_VALUE)
        );
        panelImagen1Layout.setVerticalGroup(
            panelImagen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 481, Short.MAX_VALUE)
        );

        menuFile.setText("Archivos");

        openMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        openMenuItem.setText("Abrir");
        openMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMenuItemActionPerformed(evt);
            }
        });
        menuFile.add(openMenuItem);

        saveMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        saveMenuItem.setText("Guardar");
        saveMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveMenuItemActionPerformed(evt);
            }
        });
        menuFile.add(saveMenuItem);

        exitMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        exitMenuItem.setText("Salir");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        menuFile.add(exitMenuItem);

        jMenuBar1.add(menuFile);

        menuEdit.setText("Editar");

        umbralMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        umbralMenuItem.setText("Umbralizar");
        umbralMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                umbralMenuItemActionPerformed(evt);
            }
        });
        menuEdit.add(umbralMenuItem);

        jMenuBar1.add(menuEdit);

        menuHelp.setText("Ayuda");

        jMenuItem1.setText("Acerca de...");
        menuHelp.add(jMenuItem1);

        jMenuBar1.add(menuHelp);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelImagen1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelImagen1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        int res =JOptionPane.showConfirmDialog(rootPane, "¿Seguro que quieres?", "MEIDEI", JOptionPane.YES_NO_OPTION);
        if(res==JOptionPane.YES_OPTION){
            this.dispose();
        }
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void openMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMenuItemActionPerformed
        JFileChooser fc = new JFileChooser(".");
        FileFilter f = new FileNameExtensionFilter("JPG: .jpg,.jpeg,.jpe", "jpg","jpeg","jpe","JPG","JPEG","JPE");
        fc.addChoosableFileFilter(f);
        f = new FileNameExtensionFilter("PNG: .png", "png","PNG");
        fc.addChoosableFileFilter(f);
        f = new FileNameExtensionFilter("BMP: .bmp", "bmp", "BMP");
        fc.addChoosableFileFilter(f);
        f = new FileNameExtensionFilter("TIFF: .tif, .tiff", "tif","tiff", "TIF","TIFF");
        fc.addChoosableFileFilter(f);
        fc.setAcceptAllFileFilterUsed(false);
        int res =fc.showOpenDialog(null);
        
        if (res == JFileChooser.APPROVE_OPTION) {
            ruta = fc.getSelectedFile();
            try{
                panelImagen1.setI(ImageIO.read(ruta));
            }catch(IOException e){
                System.out.println("FALLO");
            }
            panelImagen1.paintComponent(panelImagen1.getGraphics());
            umbralMenuItem.setEnabled(true);
        }
    }//GEN-LAST:event_openMenuItemActionPerformed

    private void saveMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveMenuItemActionPerformed
        JFileChooser fc = new JFileChooser(".");
        FileFilter f = new FileNameExtensionFilter("JPG: .jpg,.jpeg,.jpe", ".jpg",".jpeg",".jpe");
        fc.addChoosableFileFilter(f);
        int res =fc.showSaveDialog(null);
        if (res == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
            
        }
    }//GEN-LAST:event_saveMenuItemActionPerformed

    private void umbralMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_umbralMenuItemActionPerformed
        int i = Integer.parseInt((String) JOptionPane.showInputDialog(rootPane, "Umbral:",
                "Meter tamaño de umbral",JOptionPane.PLAIN_MESSAGE ,null, null, "0"));
        repaint();
        panelImagen1.setI(panelImagen1.umbralizar(panelImagen1.getI(), 1));
        panelImagen1.paintComponent(panelImagen1.getGraphics());
    }//GEN-LAST:event_umbralMenuItemActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    
    
    private File ruta;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu menuEdit;
    private javax.swing.JMenu menuFile;
    private javax.swing.JMenu menuHelp;
    private javax.swing.JMenuItem openMenuItem;
    private PanelImagen panelImagen1;
    private javax.swing.JMenuItem saveMenuItem;
    private javax.swing.JMenuItem umbralMenuItem;
    // End of variables declaration//GEN-END:variables
}
