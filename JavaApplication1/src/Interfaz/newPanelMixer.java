/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;
import Negocio.ThreadAudio;
import Negocio.ThreadSocket;
import Datos.Configuracion;
import Datos.XmlRead;
import java.awt.Color;
import java.awt.Component;
import java.awt.Image;
import java.util.ArrayList;
import javafx.scene.control.RadioButton;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JSlider;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;
/**
/**
 *
 * @author campos
 */
public class newPanelMixer extends javax.swing.JPanel {

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
    /**
     * Creates new form NewJPanel
     */
    public newPanelMixer(Panel P) {
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
        
        ///init
        V1.setValue(10);
        V2.setValue(10);
        V3.setValue(10);
        V4.setValue(10);
        V5.setValue(10);
        V6.setValue(10);
        V7.setValue(10);
        V8.setValue(10);
        V9.setValue(10);
        V10.setValue(10);
        V11.setValue(10);
        V12.setValue(10);
        V13.setValue(10);
        V14.setValue(10);
        V15.setValue(10);
        V16.setValue(10);
        V17.setValue(10);
        V18.setValue(10);
        V19.setValue(10);
        V20.setValue(10);
        V21.setValue(10);
        V22.setValue(10);
        V23.setValue(10);
        V24.setValue(10);
        V25.setValue(10);
        V26.setValue(10);
        V27.setValue(10);
        V28.setValue(10);
        V29.setValue(10);
        V30.setValue(10);
        V31.setValue(10);
        V32.setValue(10);
        
        
        
        
        LoadImages(Conf);
        LoadAlias(Conf);
        
        
        ////instanciar hilosocket
         
         //socket.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    
    
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
       
       this.C1.setText(Nombres.get(0));
       this.C2.setText(Nombres.get(1));
       this.C3.setText(Nombres.get(2));
       this.C4.setText(Nombres.get(3));
       this.C5.setText(Nombres.get(4));
       this.C6.setText(Nombres.get(28));
       this.C7.setText(Nombres.get(6));
       this.C8.setText(Nombres.get(7));
      
       this.C9.setText(Nombres.get(8));
       this.C10.setText(Nombres.get(9));
       this.C11.setText(Nombres.get(10));
       this.C12.setText(Nombres.get(11));
       this.C13.setText(Nombres.get(12));
       this.C14.setText(Nombres.get(13));
       this.C15.setText(Nombres.get(14));
       this.C16.setText(Nombres.get(15));
       
       this.C17.setText(Nombres.get(16));
       this.C18.setText(Nombres.get(17));
       this.C19.setText(Nombres.get(18));
       this.C20.setText(Nombres.get(19));
       this.C21.setText(Nombres.get(20));
       this.C22.setText(Nombres.get(21));
       this.C23.setText(Nombres.get(22));
       this.C24.setText(Nombres.get(23));
       
       this.C25.setText(Nombres.get(24));
       this.C26.setText(Nombres.get(25));
       this.C27.setText(Nombres.get(26));
       this.C28.setText(Nombres.get(27));
       this.C29.setText(Nombres.get(5));
       this.C30.setText(Nombres.get(29));
       this.C31.setText(Nombres.get(30));
       this.C32.setText(Nombres.get(31));
       
       this.repaint();
             
    }
    
    
    
    public void SetImages(ArrayList<String> Images){
             
       if(!Images.get(0).equals("0")){
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
       
       if(!Images.get(1).equals("0")){
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
       
       if(!Images.get(2).equals("0")){
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
       
       if(!Images.get(3).equals("0")){
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
       
       
       if(!Images.get(4).equals("0")){
                try{
                    I5.setIcon(new javax.swing.ImageIcon(Images.get(4)));
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
       
       
       if(!Images.get(5).equals("0")){
                try{
                    I6.setIcon(new javax.swing.ImageIcon(Images.get(5)));
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
       
       
      if(!Images.get(6).equals("0")){
                try{
                    I7.setIcon(new javax.swing.ImageIcon(Images.get(6)));
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
       if(!Images.get(7).equals("0")){
                try{
                    I8.setIcon(new javax.swing.ImageIcon(Images.get(7)));
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
       
       if(!Images.get(8).equals("0")){
                try{
                    I9.setIcon(new javax.swing.ImageIcon(Images.get(8)));
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
       
       
      
       if(!Images.get(9).equals("0")){
                try{
                    I10.setIcon(new javax.swing.ImageIcon(Images.get(9)));
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
       
       
       if(!Images.get(10).equals("0")){
                try{
                    I11.setIcon(new javax.swing.ImageIcon(Images.get(10)));
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
       
       
       if(!Images.get(11).equals("0")){
                try{
                    I12.setIcon(new javax.swing.ImageIcon(Images.get(11)));
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
       
       if(!Images.get(12).equals("0")){
                try{
                    I13.setIcon(new javax.swing.ImageIcon(Images.get(12)));
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
       
       
       if(!Images.get(13).equals("0")){
                try{
                    I14.setIcon(new javax.swing.ImageIcon(Images.get(13)));
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
       
       if(!Images.get(14).equals("0")){
            try{
                I15.setIcon(new javax.swing.ImageIcon(Images.get(14)));
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
       
       if(!Images.get(15).equals("0")){
            try{
                I16.setIcon(new javax.swing.ImageIcon(Images.get(15)));
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
       
       
        if(!Images.get(16).equals("0")){
            try{
                I17.setIcon(new javax.swing.ImageIcon(Images.get(16)));
                this.repaint();
            }
            catch(Exception ex){
                System.out.println("ERROR DE ESCRITURA");
            }      
        }
        else{
           try{
                I17.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       }
        
        
        if(!Images.get(17).equals("0")){
            try{
                I18.setIcon(new javax.swing.ImageIcon(Images.get(17)));
                this.repaint();
            }
            catch(Exception ex){
                System.out.println("ERROR DE ESCRITURA");
            }      
        }
        else{
           try{
                I18.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       }
        
        
        if(!Images.get(18).equals("0")){
            try{
                I19.setIcon(new javax.swing.ImageIcon(Images.get(18)));
                this.repaint();
            }
            catch(Exception ex){
                System.out.println("ERROR DE ESCRITURA");
            }      
        }
        else{
           try{
                I19.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       }
        
        
        if(!Images.get(19).equals("0")){
            try{
                I20.setIcon(new javax.swing.ImageIcon(Images.get(19)));
                this.repaint();
            }
            catch(Exception ex){
                System.out.println("ERROR DE ESCRITURA");
            }      
        }
        else{
           try{
                I20.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       }
        
        
        if(!Images.get(20).equals("0")){
            try{
                I21.setIcon(new javax.swing.ImageIcon(Images.get(20)));
                this.repaint();
            }
            catch(Exception ex){
                System.out.println("ERROR DE ESCRITURA");
            }      
        }
        else{
           try{
                I21.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       }
        
        
        if(!Images.get(21).equals("0")){
            try{
                I22.setIcon(new javax.swing.ImageIcon(Images.get(21)));
                this.repaint();
            }
            catch(Exception ex){
                System.out.println("ERROR DE ESCRITURA");
            }      
        }
        else{
           try{
                I22.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       }
        
        if(!Images.get(22).equals("0")){
            try{
                I23.setIcon(new javax.swing.ImageIcon(Images.get(22)));
                this.repaint();
            }
            catch(Exception ex){
                System.out.println("ERROR DE ESCRITURA");
            }      
        }
        else{
           try{
                I23.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       }
        if(!Images.get(23).equals("0")){
            try{
                I24.setIcon(new javax.swing.ImageIcon(Images.get(23)));
                this.repaint();
            }
            catch(Exception ex){
                System.out.println("ERROR DE ESCRITURA");
            }      
        }
        else{
           try{
                I24.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       }
        
        
        if(!Images.get(24).equals("0")){
            try{
                I25.setIcon(new javax.swing.ImageIcon(Images.get(24)));
                this.repaint();
            }
            catch(Exception ex){
                System.out.println("ERROR DE ESCRITURA");
            }      
        }
        else{
           try{
                I25.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       }
        
        
        if(!Images.get(25).equals("0")){
            try{
                I26.setIcon(new javax.swing.ImageIcon(Images.get(25)));
                this.repaint();
            }
            catch(Exception ex){
                System.out.println("ERROR DE ESCRITURA");
            }      
        }
        else{
           try{
                I26.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       }
        
        
        if(!Images.get(26).equals("0")){
            try{
                I27.setIcon(new javax.swing.ImageIcon(Images.get(26)));
                this.repaint();
            }
            catch(Exception ex){
                System.out.println("ERROR DE ESCRITURA");
            }      
        }
        else{
           try{
                I27.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       }
        
        
        if(!Images.get(27).equals("0")){
            try{
                I28.setIcon(new javax.swing.ImageIcon(Images.get(27)));
                this.repaint();
            }
            catch(Exception ex){
                System.out.println("ERROR DE ESCRITURA");
            }      
        }
        else{
           try{
                I28.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       }
        
        
        if(!Images.get(28).equals("0")){
            try{
                I29.setIcon(new javax.swing.ImageIcon(Images.get(28)));
                this.repaint();
            }
            catch(Exception ex){
                System.out.println("ERROR DE ESCRITURA");
            }      
        }
        else{
           try{
                I29.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       }
        
        
        if(!Images.get(29).equals("0")){
            try{
                I30.setIcon(new javax.swing.ImageIcon(Images.get(29)));
                this.repaint();
            }
            catch(Exception ex){
                System.out.println("ERROR DE ESCRITURA");
            }      
        }
        else{
           try{
                I30.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       }
        if(!Images.get(30).equals("0")){
            try{
                I31.setIcon(new javax.swing.ImageIcon(Images.get(30)));
                this.repaint();
            }
            catch(Exception ex){
                System.out.println("ERROR DE ESCRITURA");
            }      
        }
        else{
           try{
                I31.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       }
        if(!Images.get(31).equals("0")){
            try{
                I32.setIcon(new javax.swing.ImageIcon(Images.get(31)));
                this.repaint();
            }
            catch(Exception ex){
                System.out.println("ERROR DE ESCRITURA");
            }      
        }
        else{
           try{
                I32.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       }
        
        
        
       
       
    }
    
    public void LoadAlias(Configuracion C){
       this.C1.setText(C.GetAlias().get(0));
       this.C2.setText(C.GetAlias().get(1));
       this.C3.setText(C.GetAlias().get(2));
       this.C4.setText(C.GetAlias().get(3));
       this.C5.setText(C.GetAlias().get(4));
       this.C6.setText(C.GetAlias().get(28));
       this.C7.setText(C.GetAlias().get(6));
       this.C8.setText(C.GetAlias().get(7));
       this.C9.setText(C.GetAlias().get(8));
       this.C10.setText(C.GetAlias().get(9));
       this.C11.setText(C.GetAlias().get(10));
       this.C12.setText(C.GetAlias().get(11));
       this.C13.setText(C.GetAlias().get(12));
       this.C14.setText(C.GetAlias().get(13));
       this.C15.setText(C.GetAlias().get(14));
       this.C16.setText(C.GetAlias().get(15));
       this.C17.setText(C.GetAlias().get(16));
       this.C18.setText(C.GetAlias().get(17));
       this.C19.setText(C.GetAlias().get(18));
       this.C20.setText(C.GetAlias().get(19));
       this.C21.setText(C.GetAlias().get(20));
       this.C22.setText(C.GetAlias().get(21));
       this.C23.setText(C.GetAlias().get(22));
       this.C24.setText(C.GetAlias().get(23));
       this.C25.setText(C.GetAlias().get(24));
       this.C26.setText(C.GetAlias().get(25));
       this.C27.setText(C.GetAlias().get(26));
       this.C28.setText(C.GetAlias().get(27));
       this.C29.setText(C.GetAlias().get(5));
       this.C30.setText(C.GetAlias().get(29));
       this.C31.setText(C.GetAlias().get(30));
       this.C32.setText(C.GetAlias().get(31));
       this.repaint();
    } 
 
    private void LoadImages(Configuracion C){
             
       if(!C.GetListaImages().get(0).equals("0")){
                try{
                    I1.setIcon(new javax.swing.ImageIcon(C.GetListaImages().get(0)));
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
       
       
       
       if(!C.GetListaImages().get(1).equals("0")){
                try{
                    I2.setIcon(new javax.swing.ImageIcon(C.GetListaImages().get(1)));
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
       
       if(!C.GetListaImages().get(2).equals("0")){
                try{
                    I3.setIcon(new javax.swing.ImageIcon(C.GetListaImages().get(2)));
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
       
       
       
       if(!C.GetListaImages().get(3).equals("0")){
                try{
                    I4.setIcon(new javax.swing.ImageIcon(C.GetListaImages().get(3)));
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
       
       
       if(!C.GetListaImages().get(4).equals("0")){
                try{
                    I5.setIcon(new javax.swing.ImageIcon(C.GetListaImages().get(4)));
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
       
       
       if(!C.GetListaImages().get(5).equals("0")){
                try{
                    I6.setIcon(new javax.swing.ImageIcon(C.GetListaImages().get(5)));
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
       
         if(!C.GetListaImages().get(6).equals("0")){
                try{
                    I7.setIcon(new javax.swing.ImageIcon(C.GetListaImages().get(6)));
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
       
         if(!C.GetListaImages().get(7).equals("0")){
                try{
                    I8.setIcon(new javax.swing.ImageIcon(C.GetListaImages().get(7)));
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
       
       if(!C.GetListaImages().get(8).equals("0")){
                try{
                    I9.setIcon(new javax.swing.ImageIcon(C.GetListaImages().get(8)));
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
       
       
       if(!C.GetListaImages().get(9).equals("0")){
                try{
                    I10.setIcon(new javax.swing.ImageIcon(C.GetListaImages().get(9)));
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
       
       
       if(!C.GetListaImages().get(10).equals("0")){
                try{
                    I11.setIcon(new javax.swing.ImageIcon(C.GetListaImages().get(10)));
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
       
       
       if(!C.GetListaImages().get(11).equals("0")){
                try{
                    I12.setIcon(new javax.swing.ImageIcon(C.GetListaImages().get(11)));
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
       
       
       if(!C.GetListaImages().get(12).equals("0")){
                try{
                    I13.setIcon(new javax.swing.ImageIcon(C.GetListaImages().get(12)));
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
       
       
       if(!C.GetListaImages().get(13).equals("0")){
                try{
                    I14.setIcon(new javax.swing.ImageIcon(C.GetListaImages().get(13)));
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
       
         if(!C.GetListaImages().get(14).equals("0")){
                try{
                    I15.setIcon(new javax.swing.ImageIcon(C.GetListaImages().get(14)));
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
       
         if(!C.GetListaImages().get(15).equals("0")){
                try{
                    I16.setIcon(new javax.swing.ImageIcon(C.GetListaImages().get(15)));
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
       
       
       
       
        if(!C.GetListaImages().get(16).equals("0")){
            try{
                I17.setIcon(new javax.swing.ImageIcon(C.GetListaImages().get(16)));
                this.repaint();
            }
            catch(Exception ex){
                System.out.println("ERROR DE ESCRITURA");
            }      
        }
        else{
           try{
                I17.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       }
        
        
        if(!C.GetListaImages().get(17).equals("0")){
            try{
                I18.setIcon(new javax.swing.ImageIcon(C.GetListaImages().get(17)));
                this.repaint();
            }
            catch(Exception ex){
                System.out.println("ERROR DE ESCRITURA");
            }      
        }
        else{
           try{
                I18.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       }
        
        
        if(!C.GetListaImages().get(18).equals("0")){
            try{
                I19.setIcon(new javax.swing.ImageIcon(C.GetListaImages().get(18)));
                this.repaint();
            }
            catch(Exception ex){
                System.out.println("ERROR DE ESCRITURA");
            }      
        }
        else{
           try{
                I19.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       }
        
        
        if(!C.GetListaImages().get(19).equals("0")){
            try{
                I20.setIcon(new javax.swing.ImageIcon(C.GetListaImages().get(19)));
                this.repaint();
            }
            catch(Exception ex){
                System.out.println("ERROR DE ESCRITURA");
            }      
        }
        else{
           try{
                I20.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       }
        
        
        if(!C.GetListaImages().get(20).equals("0")){
            try{
                I21.setIcon(new javax.swing.ImageIcon(C.GetListaImages().get(20)));
                this.repaint();
            }
            catch(Exception ex){
                System.out.println("ERROR DE ESCRITURA");
            }      
        }
        else{
           try{
                I21.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       }
        
        
        if(!C.GetListaImages().get(21).equals("0")){
            try{
                I22.setIcon(new javax.swing.ImageIcon(C.GetListaImages().get(21)));
                this.repaint();
            }
            catch(Exception ex){
                System.out.println("ERROR DE ESCRITURA");
            }      
        }
        else{
           try{
                I22.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       }
        
         if(!C.GetListaImages().get(22).equals("0")){
                try{
                    I23.setIcon(new javax.swing.ImageIcon(C.GetListaImages().get(22)));
                    this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }      
        }
       else{
           try{
                I23.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       }
        
          if(!C.GetListaImages().get(23).equals("0")){
                try{
                    I24.setIcon(new javax.swing.ImageIcon(C.GetListaImages().get(23)));
                    this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }      
        }
       else{
           try{
                I24.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       }
       
        
        if(!C.GetListaImages().get(24).equals("0")){
            try{
                I25.setIcon(new javax.swing.ImageIcon(C.GetListaImages().get(24)));
                this.repaint();
            }
            catch(Exception ex){
                System.out.println("ERROR DE ESCRITURA");
            }      
        }
        else{
           try{
                I25.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       }
        
        
        if(!C.GetListaImages().get(25).equals("0")){
            try{
                I26.setIcon(new javax.swing.ImageIcon(C.GetListaImages().get(25)));
                this.repaint();
            }
            catch(Exception ex){
                System.out.println("ERROR DE ESCRITURA");
            }      
        }
        else{
           try{
                I26.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       }
        
        if(!C.GetListaImages().get(26).equals("0")){
            try{
                I27.setIcon(new javax.swing.ImageIcon(C.GetListaImages().get(26)));
                this.repaint();
            }
            catch(Exception ex){
                System.out.println("ERROR DE ESCRITURA");
            }      
        }
        else{
           try{
                I27.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       }
        
        if(!C.GetListaImages().get(27).equals("0")){
            try{
                I28.setIcon(new javax.swing.ImageIcon(C.GetListaImages().get(27)));
                this.repaint();
            }
            catch(Exception ex){
                System.out.println("ERROR DE ESCRITURA");
            }      
        }
        else{
           try{
                I28.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       }
        
        if(!C.GetListaImages().get(28).equals("0")){
            try{
                I29.setIcon(new javax.swing.ImageIcon(C.GetListaImages().get(28)));
                this.repaint();
            }
            catch(Exception ex){
                System.out.println("ERROR DE ESCRITURA");
            }      
        }
        else{
           try{
                I29.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       }
        
        if(!C.GetListaImages().get(29).equals("0")){
            try{
                I30.setIcon(new javax.swing.ImageIcon(C.GetListaImages().get(29)));
                this.repaint();
            }
            catch(Exception ex){
                System.out.println("ERROR DE ESCRITURA");
            }      
        }
        else{
           try{
                I30.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       }
        
         if(!C.GetListaImages().get(30).equals("0")){
                try{
                    I31.setIcon(new javax.swing.ImageIcon(C.GetListaImages().get(30)));
                    this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }      
        }
       else{
           try{
                I31.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       }
       
         if(!C.GetListaImages().get(31).equals("0")){
                try{
                    I32.setIcon(new javax.swing.ImageIcon(C.GetListaImages().get(31)));
                    this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }      
        }
       else{
           try{
                I32.setIcon(new javax.swing.ImageIcon("no_image.png"));
                this.repaint();
                }
                catch(Exception ex){
                    System.out.println("ERROR DE ESCRITURA");
                }
       
       }
      
       
       
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
                                                                                             

                                   

    private void V9StateChanged(javax.swing.event.ChangeEvent evt) {                                
        // TODO add your handling code here:
        ganancias.set(8,V9.getValue());
    }                               

    private void V10StateChanged(javax.swing.event.ChangeEvent evt) {                                 
        // TODO add your handling code here:
        ganancias.set(9,V10.getValue());
    }                                

    private void V11StateChanged(javax.swing.event.ChangeEvent evt) {                                 
        // TODO add your handling code here:
        ganancias.set(10,V11.getValue());
    }                                

    private void V12StateChanged(javax.swing.event.ChangeEvent evt) {                                 
        // TODO add your handling code here:
        ganancias.set(11,V12.getValue());
    }                                

    private void V13StateChanged(javax.swing.event.ChangeEvent evt) {                                 
        // TODO add your handling code here:
        ganancias.set(12,V13.getValue());
    }                                

    private void V14StateChanged(javax.swing.event.ChangeEvent evt) {                                 
        // TODO add your handling code here:
        ganancias.set(13,V14.getValue());
    }                                

    private void V17StateChanged(javax.swing.event.ChangeEvent evt) {                                 
        // TODO add your handling code here:
        ganancias.set(16,V17.getValue());
    }                                

    private void V18StateChanged(javax.swing.event.ChangeEvent evt) {                                 
        // TODO add your handling code here:
        ganancias.set(17,V18.getValue());
    }                                

    private void V19StateChanged(javax.swing.event.ChangeEvent evt) {                                 
        // TODO add your handling code here:
        ganancias.set(18,V19.getValue());
    }                                

    private void V20StateChanged(javax.swing.event.ChangeEvent evt) {                                 
        // TODO add your handling code here:
        ganancias.set(19,V20.getValue());
    }                                

    private void V21StateChanged(javax.swing.event.ChangeEvent evt) {                                 
        // TODO add your handling code here:
        ganancias.set(20,V21.getValue());
    }                                

    private void V22StateChanged(javax.swing.event.ChangeEvent evt) {                                 
        // TODO add your handling code here:
        ganancias.set(21,V22.getValue());
    }                                

    private void V30StateChanged(javax.swing.event.ChangeEvent evt) {                                 
        // TODO add your handling code here:
        ganancias.set(29,V30.getValue());
    }                                

    private void V25StateChanged(javax.swing.event.ChangeEvent evt) {                                 
        // TODO add your handling code here:
        ganancias.set(24,V25.getValue());
    }                                

    private void V26StateChanged(javax.swing.event.ChangeEvent evt) {                                 
        // TODO add your handling code here:
        ganancias.set(25,V26.getValue());
    }                                

    private void V27StateChanged(javax.swing.event.ChangeEvent evt) {                                 
        // TODO add your handling code here:
        ganancias.set(26,V27.getValue());
    }                                

    private void V28StateChanged(javax.swing.event.ChangeEvent evt) {                                 
        // TODO add your handling code here:
        ganancias.set(27,V28.getValue());
    }                                

    private void V29StateChanged(javax.swing.event.ChangeEvent evt) {                                 
        // TODO add your handling code here:
        ganancias.set(28,V29.getValue());
    }                                                                     
                     
                       
                                                         

    private void V1StateChanged(javax.swing.event.ChangeEvent evt) {                                
        // TODO add your handling code here:
         ganancias.set(0,V1.getValue());
    }                               

    private void V2StateChanged(javax.swing.event.ChangeEvent evt) {                                
        // TODO add your handling code here:
        ganancias.set(1,V2.getValue());
    }                               

    private void V3StateChanged(javax.swing.event.ChangeEvent evt) {                                
        // TODO add your handling code here:
        ganancias.set(2,V3.getValue());
    }                               

    private void V4StateChanged(javax.swing.event.ChangeEvent evt) {                                
        // TODO add your handling code here:
        ganancias.set(3,V4.getValue());
    }                               

    private void V5StateChanged(javax.swing.event.ChangeEvent evt) {                                
        // TODO add your handling code here:
        ganancias.set(4,V5.getValue());
    }                               

    private void V6StateChanged(javax.swing.event.ChangeEvent evt) {                                
        // TODO add your handling code here:
        ganancias.set(5,V6.getValue());
    }                               
                                

    ///////
    
    private boolean desactivateButton(JButton boton,JRadioButton radio,int banderaAlternar,ThreadAudio tempAudio,boolean lastActivate){
       
        try{
            if(!radio.isSelected() && tempAudio.IsRunning()){
            tempAudio.SetForcedDown(true);
            //tempAudio.detener();
            banderaAlternar=0;
            boton.setBackground(Color.blue);
            lastActivate = true;
            radio.setEnabled(false);
            return true;
        }
        }
        catch(Exception ex){
            return false;
            
        }
        
        
        return false;
    }
    
    private void activateLastButton(JButton boton,JRadioButton radio,int banderaAlternar,ThreadAudio tempAudio,boolean lastActivate,JSlider V){
        
        if(lastActivate==true){
            lastActivate=false;
            banderaAlternar=1;
            
            try{
            Conf=X.Read("config.xml"); 
            tempAudio=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(0),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),0,V,boton,socket);
            tempAudio.start();
            boton.setBackground(Color.GREEN);
            
            radio.setEnabled(true);
            radio.setSelected(false);
         }
         catch(Exception e){
            System.out.println("Error de hilo ");
            boton.setBackground(Color.RED);
            radio.setEnabled(false);
            
         }
            
        }
        
    }
    
    
    
    private void DisableVolumeExcept(JSlider j, JToggleButton r,int y, int hilo){
        
        Component[] components = this.getComponents();
        
        for (Component component : components)
          {
            if (component instanceof JSlider)
            {
                if(component.equals(j))
                    ((JSlider)component).setValue(10);
                
                if (!component.equals(j)){
                    ((JSlider) component).setValue(0);
                    ((JSlider) component).disable();
                    
                }
            }
            if(component instanceof JToggleButton)
            {
                if(component.equals(r))
                    r.setSelected(true);
                
                else
                    ((JToggleButton)component).setSelected(false);
                   ((JToggleButton) component).setBackground(Color.white);
            }
          }
        for (int x=0;x<65;x++)
        {
            if(!(x==y))
            {
                var[x]=false;
            }
        }
        for (int x=0;x<32;x++)
        {
            if(!(hilo==x))
            {
                try{
                audio[x].detener();
                audio[x].stop();
                }
                catch(Exception e)
                {
                    System.out.println("error cerrando ");
                }
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
    
    void test(){
    }
                                   

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
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        I1 = new javax.swing.JLabel();
        I9 = new javax.swing.JLabel();
        V1 = new javax.swing.JSlider();
        C1 = new javax.swing.JButton();
        C9 = new javax.swing.JButton();
        V9 = new javax.swing.JSlider();
        S1 = new javax.swing.JToggleButton();
        I17 = new javax.swing.JLabel();
        C17 = new javax.swing.JButton();
        V17 = new javax.swing.JSlider();
        S17 = new javax.swing.JToggleButton();
        I25 = new javax.swing.JLabel();
        C25 = new javax.swing.JButton();
        V25 = new javax.swing.JSlider();
        S25 = new javax.swing.JToggleButton();
        S9 = new javax.swing.JToggleButton();
        I3 = new javax.swing.JLabel();
        C3 = new javax.swing.JButton();
        V3 = new javax.swing.JSlider();
        S3 = new javax.swing.JToggleButton();
        I11 = new javax.swing.JLabel();
        C11 = new javax.swing.JButton();
        V11 = new javax.swing.JSlider();
        S11 = new javax.swing.JToggleButton();
        I19 = new javax.swing.JLabel();
        C19 = new javax.swing.JButton();
        V19 = new javax.swing.JSlider();
        S19 = new javax.swing.JToggleButton();
        I27 = new javax.swing.JLabel();
        C27 = new javax.swing.JButton();
        V27 = new javax.swing.JSlider();
        S27 = new javax.swing.JToggleButton();
        S2 = new javax.swing.JToggleButton();
        V2 = new javax.swing.JSlider();
        C2 = new javax.swing.JButton();
        I2 = new javax.swing.JLabel();
        S10 = new javax.swing.JToggleButton();
        V10 = new javax.swing.JSlider();
        C10 = new javax.swing.JButton();
        I10 = new javax.swing.JLabel();
        S18 = new javax.swing.JToggleButton();
        V18 = new javax.swing.JSlider();
        C18 = new javax.swing.JButton();
        I18 = new javax.swing.JLabel();
        S26 = new javax.swing.JToggleButton();
        V26 = new javax.swing.JSlider();
        C26 = new javax.swing.JButton();
        I26 = new javax.swing.JLabel();
        I4 = new javax.swing.JLabel();
        C4 = new javax.swing.JButton();
        V4 = new javax.swing.JSlider();
        S4 = new javax.swing.JToggleButton();
        I12 = new javax.swing.JLabel();
        C12 = new javax.swing.JButton();
        V12 = new javax.swing.JSlider();
        S12 = new javax.swing.JToggleButton();
        I20 = new javax.swing.JLabel();
        C20 = new javax.swing.JButton();
        V20 = new javax.swing.JSlider();
        S20 = new javax.swing.JToggleButton();
        I28 = new javax.swing.JLabel();
        C28 = new javax.swing.JButton();
        V28 = new javax.swing.JSlider();
        S28 = new javax.swing.JToggleButton();
        I5 = new javax.swing.JLabel();
        C5 = new javax.swing.JButton();
        V5 = new javax.swing.JSlider();
        S5 = new javax.swing.JToggleButton();
        I7 = new javax.swing.JLabel();
        C7 = new javax.swing.JButton();
        V7 = new javax.swing.JSlider();
        S7 = new javax.swing.JToggleButton();
        I13 = new javax.swing.JLabel();
        C13 = new javax.swing.JButton();
        V13 = new javax.swing.JSlider();
        S13 = new javax.swing.JToggleButton();
        I21 = new javax.swing.JLabel();
        C21 = new javax.swing.JButton();
        V21 = new javax.swing.JSlider();
        S21 = new javax.swing.JToggleButton();
        I29 = new javax.swing.JLabel();
        C6 = new javax.swing.JButton();
        V6 = new javax.swing.JSlider();
        S6 = new javax.swing.JToggleButton();
        I6 = new javax.swing.JLabel();
        C29 = new javax.swing.JButton();
        V29 = new javax.swing.JSlider();
        S29 = new javax.swing.JToggleButton();
        I14 = new javax.swing.JLabel();
        C14 = new javax.swing.JButton();
        V14 = new javax.swing.JSlider();
        S14 = new javax.swing.JToggleButton();
        I22 = new javax.swing.JLabel();
        C22 = new javax.swing.JButton();
        V22 = new javax.swing.JSlider();
        S22 = new javax.swing.JToggleButton();
        I30 = new javax.swing.JLabel();
        C30 = new javax.swing.JButton();
        V30 = new javax.swing.JSlider();
        S30 = new javax.swing.JToggleButton();
        I8 = new javax.swing.JLabel();
        C8 = new javax.swing.JButton();
        V8 = new javax.swing.JSlider();
        S8 = new javax.swing.JToggleButton();
        I15 = new javax.swing.JLabel();
        C15 = new javax.swing.JButton();
        V15 = new javax.swing.JSlider();
        S15 = new javax.swing.JToggleButton();
        I16 = new javax.swing.JLabel();
        C16 = new javax.swing.JButton();
        V16 = new javax.swing.JSlider();
        S16 = new javax.swing.JToggleButton();
        I23 = new javax.swing.JLabel();
        C23 = new javax.swing.JButton();
        V23 = new javax.swing.JSlider();
        S23 = new javax.swing.JToggleButton();
        I24 = new javax.swing.JLabel();
        C24 = new javax.swing.JButton();
        V24 = new javax.swing.JSlider();
        S24 = new javax.swing.JToggleButton();
        I31 = new javax.swing.JLabel();
        C31 = new javax.swing.JButton();
        V31 = new javax.swing.JSlider();
        S31 = new javax.swing.JToggleButton();
        I32 = new javax.swing.JLabel();
        C32 = new javax.swing.JButton();
        V32 = new javax.swing.JSlider();
        S32 = new javax.swing.JToggleButton();

        setBackground(new java.awt.Color(51, 51, 51));

        I1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        I9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        V1.setMaximum(10);

        C1.setBackground(new java.awt.Color(102, 102, 102));
        C1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        C1.setForeground(new java.awt.Color(255, 255, 255));
        C1.setText("jButton1");
        C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C1ActionPerformed(evt);
            }
        });

        C9.setBackground(new java.awt.Color(102, 102, 102));
        C9.setForeground(new java.awt.Color(255, 255, 255));
        C9.setText("jButton1");
        C9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C9ActionPerformed(evt);
            }
        });

        V9.setMaximum(10);

        S1.setText("SOLO");
        S1.setContentAreaFilled(false);
        S1.setOpaque(true);
        S1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S1ActionPerformed(evt);
            }
        });

        I17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        C17.setBackground(new java.awt.Color(102, 102, 102));
        C17.setForeground(new java.awt.Color(255, 255, 255));
        C17.setText("jButton1");
        C17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C17ActionPerformed(evt);
            }
        });

        V17.setMaximum(10);

        S17.setText("SOLO");
        S17.setContentAreaFilled(false);
        S17.setOpaque(true);
        S17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S17ActionPerformed(evt);
            }
        });

        I25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        C25.setBackground(new java.awt.Color(102, 102, 102));
        C25.setForeground(new java.awt.Color(255, 255, 255));
        C25.setText("jButton1");
        C25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C25ActionPerformed(evt);
            }
        });

        V25.setMaximum(10);

        S25.setText("SOLO");
        S25.setContentAreaFilled(false);
        S25.setOpaque(true);
        S25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S25ActionPerformed(evt);
            }
        });

        S9.setText("SOLO");
        S9.setContentAreaFilled(false);
        S9.setOpaque(true);
        S9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S9ActionPerformed(evt);
            }
        });

        I3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        C3.setBackground(new java.awt.Color(102, 102, 102));
        C3.setForeground(new java.awt.Color(255, 255, 255));
        C3.setText("jButton1");
        C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C3ActionPerformed(evt);
            }
        });

        V3.setMaximum(10);

        S3.setText("SOLO");
        S3.setContentAreaFilled(false);
        S3.setOpaque(true);
        S3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S3ActionPerformed(evt);
            }
        });

        I11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        C11.setBackground(new java.awt.Color(102, 102, 102));
        C11.setForeground(new java.awt.Color(255, 255, 255));
        C11.setText("jButton1");
        C11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C11ActionPerformed(evt);
            }
<<<<<<< Updated upstream
          }
    }
      ////
    
    void test(){
    }
    
    
    
                        

                                   
=======
        });

        V11.setMaximum(10);
>>>>>>> Stashed changes

        S11.setText("SOLO");
        S11.setContentAreaFilled(false);
        S11.setOpaque(true);
        S11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S11ActionPerformed(evt);
            }
        });

        I19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        C19.setBackground(new java.awt.Color(102, 102, 102));
        C19.setForeground(new java.awt.Color(255, 255, 255));
        C19.setText("jButton1");
        C19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C19ActionPerformed(evt);
            }
        });

        V19.setMaximum(10);

        S19.setText("SOLO");
        S19.setContentAreaFilled(false);
        S19.setOpaque(true);
        S19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S19ActionPerformed(evt);
            }
        });

        I27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        C27.setBackground(new java.awt.Color(102, 102, 102));
        C27.setForeground(new java.awt.Color(255, 255, 255));
        C27.setText("jButton1");
        C27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C27ActionPerformed(evt);
            }
        });

        V27.setMaximum(10);

        S27.setText("SOLO");
        S27.setContentAreaFilled(false);
        S27.setOpaque(true);
        S27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S27ActionPerformed(evt);
            }
        });

        S2.setText("SOLO");
        S2.setContentAreaFilled(false);
        S2.setOpaque(true);
        S2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S2ActionPerformed(evt);
            }
        });

        V2.setMaximum(10);

        C2.setBackground(new java.awt.Color(102, 102, 102));
        C2.setForeground(new java.awt.Color(255, 255, 255));
        C2.setText("jButton1");
        C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C2ActionPerformed(evt);
            }
        });

        I2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        S10.setText("SOLO");
        S10.setContentAreaFilled(false);
        S10.setOpaque(true);
        S10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S10ActionPerformed(evt);
            }
        });

        V10.setMaximum(10);

        C10.setBackground(new java.awt.Color(102, 102, 102));
        C10.setForeground(new java.awt.Color(255, 255, 255));
        C10.setText("jButton1");
        C10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C10ActionPerformed(evt);
            }
        });

        I10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        S18.setText("SOLO");
        S18.setContentAreaFilled(false);
        S18.setOpaque(true);
        S18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S18ActionPerformed(evt);
            }
        });

        V18.setMaximum(10);

        C18.setBackground(new java.awt.Color(102, 102, 102));
        C18.setForeground(new java.awt.Color(255, 255, 255));
        C18.setText("jButton1");
        C18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C18ActionPerformed(evt);
            }
        });

        I18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        S26.setText("SOLO");
        S26.setContentAreaFilled(false);
        S26.setOpaque(true);
        S26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S26ActionPerformed(evt);
            }
        });

        V26.setMaximum(10);

        C26.setBackground(new java.awt.Color(102, 102, 120));
        C26.setForeground(new java.awt.Color(255, 255, 255));
        C26.setText("jButton1");
        C26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C26ActionPerformed(evt);
            }
        });

        I26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        I4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        C4.setBackground(new java.awt.Color(102, 102, 102));
        C4.setForeground(new java.awt.Color(255, 255, 255));
        C4.setText("jButton1");
        C4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C4ActionPerformed(evt);
            }
        });

        V4.setMaximum(10);

        S4.setText("SOLO");
        S4.setContentAreaFilled(false);
        S4.setOpaque(true);
        S4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S4ActionPerformed(evt);
            }
        });

        I12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        C12.setBackground(new java.awt.Color(102, 102, 102));
        C12.setForeground(new java.awt.Color(255, 255, 255));
        C12.setText("jButton1");
        C12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C12ActionPerformed(evt);
            }
        });

        V12.setMaximum(10);

        S12.setText("SOLO");
        S12.setContentAreaFilled(false);
        S12.setOpaque(true);
        S12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S12ActionPerformed(evt);
            }
        });

        I20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        C20.setBackground(new java.awt.Color(102, 102, 102));
        C20.setForeground(new java.awt.Color(255, 255, 255));
        C20.setText("jButton1");
        C20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C20ActionPerformed(evt);
            }
        });

        V20.setMaximum(10);

        S20.setText("SOLO");
        S20.setContentAreaFilled(false);
        S20.setOpaque(true);
        S20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S20ActionPerformed(evt);
            }
        });

        I28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

<<<<<<< Updated upstream
        S1.setText("SOLO");
        S1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S1ActionPerformed(evt);
=======
        C28.setBackground(new java.awt.Color(102, 102, 102));
        C28.setForeground(new java.awt.Color(255, 255, 255));
        C28.setText("jButton1");
        C28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C28ActionPerformed(evt);
>>>>>>> Stashed changes
            }
        });

        V28.setMaximum(10);

        S28.setText("SOLO");
        S28.setContentAreaFilled(false);
        S28.setOpaque(true);
        S28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S28ActionPerformed(evt);
            }
        });

        I5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        C5.setBackground(new java.awt.Color(102, 102, 102));
        C5.setForeground(new java.awt.Color(255, 255, 255));
        C5.setText("jButton1");
        C5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C5ActionPerformed(evt);
            }
        });

        V5.setMaximum(10);

        S5.setText("SOLO");
        S5.setContentAreaFilled(false);
        S5.setOpaque(true);
        S5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S5ActionPerformed(evt);
            }
        });

        I7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

<<<<<<< Updated upstream
        S9.setText("SOLO");
        S9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S9ActionPerformed(evt);
=======
        C7.setBackground(new java.awt.Color(102, 102, 102));
        C7.setForeground(new java.awt.Color(255, 255, 255));
        C7.setText("jButton1");
        C7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C7ActionPerformed(evt);
>>>>>>> Stashed changes
            }
        });

        V7.setMaximum(10);

        S7.setText("SOLO");
        S7.setContentAreaFilled(false);
        S7.setOpaque(true);
        S7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S7ActionPerformed(evt);
            }
        });

        I13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        C13.setBackground(new java.awt.Color(102, 102, 102));
        C13.setForeground(new java.awt.Color(255, 255, 255));
        C13.setText("jButton1");
        C13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C13ActionPerformed(evt);
            }
        });

        V13.setMaximum(10);

        S13.setText("SOLO");
        S13.setContentAreaFilled(false);
        S13.setOpaque(true);
        S13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S13ActionPerformed(evt);
            }
        });

        I21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        C21.setBackground(new java.awt.Color(102, 102, 102));
        C21.setForeground(new java.awt.Color(255, 255, 255));
        C21.setText("jButton1");
        C21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C21ActionPerformed(evt);
            }
        });

        V21.setMaximum(10);

        S21.setText("SOLO");
        S21.setContentAreaFilled(false);
        S21.setOpaque(true);
        S21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S21ActionPerformed(evt);
            }
        });

        I29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        C6.setBackground(new java.awt.Color(102, 102, 102));
        C6.setForeground(new java.awt.Color(255, 255, 255));
        C6.setText("jButton1");
        C6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C6ActionPerformed(evt);
            }
        });

        V6.setMaximum(10);

        S6.setText("SOLO");
        S6.setContentAreaFilled(false);
        S6.setOpaque(true);
        S6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S6ActionPerformed(evt);
            }
        });

        I6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        C29.setBackground(new java.awt.Color(102, 102, 102));
        C29.setForeground(new java.awt.Color(255, 255, 255));
        C29.setText("jButton1");
        C29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C29ActionPerformed(evt);
            }
        });

        V29.setMaximum(10);

        S29.setText("SOLO");
        S29.setContentAreaFilled(false);
        S29.setOpaque(true);
        S29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S29ActionPerformed(evt);
            }
        });

        I14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        C14.setBackground(new java.awt.Color(102, 102, 102));
        C14.setForeground(new java.awt.Color(255, 255, 255));
        C14.setText("jButton1");
        C14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C14ActionPerformed(evt);
            }
        });

        V14.setMaximum(10);

        S14.setText("SOLO");
        S14.setContentAreaFilled(false);
        S14.setOpaque(true);
        S14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S14ActionPerformed(evt);
            }
        });

        I22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        C22.setBackground(new java.awt.Color(102, 102, 102));
        C22.setForeground(new java.awt.Color(255, 255, 255));
        C22.setText("jButton1");
        C22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C22ActionPerformed(evt);
            }
        });

        V22.setMaximum(10);

        S22.setText("SOLO");
        S22.setContentAreaFilled(false);
        S22.setOpaque(true);
        S22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S22ActionPerformed(evt);
            }
        });

        I30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        C30.setBackground(new java.awt.Color(102, 102, 102));
        C30.setForeground(new java.awt.Color(255, 255, 255));
        C30.setText("jButton1");
        C30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C30ActionPerformed(evt);
            }
        });

        V30.setMaximum(10);

        S30.setText("SOLO");
        S30.setContentAreaFilled(false);
        S30.setOpaque(true);
        S30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S30ActionPerformed(evt);
            }
        });

        I8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        C8.setBackground(new java.awt.Color(102, 102, 102));
        C8.setForeground(new java.awt.Color(255, 255, 255));
        C8.setText("jButton1");
        C8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C8ActionPerformed(evt);
            }
        });

        V8.setMaximum(10);

        S8.setText("SOLO");
        S8.setContentAreaFilled(false);
        S8.setOpaque(true);
        S8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S8ActionPerformed(evt);
            }
        });

        I15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        C15.setBackground(new java.awt.Color(102, 102, 102));
        C15.setForeground(new java.awt.Color(255, 255, 255));
        C15.setText("jButton1");
        C15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C15ActionPerformed(evt);
            }
        });

        V15.setMaximum(10);

        S15.setText("SOLO");
        S15.setContentAreaFilled(false);
        S15.setOpaque(true);
        S15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S15ActionPerformed(evt);
            }
        });

        I16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        C16.setBackground(new java.awt.Color(102, 102, 102));
        C16.setForeground(new java.awt.Color(255, 255, 255));
        C16.setText("jButton1");
        C16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C16ActionPerformed(evt);
            }
        });

        V16.setMaximum(10);

        S16.setText("SOLO");
        S16.setContentAreaFilled(false);
        S16.setOpaque(true);
        S16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S16ActionPerformed(evt);
            }
        });

        I23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        C23.setBackground(new java.awt.Color(102, 102, 102));
        C23.setForeground(new java.awt.Color(255, 255, 255));
        C23.setText("jButton1");
        C23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C23ActionPerformed(evt);
            }
        });

        V23.setMaximum(10);

        S23.setText("SOLO");
        S23.setContentAreaFilled(false);
        S23.setOpaque(true);
        S23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S23ActionPerformed(evt);
            }
        });

        I24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        C24.setBackground(new java.awt.Color(102, 102, 102));
        C24.setForeground(new java.awt.Color(255, 255, 255));
        C24.setText("jButton1");
        C24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C24ActionPerformed(evt);
            }
        });

        V24.setMaximum(10);

        S24.setText("SOLO");
        S24.setContentAreaFilled(false);
        S24.setOpaque(true);
        S24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S24ActionPerformed(evt);
            }
        });

        I31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        C31.setBackground(new java.awt.Color(102, 102, 102));
        C31.setForeground(new java.awt.Color(255, 255, 255));
        C31.setText("jButton1");
        C31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C31ActionPerformed(evt);
            }
        });

        V31.setMaximum(10);

        S31.setText("SOLO");
        S31.setContentAreaFilled(false);
        S31.setOpaque(true);
        S31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S31ActionPerformed(evt);
            }
        });

        I32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        C32.setBackground(new java.awt.Color(102, 102, 102));
        C32.setForeground(new java.awt.Color(255, 255, 255));
        C32.setText("jButton1");
        C32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C32ActionPerformed(evt);
            }
        });

        V32.setMaximum(10);

        S32.setText("SOLO");
        S32.setContentAreaFilled(false);
        S32.setOpaque(true);
        S32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S32ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(I1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(I9, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(V1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(V9, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(C1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(C9, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(14, 14, 14))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(S1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(S9)
                                .addGap(54, 54, 54)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(I17, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(V17, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(C17, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(S17)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(I25, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(V25, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(C25, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(S25)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(I3, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(V3, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(C3, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(S3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(I11, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(V11, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(C11, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(S11)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(I19, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(V19, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(C19, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(S19)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(I27, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(V27, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(C27, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(S27))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(I2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(V2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(C2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addComponent(S2)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(I10, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(V10, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(C10, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addComponent(S10)))
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(I18, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(V18, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(C18, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addComponent(S18)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(I26, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(V26, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(C26, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addComponent(S26)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(I4, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(V4, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(C4, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addComponent(S4)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(I12, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(V12, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(C12, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addComponent(S12)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(I20, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(V20, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(C20, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addComponent(S20)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(I28, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(V28, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(C28, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addComponent(S28))))
                            .addComponent(I7, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(V7, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(C7, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(I5, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(V5, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(C5, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(S7)
                                        .addGap(48, 48, 48)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(I8, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(V8, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(C8, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(40, 40, 40)
                                                .addComponent(S8)))
                                        .addGap(14, 14, 14)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(I15, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(V15, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(C15, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(40, 40, 40)
                                                .addComponent(S15)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(I16, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(V16, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(C16, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(40, 40, 40)
                                                .addComponent(S16)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(I23, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(V23, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(C23, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(40, 40, 40)
                                                .addComponent(S23)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(I24, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(V24, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(C24, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(40, 40, 40)
                                                .addComponent(S24)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(I31, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(V31, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(C31, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(40, 40, 40)
                                                .addComponent(S31)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(I32, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(V32, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(C32, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(40, 40, 40)
                                                .addComponent(S32))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(S5)
                                        .addGap(48, 48, 48)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(I13, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(V13, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(C13, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(40, 40, 40)
                                                .addComponent(S13)))
                                        .addGap(14, 14, 14)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(I21, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(V21, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(C21, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(40, 40, 40)
                                                .addComponent(S21)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(I29, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(V6, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(C6, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(40, 40, 40)
                                                .addComponent(S6)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(I6, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(V29, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(C29, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(40, 40, 40)
                                                .addComponent(S29)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(I14, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(V14, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(C14, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(40, 40, 40)
                                                .addComponent(S14)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(I22, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(V22, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(C22, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(40, 40, 40)
                                                .addComponent(S22)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(I30, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(V30, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(C30, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(40, 40, 40)
                                                .addComponent(S30)))))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(I27, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(C27, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(V27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(S27, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(I19, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(C19, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(V19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(S19, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(I11, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(C11, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(V11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(S11, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(I3, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(C3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(V3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(S3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(I25, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(C25, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(V25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(S25, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(I9, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(I1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(C1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(C9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(V1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(V9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(S1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(S9, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(I17, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(C17, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(V17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(S17, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(I2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(C2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(V2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(S2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(I10, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(C10, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(V10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(S10, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(I18, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(C18, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(V18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(S18, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(I26, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(C26, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(V26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(S26, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(I4, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(C4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(V4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(S4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(I12, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(C12, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(V12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(S12, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(I20, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(C20, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(V20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(S20, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(I28, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(C28, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(V28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(S28, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(I5, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(C5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(V5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(S5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(I13, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(C13, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(V13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(S13, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(I21, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(C21, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(V21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(S21, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(I29, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(C6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(V6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(S6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(I6, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(C29, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(V29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(S29, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(I14, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(C14, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(V14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(S14, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(I22, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(C22, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(V22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(S22, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(I30, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(C30, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(V30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(S30, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(I7, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(C7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(V7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(S7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(I8, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(C8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(V8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(S8, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(I15, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(C15, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(V15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(S15, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(I16, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(C16, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(V16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(S16, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(I23, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(C23, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(V23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(S23, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(I24, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(C24, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(V24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(S24, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(I31, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(C31, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(V31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(S31, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(I32, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(C32, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(V32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(S32, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void C19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C19ActionPerformed
        // TODO add your handling code here:
         var[37]=true;
      if(!var[38]);
       alternar18++;   
    if(alternar18==1){
         Conf=X.Read("config.xml");                
         try{
             audio18=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(18),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),6,V19,C19,socket);
             audio18.start();
              C19.setBackground(Color.GREEN);
              
         }
         catch(Exception e){
             System.out.println("Error de hilo ");
               C19.setBackground(Color.RED);
               var[37]=false;
         }     
    }   
    if(alternar18==2){
         audio18.detener();
         audio18.stop();
         alternar18=0;
         C19.setBackground(Color.BLUE);
         var[37]=false;
    }
    
    }//GEN-LAST:event_C19ActionPerformed

    private void C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C1ActionPerformed
        // TODO add your handling code here:
        var[1]=true;
      if(!var[2])
      {// TODO add your handling code here:     
    alternar0++;   
    if(alternar0==1){
                     
         try{
            Conf=X.Read("config.xml"); 
            audio0=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(0),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),0,V1,C1,socket);
            audio0.start();
            C1.setBackground(Color.GREEN);
            
         }
         catch(Exception e){
            System.out.println("Error de hilo ");
            C1.setBackground(Color.RED);
            S1.setEnabled(false);
            var[1]=false;
         }
         
                     
    }   

    if(alternar0==2){
         audio0.detener();
         audio0.stop();
         alternar0=0;
         C1.setBackground(Color.BLUE);
         var[1]=false;
         
         
    }
      }
    }//GEN-LAST:event_C1ActionPerformed

    private void C9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C9ActionPerformed
        // TODO add your handling code here:
        var[17]=true;
        if(!var[18])
        {
       alternar8++;   
    if(alternar8==1){
         Conf=X.Read("config.xml");                
         try{
             audio8=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(8),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),1,V9,C9,socket);
             audio8.start();
              C9.setBackground(Color.GREEN);
              
         }
         catch(Exception e){
             System.out.println("Error de hilo ");
               C9.setBackground(Color.RED);
               var[17]=false;
         }     
    }   
    if(alternar8==2){
         audio8.detener();
         audio8.stop();
         alternar8=0;
         C9.setBackground(Color.BLUE);
         var[17]=false;
         
    }
        }
      
    }//GEN-LAST:event_C9ActionPerformed

    private void C17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C17ActionPerformed
        // TODO add your handling code here:
        var[33]=true;
        if(!var[34])
        {
      //  AlternarAudio(alternar16,audio16,17,Conf,C17,V17); 
      
        alternar16++;   
    if(alternar16==1){
         Conf=X.Read("config.xml");                
         try{
             audio16=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(16),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),2,V17,C17,socket);
             audio16.start();
              C17.setBackground(Color.GREEN);
              
         }
         catch(Exception e){
             System.out.println("Error de hilo ");
               C17.setBackground(Color.RED);
               var[33]=false;
         }     
    }   
    if(alternar16==2){
         audio16.detener();
         audio16.stop();
         alternar16=0;
         C17.setBackground(Color.BLUE);
         var[33]=true;
         
    }}
    }//GEN-LAST:event_C17ActionPerformed
    private void C25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C25ActionPerformed
        // TODO add your handling code here:
        var[49]=true;
      //  AlternarAudio(alternar24,audio24,25,Conf,C25,V25);
      if(!var[50])
      {
       alternar24++;   
    if(alternar24==1){
         Conf=X.Read("config.xml");                
         try{
             audio24=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(24),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),3,V25,C25,socket);
             audio24.start();
              C25.setBackground(Color.GREEN);
              
         }
         catch(Exception e){
             System.out.println("Error de hilo ");
               C25.setBackground(Color.RED);
               var[49]=false;
         }     
    }   
    if(alternar24==2){
         audio24.detener();
         audio24.stop();
         alternar24=0;
         C25.setBackground(Color.BLUE);
         var[49]=false;
    }
    }
    }//GEN-LAST:event_C25ActionPerformed

    private void C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C3ActionPerformed
        // TODO add your handling code here:
         var[5]=true;
       if(!var[6])
       {
    alternar2++;   
    if(alternar2==1){
         Conf=X.Read("config.xml");        
         
         try{
             audio2=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(2),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),4,V3,C3,socket);
             audio2.start();
              C3.setBackground(Color.GREEN);
              
         }
         catch(Exception e){
             System.out.println("Error de hilo ");
               C3.setBackground(Color.RED);
               var[5]=false;
         }
                   
      
    }   

    if(alternar2==2){
         audio2.detener();
         audio2.stop();
         alternar2=0;
         C3.setBackground(Color.BLUE);
         var[5]=false;
         
    }
       }   
    }//GEN-LAST:event_C3ActionPerformed

    private void C11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C11ActionPerformed
        // TODO add your handling code here:
         var[21]=true;
        if(!var[22])
        {
        //AlternarAudio(alternar10, audio10,11,Conf,C11,V11);
            alternar10++;   
    if(alternar10==1){
         Conf=X.Read("config.xml");                
         try{
             audio10=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(10),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),5,V11,C11,socket);
             audio10.start();
              C11.setBackground(Color.GREEN);
              
         }
         catch(Exception e){
             System.out.println("Error de hilo ");
               C11.setBackground(Color.RED);
               var[21]=false;
         }     
    }   
    if(alternar10==2){
         audio10.detener();
         audio10.stop();
         alternar10=0;
         C11.setBackground(Color.BLUE);
         var[21]=false;
         
    }
        }
    }//GEN-LAST:event_C11ActionPerformed

    private void C27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C27ActionPerformed
        // TODO add your handling code here:
          var[53]=true;
      if(!var[54])
      {
           alternar26++;   
    if(alternar26==1){
         Conf=X.Read("config.xml");                
         try{
             audio26=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(26),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),7,V27,C27,socket);
             audio26.start();
              C27.setBackground(Color.GREEN);
             
         }
         catch(Exception e){
             System.out.println("Error de hilo ");
               C27.setBackground(Color.RED);
            var[53]=false;
         }     
    }   
    if(alternar26==2){
         audio26.detener();
         audio26.stop();
         alternar26=0;
         C27.setBackground(Color.BLUE);
         var[53]=false;
    }   
    }
    }//GEN-LAST:event_C27ActionPerformed

    private void S1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S1ActionPerformed
        // TODO add your handling code here:
        
        var[2]=true;
        if(S1.isSelected()&&!var[1]){
            DisableVolumeExcept(V1,S1,2,0);
            System.out.println("activado");
            Conf=X.Read("config.xml");
            
         try{
             S1.setBackground(Color.red);
             audio[0]=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(0),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),0,V1,C1,socket);
             audio[0].start();
             
              
              
         }
         catch(Exception e){
             System.out.println("Error de hilo ");
               var[2]=false;
               S1.setBackground(Color.white);   
         }     
        }
        if(S1.isSelected()&&var[1])
        {
            S1.setBackground(Color.red);
            DisableVolumeExcept(V1,S1,2,0);
        }
        if(!S1.isSelected()){
            EnableVolume();
            S1.setBackground(Color.white);
            var[2]=false;
            audio[0].detener();
            audio[0].stop();
        }
    }//GEN-LAST:event_S1ActionPerformed

    private void C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C2ActionPerformed
        // TODO add your handling code here:
        var[3]=true;
    if(!var[4])
    {
       alternar1++;   
    if(alternar1==1){
         Conf=X.Read("config.xml");        
         
         try{
             audio1=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(1),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),8,V2,C2,socket);
             audio1.start();
              C2.setBackground(Color.GREEN);
              
         }
         catch(Exception e){
             System.out.println("Error de hilo ");
               C2.setBackground(Color.RED);
               S2.setEnabled(false);
               S2.setSelected(false);
               var[3]=false;
         }
                   
      
    }   

    if(alternar1==2){
         audio1.detener();
         audio1.stop();
         alternar1=0;
         C2.setBackground(Color.BLUE);
        var[3]=false;
         
    }    
    }   
    }//GEN-LAST:event_C2ActionPerformed

    private void C10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C10ActionPerformed
        // TODO add your handling code here:
         var[19]=true;
        if(!var[20])
        {
          //   AlternarAudio(alternar9, audio9,10,Conf,C10,V10);
       alternar9++;   
    if(alternar9==1){
         Conf=X.Read("config.xml");                
         try{
             audio9=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(9),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),9,V10,C10,socket);
             audio9.start();
              C10.setBackground(Color.GREEN);
              
         }
         catch(Exception e){
             System.out.println("Error de hilo ");
               C10.setBackground(Color.RED);
              var[19]=false;
         }     
    }   
    if(alternar9==2){
         audio9.detener();
         audio9.stop();
         alternar9=0;
         C10.setBackground(Color.BLUE);
         var[19]=false;
        
    }
        }
    }//GEN-LAST:event_C10ActionPerformed

    private void C18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C18ActionPerformed
        // TODO add your handling code here:
         var[35]=true;
        if(!var[36])
        {
         alternar17++;   
    if(alternar17==1){
         Conf=X.Read("config.xml");                
         try{
             audio17=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(17),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),10,V18,C18,socket);
             audio17.start();
              C18.setBackground(Color.GREEN);
              
         }
         catch(Exception e){
             System.out.println("Error de hilo ");
               C18.setBackground(Color.RED);
               var[35]=false;
         }     
    }   
    if(alternar17==2){
         audio17.detener();
         audio17.stop();
         alternar17=0;
         C18.setBackground(Color.BLUE);
         var[35]=false;
    }
    }
    }//GEN-LAST:event_C18ActionPerformed

    private void C26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C26ActionPerformed
        // TODO add your handling code here:
        var[51]=true;
      if(!var[52])
      {
       alternar25++;   
    if(alternar25==1){
         Conf=X.Read("config.xml");                
         try{
             audio25=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(25),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),11,V26,C26,socket);
             audio25.start();
              C26.setBackground(Color.GREEN);
              
         }
         catch(Exception e){
             System.out.println("Error de hilo ");
               C26.setBackground(Color.RED);
               var[51]=false;
         }     
    }   
    if(alternar25==2){
         audio25.detener();
         audio25.stop();
         alternar25=0;
         C26.setBackground(Color.BLUE);
         var[51]=false;
    }
    }
    }//GEN-LAST:event_C26ActionPerformed

    private void C4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C4ActionPerformed
        // TODO add your handling code here:
        var[7]=true;
      if(!var[8])
      {
    alternar3++;   
    if(alternar3==1){
         Conf=X.Read("config.xml");                
         try{
             audio3=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(3),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),12,V4,C4,socket);
             audio3.start();
              C4.setBackground(Color.GREEN);
              
         }
         catch(Exception e){
             System.out.println("Error de hilo ");
               C4.setBackground(Color.RED);
               var[7]=false;
         }     
    }   
    if(alternar3==2){
         audio3.detener();
         audio3.stop();
         alternar3=0;
         C4.setBackground(Color.BLUE);
         var[7]=false;
         
    }
      }
    }//GEN-LAST:event_C4ActionPerformed

    private void C12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C12ActionPerformed
        // TODO add your handling code here:
        var[23]=true;
         if(!var[24])
         {
                alternar11++;   
    if(alternar11==1){
         Conf=X.Read("config.xml");                
         try{
             audio11=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(11),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),13,V12,C12,socket);
             audio11.start();
              C12.setBackground(Color.GREEN);
             
         }
         catch(Exception e){
             System.out.println("Error de hilo ");
               C12.setBackground(Color.RED);
                var[23]=false;
               
         }     
    }   
    if(alternar11==2){
         audio11.detener();
         audio11.stop();
         alternar11=0;
         C12.setBackground(Color.BLUE);
         var[23]=false;
         
    }
         }
    }//GEN-LAST:event_C12ActionPerformed

    private void C20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C20ActionPerformed
        // TODO add your handling code here:
        var[39]=true;
          if(!var[40])
          {
       alternar19++;   
    if(alternar19==1){
         Conf=X.Read("config.xml");                
         try{
             audio19=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(19),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),14,V20,C20,socket);
             audio19.start();
              C20.setBackground(Color.GREEN);
              
         }
         catch(Exception e){
             System.out.println("Error de hilo ");
               C20.setBackground(Color.RED);
               var[39]=false;
               
         }     
    }   
    if(alternar19==2){
         audio19.detener();
         audio19.stop();
         alternar19=0;
         C20.setBackground(Color.BLUE);
         var[39]=false;
    } 
    }
    }//GEN-LAST:event_C20ActionPerformed

    private void C28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C28ActionPerformed
        // TODO add your handling code here:
        var[55]=true;
       if(!var[56])
       {
             alternar27++;   
    if(alternar27==1){
         Conf=X.Read("config.xml");                
         try{
             audio27=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(27),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),15,V28,C28,socket);
             audio27.start();
              C28.setBackground(Color.GREEN);
              
         }
         catch(Exception e){
             System.out.println("Error de hilo ");
               C28.setBackground(Color.RED);
               var[55]=false;
         }     
    }   
    if(alternar27==2){
         audio27.detener();
         audio27.stop();
         alternar27=0;
         C28.setBackground(Color.BLUE);
         var[55]=false;
    }
    }
    }//GEN-LAST:event_C28ActionPerformed

    private void C5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C5ActionPerformed
        // TODO add your handling code here:
        var[9]=true;
        if(!var[10])
        {
       // AlternarAudio(alternar4, audio4, 5, Conf, C5,V5);
        alternar4++;   
    if(alternar4==1){
         Conf=X.Read("config.xml");                
         try{
             
             audio4=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(4),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),16,V5,C5,socket);
             audio4.start();
              C5.setBackground(Color.GREEN);
              
         }
         catch(Exception e){
             System.out.println("Error de hilo ");
               C5.setBackground(Color.RED);
              var[9]=false;
         }     
    }   
    if(alternar4==2){
         audio4.detener();
         audio4.stop();
         alternar4=0;
         C5.setBackground(Color.BLUE);
         var[9]=false;
         
    }
        }
    }//GEN-LAST:event_C5ActionPerformed

    private void C13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C13ActionPerformed
        // TODO add your handling code here:
          var[25]=true;
          if(!var[26])
          {
       alternar12++;   
    if(alternar12==1){
         Conf=X.Read("config.xml");                
         try{
             audio12=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(12),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),17,V13,C13,socket);
             audio12.start();
              C13.setBackground(Color.GREEN);
              
         }
         catch(Exception e){
             System.out.println("Error de hilo ");
               C13.setBackground(Color.RED);
               var[25]=false;
         }     
    }   
    if(alternar12==2){
         audio12.detener();
         audio12.stop();
         alternar12=0;
         C13.setBackground(Color.BLUE);
         var[25]=false;
         
    }}
    }//GEN-LAST:event_C13ActionPerformed

    private void C21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C21ActionPerformed
        // TODO add your handling code here:
         var[41]=true;
      if(!var[42])
      {
        alternar20++;   
    if(alternar20==1){
         Conf=X.Read("config.xml");                
         try{
             audio20=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(20),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),18,V21,C21,socket);
             audio20.start();
              C21.setBackground(Color.GREEN);
              
         }
         catch(Exception e){
             System.out.println("Error de hilo ");
               C21.setBackground(Color.RED);
               var[41]=false;
         }     
    }   
    if(alternar20==2){
         audio20.detener();
         audio20.stop();
         alternar20=0;
         C21.setBackground(Color.BLUE);
         var[41]=false;
    }   
    }
    }//GEN-LAST:event_C21ActionPerformed

    private void C6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C6ActionPerformed
        // TODO add your handling code here:
        var[11]=true;
       if(!var[12])
       {
       //   AlternarAudio(alternar5, audio5,6,Conf,C6,V6);
           alternar5++;   
    if(alternar5==1){
         Conf=X.Read("config.xml");                
         try{
             audio5=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(5),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),19,V6,C6,socket);
             audio5.start();
              C6.setBackground(Color.GREEN);
              
         }
         catch(Exception e){
             System.out.println("Error de hilo ");
               C6.setBackground(Color.RED);
               var[11]=false;
         }     
    }   
    if(alternar5==2){
         audio5.detener();
         audio5.stop();
         alternar5=0;
         C6.setBackground(Color.BLUE);
         var[11]=false;
         
    }}
    }//GEN-LAST:event_C6ActionPerformed

    private void C29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C29ActionPerformed
        // TODO add your handling code here:
        var[57]=true;
        if(!var[58])
        {
       alternar28++;   
    if(alternar28==1){
         Conf=X.Read("config.xml");                
         try{
             audio28=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(28),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),20,V29,C29,socket);
             audio28.start();
              C29.setBackground(Color.GREEN);
              
         }
         catch(Exception e){
             System.out.println("Error de hilo ");
               C29.setBackground(Color.RED);
                var[57]=false;
         }     
    }   
    if(alternar28==2){
         audio28.detener();
         audio28.stop();
         alternar28=0;
         C29.setBackground(Color.BLUE);
         var[57]=false;
    }
    }
    }//GEN-LAST:event_C29ActionPerformed

    private void C14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C14ActionPerformed
        // TODO add your handling code here:
         var[27]=true;
        if(!var[28])
        {
          alternar13++;   
    if(alternar13==1){
         Conf=X.Read("config.xml");                
         try{
             audio13=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(13),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),21,V14,C14,socket);
             audio13.start();
              C14.setBackground(Color.GREEN);
              
         }
         catch(Exception e){
             System.out.println("Error de hilo ");
               C14.setBackground(Color.RED);
               var[27]=false;
         }     
    }   
    if(alternar13==2){
         audio13.detener();
         audio13.stop();
         alternar13=0;
         C14.setBackground(Color.BLUE);
         var[27]=false;
    }}
    }//GEN-LAST:event_C14ActionPerformed

    private void C22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C22ActionPerformed
        // TODO add your handling code here:
        var[43]=true;
       if(!var[44])
       {
        alternar21++;   
    if(alternar21==1){
         Conf=X.Read("config.xml");                
         try{
             audio21=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(21),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),22,V22,C22,socket);
             audio21.start();
              C22.setBackground(Color.GREEN);
              
         }
         catch(Exception e){
             System.out.println("Error de hilo ");
               C22.setBackground(Color.RED);
               var[43]=false;
         }     
    }   
    if(alternar21==2){
         audio21.detener();
         audio21.stop();
         alternar21=0;
         C22.setBackground(Color.BLUE);
         var[43]=false;
    }  
    }
    }//GEN-LAST:event_C22ActionPerformed

    private void C30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C30ActionPerformed
        // TODO add your handling code here:
        var[59]=true;
     if(!var[60])
     {
       alternar29++;   
    if(alternar29==1){
         Conf=X.Read("config.xml");                
         try{
             audio29=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(29),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),23,V30,C30,socket);
             audio29.start();
              C30.setBackground(Color.GREEN);
             
         }
         catch(Exception e){
             System.out.println("Error de hilo ");
               C30.setBackground(Color.RED);
               var[59]=false;
         }     
    }   
    if(alternar29==2){
         audio29.detener();
         audio29.stop();
         alternar29=0;
         C30.setBackground(Color.BLUE);
         var[59]=false;
        
    }
     }
    }//GEN-LAST:event_C30ActionPerformed

    private void S9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S9ActionPerformed
        // TODO add your handling code here:
        var[18]=true;
        if(S9.isSelected()&&!var[17]){
            DisableVolumeExcept(V9,S9,18,8);
            System.out.println("activado");
            Conf=X.Read("config.xml");                
         try{
             audio[8]=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(8),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),1,V9,C9,socket);
             audio[8].start();
              S9.setBackground(Color.red);
              
         }
         catch(Exception e){
             System.out.println("Error de hilo ");
               var[18]=false;
               S9.setBackground(Color.white);
         }     
        }
        if(S9.isSelected()&&var[17])
        {
            DisableVolumeExcept(V9,S9,18,8);
            S9.setBackground(Color.red);
        }
        if(!S9.isSelected()){
            EnableVolume();
            var[18]=false;
            audio[8].detener();
            audio[8].stop();
            S9.setBackground(Color.white);
        }
    }//GEN-LAST:event_S9ActionPerformed

    private void S17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S17ActionPerformed
        // TODO add your handling code here:
         var[34]=true;
        if(S17.isSelected()&&!var[33]){
            DisableVolumeExcept(V17,S17,34,16);
            System.out.println("activado");
            Conf=X.Read("config.xml");                
         try{
             audio[16]=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(16),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),2,V17,C17,socket);
             audio[16].start();
             S17.setBackground(Color.red);
            
              
         }
         catch(Exception e){
             System.out.println("Error de hilo ");
                S17.setBackground(Color.white);
               var[34]=false;
         }
        }
        if(S17.isSelected()&&var[33])
        {
            DisableVolumeExcept(V17,S17,34,16);
             S17.setBackground(Color.red);
        }
        if(!S17.isSelected()){
            EnableVolume();
            var[34]=false;
            audio[16].detener();
            audio[16].stop();
             S17.setBackground(Color.white);
        }
    }//GEN-LAST:event_S17ActionPerformed

    private void S25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S25ActionPerformed
        // TODO add your handling code here:
         var[50]=true;
        if(S25.isSelected()&&!var[49]){
            DisableVolumeExcept(V25,S25,50,24);
            System.out.println("activado");
            Conf=X.Read("config.xml");                
         try{
             audio[24]=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(24),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),3,V25,C25,socket);
             audio[24].start();
              S25.setBackground(Color.red);
              
              
         }
         catch(Exception e){
             System.out.println("Error de hilo ");
               S25.setBackground(Color.white);
               var[50]=false;
         }     
        }
        if(S25.isSelected()&&var[49])
        {
            DisableVolumeExcept(V25,S25,50,24);
            S25.setBackground(Color.red);
        }
        if(!S25.isSelected()){
            EnableVolume();
            var[50]=false;
            audio[24].detener();
            audio[24].stop();
            S25.setBackground(Color.white);
        }
    }//GEN-LAST:event_S25ActionPerformed

    private void S3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S3ActionPerformed
        // TODO add your handling code here:
        var[6]=true;
        
        if(S3.isSelected()&&!var[5]){
            DisableVolumeExcept(V3,S3,6,2);
            System.out.println("activado");
             Conf=X.Read("config.xml");        
         
         try{
             audio[2]=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(2),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),4,V3,C3,socket);
             audio[2].start();
              S3.setBackground(Color.red);
              
         }
         catch(Exception e){
             System.out.println("Error de hilo ");
               S3.setBackground(Color.white);
               var[6]=false;
         }
        }
        if(S3.isSelected()&&var[5]){
            DisableVolumeExcept(V3,S3,6,2);
            S3.setBackground(Color.red);
        }
        if(!S3.isSelected()){
            EnableVolume();
            var[6]=false;
            S3.setBackground(Color.white);
            audio[2].detener();
            audio[2].stop();
        }
    }//GEN-LAST:event_S3ActionPerformed

    private void S11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S11ActionPerformed
        // TODO add your handling code here:
         var[22]=true;
        if(S11.isSelected()&&!var[21]){
            DisableVolumeExcept(V11,S11,22,10);
            System.out.println("activado");
            Conf=X.Read("config.xml");                
         try{
             audio[10]=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(10),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),5,V11,C11,socket);
             audio[10].start();
              S11.setBackground(Color.red);
              
         }
         catch(Exception e){
             System.out.println("Error de hilo ");
               S11.setBackground(Color.white);
               var[22]=false;
         }     
        }
        if(S11.isSelected()&&var[21])
        {
            DisableVolumeExcept(V11,S11,22,10);
            S11.setBackground(Color.red);
        }
        if(!S11.isSelected()){
            EnableVolume();
            var[22]=false;
            audio[10].detener();
            audio[10].stop();
            S11.setBackground(Color.white);
        }
    }//GEN-LAST:event_S11ActionPerformed

    private void S19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S19ActionPerformed
        // TODO add your handling code here:
        var[38]=true;
        if(S19.isSelected()&&!var[37]){
            DisableVolumeExcept(V19,S19,38,18);
            System.out.println("activado");
            Conf=X.Read("config.xml");                
         try{
             audio[18]=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(18),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),6,V19,C19,socket);
             audio[18].start();
              S19.setBackground(Color.red);
              
         }
         catch(Exception e){
             System.out.println("Error de hilo ");
              S19.setBackground(Color.white); 
               var[38]=false;
         }     
        }
        if(S19.isSelected()&&var[37])
        {
            DisableVolumeExcept(V19,S19,38,18);
            S19.setBackground(Color.red);
        }
        if(!S19.isSelected()){
            EnableVolume();
            var[38]=false;
            audio[18].detener();
            audio[18].stop();
            S19.setBackground(Color.white);
        }
    }//GEN-LAST:event_S19ActionPerformed

    private void S27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S27ActionPerformed
        // TODO add your handling code here:
        var[54]=true;
        if(S27.isSelected()&&!var[53]){
            DisableVolumeExcept(V27,S27,54,26);
            System.out.println("activado");
            Conf=X.Read("config.xml");                
         try{
             audio[26]=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(26),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),7,V27,C27,socket);
             audio[26].start();
              S27.setBackground(Color.red);
             
         }
         catch(Exception e){
             System.out.println("Error de hilo ");
                S27.setBackground(Color.white);
            var[54]=false;
         }     
        }
        if(S27.isSelected()&&var[53])
        {
            DisableVolumeExcept(V27,S27,54,26);
             S27.setBackground(Color.red);
        }
        if(!S27.isSelected()){
            EnableVolume();
            var[54]=false;
            audio[26].detener();
            audio[26].stop();
             S27.setBackground(Color.white);
        }
    }//GEN-LAST:event_S27ActionPerformed

    private void S2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S2ActionPerformed
        // TODO add your handling code here:
         var[4]=true;
        if(S2.isSelected()&&!var[3]){
            DisableVolumeExcept(V2,S2,4,1);
            System.out.println("activado");
            Conf=X.Read("config.xml");        
         
         try{
             audio[1]=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(1),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),8,V2,C2,socket);
             audio[1].start();
               S2.setBackground(Color.red);
              
         }
         catch(Exception e){
             System.out.println("Error de hilo ");
              S2.setBackground(Color.white); 
               var[4]=false;
         }
        }
        if(S2.isSelected()&&var[3]){
            DisableVolumeExcept(V2,S2,4,1);
            S2.setBackground(Color.red);
        }
        if(!S2.isSelected()){
            EnableVolume();
            var[4]=false;
            audio[1].detener();
            audio[1].stop();
            S2.setBackground(Color.white);
        }
    }//GEN-LAST:event_S2ActionPerformed

    private void S10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S10ActionPerformed
        // TODO add your handling code here:
        var[20]=true;
        if(S10.isSelected()&&!var[19]){
            DisableVolumeExcept(V10,S10,20,9);
            System.out.println("activado");
            Conf=X.Read("config.xml");                
         try{
             audio[9]=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(9),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),9,V10,C10,socket);
             audio[9].start();
              S10.setBackground(Color.red);
              
         }
         catch(Exception e){
             System.out.println("Error de hilo ");
               S10.setBackground(Color.white);
              var[20]=false;
         }     
        }
        if(S10.isSelected()&&var[19])
        {
            DisableVolumeExcept(V10,S10,20,9);
            S10.setBackground(Color.red);
        }
        if(!S10.isSelected()){
            EnableVolume();
            var[20]=false;
            audio[9].detener();
            audio[9].stop();
            S10.setBackground(Color.white);
        }
    }//GEN-LAST:event_S10ActionPerformed

    private void S18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S18ActionPerformed
        // TODO add your handling code here:
         var[36]=true;
        if(S18.isSelected()&&!var[35]){
            DisableVolumeExcept(V18,S18,36,17);
            System.out.println("activado");
            Conf=X.Read("config.xml");                
         try{
             audio[17]=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(17),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),10,V18,C18,socket);
             audio[17].start();
             S18.setBackground(Color.red);
              
         }
         catch(Exception e){
             System.out.println("Error de hilo ");
              S18.setBackground(Color.white);
               var[36]=false;
         }     
        }
        if(S18.isSelected()&&var[35])
        {
            DisableVolumeExcept(V18,S18,36,17);
            S18.setBackground(Color.red);
        }
        if(!S18.isSelected()){
            EnableVolume();
            var[36]=false;
            audio[17].detener();
            audio[17].stop();
            S18.setBackground(Color.white);
        }
    }//GEN-LAST:event_S18ActionPerformed

    private void S26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S26ActionPerformed
        // TODO add your handling code here:
         var[52]=true;
        if(S26.isSelected()&&!var[51]){
            DisableVolumeExcept(V26,S26,52,25);
            System.out.println("activado");
            Conf=X.Read("config.xml");                
         try{
             audio[25]=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(25),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),11,V26,C26,socket);
             audio[25].start();
              S26.setBackground(Color.red);
              
         }
         catch(Exception e){
             System.out.println("Error de hilo ");
               S26.setBackground(Color.white); 
               var[52]=false;
         }     
        }
        if(S26.isSelected()&&var[51])
        {
            DisableVolumeExcept(V26,S26,52,25);
             S26.setBackground(Color.red);
        }
        if(!S26.isSelected()){
            EnableVolume();
            var[52]=false;
            audio[25].detener();
            audio[25].stop();
             S26.setBackground(Color.white);
        }
    }//GEN-LAST:event_S26ActionPerformed

    private void S4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S4ActionPerformed
        // TODO add your handling code here:
        var[8]=true;
        if(S4.isSelected()&&!var[7]){
            DisableVolumeExcept(V4,S4,8,3);
            System.out.println("activado");
            Conf=X.Read("config.xml");                
         try{
             audio[3]=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(3),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),12,V4,C4,socket);
             audio[3].start();
               S4.setBackground(Color.red);
              
         }
         catch(Exception e){
             System.out.println("Error de hilo ");
              S4.setBackground(Color.white); 
               var[8]=false;
         }     
        }
        if(S4.isSelected()&&var[7]){
            DisableVolumeExcept(V4,S4,8,3);
            S4.setBackground(Color.red);
        }
        if(!S4.isSelected()){
            EnableVolume();
            var[8]=false;
            audio[3].detener();
            audio[3].stop();
            S4.setBackground(Color.white);
        }
    }//GEN-LAST:event_S4ActionPerformed

    private void S12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S12ActionPerformed
        // TODO add your handling code here:
        var[24]=true;
        if(S12.isSelected()&&!var[23]){
            DisableVolumeExcept(V12,S12,24,11);
            System.out.println("activado");
            Conf=X.Read("config.xml");                
         try{
             audio[11]=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(11),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),13,V12,C12,socket);
             audio[11].start();
              S12.setBackground(Color.red);
             
         }
         catch(Exception e){
             System.out.println("Error de hilo ");
               S12.setBackground(Color.white); 
                var[24]=false;
               
         }     
        }
        if(S12.isSelected()&&var[23])
        {
            DisableVolumeExcept(V12,S12,24,11);
             S12.setBackground(Color.red);
        }
        if(!S12.isSelected()){
            EnableVolume();
            var[24]=false;
            audio[11].detener();
            audio[11].stop();
             S12.setBackground(Color.white);
        }
    }//GEN-LAST:event_S12ActionPerformed

    private void S20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S20ActionPerformed
        // TODO add your handling code here:
         var[40]=true;
        if(S20.isSelected()&&!var[39]){
            DisableVolumeExcept(V20,S20,40,19);
            System.out.println("activado");
            Conf=X.Read("config.xml");                
         try{
             audio[19]=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(19),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),14,V20,C20,socket);
             audio[19].start();
               S20.setBackground(Color.red);
              
         }
         catch(Exception e){
             System.out.println("Error de hilo ");
              S20.setBackground(Color.white);
               var[40]=false;
               
         }     
        }
        if(S20.isSelected()&&var[39])
        {
            DisableVolumeExcept(V20,S20,40,19);
            S20.setBackground(Color.red);
        }
        if(!S20.isSelected()){
            EnableVolume();
            var[40]=false;
            audio[19].detener();
            audio[19].stop();
            S20.setBackground(Color.white);
        }
    }//GEN-LAST:event_S20ActionPerformed

    private void S28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S28ActionPerformed
        // TODO add your handling code here:
        var[56]=true;
        if(S28.isSelected()&&!var[55]){
            DisableVolumeExcept(V28,S28,56,27);
            System.out.println("activado");
            Conf=X.Read("config.xml");                
         try{
             audio[27]=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(27),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),15,V28,C28,socket);
             audio[27].start();
              S28.setBackground(Color.red);
              
         }
         catch(Exception e){
             System.out.println("Error de hilo ");
               S28.setBackground(Color.white);
               var[56]=false;
         }     
        }
        if(S28.isSelected()&&var[55])
        {
            DisableVolumeExcept(V28,S28,56,27);
            S28.setBackground(Color.red);
        }
        if(!S28.isSelected()){
            EnableVolume();
            var[56]=false;
            audio[27].detener();
            audio[27].stop();
            S28.setBackground(Color.white);
        }
    }//GEN-LAST:event_S28ActionPerformed

    private void S5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S5ActionPerformed
        // TODO add your handling code here:
        var[10]=true;
        if(S5.isSelected()&&!var[9]){
            DisableVolumeExcept(V5,S5,10,4);
            System.out.println("activado");
            Conf=X.Read("config.xml");                
         try{
             
             audio[4]=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(4),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),16,V5,C5,socket);
             audio[4].start();
              
              S5.setBackground(Color.red);
         }
         catch(Exception e){
             System.out.println("Error de hilo ");
              S5.setBackground(Color.white);
              var[10]=false;
         }     
        }
        if(S5.isSelected()&&var[9])
        {
            DisableVolumeExcept(V5,S5,20,4);
            S5.setBackground(Color.red);
        }
        if(!S5.isSelected()){
            EnableVolume();
            var[10]=false;
             audio[4].detener();
            audio[4].stop();
            S5.setBackground(Color.white);
        }
    }//GEN-LAST:event_S5ActionPerformed

    private void S13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S13ActionPerformed
        // TODO add your handling code here:
         var[26]=true;
        if(S13.isSelected()&&!var[25]){
            DisableVolumeExcept(V13,S13,26,12);
            System.out.println("activado");
            Conf = X.Read("config.xml");
            try{
             audio[12]=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(12),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),17,V13,C13,socket);
             audio[12].start();
              S13.setBackground(Color.red);
              
         }
         catch(Exception e){
             System.out.println("Error de hilo ");
               S13.setBackground(Color.white);
               var[26]=false;
         }     
        }
        if(S13.isSelected()&&var[25])
        {
            DisableVolumeExcept(V13,S13,26,12);
            S13.setBackground(Color.red);
        }
        if(!S13.isSelected()){
            EnableVolume();
            var[26]=false;
            audio[12].detener();
            audio[12].stop();
            S13.setBackground(Color.white);
        }
    }//GEN-LAST:event_S13ActionPerformed

    private void S21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S21ActionPerformed
        // TODO add your handling code here:
         var[42]=true;
        if(S21.isSelected()&&!var[41]){
            DisableVolumeExcept(V21,S21,42,20);
            System.out.println("activado");
            Conf=X.Read("config.xml");                
         try{
             audio[20]=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(20),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),18,V21,C21,socket);
             audio[20].start();
              S21.setBackground(Color.red);
              
         }
         catch(Exception e){
             System.out.println("Error de hilo ");
               S21.setBackground(Color.white);
               var[42]=false;
         }     
        }
        if(S21.isSelected()&&var[41])
        {
            DisableVolumeExcept(V21,S21,42,20);
            S21.setBackground(Color.red);
        }
        if(!S21.isSelected()){
            EnableVolume();
            var[42]=false;
             audio[20].detener();
            audio[20].stop();
            S21.setBackground(Color.white);
        }
    }//GEN-LAST:event_S21ActionPerformed

    private void S6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S6ActionPerformed
        // TODO add your handling code here:
        var[12]=true;
        if(S6.isSelected()&&!var[11]){
            DisableVolumeExcept(V6,S6,12,5);
            System.out.println("activado");
            Conf=X.Read("config.xml");                
         try{
             audio[5]=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(5),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),19,V6,C6,socket);
             audio[5].start();
              S6.setBackground(Color.red);
              
         }
         catch(Exception e){
             System.out.println("Error de hilo ");
              S6.setBackground(Color.white); 
               var[12]=false;
         }     
        }
        if(S6.isSelected()&&var[11])
        {
            DisableVolumeExcept(V6,S6,12,5);
            S6.setBackground(Color.red);
        }
        if(!S6.isSelected()){
            EnableVolume();
            var[12]=false;
            audio[5].detener();
            audio[5].stop();
            S6.setBackground(Color.white);
        }
    }//GEN-LAST:event_S6ActionPerformed

    private void S29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S29ActionPerformed
        // TODO add your handling code here:
         var[58]=true;
        if(S29.isSelected()&&!var[57]){
            DisableVolumeExcept(V29,S29,58,28);
            System.out.println("activado");
            Conf=X.Read("config.xml");                
         try{
             audio[28]=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(28),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),20,V29,C29,socket);
             audio[28].start();
              S29.setBackground(Color.red);
              
         }
         catch(Exception e){
             System.out.println("Error de hilo ");
               S29.setBackground(Color.white);
                var[58]=false;
         }     
        }
        if(S29.isSelected()&&var[57])
        {
            DisableVolumeExcept(V29,S29,58,28);
            S29.setBackground(Color.red);
        }
        if(!S29.isSelected()){
            EnableVolume();
            var[58]=false;
            audio[28].detener();
            audio[28].stop();
            S29.setBackground(Color.white);
        }
    }//GEN-LAST:event_S29ActionPerformed

    private void S14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S14ActionPerformed
        // TODO add your handling code here:
        var[28]=true;
        
        if(S14.isSelected()&&!var[28]){
            DisableVolumeExcept(V14,S14,28,13);
            System.out.println("activado");
            Conf=X.Read("config.xml");                
         try{
             audio[13]=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(13),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),21,V14,C14,socket);
             audio[13].start();
              S14.setBackground(Color.red);
              
         }
         catch(Exception e){
             System.out.println("Error de hilo ");
             S14.setBackground(Color.white);  
               var[28]=false;
         }     
        }
        if(S14.isSelected()&&var[28])
        {
            DisableVolumeExcept(V14,S14,28,13);
            S14.setBackground(Color.red);
        }
        if(!S14.isSelected()){
            EnableVolume();
            var[28]=false;
            audio[13].detener();
            audio[13].stop();
            S14.setBackground(Color.white);
        }
    }//GEN-LAST:event_S14ActionPerformed

    private void S22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S22ActionPerformed
        // TODO add your handling code here:
         var[44]=true;
        if(S22.isSelected()&&!var[43]){
            DisableVolumeExcept(V22,S22,44,21);
            System.out.println("activado");
            Conf=X.Read("config.xml");                
         try{
             audio[21]=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(21),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),22,V22,C22,socket);
             audio[21].start();
              S22.setBackground(Color.red);
              
         }
         catch(Exception e){
             System.out.println("Error de hilo ");
              S22.setBackground(Color.white); 
               var[44]=false;
         }     
        }
        if(S22.isSelected()&&var[43])
        {
            DisableVolumeExcept(V22,S22,44,21);
            S22.setBackground(Color.red);
        }
        if(!S22.isSelected()){
            EnableVolume();
            var[44]=false;
            audio[21].detener();
            audio[21].stop();
            S22.setBackground(Color.white);
        }
    }//GEN-LAST:event_S22ActionPerformed

    private void S30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S30ActionPerformed
        // TODO add your handling code here:
         var[60]=true;
        if(S30.isSelected()&&!var[59]){
            DisableVolumeExcept(V30,S30,60,29);
            System.out.println("activado");
            Conf=X.Read("config.xml");                
         try{
             audio[29]=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(29),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),23,V30,C30,socket);
             audio[29].start();
              S30.setBackground(Color.red);
             
         }
         catch(Exception e){
             System.out.println("Error de hilo ");
              S30.setBackground(Color.white);  
               var[60]=false;
         }     
        }
        if(S30.isSelected()&&var[59])
        {
            DisableVolumeExcept(V30,S30,60,29);
             S30.setBackground(Color.red);
        }
        if(!S30.isSelected()){
            EnableVolume();
            var[60]=false;
            audio[29].detener();
            audio[29].stop();
             S30.setBackground(Color.white);
        }
    }//GEN-LAST:event_S30ActionPerformed

    private void C7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C7ActionPerformed
        // TODO add your handling code here:fo
        var[13]=true;
        if(!var[14])
        {
            alternar6++;   
    if(alternar6==1){
         Conf=X.Read("config.xml");                
         try{
             
             audio6=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(6),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),24,V7,C7,socket);
             audio6.start();
              C7.setBackground(Color.GREEN);
              
         }
         catch(Exception e){
             System.out.println("Error de hilo ");
               C7.setBackground(Color.RED);
               var[13]=false;
              
         }     
    }   
    if(alternar6==2){
         audio6.detener();
         audio6.stop();
         alternar6=0;
         C7.setBackground(Color.BLUE);
         var[13]=false;
    }
        }
    }//GEN-LAST:event_C7ActionPerformed

    private void C8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C8ActionPerformed
        // TODO add your handling code here:
        var[15]=true;
        if(!var[16])
        {
            alternar7++;   
    if(alternar7==1){
         Conf=X.Read("config.xml");                
         try{
             
             audio7=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(7),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),25,V8,C8,socket);
             audio7.start();
              C8.setBackground(Color.GREEN);
              
         }
         catch(Exception e){
             System.out.println("Error de hilo ");
               C8.setBackground(Color.RED);
               var[15]=false;
         }     
    }   
    if(alternar7==2){
         audio7.detener();
         audio7.stop();
         alternar7=0;
         C8.setBackground(Color.BLUE);
         var[15]=false;
       
    }
        }
    }//GEN-LAST:event_C8ActionPerformed

    private void C15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C15ActionPerformed
        // TODO add your handling code here:
        var[29]=true;
        if(!var[30])
        {
            alternar14++;   
    if(alternar14==1){
         Conf=X.Read("config.xml");                
         try{
             
             audio14=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(14),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),26,V15,C15,socket);
             audio14.start();
              C15.setBackground(Color.GREEN);
          
         }
         catch(Exception e){
             System.out.println("Error de hilo ");
               C15.setBackground(Color.RED);
               var[29]=false;
         }  
    
    }   
    if(alternar14==2){
         audio14.detener();
         audio14.stop();
         alternar14=0;
         C15.setBackground(Color.BLUE);
         var[29]=false;
         
    }
        }
    }//GEN-LAST:event_C15ActionPerformed

    private void C16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C16ActionPerformed
        // TODO add your handling code here:
        var[31]=true;
        if(!var[32])
        {
            alternar15++;   
    if(alternar15==1){
         Conf=X.Read("config.xml");                
         try{
             
             audio15=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(15),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),27,V16,C16,socket);
             audio15.start();
              C16.setBackground(Color.GREEN);
              
         }
         catch(Exception e){
             System.out.println("Error de hilo ");
               C16.setBackground(Color.RED);
               var[31]=false;
         }     
    }   
    if(alternar15==2){
         audio15.detener();
         audio15.stop();
         alternar15=0;
         C16.setBackground(Color.BLUE);
         var[31]=false;
        
    }
        }
    }//GEN-LAST:event_C16ActionPerformed

    private void C23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C23ActionPerformed
        // TODO add your handling code here:
        var[45]=true;
        if(!var[46])
        {
            alternar22++;   
    if(alternar22==1){
         Conf=X.Read("config.xml");                
         try{
             
             audio22=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(22),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),28,V23,C23,socket);
             audio22.start();
              C23.setBackground(Color.GREEN);
              
         }
         catch(Exception e){
             System.out.println("Error de hilo ");
               C23.setBackground(Color.RED);
              var[45]=false;
         }     
    }   
    if(alternar22==2){
         audio22.detener();
         audio22.stop();
         alternar22=0;
         C23.setBackground(Color.BLUE);
         var[45]=false;
         
    }
        }
    }//GEN-LAST:event_C23ActionPerformed

    private void C24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C24ActionPerformed
        // TODO add your handling code here:
         var[47]=true;
        if(!var[48])
        {
            alternar23++;   
    if(alternar23==1){
         Conf=X.Read("config.xml");                
         try{
             
             audio23=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(23),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),29,V24,C24,socket);
             audio23.start();
              C24.setBackground(Color.GREEN);
              
         }
         catch(Exception e){
             System.out.println("Error de hilo ");
               C24.setBackground(Color.RED);
               var[47]=false;
         }     
    }   
    if(alternar23==2){
         audio23.detener();
         audio23.stop();
         alternar23=0;
         C24.setBackground(Color.BLUE);
         var[47]=false;
    }
    }
    }//GEN-LAST:event_C24ActionPerformed

    private void C31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C31ActionPerformed
        // TODO add your handling code here:
         var[61]=true;
        if(!var[62])
        {
            alternar30++;   
    if(alternar30==1){
         Conf=X.Read("config.xml");                
         try{
             
             audio30=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(30),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),30,V31,C31,socket);
             audio30.start();
              C31.setBackground(Color.GREEN);
              
         }
         catch(Exception e){
             System.out.println("Error de hilo ");
               C31.setBackground(Color.RED);
               var[61]=false;
         }     
    }   
    if(alternar30==2){
         audio30.detener();
         audio30.stop();
         alternar30=0;
         C31.setBackground(Color.BLUE);
         var[61]=false;
    }}
    }//GEN-LAST:event_C31ActionPerformed

    private void C32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C32ActionPerformed
        // TODO add your handling code here:
        var[63]=true;
        if(!var[64])
        {
            alternar31++;   
    if(alternar31==1){
         Conf=X.Read("config.xml");                
         try{
             
             audio31=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(31),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),31,V32,C32,socket);
             audio31.start();
              C32.setBackground(Color.GREEN);
              
         }
         catch(Exception e){
             System.out.println("Error de hilo ");
               C32.setBackground(Color.RED);
               var[63]=false;
         }     
    }   
    if(alternar31==2){
         audio31.detener();
         audio31.stop();
         alternar31=0;
         C32.setBackground(Color.BLUE);
         var[63]=false;
         
    }
        }
    }//GEN-LAST:event_C32ActionPerformed

    private void S7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S7ActionPerformed
        // TODO add your handling code here:
         var[14]=true;
        if(S7.isSelected()&&!var[13]){
            DisableVolumeExcept(V7,S7,14,6);
            System.out.println("activado");
            Conf=X.Read("config.xml");                
         try{
              S7.setBackground(Color.red);
             audio[6]=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(6),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),24,V7,C7,socket);
             audio[6].start();
              S7.setBackground(Color.white);
              
         }
         catch(Exception e){
             System.out.println("Error de hilo ");
              var[14]=false;
              
         }     
        }
        if(S7.isSelected()&&var[13])
        {
            DisableVolumeExcept(V7,S7,14,6);
            S7.setBackground(Color.red);
        }
        if(!S7.isSelected()){
            EnableVolume();
            var[14]=false;
            audio[6].detener();
            audio[6].stop();
            S7.setBackground(Color.white);
        }
    }//GEN-LAST:event_S7ActionPerformed

    private void S8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S8ActionPerformed
        // TODO add your handling code here:
         var[16]=true;
        if(S8.isSelected()&&!var[15]){
            DisableVolumeExcept(V8,S8,16,7);
            System.out.println("activado");
             Conf=X.Read("config.xml");                
         try{
             S8.setBackground(Color.red);
             audio[7]=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(7),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),25,V8,C8,socket);
             audio[7].start();
             
              
         }
         catch(Exception e){
             System.out.println("Error de hilo ");
              S8.setBackground(Color.white);
               var[16]=false;
         }    
        }
        if(S8.isSelected()&&var[15])
        {
            DisableVolumeExcept(V8,S8,16,7);
            S8.setBackground(Color.red);
        }
        if(!S8.isSelected()){
            EnableVolume();
            var[16]=false;
            audio[7].detener();
            audio[7].stop();
            S8.setBackground(Color.white);
        }
    }//GEN-LAST:event_S8ActionPerformed

    private void S15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S15ActionPerformed
        // TODO add your handling code here:
         var[30]=true;
        if(S15.isSelected()&&!var[29]){
            DisableVolumeExcept(V15,S15,30,14);
            System.out.println("activado");
            Conf=X.Read("config.xml");                
         try{
             S15.setBackground(Color.red);
             audio[14]=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(14),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),26,V15,C15,socket);
             audio[14].start();
              
          
         }
         catch(Exception e){
             System.out.println("Error de hilo ");
               S15.setBackground(Color.white);
               var[30]=false;
         }  
        }
        if(S15.isSelected()&&var[29])
        {
            DisableVolumeExcept(V15,S15,30,14);
            S15.setBackground(Color.red);
        }
        if(!S15.isSelected()){
            EnableVolume();
            var[30]=false;
            audio[7].detener();
            audio[7].stop();
            S15.setBackground(Color.white);
        }
    }//GEN-LAST:event_S15ActionPerformed

    private void S16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S16ActionPerformed
        // TODO add your handling code here:
        var[32]=true;
        if(S16.isSelected()&&!var[31]){
            DisableVolumeExcept(V16,S16,32,15);
            System.out.println("activado");
            Conf=X.Read("config.xml");  
            S16.setBackground(Color.red);
         try{
             
             audio[15]=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(15),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),27,V16,C16,socket);
             audio[15].start();
              
              
         }
         catch(Exception e){
             System.out.println("Error de hilo ");
               S16.setBackground(Color.white);
               var[32]=false;
         }     
        }
        if(S16.isSelected()&&var[31])
        {
            DisableVolumeExcept(V16,S16,32,15);
            S16.setBackground(Color.red);
        }
        if(!S16.isSelected()){
            EnableVolume();
            var[32]=false;
            audio[15].detener();
            audio[15].stop();
            S16.setBackground(Color.white);
        }
    }//GEN-LAST:event_S16ActionPerformed

    private void S23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S23ActionPerformed
        // TODO add your handling code here:
         var[46]=true;
        if(S23.isSelected()&&!var[45]){
            DisableVolumeExcept(V23,S23,46,22);
            System.out.println("activado");
            Conf=X.Read("config.xml");                
         try{
             S23.setBackground(Color.red);
             audio[22]=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(22),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),28,V23,C23,socket);
             audio[22].start();
              
              
         }
         catch(Exception e){
             System.out.println("Error de hilo ");
               S23.setBackground(Color.white);
              var[46]=false;
         }     
        }
        if(S23.isSelected()&&var[45])
        {
            DisableVolumeExcept(V23,S23,46,22);
            S23.setBackground(Color.red);
        }
        if(!S23.isSelected()){
            EnableVolume();
            var[46]=false;
            audio[22].detener();
            audio[22].stop();
            S23.setBackground(Color.white);
        }
    }//GEN-LAST:event_S23ActionPerformed

    private void S24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S24ActionPerformed
        // TODO add your handling code here:
         var[48]=true;
        if(S24.isSelected()&&!var[47]){
            DisableVolumeExcept(V24,S24,48,23);
            System.out.println("activado");
            Conf=X.Read("config.xml");                
         try{
             
             audio[23]=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(23),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),29,V24,C24,socket);
             audio[23].start();
              S24.setBackground(Color.red);
         }
         catch(Exception e){
             System.out.println("Error de hilo ");
                S24.setBackground(Color.white);
               var[48]=false;
         }     
        }
        if(S24.isSelected()&&var[47])
        {
            DisableVolumeExcept(V24,S24,48,23);
             S24.setBackground(Color.red);
        }
        if(!S24.isSelected()){
            EnableVolume();
            var[48]=false;
            audio[23].detener();
            audio[23].stop();
             S24.setBackground(Color.white);
        }
    }//GEN-LAST:event_S24ActionPerformed

    private void S31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S31ActionPerformed
        // TODO add your handling code here:
         var[62]=true;
        if(S31.isSelected()&&!var[61]){
            DisableVolumeExcept(V31,S31,62,30);
            System.out.println("activado");
            Conf=X.Read("config.xml");                
         try{
              S31.setBackground(Color.red);
             audio[30]=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(30),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),30,V31,C31,socket);
             audio[30].start();
              
              
         }
         catch(Exception e){
             System.out.println("Error de hilo ");
              S31.setBackground(Color.white);
               var[62]=false;
         }     
        }
        if(S31.isSelected()&&var[61])
        {
            DisableVolumeExcept(V31,S31,62,30);
            S31.setBackground(Color.red);
        }
        if(!S31.isSelected()){
            EnableVolume();
            var[62]=false;
             audio[30].detener();
            audio[30].stop();
            S31.setBackground(Color.white);
        }
    }//GEN-LAST:event_S31ActionPerformed

    private void S32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S32ActionPerformed
        // TODO add your handling code here:
        var[64]=true;
        if(S32.isSelected()&&!var[63]){
            DisableVolumeExcept(V32,S32,64,31);
            System.out.println("activado");
            Conf=X.Read("config.xml");                
         try{
             S32.setBackground(Color.red);
             audio[31]=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(31),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),31,V32,C32,socket);
             audio[31].start();
              
              
         }
         catch(Exception e){
             System.out.println("Error de hilo ");
               S32.setBackground(Color.white);
               var[64]=false;
         }     
<<<<<<< Updated upstream
    }   
    if(alternar26==2){
         audio26.detener();
         audio26.stop();
         alternar26=0;
         C27.setBackground(Color.BLUE);
         var[53]=false;
    }   
    }
    }//GEN-LAST:event_C27ActionPerformed

    private void S1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S1ActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        var[2]=true;
        if(S1.isSelected()&&!var[1]){
            DisableVolumeExcept(V1,S1,2,0);
            System.out.println("activado");
            Conf=X.Read("config.xml");                
         try{
             audio[0]=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(0),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),0,V1,C1,socket);
             audio[0].start();
              
              
         }
         catch(Exception e){
             System.out.println("Error de hilo ");
               var[2]=false;
         }     
        }
        if(S1.isSelected()&&var[1])
        {
            DisableVolumeExcept(V1,S1,2,0);
        }
        if(!S1.isSelected()){
            EnableVolume();
            var[2]=false;
            audio[0].detener();
            audio[0].stop();
        }
    }//GEN-LAST:event_S1ActionPerformed

    private void S9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S9ActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        var[18]=true;
        if(S9.isSelected()&&!var[17]){
            DisableVolumeExcept(V9,S9,18,8);
            System.out.println("activado");
            Conf=X.Read("config.xml");                
         try{
             audio[8]=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(8),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),1,V9,C9,socket);
             audio[8].start();
              
              
         }
         catch(Exception e){
             System.out.println("Error de hilo ");
               var[18]=false;
         }     
        }
        if(S9.isSelected()&&var[17])
        {
            DisableVolumeExcept(V9,S9,18,8);
        }
        if(!S9.isSelected()){
            EnableVolume();
            var[18]=false;
            audio[8].detener();
            audio[8].stop();
        }
    }//GEN-LAST:event_S9ActionPerformed
=======
        }
        if(S32.isSelected()&&var[63])
        {
            DisableVolumeExcept(V32,S32,64,31);
            S32.setBackground(Color.red);
        }
        if(!S32.isSelected()){
            EnableVolume();
            var[64]=false;
            audio[31].detener();
            audio[31].stop();
            S32.setBackground(Color.white);
        }
    }//GEN-LAST:event_S32ActionPerformed
>>>>>>> Stashed changes
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton C1;
    private javax.swing.JButton C10;
    private javax.swing.JButton C11;
    private javax.swing.JButton C12;
    private javax.swing.JButton C13;
    private javax.swing.JButton C14;
    private javax.swing.JButton C15;
    private javax.swing.JButton C16;
    private javax.swing.JButton C17;
    private javax.swing.JButton C18;
    private javax.swing.JButton C19;
    private javax.swing.JButton C2;
    private javax.swing.JButton C20;
    private javax.swing.JButton C21;
    private javax.swing.JButton C22;
    private javax.swing.JButton C23;
    private javax.swing.JButton C24;
    private javax.swing.JButton C25;
    private javax.swing.JButton C26;
    private javax.swing.JButton C27;
    private javax.swing.JButton C28;
    private javax.swing.JButton C29;
    private javax.swing.JButton C3;
    private javax.swing.JButton C30;
    private javax.swing.JButton C31;
    private javax.swing.JButton C32;
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
    private javax.swing.JLabel I17;
    private javax.swing.JLabel I18;
    private javax.swing.JLabel I19;
    private javax.swing.JLabel I2;
    private javax.swing.JLabel I20;
    private javax.swing.JLabel I21;
    private javax.swing.JLabel I22;
    private javax.swing.JLabel I23;
    private javax.swing.JLabel I24;
    private javax.swing.JLabel I25;
    private javax.swing.JLabel I26;
    private javax.swing.JLabel I27;
    private javax.swing.JLabel I28;
    private javax.swing.JLabel I29;
    private javax.swing.JLabel I3;
    private javax.swing.JLabel I30;
    private javax.swing.JLabel I31;
    private javax.swing.JLabel I32;
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
    private javax.swing.JToggleButton S17;
    private javax.swing.JToggleButton S18;
    private javax.swing.JToggleButton S19;
    private javax.swing.JToggleButton S2;
    private javax.swing.JToggleButton S20;
    private javax.swing.JToggleButton S21;
    private javax.swing.JToggleButton S22;
    private javax.swing.JToggleButton S23;
    private javax.swing.JToggleButton S24;
    private javax.swing.JToggleButton S25;
    private javax.swing.JToggleButton S26;
    private javax.swing.JToggleButton S27;
    private javax.swing.JToggleButton S28;
    private javax.swing.JToggleButton S29;
    private javax.swing.JToggleButton S3;
    private javax.swing.JToggleButton S30;
    private javax.swing.JToggleButton S31;
    private javax.swing.JToggleButton S32;
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
    private javax.swing.JSlider V17;
    private javax.swing.JSlider V18;
    private javax.swing.JSlider V19;
    private javax.swing.JSlider V2;
    private javax.swing.JSlider V20;
    private javax.swing.JSlider V21;
    private javax.swing.JSlider V22;
    private javax.swing.JSlider V23;
    private javax.swing.JSlider V24;
    private javax.swing.JSlider V25;
    private javax.swing.JSlider V26;
    private javax.swing.JSlider V27;
    private javax.swing.JSlider V28;
    private javax.swing.JSlider V29;
    private javax.swing.JSlider V3;
    private javax.swing.JSlider V30;
    private javax.swing.JSlider V31;
    private javax.swing.JSlider V32;
    private javax.swing.JSlider V4;
    private javax.swing.JSlider V5;
    private javax.swing.JSlider V6;
    private javax.swing.JSlider V7;
    private javax.swing.JSlider V8;
    private javax.swing.JSlider V9;
    // End of variables declaration//GEN-END:variables
}
