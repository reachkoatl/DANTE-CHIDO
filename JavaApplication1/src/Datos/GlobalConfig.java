/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.util.ArrayList;

/**
 *
 * @author leone
 */
public  class GlobalConfig {
    
    public static String multicast;
    public static String servidor;
    public static String puerto;
    public static ArrayList<String> ListaPuertos;
    public static ArrayList<String> ListaAlias;
    public static ArrayList<String> ListaImages;
    public static int Frecuencia;
    public static int Muestra;
    public static String Network;
    public static String PortUDP;
    
    public static void SetMultiCast(String multicast){
      GlobalConfig.multicast=multicast;
    }
    
    public static String GetMultiCast(){
      return multicast;
    }
    
    public static void SetPuerto(String puerto){
      GlobalConfig.puerto=puerto;
    }
    
    public static String GetPuerto(){
      return puerto;
    }
    
    public static void SetServidor(String servidor){
       GlobalConfig.servidor=servidor;
    }
    
    public static String GetServidor(){
       return servidor;
    }
    
    public static void SetLista(ArrayList<String> ListaPuertos){
        GlobalConfig.ListaPuertos=ListaPuertos;
    }
    
    public static ArrayList<String> GetLista(){
      return ListaPuertos;
    }
    
    public static void SetAlias(ArrayList<String> ListaAlias){
      GlobalConfig.ListaAlias=ListaAlias;
    }
    
    public static ArrayList<String> GetAlias(){
      return ListaAlias;
    }
    
    public static void SetFrecuencia(int Frecuencia){
        GlobalConfig.Frecuencia=Frecuencia;
    }
    
    public static int GetFrecuencia(){
      return Frecuencia;
    }
    
    public static void SetMuestra(int Muestra){
        
        GlobalConfig.Muestra=Muestra;
    }
    
    public static int GetMuestra(){
      return Muestra;
    }
    
    public static void SetPortUDP(String PortUDP){
        GlobalConfig.PortUDP=PortUDP;
    }
    public static String GetPortUDP(){
        return PortUDP;
    }
   
   public static void SetNet(String Network){
     GlobalConfig.Network=Network;
   }
   
   public static String GetNet(){
       return Network;
   }
   
   public static void SetListaImages(ArrayList<String> ListaImages){
       GlobalConfig.ListaImages=ListaImages;
   } 
   
   public static ArrayList<String> GetListaImages(){
       return ListaImages;
   }
   
   
}
