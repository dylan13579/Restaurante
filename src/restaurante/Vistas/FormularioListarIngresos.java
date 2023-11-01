
package restaurante.Vistas;

import java.sql.Date;
import java.sql.Time;
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
       
        
        armarCabecera();
        armarCabecera();
        
        
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jdcSelectFecha = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTablaFechas = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Eras Light ITC", 1, 14)); // NOI18N
        jLabel1.setText("Consulta de Ingresos");

        jLabel2.setFont(new java.awt.Font("Eras Light ITC", 1, 14)); // NOI18N
        jLabel2.setText("Seleccionar Fecha:");

        jdcSelectFecha.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jdcSelectFechaPropertyChange(evt);
            }
        });

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
                        .addGap(206, 206, 206)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jdcSelectFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(108, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jdcSelectFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(211, Short.MAX_VALUE))
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int eleccion = JOptionPane.showConfirmDialog(this, "Realmente desea salir?", "Confirmacion", JOptionPane.YES_NO_OPTION);
            if (eleccion== JOptionPane.YES_OPTION){
                dispose();
            }else if (eleccion== JOptionPane.NO_OPTION){
                JOptionPane.showConfirmDialog(null, "Desea seguir trabajando?", "Confirmacion", JOptionPane.CLOSED_OPTION);
            }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jdcSelectFechaPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jdcSelectFechaPropertyChange
        // TODO add your handling code here:
            
            
        
    }//GEN-LAST:event_jdcSelectFechaPropertyChange


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jdcSelectFecha;
    private javax.swing.JTable jtTablaFechas;
    // End of variables declaration//GEN-END:variables


//    private void armarCabecera(){
//    
//        ArrayList<Object> fCabecera = new ArrayList<>();
//        
//        fCabecera.add("Mesero");
//        fCabecera.add("Fecha");        
//        fCabecera.add("Hora");
//        fCabecera.add("Importe");
//        fCabecera.add("Cobrada");
//        
//        for(Object it : fCabecera){
//        
//            modelo.addColumn(it);
//        }
//        jtTablaFechas.setModel(modelo);
//    
//    }
//    
//    private void Fecha() {
//        java.util.Date fechaSeleccionada = jdcSelectFecha.getDate();
//
//    List<Pedido> listaDeFechas = pd.buscarFechas(fechaSeleccionada.toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
//
//    while (modelo.getRowCount() > 0) {
//        modelo.removeRow(0);
//    }
//
//    for (Pedido pedido : listaDeFechas) {
//        modelo.addRow(new Object[] {
//            pedido.getNombreMesero(),
//            Date.from(pedido.getFecha().atStartOfDay(ZoneId.systemDefault()).toInstant()), // Convierte LocalDate a Date
//            Time.valueOf(pedido.getHora()), // Convertir LocalTime a Time
//            pedido.getImporte(),
//            pedido.isCobrada()
//        });
//    }
//}

    
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

private void Fecha() {
    if (pd == null) {
        pd = new PedidoData(); // Inicializar la instancia de PedidoData si no se ha hecho
    }
    
    java.util.Date fechaSeleccionada = jdcSelectFecha.getDate();

    List<Pedido> listaDeFechas = pd.buscarFechas(fechaSeleccionada.toInstant().atZone(ZoneId.systemDefault()).toLocalDate());

    while (modelo.getRowCount() > 0) {
        modelo.removeRow(0);
    }

    for (Pedido pedido : listaDeFechas) {
        modelo.addRow(new Object[] {
            pedido.getNombreMesero(),
            Date.from(pedido.getFecha().atStartOfDay(ZoneId.systemDefault()).toInstant()), // Convierte LocalDate a Date
            Time.valueOf(pedido.getHora()), // Convertir LocalTime a Time
            pedido.getImporte(),
            pedido.isCobrada()
        });
    }
}

}
