
package restaurante.Vistas;


import java.util.ArrayList;

import java.util.List;
import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;
import restaurante.AccesoDatos.MesaData;
import restaurante.AccesoDatos.PedidoData;

import restaurante.Entidades.Pedido;


public class FormularioListarPedidos extends javax.swing.JInternalFrame {

    private List<Pedido> listaP;
    private List<Pedido> listaM;
    private MesaData mData;
    private PedidoData pData;
    private DefaultTableModel modelo;
    
    private Pedido elegirMesero;
    
 
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
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jcbMesero = new javax.swing.JComboBox<>();
        jrbCobrado = new javax.swing.JRadioButton();
        jrbNoCobrado = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtPedidoMesero = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setTitle("Lista de Pedidos Pedientes Por Meseros");

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel2.setFont(new java.awt.Font("Eras Light ITC", 1, 18)); // NOI18N
        jLabel2.setText("Seleccionar Nombre de Mesero");

        bgListarPedido.add(jrbCobrado);
        jrbCobrado.setFont(new java.awt.Font("Eras Light ITC", 1, 14)); // NOI18N
        jrbCobrado.setText("Pagados");
        jrbCobrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbCobradoActionPerformed(evt);
            }
        });

        bgListarPedido.add(jrbNoCobrado);
        jrbNoCobrado.setFont(new java.awt.Font("Eras Light ITC", 1, 14)); // NOI18N
        jrbNoCobrado.setText("Pendientes");
        jrbNoCobrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbNoCobradoActionPerformed(evt);
            }
        });

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

        jLabel1.setFont(new java.awt.Font("Eras Light ITC", 1, 12)); // NOI18N
        jLabel1.setText("Seleccione el estado del pedido a listar:");

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(24, 24, 24)
                            .addComponent(jrbCobrado)
                            .addGap(44, 44, 44)
                            .addComponent(jrbNoCobrado)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(21, 21, 21)
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jcbMesero, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(316, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(327, 327, 327))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcbMesero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbCobrado)
                    .addComponent(jrbNoCobrado)
                    .addComponent(jLabel1))
                .addGap(41, 41, 41)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(373, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jrbCobradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbCobradoActionPerformed
        // TODO add your handling code here:
        jrbNoCobrado.setSelected(false);
        borrarFilasTabla();
        pagados();
        
    }//GEN-LAST:event_jrbCobradoActionPerformed

    private void jrbNoCobradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbNoCobradoActionPerformed
        // TODO add your handling code here:
        
        jrbCobrado.setSelected(false);
        borrarFilasTabla();
        noPagados();
    }//GEN-LAST:event_jrbNoCobradoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int eleccion = JOptionPane.showConfirmDialog(this, "¿Desea salir del Formulario?", "Confirmacion", JOptionPane.YES_NO_OPTION);
            if (eleccion== JOptionPane.YES_OPTION){
                dispose();
            }else if (eleccion== JOptionPane.NO_OPTION){
                JOptionPane.showConfirmDialog(null, "¿Desea seguir en el Formulario?", "Confirmacion", JOptionPane.CLOSED_OPTION);
            } 
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgListarPedido;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
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
        
        fCabecera.add("idPedido");
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
    
   private void pagados(){
       
      Pedido meseroSeleccionado = (Pedido) jcbMesero.getSelectedItem();

    if (meseroSeleccionado != null) {

        borrarFilasTabla();


        List<Pedido> cobrados = pData.pedidoCobrados(meseroSeleccionado.getNombreMesero());

        for (Pedido pedido : cobrados) {
            modelo.addRow(new Object[] {
                pedido.getIdPedido(),
                pedido.getNombreMesero(),
                pedido.getFecha(),
                pedido.getHora(),
                pedido.getImporte(),
                pedido.isCobrada()
            });
        }
    }
       
   }

     private void noPagados(){
        
         Pedido meseroSeleccionado = (Pedido) jcbMesero.getSelectedItem();
         
         if (meseroSeleccionado != null) {
             
              borrarFilasTabla();
              
              List<Pedido> nocobrados = pData.pedidoNoCobrados(meseroSeleccionado.getNombreMesero());
              
               for (Pedido pedido : nocobrados) {
            modelo.addRow(new Object[] {
                pedido.getIdPedido(),
                pedido.getNombreMesero(),
                pedido.getFecha(),
                pedido.getHora(),
                pedido.getImporte(),
                pedido.isCobrada()
            });
        }
             
         }
    }
    
     
}
