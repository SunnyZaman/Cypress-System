/**
 * Cypress System
 * User Solution Screen
 * Admin only - view solutions that were sumbitted by users. 
 */
import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.StringTokenizer;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
//UserSolutionScreen
public class UserSolutionScreen extends javax.swing.JFrame {
    //Creates new form UserSolutionScreen
    public UserSolutionScreen() {
        initComponents();
    }
    // Set the language. If english is true, then the language is English.
    // If english is false, then the language is French.
    public void setLanguage (boolean eng){
        english = eng;
    }
    // Set the username and password.
     public void setUandP(String uname,String pass)
     {
      username = uname;
      password = pass;
     }
    // Set the login status. If loggedIn is true, then the user is logged in.
    // If loggedIn is false, then the user is not logged in.
     public void setLogIn(boolean logged)
     {
         loggedIn = logged;
     }
     //close frame
     public void close(){
       this.setVisible(false);
    }

    //initComponents
    private void initComponents() {

        userSolutionPanel = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        cypressLabel = new javax.swing.JLabel();
        torontoLabel = new javax.swing.JLabel();
        faqLabel = new javax.swing.JLabel();
        logoutLabel = new javax.swing.JLabel();
        cancelButton = new javax.swing.JButton();
        solutionsLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        solutionsTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(550, 100));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        userSolutionPanel.setBackground(new java.awt.Color(235, 235, 235));

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

        logoutLabel.setFont(new java.awt.Font("Times New Roman", 0, 17)); 
        logoutLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutLabelMouseClicked(evt);
            }
        });

        cancelButton.setText("jButton2");
        cancelButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        solutionsLabel.setFont(new java.awt.Font("Times New Roman", 1, 20)); 
        solutionsLabel.setText("Solutions:");

        solutionsTable.setFont(new java.awt.Font("Times New Roman", 0, 16)); 
        solutionsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Address", "Problem", "Solution", "Submitted by:"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        solutionsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                solutionsTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(solutionsTable);

        javax.swing.GroupLayout userSolutionPanelLayout = new javax.swing.GroupLayout(userSolutionPanel);
        userSolutionPanel.setLayout(userSolutionPanelLayout);
        userSolutionPanelLayout.setHorizontalGroup(
            userSolutionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userSolutionPanelLayout.createSequentialGroup()
                .addGroup(userSolutionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(userSolutionPanelLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(userSolutionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 793, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(faqLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(userSolutionPanelLayout.createSequentialGroup()
                                .addGroup(userSolutionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, userSolutionPanelLayout.createSequentialGroup()
                                        .addComponent(cypressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(torontoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(userSolutionPanelLayout.createSequentialGroup()
                                        .addComponent(solutionsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(467, 467, 467)
                                        .addComponent(logoutLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(16, 16, 16))))
                    .addGroup(userSolutionPanelLayout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(userSolutionPanelLayout.createSequentialGroup()
                        .addGap(347, 347, 347)
                        .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        userSolutionPanelLayout.setVerticalGroup(
            userSolutionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userSolutionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(userSolutionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cypressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(torontoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(userSolutionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(logoutLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(solutionsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancelButton)
                .addGap(10, 10, 10)
                .addComponent(faqLabel)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(userSolutionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(userSolutionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                faq.logoutLabel.setText("ONNECTEZ-OUT");
            }
            faq.setVisible(true);
            close();

        }
    }

    //logout and return to the portal 
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
                portal.quoteLabel.setText("Garder Les Rues de Notre Ville Propres et Sécuritaires...s");
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

    //return to the portal
    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {
        if(english){
            PortalScreen portal = new PortalScreen();
            portal.setLogIn(loggedIn);
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
    }

    //Create and poulate table and text file. If admin is logged in, change panel background color.
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
                userSolutionPanel.setBackground(new Color(218,165,32));
            }
        }
        
        Path path = Paths.get("UserSolutions.txt");
        boolean notExists = Files.notExists(path);

        if (notExists) {
            File file = new File("UserSolutions.txt");
            try {
                file.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(ViewReportScreen.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        String line = null;
        DefaultTableModel table = (DefaultTableModel) solutionsTable.getModel();

        try {
            BufferedReader br = new BufferedReader(new FileReader("UserSolutions.txt"));

            while ((line = br.readLine()) != null) {
                data = new Vector();
                StringTokenizer st1 = new StringTokenizer(line, "\t\t\t\t");
                while (st1.hasMoreTokens()) {
                    String nextT = st1.nextToken();
                    data.add(nextT);
                }
                table.addRow(data);
            }
        br.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //send data and info to RemoveSolution 
    private void solutionsTableMouseClicked(java.awt.event.MouseEvent evt) {
        TableModel model  = solutionsTable.getModel();
        int index = solutionsTable.getSelectedRow();
        String address  = model.getValueAt(index, 0).toString();
        String problem  = model.getValueAt(index, 1).toString();
        String solution  = model.getValueAt(index, 2).toString();
        String submittedBy  = model.getValueAt(index, 3).toString();
            RemoveSolution removeS = new RemoveSolution();
            removeS.setLanguage(english);
            removeS.setLogIn(loggedIn);
            removeS.setUandP(username,password);
            removeS.setTableInfo(solutionsTable, index, this);
            removeS.addressLabel1.setText("Address: " + address);
            removeS.problemLabel1.setText("Problem: " + problem);
            removeS.solutionLabel.setText("Solution: " + solution);
            removeS.userLabel.setText("Submitted by: " + submittedBy);
            removeS.removeLabel1.setText("Remove this Solution? ");
            removeS.removeButton1.setText("Remove");
            removeS.cancelButton1.setText("Cancel");
            removeS.setVisible(true);    
    }

    // Variables declaration
    public javax.swing.JButton cancelButton;
    private javax.swing.JLabel cypressLabel;
    private javax.swing.JLabel faqLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    public javax.swing.JLabel logoutLabel;
    public javax.swing.JLabel solutionsLabel;
    public javax.swing.JTable solutionsTable;
    public javax.swing.JLabel torontoLabel;
    private javax.swing.JPanel userSolutionPanel;
    public boolean english, loggedIn;
    public String username, password;
    Vector data;
    public String[] adminUsernames = new String[]{"admin1", "admin2", "admin3"};
    public String[] adminPasswords = new String[]{"pass1", "pass2", "pass3"};
}
