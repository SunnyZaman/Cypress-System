/**
 * Cypress System
 * View Reports
 * Users can view reports/problems that were reported by (other) users
 */
import java.awt.Color;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
//ViewReportScreen
public class ViewReportScreen extends javax.swing.JFrame {
    //Creates new form ViewReportScreen
    public ViewReportScreen() {
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
     // Remove duplicate reports in textfile
     public void removeDuplicateReports(String filename) throws FileNotFoundException, IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        Set<String> lines = new HashSet<String>(10000);
        String line;
        while ((line = reader.readLine()) != null) {
            lines.add(line);
        }
        reader.close();
        BufferedWriter bwriter = new BufferedWriter(new FileWriter(filename));
        for (String unique : lines) {
            bwriter.write(unique);
            bwriter.newLine();
        }
        bwriter.close();
    }
     // Close view report screen
     public void close(){
       this.setVisible(false);
    }
    //initComponents
    private void initComponents() {

        viewRPanel = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        cypressLabel = new javax.swing.JLabel();
        torontoLabel = new javax.swing.JLabel();
        faqLabel = new javax.swing.JLabel();
        logoutLabel = new javax.swing.JLabel();
        cancelButton = new javax.swing.JButton();
        reportLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        reportsTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(550, 100));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        viewRPanel.setBackground(new java.awt.Color(235, 235, 235));

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

        reportLabel.setFont(new java.awt.Font("Times New Roman", 1, 20)); 
        reportLabel.setText("Report:");

        reportsTable.setFont(new java.awt.Font("Times New Roman", 0, 16)); 
        reportsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Address", "Problem"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        reportsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reportsTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(reportsTable);

        javax.swing.GroupLayout viewRPanelLayout = new javax.swing.GroupLayout(viewRPanel);
        viewRPanel.setLayout(viewRPanelLayout);
        viewRPanelLayout.setHorizontalGroup(
            viewRPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewRPanelLayout.createSequentialGroup()
                .addGroup(viewRPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(viewRPanelLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(viewRPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 793, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(faqLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(viewRPanelLayout.createSequentialGroup()
                                .addGroup(viewRPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, viewRPanelLayout.createSequentialGroup()
                                        .addComponent(cypressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(torontoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(viewRPanelLayout.createSequentialGroup()
                                        .addComponent(reportLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(467, 467, 467)
                                        .addComponent(logoutLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(16, 16, 16))))
                    .addGroup(viewRPanelLayout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(viewRPanelLayout.createSequentialGroup()
                        .addGap(347, 347, 347)
                        .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        viewRPanelLayout.setVerticalGroup(
            viewRPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewRPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(viewRPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cypressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(torontoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(viewRPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(logoutLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(reportLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(cancelButton)
                .addGap(10, 10, 10)
                .addComponent(faqLabel)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(viewRPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(viewRPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    // Logout and return to the portal
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

    // Return to the portal
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

    //table is clicked, send solution or if user is admin remove problem
    private void reportsTableMouseClicked(java.awt.event.MouseEvent evt) {
        TableModel model  = reportsTable.getModel();
        int index = reportsTable.getSelectedRow();
        String address  = model.getValueAt(index, 0).toString();
        String problem  = model.getValueAt(index, 1).toString();
        if(isAdmin){
            RemoveProblem removeP = new RemoveProblem();
            removeP.setLanguage(english);
            removeP.setLogIn(loggedIn);
            removeP.setUandP(username,password);
            removeP.setTableInfo(reportsTable, index, this);
            removeP.addressLabel.setText("Address: " + address);
            removeP.problemLabel.setText("Problem: " + problem);
            removeP.removeLabel.setText("Remove this Problem? ");
            removeP.removeButton.setText("Remove");
            removeP.cancelButton.setText("Cancel");
            removeP.setVisible(true);    
           
        }
        else{
            SendSolution solution = new SendSolution();
            solution.setLanguage(english);
            solution.setLogIn(loggedIn);
            solution.setUandP(username,password);
            solution.setProblem(problem, address);
            solution.addressLabel.setText("Address: " + address);
            solution.problemLabel.setText("Problem: " + problem);
            solution.solutionLabel.setText("Your Solution: ");
            solution.sendButton.setText("Send");
            solution.cancelButton.setText("Cancel");
            solution.setVisible(true);
        }
    }

    // Create file and populate table. If user is admin, change panel background color.
    private void formWindowOpened(java.awt.event.WindowEvent evt) {
        if(username != null && !username.isEmpty() && password!= null && !password.isEmpty()) { 
            //boolean isAdmin = false;
            isAdmin = false;
            for (int i = 0; i<adminUsernames.length; i++){
                if(username.compareTo(adminUsernames[i])==0 && password.compareTo(adminPasswords[i])==0){
                    isAdmin = true;
                    break;
                }
            }
            if(isAdmin){
                viewRPanel.setBackground(new Color(218,165,32));
            }
        }              
        Path path = Paths.get("CypressReport.txt");
        boolean notExists = Files.notExists(path);

        if (notExists) {
            File file = new File("CypressReport.txt");
            try {
                file.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(ViewReportScreen.class.getName()).log(Level.SEVERE, null, ex);
            }
        }      
        String line = null;
         DefaultTableModel table = (DefaultTableModel) reportsTable.getModel();
        try {
            BufferedReader br = new BufferedReader(new FileReader("CypressReport.txt"));

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

    // Variables declaration 
    public javax.swing.JButton cancelButton;
    private javax.swing.JLabel cypressLabel;
    private javax.swing.JLabel faqLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    public javax.swing.JLabel logoutLabel;
    public javax.swing.JLabel reportLabel;
    public javax.swing.JTable reportsTable;
    public javax.swing.JLabel torontoLabel;
    private javax.swing.JPanel viewRPanel;
    public boolean english, loggedIn;
    public String username, password;
    Vector data;
    public String[] adminUsernames = new String[]{"admin1", "admin2", "admin3"};
    public String[] adminPasswords = new String[]{"pass1", "pass2", "pass3"};
    boolean isAdmin = false;
}
