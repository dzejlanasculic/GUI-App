/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DzejlanaSculicRS2;

import GUI.glavniProzor;
import java.sql.SQLException;

/**
 *
 * @author Džejlana Ščulić
 */
public class main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        // TODO code application logic here
     
       glavniProzor glavni=new glavniProzor();
       glavni.setVisible(true);
        
    }
}
