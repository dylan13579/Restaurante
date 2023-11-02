
package restaurante.Vistas;


import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import restaurante.AccesoDatos.PedidoData;
import restaurante.Entidades.Pedido;



public class FormularioListarIngresos extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo;
    
    private PedidoData pd;
    
    public FormularioListarIngresos() {
        initComponents();
        modelo = new DefaultTableModel();
       
        pd = new PedidoData();
        
        armarCabecera();
        
        
        
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTablaFechas = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jbBuscarFecha = new javax.swing.JToggleButton();
        jdcFechas = new com.toedter.calendar.JDateChooser();

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Eras Light ITC", 1, 14)); // NOI18N
        jLabel1.setText("Consulta de Ingresos");

        jLabel2.setFont(new java.awt.Font("Eras Light ITC", 1, 14)); // NOI18N
        jLabel2.setText("Seleccionar Fecha:");

        jtTablaFechas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                "Title 1"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtTablaFechas);

        jButton1.setFont(new java.awt.Font("Eras Light ITC", 1, 14)); // NOI18N
        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jbBuscarFecha.setText("buscar");
        jbBuscarFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarFechaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(221, 221, 221))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(jdcFechas, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81)
                        .addComponent(jbBuscarFecha))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(228, 228, 228)
                        .addComponent(jLabel1)))
                .addContainerGap(108, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jdcFechas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jbBuscarFecha))
                .addContainerGap(199, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int eleccion = JOptionPane.showConfirmDialog(this, "Realmente desea salir?", "Confirmacion", JOptionPane.YES_NO_OPTION);
            if (eleccion== JOptionPane.YES_OPTION){
                dispose();
            }else if (eleccion== JOptionPane.NO_OPTION){
                JOptionPane.showConfirmDialog(null, "Desea seguir trabajando?", "Confirmacion", JOptionPane.CLOSED_OPTION);
            }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jbBuscarFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarFechaActionPerformed
        
        LocalDate fechaSeleccionada = jdcFechas.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        List<Pedido> pedidos = pd.buscarFechas(fechaSeleccionada);
        llenarTabla(pedidos);
    }//GEN-LAST:event_jbBuscarFechaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jbBuscarFecha;
    private com.toedter.calendar.JDateChooser jdcFechas;
    private javax.swing.JTable jtTablaFechas;
    // End of variables declaration//GEN-END:variables



    
    private void armarCabecera(){
    ArrayList<Object> fCabecera = new ArrayList<>();
    fCabecera.add("Mesero");
    fCabecera.add("Fecha");        
    fCabecera.add("Hora");
    fCabecera.add("Importe");
    fCabecera.add("Cobrada");
    
    modelo = new DefaultTableModel(); // Crear un nuevo DefaultTableModel
    for(Object it : fCabecera){
        modelo.addColumn(it);
    }
    jtTablaFechas.setModel(modelo);
}

private void llenarTabla(List<Pedido> pedidos) {
        modelo.setRowCount(0); // Limpiar la tabla
        for (Pedido pedido : pedidos) {
            modelo.addRow(new Object[]{
                pedido.getNombreMesero(),
                pedido.getFecha(),
                pedido.getHora(),
                pedido.getImporte(),
                pedido.isCobrada()
            });
        }
    }


}
