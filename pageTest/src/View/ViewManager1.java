/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.io.IOException;

/**
 *
 * @author Yahya
 */
public class ViewManager1 {
    public static login loginPage;
    public static convert convertPage;
    
    
    private ViewManager1(){   
    }
    
    public static void openRegisterPage() throws IOException{
        if (loginPage == null) {
            loginPage = new login();
            loginPage.show();
        } else {
            loginPage.show();
        }
        
    }
    public static void closeRegisterPage(){
        if(loginPage != null)
            loginPage.close();
    }
    
    public static void openAdminPage() throws IOException{
        if (convertPage == null) {
            convertPage = new convert();
            convertPage.show();
        } else {
             
            convertPage.show();
        }
        
    }
    public static void closeAdminPage(){
        if(convertPage != null)
            convertPage.close();
    }
}
