/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import classes.partie;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import rmi.interfaceJeu;

/**
 *
 * @author oden
 */
public class client {
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void main(String[] args) {
        
            try {
                interfaceJeu jeu = (interfaceJeu) Naming.lookup("rmi://localhost:1099/jeu");
                partie p = new partie("partie 01", 1125);
                jeu.deviner(p, 1122);
            
            } catch (NotBoundException ex) {
                ex.printStackTrace();
            } catch (MalformedURLException ex) {
                ex.printStackTrace();
            } catch (RemoteException ex) {
            ex.printStackTrace();
        }
        
    }
}
