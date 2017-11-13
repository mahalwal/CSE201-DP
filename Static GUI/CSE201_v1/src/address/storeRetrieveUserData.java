/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package address;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Iterator;
import address.*;
import java.util.ArrayList;

/**
 *
 * @author Mahalwal's
 */
public class storeRetrieveUserData {
    
    public static void serialize(String pName) throws IOException{
            ObjectOutputStream out = null;
            try{
                out = new ObjectOutputStream(new FileOutputStream(pName+".ser"));
                out.writeObject(MainApp.getListOfUser());
//                for (newUser s : MainApp.getListOfUser()) {
//                    out.writeObject(s);
//                    System.out.println(s);
//                }
            }
            finally{
                    out.close();
            }
    }
    public static void desearialize(String pName) throws IOException, ClassNotFoundException{
            ObjectInputStream in = null;
            try{
                    FileInputStream f = new FileInputStream(pName+".ser");	
                    try{
                            in = new ObjectInputStream(f);
                            while(true){
                                    try{
                                            MainApp.listOfUser = (ArrayList) in.readObject();
//                                            newUser s1 = (newUser) in.readObject();
//                                            MainApp.getListOfUser().add(s1);
                                    }
                                    catch(Exception e){
                                            break;
                                    }
                            }
                    }
                    finally{
                            in.close();
                    }
            }
            catch(FileNotFoundException e){
                    System.out.println("Playlist Empty");
                    return;
            }
    }
}
