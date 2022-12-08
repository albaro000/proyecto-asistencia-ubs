/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.proyecto_asistencia;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
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
public final class FORM_INGRESO extends javax.swing.JFrame {
      File ArchivoAsistencia;
      FileWriter ArchivoAsistenciaW;
      PrintWriter pw;
      Date diaHora=new Date();
      Date horaIngreso=new Date();
      SimpleDateFormat formatoFecha=new SimpleDateFormat("dd/MM/YYYY");
      DateFormat formatoHora=new SimpleDateFormat("HH:mm:ss");
      INGRESO regas;
      VECTOR_INGRESO pa;

    /**
     * Creates new form FORM_INGRESO
     */
    public FORM_INGRESO() {
        initComponents();
        this.setLocationRelativeTo(this);
        abrirArchivo(); 
    }
     public void mensaje(String msje)
   {
       JOptionPane.showMessageDialog(null,msje);
   }
      public void abrirArchivo()
      { //ALBARO CALLIZAYA MOLLO;
           pa=new VECTOR_INGRESO();
       etiFecha.setText(formatoFecha.format(diaHora));
       etiHora.setText(formatoHora.format(diaHora));
       ArchivoAsistencia=new File("regasistencia.txt");
       if(!ArchivoAsistencia.exists())
       {
           try{
               ArchivoAsistencia.createNewFile();
               ArchivoAsistenciaW=new FileWriter(ArchivoAsistencia,true);
               pw=new PrintWriter(ArchivoAsistenciaW);
               ArchivoAsistenciaW.close();
           }catch(Exception ex)
           {
             mensaje("ERROR AL ABRIR EL ARCHIVO ASISTENCIA");
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
      public void abrirArchivoEstudiante()
   {
       pa=new VECTOR_INGRESO();
       etiFecha.setText(formatoFecha.format(diaHora));
       etiHora.setText(formatoHora.format(diaHora));
       ArchivoAsistencia=new File("regasistencia.txt");
       if(!ArchivoAsistencia.exists())
       {
           try{   //ALBARO CALLIZAYA MOLLO
               ArchivoAsistencia.createNewFile();
               ArchivoAsistenciaW=new FileWriter(ArchivoAsistencia,true);
               pw=new PrintWriter(ArchivoAsistenciaW);
               ArchivoAsistenciaW.close();
           }catch(IOException ex)
           {
             mensaje("ERROR AL ABRIR EL ARCHIVO ASISTENCIA");
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
         //ALBARO CALLIZAYA MOLLO
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
       RU=txtRU.getText();
       int posEst=ve.buscarRUEstudiante(Integer.parseInt(RU));
       if (posEst!=-1)
       {      //ALBARO CALLIZAYA MOLLO
            etiEstudiante.setText(ve.obtenerEstudiante(posEst).getNombre()+" "+
                    ve.obtenerEstudiante(posEst).getApellido());
            pw.println(RU+", "+fecha+", "+hora);
            pw.close();
            mensaje("SU REGISTRO A SIDO EXITOSO");
       }
       else   mensaje("ESE CODIGO NO EXISTE");
   }
      
      
      
      long obtenerMinutosAtraso(Date horaActual, Date horaIngreso)
    {   long minutos=0;
        try{
            Date dia=new Date();
            DateFormat fh=new SimpleDateFormat("HH:mm");    
            horaActual=fh.parse(fh.format(dia));
            horaIngreso=fh.parse("20:30");
            
            long resta=horaActual.getTime()-horaIngreso.getTime();
            minutos=TimeUnit.MINUTES.convert(resta, TimeUnit.MILLISECONDS);
           if (minutos>0)
           {
             return minutos;
           }
           
        } catch (ParseException ex) {
           mensaje("ERROR "+ex.getMessage());
        }
        return minutos;
    }    //ALBARO CALLIZAYA MOLLO

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
        etiFecha = new javax.swing.JLabel();
        etiHora = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtRU = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        etiEstudiante = new javax.swing.JLabel();
        etiAtraso = new javax.swing.JLabel();
        btnRegistroE = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        etiFecha.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));

        etiHora.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));

        jLabel4.setFont(new java.awt.Font("Eras Light ITC", 1, 24)); // NOI18N
        jLabel4.setText("INGRESO");

        txtRU.setForeground(new java.awt.Color(51, 51, 0));
        txtRU.setSelectionColor(new java.awt.Color(0, 0, 0));
        txtRU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRUActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Eras Light ITC", 1, 18)); // NOI18N
        jLabel5.setText("INGRESE SU CI:");

        etiAtraso.setForeground(new java.awt.Color(255, 0, 0));

        btnRegistroE.setFont(new java.awt.Font("Eras Light ITC", 1, 13)); // NOI18N
        btnRegistroE.setText("IR AL REGISTRO");
        btnRegistroE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroEActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("MINUTOS DE ATRASO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(51, 62, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(txtRU, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(etiEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etiAtraso, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(46, 46, 46))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(etiFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etiHora, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(btnRegistroE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel1)
                .addGap(4, 4, 4)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etiFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etiHora, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(etiAtraso, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                        .addComponent(etiEstudiante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 21, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtRU, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnRegistroE)
                .addGap(23, 23, 23))
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
        MostrarAtraso();
    }//GEN-LAST:event_txtRUActionPerformed

    private void btnRegistroEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroEActionPerformed
        FORM_ASISTENCIA fp=new FORM_ASISTENCIA();
        this.dispose();
        fp.setVisible(true);    //ALBARO CALLIZAYA MOLLO
    }//GEN-LAST:event_btnRegistroEActionPerformed
void MostrarAtraso()
{
    long ma = obtenerMinutosAtraso(diaHora, horaIngreso);
    etiAtraso.setText(String.valueOf(ma));
}
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
            java.util.logging.Logger.getLogger(FORM_INGRESO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FORM_INGRESO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FORM_INGRESO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FORM_INGRESO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new FORM_INGRESO().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistroE;
    private javax.swing.JLabel etiAtraso;
    private javax.swing.JLabel etiEstudiante;
    private javax.swing.JLabel etiFecha;
    private javax.swing.JLabel etiHora;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtRU;
    // End of variables declaration//GEN-END:variables
}
