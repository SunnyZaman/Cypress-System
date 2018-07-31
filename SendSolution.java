/**
 * Cypress System
 * Send Solutions
 * Users send solutions to problems that were reported.
 * Solutions are recorded in a text file.
 */
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
//SendSolution
public class SendSolution extends javax.swing.JFrame {
    //Creates new form SendSolution
    public SendSolution() {
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
     // Set the problem
     public void setProblem(String prob, String addr){
         problem = prob;
         address = addr;
     }
     //close frame
     public void close(){
       this.setVisible(false);
    }

    //initComponents
    private void initComponents() {

        sendSolutionPanel = new javax.swing.JPanel();
        cancelButton = new javax.swing.JButton();
        sendButton = new javax.swing.JButton();
        getSolution = new javax.swing.JTextField();
        solutionLabel = new javax.swing.JLabel();
        addressLabel = new javax.swing.JLabel();
        problemLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(590, 300));

        cancelButton.setText("jButton2");
        cancelButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        sendButton.setText("jButton1");
        sendButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        sendButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendButtonActionPerformed(evt);
            }
        });

        solutionLabel.setText("jLabel3");

        addressLabel.setText("jLabel1");

        problemLabel.setText("jLabel2");

        javax.swing.GroupLayout sendSolutionPanelLayout = new javax.swing.GroupLayout(sendSolutionPanel);
        sendSolutionPanel.setLayout(sendSolutionPanelLayout);
        sendSolutionPanelLayout.setHorizontalGroup(
            sendSolutionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sendSolutionPanelLayout.createSequentialGroup()
                .addGroup(sendSolutionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sendSolutionPanelLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(sendSolutionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(getSolution, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(solutionLabel)
                            .addComponent(problemLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(sendSolutionPanelLayout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(sendButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        sendSolutionPanelLayout.setVerticalGroup(
            sendSolutionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sendSolutionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addressLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(problemLabel)
                .addGap(18, 18, 18)
                .addComponent(solutionLabel)
                .addGroup(sendSolutionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sendSolutionPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(getSolution, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sendSolutionPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                        .addGroup(sendSolutionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sendButton)
                            .addComponent(cancelButton))
                        .addGap(24, 24, 24))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sendSolutionPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sendSolutionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }

    //Send solution to text file and create solution text if it doesn't exist.
    private void sendButtonActionPerformed(java.awt.event.ActionEvent evt) {
        if(!getSolution.getText().isEmpty()){
            
            Path path = Paths.get("UserSolutions.txt");
            boolean notExists = Files.notExists(path);

            if (notExists) {
                File file = new File("UserSolutions.txt");
                try {
                    file.createNewFile();
                } catch (IOException ex) {
                    Logger.getLogger(SendSolution.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            try 
            {
                String line = address+ "\t\t\t\t"+ problem +"\t\t\t\t"+ getSolution.getText() +"\t\t\t\t"+ username +"\n";
                Files.write(Paths.get("UserSolutions.txt"), line.getBytes(), StandardOpenOption.APPEND);
            }
            catch (IOException e) {
                //handle
            }
            if(english){
            	JOptionPane.showMessageDialog(null,"Solution Sent");
            }
            else{
            	JOptionPane.showMessageDialog(null,"Solution envoyée");
            }
                    close();        

        }
    }

    //close frame
    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {
         close();        
    }

    // Variables declaration
    public javax.swing.JLabel addressLabel;
    public javax.swing.JButton cancelButton;
    private javax.swing.JTextField getSolution;
    public javax.swing.JLabel problemLabel;
    public javax.swing.JButton sendButton;
    private javax.swing.JPanel sendSolutionPanel;
    public javax.swing.JLabel solutionLabel;
    public boolean english, loggedIn;
    public String username, password;
    public String problem, address;
}
