/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;
import Negocio.Coordinador;
import java.awt.Color;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import Datos.XmlRead;
import Datos.Configuracion;
import Datos.volumen;
import javax.swing.JButton;
import javax.swing.JComboBox;
import Negocio.NetworkInterfaces;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
/**
 *
 * @author leone
 */
public class Panel extends javax.swing.JFrame {

    /**
     * Creates new form Panel
     */
   private PanelAjustes ajustes;
   //private PanelMixer mixer;
   private newPanelMixer mixer;
    private Mixer2 mixer2;
    private Mixer3 mixer3;
    private Mixer4 mixer4;
   private PanelLogs logs;
   private Coordinador C;
   private Settings set;
   private ArrayList<String> canales;
   private ArrayList<Integer> ganancias;
   private String ReportDay;
   private DateFormat df;
   private Date today;
   private XmlRead X;
   private Configuracion Conf;
   private NetworkInterfaces interfaces;
   private ArrayList<String> listaInterfaces;
   private String Red=null;
   public volumen vol;
    public Panel() {
       initComponents();
       this.setResizable(false);
       this.setSize(new Dimension(1366,766));
       this.setLocationRelativeTo(null);
       C=new Coordinador(this);
       C.SetPanel(this);
       //mixer= new PanelMixer(this);
       mixer= new newPanelMixer(this);
       mixer2 = new Mixer2(this);
       mixer3 = new Mixer3();
       mixer4 = new Mixer4();
       
       //ajustes = new PanelAjustes(C,this,mixer);
       set=new Settings(C,this,mixer);
       this.setBackground(Color.yellow);
    //   this.Bconnect.setEnabled(false);
       
       //fecha
       df=new SimpleDateFormat("yyyy/dd/MM HH:mm:ss");
       today=Calendar.getInstance().getTime();
       
         
       X=new XmlRead();
         
         //apagar temporalmente logs (boton)
       //this.Bping.setEnabled(false);
    //   this.Bstop.setEnabled(false);
       
       //obtener interfaces
       interfaces=new NetworkInterfaces();
       listaInterfaces=interfaces.GetInterfaces();
       networks.addItem("default");
       for(int i=0;i<listaInterfaces.size();i++){
           if(i%2==0){
            networks.addItem(listaInterfaces.get(i));
           }
           
       }
        jTabbedPane1.add("1-16",mixer);
        jTabbedPane1.add("17-32",mixer2);
        jTabbedPane1.add("33-48",mixer3);
        jTabbedPane1.add("49-64",mixer4);

    
       jScrollPane2.getVerticalScrollBar().addAdjustmentListener(new AdjustmentListener() {  
        public void adjustmentValueChanged(AdjustmentEvent e) {  
            e.getAdjustable().setValue(e.getAdjustable().getMaximum());  
        }
    });   
      vol = new volumen(vPrincipal); 
      
      jLabel4.setIcon(new javax.swing.ImageIcon("fondobueno.png"));
         
      EtiquetaConect.setVisible(false);
      EtiquetaStatus.setVisible(false);
      MSG.setVisible(false);
      jLabel1.setVisible(false);
    }
    
    
    public void setpanel(Networks NT){
      jTabbedPane1.add(NT);
    }
    
   
    
    public void setEtiquetaStatus(String estado){
      this.EtiquetaStatus.setText(estado);
    }
    
    public void setEtiquetaCanales(String canales){
        this.Etiquetacanales.setText(canales);
    }
    
    public void setEtiquetaConect(String ping){
        this.EtiquetaConect.setText(ping);
    }
    
    public void SetCanales(ArrayList<String> canales){
      this.canales=canales;
    }
    
    public ArrayList<String> GetCanales(){
        return mixer.GetCanales();
    }
    
    public void SetCGanancias(ArrayList<Integer> ganancias){
      this.ganancias=ganancias;
    }
    
    public ArrayList<Integer> GetGanancias(){
        return mixer.GetGanacias();
    }
    
    public void SetLog(String Texto){
        today=Calendar.getInstance().getTime();
        ReportDay=df.format(today);
   this.jTextArea1.append(ReportDay+"  -  "+Texto+'\n');
       
    }
    
    public void SetMSG(String Texto,boolean status){
        this.MSG.setText(Texto);
           
    }
    
    
    public void SetTime(){
        Calendar calendario=Calendar.getInstance();
       int hora=calendario.get(Calendar.HOUR_OF_DAY);
       int minuto=calendario.get(Calendar.MINUTE);
       int segundo=calendario.get(Calendar.SECOND);
       String h=Integer.toString(hora);
       String m=Integer.toString(minuto);
       String seg=Integer.toString(segundo);     
       jLabel1.setText(h+":"+m+":"+seg);
    }
    
    
    public void TurnOffSend(){
    //  this.Bconnect.setEnabled(false);
    }
    
    public void TurnOnSend(){
    //  this.Bconnect.setEnabled(true);
    }
    
    public void TurnOffStop(){
    //  this.Bstop.setEnabled(false);
    }
    
    public void TurnOnStop(){
     // this.Bstop.setEnabled(true);
    }
            
    public void SetAlarma(int status){
        if(status==0){
            try{
               alarma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/green.png")));
            }
            catch(Exception e){
                System.out.println("error de imagen");
                this.SetLog("error de imagen");
            }
           
        }
        else if(status==1){
        
              try{
               alarma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/yellow.png")));
            }
            catch(Exception e){
                System.out.println("error de imagen");
                this.SetLog("error de imagen");
            }
        }
        
        else if(status==2){
        
              try{
               alarma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/red.png")));
            }
            catch(Exception e){
                System.out.println("error de imagen");
                this.SetLog("error de imagen");
            }
        }
    }
    
   
    
    public String GetNetwork(){
        for(int i=0;i<listaInterfaces.size();i++){
            if(Red.equals(listaInterfaces.get(i))){
                return listaInterfaces.get(i+1);
            }
        }
        
      return null;
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    
    
    @SuppressWarnings("unchecked")
    
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        Bsettings = new javax.swing.JButton();
        Bmixer = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        EtiquetaStatus = new javax.swing.JLabel();
        EtiquetaConect = new javax.swing.JLabel();
        Etiquetacanales = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        MSG = new javax.swing.JTextField();
        alarma = new javax.swing.JLabel();
        networks = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        vPrincipal = new javax.swing.JSlider();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 51, 102));
        setForeground(new java.awt.Color(0, 51, 102));
        getContentPane().setLayout(null);
        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(60, 90, 1240, 580);

        Bsettings.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Bsettings.setText("SETTINGS");
        Bsettings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BsettingsActionPerformed(evt);
            }
        });
        getContentPane().add(Bsettings);
        Bsettings.setBounds(390, 690, 172, 40);

        Bmixer.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Bmixer.setText("MIXER");
        Bmixer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BmixerActionPerformed(evt);
            }
        });
        getContentPane().add(Bmixer);
        Bmixer.setBounds(140, 690, 172, 40);

        jLabel1.setBackground(new java.awt.Color(51, 0, 204));
        jLabel1.setFont(new java.awt.Font("Verdana", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TIME");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(1170, 10, 140, 46);

        EtiquetaStatus.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        EtiquetaStatus.setForeground(new java.awt.Color(255, 255, 255));
        EtiquetaStatus.setText("CHECKING SERVICE");
        getContentPane().add(EtiquetaStatus);
        EtiquetaStatus.setBounds(900, 80, 125, 36);

        EtiquetaConect.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        EtiquetaConect.setForeground(new java.awt.Color(255, 255, 255));
        EtiquetaConect.setText("FINDING SERVER");
        getContentPane().add(EtiquetaConect);
        EtiquetaConect.setBounds(450, 80, 116, 36);

        Etiquetacanales.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Etiquetacanales.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(Etiquetacanales);
        Etiquetacanales.setBounds(816, 24, 38, 36);

        jTextArea1.setBackground(new java.awt.Color(51, 51, 51));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 1, 13)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(220, 970, 410, 50);

        MSG.setBackground(new java.awt.Color(51, 0, 51));
        MSG.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        MSG.setForeground(new java.awt.Color(204, 204, 204));
        MSG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MSGActionPerformed(evt);
            }
        });
        getContentPane().add(MSG);
        MSG.setBounds(580, 60, 290, 33);

        alarma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gray.png"))); // NOI18N
        alarma.setText("jLabel2");
        getContentPane().add(alarma);
        alarma.setBounds(310, 20, 52, 54);

        networks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networksActionPerformed(evt);
            }
        });
        getContentPane().add(networks);
        networks.setBounds(880, 690, 130, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("SELECT NETWORK");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(1030, 690, 127, 20);

        vPrincipal.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                vPrincipalStateChanged(evt);
            }
        });
        getContentPane().add(vPrincipal);
        vPrincipal.setBounds(1110, 40, 210, 30);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 1350, 740);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BsettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BsettingsActionPerformed
        // TODO add your handling code here:
        
      //  this.Bconnect.setEnabled(false);
      //  this.Bstop.setEnabled(false);
 
    }//GEN-LAST:event_BsettingsActionPerformed

    private void BmixerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BmixerActionPerformed
        // TODO add your handling code here:
       
        //this.Bconnect.setEnabled(rootPaneCheckingEnabled);
        //this.Bstop.setEnabled(true);
        
    }//GEN-LAST:event_BmixerActionPerformed

    private void networksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_networksActionPerformed
        // TODO add your handling code here:
        Red=networks.getSelectedItem().toString();
    }//GEN-LAST:event_networksActionPerformed

    private void MSGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MSGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MSGActionPerformed

    private void vPrincipalStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_vPrincipalStateChanged
            vol.setSystemVolume(vPrincipal.getValue());
        // TODO add your handling code here:
    }//GEN-LAST:event_vPrincipalStateChanged

    
    /**
     * @param args the command line arguments
     */
    
    /*
    
    /*
    
    /*
    */
    
    /*
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Panel().setVisible(true);
            }
        });
    }
    */
    
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bmixer;
    private javax.swing.JButton Bsettings;
    private javax.swing.JLabel EtiquetaConect;
    private javax.swing.JLabel EtiquetaStatus;
    private javax.swing.JLabel Etiquetacanales;
    private javax.swing.JTextField MSG;
    private javax.swing.JLabel alarma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JComboBox<String> networks;
    private javax.swing.JSlider vPrincipal;
    // End of variables declaration//GEN-END:variables
}
