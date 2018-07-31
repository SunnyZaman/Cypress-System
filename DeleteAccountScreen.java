/**
 * Cypress System
 * Delete Account
 * This screen allows to delete an account on the cypress system
 */
import java.awt.Color;
import java.sql.*;
import javax.swing.*;
// DeletAccountScreen
public class DeleteAccountScreen extends javax.swing.JFrame {
    // Creates new form DeleteAccountScreen
    public DeleteAccountScreen() {
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
    public void setLogIn(boolean logged){
        loggedIn = logged;
    }
    // Set the username and password.
    public void setUandP(String uname,String pass){
        username = uname;
        password = pass;
     }
    // Close the DeleteAccountScreen frame
    public void close(){
       this.setVisible(false);
    }

    //initComponents
    private void initComponents() {

        deletePanel = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        cypressLabel = new javax.swing.JLabel();
        torontoLabel = new javax.swing.JLabel();
        faqLabel = new javax.swing.JLabel();
        informationLabel = new javax.swing.JLabel();
        logoutLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        getEmail = new javax.swing.JTextField();
        getUsername = new javax.swing.JTextField();
        deleteButton = new javax.swing.JButton();
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

        deletePanel.setBackground(new java.awt.Color(235, 235, 235));

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

        informationLabel.setFont(new java.awt.Font("Times New Roman", 1, 21)); 
        informationLabel.setText("Veuillez saisir l'information ci-dessous:");

        logoutLabel.setFont(new java.awt.Font("Times New Roman", 0, 17)); 
        logoutLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutLabelMouseClicked(evt);
            }
        });

        passwordLabel.setFont(new java.awt.Font("Times New Roman", 0, 18)); 
        passwordLabel.setText("Mot de Passe:");

        emailLabel.setFont(new java.awt.Font("Times New Roman", 0, 18)); 
        emailLabel.setText("Adresse E-mail: ");

        usernameLabel.setFont(new java.awt.Font("Times New Roman", 0, 18)); 
        usernameLabel.setText("Nom d'utilisateur:");

        getEmail.setFont(new java.awt.Font("Times New Roman", 0, 18)); 

        getUsername.setFont(new java.awt.Font("Times New Roman", 0, 18)); 

        deleteButton.setFont(new java.awt.Font("Times New Roman", 0, 16)); 
        deleteButton.setText("Effacer");
        deleteButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
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

        javax.swing.GroupLayout deletePanelLayout = new javax.swing.GroupLayout(deletePanel);
        deletePanel.setLayout(deletePanelLayout);
        deletePanelLayout.setHorizontalGroup(
            deletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deletePanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(deletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(deletePanelLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(deletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(deletePanelLayout.createSequentialGroup()
                                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(deletePanelLayout.createSequentialGroup()
                                .addGroup(deletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(emailLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(usernameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                                    .addComponent(passwordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(deletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(getUsername)
                                    .addComponent(getEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                                    .addComponent(getPassword))))
                        .addGroup(deletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(deletePanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(emailaddressLabel))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, deletePanelLayout.createSequentialGroup()
                                .addGap(149, 149, 149)
                                .addComponent(faqLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(deletePanelLayout.createSequentialGroup()
                        .addGroup(deletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(logoutLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(deletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, deletePanelLayout.createSequentialGroup()
                                    .addComponent(cypressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 315, Short.MAX_VALUE)
                                    .addComponent(torontoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(informationLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 642, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(86, Short.MAX_VALUE))))
        );
        deletePanelLayout.setVerticalGroup(
            deletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deletePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(deletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cypressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(torontoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(logoutLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(informationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(deletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLabel)
                    .addComponent(getEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailaddressLabel))
                .addGap(36, 36, 36)
                .addGroup(deletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameLabel)
                    .addComponent(getUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(deletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(getPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordLabel))
                .addGap(46, 46, 46)
                .addGroup(deletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, deletePanelLayout.createSequentialGroup()
                        .addComponent(faqLabel)
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, deletePanelLayout.createSequentialGroup()
                        .addGroup(deletePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cancelButton)
                            .addComponent(deleteButton))
                        .addGap(52, 52, 52))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(deletePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(deletePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    // When the faq label is clicked, send the required information and data to FAQ.
    // Open FAQ and close Contact Us screen.
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

    // When the logout label is click, set loggedIn, username, and password to null values.
    // Send information and Data to Portal Screen. Open portal and close contact us screen.
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
                portal.setVisible(true);
                close();
            }
        }
    }

    // Delete user when delete button is clicked
    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {
        try{
            String sql = "select * from UserInfo where username=? and password=?";
            try{
                pst = conn.prepareStatement(sql);
                pst.setString(1, getUsername.getText());
                pst.setString(2, getPassword.getText());
                rs = pst.executeQuery();
                if(rs.next()){
                    String sql2 = "delete from UserInfo where username =?";
                    try{
                        pst = conn.prepareStatement(sql2);
                        pst.setString(1, getUsername.getText());               
                        pst.execute();
                        if(english){
                            JOptionPane.showMessageDialog(null, "User Deleted");
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "Utilisateur supprimÃ©");
                        }
                        if(username.compareTo(getUsername.getText()) == 0 && password.compareTo(getPassword.getText())== 0){
                            loggedIn = false;
                            username="";
                            password="";
                            if(english == true){
                                JOptionPane.showMessageDialog(null,"This account has been deleted");
                                DeleteAccountScreen delete = new DeleteAccountScreen();
                                delete.setLanguage(english);
                                delete.setLogIn(loggedIn);
                                delete.setUandP(username,password);
                                delete.torontoLabel.setText("City of Toronto");
                                delete.informationLabel.setText("Please enter information below to delete account:");
                                delete.emailLabel.setText("E-mail Address:");
                                delete.usernameLabel.setText("Username:");
                                delete.passwordLabel.setText("Password:");
                                delete.deleteButton.setText("Delete");
                                delete.cancelButton.setText("Cancel");
                                if(loggedIn){
                                    delete.logoutLabel.setText("LOGOUT");
                                }
                                delete.setVisible(true);
                                close();        
                            }
                            else{
                                JOptionPane.showMessageDialog(null,"Ce compte a été supprimé");
                                DeleteAccountScreen delete = new DeleteAccountScreen();
                                delete.setLanguage(english);
                                delete.setLogIn(loggedIn);
                                delete.setUandP(username,password);
                                delete.torontoLabel.setText("Ville de toronto");
                                delete.informationLabel.setText("Veuillez saisir les informations ci-dessous pour supprimer le compte:");
                                delete.emailLabel.setText("Adresse E-mail:");
                                delete.usernameLabel.setText("Nom d'utilisateur:");
                                delete.passwordLabel.setText("Mot de Passe:");
                                delete.deleteButton.setText("Effacer");
                                delete.cancelButton.setText("Annuler");
                                if(loggedIn){
                                    delete.logoutLabel.setText("CONNECTEZ-OUT");
                                }
                                delete.setVisible(true);
                                close();
                            }
                        }
                    }
                    catch(Exception e){
                        //JOptionPane.showMessageDialog(null, e);
                    }
                    finally {
                        try{
                            rs.close(); pst.close(); }
                        catch(Exception e) { } }
                    }
                }
                catch(Exception e){
                    //JOptionPane.showMessageDialog(null, "Incorrect User");
                }
                 finally {
                        try{
                        rs.close(); pst.close(); }
                        catch(Exception e) { } }
           }
           catch(Exception e){
                //JOptionPane.showMessageDialog(null, "Incorrect User");
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
    // If an admin is logged in display admin features
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
                deletePanel.setBackground(new Color(218,165,32));
            }
        }
    }

    // Variables declaration
    public javax.swing.JButton cancelButton;
    private javax.swing.JLabel cypressLabel;
    public javax.swing.JButton deleteButton;
    private javax.swing.JPanel deletePanel;
    public javax.swing.JLabel emailLabel;
    private javax.swing.JLabel emailaddressLabel;
    private javax.swing.JLabel faqLabel;
    private javax.swing.JTextField getEmail;
    private javax.swing.JPasswordField getPassword;
    private javax.swing.JTextField getUsername;
    public javax.swing.JLabel informationLabel;
    private javax.swing.JSeparator jSeparator1;
    public javax.swing.JLabel logoutLabel;
    public javax.swing.JLabel passwordLabel;
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
