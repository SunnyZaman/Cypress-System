/**
 * Cypress System
 * Portal Screen
 * The portal - displays the  options to the user
 */
import java.awt.Color;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
// Portal Screen
public class PortalScreen extends javax.swing.JFrame {
    // Creates new form PortalScreen
    public PortalScreen() {
        initComponents();
        accessLabel.setVisible(false);
        solutionRB.setVisible(false);
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
    // Close portal screen 
    public void close(){
       this.setVisible(false);
    }

    //initComponents
    private void initComponents() {

        portalPanel = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        cypressLabel = new javax.swing.JLabel();
        torontoLabel = new javax.swing.JLabel();
        goButton = new javax.swing.JButton();
        faqLabel = new javax.swing.JLabel();
        qlLabel = new javax.swing.JLabel();
        registerRB = new javax.swing.JRadioButton();
        loginRB = new javax.swing.JRadioButton();
        deleteRB = new javax.swing.JRadioButton();
        reportRB = new javax.swing.JRadioButton();
        viewreportsRB = new javax.swing.JRadioButton();
        contactRB = new javax.swing.JRadioButton();
        city1_img = new javax.swing.JLabel();
        logoutLabel = new javax.swing.JLabel();
        city2_img = new javax.swing.JLabel();
        quoteLabel = new javax.swing.JLabel();
        mainLabel = new javax.swing.JLabel();
        accessLabel = new javax.swing.JLabel();
        solutionRB = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(550, 100));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        portalPanel.setBackground(new java.awt.Color(235, 235, 235));

        jSeparator1.setForeground(new java.awt.Color(51, 51, 51));

        cypressLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); 
        cypressLabel.setText("CYPRESS");

        torontoLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); 
        torontoLabel.setText("Ville de toronto");

        goButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); 
        goButton.setText("Aller");
        goButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        goButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goButtonActionPerformed(evt);
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

        qlLabel.setFont(new java.awt.Font("Times New Roman", 1, 21)); 
        qlLabel.setText("Liens rapides >>");

        registerRB.setText("Registre");
        registerRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerRBActionPerformed(evt);
            }
        });

        loginRB.setText("S'identifier");
        loginRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginRBActionPerformed(evt);
            }
        });

        deleteRB.setText("Supprimer le compte");
        deleteRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteRBActionPerformed(evt);
            }
        });

        reportRB.setText("Signaler un problÃ¨me");
        reportRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportRBActionPerformed(evt);
            }
        });

        viewreportsRB.setText("Afficher les rapports");
        viewreportsRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewreportsRBActionPerformed(evt);
            }
        });

        contactRB.setText("Contactez nous");
        contactRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactRBActionPerformed(evt);
            }
        });

        city1_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/toronto_steets_2.jpg"))); 
        city1_img.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        logoutLabel.setFont(new java.awt.Font("Times New Roman", 0, 17)); 
        logoutLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutLabelMouseClicked(evt);
            }
        });

        city2_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/toronto_steets_1.jpg"))); 
        city2_img.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        quoteLabel.setFont(new java.awt.Font("Times New Roman", 3, 16)); 
        quoteLabel.setText("Garder les rues de notre ville propres et sÃ©curitaires...");

        mainLabel.setFont(new java.awt.Font("Times New Roman", 0, 16)); 
        mainLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mainLabel.setText("PRINCIPALE");
        mainLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mainLabelMouseClicked(evt);
            }
        });

        accessLabel.setFont(new java.awt.Font("Times New Roman", 1, 16)); 
        accessLabel.setForeground(new java.awt.Color(204, 0, 51));
        accessLabel.setText("Login for Access!");

        solutionRB.setText("User Solutions");
        solutionRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solutionRBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout portalPanelLayout = new javax.swing.GroupLayout(portalPanel);
        portalPanel.setLayout(portalPanelLayout);
        portalPanelLayout.setHorizontalGroup(
            portalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(portalPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(portalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(faqLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(portalPanelLayout.createSequentialGroup()
                        .addGroup(portalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(portalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(portalPanelLayout.createSequentialGroup()
                                    .addComponent(cypressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 370, Short.MAX_VALUE)
                                    .addComponent(torontoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jSeparator1))
                            .addGroup(portalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(portalPanelLayout.createSequentialGroup()
                                    .addGroup(portalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(qlLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(portalPanelLayout.createSequentialGroup()
                                            .addGroup(portalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(registerRB, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(loginRB, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(deleteRB)
                                                .addComponent(reportRB, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(viewreportsRB, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(contactRB, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(mainLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                                            .addComponent(city1_img, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(portalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(city2_img, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(logoutLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, portalPanelLayout.createSequentialGroup()
                                    .addComponent(solutionRB)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(goButton, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(34, 34, 34)
                                    .addGroup(portalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(accessLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(quoteLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(16, 16, 16)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        portalPanelLayout.setVerticalGroup(
            portalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(portalPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(portalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cypressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(torontoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(portalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(portalPanelLayout.createSequentialGroup()
                        .addComponent(logoutLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(portalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(city2_img, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(city1_img))
                        .addGap(72, 72, 72))
                    .addGroup(portalPanelLayout.createSequentialGroup()
                        .addComponent(qlLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(portalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(portalPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 287, Short.MAX_VALUE)
                                .addGroup(portalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(goButton)
                                    .addComponent(quoteLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(13, 13, 13))
                            .addGroup(portalPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(registerRB)
                                .addGap(14, 14, 14)
                                .addComponent(loginRB)
                                .addGap(18, 18, 18)
                                .addComponent(deleteRB)
                                .addGap(18, 18, 18)
                                .addComponent(reportRB)
                                .addGap(18, 18, 18)
                                .addComponent(viewreportsRB)
                                .addGap(18, 18, 18)
                                .addComponent(contactRB)
                                .addGap(18, 18, 18)
                                .addComponent(solutionRB)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGroup(portalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(faqLabel)
                    .addComponent(mainLabel)
                    .addComponent(accessLabel))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(portalPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(portalPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    // Go to FAQ screen
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

    // When the go button is click along with a radio button, the user will be brought
    // to a screen which is influenced by the option/radio button the user chooses
    private void goButtonActionPerformed(java.awt.event.ActionEvent evt) {
        //REGISTER
        if(reg){            
           // user can register when not logged in
            if(english == true){
                RegistrationScreen register = new RegistrationScreen();
                register.setLanguage(english);
                register.setLogIn(loggedIn);
                register.setUandP(username,password);
                register.torontoLabel.setText("City of Toronto");
                register.infoLabel.setText("Please enter information below:");
                register.fnameLabel.setText("First Name:");
                register.lnameLabel.setText("Last name:");
                register.addressLabel.setText("Address:");
                register.phoneLabel.setText("Telephone Number:");
                register.emailLabel.setText("E-mail Address:");
                register.usernameLabel.setText("Username:");
                register.passwordLabel.setText("Password:");
                register.registerButton.setText("Register");
                register.cancelButton.setText("Cancel");
                if(loggedIn){
                    register.logoutLabel.setText("LOGOUT");
                }
                register.setVisible(true);
                close();        
            }
            else{
                 RegistrationScreen register = new RegistrationScreen();
                register.setLanguage(english);
                register.setLogIn(loggedIn);
                register.setUandP(username,password);
                register.torontoLabel.setText("Ville de toronto");
                register.infoLabel.setText("Veuillez saisir l'information ci-dessous:");
                register.fnameLabel.setText("Prénom:");
                register.lnameLabel.setText("Nom de Famille:");
                register.addressLabel.setText("Adresse:");
                register.phoneLabel.setText("Numéro de téléphone:");
                register.emailLabel.setText("Adresse E-mail:");
                register.usernameLabel.setText("Nom d'utilisateur:");
                register.passwordLabel.setText("Mot de Passe:");
                register.registerButton.setText("Registre");
                register.cancelButton.setText("Annuler");
                if(loggedIn){
                    register.logoutLabel.setText("CONNECTEZ-OUT");
                }
                register.setVisible(true);
                close();
            }
        }        
        //LOGIN
        if(log && loggedIn==false){
            if(english == true){
                LogInScreen logIn = new LogInScreen();
                logIn.setLanguage(english);
                logIn.loginTextArea.setText("You are currently at the Cypress Login Page. "
                + "By logging into this system, you will \nbe able to report a "
                + "variety of problems as you have witnessed \non the streets of "
                + "Toronto.");
                logIn.torontoLabel.setText("City of Toronto");
                logIn.usernameLabel1.setText("Username:");
                logIn.usernameLabel2.setText("");
                logIn.passwordLabel.setText("Password:");
                logIn.loginButton.setText("Login");
                logIn.cancelButton.setText("Cancel");
                logIn.setVisible(true);
                close();        
            }
            else{
                LogInScreen logIn = new LogInScreen();
                logIn.setLanguage(english);
                logIn.loginTextArea.setText("Vous êtes actuellement sur la page de connexion "
                        + "de Cypress. En vous connectant à  \nce système, vous pourrez "
                        + "signaler une variété de problèmes comme vous l'avez \nvu dans "
                        + "les rues de Toronto.");
                logIn.torontoLabel.setText("Ville de Toronto");
                logIn.usernameLabel1.setText("Nom");
                logIn.usernameLabel2.setText("d'utilisateur:");
                logIn.passwordLabel.setText("Mot de passe:");
                logIn.loginButton.setText("S'identifier");
                logIn.cancelButton.setText("Annuler");
                logIn.setVisible(true);
                close();
            }
        }
        //Delete Account
        if(del){
            
            //user can delete an account when not logged in
                if(english == true){
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
        // Report a Problem
        if(rep){
            // user has to be logged in to access the 'report a problem' screen
            if(loggedIn){ 
                if(english == true){
                    ReportProblemScreen reportP;
                    try {
                    reportP = new ReportProblemScreen();
                    reportP.getLanguage(english);
                    reportP.getLogIn(loggedIn);
                    reportP.getUandP(username,password);
                    reportP.torontoLabel.setText("City of Toronto");
                    reportP.addressLabel.setText("Address:");
                    reportP.problemsLabel.setText("PROBLEMS AT THE SITE:");
                    reportP.utilityRB.setText("Utility Failures");
                    reportP.potholesRB.setText("Potholes");
                    reportP.vandRB.setText("City Property Vandalism");
                    reportP.erosionRB.setText("Eroded Streets");
                    reportP.treeRB.setText("Tree Collapse");
                    reportP.floodRB.setText("Flooded Streets");
                    reportP.moldRB.setText("Mould and Spore Growth");
                    reportP.garbageRB.setText("Garbage or any Other Road "
                            + "Blocking Objects");
                    reportP.reportButton.setText("Report");
                    reportP.cancelButton.setText("Cancel");
                    reportP.logoutLabel.setText("LOGOUT");
                    reportP.setVisible(true);
                    close();  
                    } catch (IOException ex) {
                        Logger.getLogger(PortalScreen.class.getName()).log(Level.SEVERE, null, ex);
                    }
                          
                }
                else{
                    ReportProblemScreen reportP;
                    try {
                    reportP = new ReportProblemScreen();
                    reportP.getLanguage(english);
                    reportP.getLogIn(loggedIn);
                    reportP.getUandP(username,password);
                    reportP.torontoLabel.setText("Ville de toronto");
                    reportP.addressLabel.setText("Addresse");
                    reportP.problemsLabel.setText("PROBLÈMES DU SITE");
                    reportP.utilityRB.setText("Échec des services publics");
                    reportP.potholesRB.setText("Nids de poule");
                    reportP.vandRB.setText("Vandalisme de la ville");
                    reportP.erosionRB.setText("Rues érodées");
                    reportP.treeRB.setText("Collapse d'arbre");
                    reportP.floodRB.setText("Rues inondées");
                    reportP.moldRB.setText("Croissance des moisissures et"
                            + " des spores");
                    reportP.garbageRB.setText("Objets détritus et autres "
                            + "objets bloquant la circulation routière");
                    reportP.reportButton.setText("Rapport");
                    reportP.cancelButton.setText("Annuler");
                    reportP.logoutLabel.setText("CONNECTEZ-OUT");
                    reportP.setVisible(true);
                    close();
                    } catch (IOException ex) {
                        Logger.getLogger(PortalScreen.class.getName()).log(Level.SEVERE, null, ex);
                    }                    
                }
           }
            if(!loggedIn){
                if(!english){
                	accessLabel.setText("Connexion pour accéder!");
                }
                accessLabel.setVisible(true);
            }
        }        
        // Contact Us
        if(cont){
            
           // user can view contact information when not logged in
                if(english == true){
                    ContactUsScreen contact = new ContactUsScreen();
                    contact.setLanguage(english);
                    contact.setLogIn(loggedIn);
                    contact.setUandP(username,password);
                    contact.torontoLabel.setText("City of Toronto");
                    contact.contactLabel.setText("Contact us at:");
                    contact.sendLabel.setText("Send Message");
                    contact.backButton.setText("Go Back");
                    if(loggedIn){
                    contact.logoutLabel.setText("LOGOUT");
                }
                    contact.setVisible(true);
                    close();        
            }
            else{
                ContactUsScreen contact = new ContactUsScreen();
                contact.setLanguage(english);
                contact.setLogIn(loggedIn);
                contact.setUandP(username,password);
                contact.torontoLabel.setText("Ville de toronto");
                contact.contactLabel.setText("Contactez-nous à:");
                contact.sendLabel.setText("Envoyer le Message");
                contact.backButton.setText("Retourner");
                if(loggedIn){
                    contact.logoutLabel.setText("CONNECTEZ-OUT");
                }
                contact.setVisible(true);
                close();
            }
        }
        
        // View Report
        if(view){
            // user has to be logged in to view reports
            if(loggedIn){ 
                if(english == true){
                    ViewReportScreen viewR = new ViewReportScreen();
                    viewR.setLanguage(english);
                    viewR.setLogIn(loggedIn);
                    viewR.setUandP(username,password);
                    viewR.torontoLabel.setText("City of Toronto");
                    viewR.reportLabel.setText("Report");
                    viewR.logoutLabel.setText("LOGOUT");
                    viewR.cancelButton.setText("Cancel");
                    viewR.setVisible(true);
                    close();
                }
                else{
                    ViewReportScreen viewRe = new ViewReportScreen();
                    viewRe.close();
                    ViewReportScreen viewR = new ViewReportScreen();
                    viewR.setLanguage(english);
                    viewR.setLogIn(loggedIn);
                    viewR.setUandP(username,password);
                    viewR.torontoLabel.setText("Ville de toronto");
                    viewR.reportLabel.setText("Rapport");
                    viewR.logoutLabel.setText("CONNECTEZ-OUT");
                    viewR.cancelButton.setText("Annuler");
                    viewR.setVisible(true);
                    close();
                }
           }
            if(!loggedIn){
                if(!english){
                    accessLabel.setText("Connexion pour accéder!");
                }
                accessLabel.setVisible(true);
            }
        }        
        // User Solutions - only admin can view user submitted solutions.
        if(sol){
                if(english == true){
                    UserSolutionScreen uSolution = new UserSolutionScreen();
                    uSolution.setLanguage(english);
                    uSolution.setLogIn(loggedIn);
                    uSolution.setUandP(username,password);
                    uSolution.torontoLabel.setText("City of Toronto");
                    uSolution.solutionsLabel.setText("Solutions: ");
                    uSolution.cancelButton.setText("Cancel");
                    if(loggedIn){
                    uSolution.logoutLabel.setText("LOGOUT");
                }
                    uSolution.setVisible(true);
                    close();        
            }
            else{
                UserSolutionScreen uSolution = new UserSolutionScreen();
                uSolution.setLanguage(english);
                uSolution.setLogIn(loggedIn);
                uSolution.setUandP(username,password);
                uSolution.torontoLabel.setText("Ville de toronto");
                uSolution.solutionsLabel.setText("Solutions: ");
                uSolution.cancelButton.setText("Annuler");
                if(loggedIn){
                    uSolution.logoutLabel.setText("CONNECTEZ-OUT");
                }
                uSolution.setVisible(true);
                close();
            }
        }        
    }

    // Logout of the cypress system
    private void logoutLabelMouseClicked(java.awt.event.MouseEvent evt) {
        if(loggedIn){
            if(english){
                PortalScreen portal = new PortalScreen();
                portal.logoutLabel.setText("");
                loggedIn = false;
                portal.setLanguage(english);
                portal.setLogIn(loggedIn);
                username="";
                password="";
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
                portal.setLanguage(english);
                username="";
                password="";
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

    //Register Radio Button
    private void registerRBActionPerformed(java.awt.event.ActionEvent evt) {
        if(registerRB.isSelected()){
            registerRB.setSelected(true);
            loginRB.setSelected(false);
            deleteRB.setSelected(false);
            reportRB.setSelected(false);
            viewreportsRB.setSelected(false);
            contactRB.setSelected(false);
            solutionRB.setSelected(false);
            reg = true; log = false; del = false; rep = false; view = false; 
            cont = false; sol = false;
        }
    }

    // Login Radio Button
    private void loginRBActionPerformed(java.awt.event.ActionEvent evt) {
        if(loginRB.isSelected()){
            registerRB.setSelected(false);
            loginRB.setSelected(true);
            deleteRB.setSelected(false);
            reportRB.setSelected(false);
            viewreportsRB.setSelected(false);
            contactRB.setSelected(false);
            solutionRB.setSelected(false);
            reg = false; log = true; del = false; rep = false; view = false; 
            cont = false; sol = false;
        }
    }

    // Delete Account Radio Button
    private void deleteRBActionPerformed(java.awt.event.ActionEvent evt) {
        if(deleteRB.isSelected()){
            registerRB.setSelected(false);
            loginRB.setSelected(false);
            deleteRB.setSelected(true);
            reportRB.setSelected(false);
            viewreportsRB.setSelected(false);
            contactRB.setSelected(false);
            solutionRB.setSelected(false);
            reg = false; log = false; del = true; rep = false; view = false; 
            cont = false; sol = false;
        }
    }

    // Report a Problem Radio Button
    private void reportRBActionPerformed(java.awt.event.ActionEvent evt) {
        if(reportRB.isSelected()){
            registerRB.setSelected(false);
            loginRB.setSelected(false);
            deleteRB.setSelected(false);
            reportRB.setSelected(true);
            viewreportsRB.setSelected(false);
            contactRB.setSelected(false);
            solutionRB.setSelected(false);
            reg = false; log = false; del = false; rep = true; view = false; 
            cont = false; sol = false;
        }
    }

    // View Reports Radio Button
    private void viewreportsRBActionPerformed(java.awt.event.ActionEvent evt) {
        if(viewreportsRB.isSelected()){
            registerRB.setSelected(false);
            loginRB.setSelected(false);
            deleteRB.setSelected(false);
            reportRB.setSelected(false);
            viewreportsRB.setSelected(true);
            contactRB.setSelected(false);
            solutionRB.setSelected(false);
            reg = false; log = false; del = false; rep = false; view = true; 
            cont = false; sol = false;
        }
    }

    // Contact Us Radio Button
    private void contactRBActionPerformed(java.awt.event.ActionEvent evt) {
        if(contactRB.isSelected()){
            registerRB.setSelected(false);
            loginRB.setSelected(false);
            deleteRB.setSelected(false);
            reportRB.setSelected(false);
            viewreportsRB.setSelected(false);
            contactRB.setSelected(true);
            solutionRB.setSelected(false);
            reg = false; log = false; del = false; rep = false; view = false; 
            cont = true; sol = false;
        }
    }

    // Return to main menu
    private void mainLabelMouseClicked(java.awt.event.MouseEvent evt) {
        MainScreen main = new MainScreen();
        main.setVisible(true);
        main.setLogIn(loggedIn);
        main.setUandP(username,password);
        close();
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
                portalPanel.setBackground(new Color(218,165,32));
                solutionRB.setVisible(true);
            }
            else{
                solutionRB.setVisible(false);
            }
        }
    }

    // Admin feature - User Solutions Radio Button
    private void solutionRBActionPerformed(java.awt.event.ActionEvent evt) {
        if(solutionRB.isSelected()){
            registerRB.setSelected(false);
            loginRB.setSelected(false);
            deleteRB.setSelected(false);
            reportRB.setSelected(false);
            viewreportsRB.setSelected(false);
            contactRB.setSelected(false);
            solutionRB.setSelected(true);
            reg = false; log = false; del = false; rep = false; view = false; 
            cont = false; sol = true;            
        }
    }

    // Variables declaration
    private javax.swing.JLabel accessLabel;
    private javax.swing.JLabel city1_img;
    private javax.swing.JLabel city2_img;
    public javax.swing.JRadioButton contactRB;
    private javax.swing.JLabel cypressLabel;
    public javax.swing.JRadioButton deleteRB;
    private javax.swing.JLabel faqLabel;
    public javax.swing.JButton goButton;
    private javax.swing.JSeparator jSeparator1;
    public javax.swing.JRadioButton loginRB;
    public javax.swing.JLabel logoutLabel;
    public javax.swing.JLabel mainLabel;
    private javax.swing.JPanel portalPanel;
    public javax.swing.JLabel qlLabel;
    public javax.swing.JLabel quoteLabel;
    public javax.swing.JRadioButton registerRB;
    public javax.swing.JRadioButton reportRB;
    private javax.swing.JRadioButton solutionRB;
    public javax.swing.JLabel torontoLabel;
    public javax.swing.JRadioButton viewreportsRB;
    private boolean english;
    public boolean reg, log, del, rep, view, cont, sol; 
    public boolean loggedIn;
    public String username, password;
    public String[] adminUsernames = new String[]{"admin1", "admin2", "admin3"};
    public String[] adminPasswords = new String[]{"pass1", "pass2", "pass3"};
}
