
package imagepuzzle;
import java.util.Iterator;
import java.util.LinkedHashSet;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
public class Image extends javax.swing.JFrame {
   
   static int index = 9,clicks = 0; static String name,str = "";
   static String  count = "";
   static int countclicks()
   {
       return(++clicks);
   }
   void  show1( String str)
   {
          name = str;
   } 
    
    public   void CheckForWin()
    {
            ImageIcon image1 = new ImageIcon("C:\\Users\\HP\\Downloads\\1.jpg"); 
            ImageIcon image2 = new ImageIcon("C:\\Users\\HP\\Downloads\\2.jpg"); 
            ImageIcon image3 = new ImageIcon("C:\\Users\\HP\\Downloads\\3.jpg"); 
            ImageIcon image4 = new ImageIcon("C:\\Users\\HP\\Downloads\\4.jpg"); 
            ImageIcon image5 = new ImageIcon("C:\\Users\\HP\\Downloads\\5.jpg"); 
            ImageIcon image6 = new ImageIcon("C:\\Users\\HP\\Downloads\\6.jpg"); 
            ImageIcon image7 = new ImageIcon("C:\\Users\\HP\\Downloads\\7.jpg"); 
            ImageIcon image8 = new ImageIcon("C:\\Users\\HP\\Downloads\\8.jpg");
            ImageIcon image9 = new ImageIcon("C:\\Users\\HP\\Downloads\\White.jpg"); 
            String []descI =  new String[9];
            descI[0] =((ImageIcon)image1).getDescription();
            descI[1] =((ImageIcon)image2).getDescription();
            descI[2] =((ImageIcon)image3).getDescription();
            descI[3] =((ImageIcon)image4).getDescription();
            descI[4] =((ImageIcon)image5).getDescription();
            descI[5] =((ImageIcon)image6).getDescription();
            descI[6] =((ImageIcon)image7).getDescription();
            descI[7] =((ImageIcon)image8).getDescription();
            descI[8] =((ImageIcon)image9).getDescription();
            String desc1 = ((ImageIcon)btn1.getIcon()).getDescription();
            String desc2 = ((ImageIcon)btn2.getIcon()).getDescription();
            String desc3 = ((ImageIcon)btn3.getIcon()).getDescription();
            String desc4 = ((ImageIcon)btn4.getIcon()).getDescription();
            String desc5 = ((ImageIcon)btn5.getIcon()).getDescription();
            String desc6 = ((ImageIcon)btn6.getIcon()).getDescription();
            String desc7 = ((ImageIcon)btn7.getIcon()).getDescription();
            String desc8 = ((ImageIcon)btn8.getIcon()).getDescription();
            String desc9 = ((ImageIcon)btn9.getIcon()).getDescription();
            String  btnI[] = new String[9];
            btnI[0] = desc1;
            btnI[1] = desc2;
            btnI[2] = desc3;
            btnI[3] = desc4;
            btnI[4] = desc5;
            btnI[5] = desc6;
            btnI[6] = desc7;
            btnI[7] = desc8;
            btnI[8] = desc9;
            int count = 0;
            for(int j = 0;j<9;j++)
            {    
                 if(btnI[j].equals(descI[j]));
                     count+=1;
            }
            JButton btnArray[] ={btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9};
            if(count==9)
            {   
                for(int i = 0;i<9;i++)
                    btnArray[i].setEnabled(false);
                   JOptionPane.showMessageDialog(null,"Congrats You won the Game !!!");   
            }
           
    }
    public Image() 
    {
        initComponents();
        setExtendedState(Image.MAXIMIZED_BOTH);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        textField2 = new java.awt.TextField();
        txtClicks = new java.awt.TextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnStart = new javax.swing.JButton();
        txtPlayername = new java.awt.TextField();
        btn7 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btnRestart = new javax.swing.JButton();
        btnQuit = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        textField1 = new java.awt.TextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 852, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 215, Short.MAX_VALUE)
        );

        textField2.setEditable(false);
        textField2.setFont(new java.awt.Font("Algerian", 3, 36)); // NOI18N
        textField2.setForeground(new java.awt.Color(255, 0, 0));
        textField2.setText("PUZZLE");
        textField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField2ActionPerformed(evt);
            }
        });

        txtClicks.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        txtClicks.setText("0");

        jLabel4.setFont(new java.awt.Font("Algerian", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 204));
        jLabel4.setText("Nomber of Clicks");

        jLabel2.setFont(new java.awt.Font("Algerian", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 204));
        jLabel2.setText("Name of Player");
        jLabel2.setToolTipText("");

        btnStart.setBackground(new java.awt.Color(153, 255, 153));
        btnStart.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        btnStart.setForeground(new java.awt.Color(255, 0, 0));
        btnStart.setText("START");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });

        txtPlayername.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        txtPlayername.setForeground(new java.awt.Color(0, 0, 255));
        txtPlayername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPlayernameActionPerformed(evt);
            }
        });

        btn7.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Downloads\\6.jpg")); // NOI18N
        btn7.setEnabled(false);
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn2.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Downloads\\1.jpg")); // NOI18N
        btn2.setEnabled(false);
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Downloads\\3.jpg")); // NOI18N
        btn3.setEnabled(false);
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn4.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Downloads\\4.jpg")); // NOI18N
        btn4.setEnabled(false);
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn5.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Downloads\\5.jpg")); // NOI18N
        btn5.setEnabled(false);
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn6.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Downloads\\7.jpg")); // NOI18N
        btn6.setEnabled(false);
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn1.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Downloads\\2.jpg")); // NOI18N
        btn1.setEnabled(false);
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn8.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Downloads\\8.jpg")); // NOI18N
        btn8.setEnabled(false);
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn9.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Downloads\\White.jpeg")); // NOI18N
        btn9.setEnabled(false);
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btnRestart.setBackground(new java.awt.Color(0, 255, 51));
        btnRestart.setFont(new java.awt.Font("Algerian", 3, 18)); // NOI18N
        btnRestart.setForeground(new java.awt.Color(255, 0, 204));
        btnRestart.setText("Restart");
        btnRestart.setEnabled(false);
        btnRestart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestartActionPerformed(evt);
            }
        });

        btnQuit.setBackground(new java.awt.Color(0, 0, 255));
        btnQuit.setFont(new java.awt.Font("Algerian", 3, 18)); // NOI18N
        btnQuit.setForeground(new java.awt.Color(255, 0, 51));
        btnQuit.setText("Quit");
        btnQuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon("F:\\Project Image Slide Photos\\Emoji.jpg")); // NOI18N

        textField1.setEditable(false);
        textField1.setFont(new java.awt.Font("Algerian", 3, 24)); // NOI18N
        textField1.setForeground(new java.awt.Color(255, 0, 0));
        textField1.setText("Developed By- Asharaf Ansari");

        jLabel5.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("## Real Image");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textField2, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(680, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addComponent(btnStart, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(486, 486, 486)
                .addComponent(btnRestart, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(btnQuit, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtClicks, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(173, 173, 173)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(290, 290, 290)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPlayername, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(538, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(237, 237, 237))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(btnStart, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(24, 24, 24))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(textField2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(43, 43, 43))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtPlayername, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(34, 34, 34)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtClicks, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRestart, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnQuit, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 600, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed

        count = Integer.toString(countclicks());
        txtClicks.setText(count);
        if(index==2 || index ==4)
       {
          Icon t  =  btn1.getIcon();
          if(index==2)
          {  
             Icon t1 = btn2.getIcon();
             btn1.setIcon(t1);
             btn2.setIcon(t);index  = 1;
          }
          else if(index==4){
             Icon t1  = btn4.getIcon(); 
             btn1.setIcon(t1);
             btn4.setIcon(t);index  = 1;
          }
       }
       CheckForWin();
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
       count = Integer.toString(countclicks());
        txtClicks.setText(count);
        Icon t  =  btn7.getIcon();
        if(index == 4 || index ==8)
        {
             if(index ==4)
             {
                Icon t1 = btn4.getIcon();
                 btn4.setIcon(t);
                 btn7.setIcon(t1);
                 index  = 7;
             }
             else if(index ==8)
             {
                 Icon t1  =  btn8.getIcon();
                 btn8.setIcon(t);
                 btn7.setIcon(t1);
                 index  = 7;
             }   
            
        }
       CheckForWin(); 
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        count = Integer.toString(countclicks());
        txtClicks.setText(count);
         Icon t  =  btn6.getIcon();
         if(index ==3 || index ==5 || index ==9)
         {
            if(index==3)
            {
                Icon t1  = btn3.getIcon();
                btn3.setIcon(t);
                btn6.setIcon(t1);
                index  = 6;
            }
            else if(index == 5)
            {
               Icon t1 = btn5.getIcon();
               btn5.setIcon(t);
               btn6.setIcon(t1);
               index  =  6;
            }
            else if(index == 9)
            {
               Icon t1 = btn9.getIcon();
               btn9.setIcon(t);
               btn6.setIcon(t1);
               index  = 6;
            }
         }
         CheckForWin();
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
       count = Integer.toString(countclicks());
        txtClicks.setText(count);
          Icon t  =  btn3.getIcon();
          if(index==2 || index == 6)
          {
             if(index ==2)
             { 
                 Icon t1  = btn2.getIcon();
                btn2.setIcon(t);
                btn3.setIcon(t1);
                index  = 3;
             }
             else if(index==6)
             {
                 Icon t1  =  btn6.getIcon();
                btn6.setIcon(t);
                btn3.setIcon(t1);
                index  =  3;
             }
          }
          CheckForWin();
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        count = Integer.toString(countclicks());
        txtClicks.setText(count);
      Icon t  = btn5.getIcon();
      if(index==2 || index == 4 || index ==6 || index == 8)
      {
          if(index ==2)
          {
              Icon t1  = btn2.getIcon();
              btn2.setIcon(t);
              btn5.setIcon(t1);
              index = 5;
          }
          else if(index == 4)
          { 
              Icon t1  = btn4.getIcon(); 
              btn4.setIcon(t);
              btn5.setIcon(t1);
              index  = 5;
          }
          else if(index==6)
          {
              Icon t1  =  btn6.getIcon();
              btn6.setIcon(t);
              btn5.setIcon(t1);
              index  = 5;
          }
          else if(index == 8)
          {
             Icon t1  =  btn8.getIcon();
             btn8.setIcon(t);
             btn5.setIcon(t1);
             index = 5;
          }
              
      }
      CheckForWin();
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        count = Integer.toString(countclicks());
        txtClicks.setText(count);
        Icon t  = btn2.getIcon();
        if(index==1 || index == 3 || index == 5)
        {   
            if(index==1)
            {
               Icon t1  =  btn1.getIcon();
               btn1.setIcon(t);
               btn2.setIcon(t1);
               index =2;
            }
            else if(index==3)
            {
                Icon t1  =  btn3.getIcon();
                btn3.setIcon(t);
                btn2.setIcon(t1);
                index  = 2;
            }
            else if(index==5)
            {
                Icon t1  =  btn5.getIcon();
                btn5.setIcon(t);
                btn2.setIcon(t1);
                index  = 2;
            }
        }
        CheckForWin();
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
       count = Integer.toString(countclicks());
        txtClicks.setText(count);
        Icon t  =  btn4.getIcon();
        if(index==1 || index == 5 || index == 7)
        {
            if(index==1)
            {
                Icon t1  =  btn1.getIcon();
                btn1.setIcon(t);
                btn4.setIcon(t1);
                index  = 4;
            }
            else if(index == 5)
            {
                Icon t1  =  btn5.getIcon();
                btn5.setIcon(t);
               btn4.setIcon(t1);
               index  = 4;
            }
            else if(index == 7)
            {
                Icon t1  =  btn7.getIcon();
                btn7.setIcon(t);
                btn4.setIcon(t1);
                index = 4;
            }
        }
        CheckForWin();
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        count = Integer.toString(countclicks());
        txtClicks.setText(count);
        Icon t = btn8.getIcon();
        if(index == 5 || index ==7 || index == 9 )
        {
           if(index == 5)
           {
             Icon t1  =  btn5.getIcon();
              btn5.setIcon(t);
              btn8.setIcon(t1);
              index = 8;
           }
           else if(index == 7)
           {   Icon t1  =  btn7.getIcon();
              btn7.setIcon(t);
              btn8.setIcon(t1);
              index  = 8;
           }
           else if(index == 9)
           {
              Icon t1  =  btn9.getIcon();
              btn9.setIcon(t);
              btn8.setIcon(t1);
              index = 8;
           }
        }
        CheckForWin();
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        count = Integer.toString(countclicks());
        txtClicks.setText(count);
        Icon t  =   btn9.getIcon();
        if(index ==6 || index == 8)
        {
            if(index == 6)
            {  
               Icon t1  =  btn6.getIcon();
               btn6.setIcon(t);
               btn9.setIcon(t1);
               index  =  9;
            }
            else if(index == 8)
            {             
               Icon t1  =  btn8.getIcon();
               btn8.setIcon(t);
               btn9.setIcon(t1);
               index  =  9;
            }
        }
        CheckForWin();
    }//GEN-LAST:event_btn9ActionPerformed

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
      
       txtPlayername.setText(name);
       txtPlayername.setEditable(false);
       btnRestart.setEnabled(true);
       JButton btnArray[] ={btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9};
      for(int i = 0;i<=8;i++)
      {
           btnArray[i].setEnabled(true); 
      }  
    }//GEN-LAST:event_btnStartActionPerformed

    private void textField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField2ActionPerformed
       
    }//GEN-LAST:event_textField2ActionPerformed

    private void txtPlayernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlayernameActionPerformed
       
    }//GEN-LAST:event_txtPlayernameActionPerformed

    private void btnQuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitActionPerformed
          if(JOptionPane.showConfirmDialog(null,null,"Are You Sure Want to Exit !!",0)==0)
                    new Instructions().setVisible(true);   
    }//GEN-LAST:event_btnQuitActionPerformed

    private void btnRestartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestartActionPerformed
  
        
           JButton []btnArray = {btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9};
           for(int i = 0;i<9;i++)
               btnArray[i].setEnabled(true);
            ImageIcon image1 = new ImageIcon("C:\\Users\\HP\\Downloads\\1.jpg"); 
            ImageIcon image2 = new ImageIcon("C:\\Users\\HP\\Downloads\\2.jpg"); 
            ImageIcon image3 = new ImageIcon("C:\\Users\\HP\\Downloads\\3.jpg"); 
            ImageIcon image4 = new ImageIcon("C:\\Users\\HP\\Downloads\\4.jpg"); 
            ImageIcon image5 = new ImageIcon("C:\\Users\\HP\\Downloads\\5.jpg"); 
            ImageIcon image6 = new ImageIcon("C:\\Users\\HP\\Downloads\\6.jpg"); 
            ImageIcon image7 = new ImageIcon("C:\\Users\\HP\\Downloads\\7.jpg"); 
            ImageIcon image8 = new ImageIcon("C:\\Users\\HP\\Downloads\\8.jpg");
            ImageIcon image9 = new ImageIcon("C:\\Users\\HP\\Downloads\\White.jpg"); 
            String []descI =  new String[9];
            descI[0] =((ImageIcon)image1).getDescription();
            descI[1] =((ImageIcon)image2).getDescription();
            descI[2] =((ImageIcon)image3).getDescription();
            descI[3] =((ImageIcon)image4).getDescription();
            descI[4] =((ImageIcon)image5).getDescription();
            descI[5] =((ImageIcon)image6).getDescription();
            descI[6] =((ImageIcon)image7).getDescription();
            descI[7] =((ImageIcon)image8).getDescription();
            descI[8] =((ImageIcon)image9).getDescription();
          LinkedHashSet<Integer> h =  new LinkedHashSet<>();
          LinkedHashSet<Integer> c =  new LinkedHashSet<>();
          for(int i  = 1 ;i <10;i++)
              c.add(i);
          for(int  i = 0;i<10;i++)
          {
            int a  =  (int)(1 + Math.random()*9);
            h.add(a); 
          }
          h.addAll(c);
         Iterator itr  =  h.iterator();
         int j = 0;
         while(itr.hasNext())
         {
             Integer t =(Integer)itr.next();
             String s = descI[t-1]; 
             ImageIcon tt = new ImageIcon(s);
             btnArray[j].setIcon(tt);
             j++;
         }
       String str2 = null;
       for(int i = 0;i<8;i++)
       {
             str2 = ((ImageIcon)btnArray[i].getIcon()).getDescription();
             String str1 = "C:\\Users\\HP\\Downloads\\White.jpg";
             if(str2.equals(str1))
             {
                 index = i+1;
                 break;
             }
       }
    }//GEN-LAST:event_btnRestartActionPerformed
    
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
            java.util.logging.Logger.getLogger(Image.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Image.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Image.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Image.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
  
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnQuit;
    private javax.swing.JButton btnRestart;
    private javax.swing.JButton btnStart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private java.awt.TextField textField1;
    private java.awt.TextField textField2;
    private java.awt.TextField txtClicks;
    private java.awt.TextField txtPlayername;
    // End of variables declaration//GEN-END:variables
}
