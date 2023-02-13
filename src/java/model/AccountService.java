package model;

/**
 *
 * @author jerem
 */
public class AccountService {
    
    public User login(String username, String password){
        
    if((username.equals("abe") || username.equals("barb")) 
                && password.equals("password")){
            return new User(username, null);
        }
        else {
            return null;
        }
    }

    public User login(String username, String password) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}