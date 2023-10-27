
package restaurante.Vistas;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import restaurante.AccesoDatos.MesaData;
import restaurante.AccesoDatos.PedidoData;
import restaurante.Entidades.Mesa;
import restaurante.Entidades.Pedido;


public class FormularioListarPedidos extends javax.swing.JInternalFrame {

    private List<Pedido> listaP;
    private List<Pedido> listaM;
    private MesaData mData;
    private PedidoData pData;
    private DefaultTableModel modelo;
    
 
    /**
     * Creates new form FormularioListarPedidos
     */
    public FormularioListarPedidos() {
        initComponents();
        
        
        modelo = new DefaultTableModel();
        pData = new PedidoData();
        listaP = pData.listasMeseros();
        mData = new MesaData();
        
        
        
        
        
        armarTabla(); 
        armarCabecera();
        jcbMesero.setSelectedIndex(-1);
       
        
        jbCobrar.setEnabled(false);
        jbAnular.setEnabled(false);
        jbLimpiar.setEnabled(false);
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgListarPedido = new javax.swing.ButtonGroup();
        jbSalir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtPedidoMesero = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jrbCobrado = new javax.swing.JRadioButton();
        jrbNoCobrado = new javax.swing.JRadioButton();
        jcbMesero = new javax.swing.JComboBox<>();
        jbLimpiar = new javax.swing.JButton();
        jbCobrar = new javax.swing.JButton();
        jbAnular = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jLabel2.setText("Seleccionar Nombre de Mesero:");

        jtPedidoMesero.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtPedidoMesero);

        jLabel3.setText("Listar Pedido por Mesero ");

        bgListarPedido.add(jrbCobrado);
        jrbCobrado.setText("Cobrado");
        jrbCobrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbCobradoActionPerformed(evt);
            }
        });

        bgListarPedido.add(jrbNoCobrado);
        jrbNoCobrado.setText("Pendiente");
        jrbNoCobrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbNoCobradoActionPerformed(evt);
            }
        });

        jbLimpiar.setText("Limpiar");

        jbCobrar.setText("Cobrar");
        jbCobrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCobrarActionPerformed(evt);
            }
        });

        jbAnular.setText("Anular Cobro");

        jLabel1.setText("Listar pedidos por Meseros");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 686, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbCobrar)
                        .addGap(116, 116, 116)
                        .addComponent(jbAnular)
                        .addGap(121, 121, 121)
                        .addComponent(jbLimpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbSalir))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jcbMesero, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(199, 199, 199)
                .addComponent(jrbCobrado)
                .addGap(78, 78, 78)
                .addComponent(jrbNoCobrado)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(244, 244, 244))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcbMesero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(jLabel3)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbCobrado)
                    .addComponent(jrbNoCobrado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSalir)
                    .addComponent(jbLimpiar)
                    .addComponent(jbCobrar)
                    .addComponent(jbAnular))
                .addGap(51, 51, 51))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        // TODO add your handling code here:
        int eleccion = JOptionPane.showConfirmDialog(this, "Realmente desea salir?", "Confirmacion", JOptionPane.YES_NO_OPTION);
            if (eleccion== JOptionPane.YES_OPTION){
                dispose();
            }else if (eleccion== JOptionPane.NO_OPTION){
                JOptionPane.showConfirmDialog(null, "Desea seguir trabajando?", "Confirmacion", JOptionPane.CLOSED_OPTION);
            }
        
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jrbCobradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbCobradoActionPerformed
        // TODO add your handling code here:

        borrarFilasTabla();
        jrbNoCobrado.setSelected(false);
        
        pedidosYACobrados();
        jbAnular.setSelected(true);
        jbCobrar.setSelected(false);
        jbLimpiar.setSelected(true);
        
    }//GEN-LAST:event_jrbCobradoActionPerformed

    private void jrbNoCobradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbNoCobradoActionPerformed
        // TODO add your handling code here:

        borrarFilasTabla();
        jrbCobrado.setSelected(false);
        
        pedidosNoCobrados();
        jbAnular.setSelected(false);
        jbCobrar.setSelected(true);
        jbLimpiar.setSelected(true);
    }//GEN-LAST:event_jrbNoCobradoActionPerformed

    private void jbCobrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCobrarActionPerformed
        // TODO add your handling code here:

      
    }//GEN-LAST:event_jbCobrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgListarPedido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAnular;
    private javax.swing.JButton jbCobrar;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Pedido> jcbMesero;
    private javax.swing.JRadioButton jrbCobrado;
    private javax.swing.JRadioButton jrbNoCobrado;
    private javax.swing.JTable jtPedidoMesero;
    // End of variables declaration//GEN-END:variables

  
    private void armarTabla(){
        
        for (Pedido meseros : listaP) {
            jcbMesero.addItem(meseros);
        }
    }
    
    private void armarCabecera(){
    
        ArrayList<Object> fCabecera = new ArrayList<>();
        
        fCabecera.add("Mesa");
        fCabecera.add("Mesero");
        fCabecera.add("Fecha");        
        fCabecera.add("Hora");
        fCabecera.add("Importe");
        fCabecera.add("Cobrada");
        
        for(Object it : fCabecera){
        
            modelo.addColumn(it);
        }
        jtPedidoMesero.setModel(modelo);
    
    }
    
    private void borrarFilasTabla(){
        int lineas = modelo.getRowCount() - 1;
        
        for(int i = lineas; i >= 0 ; i--){
            modelo.removeRow(i);
        }
    }
    
   public void pedidosYACobrados(){
       
      Pedido meseroSeleccionado = (Pedido) jcbMesero.getSelectedItem();

    if (meseroSeleccionado != null) {

        borrarFilasTabla();


        List<Pedido> cobrados = pData.pedidoCobrados(meseroSeleccionado.getIdPedido());

        for (Pedido pedido : cobrados) {
            modelo.addRow(new Object[] {
                pedido.getIdPedido(),
                pedido.getNombreMesero(),
                pedido.getFecha(),
                pedido.getHora(),
                pedido.getImporte(),
                pedido.isCobrado()
            });
        }
    }
       
   }

     public void pedidosNoCobrados(){
        
         Pedido meseroSeleccionado = (Pedido) jcbMesero.getSelectedItem();
         
         if (meseroSeleccionado != null) {
             
              borrarFilasTabla();
              
              List<Pedido> nocobrados = pData.pedidoNoCobrados(meseroSeleccionado.getIdPedido());
              
               for (Pedido pedido : nocobrados) {
            modelo.addRow(new Object[] {
                pedido.getIdPedido(),
                pedido.getNombreMesero(),
                pedido.getFecha(),
                pedido.getHora(),
                pedido.getImporte(),
                pedido.isCobrado()
            });
        }
             
         }
    }
    
}
