/**
 * Cypress System
 * FAQ
 * Display (Default) Frequent asked Questions and Answers
 */
import java.awt.Color;
// FAQ
public class FAQ extends javax.swing.JFrame {
    // Creates new form FAQ
    public FAQ() {
        initComponents();
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
    // Close the FAQ frame
    public void close(){
       this.setVisible(false);
    }
    
    //initComponents
    private void initComponents() {

        faqPanel = new javax.swing.JPanel();
        jSeparator7 = new javax.swing.JSeparator();
        cypressLabel = new javax.swing.JLabel();
        torontoLabel = new javax.swing.JLabel();
        faqLabel = new javax.swing.JLabel();
        logoutLabel = new javax.swing.JLabel();
        mainLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        qaTextArea = new javax.swing.JTextArea();
        questions_img = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(235, 235, 235));
        setLocation(new java.awt.Point(550, 100));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        faqPanel.setBackground(new java.awt.Color(235, 235, 235));

        jSeparator7.setForeground(new java.awt.Color(51, 51, 51));

        cypressLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); 
        cypressLabel.setText("CYPRESS");

        torontoLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); 
        torontoLabel.setText("Ville de toronto");

        faqLabel.setFont(new java.awt.Font("Times New Roman", 1, 21)); 
        faqLabel.setText(" Questions FrÃ©quemment PosÃ©es");

        logoutLabel.setFont(new java.awt.Font("Times New Roman", 0, 17)); 
        logoutLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutLabelMouseClicked(evt);
            }
        });

        mainLabel.setFont(new java.awt.Font("Times New Roman", 0, 16)); 
        mainLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mainLabel.setText("PRINCIPALE");
        mainLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mainLabelMouseClicked(evt);
            }
        });

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        qaTextArea.setEditable(false);
        qaTextArea.setColumns(20);
        qaTextArea.setFont(new java.awt.Font("Times New Roman", 0, 18)); 
        qaTextArea.setRows(5);
        qaTextArea.setText("QUESTION 1: WHAT IS...\nAnswer 1:\n\nQUESTION 2: WHY...\nAnswer 2:\n\nQUESTION 3: HOW...\nAnswer 3:\n\nQUESTION 4: WHERE...\nAnswer 4...\n\nQUESTION 5: What...\nAnswer 5:");
        qaTextArea.setCaretPosition(0);
        jScrollPane1.setViewportView(qaTextArea);

        questions_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/questions-icon.png"))); 

        javax.swing.GroupLayout faqPanelLayout = new javax.swing.GroupLayout(faqPanel);
        faqPanel.setLayout(faqPanelLayout);
        faqPanelLayout.setHorizontalGroup(
            faqPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(faqPanelLayout.createSequentialGroup()
                .addGroup(faqPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(faqPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 705, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, faqPanelLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(faqPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(faqPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(faqPanelLayout.createSequentialGroup()
                                    .addComponent(cypressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 370, Short.MAX_VALUE)
                                    .addComponent(torontoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jSeparator7))
                            .addGroup(faqPanelLayout.createSequentialGroup()
                                .addGroup(faqPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(mainLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(faqPanelLayout.createSequentialGroup()
                                        .addComponent(faqLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(questions_img, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(169, 169, 169)
                                .addComponent(logoutLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        faqPanelLayout.setVerticalGroup(
            faqPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(faqPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(faqPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cypressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(torontoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(faqPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logoutLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(faqLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(questions_img, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(mainLabel)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(faqPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(faqPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
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

    // Return to the main menu screen
    private void mainLabelMouseClicked(java.awt.event.MouseEvent evt) {
        MainScreen main = new MainScreen();
        main.setVisible(true);
        main.setLogIn(loggedIn);
        main.setUandP(username,password);
        close();
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
                faqPanel.setBackground(new Color(218,165,32));
            }
        }
    }

    // Variables declaration
    private javax.swing.JLabel cypressLabel;
    public javax.swing.JLabel faqLabel;
    private javax.swing.JPanel faqPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator7;
    public javax.swing.JLabel logoutLabel;
    public javax.swing.JLabel mainLabel;
    private javax.swing.JTextArea qaTextArea;
    private javax.swing.JLabel questions_img;
    public javax.swing.JLabel torontoLabel;
    public boolean english, loggedIn;
    public String username, password;
    public String[] adminUsernames = new String[]{"admin1", "admin2", "admin3"};
    public String[] adminPasswords = new String[]{"pass1", "pass2", "pass3"};
    
}
