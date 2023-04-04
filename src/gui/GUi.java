/*
 * MENU GUI
 */
package gui;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

/**
 * Simulates the GUI menu
 * @author Kwnstantinos Perrakis
 * @author Sokratis Athanasiadis
 * @version 1.1
 * Simulates the GUI menu
 */
public class GUi extends javax.swing.JFrame {

    /**
     * Creates new form GUi
     */
    public GUi() {
        transparent=new Color(0,0,0,0);
        Toolkit t=Toolkit.getDefaultToolkit();
        Dimension d=t.getScreenSize();
        initComponents();
        int x=((d.width/2-this.getWidth()/2));
        int y=((d.height/2-this.getHeight()/2));
        this.setLocation(x,y);
        setCursor();
       
    }
    /**
     * This method changes the cursor to "hand cursor" on all buttons
     */
    public void setCursor(){
        jButton1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jButton2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jButton3.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jButton4.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jButton5.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jButton6.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jButton7.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jButton8.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton7 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(302, 601));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(302, 601));
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton7.setBackground(transparent);
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/24550532_890666447768258_1943735498_n_70x70.png"))); // NOI18N
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton7MouseEntered(evt);
            }
        });
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 90, 80));

        jButton6.setBackground(transparent);
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/24550532_890666447768258_1943735498_n_70x70.png"))); // NOI18N
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 90, 90));

        jButton8.setBackground(transparent);
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/24550532_890666447768258_1943735498_n_70x70.png"))); // NOI18N
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton8MouseEntered(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, 90, 80));

        jButton5.setBackground(transparent);
        jButton5.setFont(new java.awt.Font("Linux Biolinum G", 0, 36)); // NOI18N
        jButton5.setText("Solo 1");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton5MouseExited(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, -1));

        jButton1.setBackground(transparent);
        jButton1.setFont(new java.awt.Font("Linux Biolinum G", 0, 36)); // NOI18N
        jButton1.setText("Exit");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 510, -1, -1));

        jButton3.setBackground(transparent);
        jButton3.setFont(new java.awt.Font("Linux Biolinum G", 0, 36)); // NOI18N
        jButton3.setText("Hungarian");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton3MouseExited(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 230, -1));

        jButton4.setBackground(transparent);
        jButton4.setFont(new java.awt.Font("Linux Biolinum G", 0, 36)); // NOI18N
        jButton4.setText("All 7");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton4MouseExited(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 130, -1));

        jButton2.setBackground(transparent);
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/24550532_890666447768258_1943735498_n_70x70.png"))); // NOI18N
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 80, 80));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/24550212_890657441102492_2110400526_n.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 300, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
 * Exits the program
 * @param evt it's the mouse click on jButton1
 */
    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
    
       playSound("Game Menu Click SOUND Effect.wav");
        System.exit(0); // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseClicked
/**
 * Changes the font of the text inside the button when mouse enters the button area
 * @param evt mouse enters the button area
 */
    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
       jButton1.setFont(Font.decode("Linux Biolinum G-bold-36")); // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseEntered
/**
 * Changes the font of the text inside the button when mouse exits the button area
 * @param evt mouse exits the button area
 */
    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        // TODO add your handling code here:
        jButton1.setFont(Font.decode("Linux Biolinum G-plain-36"));
    }//GEN-LAST:event_jButton1MouseExited
/**
 * Changes the font of the text inside the button when mouse enters the button area
 * @param evt mouse enters the button area
 */
    private void jButton4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseEntered
        // TODO add your handling code here:
        jButton4.setFont(Font.decode("Linux Biolinum G-bold-36"));
    }//GEN-LAST:event_jButton4MouseEntered
/**
 * Changes the font of the text inside the button when mouse exits the button area
 * @param evt mouse exits the button area
 */
    private void jButton4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseExited
        // TODO add your handling code here:
        jButton4.setFont(Font.decode("Linux Biolinum G-plain-36"));
    }//GEN-LAST:event_jButton4MouseExited
/**
 * Changes the font of the text inside the button when mouse enters the button area
 * @param evt mouse enters the button area
 */
    private void jButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseEntered
        // TODO add your handling code here:
        jButton3.setFont(Font.decode("Linux Biolinum G-bold-36"));
    }//GEN-LAST:event_jButton3MouseEntered
/**
 * Changes the font of the text inside the button when mouse exits the button area
 * @param evt mouse exits the button area
 */
    private void jButton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseExited
        // TODO add your handling code here:
        jButton3.setFont(Font.decode("Linux Biolinum G-plain-36"));
    }//GEN-LAST:event_jButton3MouseExited
/**
 * Changes the font of the text inside the button when mouse enters the button area
 * @param evt mouse enters the button area
 */
    private void jButton5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseEntered
        // TODO add your handling code here:
         jButton5.setFont(Font.decode("Linux Biolinum G-bold-36"));
    }//GEN-LAST:event_jButton5MouseEntered
/**
 * Changes the font of the text inside the button when mouse exits the button area
 * @param evt mouse exits the button area
 */
    private void jButton5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseExited
        // TODO add your handling code here:
         jButton5.setFont(Font.decode("Linux Biolinum G-plain-36"));
    }//GEN-LAST:event_jButton5MouseExited

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed
/**
 * When you click jButton 3 it opens the Hungarian mode menu
 * @param evt mouse clicks button3
 */
    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here
        playSound("Game Menu Click SOUND Effect.wav");
        ChoosePlayers hung=new ChoosePlayers(0);
        hung.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3MouseClicked

    /**
    * This method makes the Undercoated Frame Movable
    * @param evt it is click and drag of the main menu
    */
    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        // TODO add your handling code here:
        int x=evt.getXOnScreen();
        int y=evt.getYOnScreen();
        this.setLocation(x-x1,y-y1);
           
    }//GEN-LAST:event_formMouseDragged
/**
 * It gets the parameters of the mouse
 * @param evt the position of the mouse when it clicks somewhere
 */
    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        // TODO add your handling code here:
        x1=evt.getX();
         y1=evt.getY();
    }//GEN-LAST:event_formMousePressed
/**
 * It starts the Solo1 game with a click on jButton5
 * @param evt click on jButton5
 */
    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        // TODO add your handling code here:
        playSound("Game Menu Click SOUND Effect.wav");
        Solo1GUI1 solo1= new Solo1GUI1();
        solo1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton5MouseClicked
/**
 * Appears an info of what this button does
 * @param evt mouse enters button2
 */
    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        // TODO add your handling code here:
        jButton2.setToolTipText("rules");
    }//GEN-LAST:event_jButton2MouseEntered
/**
 * Appears an info of what this button does
 * @param evt mouse enters button7
 */
    private void jButton7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseEntered
        // TODO add your handling code here:
        jButton7.setToolTipText("rules");
    }//GEN-LAST:event_jButton7MouseEntered
/**
 * Appears an info of what this button does
 * @param evt mouse enters button8
 */
    private void jButton8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseEntered
        // TODO add your handling code here:
        jButton8.setToolTipText("rules");
    }//GEN-LAST:event_jButton8MouseEntered
/**
 * It just plays a sound effect when a click in button2 is done, and appears a JOptionPane with game rules
 * @param evt click in button2
 */
    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        playSound("Game Menu Click SOUND Effect.wav");
        JOptionPane.showMessageDialog(null,"Rules:\nThe tiles are mixed with the face down and placed in rectangular shape with a dimension of 4x7 tiles.\nThe player turns all the tiles with the face up, so that he can see them.\nThe player starts to play the classic Domino game by taking any of the 4 tiles that are in the end of each row.\nPlayer continue taking tiles and place them in the domino line that is created.\nIf the player places all the tiles wins.");
    }//GEN-LAST:event_jButton2MouseClicked
/**
 * It just plays a sound effect when a click in button2 is done, and appears a JOptionPane with game rules
 * @param evt click in button7
 */
    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
        // TODO add your handling code here:
        playSound("Game Menu Click SOUND Effect.wav");
        JOptionPane.showMessageDialog(null,"RULES:\nThe dominoes are shuffled, facedown, then each player draws a number of tiles, that only they can look at, that differs according to the number of players taking part.\nThe player with the biggest double Tile, or if no exists, with the most valued according to dots Tile, plays first\nOnce a player has dominoed by setting their last tile, or the game is blocked with no player able to set a tile, the round is over.\nThe player who dominoed or has the lowest total of pips left in their hand, is the winner of that round.\nPlayers score the total number of pips left in their remaining hand of dominoes.\nA number of rounds are played and the first player to score a set total 100 points, loses the game.");
    }//GEN-LAST:event_jButton7MouseClicked
/**
 * It plays a sound effect and starts a newHungarian mode menu
 * @param evt mouse click in button4
 */
    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
       playSound("Game Menu Click SOUND Effect.wav");
        ChoosePlayers hung=new ChoosePlayers(1);
        hung.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4MouseClicked
/**
 * Shows an optionPane with game rules
 * @param evt mouse clicked
 */
    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked
        // TODO add your handling code here:
        playSound("Game Menu Click SOUND Effect.wav");
        JOptionPane.showMessageDialog(this, "RULES:\nThe dominoes are shuffled, facedown, then each player draws a number of tiles, that only they can look at, that differs according to the number of players taking part.\nThe player with the biggest double Tile, or if no exists, with the most valued according to dots Tile, plays first\n.The player must place a tile next to another with the condions that the sum of the two consecutive sides of each tile must be 7\nHowever if a tile with 'blank' side is the last or first on the table you can put whatever tile you want\n Thre are also wildcards which can be placed everywhere\n If there is no available move to make you have to draw tiles from the stuck until you have an available move\nYou can draw a tile even if you have an available move but only once per Turn\n Once a player has dominoed by setting their last tile, or the game is blocked with no player able to set a tile, the round is over.\nThe player who dominoed or has the lowest total of pips left in their hand, is the winner of that round.\nPlayers score the total number of pips left in their remaining hand of dominoes.\nA number of rounds are played and the first player to score a set total 100 points, loses the game.");
    }//GEN-LAST:event_jButton8MouseClicked

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
            java.util.logging.Logger.getLogger(GUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUi().setVisible(true);
            }
        });
    }
    
    /**
     * This function starts all the sound effects of this menu
     * @param soundName the file that contains the sound that we want to play
     */
    public void playSound(String soundName)
 {
   try 
   {
   AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(soundName).getAbsoluteFile( ));
   Clip clip = AudioSystem.getClip( );
   clip.open(audioInputStream);
   clip.start( );
   }
   catch(Exception ex)
   {
     System.out.println("Error with playing sound.");
     ex.printStackTrace( );
   }
 }
    Color transparent;
    private int x1,y1;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
