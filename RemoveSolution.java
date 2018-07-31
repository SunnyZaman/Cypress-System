/**
 * Cypress System
 * Remove Solutions
 * Admin only - removes solutions that were submitted by the users 
 */
import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
//RemoveSolution
public class RemoveSolution extends javax.swing.JFrame {
    // Creates new form RemoveSolution
    public RemoveSolution() {
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
     public void setTableInfo(JTable sTable, int ind, UserSolutionScreen uS){
        solutionsTable = sTable;
        index = ind;
        userSolution = uS;
    }
     //close
     public void close(){
       this.setVisible(false);
    }

    //initComponents
    private void initComponents() {

        removeSolutionPanel = new javax.swing.JPanel();
        cancelButton1 = new javax.swing.JButton();
        removeButton1 = new javax.swing.JButton();
        removeLabel1 = new javax.swing.JLabel();
        addressLabel1 = new javax.swing.JLabel();
        problemLabel1 = new javax.swing.JLabel();
        solutionLabel = new javax.swing.JLabel();
        userLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(590, 300));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        cancelButton1.setText("jButton2");
        cancelButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cancelButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButton1ActionPerformed(evt);
            }
        });

        removeButton1.setText("jButton1");
        removeButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        removeButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButton1ActionPerformed(evt);
            }
        });

        removeLabel1.setText("jLabel3");

        addressLabel1.setText("jLabel1");

        problemLabel1.setText("jLabel2");

        solutionLabel.setText("jLabel1");

        userLabel.setText("jLabel1");

        javax.swing.GroupLayout removeSolutionPanelLayout = new javax.swing.GroupLayout(removeSolutionPanel);
        removeSolutionPanel.setLayout(removeSolutionPanelLayout);
        removeSolutionPanelLayout.setHorizontalGroup(
            removeSolutionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(removeSolutionPanelLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(removeSolutionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(removeSolutionPanelLayout.createSequentialGroup()
                        .addComponent(removeLabel1)
                        .addGap(117, 117, 117)
                        .addComponent(removeButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addComponent(cancelButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(problemLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addressLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(solutionLabel)
                    .addComponent(userLabel))
                .addContainerGap(113, Short.MAX_VALUE))
        );
        removeSolutionPanelLayout.setVerticalGroup(
            removeSolutionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(removeSolutionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addressLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(problemLabel1)
                .addGap(18, 18, 18)
                .addComponent(solutionLabel)
                .addGap(18, 18, 18)
                .addComponent(userLabel)
                .addGap(18, 18, 18)
                .addGroup(removeSolutionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(removeLabel1)
                    .addComponent(removeButton1)
                    .addComponent(cancelButton1))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(removeSolutionPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(removeSolutionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    // Close removesolution frame
    private void cancelButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        close();
        if(english == true){
            UserSolutionScreen uSolution = new UserSolutionScreen();
            uSolution.setLanguage(english);
            uSolution.setLogIn(loggedIn);
            uSolution.setUandP(username,password);
            uSolution.torontoLabel.setText("City of Toronto");
            uSolution.solutionsLabel.setText("Solutions: ");
            uSolution.cancelButton.setText("Cancel");
            uSolution.logoutLabel.setText("LOGOUT");
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
            uSolution.logoutLabel.setText("CONNECTEZ-OUT");
            uSolution.cancelButton.setText("Annuler");
            uSolution.setVisible(true);
            close();
        }
        userSolution.close();
    }

    // Remove solution
    private void removeButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        DefaultTableModel model = (DefaultTableModel)solutionsTable.getModel();
        model.removeRow(solutionsTable.convertRowIndexToModel(index));

        File reportFile = new File("UserSolutions.txt");
        try {
            PrintWriter fileWrite = new PrintWriter(reportFile);
            for(int row = 0; row < solutionsTable.getRowCount(); row++) {

                for(int column = 0; column < solutionsTable.getColumnCount(); column++) {
                    fileWrite.print(solutionsTable.getValueAt(row, column));
                    fileWrite.print("\t\t\t\t");
                }
                fileWrite.println("");
            }
            fileWrite.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SendSolution.class.getName()).log(Level.SEVERE, null, ex);
        }
        close();
        if(english == true){
            UserSolutionScreen uSolution = new UserSolutionScreen();
            uSolution.setLanguage(english);
            uSolution.setLogIn(loggedIn);
            uSolution.setUandP(username,password);
            uSolution.torontoLabel.setText("City of Toronto");
                    uSolution.solutionsLabel.setText("Solutions: ");
                    uSolution.cancelButton.setText("Cancel");
                    uSolution.logoutLabel.setText("LOGOUT");
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
            uSolution.logoutLabel.setText("CONNECTEZ-OUT");
            uSolution.cancelButton.setText("Annuler");
            uSolution.setVisible(true);
            close();
        }
        userSolution.close();

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
                removeSolutionPanel.setBackground(new Color(218,165,32));
            }
        }
    }

    // Variables declaration
    public javax.swing.JLabel addressLabel1;
    public javax.swing.JButton cancelButton1;
    public javax.swing.JLabel problemLabel1;
    public javax.swing.JButton removeButton1;
    public javax.swing.JLabel removeLabel1;
    private javax.swing.JPanel removeSolutionPanel;
    public javax.swing.JLabel solutionLabel;
    public javax.swing.JLabel userLabel;
    public JTable solutionsTable;
    public UserSolutionScreen userSolution;
    public int index;
    public boolean english, loggedIn;
    public String username, password;
    public String[] adminUsernames = new String[]{"admin1", "admin2", "admin3"};
    public String[] adminPasswords = new String[]{"pass1", "pass2", "pass3"};
}
