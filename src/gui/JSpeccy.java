/*
 * JSpeccy.java
 *
 * Created on 21 de enero de 2008, 14:27
 */

package gui;

import java.awt.BorderLayout;
import java.io.File;
import java.util.ResourceBundle;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import machine.Spectrum;

/**
 *
 * @author  jsanchez
 */
public class JSpeccy extends javax.swing.JFrame {
    Spectrum spectrum;
    JSpeccyScreen jscr;
    File currentDirSnapshot, currentDirTape;
    JFileChooser jFileSnapshot, jFileTape;
    JFrame keyboard;
    /** Creates new form JSpeccy */
    public JSpeccy() {
        initComponents();
        spectrum = new Spectrum();
        jscr = new JSpeccyScreen();
        spectrum.setScreenComponent(jscr);
        spectrum.setSpeedLabel(speedLabel);
        spectrum.tape.setTapeIcon(tapeLabel);
        jscr.setScreenImage(spectrum.getTvImage());
        getContentPane().add(jscr,BorderLayout.CENTER);
        pack();
        addKeyListener(spectrum);
        spectrum.startEmulation();
        keyboard = null;
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tapeLabel = new javax.swing.JLabel();
        speedLabel = new javax.swing.JLabel();
        toolbarMenu = new javax.swing.JToolBar();
        openSnapshotButton = new javax.swing.JButton();
        pauseToggleButton = new javax.swing.JToggleButton();
        doubleSizeToggleButton = new javax.swing.JToggleButton();
        silenceSoundToggleButton = new javax.swing.JToggleButton();
        resetSpectrumButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        fileOpenSnapshot = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JSeparator();
        thisIsTheEndMyFriend = new javax.swing.JMenuItem();
        optionsMenu = new javax.swing.JMenu();
        doubleSizeOption = new javax.swing.JCheckBoxMenuItem();
        machineMenu = new javax.swing.JMenu();
        pauseMachineMenu = new javax.swing.JCheckBoxMenuItem();
        silenceMachineMenu = new javax.swing.JCheckBoxMenuItem();
        resetMachineMenu = new javax.swing.JMenuItem();
        mediaMenu = new javax.swing.JMenu();
        tapeMediaMenu = new javax.swing.JMenu();
        openTapeMediaMenu = new javax.swing.JMenuItem();
        playTapeMediaMenu = new javax.swing.JMenuItem();
        rewindTapeMediaMenu = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        imageHelpMenu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("gui/Bundle"); // NOI18N
        setTitle(bundle.getString("JSpeccy.title")); // NOI18N
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logo.png"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(jLabel2);

        tapeLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Akai24x24.png"))); // NOI18N
        tapeLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tapeLabel.setEnabled(false);
        jPanel1.add(tapeLabel);

        speedLabel.setText(bundle.getString("JSpeccy.speedLabel.text")); // NOI18N
        speedLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(speedLabel);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_END);

        toolbarMenu.setRollover(true);

        openSnapshotButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/fileopen.png"))); // NOI18N
        openSnapshotButton.setToolTipText(bundle.getString("JSpeccy.openSnapshotButton.toolTipText")); // NOI18N
        openSnapshotButton.setFocusable(false);
        openSnapshotButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        openSnapshotButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        openSnapshotButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileOpenSnapshotActionPerformed(evt);
            }
        });
        toolbarMenu.add(openSnapshotButton);

        pauseToggleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/player_pause.png"))); // NOI18N
        pauseToggleButton.setToolTipText(bundle.getString("JSpeccy.pauseToggleButton.toolTipText")); // NOI18N
        pauseToggleButton.setFocusable(false);
        pauseToggleButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pauseToggleButton.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/player_play.png"))); // NOI18N
        pauseToggleButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        pauseToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pauseMachineMenuActionPerformed(evt);
            }
        });
        toolbarMenu.add(pauseToggleButton);

        doubleSizeToggleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/viewmag+.png"))); // NOI18N
        doubleSizeToggleButton.setToolTipText(bundle.getString("JSpeccy.doubleSizeToggleButton.toolTipText")); // NOI18N
        doubleSizeToggleButton.setFocusable(false);
        doubleSizeToggleButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        doubleSizeToggleButton.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/viewmag-.png"))); // NOI18N
        doubleSizeToggleButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        doubleSizeToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doubleSizeOptionActionPerformed(evt);
            }
        });
        toolbarMenu.add(doubleSizeToggleButton);

        silenceSoundToggleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/sound-on-16x16.png"))); // NOI18N
        silenceSoundToggleButton.setToolTipText(bundle.getString("JSpeccy.silenceSoundToggleButton.toolTipText")); // NOI18N
        silenceSoundToggleButton.setFocusable(false);
        silenceSoundToggleButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        silenceSoundToggleButton.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/sound-off-16x16.png"))); // NOI18N
        silenceSoundToggleButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        silenceSoundToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                silenceSoundToggleButtonActionPerformed(evt);
            }
        });
        toolbarMenu.add(silenceSoundToggleButton);

        resetSpectrumButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/shutdown.png"))); // NOI18N
        resetSpectrumButton.setToolTipText(bundle.getString("JSpeccy.resetSpectrumButton.toolTipText")); // NOI18N
        resetSpectrumButton.setFocusable(false);
        resetSpectrumButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        resetSpectrumButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        resetSpectrumButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetMachineMenuActionPerformed(evt);
            }
        });
        toolbarMenu.add(resetSpectrumButton);

        exitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/exit.png"))); // NOI18N
        exitButton.setToolTipText(bundle.getString("JSpeccy.exitButton.toolTipText")); // NOI18N
        exitButton.setFocusable(false);
        exitButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        exitButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thisIsTheEndMyFriendActionPerformed(evt);
            }
        });
        toolbarMenu.add(exitButton);

        getContentPane().add(toolbarMenu, java.awt.BorderLayout.PAGE_START);

        fileMenu.setText(bundle.getString("JSpeccy.fileMenu.text")); // NOI18N

        fileOpenSnapshot.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        fileOpenSnapshot.setText(bundle.getString("JSpeccy.fileOpenSnapshot.text")); // NOI18N
        fileOpenSnapshot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileOpenSnapshotActionPerformed(evt);
            }
        });
        fileMenu.add(fileOpenSnapshot);
        fileMenu.add(jSeparator1);

        thisIsTheEndMyFriend.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.ALT_MASK));
        thisIsTheEndMyFriend.setText(bundle.getString("JSpeccy.thisIsTheEndMyFriend.text")); // NOI18N
        thisIsTheEndMyFriend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thisIsTheEndMyFriendActionPerformed(evt);
            }
        });
        fileMenu.add(thisIsTheEndMyFriend);

        jMenuBar1.add(fileMenu);

        optionsMenu.setText(bundle.getString("JSpeccy.optionsMenu.text")); // NOI18N

        doubleSizeOption.setText(bundle.getString("JSpeccy.doubleSizeOption.text")); // NOI18N
        doubleSizeOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doubleSizeOptionActionPerformed(evt);
            }
        });
        optionsMenu.add(doubleSizeOption);

        jMenuBar1.add(optionsMenu);

        machineMenu.setText(bundle.getString("JSpeccy.machineMenu.text")); // NOI18N
        machineMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                silenceSoundToggleButtonActionPerformed(evt);
            }
        });

        pauseMachineMenu.setText(bundle.getString("JSpeccy.pauseMachineMenu.text")); // NOI18N
        pauseMachineMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pauseMachineMenuActionPerformed(evt);
            }
        });
        machineMenu.add(pauseMachineMenu);

        silenceMachineMenu.setText(bundle.getString("JSpeccy.silenceMachineMenu.text")); // NOI18N
        silenceMachineMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                silenceSoundToggleButtonActionPerformed(evt);
            }
        });
        machineMenu.add(silenceMachineMenu);

        resetMachineMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        resetMachineMenu.setText(bundle.getString("JSpeccy.resetMachineMenu.text")); // NOI18N
        resetMachineMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetMachineMenuActionPerformed(evt);
            }
        });
        machineMenu.add(resetMachineMenu);

        jMenuBar1.add(machineMenu);

        mediaMenu.setText(bundle.getString("JSpeccy.mediaMenu.text")); // NOI18N

        tapeMediaMenu.setText(bundle.getString("JSpeccy.tapeMediaMenu.text")); // NOI18N

        openTapeMediaMenu.setText(bundle.getString("JSpeccy.openTapeMediaMenu.text")); // NOI18N
        openTapeMediaMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openTapeMediaMenuActionPerformed(evt);
            }
        });
        tapeMediaMenu.add(openTapeMediaMenu);

        playTapeMediaMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F8, 0));
        playTapeMediaMenu.setText(bundle.getString("JSpeccy.playTapeMediaMenu.text")); // NOI18N
        playTapeMediaMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playTapeMediaMenuActionPerformed(evt);
            }
        });
        tapeMediaMenu.add(playTapeMediaMenu);

        rewindTapeMediaMenu.setText(bundle.getString("JSpeccy.rewindTapeMediaMenu.text")); // NOI18N
        rewindTapeMediaMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rewindTapeMediaMenuActionPerformed(evt);
            }
        });
        tapeMediaMenu.add(rewindTapeMediaMenu);

        mediaMenu.add(tapeMediaMenu);

        jMenuBar1.add(mediaMenu);

        helpMenu.setText(bundle.getString("JSpeccy.helpMenu.text")); // NOI18N

        imageHelpMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        imageHelpMenu.setText(bundle.getString("JSpeccy.imageHelpMenu.text")); // NOI18N
        imageHelpMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imageHelpMenuActionPerformed(evt);
            }
        });
        helpMenu.add(imageHelpMenu);

        jMenuBar1.add(helpMenu);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fileOpenSnapshotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileOpenSnapshotActionPerformed
        // TODO add your handling code here:
        boolean paused = spectrum.isPaused();
        if( jFileSnapshot == null ) {
            jFileSnapshot = new JFileChooser("/home/jsanchez/src/JSpeccy/dist");
            jFileSnapshot.setFileFilter(new FileFilterSnapshot());
            currentDirSnapshot = jFileSnapshot.getCurrentDirectory();
        }
        else
            jFileSnapshot.setCurrentDirectory(currentDirSnapshot);

        if (!paused)
            spectrum.stopEmulation();

        int status = jFileSnapshot.showOpenDialog(getContentPane());
        if( status == JFileChooser.APPROVE_OPTION ) {
            //spectrum.stopEmulation();
            currentDirSnapshot = jFileSnapshot.getCurrentDirectory();
            spectrum.loadSnapshot(jFileSnapshot.getSelectedFile());
        }
        if (!paused)
            spectrum.startEmulation();
    }//GEN-LAST:event_fileOpenSnapshotActionPerformed

    private void thisIsTheEndMyFriendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thisIsTheEndMyFriendActionPerformed
        // TODO add your handling code here:
        ResourceBundle bundle = ResourceBundle.getBundle("gui/Bundle"); // NOI18N
        int ret = JOptionPane.showConfirmDialog(getContentPane(),
                  bundle.getString("ARE_YOU_SURE_QUESTION"), bundle.getString("QUIT_JSPECCY"),
                  JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE); // NOI18N
        if( ret == JOptionPane.YES_OPTION ) {
            spectrum.stopEmulation();
            System.exit(0);
        }
    }//GEN-LAST:event_thisIsTheEndMyFriendActionPerformed

    private void doubleSizeOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doubleSizeOptionActionPerformed
        // TODO add your handling code here:
        Object source = evt.getSource();
        if( source instanceof javax.swing.JCheckBoxMenuItem )
            doubleSizeToggleButton.setSelected(doubleSizeOption.isSelected());
        else
            doubleSizeOption.setSelected(doubleSizeToggleButton.isSelected());

        jscr.toggleDoubleSize();
        //jscr.invalidateScreen();
        pack();
    }//GEN-LAST:event_doubleSizeOptionActionPerformed

    private void pauseMachineMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pauseMachineMenuActionPerformed
        // TODO add your handling code here:
        Object source = evt.getSource();
        if( source instanceof javax.swing.JCheckBoxMenuItem )
            pauseToggleButton.setSelected(pauseMachineMenu.isSelected());
        else
            pauseMachineMenu.setSelected(pauseToggleButton.isSelected());
        
        if( pauseMachineMenu.isSelected() )
            spectrum.stopEmulation();
        else
            spectrum.startEmulation();
    }//GEN-LAST:event_pauseMachineMenuActionPerformed

    private void resetMachineMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetMachineMenuActionPerformed
        // TODO add your handling code here:
        ResourceBundle bundle = ResourceBundle.getBundle("gui/Bundle"); // NOI18N
        int ret = JOptionPane.showConfirmDialog(getContentPane(),
                  bundle.getString("ARE_YOU_SURE_QUESTION"), bundle.getString("RESET_SPECTRUM"),
                  JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE); // NOI18N

        if( ret == JOptionPane.YES_OPTION )
            spectrum.reset();
    }//GEN-LAST:event_resetMachineMenuActionPerformed

    private void silenceSoundToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_silenceSoundToggleButtonActionPerformed
        // TODO add your handling code here:
        Object source = evt.getSource();
        if( source instanceof javax.swing.JToggleButton )
            silenceMachineMenu.setSelected(silenceSoundToggleButton.isSelected());
        else
            silenceSoundToggleButton.setSelected(silenceMachineMenu.isSelected());

        spectrum.toggleSound();
    }//GEN-LAST:event_silenceSoundToggleButtonActionPerformed

    private void playTapeMediaMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playTapeMediaMenuActionPerformed
        // TODO add your handling code here:
        spectrum.toggleTape();
    }//GEN-LAST:event_playTapeMediaMenuActionPerformed

    private void openTapeMediaMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openTapeMediaMenuActionPerformed
        // TODO add your handling code here:
        boolean paused = spectrum.isPaused();
        if( jFileTape == null ) {
            jFileTape = new JFileChooser("/home/jsanchez/src/JSpeccy/dist");
            jFileTape.setFileFilter(new FileFilterTape());
            currentDirTape = jFileTape.getCurrentDirectory();
        }
        else
            jFileTape.setCurrentDirectory(currentDirTape);

        if (!paused)
            spectrum.stopEmulation();

        int status = jFileTape.showOpenDialog(getContentPane());
        if( status == JFileChooser.APPROVE_OPTION ) {
            //spectrum.stopEmulation();
            currentDirTape = jFileTape.getCurrentDirectory();
            spectrum.tape.eject();
            spectrum.tape.insert(jFileTape.getSelectedFile());
        }
        if (!paused)
            spectrum.startEmulation();
    }//GEN-LAST:event_openTapeMediaMenuActionPerformed

    private void rewindTapeMediaMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rewindTapeMediaMenuActionPerformed
        // TODO add your handling code here:
        spectrum.tape.rewind();
    }//GEN-LAST:event_rewindTapeMediaMenuActionPerformed

    private void imageHelpMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imageHelpMenuActionPerformed
        // TODO add your handling code here:
        if (keyboard == null) {
            keyboard = new JFrame("Spectrum Keyboard");
            keyboard.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            keyboard.getContentPane().add(new KeyboardImage(keyboard), BorderLayout.CENTER);
            keyboard.setResizable(false);
            keyboard.pack();
        }
        keyboard.setVisible(true);
    }//GEN-LAST:event_imageHelpMenuActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JSpeccy().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBoxMenuItem doubleSizeOption;
    private javax.swing.JToggleButton doubleSizeToggleButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenuItem fileOpenSnapshot;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenuItem imageHelpMenu;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JMenu machineMenu;
    private javax.swing.JMenu mediaMenu;
    private javax.swing.JButton openSnapshotButton;
    private javax.swing.JMenuItem openTapeMediaMenu;
    private javax.swing.JMenu optionsMenu;
    private javax.swing.JCheckBoxMenuItem pauseMachineMenu;
    private javax.swing.JToggleButton pauseToggleButton;
    private javax.swing.JMenuItem playTapeMediaMenu;
    private javax.swing.JMenuItem resetMachineMenu;
    private javax.swing.JButton resetSpectrumButton;
    private javax.swing.JMenuItem rewindTapeMediaMenu;
    private javax.swing.JCheckBoxMenuItem silenceMachineMenu;
    private javax.swing.JToggleButton silenceSoundToggleButton;
    private javax.swing.JLabel speedLabel;
    private javax.swing.JLabel tapeLabel;
    private javax.swing.JMenu tapeMediaMenu;
    private javax.swing.JMenuItem thisIsTheEndMyFriend;
    private javax.swing.JToolBar toolbarMenu;
    // End of variables declaration//GEN-END:variables
    
}
