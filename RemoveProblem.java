/**
 * Cypress System
 * Remove Problems
 * Admin only - removes problems that were reported from the users 
 */
import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
// RemoveProblem
public class RemoveProblem extends javax.swing.JFrame {
    //Creates new form RemoveProblem
    public RemoveProblem() {
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
     // Set the table data
     public void setTableInfo(JTable rtable, int ind, ViewReportScreen vR){
        reportsTable = rtable;
        index = ind;
        viewR = vR;
    }
     // close 
     public void close(){
       this.setVisible(false);
    }
     
    //initComponents
    private void initComponents() {

        removeProblemPanel = new javax.swing.JPanel();
        cancelButton = new javax.swing.JButton();
        removeButton = new javax.swing.JButton();
        removeLabel = new javax.swing.JLabel();
        addressLabel = new javax.swing.JLabel();
        problemLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(590, 300));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        cancelButton.setText("jButton2");
        cancelButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        removeButton.setText("jButton1");
        removeButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });

        removeLabel.setText("jLabel3");

        addressLabel.setText("jLabel1");

        problemLabel.setText("jLabel2");

        javax.swing.GroupLayout removeProblemPanelLayout = new javax.swing.GroupLayout(removeProblemPanel);
        removeProblemPanel.setLayout(removeProblemPanelLayout);
        removeProblemPanelLayout.setHorizontalGroup(
            removeProblemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(removeProblemPanelLayout.createSequentialGroup()
                .addGroup(removeProblemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(removeProblemPanelLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(removeProblemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(removeLabel)
                            .addComponent(problemLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(removeProblemPanelLayout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(removeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(185, Short.MAX_VALUE))
        );
        removeProblemPanelLayout.setVerticalGroup(
            removeProblemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(removeProblemPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addressLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(problemLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(removeLabel)
                .addGap(18, 18, 18)
                .addGroup(removeProblemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(removeButton)
                    .addComponent(cancelButton))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(removeProblemPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(removeProblemPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }

     // Close removeproblem frame
    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {
        close();
        if(english == true){
            ViewReportScreen viewReport = new ViewReportScreen();
            viewReport.setLanguage(english);
            viewReport.setLogIn(loggedIn);
            viewReport.setUandP(username,password);
            viewReport.torontoLabel.setText("City of Toronto");
            viewReport.reportLabel.setText("Report");
            viewReport.logoutLabel.setText("LOGOUT");
            viewReport.cancelButton.setText("Cancel");
            viewReport.setVisible(true);
            close();
        }
        else{
            ViewReportScreen viewReport = new ViewReportScreen();
            viewReport.setLanguage(english);
            viewReport.setLogIn(loggedIn);
            viewReport.setUandP(username,password);
            viewReport.torontoLabel.setText("Ville de toronto");
            viewReport.reportLabel.setText("Rapport");
            viewReport.logoutLabel.setText("CONNECTEZ-OUT");
            viewReport.cancelButton.setText("Annuler");
            viewReport.setVisible(true);
            close();
        }
        viewR.close();
    }

    // Remove Problem
    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {
        DefaultTableModel model = (DefaultTableModel)reportsTable.getModel();
        model.removeRow(reportsTable.convertRowIndexToModel(index));
        File reportFile = new File("CypressReport.txt");
        try {
            PrintWriter fileWrite = new PrintWriter(reportFile);
            for(int row = 0; row < reportsTable.getRowCount(); row++) {

                for(int column = 0; column < reportsTable.getColumnCount(); column++) {
                    fileWrite.print(reportsTable.getValueAt(row, column));
                    fileWrite.print("\t\t\t\t");
                }
                fileWrite.println(""); // Add line space
            }
            fileWrite.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(SendSolution.class.getName()).log(Level.SEVERE, null, ex);
        }
            close();
            if(english == true){
                ViewReportScreen viewReport = new ViewReportScreen();
                viewReport.setLanguage(english);
                viewReport.setLogIn(loggedIn);
                viewReport.setUandP(username,password);
                viewReport.torontoLabel.setText("City of Toronto");
                viewReport.reportLabel.setText("Report");
                viewReport.logoutLabel.setText("LOGOUT");
                viewReport.cancelButton.setText("Cancel");
                viewReport.setVisible(true);
                close();
            }
            else{
                ViewReportScreen viewReport = new ViewReportScreen();
                viewReport.setLanguage(english);
                viewReport.setLogIn(loggedIn);
                viewReport.setUandP(username,password);
                viewReport.torontoLabel.setText("Ville de toronto");
                viewReport.reportLabel.setText("Rapport");
                viewReport.logoutLabel.setText("CONNECTEZ-OUT");
                viewReport.cancelButton.setText("Annuler");
                viewReport.setVisible(true);
                close();
            }
            viewR.close();
        
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
                removeProblemPanel.setBackground(new Color(218,165,32));
            }
        }
    }

    // Variables declaration
    public javax.swing.JLabel addressLabel;
    public javax.swing.JButton cancelButton;
    public javax.swing.JLabel problemLabel;
    public javax.swing.JButton removeButton;
    public javax.swing.JLabel removeLabel;
    private javax.swing.JPanel removeProblemPanel;
    public JTable reportsTable;
    public ViewReportScreen viewR;
    public int index;
    public boolean english, loggedIn;
    public String username, password;
    public String[] adminUsernames = new String[]{"admin1", "admin2", "admin3"};
    public String[] adminPasswords = new String[]{"pass1", "pass2", "pass3"};
}
