/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * DatosDeArchivo.java
 *
 * Created on 8/12/2014, 05:11:21 PM
 */
package basesdedatosarchivos;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Jesús Ernesto Jaramillo Salazar
 */
public class DatosDeArchivo extends javax.swing.JFrame {

  String text="";
  Statement statement = null;
  /** Creates new form DatosDeArchivo */
  public DatosDeArchivo() {
    initComponents();
  }
  public DatosDeArchivo(String text,Statement statement){
    initComponents();
    this.text = text;
    this.statement = statement;
    setVisible(true);
    this.jTextArea1.setText(text);
  }

  /** This method is called from within the constructor to
   * initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is
   * always regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jPanel1 = new javax.swing.JPanel();
    jScrollPane1 = new javax.swing.JScrollPane();
    jTextArea1 = new javax.swing.JTextArea();
    jButton1 = new javax.swing.JButton();
    jButton2 = new javax.swing.JButton();
    jMenuBar1 = new javax.swing.JMenuBar();
    jMenu1 = new javax.swing.JMenu();
    jMenuItem1 = new javax.swing.JMenuItem();
    jMenu2 = new javax.swing.JMenu();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Archivo de texto"));

    jTextArea1.setColumns(20);
    jTextArea1.setRows(5);
    jScrollPane1.setViewportView(jTextArea1);

    jButton1.setText("Guardar");

    jButton2.setText("Cancelar");

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
        .addContainerGap(190, Short.MAX_VALUE)
        .addComponent(jButton2)
        .addGap(18, 18, 18)
        .addComponent(jButton1)
        .addContainerGap())
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jButton1)
          .addComponent(jButton2)))
    );

    jMenu1.setText("Bases de Datos");

    jMenuItem1.setText("Guardar en BD");
    jMenuItem1.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        jMenuItem1MouseClicked(evt);
      }
      public void mouseReleased(java.awt.event.MouseEvent evt) {
        jMenuItem1MouseReleased(evt);
      }
    });
    jMenu1.add(jMenuItem1);

    jMenuBar1.add(jMenu1);

    jMenu2.setText("Salir");
    jMenuBar1.add(jMenu2);

    setJMenuBar(jMenuBar1);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addContainerGap())
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void jMenuItem1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem1MouseClicked
    // TODO add your handling code here:
  }//GEN-LAST:event_jMenuItem1MouseClicked

  private void jMenuItem1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem1MouseReleased
    String[] reg = new String[100];
    int ind=0,meh=0,numAux=0,contadorRegistros=0;
    String[][] aux2;
    String[] registro = new String[20];
    String aux="";
    String aux1="";
     
    for(int i=0;i<100;++i){
        ind = this.jTextArea1.getText().indexOf("\n", numAux+1);
        if(ind!=-1){
            reg[i]="\b"+this.jTextArea1.getText().substring(numAux, ind);
            numAux=ind;
            contadorRegistros++;
        }else{ 
            break;       
        }
        reg[i]=reg[i].replace("\r","").replace("\n","");
        aux+=reg[i];   
    }
    aux2 = new String[contadorRegistros][5];
    for(int i=0;i<contadorRegistros;++i){
        for(int j=0;j<5;++j){
            if(registro[0]==null){
                meh = aux.indexOf("|",1);
                registro[j]=aux.substring(1,meh);
                ind = meh;
            }else{
                meh = aux.indexOf("|",ind+1);
                registro[j]=aux.substring(ind+1,meh);
                ind = meh;
            }

            if(registro[j]==null || registro[j].length()<=1 && !(registro[j].equals("1") || registro[j].equals("5") || registro[j].equals("6") || registro[j].equals("7") || registro[j].equals("8") || registro[j].equals("9") || registro[j].equals("4") || registro[j].equals("2") || registro[j].equals("3"))){--j;}
            else{ 
                aux2[i][j]=registro[j];
                aux1+=registro[j]+"\n";
            }
        }
    }
    for(int i=0;i<contadorRegistros;++i){
        for(int j=0;j<5;++j){
            System.out.print(aux2[i][j]+"   ");
        }
        System.out.println("");
    }
    
    
    //BLOQUE DONDE SE HACE EL INSERT A LA TABLE DE LA BASE DE DATOS
    /*for(int i=0;i<contadorRegistros;++i){
            try {
                statement.executeQuery("INSERT INTO ejaramillo values"
                        + "("+aux2[i][0]+",\""+aux2[i][1]+"\",\""+aux2[i][2]+"\".\""+aux2[i][3]+"\",\""+aux2[i][4]+"\");");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "No se pudo realizar la operacion", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
    }*/

    //this.jTextArea1.setText(aux1);
    
    
      
    
  }//GEN-LAST:event_jMenuItem1MouseReleased

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    java.awt.EventQueue.invokeLater(new Runnable() {

      public void run() {
        new DatosDeArchivo().setVisible(true);
      }
    });
  }
  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton jButton1;
  private javax.swing.JButton jButton2;
  private javax.swing.JMenu jMenu1;
  private javax.swing.JMenu jMenu2;
  private javax.swing.JMenuBar jMenuBar1;
  private javax.swing.JMenuItem jMenuItem1;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTextArea jTextArea1;
  // End of variables declaration//GEN-END:variables
}