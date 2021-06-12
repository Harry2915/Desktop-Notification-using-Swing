import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;
import java.awt.TrayIcon.MessageType;
import java.net.MalformedURLException;
import java.awt.*;
import java.awt.event.*;
public class appletexample extends javax.swing.JFrame {

       private javax.swing.JButton btn_clear1;
    private javax.swing.JButton btn_quit;
    private javax.swing.JButton btn_sum;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txt_val3;
    private javax.swing.JTextField txt_val1;
    private javax.swing.JTextField txt_val2;
    
    public appletexample() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_val1 = new javax.swing.JTextField();
        txt_val2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_val3 = new javax.swing.JTextField();
        btn_quit = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btn_sum = new javax.swing.JButton();
        btn_clear1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); 
        jLabel1.setText("Enter delay time in seconds");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); 
        jLabel2.setText("Enter Title");

        txt_val1.setFont(new java.awt.Font("Tahoma", 1, 12)); 

        txt_val2.setFont(new java.awt.Font("Tahoma", 1, 12)); 

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); 
        jLabel3.setText("Enter Message");

        txt_val3.setFont(new java.awt.Font("Tahoma", 1, 12)); 

        btn_quit.setFont(new java.awt.Font("Tahoma", 1, 12)); 
        btn_quit.setText("Quit");
        btn_quit.setToolTipText("Click here to quit program.");
        btn_quit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_quitActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jLabel4.setText("Desktop Notification in Java Swing");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); 
       

        btn_sum.setFont(new java.awt.Font("Tahoma", 1, 12)); 
        btn_sum.setText("Save");
        btn_sum.setToolTipText("Click here to save notification.");
        btn_sum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sumActionPerformed(evt);
            }
        });

        btn_clear1.setFont(new java.awt.Font("Tahoma", 1, 12)); 
        btn_clear1.setText("Clear");
        btn_clear1.setToolTipText("Click here to clear the text box.");
        btn_clear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clear1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_val2)
                    .addComponent(txt_val1)
                    .addComponent(txt_val3, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(btn_sum)
                .addGap(59, 59, 59)
                .addComponent(btn_clear1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_quit)
                .addGap(21, 21, 21))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addGap(91, 91, 91))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel4)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_val1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_val2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_val3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_sum)
                    .addComponent(btn_clear1)
                    .addComponent(btn_quit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>                        

    private void btn_quitActionPerformed(java.awt.event.ActionEvent evt) {                                         
      String message = "Do you want to quit the program?";
      String title = "   Warning!!";

    int reply = JOptionPane.showConfirmDialog(null, message, title, JOptionPane.YES_NO_OPTION);
    
    if (reply ==JOptionPane.NO_OPTION)
    {
       this.txt_val1.setText("");
       this.txt_val2.setText("");
       this.txt_val3.setText("");
       
       this.txt_val1.requestFocus();
       
    }
    
    if (reply == JOptionPane.YES_OPTION)
    {
      System.exit(0);
    }
             
    }                                        

    private void btn_sumActionPerformed(java.awt.event.ActionEvent evt) {                                        
        int time = Integer.parseInt(this.txt_val1.getText());
        String title = this.txt_val2.getText();
        String message = this.txt_val3.getText();
        
        while(true){
            callnotify(title,message);
            
           //  TimeUnit.SECONDS.sleep(<timeInSeconds>);
           try {
             TimeUnit.SECONDS.sleep(time);
           } catch (Exception e) {
             //TODO: handle exception
           }
        }
        
       
                
    }                                       


    public static void callnotify(String title, String message){
        try{
          //Obtain only one instance of the SystemTray object
          SystemTray tray = SystemTray.getSystemTray();
         // File f= new File("C:\\Users\\haris\\Desktop\\JAVA EXAMPLES WITH SYNTAX\\BasicJava\\src\\icon.ico");
          // If you want to create an icon in the system tray to preview
          Image image = Toolkit.getDefaultToolkit().createImage("C:\\Users\\haris\\Desktop\\JAVA EXAMPLES WITH SYNTAX\\BasicJava\\src\\icon.ico");
          //Alternative (if the icon is on the classpath):
          //Image image = Toolkit.getDefaultToolkit().createImage(getClass().getResource("icon.png"));
      
          TrayIcon trayIcon = new TrayIcon(image, "Java AWT Tray Demo");
          //Let the system resize the image if needed
          trayIcon.setImageAutoSize(true);
          //Set tooltip text for the tray icon
          trayIcon.setToolTip("System tray icon demo");
          tray.add(trayIcon);
      
          // Display info notification:
          trayIcon.displayMessage(title, message, MessageType.INFO);
          // Error:
          // trayIcon.displayMessage("Hello, World", "Java Notification Demo", MessageType.ERROR);
          // Warning:
          // trayIcon.displayMessage("Hello, World", "Java Notification Demo", MessageType.WARNING);
      }catch(Exception ex){
          System.err.print(ex);
      }
      
      }
      

    private void btn_clear1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
       this.txt_val1.setText("");
       this.txt_val2.setText("");
       this.txt_val3.setText("");
       
       this.txt_val1.requestFocus();
       
    }                                          

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(appletexample.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(appletexample.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(appletexample.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(appletexample.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new appletexample().setVisible(true);
            }
        });
    }

                      
 
                  
}
