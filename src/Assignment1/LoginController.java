//Controller for Login window
//Atif Hassan 
//CSC 202
package Assignment1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import java.util.Scanner;

/**
 *
 * @author atifm
 */
public class LoginController implements Initializable {

    @FXML
    private TextField userField;
    @FXML
    private PasswordField passField;
    @FXML
    private Button createBut;
    @FXML
    private Button loginBt;
    @FXML
    private Label loginLabel;
    private String username;
    private String password;
    private Scanner read;
    private Scanner read2;

    @FXML
    private void handleLoginButton(ActionEvent event) {
        //reset error label
        loginLabel.setText("");
        
        String userN = null;
        //intialize user name list
        File nameList = new File("databases/userNameList.txt");
        try {
            read = new Scanner(nameList);
        } catch (FileNotFoundException ex) {

        }
        
        //get form data
        username = userField.getText();
        password = passField.getText();
        
        //username password validation
        do {
            
            userN = read.nextLine();
            if (userN.equals("((" + username + "))")) {
                String temp;
                String tempUser;
                File userList = new File("databases/userList.txt");
                
                //initialize list for complete user info
                try {
                    read2 = new Scanner(userList);
                } catch (FileNotFoundException ex) {
                }
                do {
                    do {
                        temp = read2.nextLine();
                    } while (!temp.equals("((Username:"));
                    tempUser = read2.nextLine();

                } while (!tempUser.matches(username));
                do {
                    temp = read2.nextLine();
                } while (!temp.matches("Password:"));

                if (read2.nextLine().equals(password)) {
                    
                   //change to welcome windows
                    Stage createAccount = (Stage) loginBt.getScene().getWindow();
                    Parent root = null;
                    try {
                        root = FXMLLoader.load(getClass().getResource("Views/Welcome.fxml"));
                    } catch (IOException ex) {
                        Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    Scene scene = new Scene(root);

                    createAccount.setTitle("Welcome");
                    scene.getStylesheets().addAll(this.getClass().getResource("style.css").toExternalForm());
                    createAccount.setScene(scene);
                    createAccount.centerOnScreen();
                } else {//password error
                    loginLabel.setText("Passowrd Invalid");
                }
            } else {//UserName error

                loginLabel.setText("Username Invalid");
            }
        } while (read.hasNextLine());
    }

    @FXML
    //changes scene to create account
    private void handleCreateButton(ActionEvent event) {

        Stage createAccount = (Stage) createBut.getScene().getWindow();
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("Views/CreateAccount.fxml"));
        } catch (IOException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }

        Scene scene = new Scene(root);

        createAccount.setTitle("Create Account");
        scene.getStylesheets().addAll(this.getClass().getResource("style.css").toExternalForm());
        createAccount.setScene(scene);
        createAccount.centerOnScreen();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
