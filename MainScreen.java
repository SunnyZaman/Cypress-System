/**
 * Cypress System
 * Main Screen
 * Displays the main menu to the users
 */
//MainScreen
public class MainScreen extends javax.swing.JFrame {
    //Creates new form MainScreen
    public MainScreen() {
        initComponents();
    }
    // Set the login status. If loggedIn is true, then the user is logged in.
    // If loggedIn is false, then the user is not logged in.
    public void setLogIn(boolean logged)
     {
         loggedIn = logged;
     }
    // Set the username and password.
    public void setUandP(String uname,String pass)
     {
      username = uname;
      password = pass;
     }
    // Close Main Screen
    public void close(){
       this.setVisible(false);
    }   

    //initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        cypressLabel = new javax.swing.JLabel();
        torontoLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        toronto_img = new javax.swing.JLabel();
        englishButton = new javax.swing.JButton();
        frenchButton = new javax.swing.JButton();
        faqLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(550, 100));

        cypressLabel.setFont(new java.awt.Font("Times New Roman", 1, 60)); 
        cypressLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cypressLabel.setText("CYPRESS");

        torontoLabel.setFont(new java.awt.Font("Times New Roman", 1, 36)); 
        torontoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        torontoLabel.setText("City of Toronto");

        jPanel2.setLayout(null);

        toronto_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/City_of_Toronto_Logo.png"))); 

        englishButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); 
        englishButton.setText("English");
        englishButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        englishButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                englishButtonActionPerformed(evt);
            }
        });

        frenchButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); 
        frenchButton.setText("French");
        frenchButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        frenchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frenchButtonActionPerformed(evt);
            }
        });

        faqLabel.setFont(new java.awt.Font("Times New Roman", 0, 16)); 
        faqLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        faqLabel.setText("FAQ");
        faqLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                faqLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(274, 274, 274)
                        .addComponent(torontoLabel))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(cypressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, mainPanelLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(englishButton, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(115, 115, 115)
                        .addComponent(frenchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(toronto_img, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(121, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(faqLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(cypressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(toronto_img, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE))
                .addGap(41, 41, 41)
                .addComponent(torontoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(englishButton)
                    .addComponent(frenchButton))
                .addGap(20, 20, 20)
                .addComponent(faqLabel)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    // Open FAQ and closes Main Screen
    private void faqLabelMouseClicked(java.awt.event.MouseEvent evt) {
        if(!english){
            FAQ faq = new FAQ();
            faq.torontoLabel.setText("City of Toronto");
            faq.faqLabel.setText("Frequent Asked Questions");
            faq.setLanguage(english);
            faq.setLogIn(loggedIn);
            faq.setUandP(username,password);
            faq.mainLabel.setText("MAIN");
            if(loggedIn){
                    faq.logoutLabel.setText("LOGOUT");
            }
            faq.setVisible(true);
            close();
        }
        else{
            FAQ faq = new FAQ();
            faq.setLanguage(english);
            faq.setLogIn(loggedIn);
            faq.setUandP(username,password);
            faq.torontoLabel.setText("Ville de Toronto");
            faq.faqLabel.setText("Questions Fréquemment Posées");
            faq.mainLabel.setText("PRINCIPALE");
            if(loggedIn){
                    faq.logoutLabel.setText("CONNECTEZ-OUT");
            }
            faq.setVisible(true);
            close();            
        }
    }

    // Opens portal and closes Main Screen
    // Sets language to english
    private void englishButtonActionPerformed(java.awt.event.ActionEvent evt) {

        english = true;
        PortalScreen portal = new PortalScreen();
        portal.setLanguage(english);
        portal.setLogIn(loggedIn);
        portal.setUandP(username,password);
        portal.torontoLabel.setText("City of Toronto");
        portal.qlLabel.setText("QUICK LINKS >>");
        portal.quoteLabel.setText("Keeping Our City Streets Clean and Safe...");
        portal.registerRB.setText("Register");
        portal.loginRB.setText("Login");
        portal.deleteRB.setText("Delete account");
        portal.reportRB.setText("Report a Problem");
        portal.viewreportsRB.setText("View Reports");
        portal.contactRB.setText("Contact us");
        portal.goButton.setText("GO");
        portal.mainLabel.setText("MAIN");
        if(loggedIn){
                    portal.logoutLabel.setText("LOGOUT");
                }
        portal.setVisible(true);
        close();
    }

    // Opens portal and closes main menu
    // Sets language to French
    private void frenchButtonActionPerformed(java.awt.event.ActionEvent evt) {
        english = false;
        PortalScreen portal = new PortalScreen();
        portal.setLanguage(english);
        portal.setLogIn(loggedIn);
        portal.setUandP(username,password);
        portal.torontoLabel.setText("Ville de Toronto");
        portal.qlLabel.setText("LIENS RAPIDES >>");
        portal.quoteLabel.setText("Garder Les Rues de Notre Ville Propres et Sécuritaires...");
        portal.registerRB.setText("Registre");
        portal.loginRB.setText("S'identifier");
        portal.deleteRB.setText("Supprimer le compte");
        portal.reportRB.setText("Signaler un problème");
        portal.viewreportsRB.setText("Afficher les rapports");
        portal.contactRB.setText("Contactez nous");
        portal.goButton.setText("Aller");
        portal.mainLabel.setText("PRINCIPALE");
        if(loggedIn){
                    portal.logoutLabel.setText("CONNECTEZ-OUT");
                }
        portal.setVisible(true);
        close();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainScreen().setVisible(true);
            }
        });
    }

    // Variables declaration
    private javax.swing.JLabel cypressLabel;
    private javax.swing.JButton englishButton;
    private javax.swing.JLabel faqLabel;
    private javax.swing.JButton frenchButton;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel torontoLabel;
    private javax.swing.JLabel toronto_img;
    public boolean english = false;
    public boolean loggedIn = false;
    public String username, password;
}
