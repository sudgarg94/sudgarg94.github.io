/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.FarmerRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.FarmerOrganization;
import Business.UserAccount.UserAccount;
import UserInterface.SignUpJPanel;
import java.awt.CardLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 *
 * @author kkgarg
 */
public class FarmerHomePageJPanel extends javax.swing.JPanel {

    /**
     * Creates new form FarmerHomePageJPanel
     */
    private JPanel userProcessContainer;
    private FarmerOrganization farmerOrganization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem business;
    //private BufferedImage image1;
    private Image image2;

    public FarmerHomePageJPanel(JPanel userProcessContainer, UserAccount account, FarmerOrganization farmerOrganization, Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.farmerOrganization = farmerOrganization;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.business = business;
        backgroundImage("/resources/imgs/HP2.jpg");
    }
    
     private void backgroundImage(String str){
        try {
            BufferedImage image1 = ImageIO.read(FarmerHomePageJPanel.class.getResource(str));
            image2 = image1.getScaledInstance(1200,800,Image.SCALE_SMOOTH);
        } catch (IOException ex) {
            Logger.getLogger(SignUpJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    
    public void paintComponent(Graphics g) {
    super.paintComponent(g);

    // Draw the background image.
    g.drawImage(image2, 0, 0, this);
  }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        postAQueryjButton = new javax.swing.JButton();
        sellYourCropJButton = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        guideLineJButton = new javax.swing.JButton();
        aboutUsJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        generalCropInfojButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        jButton1.setFont(new java.awt.Font("Lucida Grande", 1, 16)); // NOI18N
        jButton1.setText("Request Research");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        postAQueryjButton.setFont(new java.awt.Font("Lucida Grande", 1, 16)); // NOI18N
        postAQueryjButton.setText("Post A Query");
        postAQueryjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                postAQueryjButtonActionPerformed(evt);
            }
        });

        sellYourCropJButton.setFont(new java.awt.Font("Lucida Grande", 1, 16)); // NOI18N
        sellYourCropJButton.setText("Sell Your Crop");
        sellYourCropJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellYourCropJButtonActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Lucida Grande", 1, 16)); // NOI18N
        jButton3.setText("Write A FeedBack");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        guideLineJButton.setFont(new java.awt.Font("Lucida Grande", 1, 16)); // NOI18N
        guideLineJButton.setText("GuideLines");
        guideLineJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guideLineJButtonActionPerformed(evt);
            }
        });

        aboutUsJButton.setFont(new java.awt.Font("Lucida Grande", 1, 16)); // NOI18N
        aboutUsJButton.setText("About Us");
        aboutUsJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutUsJButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 16)); // NOI18N
        jLabel1.setText("Customer Helpline Number:");

        generalCropInfojButton.setFont(new java.awt.Font("Lucida Grande", 1, 16)); // NOI18N
        generalCropInfojButton.setText("Information About Major Crops");
        generalCropInfojButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generalCropInfojButtonActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 16)); // NOI18N
        jLabel5.setText("1800-3131-3131");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/imgs/agronomyAdvancement.JPG"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/imgs/farmers.market.crop1.jpg"))); // NOI18N
        jLabel3.setText("jLabel2");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/imgs/request4.jpg"))); // NOI18N
        jLabel6.setText("jLabel2");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/imgs/feedback2.jpg"))); // NOI18N
        jLabel8.setText("jLabel2");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/imgs/query.jpg"))); // NOI18N
        jLabel9.setText("jLabel2");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/imgs/guidelines1.jpg"))); // NOI18N
        jLabel10.setText("jLabel2");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/imgs/information1.jpg"))); // NOI18N
        jLabel11.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(aboutUsJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addGap(256, 256, 256))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(26, 26, 26)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(58, 58, 58)
                                    .addComponent(postAQueryjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(84, 84, 84)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(133, 133, 133)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(sellYourCropJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(110, 110, 110)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(guideLineJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(generalCropInfojButton))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel5))
                    .addComponent(aboutUsJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(77, 77, 77)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(131, 131, 131)
                                        .addComponent(postAQueryjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(guideLineJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(248, 248, 248)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(generalCropInfojButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sellYourCropJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(134, 134, 134))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("FarmerWorkAreaJPanel", new FarmerWorkAreaJPanel(userProcessContainer, userAccount,farmerOrganization, enterprise, business));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void sellYourCropJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellYourCropJButtonActionPerformed
        // TODO add your handling code here:
        SellCropJPanel sellCropJPanel = new SellCropJPanel(userProcessContainer,userAccount, enterprise, business);
        userProcessContainer.add("SellingCropJPanel", sellCropJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_sellYourCropJButtonActionPerformed

    private void postAQueryjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_postAQueryjButtonActionPerformed
        // TODO add your handling code here:
        PostAQueryJPanel postAQueryJPanel = new PostAQueryJPanel(userProcessContainer,userAccount, enterprise, business);
        userProcessContainer.add("PostAQueryJPanel", postAQueryJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_postAQueryjButtonActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        FarmerFeedbackJPanel feedbackPanel = new FarmerFeedbackJPanel(userProcessContainer,enterprise,business);
        userProcessContainer.add("FarmerFeedbackJPanel",feedbackPanel);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void aboutUsJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutUsJButtonActionPerformed
        // TODO add your handling code here:
        
//        final String s = "Agriculture is the backbone of the Indian Economy\\\"- said Mahatma Gandhi six decades ago"
//                        +"Even today, the situation is still the same, with almost the entire economy being sustained by agriculture, which is the mainstay of the villages." 
//                        +"It contributes 16% of the overall GDP and accounts for employment of approximately 52% of the Indian population." 
//                        +"Rapid growth in agriculture is essential not only for self-reliance but also to earn valuable foreign exchange." 
//                        +"Indian farmers are second to none in production and productivity despite of the fact that millions are marginal and small farmers."
//                        +"They adopt improved agriculture technology as efficiently as farmers in developed countries."
//                        +" It is felt that with provision of timely and adequate inputs such as fertilizers, seeds, pesticides and by making available affordable agricultural credit /crop insurance, "
//                        +"Indian farmers are going to ensure food and nutritional security to the Nation. It is envisaged to make available relevant information and services to the farming community and "
//                        +" private sector through the use of information and communication technologies, to supplement the existing delivery channels provided for by the department. "
//                        +"Farmers’ Portal is an endeavour in this direction to create one stop shop for meeting all informational needs relating to Agriculture, Animal Husbandry and Fisheries sectors production, sale/storage of an Indian farmer."
//                        +"With this Indian Farmer will not be required to sift through maze of websites created for specific purposes. Once in the Farmers’ Portal, a farmer will be able to get all relevant information on specific subjects around "
//                        +" his village/block /district or state. This information will be delivered in the form of text, SMS, email and audio/video in the language he or she understands. These levels can be easily reached through the Map of India "
//                        +"placed on the Home page. Farmers will also be able to ask specific queries as well as give valuable feedback through the Feedback module specially developed for the purpose ";
//        
//        final String html1 = "<html><body style='width: ";
//        final String html2 = "px'>";
//
//        //Runnable r = new Runnable() {
//
//            //@Override
//            //public void run() {
//                JOptionPane.showMessageDialog(
//                        null, new JLabel(html1 + "400" + html2 + s));
//            //}
//        //};
//        //SwingUtilities.invokeLater(r);
//        
//        
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("AboutUsJPanel", new AboutUsJPanel(userProcessContainer, userAccount,farmerOrganization, enterprise, business));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_aboutUsJButtonActionPerformed

    private void guideLineJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guideLineJButtonActionPerformed
        // TODO add your handling code here:
        final String myString =  "1.There are multiple ways here to support you. \n"
                                +"2. Once you are done with account creation, you can request for a soil sample research.\n" 
                                +"3. Please click on the work request button to get started.\n" 
                                +"4. Once you have posted the request, Collection center guys will pick your sample up\n" 
                                +"5. You will get the research results within the stipulated amount of time.\n" 
                                +"6. You can also sell your produce on our portal\n" 
                                +"7. We connect you to vendors all across the network\n" 
                                +"8. For any query should you have, please post us by hitting post a query button\n" 
                                +"9. We also expect you to provide us your valuable feedback as it will help us to serve you better\n" 
                                +"10. Please feel free to contact the customer care anytime. The detail is present on the top right hand corner of our screen";
        
        
        final String html1 = "<html><body style='width: ";
        final String html2 = "px'>";
        String h = myString.replaceAll("<","&lt;").replaceAll(">", "&gt;").replaceAll("\n", "<br/>");
        JOptionPane.showMessageDialog(null, new JLabel(html1 + "450" + html2 + h),"Guidelines for Application Usage", JOptionPane.INFORMATION_MESSAGE);
        
        
    }//GEN-LAST:event_guideLineJButtonActionPerformed

    private void generalCropInfojButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generalCropInfojButtonActionPerformed
        // TODO add your handling code here:
        GeneralCropInformationJPanel generalCropInformationJPanel = new GeneralCropInformationJPanel(userProcessContainer,userAccount,enterprise,business);
        userProcessContainer.add("GeneralCropInformationJPanel",generalCropInformationJPanel);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_generalCropInfojButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aboutUsJButton;
    private javax.swing.JButton generalCropInfojButton;
    private javax.swing.JButton guideLineJButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton postAQueryjButton;
    private javax.swing.JButton sellYourCropJButton;
    // End of variables declaration//GEN-END:variables
}
