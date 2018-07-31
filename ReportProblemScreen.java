/**
 * Cypress System
 * Report Problems Screen
 * Users can report problem
 */
import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
//ReportProblemScreen
public class ReportProblemScreen extends javax.swing.JFrame {    
    //Creates new form ReportProblemScreen
    public ReportProblemScreen() throws IOException {
        initComponents();
        conn2 = DatabaseConnection.ConnecrDb();
        reportButton.requestFocus();
        createFile();
    }
    // Set the language. If english is true, then the language is English.
    // If english is false, then the language is French.
    public void getLanguage (boolean eng){
        english = eng;
    }
    // Set the login status. If loggedIn is true, then the user is logged in.
    // If loggedIn is false, then the user is not logged in.
     public void getLogIn(boolean logged)
     {
         loggedIn = logged;
     }
     // Set the username and password.
     public void getUandP(String uname,String pass)
     {
      username = uname;
      password = pass;
     }
     //Create file if it doesn't exist
     public void createFile() throws IOException{
        Path path = Paths.get("CypressReport.txt");
        boolean notExists = Files.notExists(path);

        if (notExists) {
            File file = new File("CypressReport.txt");
            file.createNewFile();
        }
    }
     //close ReportProblemScreen
     public void close(){
       this.setVisible(false);
    }

    //initComponents
    private void initComponents() {

        reportPanel = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        cypressLabel = new javax.swing.JLabel();
        torontoLabel = new javax.swing.JLabel();
        faqLabel = new javax.swing.JLabel();
        addressLabel = new javax.swing.JLabel();
        logoutLabel = new javax.swing.JLabel();
        getAddress = new javax.swing.JTextField();
        map_img = new javax.swing.JLabel();
        problemsLabel = new javax.swing.JLabel();
        utilityRB = new javax.swing.JRadioButton();
        potholesRB = new javax.swing.JRadioButton();
        vandRB = new javax.swing.JRadioButton();
        erosionRB = new javax.swing.JRadioButton();
        jSeparator2 = new javax.swing.JSeparator();
        treeRB = new javax.swing.JRadioButton();
        floodRB = new javax.swing.JRadioButton();
        moldRB = new javax.swing.JRadioButton();
        garbageRB = new javax.swing.JRadioButton();
        reportButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(550, 100));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        reportPanel.setBackground(new java.awt.Color(235, 235, 235));

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

        addressLabel.setFont(new java.awt.Font("Times New Roman", 1, 16)); 
        addressLabel.setText("Adresse:");

        logoutLabel.setFont(new java.awt.Font("Times New Roman", 0, 17)); 
        logoutLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutLabelMouseClicked(evt);
            }
        });

        getAddress.setFont(new java.awt.Font("Times New Roman", 0, 16)); 
        getAddress.setForeground(new java.awt.Color(204, 204, 204));
        getAddress.setText("1234 Main Street");
        getAddress.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                getAddressFocusGained(evt);
            }
        });

        map_img.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        map_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/google_map_icon.png"))); 
        map_img.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        map_img.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                map_imgMouseClicked(evt);
            }
        });

        problemsLabel.setFont(new java.awt.Font("Times New Roman", 0, 18)); 
        problemsLabel.setText("PROBLEMS AT THE SITE:");

        utilityRB.setFont(new java.awt.Font("Times New Roman", 0, 18)); 
        utilityRB.setText("Ã‰chec des services publics");
        utilityRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                utilityRBActionPerformed(evt);
            }
        });

        potholesRB.setFont(new java.awt.Font("Times New Roman", 0, 18)); 
        potholesRB.setText("Potholes");
        potholesRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                potholesRBActionPerformed(evt);
            }
        });

        vandRB.setFont(new java.awt.Font("Times New Roman", 0, 18)); 
        vandRB.setText("Vandalisme de la ville");
        vandRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vandRBActionPerformed(evt);
            }
        });

        erosionRB.setFont(new java.awt.Font("Times New Roman", 0, 18)); 
        erosionRB.setText("Rues Ã©rodÃ©es");
        erosionRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                erosionRBActionPerformed(evt);
            }
        });

        treeRB.setFont(new java.awt.Font("Times New Roman", 0, 18)); 
        treeRB.setText("Collapse d'arbre");
        treeRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                treeRBActionPerformed(evt);
            }
        });

        floodRB.setFont(new java.awt.Font("Times New Roman", 0, 18)); 
        floodRB.setText("Rues inondÃ©es");
        floodRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                floodRBActionPerformed(evt);
            }
        });

        moldRB.setFont(new java.awt.Font("Times New Roman", 0, 18)); 
        moldRB.setText("Croissance des moisissures et des spores");
        moldRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moldRBActionPerformed(evt);
            }
        });

        garbageRB.setFont(new java.awt.Font("Times New Roman", 0, 18)); 
        garbageRB.setText("Objets dÃ©tritus et autres objets bloquant la circulation routiÃ¨re");
        garbageRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                garbageRBActionPerformed(evt);
            }
        });

        reportButton.setText("jButton1");
        reportButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        reportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("jButton2");
        cancelButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout reportPanelLayout = new javax.swing.GroupLayout(reportPanel);
        reportPanel.setLayout(reportPanelLayout);
        reportPanelLayout.setHorizontalGroup(
            reportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reportPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(reportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(faqLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(reportPanelLayout.createSequentialGroup()
                        .addGroup(reportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, reportPanelLayout.createSequentialGroup()
                                .addComponent(cypressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(torontoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(problemsLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, reportPanelLayout.createSequentialGroup()
                                .addComponent(addressLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(reportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(logoutLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(reportPanelLayout.createSequentialGroup()
                                        .addComponent(getAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(map_img, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, reportPanelLayout.createSequentialGroup()
                                .addGroup(reportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(utilityRB)
                                    .addComponent(potholesRB)
                                    .addComponent(vandRB)
                                    .addComponent(erosionRB))
                                .addGap(64, 64, 64)
                                .addGroup(reportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(floodRB)
                                    .addComponent(treeRB)
                                    .addComponent(moldRB)
                                    .addComponent(garbageRB)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, reportPanelLayout.createSequentialGroup()
                                .addGap(197, 197, 197)
                                .addComponent(reportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(91, 91, 91)
                                .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(16, 16, 16)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        reportPanelLayout.setVerticalGroup(
            reportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reportPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(reportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cypressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(torontoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logoutLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(reportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(getAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(map_img, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(problemsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(reportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(utilityRB)
                    .addComponent(treeRB))
                .addGap(18, 18, 18)
                .addGroup(reportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(potholesRB)
                    .addComponent(floodRB))
                .addGap(18, 18, 18)
                .addGroup(reportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vandRB)
                    .addComponent(moldRB))
                .addGap(18, 18, 18)
                .addGroup(reportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(erosionRB)
                    .addComponent(garbageRB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(reportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reportButton)
                    .addComponent(cancelButton))
                .addGap(10, 10, 10)
                .addComponent(faqLabel)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(reportPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(reportPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    //Go to the FAQ
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

    //Logout of the cypress system
    private void logoutLabelMouseClicked(java.awt.event.MouseEvent evt) {
        if(loggedIn){
            if(english){
                PortalScreen portal = new PortalScreen();
                portal.logoutLabel.setText("");
                loggedIn = false;
                username = "";
                password = "";
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

    //When map icon is clicked, a google maps is opened up on a browser
    private void map_imgMouseClicked(java.awt.event.MouseEvent evt) {
        try{
            String URL = "https://www.google.com/maps";
            java.awt.Desktop.getDesktop().browse(java.net.URI.create(URL));
        }
        catch(Exception e){
            //Handle
            JOptionPane.showMessageDialog(null, "Error");
        }
    }

    //set the text settings for the address textfield
    private void getAddressFocusGained(java.awt.event.FocusEvent evt) {
        getAddress.setText("");
        getAddress.setForeground(Color.BLACK);
    }

    //utility (problem) Radio Button
    private void utilityRBActionPerformed(java.awt.event.ActionEvent evt) {
        if(utilityRB.isSelected()){
            utilityRB.setSelected(true);
            potholesRB.setSelected(false);
            vandRB.setSelected(false);
            erosionRB.setSelected(false);
            treeRB.setSelected(false);
            floodRB.setSelected(false);
            moldRB.setSelected(false);
            garbageRB.setSelected(false);
            utility = true; pothole = false; vandalism = false; erode= false;
            tree = false; flood = false; mould = false; garbage = false;
        }
    }

    //potholes (problem) Radio Button
    private void potholesRBActionPerformed(java.awt.event.ActionEvent evt) {
        if(potholesRB.isSelected()){
            utilityRB.setSelected(false);
            potholesRB.setSelected(true);
            vandRB.setSelected(false);
            erosionRB.setSelected(false);
            treeRB.setSelected(false);
            floodRB.setSelected(false);
            moldRB.setSelected(false);
            garbageRB.setSelected(false);
            utility = false; pothole = true; vandalism = false; erode= false;
            tree = false; flood = false; mould = false; garbage = false;
        }
    }

    //vandalism (problem) Radio Button
    private void vandRBActionPerformed(java.awt.event.ActionEvent evt) {
        if(vandRB.isSelected()){
            utilityRB.setSelected(false);
            potholesRB.setSelected(false);
            vandRB.setSelected(true);
            erosionRB.setSelected(false);
            treeRB.setSelected(false);
            floodRB.setSelected(false);
            moldRB.setSelected(false);
            garbageRB.setSelected(false);
            utility = false; pothole = false; vandalism = true; erode= false;
            tree = false; flood = false; mould = false; garbage = false;
        }
    }

    //erosion (problem) Radio Button
    private void erosionRBActionPerformed(java.awt.event.ActionEvent evt) {
        if(erosionRB.isSelected()){
            utilityRB.setSelected(false);
            potholesRB.setSelected(false);
            vandRB.setSelected(false);
            erosionRB.setSelected(true);
            treeRB.setSelected(false);
            floodRB.setSelected(false);
            moldRB.setSelected(false);
            garbageRB.setSelected(false);
            utility = false; pothole = false; vandalism = false; erode= true;
            tree = false; flood = false; mould = false; garbage = false;
        }
    }

    // tree collapse (problem) Radio Button
    private void treeRBActionPerformed(java.awt.event.ActionEvent evt) {
        if(treeRB.isSelected()){
            utilityRB.setSelected(false);
            potholesRB.setSelected(false);
            vandRB.setSelected(false);
            erosionRB.setSelected(false);
            treeRB.setSelected(true);
            floodRB.setSelected(false);
            moldRB.setSelected(false);
            garbageRB.setSelected(false);
            utility = false; pothole = false; vandalism = false; erode= false;
            tree = true; flood = false; mould = false; garbage = false;
        }
    }

    //flood (problem) Radio Button
    private void floodRBActionPerformed(java.awt.event.ActionEvent evt) {
        if(floodRB.isSelected()){
            utilityRB.setSelected(false);
            potholesRB.setSelected(false);
            vandRB.setSelected(false);
            erosionRB.setSelected(false);
            treeRB.setSelected(false);
            floodRB.setSelected(true);
            moldRB.setSelected(false);
            garbageRB.setSelected(false);
            utility = false; pothole = false; vandalism = false; erode= false;
            tree = false; flood = true; mould = false; garbage = false;
        }
    }

    //mold (problem) Radio Button
    private void moldRBActionPerformed(java.awt.event.ActionEvent evt) {
        if(moldRB.isSelected()){
            utilityRB.setSelected(false);
            potholesRB.setSelected(false);
            vandRB.setSelected(false);
            erosionRB.setSelected(false);
            treeRB.setSelected(false);
            floodRB.setSelected(false);
            moldRB.setSelected(true);
            garbageRB.setSelected(false);
            utility = false; pothole = false; vandalism = false; erode= false;
            tree = false; flood = false; mould = true; garbage = false;
        }
    }

    //garbage (problem) Radio Button
    private void garbageRBActionPerformed(java.awt.event.ActionEvent evt) {
        if(garbageRB.isSelected()){
            utilityRB.setSelected(false);
            potholesRB.setSelected(false);
            vandRB.setSelected(false);
            erosionRB.setSelected(false);
            treeRB.setSelected(false);
            floodRB.setSelected(false);
            moldRB.setSelected(false);
            garbageRB.setSelected(true);
            utility = false; pothole = false; vandalism = false; erode= false;
            tree = false; flood = false; mould = false; garbage = true;
        }
    }

    //record problem into a text file
    private void reportButtonActionPerformed(java.awt.event.ActionEvent evt) {
        //1 utility
        if(!getAddress.getText().isEmpty() && (utility)){
           try {
                String line= getAddress.getText()+ "\t\t\t\t"+ utilityRB.getText()+ "\t\t\t\t"+ "\n";
                Files.write(Paths.get("CypressReport.txt"), line.getBytes(), StandardOpenOption.APPEND);
            }
           catch (IOException e) {
               //handle
            }
           if(english){
        	   JOptionPane.showMessageDialog(null, "Problem Reported");
           }
           else{
        	   JOptionPane.showMessageDialog(null, "Problème signalé");
           }
        }
        
        //2 potholes
        if(!getAddress.getText().isEmpty() && (pothole)){
                try {
                    String line= getAddress.getText()+ "\t\t\t\t"+ potholesRB.getText()+ "\t\t\t\t"+ "\n";
                    Files.write(Paths.get("CypressReport.txt"), line.getBytes(), StandardOpenOption.APPEND);
                }
                catch (IOException e) {
                    //handle
                }
                if(english){
             	   JOptionPane.showMessageDialog(null, "Problem Reported");
                }
                else{
             	   JOptionPane.showMessageDialog(null, "Problème signalé");
                }
        }
                   
        //3 vandalism
        if(!getAddress.getText().isEmpty() && (vandalism)){
           try {
               String line= getAddress.getText()+ "\t\t\t\t"+ vandRB.getText()+ "\t\t\t\t"+ "\n";
                Files.write(Paths.get("CypressReport.txt"), line.getBytes(), StandardOpenOption.APPEND);
                }
           catch (IOException e) {
               //handle
           }
           if(english){
        	   JOptionPane.showMessageDialog(null, "Problem Reported");
           }
           else{
        	   JOptionPane.showMessageDialog(null, "Problème signalé");
           }
            
        }
        //4 erosion
        if(!getAddress.getText().isEmpty() && (erode)){
           try {
                String line= getAddress.getText()+ "\t\t\t\t"+ erosionRB.getText()+"\t\t\t\t"+"\n";
                Files.write(Paths.get("CypressReport.txt"), line.getBytes(), StandardOpenOption.APPEND);
                }
           catch (IOException e) {
               //handle
           }
           if(english){
        	   JOptionPane.showMessageDialog(null, "Problem Reported");
           }
           else{
        	   JOptionPane.showMessageDialog(null, "Problème signalé");
           }

        }
        //5 tree collapse
        if(!getAddress.getText().isEmpty() && (tree)){
           try {
               String line= getAddress.getText()+ "\t\t\t\t"+ treeRB.getText()+ "\t\t\t\t"+ "\n";
                Files.write(Paths.get("CypressReport.txt"), line.getBytes(), StandardOpenOption.APPEND);
                }
           catch (IOException e) {
               //handle
           }
           if(english){
        	   JOptionPane.showMessageDialog(null, "Problem Reported");
           }
           else{
        	   JOptionPane.showMessageDialog(null, "Problème signalé");
           }     
        }
        //6 flood
        if(!getAddress.getText().isEmpty() && (flood)){
           try {
               String line= getAddress.getText()+ "\t\t\t\t"+ floodRB.getText()+ "\t\t\t\t"+ "\n";
                Files.write(Paths.get("CypressReport.txt"), line.getBytes(), StandardOpenOption.APPEND);
                }
           catch (IOException e) {
               //handle
           }
           if(english){
        	   JOptionPane.showMessageDialog(null, "Problem Reported");
           }
           else{
        	   JOptionPane.showMessageDialog(null, "Problème signalé");
           }
        }
        //7 mold
        if(!getAddress.getText().isEmpty() && (mould)){
           try {
               String line= getAddress.getText()+ "\t\t\t\t"+ moldRB.getText()+ "\t\t\t\t"+ "\n";
                Files.write(Paths.get("CypressReport.txt"), line.getBytes(), StandardOpenOption.APPEND);
                }
           catch (IOException e) {
               //handle
           }
           if(english){
        	   JOptionPane.showMessageDialog(null, "Problem Reported");
           }
           else{
        	   JOptionPane.showMessageDialog(null, "Problème signalé");
           }
        }
        
        //8 garbage
        if(!getAddress.getText().isEmpty() && (garbage)){
           try {
               String line= getAddress.getText()+ "\t\t\t\t"+ garbageRB.getText()+ "\t\t\t\t"+ "\n";
                Files.write(Paths.get("CypressReport.txt"), line.getBytes(), StandardOpenOption.APPEND);
                }
           catch (IOException e) {
               //handle
           }
           if(english){
        	   JOptionPane.showMessageDialog(null, "Problem Reported");
           }
           else{
        	   JOptionPane.showMessageDialog(null, "Problème signalé");
           }
        }

    }

    //return to portal
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
                portal.mainLabel.setText("MAIN");
                
                if(loggedIn){
                    portal.logoutLabel.setText("LOGOUT");
                }
                portal.setVisible(true);
                ViewReportScreen viewR = new ViewReportScreen();
                try {
                    viewR.removeDuplicateReports("CypressReport.txt");
                } catch (IOException ex) {
                    Logger.getLogger(ReportProblemScreen.class.getName()).log(Level.SEVERE, null, ex);
                }
                
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
                portal.mainLabel.setText("PRINCIPALE");
                if(loggedIn){
                    portal.logoutLabel.setText("CONNECTEZ-OUT");
                }
              //  fileWrite.close();
              //  out.close();
                portal.setVisible(true);
                ViewReportScreen viewR = new ViewReportScreen();
                try {
                    viewR.removeDuplicateReports("CypressReport.txt"); // need to fix, create a new text file for french reports
                } catch (IOException ex) {
                    Logger.getLogger(ReportProblemScreen.class.getName()).log(Level.SEVERE, null, ex);
                }
                close();
            }
    }

    //Admin features
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
                reportPanel.setBackground(new Color(218,165,32));
            }
        }
    }

    // Variables declaration
    public javax.swing.JLabel addressLabel;
    public javax.swing.JButton cancelButton;
    private javax.swing.JLabel cypressLabel;
    public javax.swing.JRadioButton erosionRB;
    private javax.swing.JLabel faqLabel;
    public javax.swing.JRadioButton floodRB;
    public javax.swing.JRadioButton garbageRB;
    private javax.swing.JTextField getAddress;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    public javax.swing.JLabel logoutLabel;
    private javax.swing.JLabel map_img;
    public javax.swing.JRadioButton moldRB;
    public javax.swing.JRadioButton potholesRB;
    public javax.swing.JLabel problemsLabel;
    public javax.swing.JButton reportButton;
    private javax.swing.JPanel reportPanel;
    public javax.swing.JLabel torontoLabel;
    public javax.swing.JRadioButton treeRB;
    public javax.swing.JRadioButton utilityRB;
    public javax.swing.JRadioButton vandRB;
    public String username, password;
    public boolean utility, pothole, vandalism, erode, tree, flood, mould, garbage;
    public boolean english, loggedIn;
    Connection conn2 = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    public String[] adminUsernames = new String[]{"admin1", "admin2", "admin3"};
    public String[] adminPasswords = new String[]{"pass1", "pass2", "pass3"};
}
