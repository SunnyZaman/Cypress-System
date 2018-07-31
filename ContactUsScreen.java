/**
 * Cypress System
 * Contact Us Screen
 * Displaying contact information
 */
import java.awt.Color;
import javax.swing.*;
//ContactUsScreen
public class ContactUsScreen extends javax.swing.JFrame {
    // Creates new form ContactUsScreen
    public ContactUsScreen() {
        initComponents();
        sendLabel.requestFocus();
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
    // Close the ContactUsScreen frame
    public void close(){
       this.setVisible(false);
    }

    //initComponents
    private void initComponents() {

        contactPanel = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        cypressLabel = new javax.swing.JLabel();
        torontoLabel = new javax.swing.JLabel();
        faqLabel = new javax.swing.JLabel();
        contactLabel = new javax.swing.JLabel();
        logoutLabel = new javax.swing.JLabel();
        address_img = new javax.swing.JLabel();
        getName = new javax.swing.JTextField();
        getEmail = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        getMessage = new javax.swing.JTextArea();
        contactAddress = new javax.swing.JLabel();
        phone_img = new javax.swing.JLabel();
        mail_img = new javax.swing.JLabel();
        contactPhone = new javax.swing.JLabel();
        contactEmail = new javax.swing.JLabel();
        sendLabel = new javax.swing.JButton();
        backButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(550, 100));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        contactPanel.setBackground(new java.awt.Color(235, 235, 235));

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

        contactLabel.setFont(new java.awt.Font("Times New Roman", 1, 21)); 
        contactLabel.setText("Contactez-nous Ã :");

        logoutLabel.setFont(new java.awt.Font("Times New Roman", 0, 17)); 
        logoutLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutLabelMouseClicked(evt);
            }
        });

        address_img.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        address_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/location_icon2.png"))); 

        getName.setFont(new java.awt.Font("Times New Roman", 0, 16)); 
        getName.setForeground(new java.awt.Color(153, 153, 153));
        getName.setText("Your Name");
        getName.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                getNameFocusGained(evt);
            }
        });
        getName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                getNameMouseClicked(evt);
            }
        });

        getEmail.setFont(new java.awt.Font("Times New Roman", 0, 16)); 
        getEmail.setForeground(new java.awt.Color(153, 153, 153));
        getEmail.setText("Email");
        getEmail.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                getEmailCaretUpdate(evt);
            }
        });
        getEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                getEmailFocusGained(evt);
            }
        });

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        getMessage.setColumns(20);
        getMessage.setFont(new java.awt.Font("Times New Roman", 0, 16)); 
        getMessage.setForeground(new java.awt.Color(153, 153, 153));
        getMessage.setRows(5);
        getMessage.setText("Your Message");
        getMessage.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                getMessageCaretUpdate(evt);
            }
        });
        getMessage.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                getMessageFocusGained(evt);
            }
        });
        jScrollPane1.setViewportView(getMessage);

        contactAddress.setFont(new java.awt.Font("Times New Roman", 1, 18)); 
        contactAddress.setText("123 Main Street, Toronto");

        phone_img.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        phone_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/phone_icon.png"))); 

        mail_img.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mail_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mail_icon.png"))); 

        contactPhone.setFont(new java.awt.Font("Times New Roman", 1, 18)); 
        contactPhone.setText("647-987-654");

        contactEmail.setFont(new java.awt.Font("Times New Roman", 1, 18)); 
        contactEmail.setText("cypresstoronto@cypress.on.ca");

        sendLabel.setFont(new java.awt.Font("Times New Roman", 0, 16)); 
        sendLabel.setText("Envoyer le Message");
        sendLabel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        sendLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendLabelActionPerformed(evt);
            }
        });

        backButton.setFont(new java.awt.Font("Times New Roman", 0, 16)); 
        backButton.setText("Retourner");
        backButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contactPanelLayout = new javax.swing.GroupLayout(contactPanel);
        contactPanel.setLayout(contactPanelLayout);
        contactPanelLayout.setHorizontalGroup(
            contactPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contactPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(contactPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(contactPanelLayout.createSequentialGroup()
                        .addGroup(contactPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, contactPanelLayout.createSequentialGroup()
                                .addComponent(cypressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 370, Short.MAX_VALUE)
                                .addComponent(torontoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, contactPanelLayout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(contactPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(contactPanelLayout.createSequentialGroup()
                                        .addComponent(contactLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(logoutLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(contactPanelLayout.createSequentialGroup()
                                        .addGroup(contactPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(contactPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(contactPanelLayout.createSequentialGroup()
                                                    .addComponent(address_img, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(contactAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(contactPhone, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(contactPanelLayout.createSequentialGroup()
                                                .addGroup(contactPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(mail_img, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                                                    .addComponent(phone_img, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(contactPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(contactEmail))))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(contactPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
                                            .addComponent(getEmail)
                                            .addComponent(getName))
                                        .addGap(17, 17, 17)))))
                        .addGap(16, 16, 16))
                    .addComponent(faqLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contactPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sendLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(137, 137, 137))
        );
        contactPanelLayout.setVerticalGroup(
            contactPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contactPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contactPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cypressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(torontoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contactPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logoutLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contactLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(contactPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contactPanelLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(contactAddress))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contactPanelLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(contactPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contactPanelLayout.createSequentialGroup()
                                .addComponent(getName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(getEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(address_img, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(contactPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(contactPanelLayout.createSequentialGroup()
                        .addGroup(contactPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(phone_img, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(contactPanelLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(contactPhone)))
                        .addGroup(contactPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contactPanelLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(mail_img, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(contactPanelLayout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(contactEmail)))))
                .addGap(18, 18, 18)
                .addGroup(contactPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sendLabel)
                    .addComponent(backButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(faqLabel)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contactPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contactPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    // When the faq label is clicked, send the required information and data to FAQ.
    // Open FAQ and close Contact Us screen.
    private void faqLabelMouseClicked(java.awt.event.MouseEvent evt) {
        // English
        if(english){
            FAQ faq = new FAQ();
            faq.setLanguage(english);
            faq.setLogIn(loggedIn);
            faq.setUandP(username,password);
            faq.torontoLabel.setText("City of Toronto");
            faq.faqLabel.setText("Frequently Asked Questions");
            faq.mainLabel.setText("MAIN");
            if(loggedIn){
                    faq.logoutLabel.setText("LOGOUT");
            }
            faq.setVisible(true);
            close();
        }
        // French
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
            // English
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
            // French
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

    // Delete text in the name textfield and set text color to black.
    private void getNameFocusGained(java.awt.event.FocusEvent evt) {
        getName.setText("");
        getName.setForeground(Color.BLACK);
    }

    // Delete text in the email textfield and set text color to black.
    private void getEmailFocusGained(java.awt.event.FocusEvent evt) {
        getEmail.setText("");
        getEmail.setForeground(Color.BLACK);
    }

    // Delete text in the message textarea and set text color to black.
    private void getMessageFocusGained(java.awt.event.FocusEvent evt) {
        getMessage.setText("");
        getMessage.setForeground(Color.BLACK);
    }

    // When name, email, and message are filled in, send user a notification that
    // the message has been sent.
    private void sendLabelActionPerformed(java.awt.event.ActionEvent evt) {
        if(!getName.getText().isEmpty() && !getEmail.getText().isEmpty() && 
               !getMessage.getText().isEmpty() && name && email && message){
            JOptionPane.showMessageDialog(null, "Message Sent");
        }
    }

    // When the back button is clicked, send the data and required information to
    // the portal. Open the portal and close the contact us screen.
    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // English
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

    // Making sure the textfields are filled and updated
    private void getNameMouseClicked(java.awt.event.MouseEvent evt) {
        name = true;
    }

    // Making sure the textfields are filled and updated
    private void getEmailCaretUpdate(javax.swing.event.CaretEvent evt) {
        email = true;
    }

    // Making sure the textfields are filled and updated
    private void getMessageCaretUpdate(javax.swing.event.CaretEvent evt) {
        message = true;
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
                contactPanel.setBackground(new Color(218,165,32));
            }
        }
    }

    // Variables declaration
    private javax.swing.JLabel address_img;
    public javax.swing.JButton backButton;
    private javax.swing.JLabel contactAddress;
    private javax.swing.JLabel contactEmail;
    public javax.swing.JLabel contactLabel;
    private javax.swing.JPanel contactPanel;
    private javax.swing.JLabel contactPhone;
    private javax.swing.JLabel cypressLabel;
    private javax.swing.JLabel faqLabel;
    private javax.swing.JTextField getEmail;
    private javax.swing.JTextArea getMessage;
    private javax.swing.JTextField getName;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    public javax.swing.JLabel logoutLabel;
    private javax.swing.JLabel mail_img;
    private javax.swing.JLabel phone_img;
    public javax.swing.JButton sendLabel;
    public javax.swing.JLabel torontoLabel;
    public boolean english, loggedIn;
    public boolean name, email, message;
    public String username, password;
    public String[] adminUsernames = new String[]{"admin1", "admin2", "admin3"};
    public String[] adminPasswords = new String[]{"pass1", "pass2", "pass3"};
}
