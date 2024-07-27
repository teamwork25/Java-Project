
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author SANDIP NAYAK
 */
public class Tictac extends javax.swing.JFrame {

    // INTEGER AND STRING DECLARE
    
    private String startgame = "X";
    private int xcount = 0;
    private int ocount = 0;

    /**
     * Creates new form Tictak
     */
    public Tictac() {
        initComponents();
    }

        // PLAYER SCORE FUNCTION
    private void gamescore(){
        playerx.setText(String.valueOf(xcount));
        playero.setText(String.valueOf(ocount));
    }
    
    private  void choose_a_Player(){
        if(startgame.equalsIgnoreCase("X")){
            startgame = "O";
        }else{
            startgame = "X";
        }
    }
    
    private void winningGame(){
        String T1 = t1.getText();
        String T2 = t2.getText();
        String T3 = t3.getText();
        
        String M1 = m1.getText();
        String M2 = m2.getText();
        String M3 = m3.getText();
        
        String B1 = b1.getText();
        String B2 = b2.getText();
        String B3 = b3.getText();
       
        
        //player of X
        
        if (T1 == ("X") && T2 == ("X") && T3 == ("X")) {
            
            JOptionPane.showMessageDialog(this, "Player X win","Tic Tac",
                    JOptionPane.INFORMATION_MESSAGE);
            xcount++;
            gamescore();
            t1.setBackground(Color.orange);
            t2.setBackground(Color.orange);
            t3.setBackground(Color.orange);
        }
        
        if (M1 == ("X") && M2 == ("X") && M3 == ("X")) {
            
            JOptionPane.showMessageDialog(this, "Player X win","Tic Tac",
                    JOptionPane.INFORMATION_MESSAGE);
            xcount++;
            gamescore();
            m1.setBackground(Color.orange);
            m2.setBackground(Color.orange);
            m3.setBackground(Color.orange);
        }
        
        if (B1 == ("X") && B2 == ("X") && B3 == ("X")) {
            
            JOptionPane.showMessageDialog(this, "Player X win","Tic Tac",
                    JOptionPane.INFORMATION_MESSAGE);
            xcount++;
            gamescore();
            b1.setBackground(Color.orange);
            b2.setBackground(Color.orange);
            b3.setBackground(Color.orange);
        }
        
         if (T1 == ("X") && M1 == ("X") && B1 == ("X")) {
            
            JOptionPane.showMessageDialog(this, "Player X win","Tic Tac",
                    JOptionPane.INFORMATION_MESSAGE);
            xcount++;
            gamescore();
            t1.setBackground(Color.orange);
            m1.setBackground(Color.orange);
            b1.setBackground(Color.orange);
        }
          if (T2 == ("X") && M2 == ("X") && B2 == ("X")) {
            
            JOptionPane.showMessageDialog(this, "Player X win","Tic Tac",
                    JOptionPane.INFORMATION_MESSAGE);
            xcount++;
            gamescore();
            t2.setBackground(Color.orange);
            m2.setBackground(Color.orange);
            b2.setBackground(Color.orange);
        }
          
           if (T3 == ("X") && M3 == ("X") && B3 == ("X")) {
            
            JOptionPane.showMessageDialog(this, "Player X win","Tic Tac",
                    JOptionPane.INFORMATION_MESSAGE);
            xcount++;
            gamescore();
            t3.setBackground(Color.orange);
            m3.setBackground(Color.orange);
            b3.setBackground(Color.orange);
        }
           if (T1 == ("X") && M2 == ("X") && B3 == ("X")) {
            
            JOptionPane.showMessageDialog(this, "Player X win","Tic Tac",
                    JOptionPane.INFORMATION_MESSAGE);
            xcount++;
            gamescore();
            t1.setBackground(Color.orange);
            m2.setBackground(Color.orange);
            b3.setBackground(Color.orange);
        }
           if (T3 == ("X") && M2 == ("X") && B1 == ("X")) {
            
            JOptionPane.showMessageDialog(this, "Player X win","Tic Tac",
                    JOptionPane.INFORMATION_MESSAGE);
            xcount++;
            gamescore();
            t3.setBackground(Color.orange);
            m2.setBackground(Color.orange);
            b1.setBackground(Color.orange);
        }
           
          // Player of O
          
          
        if (M1 == ("O") && M2 == ("O") && M3 == ("O")) {
            
            JOptionPane.showMessageDialog(this, "Player O win","Tic Tac",
                    JOptionPane.INFORMATION_MESSAGE);
            ocount++;
            gamescore();
            m1.setBackground(Color.orange);
            m2.setBackground(Color.orange);
            m3.setBackground(Color.orange);
        }
        
        if (B1 == ("O") && B2 == ("O") && B3 == ("O")) {
            
            JOptionPane.showMessageDialog(this, "Player O win","Tic Tac",
                    JOptionPane.INFORMATION_MESSAGE);
            ocount++;
            gamescore();
            b1.setBackground(Color.orange);
            b2.setBackground(Color.orange);
            b3.setBackground(Color.orange);
        }
        
         if (T1 == ("O") && M1 == ("O") && B1 == ("O")) {
            
            JOptionPane.showMessageDialog(this, "Player O win","Tic Tac",
                    JOptionPane.INFORMATION_MESSAGE);
            ocount++;
            gamescore();
            t1.setBackground(Color.orange);
            m1.setBackground(Color.orange);
            b1.setBackground(Color.orange);
        }
          if (T2 == ("O") && M2 == ("O") && B2 == ("O")) {
            
            JOptionPane.showMessageDialog(this, "Player O win","Tic Tac",
                    JOptionPane.INFORMATION_MESSAGE);
            ocount++;
            gamescore();
            t2.setBackground(Color.orange);
            m2.setBackground(Color.orange);
            b2.setBackground(Color.orange);
        }
          
           if (T3 == ("O") && M3 == ("O") && B3 == ("O")) {
            
            JOptionPane.showMessageDialog(this, "Player O win","Tic Tac",
                    JOptionPane.INFORMATION_MESSAGE);
            ocount++;
            gamescore();
            t3.setBackground(Color.orange);
            m3.setBackground(Color.orange);
            b3.setBackground(Color.orange);
        }
           if (T1 == ("O") && M2 == ("O") && B3 == ("O")) {
            
            JOptionPane.showMessageDialog(this, "Player O win","Tic Tac",
                    JOptionPane.INFORMATION_MESSAGE);
            ocount++;
            gamescore();
            t1.setBackground(Color.orange);
            m2.setBackground(Color.orange);
            b3.setBackground(Color.orange);
        }
           if (T3 == ("O") && M2 == ("O") && B1 == ("O")) {
            
            JOptionPane.showMessageDialog(this, "Player O win","Tic Tac",
                    JOptionPane.INFORMATION_MESSAGE);
            ocount++;
            gamescore();
            t3.setBackground(Color.orange);
            m2.setBackground(Color.orange);
            b1.setBackground(Color.orange);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        t2 = new javax.swing.JButton();
        t1 = new javax.swing.JButton();
        t3 = new javax.swing.JButton();
        m1 = new javax.swing.JButton();
        m2 = new javax.swing.JButton();
        m3 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        playerxxx = new javax.swing.JLabel();
        playeroooo = new javax.swing.JLabel();
        playerx = new javax.swing.JLabel();
        playero = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TIC TAC GAME");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE))
        );

        t2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        t2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t2ActionPerformed(evt);
            }
        });

        t1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });

        t3.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        t3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t3ActionPerformed(evt);
            }
        });

        m1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        m1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m1ActionPerformed(evt);
            }
        });

        m2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        m2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m2ActionPerformed(evt);
            }
        });

        m3.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        m3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                m3ActionPerformed(evt);
            }
        });

        b1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        reset.setBackground(new java.awt.Color(51, 51, 255));
        reset.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        reset.setText("RESET");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        b2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        b3.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        exit.setBackground(new java.awt.Color(255, 51, 51));
        exit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        exit.setText("EXIT");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        playerxxx.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        playerxxx.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        playerxxx.setText("Player X :");

        playeroooo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        playeroooo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        playeroooo.setText("Player O :");

        playerx.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        playerx.setForeground(new java.awt.Color(255, 0, 0));
        playerx.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        playerx.setText("XXXXXXXXXXXXXXX");

        playero.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        playero.setForeground(new java.awt.Color(51, 51, 255));
        playero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        playero.setText("XXXXXXXXXXXXXXX");

        jLabel2.setBackground(new java.awt.Color(153, 51, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("SCORE");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(playeroooo, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                    .addComponent(playerxxx, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(playero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(playerx, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(playerxxx, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(playeroooo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(playerx, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                        .addComponent(playero, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(48, 48, 48))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(m1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(m2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(m3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(141, 141, 141)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(97, 97, 97))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(t3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(m1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(m2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(m3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)))
                .addGap(41, 41, 41))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed

        // RESET BUTTON
        
        t1.setText(null);
        t2.setText(null);
        t3.setText(null);
        
        m1.setText(null);
        m2.setText(null);
        m3.setText(null);
        
        b1.setText(null);
        b2.setText(null);
        b3.setText(null);

        // RESET COLOUR
        
        t1.setBackground(Color.lightGray);
        t2.setBackground(Color.lightGray);
        t3.setBackground(Color.lightGray);
        
        m1.setBackground(Color.lightGray);
        m2.setBackground(Color.lightGray);
        m3.setBackground(Color.lightGray);
        
        b1.setBackground(Color.lightGray);
        b2.setBackground(Color.lightGray);
        b3.setBackground(Color.lightGray);
    }//GEN-LAST:event_resetActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // EXIT BUTTON
        
        JFrame frame = new JFrame("Exit");
        if (JOptionPane.showConfirmDialog(frame, "Confirm if you want Exit",
                "Tic Tac",JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_exitActionPerformed

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed

        // TOP 1 BUTTON FUNCTION
        
        t1.setText(startgame);
        
        if(startgame.equalsIgnoreCase("X")){
            t1.setForeground(Color.red);
        }else{
            t1.setForeground(Color.BLUE);
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_t1ActionPerformed

    private void t2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t2ActionPerformed
    
        // TOP 2 BUTTON FUNCTION
        
        t2.setText(startgame);
        if(startgame.equalsIgnoreCase("X")){
            t2.setForeground(Color.red);
        }else{
            t2.setForeground(Color.BLUE);
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_t2ActionPerformed

    private void t3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t3ActionPerformed

        // TOP 3 BUTTON FUNCTION
        
        t3.setText(startgame);
        
        if(startgame.equalsIgnoreCase("X")){
            t3.setForeground(Color.red);
        }else{
            t3.setForeground(Color.BLUE);
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_t3ActionPerformed

    private void m1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m1ActionPerformed

        // MIDDLE 1 BUTTON FUNCTION
        
        m1.setText(startgame);
        
        if(startgame.equalsIgnoreCase("X")){
            m1.setForeground(Color.red);
        }else{
            m1.setForeground(Color.BLUE);
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_m1ActionPerformed

    private void m2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m2ActionPerformed

        // MIDDLE 2 BUTTON FUNCTION
        
         m2.setText(startgame);
        
        if(startgame.equalsIgnoreCase("X")){
            m2.setForeground(Color.red);
        }else{
            m2.setForeground(Color.BLUE);
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_m2ActionPerformed

    private void m3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_m3ActionPerformed

        // MIDDLE 3 BUTTON FUNCTION
        
       m3.setText(startgame);
        
        if(startgame.equalsIgnoreCase("X")){
            m3.setForeground(Color.red);
        }else{
            m3.setForeground(Color.BLUE);
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_m3ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed

        // BOTTOM 1 BUTTON FUNCTION
        
        b1.setText(startgame);
        
        if(startgame.equalsIgnoreCase("X")){
            b1.setForeground(Color.red);
        }else{
            b1.setForeground(Color.BLUE);
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed

        // BOTTOM 2 BUTTON FUNCTION
        
         b2.setText(startgame);
        
        if(startgame.equalsIgnoreCase("X")){
            b2.setForeground(Color.red);
        }else{
            b2.setForeground(Color.BLUE);
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        
        // BOTTOM 3 BUTTON FUNCTION
        
         b3.setText(startgame);
        
        if(startgame.equalsIgnoreCase("X")){
            b3.setForeground(Color.red);
        }else{
            b3.setForeground(Color.BLUE);
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_b3ActionPerformed

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
            java.util.logging.Logger.getLogger(Tictac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tictac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tictac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tictac.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tictac().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton m1;
    private javax.swing.JButton m2;
    private javax.swing.JButton m3;
    private javax.swing.JLabel playero;
    private javax.swing.JLabel playeroooo;
    private javax.swing.JLabel playerx;
    private javax.swing.JLabel playerxxx;
    private javax.swing.JButton reset;
    private javax.swing.JButton t1;
    private javax.swing.JButton t2;
    private javax.swing.JButton t3;
    // End of variables declaration//GEN-END:variables
}
