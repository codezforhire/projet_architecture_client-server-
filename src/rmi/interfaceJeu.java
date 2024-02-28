/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import classes.partie;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

/**
 *
 * @author oden
 */
public interface interfaceJeu extends Remote{
    public ArrayList<partie> getListOfGames() throws RemoteException;
    public void addGame(partie p) throws RemoteException;
    public String deviner(partie p ,int combinaison) throws RemoteException;
    public partie getCurrentGame() throws RemoteException;
    int restart(int ch)throws RemoteException;
}
