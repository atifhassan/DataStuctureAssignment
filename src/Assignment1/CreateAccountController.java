/*
Controller for Create Account FXML
Atif Hassan
CSC 202
*/
package Assignment1;

import java.io.File;
import javafx.stage.FileChooser;
import classes.User;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class CreateAccountController implements Initializable {
    
    @FXML
    private Button openDialog;
    @FXML
    private TextField fNameField;
    @FXML
    private TextField lNameField;
    @FXML
    private DatePicker dobPicker;
    @FXML
    private ChoiceBox genderBox;
    @FXML
    private TextField userNameField;
    @FXML
    private TextField emailField;
    @FXML
    private TextField photoField;
    @FXML
    private PasswordField pwordField;
    @FXML
    private PasswordField pword2Field;
    @FXML
    private Button cancel;
    @FXML
    private Button registerBut;
    @FXML
    private Label pw1Label;
    @FXML
    private Label pw2Label;
    @FXML
    private Label fillLabel;
    @FXML
    private Label emailLabel;
    @FXML
    private TextField ssnField;
    @FXML
    private Label ssnLabel;
    @FXML
    private TextField phoneField;
    @FXML
    private Label phoneLabel;
    @FXML
    private Label userNameLabel;
    private String firstName = null;
    private String lastName = null;
    private LocalDate dob = null;
    private String username = null;
    private String email = null;
    private String photoPath = null;
    private String password = null;
    private String phone = null;
    private String password2 = null;
    private String gender = null;
    private String ssn = null;
    private FileChooser fileCH = new FileChooser();
    private Scanner read;
    private User one;

/*
    Returns user back to Login in screen
    */    
    @FXML
    private void cancelAccountBut() {
        Stage createAccount = (Stage) cancel.getScene().getWindow();
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("Views/Login.fxml"));
        } catch (IOException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Scene scene = new Scene(root);
        
        createAccount.setTitle("Login");
        scene.getStylesheets().addAll(this.getClass().getResource("style.css").toExternalForm());
        createAccount.setScene(scene);
        
        createAccount.centerOnScreen();
    }
    
   /*
    Browse Button Action
    Opens Dialog box to select file
    */
    @FXML
    private void fileChoose() {
        Stage stage = (Stage) openDialog.getScene().getWindow();
        File file = fileCH.showOpenDialog(stage);
        if (file != null) {
            photoField.setText(file.getPath());
        }
    }
    
    /*
    Creates Account from form
    */
    @FXML
    private void createAccountBut() {
        //Reset all the error labels
        fillLabel.setText("");
        pw1Label.setText("");
        pw2Label.setText("");
        emailLabel.setText("");
        ssnLabel.setText("");
        phoneLabel.setText("");
        userNameLabel.setText("");
        //get all form values
        firstName = fNameField.getText();
        lastName = lNameField.getText();
        dob = dobPicker.getValue();
        gender = genderBox.getSelectionModel().getSelectedItem().toString();
        username = userNameField.getText();
        email = emailField.getText();
        ssn = ssnField.getText();
        phone = phoneField.getText();
        photoPath = photoField.getText();
        password = pwordField.getText();
        password2 = pword2Field.getText();
        
        
        if (isFilled()) {
            if (isUserNameValid()) {
                if (isUserNameAvailable()) {
                    if (isEmailValid()) {
                        if (isPhoneValid()) {
                            if (isSSNValid()) {
                                if (password.equals(password2)) {
                                    if (isPWValid()) {
                                        //call User and throw values
                                        one = new User(firstName, lastName, ssn, dob, gender, username, email, phone, photoPath, password);
                                         
                                        //Go back to login page
                                        Stage createAccount = (Stage) registerBut.getScene().getWindow();
                                        
                                        Parent root = null;
                                        try {
                                            root = FXMLLoader.load(getClass().getResource("Views/Login.fxml"));
                                        } catch (IOException ex) {
                                            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
                                        }
                                        Scene scene = new Scene(root);
                                        createAccount.setTitle("Login");
                                        scene.getStylesheets().addAll(this.getClass().getResource("style.css").toExternalForm());
                                        createAccount.setScene(scene);
                                        createAccount.centerOnScreen();
                                    } else {
                                        pw1Label.setText("Password Invalid");
                                    }
                                } else {
                                    pw2Label.setText("Passwords Do not Match");
                                }
                            } else {
                                ssnLabel.setText("SSN Invalid");
                            }
                        } else {
                            phoneLabel.setText("Phone Number Invalid");
                        }
                    } else {
                        emailLabel.setText("Email Invalid");
                    }
                } else {
                    userNameLabel.setText("Username not Available");
                }
            } else {
                userNameLabel.setText("Username Invalid");
            }
        } else {
            fillLabel.setText("All Fields Must be Completed");
            
        }
    }
    
    //check username list
    private boolean isUserNameAvailable() {
        File nameList = new File("databases/userNameList.txt");
        String tempName;
        try {
            read = new Scanner(nameList);
        } catch (FileNotFoundException ex) {
        }
        do{
            tempName = read.nextLine();
            if(tempName.equals("(("+username+"))")){
                return false;
            }
        }while(read.hasNextLine());
        read.close();
        return true;
    }
    
    //username can't have spacer paranthesis
    private boolean isUserNameValid() {
        if (username.startsWith("((")) {
            return false;
        } else if (username.endsWith("))")) {
            return false;
        } else {
            return true;
        }
    }
    
    //make sure all forms are filled
    private boolean isFilled() {
        if (firstName.isEmpty()) {
            return false;
        } else if (lastName.isEmpty()) {
            return false;
        } else if (dob == null) {
            return false;
        } else if (gender.equals("-")) {
            return false;
        } else if (username.isEmpty()) {
            return false;
        } else if (email.isEmpty()) {
            return false;
        } else if (ssn.isEmpty()) {
            return false;
        } else if (phone.isEmpty()) {
            return false;
        } else if (photoPath.isEmpty()) {
            return false;
        } else if (password.isEmpty()) {
            return false;
        } else if (password2.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }
    
    //phone numnber needs to be 10 numbers
    private boolean isPhoneValid() {
        if (phone.length() == 10) {
            try {
                
                Double.parseDouble(phone);
                
            } catch (NumberFormatException e) {
                return false;
            }
            return true;
        } else {
            return false;
        }
    }
    
    // ssn needs to be 9 numbers
    private boolean isSSNValid() {
        if (ssn.length() == 9) {
            try {
                
                Double.parseDouble(ssn);
                
            } catch (NumberFormatException e) {
                return false;
            }
            return true;
        } else {
            return false;
        }
    }
    
    //email has to me in ***@mail.*** format
    private boolean isEmailValid() {
        if (email.contains("@mail.")) {
            if (!email.endsWith(".")) {
                if (!email.startsWith("/@")) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
    
    // does passowrd have uppercase lowercase number and special
    private boolean isPWValid() {
        if (password.equals(password.toLowerCase())) {
            return false;
        } else if (password.equals(password.toUpperCase())) {
            return false;
        } else if (!haveSpecialChar()) {
            return false;
        } else if (!haveNumbers()) {
            return false;
        } else {
            return true;
        }
    }
    
    //check numbers for password
    private boolean haveNumbers() {
        if (!password.contains("1")) {
            if (!password.contains("2")) {
                if (!password.contains("3")) {
                    if (!password.contains("4")) {
                        if (!password.contains("5")) {
                            if (!password.contains("6")) {
                                if (!password.contains("7")) {
                                    if (!password.contains("8")) {
                                        if (!password.contains("9")) {
                                            if (!password.contains("0")) {
                                                return false;
                                            } else {
                                                return true;
                                            }
                                        } else {
                                            return true;
                                        }
                                    } else {
                                        return true;
                                    }
                                } else {
                                    return true;
                                }
                            } else {
                                return true;
                            }
                        } else {
                            return true;
                        }
                    } else {
                        return true;
                    }
                } else {
                    return true;
                }
            } else {
                return true;
            }
        } else {
            return true;
        }
    }

    /*
    Special characters are
    ! @ # $ % ^ & * ? < > _ - = + ; : 
     */
    private boolean haveSpecialChar() {
        if (!password.contains("!")) {
            if (!password.contains("@")) {
                if (!password.contains("#")) {
                    if (!password.contains("$")) {
                        if (!password.contains("%")) {
                            if (!password.contains("^")) {
                                if (!password.contains("&")) {
                                    if (!password.contains("?")) {
                                        if (!password.contains("<")) {
                                            if (!password.contains(">")) {
                                                if (!password.contains(">")) {
                                                    if (!password.contains("_")) {
                                                        if (!password.contains("-")) {
                                                            if (!password.contains("=")) {
                                                                if (!password.contains("+")) {
                                                                    if (!password.contains(";")) {
                                                                        if (!password.contains(":")) {
                                                                            if (!password.contains("*")) {
                                                                                return false;
                                                                            } else {
                                                                                return true;
                                                                            }
                                                                        } else {
                                                                            return true;
                                                                        }
                                                                    } else {
                                                                        return true;
                                                                    }
                                                                    
                                                                } else {
                                                                    return true;
                                                                }
                                                            } else {
                                                                return true;
                                                            }
                                                        } else {
                                                            return true;
                                                        }
                                                    } else {
                                                        return true;
                                                    }
                                                } else {
                                                    return true;
                                                }
                                            } else {
                                                return true;
                                            }
                                        } else {
                                            return true;
                                        }
                                    } else {
                                        return true;
                                    }
                                } else {
                                    return true;
                                }
                            } else {
                                return true;
                            }
                        } else {
                            return true;
                        }
                    } else {
                        return true;
                    }
                } else {
                    return true;
                }
            } else {
                return true;
            }
        } else {
            return true;
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
}
