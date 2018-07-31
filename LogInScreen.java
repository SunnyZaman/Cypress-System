/**
 * Cypress System
 * Login Screen
 * Users can login into their cypress accounts
 */
import java.sql.*;
import javax.swing.*;

public class LogInScreen extends javax.swing.JFrame {
    //Creates new form LogInScreen  
    public LogInScreen() {
        initComponents();
        conn = DatabaseConnection.ConnecrDb();
    }
    // Set the language. If english is true, then the language is English.
    // If english is false, then the language is French.
    public void setLanguage (boolean eng){
        english = eng;
    }
    // Closes LoginScreen
    public void close(){
       this.setVisible(false);
    }

    //initComponents
    private void initComponents() {

        loginPanel = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        cypressTitleLabel = new javax.swing.JLabel();
        torontoLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        loginTextArea = new javax.swing.JTextArea();
        usernameLabel1 = new javax.swing.JLabel();
        getUsername = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        usernameLabel2 = new javax.swing.JLabel();
        faqLabel = new javax.swing.JLabel();
        getPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(235, 235, 235));
        setLocation(new java.awt.Point(550, 100));

        loginPanel.setBackground(new java.awt.Color(235, 235, 235));

        jSeparator1.setForeground(new java.awt.Color(51, 51, 51));

        cypressTitleLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); 
        cypressTitleLabel.setText("CYPRESS");

        torontoLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); 
        torontoLabel.setText(" Ville de toronto");

        jScrollPane1.setForeground(new java.awt.Color(240, 240, 240));
        jScrollPane1.setOpaque(false);

        loginTextArea.setEditable(false);
        loginTextArea.setBackground(new java.awt.Color(235, 235, 235));
        loginTextArea.setColumns(20);
        loginTextArea.setFont(new java.awt.Font("Times New Roman", 1, 20)); 
        loginTextArea.setRows(5);
        loginTextArea.setText("You are currently at the Cypress Login Page. By logging into this system, you \nwill be able to report a variety of problems as you have witnessed on \nthe streets of Toronto.");
        loginTextArea.setAutoscrolls(false);
        loginTextArea.setOpaque(false);
        jScrollPane1.setViewportView(loginTextArea);

        usernameLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); 
        usernameLabel1.setText("Username:");

        getUsername.setFont(new java.awt.Font("Times New Roman", 0, 18)); 

        passwordLabel.setFont(new java.awt.Font("Times New Roman", 0, 18)); 
        passwordLabel.setText("mot de passe:");

        loginButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); 
        loginButton.setText("S'identifier");
        loginButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        cancelButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); 
        cancelButton.setText("jButton2");
        cancelButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        usernameLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); 
        usernameLabel2.setText("d'utilisateur");

        faqLabel.setFont(new java.awt.Font("Times New Roman", 0, 16)); 
        faqLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        faqLabel.setText("FAQ");
        faqLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                faqLabelMouseClicked(evt);
            }
        });

        getPassword.setFont(new java.awt.Font("Times New Roman", 0, 18)); 

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, loginPanelLayout.createSequentialGroup()
                            .addGap(146, 146, 146)
                            .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(usernameLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(usernameLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(passwordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE))
                            .addGap(29, 29, 29)
                            .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(getUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(getPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(loginPanelLayout.createSequentialGroup()
                            .addGap(26, 26, 26)
                            .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(loginPanelLayout.createSequentialGroup()
                                    .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(loginPanelLayout.createSequentialGroup()
                                            .addComponent(cypressTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 370, Short.MAX_VALUE)
                                            .addComponent(torontoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jSeparator1)
                                        .addComponent(jScrollPane1))
                                    .addGap(16, 16, 16))
                                .addComponent(faqLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGap(241, 241, 241)
                        .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88)
                        .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cypressTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(torontoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(usernameLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(usernameLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(passwordLabel)
                            .addComponent(getPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(57, 57, 57)
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(loginButton)
                            .addComponent(cancelButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(faqLabel)
                        .addContainerGap())
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(getUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    // When login button is clicked, Login to account if username and password are correct
    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {
        String sql = "select * from UserInfo where username=? and password=?";
        try{
        pst = conn.prepareStatement(sql);
        pst.setString(1, getUsername.getText());
        pst.setString(2, getPassword.getText());
        
        rs = pst.executeQuery();
        if(rs.next()){
            loggedIn = true;
            //send to delete screen, so when you delete your account you logout
            uName = getUsername.getText();
            pass = getPassword.getText();
            DeleteAccountScreen delete = new DeleteAccountScreen();
            delete.setUandP(uName,pass);
            
            if(english){
                JOptionPane.showMessageDialog(null,"Username and Password: Correct");
                PortalScreen portal = new PortalScreen();
                portal.setUandP(uName,pass);
                portal.setLogIn(loggedIn);
                portal.logoutLabel.setText("LOGOUT");
                portal.setLanguage(english);
                portal.torontoLabel.setText("City of Toronto");
                portal.qlLabel.setText("QUICK LINKS >>");
                portal.quoteLabel.setText("Keeping Our City Streets Clean and Safe...");
                portal.registerRB.setText("Register");
                portal.loginRB.setText("Login");
                portal.deleteRB.setText("Delete Account");
                portal.reportRB.setText("Report a Problem");
                portal.viewreportsRB.setText("View Reports");
                portal.contactRB.setText("Contact us");
                portal.goButton.setText("GO");
                portal.mainLabel.setText("MAIN");
                portal.setVisible(true);
                close();
            }
            else{
                JOptionPane.showMessageDialog(null,"Nom d'utilisateur et mot de passe: Correct");
                PortalScreen portal = new PortalScreen();
                portal.setLogIn(loggedIn);
                portal.setUandP(uName,pass);
                portal.logoutLabel.setText("CONNECTEZ-OUT");
                portal.setLanguage(english);
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
                portal.setVisible(true);
                close();
            }
        }
        else{
            if(english){
                JOptionPane.showMessageDialog(null,"Username and Password: Incorrect");
            }
            else{
            JOptionPane.showMessageDialog(null,"Nom d'utilisateur et mot de passe: Incorrect");
            }
        }
    }
    catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
    }
    finally {
        try{
            rs.close(); pst.close(); }
        catch(Exception e) { } }
    }

    // Return to the portal
    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {
        if(english){
                PortalScreen portal = new PortalScreen();
                portal.setLogIn(loggedIn);
                portal.setLanguage(english);
                portal.torontoLabel.setText("City of Toronto");
                portal.qlLabel.setText("QUICK LINKS >>");
                portal.quoteLabel.setText("Keeping Our City Streets Clean and Safe...");
                portal.registerRB.setText("Register");
                portal.loginRB.setText("Login");
                portal.deleteRB.setText("Delete Account");
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
            else{
                PortalScreen portal = new PortalScreen();
                portal.setLogIn(loggedIn);
                portal.setLanguage(english);
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
    }

    // Open faq and close login screen
    private void faqLabelMouseClicked(java.awt.event.MouseEvent evt) {
        if(english){
            FAQ faq = new FAQ();
            faq.setLanguage(english);
            faq.setLogIn(loggedIn);
            faq.torontoLabel.setText("City of Toronto");
            faq.faqLabel.setText("Frequent Asked Questions");
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

    // Variables declaration
    public javax.swing.JButton cancelButton;
    private javax.swing.JLabel cypressTitleLabel;
    private javax.swing.JLabel faqLabel;
    private javax.swing.JPasswordField getPassword;
    private javax.swing.JTextField getUsername;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    public javax.swing.JButton loginButton;
    private javax.swing.JPanel loginPanel;
    public javax.swing.JTextArea loginTextArea;
    public javax.swing.JLabel passwordLabel;
    public javax.swing.JLabel torontoLabel;
    public javax.swing.JLabel usernameLabel1;
    public javax.swing.JLabel usernameLabel2;
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;    
    private boolean english;
    public boolean loggedIn;
    public String uName, pass;
}
