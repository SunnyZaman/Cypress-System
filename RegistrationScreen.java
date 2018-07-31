/**
 * Cypress System
 * Registration Screen
 * Users can register an account
 */
import java.awt.Color;
import java.sql.*;
import javax.swing.*;
// Registration Screen
public class RegistrationScreen extends javax.swing.JFrame {    
    //Creates new form RegistrationScreen
    public RegistrationScreen() {
        initComponents();
        conn = DatabaseConnection.ConnecrDb();
    }
    // Set the language. If english is true, then the language is English.
    // If english is false, then the language is French.
    public void setLanguage (boolean eng){
        english = eng;
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
     // Close registration screen
     public void close(){
       this.setVisible(false);
    }
     
    //initComponents
    private void initComponents() {

        registerPanel = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        cypressLabel = new javax.swing.JLabel();
        torontoLabel = new javax.swing.JLabel();
        faqLabel = new javax.swing.JLabel();
        infoLabel = new javax.swing.JLabel();
        logoutLabel = new javax.swing.JLabel();
        fnameLabel = new javax.swing.JLabel();
        lnameLabel = new javax.swing.JLabel();
        addressLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        phoneLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        getPhone1 = new javax.swing.JTextField();
        dash1 = new javax.swing.JLabel();
        getPhone2 = new javax.swing.JTextField();
        dash2 = new javax.swing.JLabel();
        getPhone3 = new javax.swing.JTextField();
        getAddress = new javax.swing.JTextField();
        getLname = new javax.swing.JTextField();
        getFname = new javax.swing.JTextField();
        getEmail = new javax.swing.JTextField();
        getUsername = new javax.swing.JTextField();
        registerButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        emailaddressLabel = new javax.swing.JLabel();
        getPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(550, 100));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        registerPanel.setBackground(new java.awt.Color(235, 235, 235));

        jSeparator1.setForeground(new java.awt.Color(51, 51, 51));

        cypressLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); 
        cypressLabel.setText("CYPRESS");

        torontoLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); 
        torontoLabel.setText("Ville de toronto");

        faqLabel.setFont(new java.awt.Font("Times New Roman", 0, 16)); 
        faqLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        faqLabel.setText("FAQ");
        faqLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                faqLabelMouseClicked(evt);
            }
        });

        infoLabel.setFont(new java.awt.Font("Times New Roman", 1, 21)); 
        infoLabel.setText("Veuillez saisir l'information ci-dessous:");

        logoutLabel.setFont(new java.awt.Font("Times New Roman", 0, 17)); 
        logoutLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutLabelMouseClicked(evt);
            }
        });

        fnameLabel.setFont(new java.awt.Font("Times New Roman", 0, 18)); 
        fnameLabel.setText("First Name:");

        lnameLabel.setFont(new java.awt.Font("Times New Roman", 0, 18)); 
        lnameLabel.setText("Nom de Famille:");

        addressLabel.setFont(new java.awt.Font("Times New Roman", 0, 18)); 
        addressLabel.setText("Adresse:");

        passwordLabel.setFont(new java.awt.Font("Times New Roman", 0, 18)); 
        passwordLabel.setText("Mot de Passe:");

        phoneLabel.setFont(new java.awt.Font("Times New Roman", 0, 18)); 
        phoneLabel.setText("NumÃ©ro de tÃ©lÃ©phone:");

        emailLabel.setFont(new java.awt.Font("Times New Roman", 0, 18)); 
        emailLabel.setText("Adresse E-mail: ");

        usernameLabel.setFont(new java.awt.Font("Times New Roman", 0, 18)); 
        usernameLabel.setText("Nom d'utilisateur:");

        getPhone1.setFont(new java.awt.Font("Times New Roman", 0, 18)); 

        dash1.setFont(new java.awt.Font("Times New Roman", 0, 18)); 
        dash1.setText("-");

        getPhone2.setFont(new java.awt.Font("Times New Roman", 0, 18)); 

        dash2.setFont(new java.awt.Font("Times New Roman", 0, 18)); 
        dash2.setText("-");

        getPhone3.setFont(new java.awt.Font("Times New Roman", 0, 18)); 

        getAddress.setFont(new java.awt.Font("Times New Roman", 0, 18)); 

        getLname.setFont(new java.awt.Font("Times New Roman", 0, 18)); 

        getFname.setFont(new java.awt.Font("Times New Roman", 0, 18)); 

        getEmail.setFont(new java.awt.Font("Times New Roman", 0, 18)); 

        getUsername.setFont(new java.awt.Font("Times New Roman", 0, 18)); 

        registerButton.setFont(new java.awt.Font("Times New Roman", 0, 16)); 
        registerButton.setText("Registre");
        registerButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        cancelButton.setFont(new java.awt.Font("Times New Roman", 0, 16)); 
        cancelButton.setText("Annuler");
        cancelButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        emailaddressLabel.setFont(new java.awt.Font("Times New Roman", 0, 18)); 
        emailaddressLabel.setText("@cypress.on.ca");

        getPassword.setFont(new java.awt.Font("Times New Roman", 0, 18)); 

        javax.swing.GroupLayout registerPanelLayout = new javax.swing.GroupLayout(registerPanel);
        registerPanel.setLayout(registerPanelLayout);
        registerPanelLayout.setHorizontalGroup(
            registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(registerPanelLayout.createSequentialGroup()
                            .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, registerPanelLayout.createSequentialGroup()
                                    .addComponent(cypressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 370, Short.MAX_VALUE)
                                    .addComponent(torontoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(registerPanelLayout.createSequentialGroup()
                                    .addGap(9, 9, 9)
                                    .addComponent(infoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(logoutLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(16, 16, 16))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, registerPanelLayout.createSequentialGroup()
                            .addGap(54, 54, 54)
                            .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(phoneLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                                .addComponent(fnameLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lnameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(addressLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(emailLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(usernameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(passwordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(getAddress)
                                .addGroup(registerPanelLayout.createSequentialGroup()
                                    .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(registerPanelLayout.createSequentialGroup()
                                                .addComponent(getPhone1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(dash1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(getPhone2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(dash2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(getPhone3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(getFname, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                                            .addComponent(getLname)
                                            .addGroup(registerPanelLayout.createSequentialGroup()
                                                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(getUsername, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(getEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE))
                                                .addGap(18, 18, 18)
                                                .addComponent(emailaddressLabel))
                                            .addGroup(registerPanelLayout.createSequentialGroup()
                                                .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                                                .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(116, 116, 116)))
                                        .addComponent(getPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(0, 0, Short.MAX_VALUE)))))
                    .addComponent(faqLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        registerPanelLayout.setVerticalGroup(
            registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cypressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(torontoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logoutLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(infoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(registerPanelLayout.createSequentialGroup()
                        .addComponent(fnameLabel)
                        .addGap(18, 18, 18)
                        .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lnameLabel)
                            .addComponent(getLname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addressLabel)
                            .addComponent(getAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(phoneLabel)
                            .addComponent(getPhone1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dash1)
                            .addComponent(getPhone2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dash2)
                            .addComponent(getPhone3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(getFname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(emailLabel)
                    .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(getEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(emailaddressLabel)))
                .addGap(18, 18, 18)
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameLabel)
                    .addComponent(getUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLabel)
                    .addComponent(getPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(faqLabel)
                    .addComponent(registerButton)
                    .addComponent(cancelButton))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(registerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(registerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    // Go to the FAQ
    private void faqLabelMouseClicked(java.awt.event.MouseEvent evt) {
        if(english){
            FAQ faq = new FAQ();
            faq.setLanguage(english);
            faq.setLogIn(loggedIn);
            faq.setUandP(username,password);
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

    // Logout of the Cypress system
    private void logoutLabelMouseClicked(java.awt.event.MouseEvent evt) {
        if(loggedIn){
            if(english){
                PortalScreen portal = new PortalScreen();
                portal.logoutLabel.setText("");
                loggedIn = false;
                username = "";
                password = "";
                portal.setLanguage(english);
                portal.setLogIn(loggedIn);
                portal.setUandP(username,password);
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
                PortalScreen portal = new PortalScreen();
                portal.logoutLabel.setText("");
                loggedIn = false;
                username = "";
                password = "";
                portal.setLogIn(loggedIn);
                portal.setLanguage(english);
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
                portal.setVisible(true);
                close();
            }
        }
    }

    //registration - add user's username and password to database
    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {
       if(!getPhone1.getText().isEmpty() && !getPhone2.getText().isEmpty() && 
               !getPhone3.getText().isEmpty() && !getAddress.getText().isEmpty() && 
               !getLname.getText().isEmpty() && !getFname.getText().isEmpty() && 
               !getEmail.getText().isEmpty() && !getUsername.getText().isEmpty() && 
               !getPassword.getText().isEmpty()){
        try {
            String sql = "Insert into UserInfo(username,password) values (?,?)";
            pst = conn.prepareStatement(sql);
            pst.setString(1,getUsername.getText());
            pst.setString(2,getPassword.getText());            
            pst.execute();
            if(english){
                JOptionPane.showMessageDialog(null, "User Registered");
            }
            else{
                JOptionPane.showMessageDialog(null, "Utilisateur enregistré");
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
    }

    // Return to the portal
    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {
        if(english){
                PortalScreen portal = new PortalScreen();
                portal.setLogIn(loggedIn);
                portal.setLanguage(english);
                portal.setUandP(username,password);
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
                if(loggedIn){
                    portal.logoutLabel.setText("LOGOUT");
                }
                portal.mainLabel.setText("MAIN");
                portal.setVisible(true);
                close();
            }
            else{
                PortalScreen portal = new PortalScreen();
                portal.setLogIn(loggedIn);
                portal.setLanguage(english);
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
                if(loggedIn){
                    portal.logoutLabel.setText("CONNECTEZ-OUT");
                }
                portal.mainLabel.setText("PRINCIPALE");
                portal.setVisible(true);
                close();
            }
    }

    // Admin features
    private void formWindowOpened(java.awt.event.WindowEvent evt) {
        if(username != null && !username.isEmpty() && password!= null && !password.isEmpty()) { 
            boolean isAdmin = false;
            for (int i = 0; i<adminUsernames.length; i++){
                if(username.compareTo(adminUsernames[i])==0 && password.compareTo(adminPasswords[i])==0){
                    isAdmin = true;
                    break;
                }
            }
            if(isAdmin){
                registerPanel.setBackground(new Color(218,165,32));
            }
        }
    }

    // Variables declaration
    public javax.swing.JLabel addressLabel;
    public javax.swing.JButton cancelButton;
    private javax.swing.JLabel cypressLabel;
    private javax.swing.JLabel dash1;
    private javax.swing.JLabel dash2;
    public javax.swing.JLabel emailLabel;
    private javax.swing.JLabel emailaddressLabel;
    private javax.swing.JLabel faqLabel;
    public javax.swing.JLabel fnameLabel;
    private javax.swing.JTextField getAddress;
    private javax.swing.JTextField getEmail;
    private javax.swing.JTextField getFname;
    private javax.swing.JTextField getLname;
    private javax.swing.JPasswordField getPassword;
    private javax.swing.JTextField getPhone1;
    private javax.swing.JTextField getPhone2;
    private javax.swing.JTextField getPhone3;
    private javax.swing.JTextField getUsername;
    public javax.swing.JLabel infoLabel;
    private javax.swing.JSeparator jSeparator1;
    public javax.swing.JLabel lnameLabel;
    public javax.swing.JLabel logoutLabel;
    public javax.swing.JLabel passwordLabel;
    public javax.swing.JLabel phoneLabel;
    public javax.swing.JButton registerButton;
    private javax.swing.JPanel registerPanel;
    public javax.swing.JLabel torontoLabel;
    public javax.swing.JLabel usernameLabel;
    public boolean english, loggedIn;
    public String username, password;
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    public String[] adminUsernames = new String[]{"admin1", "admin2", "admin3"};
    public String[] adminPasswords = new String[]{"pass1", "pass2", "pass3"};    
}
