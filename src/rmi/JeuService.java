/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import classes.partie;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author oden
 */
public class JeuService extends UnicastRemoteObject implements interfaceJeu{
    ArrayList<partie> liste = new ArrayList<partie>();
    int v=0;
    public JeuService() throws RemoteException
    {
        super();
    }
    
    
    @Override
    public ArrayList<partie> getListOfGames() throws RemoteException {
        return liste;
    }
    @Override
  public partie getCurrentGame() throws RemoteException {
    
        return liste.get(liste.size() - 1);
    
    
}


    @Override
    public void addGame(partie p) throws RemoteException {
        liste.add(p);
    }

    @Override
    public String deviner(partie p, int combinaison) throws RemoteException {
    String res= "";
    if(v==0){
	int c;
	int k;
	String nbrC= String.valueOf(combinaison);
	String nbrG= String.valueOf(p.getCombinaison());
	int[] T= new int[4];
	boolean[] check = {false, false, false, false};
	int[] checks = new int[4];
	int[] N= new int[4];
	for(int i=0;i<4;i++) {
	N[i]=nbrG.charAt(i);
	}
	k = 0;
	for(int i=0;i<4;i++) {
	T[i]=nbrC.charAt(i);
	}

        
        for (int i = 0; i < 4; i++) {
            c = 0;
            for (int j = 0; j < 4; j++) {
                if (T[i] == N[j] && check[i] == false) {
                    if (i == j) {
                        res += "+ ";

                        check[i] = true;
                        c = 1;
                        break;
                    }
                }
            }
        if (c == 0) {
            for (int j = 0; j < 4; j++) {
                if (T[i] == N[j] && check[j] == false) {
                    res += "- ";
                    check[j] = true;
                    break;
                }
            }
        }
 }
        if (res.equals("+ + + + "))
        {
            v=1;
           Random rand = new Random();
             int i = rand.nextInt(9000)+1000;
             System.out.println(i);
             partie par = new partie("partie 0"+liste.size()+1, i);
             addGame(par);
             return "+ + + + ";
        }
    }
    else{
        return "+ + + + ";
    }
 System.out.println(res);
 return res;
 
 
    
}


public int restart(int ch){
    v=ch;
    return 0;
}




    
}
