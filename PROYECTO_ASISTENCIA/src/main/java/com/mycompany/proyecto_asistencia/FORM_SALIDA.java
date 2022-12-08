/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.proyecto_asistencia;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;
import java.util.concurrent.TimeUnit;
import javax.swing.JOptionPane;

/**
 *
 * @author ALBARO CALLIZAYA MOLLO
 */
public class FORM_SALIDA extends javax.swing.JFrame {
File ArchivoAsistencia;
      FileWriter ArchivoAsistenciaW;
      PrintWriter pw;
      Date diaHora=new Date();
      Date horaSalida=new Date();
      SimpleDateFormat formatoFecha=new SimpleDateFormat("dd/MM/YYYY");
      DateFormat formatoHora=new SimpleDateFormat("HH:mm:ss");
      SALIDA regAs;
      VECTOR_SALIDA pa;
    /**
     * Creates new form FORM_SALIDA
     */
    public FORM_SALIDA() {
        initComponents();
        this.setLocationRelativeTo(this);
        abrirArchivo();
    }
    public void mensaje(String msje)
             {
       JOptionPane.showMessageDialog(null,msje);
   }
    
    
    public void abrirArchivo()
      {
           pa=new VECTOR_SALIDA();
       etiFecha.setText(formatoFecha.format(diaHora));
       etiHora.setText(formatoHora.format(diaHora));
       //ALBARO CALLIZAYA MOLLO
       ArchivoAsistencia=new File("regSALIDA.txt");
       if(!ArchivoAsistencia.exists())
       {
           try{
               ArchivoAsistencia.createNewFile();
               ArchivoAsistenciaW=new FileWriter(ArchivoAsistencia,true);
               pw=new PrintWriter(ArchivoAsistenciaW);
               ArchivoAsistenciaW.close();
           }catch(Exception ex)
           {
             mensaje("ERROR AL ABRIR EL ARCHIVO SALIDA");
           }
       }else{
       try{
           ArchivoAsistenciaW=new FileWriter(ArchivoAsistencia,true);
           pw=new PrintWriter(ArchivoAsistenciaW);
           
       }catch(Exception ex)
       {
           mensaje("ERROR");
       }
       }
      }      //ALBARO CALLIZAYA MOLLO
    public void abrirArchivoEstudiante()
   {
       pa=new VECTOR_SALIDA();
       etiFecha.setText(formatoFecha.format(diaHora));
       etiHora.setText(formatoHora.format(diaHora));
       ArchivoAsistencia=new File("regSALIDA.txt");
       if(!ArchivoAsistencia.exists())
       {
           try{
               ArchivoAsistencia.createNewFile();
               ArchivoAsistenciaW=new FileWriter(ArchivoAsistencia,true);
               pw=new PrintWriter(ArchivoAsistenciaW);
               ArchivoAsistenciaW.close();
           }catch(Exception ex)
           {
             mensaje("ERROR AL ABRIR EL ARCHIVO SALIDA");
           }
       }else{
       try{
           ArchivoAsistenciaW=new FileWriter(ArchivoAsistencia,true);
           pw=new PrintWriter(ArchivoAsistenciaW);
           
       }catch(Exception ex)
       {
           mensaje("ERROR");
       }
      }
    }
           //ALBARO CALLIZAYA MOLLO
    void guardarAsistenciaEnArchivo()
   {
       String fecha,hora;
       String RU;
       ESTUDIANTE est;
       VECTOR_ESTUDIANTES ve=new VECTOR_ESTUDIANTES();
       try{   
        FileReader fra=new FileReader("archiEstudiantes.txt");
        BufferedReader br=new BufferedReader(fra);
        String linea=null;
        linea=br.readLine();
     
        while(linea!=null)
            {
                    //dividimos la cadena separado por un token ,
                   StringTokenizer st=new StringTokenizer(linea,",");
                   est=new ESTUDIANTE();
                   int cod=Integer.parseInt(st.nextToken());
                   est.setRU(cod);
                   est.setNombre(st.nextToken());
                   est.setApellido(st.nextToken());
                   est.setGenero(st.nextToken().charAt(0));
                   
                   
                   //agregamos el registro al vector
                   ve.agregarEstudiante(est);
                   linea=br.readLine();
            }
        br.close();
     }catch(Exception ex)
     {
         System.out.println("ERROR AL CARGAR EL ARCHIVO "+ex.getMessage());
     }
       fecha=etiFecha.getText();
       hora=etiHora.getText();
       RU=txtRU.getText();       //ALBARO CALLIZAYA MOLLO
       int posEst=ve.buscarRUEstudiante(Integer.parseInt(RU));
       if (posEst!=-1)
       {  
            etiEstudiante.setText(ve.obtenerEstudiante(posEst).getNombre()+" "+
                    ve.obtenerEstudiante(posEst).getApellido());
            pw.println(RU+", "+fecha+", "+hora);
            pw.close();
            mensaje("SU REGISTRO A SIDO EXITOSO");
       }
       else   mensaje("ESE CODIGO NO EXISTE");
   }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        etiFecha = new javax.swing.JLabel();
        etiHora = new javax.swing.JLabel();
        etiEstudiante = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtRU = new javax.swing.JTextField();
        btnRegistro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\AMD\\Pictures\\sal.png")); // NOI18N

        jLabel4.setFont(new java.awt.Font("Eras Light ITC", 1, 24)); // NOI18N
        jLabel4.setText("SALIDA");

        etiFecha.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));

        etiHora.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));

        jLabel7.setFont(new java.awt.Font("Eras Light ITC", 1, 18)); // NOI18N
        jLabel7.setText("INGRESE SU RU:");

        txtRU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRUActionPerformed(evt);
            }
        });

        btnRegistro.setFont(new java.awt.Font("Eras Light ITC", 1, 13)); // NOI18N
        btnRegistro.setText("IR AL REGISTRO");
        btnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(txtRU, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(btnRegistro))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(etiFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(etiHora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(64, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(etiEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(4, 4, 4)
                .addComponent(etiFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etiHora, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etiEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(txtRU, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRegistro)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtRUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRUActionPerformed
        guardarAsistenciaEnArchivo();
        txtRU.setText(null);
    }//GEN-LAST:event_txtRUActionPerformed
               //ALBARO CALLIZAYA MOLLO
    private void btnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroActionPerformed
        FORM_ASISTENCIA fp=new FORM_ASISTENCIA();
        this.dispose();
        fp.setVisible(true);
    }//GEN-LAST:event_btnRegistroActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FORM_SALIDA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FORM_SALIDA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FORM_SALIDA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FORM_SALIDA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FORM_SALIDA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistro;
    private javax.swing.JLabel etiEstudiante;
    private javax.swing.JLabel etiFecha;
    private javax.swing.JLabel etiHora;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtRU;
    // End of variables declaration//GEN-END:variables
}
