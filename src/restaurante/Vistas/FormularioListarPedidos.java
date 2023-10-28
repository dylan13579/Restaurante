
package restaurante.Vistas;


import java.util.ArrayList;

import java.util.List;

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
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtPedidoMesero = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jrbCobrado = new javax.swing.JRadioButton();
        jrbNoCobrado = new javax.swing.JRadioButton();
        jcbMesero = new javax.swing.JComboBox<>();

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

        jLabel1.setText("Listar pedidos por Meseros");

        bgListarPedido.add(jrbCobrado);
        jrbCobrado.setText("pagados");
        jrbCobrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbCobradoActionPerformed(evt);
            }
        });

        bgListarPedido.add(jrbNoCobrado);
        jrbNoCobrado.setText("pendientes");
        jrbNoCobrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbNoCobradoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(214, 214, 214)
                .addComponent(jrbCobrado)
                .addGap(63, 63, 63)
                .addComponent(jrbNoCobrado)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(244, 244, 244))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jcbMesero, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 677, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(151, Short.MAX_VALUE))
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgListarPedido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
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
                pedido.isCobrado()
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
                pedido.isCobrado()
            });
        }
             
         }
    }
    
     
}
