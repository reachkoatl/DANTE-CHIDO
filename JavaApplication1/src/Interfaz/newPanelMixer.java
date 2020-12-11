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
        
        V9.setValue(10);
        V10.setValue(10);
        V11.setValue(10);
        V12.setValue(10);
       
        V17.setValue(10);
        V18.setValue(10);
        V19.setValue(10);
        V20.setValue(10);
       
        V25.setValue(10);
        V26.setValue(10);
        V27.setValue(10);
        V28.setValue(10);
        
        
        
        
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
       
      
       this.C9.setText(Nombres.get(8));
       this.C10.setText(Nombres.get(9));
       this.C11.setText(Nombres.get(10));
       this.C12.setText(Nombres.get(11));
       
       
       this.C17.setText(Nombres.get(16));
       this.C18.setText(Nombres.get(17));
       this.C19.setText(Nombres.get(18));
       this.C20.setText(Nombres.get(19));
       
       
       this.C25.setText(Nombres.get(24));
       this.C26.setText(Nombres.get(25));
       this.C27.setText(Nombres.get(26));
       this.C28.setText(Nombres.get(27));
       
       
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
        
  
       
    }
    
    public void LoadAlias(Configuracion C){
       this.C1.setText(C.GetAlias().get(0));
       this.C2.setText(C.GetAlias().get(1));
       this.C3.setText(C.GetAlias().get(2));
       this.C4.setText(C.GetAlias().get(3));
       
       this.C9.setText(C.GetAlias().get(8));
       this.C10.setText(C.GetAlias().get(9));
       this.C11.setText(C.GetAlias().get(10));
       this.C12.setText(C.GetAlias().get(11));
       
       this.C17.setText(C.GetAlias().get(16));
       this.C18.setText(C.GetAlias().get(17));
       this.C19.setText(C.GetAlias().get(18));
       this.C20.setText(C.GetAlias().get(19));
      
       this.C25.setText(C.GetAlias().get(24));
       this.C26.setText(C.GetAlias().get(25));
       this.C27.setText(C.GetAlias().get(26));
       this.C28.setText(C.GetAlias().get(27));
       
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
        
       
       
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
                  

    private void C2ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        // TODO add your handling code here:
        //leer configuracion
          // AlternarAudio(alternar1, audio1, 2, Conf, C2,V2);
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
        /*
       alternar1++;
        
        if(alternar1==1){
         canales.set(1,"ON");
         ganancias.set(1,V2.getValue());
         C2.setBackground(Color.BLUE.darker());
        }
        else if(alternar1==2){
            alternar1=0;
              canales.set(1,"OFF");
         ganancias.set(1,V2.getValue());
           C2.setBackground(Color.GRAY.darker());
        
        }*/
    
    
    }                                  

                              

    private void C4ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        // TODO add your handling code here:
      //     AlternarAudio(alternar3, audio3, 4, Conf, C4,V4);
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
      
      
        /*
        alternar3++;
        
        if(alternar3==1){
         canales.set(3,"ON");
         ganancias.set(3,V4.getValue());
         C4.setBackground(Color.BLUE.darker());
        }
        else if(alternar3==2){
            alternar3=0;
              canales.set(3,"OFF");
         ganancias.set(3,V4.getValue());
           C4.setBackground(Color.GRAY.darker());
        
        }*/
        
    }                                  

                             

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

                                          

    private void C10ActionPerformed(java.awt.event.ActionEvent evt) {                                    
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
        /*
                  alternar9++;
               if(alternar9==1){
              canales.set(9,"ON");
            ganancias.set(9,V10.getValue());
                         C10.setBackground(Color.BLUE.darker());
            System.out.println(V10.getValue());
        }
          else if(alternar9==2){
                  alternar9=0;
              canales.set(9,"OFF");
            ganancias.set(9,V10.getValue());
                         C10.setBackground(Color.GRAY.darker());
        
        }*/
    }                                   

              

    private void C12ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        // TODO add your handling code here:
         //  AlternarAudio(alternar11, audio11,12,Conf,C12,V12);
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
           /*
                  alternar11++;
               if(alternar11==1){
              canales.set(11,"ON");
            ganancias.set(11,V12.getValue());
                         C12.setBackground(Color.BLUE.darker());
            System.out.println(V12.getValue());
        }
          else if(alternar11==2){
                  alternar11=0;
              canales.set(11,"OFF");
            ganancias.set(11,V12.getValue());
                         C12.setBackground(Color.GRAY.darker());
        
        }*/
    }                                   

    
                                

    private void C18ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        // TODO add your handling code here:
      //  AlternarAudio(alternar17,audio17,18,Conf,C18,V18); 
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
      
      
        /*
                  alternar17++;
               if(alternar17==1){
              canales.set(17,"ON");
            ganancias.set(17,V18.getValue());
                         C18.setBackground(Color.BLUE.darker());
            System.out.println(V18.getValue());
        }
          else if(alternar17==2){
                  alternar17=0;
              canales.set(17,"OFF");
            ganancias.set(17,V18.getValue());
                         C18.setBackground(Color.GRAY.darker());
        
        }*/
    }                                   

                  

    private void C20ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        // TODO add your handling code here:
          // AlternarAudio(alternar19,audio19,20,Conf,C20,V20); 
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
          
               /*          
                  alternar19++;
               if(alternar19==1){
              canales.set(19,"ON");
            ganancias.set(19,V20.getValue());
                         C20.setBackground(Color.BLUE.darker());
            System.out.println(V20.getValue());
        }
          else if(alternar19==2){
                  alternar19=0;
              canales.set(19,"OFF");
            ganancias.set(19,V20.getValue());
                         C20.setBackground(Color.GRAY.darker());
        
        }*/
    }                                   

        

    private void C26ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        // TODO add your handling code here:
      //  AlternarAudio(alternar25,audio25,26,Conf,C26,V26);
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
      
        /*
                  alternar25++;
               if(alternar25==1){
              canales.set(25,"ON");
            ganancias.set(25,V26.getValue());
                         C26.setBackground(Color.BLUE.darker());
            System.out.println(V26.getValue());
        }
          else if(alternar25==2){
                  alternar25=0;
              canales.set(25,"OFF");
            ganancias.set(25,V26.getValue());
                         C26.setBackground(Color.GRAY.darker());
        
        }*/
    }                                   
                            

    private void C28ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        // TODO add your handling code here:
       //  AlternarAudio(alternar27,audio27,28,Conf,C28,V28);
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
       
        /*
                  alternar27++;
               if(alternar27==1){
              canales.set(27,"ON");
            ganancias.set(27,V28.getValue());
                         C28.setBackground(Color.BLUE.darker());
            System.out.println(V28.getValue());
        }
          else if(alternar27==2){
                  alternar27=0;
              canales.set(27,"OFF");
            ganancias.set(27,V28.getValue());
                         C28.setBackground(Color.GRAY.darker());
        
        }*/
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
    
    
    
                        

                                   

    private void S17ActionPerformed(java.awt.event.ActionEvent evt) {                                    

        // TODO add your handling code here:
        var[34]=true;
        if(S17.isSelected()&&!var[33]){
            DisableVolumeExcept(V17,S17,34,16);
            System.out.println("activado");
            Conf=X.Read("config.xml");                
         try{
             audio[16]=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(16),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),2,V17,C17,socket);
             audio[16].start();
            
              
         }
         catch(Exception e){
             System.out.println("Error de hilo ");
               
               var[34]=false;
         }
        }
        if(S17.isSelected()&&var[33])
        {
            DisableVolumeExcept(V17,S17,34,16);
        }
        if(!S17.isSelected()){
            EnableVolume();
            var[34]=false;
            audio[16].detener();
            audio[16].stop();
        }
    }                                   

    private void S25ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        // TODO add your handling code here:
         var[50]=true;
        if(S25.isSelected()&&!var[49]){
            DisableVolumeExcept(V25,S25,50,24);
            System.out.println("activado");
            Conf=X.Read("config.xml");                
         try{
             audio[24]=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(24),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),3,V25,C25,socket);
             audio[24].start();
              
              
         }
         catch(Exception e){
             System.out.println("Error de hilo ");
               
               var[50]=false;
         }     
        }
        if(S25.isSelected()&&var[49])
        {
            DisableVolumeExcept(V25,S25,50,24);
        }
        if(!S25.isSelected()){
            EnableVolume();
            var[50]=false;
            audio[24].detener();
            audio[24].stop();
        }
    }                                   

    private void S3ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        // TODO add your handling code here:
        var[6]=true;
        
        if(S3.isSelected()&&!var[5]){
            DisableVolumeExcept(V3,S3,6,2);
            System.out.println("activado");
             Conf=X.Read("config.xml");        
         
         try{
             audio[2]=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(2),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),4,V3,C3,socket);
             audio[2].start();
              
              
         }
         catch(Exception e){
             System.out.println("Error de hilo ");
               
               var[6]=false;
         }
        }
        if(S3.isSelected()&&var[5]){
            DisableVolumeExcept(V3,S3,6,2);
            
        }
        if(!S3.isSelected()){
            EnableVolume();
            var[6]=false;
            audio[2].detener();
            audio[2].stop();
        }
    }                                  

    private void S11ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        // TODO add your handling code here:
        var[22]=true;
        if(S11.isSelected()&&!var[21]){
            DisableVolumeExcept(V11,S11,22,10);
            System.out.println("activado");
            Conf=X.Read("config.xml");                
         try{
             audio[10]=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(10),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),5,V11,C11,socket);
             audio[10].start();
              
              
         }
         catch(Exception e){
             System.out.println("Error de hilo ");
               
               var[22]=false;
         }     
        }
        if(S11.isSelected()&&var[21])
        {
            DisableVolumeExcept(V11,S11,22,10);
        }
        if(!S11.isSelected()){
            EnableVolume();
            var[22]=false;
            audio[10].detener();
            audio[10].stop();
        }
    }                                   

    private void S19ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        // TODO add your handling code here:
         var[38]=true;
        if(S19.isSelected()&&!var[37]){
            DisableVolumeExcept(V19,S19,38,18);
            System.out.println("activado");
            Conf=X.Read("config.xml");                
         try{
             audio[18]=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(18),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),6,V19,C19,socket);
             audio[18].start();
              
              
         }
         catch(Exception e){
             System.out.println("Error de hilo ");
               
               var[38]=false;
         }     
        }
        if(S19.isSelected()&&var[37])
        {
            DisableVolumeExcept(V19,S19,38,18);
        }
        if(!S19.isSelected()){
            EnableVolume();
            var[38]=false;
            audio[18].detener();
            audio[18].stop();
        }
    }                                   

    private void S27ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        // TODO add your handling code here:
        var[54]=true;
        if(S27.isSelected()&&!var[53]){
            DisableVolumeExcept(V27,S27,54,26);
            System.out.println("activado");
            Conf=X.Read("config.xml");                
         try{
             audio[26]=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(26),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),7,V27,C27,socket);
             audio[26].start();
              
             
         }
         catch(Exception e){
             System.out.println("Error de hilo ");
               
            var[54]=false;
         }     
        }
        if(S27.isSelected()&&var[53])
        {
            DisableVolumeExcept(V27,S27,54,26);
        }
        if(!S27.isSelected()){
            EnableVolume();
            var[54]=false;
            audio[26].detener();
            audio[26].stop();
        }
    }                                   

    private void S2ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        // TODO add your handling code here:
        var[4]=true;
        if(S2.isSelected()&&!var[3]){
            DisableVolumeExcept(V2,S2,4,1);
            System.out.println("activado");
            Conf=X.Read("config.xml");        
         
         try{
             audio[1]=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(1),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),8,V2,C2,socket);
             audio[1].start();
              
              
         }
         catch(Exception e){
             System.out.println("Error de hilo ");
               
               var[4]=false;
         }
        }
        if(S2.isSelected()&&var[3]){
            DisableVolumeExcept(V2,S2,4,1);
        }
        if(!S2.isSelected()){
            EnableVolume();
            var[4]=false;
            audio[1].detener();
            audio[1].stop();
        }
    }                                  

    private void S10ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        // TODO add your handling code here:
        var[20]=true;
        if(S10.isSelected()&&!var[19]){
            DisableVolumeExcept(V10,S10,20,9);
            System.out.println("activado");
            Conf=X.Read("config.xml");                
         try{
             audio[9]=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(9),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),9,V10,C10,socket);
             audio[9].start();
              
              
         }
         catch(Exception e){
             System.out.println("Error de hilo ");
               
              var[20]=false;
         }     
        }
        if(S10.isSelected()&&var[19])
        {
            DisableVolumeExcept(V10,S10,20,9);
        }
        if(!S10.isSelected()){
            EnableVolume();
            var[20]=false;
            audio[9].detener();
            audio[9].stop();
            
        }
    }                                   

    private void S18ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        // TODO add your handling code here:
         var[36]=true;
        if(S18.isSelected()&&!var[35]){
            DisableVolumeExcept(V18,S18,36,17);
            System.out.println("activado");
            Conf=X.Read("config.xml");                
         try{
             audio[17]=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(17),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),10,V18,C18,socket);
             audio[17].start();
             
              
         }
         catch(Exception e){
             System.out.println("Error de hilo ");
              
               var[36]=false;
         }     
        }
        if(S18.isSelected()&&var[35])
        {
            DisableVolumeExcept(V18,S18,36,17);
        }
        if(!S18.isSelected()){
            EnableVolume();
            var[36]=false;
            audio[17].detener();
            audio[17].stop();
        }
    }                                   

    private void S26ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        // TODO add your handling code here:
         var[52]=true;
        if(S26.isSelected()&&!var[51]){
            DisableVolumeExcept(V26,S26,52,25);
            System.out.println("activado");
            Conf=X.Read("config.xml");                
         try{
             audio[25]=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(25),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),11,V26,C26,socket);
             audio[25].start();
              
              
         }
         catch(Exception e){
             System.out.println("Error de hilo ");
               
               var[52]=false;
         }     
        }
        if(S26.isSelected()&&var[51])
        {
            DisableVolumeExcept(V26,S26,52,25);
        }
        if(!S26.isSelected()){
            EnableVolume();
            var[52]=false;
            audio[25].detener();
            audio[25].stop();
        }
    }                                   

    private void S4ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        // TODO add your handling code here:
        var[8]=true;
        if(S4.isSelected()&&!var[7]){
            DisableVolumeExcept(V4,S4,8,3);
            System.out.println("activado");
            Conf=X.Read("config.xml");                
         try{
             audio[3]=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(3),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),12,V4,C4,socket);
             audio[3].start();
              
              
         }
         catch(Exception e){
             System.out.println("Error de hilo ");
               
               var[8]=false;
         }     
        }
        if(S4.isSelected()&&var[7]){
            DisableVolumeExcept(V4,S4,8,3);
        }
        if(!S4.isSelected()){
            EnableVolume();
            var[8]=false;
            audio[3].detener();
            audio[3].stop();
        }
    }                                  

    private void S12ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        // TODO add your handling code here:
        var[24]=true;
        if(S12.isSelected()&&!var[23]){
            DisableVolumeExcept(V12,S12,24,11);
            System.out.println("activado");
            Conf=X.Read("config.xml");                
         try{
             audio[11]=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(11),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),13,V12,C12,socket);
             audio[11].start();
              
             
         }
         catch(Exception e){
             System.out.println("Error de hilo ");
               
                var[24]=false;
               
         }     
        }
        if(S12.isSelected()&&var[23])
        {
            DisableVolumeExcept(V12,S12,24,11);
        }
        if(!S12.isSelected()){
            EnableVolume();
            var[24]=false;
            audio[11].detener();
            audio[11].stop();
        }
    }                                   

    private void S20ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        // TODO add your handling code here:
         var[40]=true;
        if(S20.isSelected()&&!var[39]){
            DisableVolumeExcept(V20,S20,40,19);
            System.out.println("activado");
            Conf=X.Read("config.xml");                
         try{
             audio[19]=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(19),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),14,V20,C20,socket);
             audio[19].start();
              
              
         }
         catch(Exception e){
             System.out.println("Error de hilo ");
              
               var[40]=false;
               
         }     
        }
        if(S20.isSelected()&&var[39])
        {
            DisableVolumeExcept(V20,S20,40,19);
        }
        if(!S20.isSelected()){
            EnableVolume();
            var[40]=false;
            audio[19].detener();
            audio[19].stop();
        }
    }                                   

    private void S28ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        // TODO add your handling code here:
        var[56]=true;
        if(S28.isSelected()&&!var[55]){
            DisableVolumeExcept(V28,S28,56,27);
            System.out.println("activado");
            Conf=X.Read("config.xml");                
         try{
             audio[27]=new ThreadAudio(Conf.GetNet(),Conf.GetLista().get(27),Conf.GetMultiCast(),P,Conf.GetFrecuencia(),Conf.GetMuestra(),15,V28,C28,socket);
             audio[27].start();
              
              
         }
         catch(Exception e){
             System.out.println("Error de hilo ");
               
               var[56]=false;
         }     
        }
        if(S28.isSelected()&&var[55])
        {
            DisableVolumeExcept(V28,S28,56,27);
        }
        if(!S28.isSelected()){
            EnableVolume();
            var[56]=false;
            audio[27].detener();
            audio[27].stop();
        }
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

        setBackground(new java.awt.Color(51, 51, 51));

        I1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        I9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        V1.setMaximum(10);

        C1.setBackground(new java.awt.Color(102, 102, 102));
        C1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        C1.setForeground(new java.awt.Color(255, 255, 255));
        C1.setText("jButton1");
        C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C1ActionPerformed(evt);
            }
        });

        C9.setBackground(new java.awt.Color(102, 102, 102));
        C9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        C9.setForeground(new java.awt.Color(255, 255, 255));
        C9.setText("jButton1");
        C9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C9ActionPerformed(evt);
            }
        });

        V9.setMaximum(10);

        S1.setText("SOLO");
        S1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S1ActionPerformed(evt);
            }
        });

        I17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        C17.setBackground(new java.awt.Color(102, 102, 102));
        C17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        C17.setForeground(new java.awt.Color(255, 255, 255));
        C17.setText("jButton1");
        C17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C17ActionPerformed(evt);
            }
        });

        V17.setMaximum(10);

        S17.setText("SOLO");

        I25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        C25.setBackground(new java.awt.Color(102, 102, 102));
        C25.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        C25.setForeground(new java.awt.Color(255, 255, 255));
        C25.setText("jButton1");
        C25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C25ActionPerformed(evt);
            }
        });

        V25.setMaximum(10);

        S25.setText("SOLO");

        S9.setText("SOLO");
        S9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S9ActionPerformed(evt);
            }
        });

        I3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        C3.setBackground(new java.awt.Color(102, 102, 102));
        C3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        C3.setForeground(new java.awt.Color(255, 255, 255));
        C3.setText("jButton1");
        C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C3ActionPerformed(evt);
            }
        });

        V3.setMaximum(10);

        S3.setText("SOLO");

        I11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        C11.setBackground(new java.awt.Color(102, 102, 102));
        C11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        C11.setForeground(new java.awt.Color(255, 255, 255));
        C11.setText("jButton1");
        C11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C11ActionPerformed(evt);
            }
        });

        V11.setMaximum(10);

        S11.setText("SOLO");

        I19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        C19.setBackground(new java.awt.Color(102, 102, 102));
        C19.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        C19.setForeground(new java.awt.Color(255, 255, 255));
        C19.setText("jButton1");
        C19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C19ActionPerformed(evt);
            }
        });

        V19.setMaximum(10);

        S19.setText("SOLO");

        I27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        C27.setBackground(new java.awt.Color(102, 102, 102));
        C27.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        C27.setForeground(new java.awt.Color(255, 255, 255));
        C27.setText("jButton1");
        C27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C27ActionPerformed(evt);
            }
        });

        V27.setMaximum(10);

        S27.setText("SOLO");

        S2.setText("SOLO");

        V2.setMaximum(10);

        C2.setBackground(new java.awt.Color(102, 102, 102));
        C2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        C2.setForeground(new java.awt.Color(255, 255, 255));
        C2.setText("jButton1");

        I2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        S10.setText("SOLO");

        V10.setMaximum(10);

        C10.setBackground(new java.awt.Color(102, 102, 102));
        C10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        C10.setForeground(new java.awt.Color(255, 255, 255));
        C10.setText("jButton1");

        I10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        S18.setText("SOLO");

        V18.setMaximum(10);

        C18.setBackground(new java.awt.Color(102, 102, 102));
        C18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        C18.setForeground(new java.awt.Color(255, 255, 255));
        C18.setText("jButton1");

        I18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        S26.setText("SOLO");

        V26.setMaximum(10);

        C26.setBackground(new java.awt.Color(102, 102, 120));
        C26.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        C26.setForeground(new java.awt.Color(255, 255, 255));
        C26.setText("jButton1");

        I26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        I4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        C4.setBackground(new java.awt.Color(102, 102, 102));
        C4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        C4.setForeground(new java.awt.Color(255, 255, 255));
        C4.setText("jButton1");

        V4.setMaximum(10);

        S4.setText("SOLO");

        I12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        C12.setBackground(new java.awt.Color(102, 102, 102));
        C12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        C12.setForeground(new java.awt.Color(255, 255, 255));
        C12.setText("jButton1");

        V12.setMaximum(10);

        S12.setText("SOLO");

        I20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        C20.setBackground(new java.awt.Color(102, 102, 102));
        C20.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        C20.setForeground(new java.awt.Color(255, 255, 255));
        C20.setText("jButton1");

        V20.setMaximum(10);

        S20.setText("SOLO");

        I28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        C28.setBackground(new java.awt.Color(102, 102, 102));
        C28.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        C28.setForeground(new java.awt.Color(255, 255, 255));
        C28.setText("jButton1");

        V28.setMaximum(10);

        S28.setText("SOLO");

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
                                .addComponent(S28)))))
                .addContainerGap(18, Short.MAX_VALUE))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton C1;
    private javax.swing.JButton C10;
    private javax.swing.JButton C11;
    private javax.swing.JButton C12;
    private javax.swing.JButton C17;
    private javax.swing.JButton C18;
    private javax.swing.JButton C19;
    private javax.swing.JButton C2;
    private javax.swing.JButton C20;
    private javax.swing.JButton C25;
    private javax.swing.JButton C26;
    private javax.swing.JButton C27;
    private javax.swing.JButton C28;
    private javax.swing.JButton C3;
    private javax.swing.JButton C4;
    private javax.swing.JButton C9;
    private javax.swing.JLabel I1;
    private javax.swing.JLabel I10;
    private javax.swing.JLabel I11;
    private javax.swing.JLabel I12;
    private javax.swing.JLabel I17;
    private javax.swing.JLabel I18;
    private javax.swing.JLabel I19;
    private javax.swing.JLabel I2;
    private javax.swing.JLabel I20;
    private javax.swing.JLabel I25;
    private javax.swing.JLabel I26;
    private javax.swing.JLabel I27;
    private javax.swing.JLabel I28;
    private javax.swing.JLabel I3;
    private javax.swing.JLabel I4;
    private javax.swing.JLabel I9;
    private javax.swing.JToggleButton S1;
    private javax.swing.JToggleButton S10;
    private javax.swing.JToggleButton S11;
    private javax.swing.JToggleButton S12;
    private javax.swing.JToggleButton S17;
    private javax.swing.JToggleButton S18;
    private javax.swing.JToggleButton S19;
    private javax.swing.JToggleButton S2;
    private javax.swing.JToggleButton S20;
    private javax.swing.JToggleButton S25;
    private javax.swing.JToggleButton S26;
    private javax.swing.JToggleButton S27;
    private javax.swing.JToggleButton S28;
    private javax.swing.JToggleButton S3;
    private javax.swing.JToggleButton S4;
    private javax.swing.JToggleButton S9;
    private javax.swing.JSlider V1;
    private javax.swing.JSlider V10;
    private javax.swing.JSlider V11;
    private javax.swing.JSlider V12;
    private javax.swing.JSlider V17;
    private javax.swing.JSlider V18;
    private javax.swing.JSlider V19;
    private javax.swing.JSlider V2;
    private javax.swing.JSlider V20;
    private javax.swing.JSlider V25;
    private javax.swing.JSlider V26;
    private javax.swing.JSlider V27;
    private javax.swing.JSlider V28;
    private javax.swing.JSlider V3;
    private javax.swing.JSlider V4;
    private javax.swing.JSlider V9;
    // End of variables declaration//GEN-END:variables
}
