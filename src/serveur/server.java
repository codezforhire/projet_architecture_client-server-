/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serveur;

import classes.partie;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.util.Random;
import rmi.JeuService;
import rmi.interfaceJeu;

/**
 *
 * @author oden
 */
public class server {
    
    public static void main(String[] args) throws RemoteException, MalformedURLException {
        LocateRegistry.createRegistry(1099);
            interfaceJeu jeu = new JeuService();
             Naming.rebind("rmi://localhost/jeu", jeu);
             System.out.println("Server started ! ");
             
             Random rand = new Random();
             int i = rand.nextInt(9000)+1000;
             System.out.println(i);
             partie p = new partie("partie 01", i);
             jeu.addGame(p);
            
    }
    
}
