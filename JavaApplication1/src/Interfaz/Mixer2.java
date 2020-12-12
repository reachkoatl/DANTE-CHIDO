/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Datos.Configuracion;
import Datos.XmlRead;
import Negocio.ThreadAudio;
import Negocio.ThreadSocket;
import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JSlider;

/**
 *
 * @author campos
 */
public class Mixer2 extends javax.swing.JPanel {

    /**
     * Creates new form Mixer2
     */
      private ArrayList<Integer> ganancias;
    private ArrayList<String> canales;
    private int Frecuencia;
    private int Muestra;
  
    private int alternarSOLO = 0;
    
    private  int alternar0=0;
    private  int alternar1=0;
    private  int alternar2=0;
    private  int alternar3=0;
    private  int alternar4=0;
    private  int alternar5=0;
    private  int alternar6=0;
    private  int alternar7=0;
    private  int alternar8=0;
    private  int alternar9=0;
    private  int alternar10=0;
    private  int alternar11=0;
    private  int alternar12=0;
    private  int alternar13=0;
    private  int alternar14=0;
    private  int alternar15=0;
    private  int alternar16=0;
    private  int alternar17=0;
    private  int alternar18=0;
    private  int alternar19=0;
    private  int alternar20=0;
    private  int alternar21=0;
    private  int alternar22=0;
    private  int alternar23=0;
    private  int alternar24=0;
    private  int alternar25=0;
    private  int alternar26=0;
    private  int alternar27=0;
    private  int alternar28=0;
    private  int alternar29=0;
    private  int alternar30=0;
    private  int alternar31=0;
    private  int alternar32=0;
    
    
    private ThreadAudio audio0;
    private ThreadAudio audio1;
    private ThreadAudio audio2;       
    private ThreadAudio audio3;
    private ThreadAudio audio4;
    private ThreadAudio audio5;
    private ThreadAudio audio6;
    private ThreadAudio audio7;
    private ThreadAudio audio8;
    private ThreadAudio audio9;
    private ThreadAudio audio10;
    private ThreadAudio audio11;
    private ThreadAudio audio12;
    private ThreadAudio audio13;
    private ThreadAudio audio14;
    private ThreadAudio audio15;
    private ThreadAudio audio16;
    private ThreadAudio audio17;
    private ThreadAudio audio18;
    private ThreadAudio audio19;
    private ThreadAudio audio20;
    private ThreadAudio audio21;
    private ThreadAudio audio22;
    private ThreadAudio audio23;
    private ThreadAudio audio24;
    private ThreadAudio audio25;
    private ThreadAudio audio26;
    private ThreadAudio audio27;
    private ThreadAudio audio28;
    private ThreadAudio audio29;
    private ThreadAudio audio30;
    private ThreadAudio audio31;
    private ThreadAudio audio32;
    
    private ThreadAudio[] audio = new ThreadAudio[32];
    
    private boolean LastAtivate0=false;
    private boolean LastAtivate1=false;
    private boolean LastAtivate2=false;
    private boolean LastAtivate3=false;
    private boolean LastAtivate4=false;
    private boolean LastAtivate5=false;
    private boolean LastAtivate6=false;
    private boolean LastAtivate7=false;
    private boolean LastAtivate8=false;
    private boolean LastAtivate9=false;
    private boolean LastAtivate10=false;
    private boolean LastAtivate11=false;
    private boolean LastAtivate12=false;
    private boolean LastAtivate13=false;
    private boolean LastAtivate14=false;
    private boolean LastAtivate15=false;
    private boolean LastAtivate16=false;
    private boolean LastAtivate17=false;
    private boolean LastAtivate18=false;
    private boolean LastAtivate19=false;
    private boolean LastAtivate20=false;
    private boolean LastAtivate21=false;
    private boolean LastAtivate22=false;
    private boolean LastAtivate23=false;
    private boolean LastAtivate24=false;
    private boolean LastAtivate25=false;
    private boolean LastAtivate26=false;
    private boolean LastAtivate27=false;
    private boolean LastAtivate28=false;
    private boolean LastAtivate29=false;
    private boolean LastAtivate30=false;
    private boolean LastAtivate31=false;
    
    private boolean audioforceddown0 = false;
    private boolean audioforceddown1 = false;
    private boolean audioforceddown2 = false;
    private boolean audioforceddown3 = false;
    private boolean audioforceddown4 = false;
    private boolean audioforceddown5 = false;
    private boolean audioforceddown6 = false;
    private boolean audioforceddown7 = false;
    private boolean audioforceddown8 = false;
    private boolean audioforceddown9 = false;
    private boolean audioforceddown10 = false;
    private boolean audioforceddown11 = false;
    private boolean audioforceddown12 = false;
    private boolean audioforceddown13 = false;
    private boolean audioforceddown14 = false;
    private boolean audioforceddown15 = false;
    private boolean audioforceddown16 = false;
    private boolean audioforceddown17 = false;
    private boolean audioforceddown18 = false;
    private boolean audioforceddown19 = false;
    private boolean audioforceddown20 = false;
    private boolean audioforceddown21 = false;
    private boolean audioforceddown22 = false;
    private boolean audioforceddown23 = false;
    private boolean audioforceddown24 = false;
    private boolean audioforceddown25 = false;
    private boolean audioforceddown26 = false;
    private boolean audioforceddown27 = false;
    private boolean audioforceddown28 = false;
    private boolean audioforceddown29 = false;
    private boolean audioforceddown30 = false;
    private boolean audioforceddown31 = false;
    
     public Boolean[] var = new Boolean[65];
   
    
   
    
    private Configuracion Conf;
    private XmlRead X;
    private Panel P;
    
    private ThreadSocket socket;
    
    public Mixer2(Panel p) {
        this.P=P;
        initComponents();
        X=new XmlRead();
       
        Conf= X.Read("config.xml");
        canales=new ArrayList<String>();
        ganancias=new ArrayList<Integer>();
        for(int x=0;x<65;x++)
            var[x]=false;
        
        for(int i=0;i<32;i++){
            canales.add("OFF");
            ganancias.add(1);
            
           }
        initComponents();
        LoadImages(Conf);
        LoadAlias(Conf);
    }
    
    public void SetGanancias(ArrayList<Integer> ganancias){
       this.ganancias=ganancias;
    }
    
    public ArrayList<Integer> GetGanacias(){
      return ganancias;
    }
    
     public void SetCanales(ArrayList<String> canales){
       this.canales=canales;
    }
    
    public ArrayList<String> GetCanales(){
      return canales;
    }
 
    public void SetAlias(ArrayList<String> Nombres){
       
       this.C1.setText(Nombres.get(16));
       this.C2.setText(Nombres.get(17));
       this.C3.setText(Nombres.get(18));
       this.C4.setText(Nombres.get(19));
       
      
       this.C5.setText(Nombres.get(20));
       this.C6.setText(Nombres.get(21));
       this.C7.setText(Nombres.get(22));
       this.C8.setText(Nombres.get(23));
       
       
       this.C9.setText(Nombres.get(24));
       this.C10.setText(Nombres.get(25));
       this.C11.setText(Nombres.get(26));
       this.C12.setText(Nombres.get(27));
       
       
       this.C13.setText(Nombres.get(28));
       this.C14.setText(Nombres.get(29));
       this.C15.setText(Nombres.get(30));
       this.C16.setText(Nombres.get(31));
       
       
       this.repaint();
             
    }
    public void SetImages(ArrayList<String> Images){
             
       if(!Images.get(4).equals("0")){
            try{
                I1.setIcon(new javax.swing.ImageIcon(Images.get(0)));
                this.repaint();
            }
                catch(Exception ex){
                System.out.println("ERROR DE ESCRITURA");
            }      
        }
       else
       {
           try{
                I1.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       }
       
       if(!Images.get(5).equals("0")){
                try{
                    I2.setIcon(new javax.swing.ImageIcon(Images.get(1)));
                    this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }      
        }
       else{
           try{
                I2.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       }
       
       if(!Images.get(6).equals("0")){
                try{
                    I3.setIcon(new javax.swing.ImageIcon(Images.get(2)));
                    this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }      
        }
       else{
           try{
                I3.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       }
       
       if(!Images.get(7).equals("0")){
                try{
                    I4.setIcon(new javax.swing.ImageIcon(Images.get(3)));
                    this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }      
        }
       else{
           try{
                I4.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       }
       
       
       
       
       
       
       
       
      
       
       if(!Images.get(12).equals("0")){
                try{
                    I5.setIcon(new javax.swing.ImageIcon(Images.get(8)));
                    this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }      
        }
       else{
           try{
                I5.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       }
       
       
      
       if(!Images.get(13).equals("0")){
                try{
                    I6.setIcon(new javax.swing.ImageIcon(Images.get(9)));
                    this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }      
        }
       else{
           try{
                I6.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       }
       
       
       if(!Images.get(14).equals("0")){
                try{
                    I7.setIcon(new javax.swing.ImageIcon(Images.get(10)));
                    this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }      
        }
       else{
           try{
                I7.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       }
       
       
       if(!Images.get(15).equals("0")){
                try{
                    I8.setIcon(new javax.swing.ImageIcon(Images.get(11)));
                    this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }      
        }
       else{
           try{
                I8.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       }
       
       
       
        if(!Images.get(20).equals("0")){
            try{
                I9.setIcon(new javax.swing.ImageIcon(Images.get(16)));
                this.repaint();
            }
            catch(Exception ex){
                System.out.println("ERROR DE ESCRITURA");
            }      
        }
        else{
           try{
                I9.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       }
        
        
        if(!Images.get(21).equals("0")){
            try{
                I10.setIcon(new javax.swing.ImageIcon(Images.get(17)));
                this.repaint();
            }
            catch(Exception ex){
                System.out.println("ERROR DE ESCRITURA");
            }      
        }
        else{
           try{
                I10.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       }
        
        
        if(!Images.get(22).equals("0")){
            try{
                I11.setIcon(new javax.swing.ImageIcon(Images.get(18)));
                this.repaint();
            }
            catch(Exception ex){
                System.out.println("ERROR DE ESCRITURA");
            }      
        }
        else{
           try{
                I11.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       }
        
        
        if(!Images.get(23).equals("0")){
            try{
                I12.setIcon(new javax.swing.ImageIcon(Images.get(19)));
                this.repaint();
            }
            catch(Exception ex){
                System.out.println("ERROR DE ESCRITURA");
            }      
        }
        else{
           try{
                I12.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       }
        
        
        
        if(!Images.get(28).equals("0")){
            try{
                I13.setIcon(new javax.swing.ImageIcon(Images.get(24)));
                this.repaint();
            }
            catch(Exception ex){
                System.out.println("ERROR DE ESCRITURA");
            }      
        }
        else{
           try{
                I13.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       }
        
        
        if(!Images.get(29).equals("0")){
            try{
                I14.setIcon(new javax.swing.ImageIcon(Images.get(25)));
                this.repaint();
            }
            catch(Exception ex){
                System.out.println("ERROR DE ESCRITURA");
            }      
        }
        else{
           try{
                I14.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       }
        
        
        if(!Images.get(30).equals("0")){
            try{
                I15.setIcon(new javax.swing.ImageIcon(Images.get(26)));
                this.repaint();
            }
            catch(Exception ex){
                System.out.println("ERROR DE ESCRITURA");
            }      
        }
        else{
           try{
                I15.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       }
        
        
        if(!Images.get(31).equals("0")){
            try{
                I16.setIcon(new javax.swing.ImageIcon(Images.get(27)));
                this.repaint();
            }
            catch(Exception ex){
                System.out.println("ERROR DE ESCRITURA");
            }      
        }
        else{
           try{
                I16.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       }
        
  
       
    }
     public void LoadAlias(Configuracion C){
       this.C1.setText(C.GetAlias().get(4));
       this.C2.setText(C.GetAlias().get(12));
       this.C3.setText(C.GetAlias().get(20));
       this.C4.setText(C.GetAlias().get(28));
       
       this.C5.setText(C.GetAlias().get(5));
       this.C6.setText(C.GetAlias().get(13));
       this.C7.setText(C.GetAlias().get(21));
       this.C8.setText(C.GetAlias().get(29));
       
       this.C9.setText(C.GetAlias().get(6));
       this.C10.setText(C.GetAlias().get(7));
       this.C11.setText(C.GetAlias().get(14));
       this.C12.setText(C.GetAlias().get(15));
      
       this.C13.setText(C.GetAlias().get(22));
       this.C14.setText(C.GetAlias().get(23));
       this.C15.setText(C.GetAlias().get(30));
       this.C16.setText(C.GetAlias().get(31));
       
       this.repaint();
    } 
     
     private void LoadImages(Configuracion C){
             
       if(!C.GetListaImages().get(4).equals("0")){
                try{
                    I1.setIcon(new javax.swing.ImageIcon(C.GetListaImages().get(4)));
                    this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }      
        }
       else{
           try{
                I1.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       }
       
       
       
       if(!C.GetListaImages().get(12).equals("0")){
                try{
                    I2.setIcon(new javax.swing.ImageIcon(C.GetListaImages().get(12)));
                    this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }      
        }
       else{
           try{
                I2.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       }
       
       if(!C.GetListaImages().get(20).equals("0")){
                try{
                    I3.setIcon(new javax.swing.ImageIcon(C.GetListaImages().get(20)));
                    this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }      
        }
       else{
           try{
                I3.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       }
       
       
       
       if(!C.GetListaImages().get(28).equals("0")){
                try{
                    I4.setIcon(new javax.swing.ImageIcon(C.GetListaImages().get(28)));
                    this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }      
        }
       else{
           try{
                I4.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       }
       
       
       
       
       if(!C.GetListaImages().get(5).equals("0")){
                try{
                    I5.setIcon(new javax.swing.ImageIcon(C.GetListaImages().get(5)));
                    this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }      
        }
       else{
           try{
                I5.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       }
       
       
       if(!C.GetListaImages().get(13).equals("0")){
                try{
                    I6.setIcon(new javax.swing.ImageIcon(C.GetListaImages().get(13)));
                    this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }      
        }
       else{
           try{
                I6.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       }
       
       
       if(!C.GetListaImages().get(14).equals("0")){
                try{
                    I7.setIcon(new javax.swing.ImageIcon(C.GetListaImages().get(14)));
                    this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }      
        }
       else{
           try{
                I7.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       }
       
       
       if(!C.GetListaImages().get(15).equals("0")){
                try{
                    I8.setIcon(new javax.swing.ImageIcon(C.GetListaImages().get(15)));
                    this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }      
        }
       else{
           try{
                I8.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       }
       
       
      
       
       
        if(!C.GetListaImages().get(6).equals("0")){
            try{
                I9.setIcon(new javax.swing.ImageIcon(C.GetListaImages().get(6)));
                this.repaint();
            }
            catch(Exception ex){
                System.out.println("ERROR DE ESCRITURA");
            }      
        }
        else{
           try{
                I9.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       }
        
        
        if(!C.GetListaImages().get(7).equals("0")){
            try{
                I10.setIcon(new javax.swing.ImageIcon(C.GetListaImages().get(7)));
                this.repaint();
            }
            catch(Exception ex){
                System.out.println("ERROR DE ESCRITURA");
            }      
        }
        else{
           try{
                I10.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       }
        
        
        if(!C.GetListaImages().get(14).equals("0")){
            try{
                I11.setIcon(new javax.swing.ImageIcon(C.GetListaImages().get(14)));
                this.repaint();
            }
            catch(Exception ex){
                System.out.println("ERROR DE ESCRITURA");
            }      
        }
        else{
           try{
                I11.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       }
        
        
        if(!C.GetListaImages().get(15).equals("0")){
            try{
                I12.setIcon(new javax.swing.ImageIcon(C.GetListaImages().get(15)));
                this.repaint();
            }
            catch(Exception ex){
                System.out.println("ERROR DE ESCRITURA");
            }      
        }
        else{
           try{
                I12.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       }
        
        
        
        
        if(!C.GetListaImages().get(22).equals("0")){
            try{
                I13.setIcon(new javax.swing.ImageIcon(C.GetListaImages().get(22)));
                this.repaint();
            }
            catch(Exception ex){
                System.out.println("ERROR DE ESCRITURA");
            }      
        }
        else{
           try{
                I13.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       }
        
        
        if(!C.GetListaImages().get(23).equals("0")){
            try{
                I14.setIcon(new javax.swing.ImageIcon(C.GetListaImages().get(23)));
                this.repaint();
            }
            catch(Exception ex){
                System.out.println("ERROR DE ESCRITURA");
            }      
        }
        else{
           try{
                I14.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       }
        
        if(!C.GetListaImages().get(30).equals("0")){
            try{
                I15.setIcon(new javax.swing.ImageIcon(C.GetListaImages().get(30)));
                this.repaint();
            }
            catch(Exception ex){
                System.out.println("ERROR DE ESCRITURA");
            }      
        }
        else{
           try{
                I15.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       }
        
        if(!C.GetListaImages().get(31).equals("0")){
            try{
                I16.setIcon(new javax.swing.ImageIcon(C.GetListaImages().get(31)));
                this.repaint();
            }
            catch(Exception ex){
                System.out.println("ERROR DE ESCRITURA");
            }      
        }
        else{
           try{
                I16.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       }
        
       
       
    }

     private void EnableVolume(){
        
        Component[] components = this.getComponents();
        
        for (Component component : components)
          {
            if (component instanceof JSlider)
            {
                ((JSlider) component).setValue(10);
                ((JSlider) component).enable();
            }
          }
    }
      ////
    
 

    private  void AlternarAudio(int alternar,ThreadAudio audio,int numerocanal,Configuracion C,JButton J,JSlider V){
          
          alternar++;   
    if(alternar==1){
         C=X.Read("config.xml");        
         
         audio=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(0),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),numerocanal,V,C1,socket);
         audio.start();   
         J.setBackground(Color.GREEN);
    }   

    if(alternar==2){
         audio.detener();
         audio.stop();
         alternar=0;
         J.setBackground(Color.white);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        I1 = new javax.swing.JLabel();
        C1 = new javax.swing.JButton();
        V1 = new javax.swing.JSlider();
        S1 = new javax.swing.JToggleButton();
        I2 = new javax.swing.JLabel();
        C2 = new javax.swing.JButton();
        V2 = new javax.swing.JSlider();
        S2 = new javax.swing.JToggleButton();
        I3 = new javax.swing.JLabel();
        C3 = new javax.swing.JButton();
        V3 = new javax.swing.JSlider();
        S3 = new javax.swing.JToggleButton();
        I4 = new javax.swing.JLabel();
        C4 = new javax.swing.JButton();
        V4 = new javax.swing.JSlider();
        S4 = new javax.swing.JToggleButton();
        I5 = new javax.swing.JLabel();
        C5 = new javax.swing.JButton();
        V5 = new javax.swing.JSlider();
        S5 = new javax.swing.JToggleButton();
        I6 = new javax.swing.JLabel();
        C6 = new javax.swing.JButton();
        V6 = new javax.swing.JSlider();
        S6 = new javax.swing.JToggleButton();
        I7 = new javax.swing.JLabel();
        C7 = new javax.swing.JButton();
        V7 = new javax.swing.JSlider();
        S7 = new javax.swing.JToggleButton();
        I8 = new javax.swing.JLabel();
        C8 = new javax.swing.JButton();
        V8 = new javax.swing.JSlider();
        S8 = new javax.swing.JToggleButton();
        I9 = new javax.swing.JLabel();
        C9 = new javax.swing.JButton();
        V9 = new javax.swing.JSlider();
        S9 = new javax.swing.JToggleButton();
        I10 = new javax.swing.JLabel();
        C10 = new javax.swing.JButton();
        V10 = new javax.swing.JSlider();
        S10 = new javax.swing.JToggleButton();
        I11 = new javax.swing.JLabel();
        C11 = new javax.swing.JButton();
        V11 = new javax.swing.JSlider();
        S11 = new javax.swing.JToggleButton();
        I12 = new javax.swing.JLabel();
        C12 = new javax.swing.JButton();
        V12 = new javax.swing.JSlider();
        S12 = new javax.swing.JToggleButton();
        I13 = new javax.swing.JLabel();
        C13 = new javax.swing.JButton();
        V13 = new javax.swing.JSlider();
        S13 = new javax.swing.JToggleButton();
        I14 = new javax.swing.JLabel();
        C14 = new javax.swing.JButton();
        V14 = new javax.swing.JSlider();
        S14 = new javax.swing.JToggleButton();
        V15 = new javax.swing.JSlider();
        I15 = new javax.swing.JLabel();
        C15 = new javax.swing.JButton();
        S15 = new javax.swing.JToggleButton();
        V16 = new javax.swing.JSlider();
        I16 = new javax.swing.JLabel();
        C16 = new javax.swing.JButton();
        S16 = new javax.swing.JToggleButton();

        setBackground(new java.awt.Color(51, 51, 51));
        setPreferredSize(new java.awt.Dimension(1270, 580));

        I1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        I1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        C1.setBackground(new java.awt.Color(102, 102, 102));
        C1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        C1.setForeground(new java.awt.Color(255, 255, 255));
        C1.setText("CANAL 1");
        C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C1ActionPerformed(evt);
            }
        });

        V1.setMaximum(10);
        V1.setValue(5);

        S1.setText("SOLO");
        S1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S1ActionPerformed(evt);
            }
        });

        I2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        I2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        C2.setBackground(new java.awt.Color(102, 102, 102));
        C2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        C2.setForeground(new java.awt.Color(255, 255, 255));
        C2.setText("CANAL 1");
        C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C2ActionPerformed(evt);
            }
        });

        V2.setMaximum(10);
        V2.setValue(5);

        S2.setText("SOLO");

        I3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        I3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        C3.setBackground(new java.awt.Color(102, 102, 102));
        C3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        C3.setForeground(new java.awt.Color(255, 255, 255));
        C3.setText("CANAL 1");
        C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C3ActionPerformed(evt);
            }
        });

        V3.setMaximum(10);
        V3.setValue(5);

        S3.setText("SOLO");

        I4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        I4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        C4.setBackground(new java.awt.Color(102, 102, 102));
        C4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        C4.setForeground(new java.awt.Color(255, 255, 255));
        C4.setText("CANAL 1");
        C4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C4ActionPerformed(evt);
            }
        });

        V4.setMaximum(10);
        V4.setValue(5);

        S4.setText("SOLO");

        I5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        I5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        C5.setBackground(new java.awt.Color(102, 102, 102));
        C5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        C5.setForeground(new java.awt.Color(255, 255, 255));
        C5.setText("CANAL 1");
        C5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C5ActionPerformed(evt);
            }
        });

        V5.setMaximum(10);
        V5.setValue(5);

        S5.setText("SOLO");

        I6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        I6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        C6.setBackground(new java.awt.Color(102, 102, 102));
        C6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        C6.setForeground(new java.awt.Color(255, 255, 255));
        C6.setText("CANAL 1");
        C6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C6ActionPerformed(evt);
            }
        });

        V6.setMaximum(10);
        V6.setValue(5);

        S6.setText("SOLO");

        I7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        I7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        C7.setBackground(new java.awt.Color(102, 102, 102));
        C7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        C7.setForeground(new java.awt.Color(255, 255, 255));
        C7.setText("CANAL 1");
        C7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C7ActionPerformed(evt);
            }
        });

        V7.setMaximum(10);
        V7.setValue(5);

        S7.setText("SOLO");

        I8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        I8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        C8.setBackground(new java.awt.Color(102, 102, 102));
        C8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        C8.setForeground(new java.awt.Color(255, 255, 255));
        C8.setText("CANAL 1");
        C8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C8ActionPerformed(evt);
            }
        });

        V8.setMaximum(10);
        V8.setValue(5);

        S8.setText("SOLO");

        I9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        I9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        C9.setBackground(new java.awt.Color(102, 102, 102));
        C9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        C9.setForeground(new java.awt.Color(255, 255, 255));
        C9.setText("CANAL 1");
        C9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C9ActionPerformed(evt);
            }
        });

        V9.setMaximum(10);
        V9.setValue(5);

        S9.setText("SOLO");

        I10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        I10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        C10.setBackground(new java.awt.Color(102, 102, 102));
        C10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        C10.setForeground(new java.awt.Color(255, 255, 255));
        C10.setText("CANAL 1");
        C10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C10ActionPerformed(evt);
            }
        });

        V10.setMaximum(10);
        V10.setValue(5);

        S10.setText("SOLO");

        I11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        I11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        C11.setBackground(new java.awt.Color(102, 102, 102));
        C11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        C11.setForeground(new java.awt.Color(255, 255, 255));
        C11.setText("CANAL 1");
        C11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C11ActionPerformed(evt);
            }
        });

        V11.setMaximum(10);
        V11.setValue(5);

        S11.setText("SOLO");

        I12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        I12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        C12.setBackground(new java.awt.Color(102, 102, 102));
        C12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        C12.setForeground(new java.awt.Color(255, 255, 255));
        C12.setText("CANAL 1");
        C12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C12ActionPerformed(evt);
            }
        });

        V12.setMaximum(10);
        V12.setValue(5);

        S12.setText("SOLO");

        I13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        I13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        C13.setBackground(new java.awt.Color(102, 102, 102));
        C13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        C13.setForeground(new java.awt.Color(255, 255, 255));
        C13.setText("CANAL 1");
        C13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C13ActionPerformed(evt);
            }
        });

        V13.setMaximum(10);
        V13.setValue(5);

        S13.setText("SOLO");

        I14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        I14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        C14.setBackground(new java.awt.Color(102, 102, 102));
        C14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        C14.setForeground(new java.awt.Color(255, 255, 255));
        C14.setText("CANAL 1");
        C14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C14ActionPerformed(evt);
            }
        });

        V14.setMaximum(10);
        V14.setValue(5);

        S14.setText("SOLO");

        V15.setMaximum(10);
        V15.setValue(5);

        I15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        I15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        C15.setBackground(new java.awt.Color(102, 102, 102));
        C15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        C15.setForeground(new java.awt.Color(255, 255, 255));
        C15.setText("CANAL 1");
        C15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C15ActionPerformed(evt);
            }
        });

        S15.setText("SOLO");

        V16.setMaximum(10);
        V16.setValue(5);

        I16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        I16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        C16.setBackground(new java.awt.Color(102, 102, 102));
        C16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        C16.setForeground(new java.awt.Color(255, 255, 255));
        C16.setText("CANAL 1");
        C16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C16ActionPerformed(evt);
            }
        });

        S16.setText("SOLO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(I1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(C1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(V1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(S1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(I2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(C2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(V2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(S2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(I3, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(C3, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(V3, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(S3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(I4, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(C4, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(V4, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(S4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(I5, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(C5, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(V5, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(S5)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(I6, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(C6, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(V6, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(S6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(I7, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(C7, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(V7, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(S7)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(I8, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(C8, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(V8, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(S8))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(I9, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(C9, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(V9, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(S9)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(I10, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(C10, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(V10, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(S10)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(I11, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(C11, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(V11, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(S11)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(I12, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(C12, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(V12, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(S12)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(I13, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(C13, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(V13, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(S13)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(I14, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(C14, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(V14, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(S14)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(I15, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(C15, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(V15, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(S15)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(I16, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(C16, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(V16, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(S16)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(I8, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(C8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(V8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(S8, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(I7, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(C7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(V7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(S7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(I6, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(C6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(V6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(S6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(I5, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(C5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(V5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(S5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(I3, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(C3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(V3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(S3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(I2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(C2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(V2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(S2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(I1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(C1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(V1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(S1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(I4, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(C4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(V4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(S4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(I9, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(C9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(V9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(S9, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(I10, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(C10, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(V10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(S10, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(I11, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(C11, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(V11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(S11, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(I12, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(C12, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(V12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(S12, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(I13, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(C13, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(V13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(S13, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(I14, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(C14, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(V14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(S14, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(I15, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(C15, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(V15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(S15, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(I16, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(C16, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(V16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(S16, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C1ActionPerformed
        // TODO add your handling code here:
        var[9]=true;
        if(!var[10])
        {
       // AlternarAudio(alternar4, audio4, 5, Conf, C5,V5);
        alternar4++;   
    if(alternar4==1){
         Conf=X.Read("config.xml");                
         try{
             
             audio4=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(4),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),16,V1,C1,socket);
             audio4.start();
              C1.setBackground(Color.GREEN);
              
         }
         catch(Exception e){
             System.out.println("Error de hilo ");
               C1.setBackground(Color.RED);
              var[9]=false;
         }     
    }   
    if(alternar4==2){
         audio4.detener();
         audio4.stop();
         alternar4=0;
         C1.setBackground(Color.BLUE);
         var[9]=false;
         
    }
        }
    }//GEN-LAST:event_C1ActionPerformed

    private void S1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_S1ActionPerformed

    private void C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C2ActionPerformed
        // TODO add your handling code here:
         var[25]=true;
          if(!var[26])
          {
       alternar12++;   
    if(alternar12==1){
         Conf=X.Read("config.xml");                
         try{
             audio12=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(12),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),17,V2,C2,socket);
             audio12.start();
              C2.setBackground(Color.GREEN);
              
         }
         catch(Exception e){
             System.out.println("Error de hilo ");
               C2.setBackground(Color.RED);
               var[25]=false;
         }     
    }   
    if(alternar12==2){
         audio12.detener();
         audio12.stop();
         alternar12=0;
         C2.setBackground(Color.BLUE);
         var[25]=false;
         
    }}
    }//GEN-LAST:event_C2ActionPerformed

    private void C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C3ActionPerformed
        // TODO add your handling code here:
         var[41]=true;
      if(!var[42])
      {
        alternar20++;   
    if(alternar20==1){
         Conf=X.Read("config.xml");                
         try{
             audio20=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(20),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),18,V3,C3,socket);
             audio20.start();
              C3.setBackground(Color.GREEN);
              
         }
         catch(Exception e){
             System.out.println("Error de hilo ");
               C3.setBackground(Color.RED);
               var[41]=false;
         }     
    }   
    if(alternar20==2){
         audio20.detener();
         audio20.stop();
         alternar20=0;
         C3.setBackground(Color.BLUE);
         var[41]=false;
    }   
    }
    }//GEN-LAST:event_C3ActionPerformed

    private void C4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C4ActionPerformed
        // TODO add your handling code here:
         var[11]=true;
       if(!var[12])
       {
       //   AlternarAudio(alternar5, audio5,6,Conf,C6,V6);
           alternar5++;   
    if(alternar5==1){
         Conf=X.Read("config.xml");                
         try{
             audio5=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(5),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),19,V4,C4,socket);
             audio5.start();
              C4.setBackground(Color.GREEN);
              
         }
         catch(Exception e){
             System.out.println("Error de hilo ");
               C4.setBackground(Color.RED);
               var[11]=false;
         }     
    }   
    if(alternar5==2){
         audio5.detener();
         audio5.stop();
         alternar5=0;
         C4.setBackground(Color.BLUE);
         var[11]=false;
         
    }}
    }//GEN-LAST:event_C4ActionPerformed

    private void C5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C5ActionPerformed
        // TODO add your handling code here:
        var[57]=true;
        if(!var[58])
        {
       alternar28++;   
    if(alternar28==1){
         Conf=X.Read("config.xml");                
         try{
             audio28=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(28),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),20,V5,C5,socket);
             audio28.start();
              C5.setBackground(Color.GREEN);
              
         }
         catch(Exception e){
             System.out.println("Error de hilo ");
               C5.setBackground(Color.RED);
                var[57]=false;
         }     
    }   
    if(alternar28==2){
         audio28.detener();
         audio28.stop();
         alternar28=0;
         C5.setBackground(Color.BLUE);
         var[57]=false;
    }
    }
    }//GEN-LAST:event_C5ActionPerformed

    private void C6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C6ActionPerformed
        // TODO add your handling code here:
         var[47]=true;
        if(!var[48])
        {
            alternar23++;   
    if(alternar23==1){
         Conf=X.Read("config.xml");                
         try{
             
             audio23=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(23),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),29,V6,C6,socket);
             audio23.start();
              C6.setBackground(Color.GREEN);
              
         }
         catch(Exception e){
             System.out.println("Error de hilo ");
               C6.setBackground(Color.RED);
               var[47]=false;
         }     
    }   
    if(alternar23==2){
         audio23.detener();
         audio23.stop();
         alternar23=0;
         C6.setBackground(Color.BLUE);
         var[47]=false;
    }
    }
    }//GEN-LAST:event_C6ActionPerformed

    private void C7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C7ActionPerformed
        // TODO add your handling code here:
        var[43]=true;
       if(!var[44])
       {
        alternar21++;   
    if(alternar21==1){
         Conf=X.Read("config.xml");                
         try{
             audio21=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(21),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),22,V7,C7,socket);
             audio21.start();
              C7.setBackground(Color.GREEN);
              
         }
         catch(Exception e){
             System.out.println("Error de hilo ");
               C7.setBackground(Color.RED);
               var[43]=false;
         }     
    }   
    if(alternar21==2){
         audio21.detener();
         audio21.stop();
         alternar21=0;
         C7.setBackground(Color.BLUE);
         var[43]=false;
    }  
    }
    }//GEN-LAST:event_C7ActionPerformed

    private void C8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C8ActionPerformed
        // TODO add your handling code here:
        var[59]=true;
     if(!var[60])
     {
       alternar29++;   
    if(alternar29==1){
         Conf=X.Read("config.xml");                
         try{
             audio29=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(29),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),23,V8,C8,socket);
             audio29.start();
              C8.setBackground(Color.GREEN);
             
         }
         catch(Exception e){
             System.out.println("Error de hilo ");
               C8.setBackground(Color.RED);
               var[59]=false;
         }     
    }   
    if(alternar29==2){
         audio29.detener();
         audio29.stop();
         alternar29=0;
         C8.setBackground(Color.BLUE);
         var[59]=false;
        
    }
     }
    }//GEN-LAST:event_C8ActionPerformed

    private void C9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C9ActionPerformed
        // TODO add your handling code here:
         var[13]=true;
        if(!var[14])
        {
            alternar6++;   
    if(alternar6==1){
         Conf=X.Read("config.xml");                
         try{
             
             audio6=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(6),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),24,V9,C9,socket);
             audio6.start();
              C9.setBackground(Color.GREEN);
              
         }
         catch(Exception e){
             System.out.println("Error de hilo ");
               C9.setBackground(Color.RED);
               var[13]=false;
              
         }     
    }   
    if(alternar6==2){
         audio6.detener();
         audio6.stop();
         alternar6=0;
         C9.setBackground(Color.BLUE);
         var[13]=false;
    }
        }
    }//GEN-LAST:event_C9ActionPerformed

    private void C10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C10ActionPerformed
        // TODO add your handling code here:
         var[15]=true;
        if(!var[16])
        {
            alternar7++;   
    if(alternar7==1){
         Conf=X.Read("config.xml");                
         try{
             
             audio7=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(7),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),25,V10,C10,socket);
             audio7.start();
              C10.setBackground(Color.GREEN);
              
         }
         catch(Exception e){
             System.out.println("Error de hilo ");
               C10.setBackground(Color.RED);
               var[15]=false;
         }     
    }   
    if(alternar7==2){
         audio7.detener();
         audio7.stop();
         alternar7=0;
         C10.setBackground(Color.BLUE);
         var[15]=false;
       
    }
        }
    }//GEN-LAST:event_C10ActionPerformed

    private void C11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C11ActionPerformed
        // TODO add your handling code here:
        var[29]=true;
        if(!var[30])
        {
            alternar14++;   
    if(alternar14==1){
         Conf=X.Read("config.xml");                
         try{
             
             audio14=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(14),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),26,V11,C11,socket);
             audio14.start();
              C11.setBackground(Color.GREEN);
          
         }
         catch(Exception e){
             System.out.println("Error de hilo ");
               C11.setBackground(Color.RED);
               var[29]=false;
         }  
    
    }   
    if(alternar14==2){
         audio14.detener();
         audio14.stop();
         alternar14=0;
         C11.setBackground(Color.BLUE);
         var[29]=false;
         
    }
        }
    }//GEN-LAST:event_C11ActionPerformed

    private void C12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C12ActionPerformed
        // TODO add your handling code here:
        var[31]=true;
        if(!var[32])
        {
            alternar15++;   
    if(alternar15==1){
         Conf=X.Read("config.xml");                
         try{
             
             audio15=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(15),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),27,V12,C12,socket);
             audio15.start();
              C12.setBackground(Color.GREEN);
              
         }
         catch(Exception e){
             System.out.println("Error de hilo ");
               C12.setBackground(Color.RED);
               var[31]=false;
         }     
    }   
    if(alternar15==2){
         audio15.detener();
         audio15.stop();
         alternar15=0;
         C12.setBackground(Color.BLUE);
         var[31]=false;
        
    }
        }
    }//GEN-LAST:event_C12ActionPerformed

    private void C13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C13ActionPerformed
        // TODO add your handling code here:
        var[45]=true;
        if(!var[46])
        {
            alternar22++;   
    if(alternar22==1){
         Conf=X.Read("config.xml");                
         try{
             
             audio22=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(22),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),28,V13,C13,socket);
             audio22.start();
              C13.setBackground(Color.GREEN);
              
         }
         catch(Exception e){
             System.out.println("Error de hilo ");
               C13.setBackground(Color.RED);
              var[45]=false;
         }     
    }   
    if(alternar22==2){
         audio22.detener();
         audio22.stop();
         alternar22=0;
         C13.setBackground(Color.BLUE);
         var[45]=false;
         
    }
        }
    }//GEN-LAST:event_C13ActionPerformed

    private void C14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C14ActionPerformed
        // TODO add your handling code here:
           var[47]=true;
        if(!var[48])
        {
            alternar23++;   
    if(alternar23==1){
         Conf=X.Read("config.xml");                
         try{
             
             audio23=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(23),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),29,V14,C14,socket);
             audio23.start();
              C14.setBackground(Color.GREEN);
              
         }
         catch(Exception e){
             System.out.println("Error de hilo ");
               C14.setBackground(Color.RED);
               var[47]=false;
         }     
    }   
    if(alternar23==2){
         audio23.detener();
         audio23.stop();
         alternar23=0;
         C14.setBackground(Color.BLUE);
         var[47]=false;
    }
    }
    }//GEN-LAST:event_C14ActionPerformed

    private void C15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C15ActionPerformed
        // TODO add your handling code here:
        var[61]=true;
        if(!var[62])
        {
            alternar30++;   
    if(alternar30==1){
         Conf=X.Read("config.xml");                
         try{
             
             audio30=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(30),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),30,V15,C15,socket);
             audio30.start();
              C15.setBackground(Color.GREEN);
              
         }
         catch(Exception e){
             System.out.println("Error de hilo ");
               C15.setBackground(Color.RED);
               var[61]=false;
         }     
    }   
    if(alternar30==2){
         audio30.detener();
         audio30.stop();
         alternar30=0;
         C15.setBackground(Color.BLUE);
         var[61]=false;
    }}
    }//GEN-LAST:event_C15ActionPerformed

    private void C16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C16ActionPerformed
        // TODO add your handling code here:
         var[63]=true;
        if(!var[64])
        {
            alternar31++;   
    if(alternar31==1){
         Conf=X.Read("config.xml");                
         try{
             
             audio31=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(31),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),31,V16,C16,socket);
             audio31.start();
              C16.setBackground(Color.GREEN);
              
         }
         catch(Exception e){
             System.out.println("Error de hilo ");
               C16.setBackground(Color.RED);
               var[63]=false;
         }     
    }   
    if(alternar31==2){
         audio31.detener();
         audio31.stop();
         alternar4=0;
         C16.setBackground(Color.BLUE);
         var[63]=false;
         
    }
        }
    }//GEN-LAST:event_C16ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton C1;
    private javax.swing.JButton C10;
    private javax.swing.JButton C11;
    private javax.swing.JButton C12;
    private javax.swing.JButton C13;
    private javax.swing.JButton C14;
    private javax.swing.JButton C15;
    private javax.swing.JButton C16;
    private javax.swing.JButton C2;
    private javax.swing.JButton C3;
    private javax.swing.JButton C4;
    private javax.swing.JButton C5;
    private javax.swing.JButton C6;
    private javax.swing.JButton C7;
    private javax.swing.JButton C8;
    private javax.swing.JButton C9;
    private javax.swing.JLabel I1;
    private javax.swing.JLabel I10;
    private javax.swing.JLabel I11;
    private javax.swing.JLabel I12;
    private javax.swing.JLabel I13;
    private javax.swing.JLabel I14;
    private javax.swing.JLabel I15;
    private javax.swing.JLabel I16;
    private javax.swing.JLabel I2;
    private javax.swing.JLabel I3;
    private javax.swing.JLabel I4;
    private javax.swing.JLabel I5;
    private javax.swing.JLabel I6;
    private javax.swing.JLabel I7;
    private javax.swing.JLabel I8;
    private javax.swing.JLabel I9;
    private javax.swing.JToggleButton S1;
    private javax.swing.JToggleButton S10;
    private javax.swing.JToggleButton S11;
    private javax.swing.JToggleButton S12;
    private javax.swing.JToggleButton S13;
    private javax.swing.JToggleButton S14;
    private javax.swing.JToggleButton S15;
    private javax.swing.JToggleButton S16;
    private javax.swing.JToggleButton S2;
    private javax.swing.JToggleButton S3;
    private javax.swing.JToggleButton S4;
    private javax.swing.JToggleButton S5;
    private javax.swing.JToggleButton S6;
    private javax.swing.JToggleButton S7;
    private javax.swing.JToggleButton S8;
    private javax.swing.JToggleButton S9;
    private javax.swing.JSlider V1;
    private javax.swing.JSlider V10;
    private javax.swing.JSlider V11;
    private javax.swing.JSlider V12;
    private javax.swing.JSlider V13;
    private javax.swing.JSlider V14;
    private javax.swing.JSlider V15;
    private javax.swing.JSlider V16;
    private javax.swing.JSlider V2;
    private javax.swing.JSlider V3;
    private javax.swing.JSlider V4;
    private javax.swing.JSlider V5;
    private javax.swing.JSlider V6;
    private javax.swing.JSlider V7;
    private javax.swing.JSlider V8;
    private javax.swing.JSlider V9;
    // End of variables declaration//GEN-END:variables
}
