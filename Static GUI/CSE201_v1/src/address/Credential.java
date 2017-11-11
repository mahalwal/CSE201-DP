/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package address;

/**
 *
 * @author Madhav
 */
public class Credential {
    private String name;
    private EmailAddress email;
    private String password;
    private String userType;
    
    public Credential(String name, String email, String password, String userType){
        this.name = name;
        this.email = new EmailAddress(email);
//        this.email = email;
        this.password = password;
        this.userType = userType;
    }
    
    class EmailAddress{
        String email_address;
        public EmailAddress(String a){
            email_address = a;
        }
        public boolean isValid(){
            if(email_address.contains("@"))
                return true;
            return false;
        }
    }    
}


    



        
