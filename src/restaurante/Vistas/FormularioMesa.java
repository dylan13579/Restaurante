
package restaurante.Vistas;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;
import restaurante.AccesoDatos.MesaData;
import restaurante.AccesoDatos.PedidoData;
import restaurante.Entidades.Mesa;
import restaurante.Entidades.Pedido;

public class FormularioMesa extends javax.swing.JInternalFrame {
    
    private MesaData md;
    private DefaultTableModel modelo1 = new DefaultTableModel();
    private DefaultTableModel modelo2 = new DefaultTableModel();
    private List<Mesa> listaM;
    private PedidoData pd;
    
    public FormularioMesa() {
        initComponents();
        
        SpinnerNumberModel num = new SpinnerNumberModel();
        num.setMinimum(0);
        jsNroMesa.setModel(num);//limitar spinner
        
        pd = new PedidoData();
        
        armarCabecera1();
        armarCabecera2();
        md=new MesaData();
        listaM = md.listarMesasdisponibles();
        armarTabla1();
        armarTabla2();
        
        desactivarCampos();
        jbGuardarMesa.setEnabled(false);
        jbLimpiar.setEnabled(false); 
       
        //jtfIdPedido.setEnabled(true);
        
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
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jsNroMesa = new javax.swing.JSpinner();
        jbBuscarMesa = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jtDescripMesa = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jrbActivaMesa = new javax.swing.JRadioButton();
        jbNuevaMesa = new javax.swing.JButton();
        jbGuardarMesa = new javax.swing.JButton();
        jbLimpiar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setTitle("Registro De Las Mesas");

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel2.setFont(new java.awt.Font("Eras Light ITC", 1, 14)); // NOI18N
        jLabel2.setText("Buscar Mesa Por idMesa");

        jLabel1.setFont(new java.awt.Font("Eras Light ITC", 1, 14)); // NOI18N
        jLabel1.setText("Mesas Libres");

        jbBuscarMesa.setText("Buscar");
        jbBuscarMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarMesaActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IdMesa", "NumeroMesa", "Descripcion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setFocusable(false);
        jTable1 = new javax.swing.JTable(){
            public boolean isCellEditable(int f, int c){
                return false;
            }
        };
        jTable1.getTableHeader().setResizingAllowed(false);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        jLabel3.setFont(new java.awt.Font("Eras Light ITC", 1, 14)); // NOI18N
        jLabel3.setText("Capacidad de la Mesa");

        jtDescripMesa.setSelectedTextColor(new java.awt.Color(0, 102, 102));
        jtDescripMesa.setSelectionColor(new java.awt.Color(0, 102, 102));
        jtDescripMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtDescripMesaActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Eras Light ITC", 1, 14)); // NOI18N
        jLabel5.setText("Mesas Reservadas");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "idmesa", "numeroMesa", "descripcion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.setFocusable(false);
        jTable2 = new javax.swing.JTable(){
            public boolean isCellEditable (int f, int c){
                return false;
            }
        };
        jTable2.getTableHeader().setResizingAllowed(false);
        jTable2.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTable2);

        jLabel4.setFont(new java.awt.Font("Eras Light ITC", 1, 14)); // NOI18N
        jLabel4.setText("Estado:");

        jrbActivaMesa.setFont(new java.awt.Font("Eras Light ITC", 1, 12)); // NOI18N
        jrbActivaMesa.setText("Reservada");
        jrbActivaMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbActivaMesaActionPerformed(evt);
            }
        });

        jbNuevaMesa.setText("Nueva");
        jbNuevaMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevaMesaActionPerformed(evt);
            }
        });

        jbGuardarMesa.setText("Guardar");
        jbGuardarMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarMesaActionPerformed(evt);
            }
        });

        jbLimpiar.setText("Eliminar");
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel2)
                        .addGap(166, 166, 166)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtDescripMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel3)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jsNroMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(30, 30, 30)
                                            .addComponent(jbBuscarMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(26, 26, 26))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jrbActivaMesa)
                                .addGap(85, 85, 85)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(385, 385, 385)
                        .addComponent(jLabel5)))
                .addContainerGap(52, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jbNuevaMesa)
                .addGap(86, 86, 86)
                .addComponent(jbGuardarMesa)
                .addGap(85, 85, 85)
                .addComponent(jbLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel1)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jsNroMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbBuscarMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtDescripMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jrbActivaMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbNuevaMesa)
                    .addComponent(jbGuardarMesa)
                    .addComponent(jbLimpiar)
                    .addComponent(jbSalir))
                .addContainerGap(270, Short.MAX_VALUE))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        // TODO add your handling code here:
        int eleccion = JOptionPane.showConfirmDialog(this, "¿Desea salir del Formulario?", "Confirmacion", JOptionPane.YES_NO_OPTION);
            if (eleccion== JOptionPane.YES_OPTION){
                dispose();
            }else if (eleccion== JOptionPane.NO_OPTION){
                JOptionPane.showConfirmDialog(null, "¿Desea seguir en el Formulario?", "Confirmacion", JOptionPane.CLOSED_OPTION);
            }
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbBuscarMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarMesaActionPerformed
        // TODO add your handling code here:

            try {
        
        int numeroMesa = (int) jsNroMesa.getValue();
        Mesa mesa = md.buscarMesaPorNum(numeroMesa);
                

        if (mesa != null) {
            jtDescripMesa.setText(mesa.getDescripcion());
            jrbActivaMesa.setSelected(mesa.isEstado());

            // Supongo que deseas establecer el número de mesa en el campo jtfIdPedido
            //jtfIdPedido.setText(String.valueOf(numeroMesa));

            activarCampos();

            jbNuevaMesa.setEnabled(false);
            jbGuardarMesa.setEnabled(true);
            jbLimpiar.setEnabled(true);

            //JOptionPane.showMessageDialog(null, "Mesa Encontrada");
        } else {
           
            limpiar();
            activarCampos();
            desactivarCampos();
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Debe ingresar un número de mesa válido.");
        limpiar();
        desactivarCampos();
    }
     
    }//GEN-LAST:event_jbBuscarMesaActionPerformed

    private void jbNuevaMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevaMesaActionPerformed
        // TODO add your handling code here:

        activarCampos();
        limpiar();
        jbNuevaMesa.setEnabled(false);
        jbLimpiar.setEnabled(false);
        jbGuardarMesa.setEnabled(true);
      
        
    }//GEN-LAST:event_jbNuevaMesaActionPerformed

    private void jbGuardarMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarMesaActionPerformed
        // TODO add your handling code here:

        try{
            int numeroMesa=(int) jsNroMesa.getValue();
            String descripcion=jtDescripMesa.getText();
            boolean estado=jrbActivaMesa.isSelected();
           
            
            if(!estado){
                estado = false;
            }
            if(!descripcion.isEmpty()){
               Mesa mesa=md.buscarMesaPorNum(numeroMesa);
            
               if(mesa == null){
                
                    mesa=new Mesa(numeroMesa, descripcion, estado);
                    md.guardarMesa(mesa);
                    
                    limpiar();
                    desactivarCampos();
                    
                    jbLimpiar.setEnabled(false);
                    jbGuardarMesa.setEnabled(false);
                    jbNuevaMesa.setEnabled(true);
                    
                  }else{
                   mesa.setDescripcion(descripcion);
                   mesa.setEstado(estado);
                   md.modificarMesa(mesa);
                
                    limpiar();
                    desactivarCampos();
                
                    jbLimpiar.setEnabled(false);
                    jbGuardarMesa.setEnabled(false);
                    jbNuevaMesa.setEnabled(true);
                  }
                  
                 
                  borrarFilas1();
                  borrarFilas2();
                  armarTabla1();
                  armarTabla2();
                  
                  
                  
            }else{
                JOptionPane.showMessageDialog(null, "No puede ingresar numeros");
            }
        
        }catch(NumberFormatException m){
            JOptionPane.showMessageDialog(this, "No puede dejar campos vacios");
        }

    }//GEN-LAST:event_jbGuardarMesaActionPerformed

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        // TODO add your handling code here:

        try{
            int numeroMesa=(int) jsNroMesa.getValue();
            Mesa mesa=md.buscarMesaPorNum(numeroMesa);
            
            
            if(mesa !=null){
                
                jtDescripMesa.setText(mesa.getDescripcion());
                jrbActivaMesa.setSelected(mesa.isEstado());
            
                
                activarCampos();
                
                md.darBajaMesaId(numeroMesa);
                limpiar();
            desactivarCampos();
            }
            
            jbNuevaMesa.setEnabled(true);
            jbGuardarMesa.setEnabled(false);
            jbLimpiar.setEnabled(false); 
            borrarFilas1();
            borrarFilas2();
            armarTabla1();
            armarTabla2();
        
        }catch(NumberFormatException m){
             
        }

    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jtDescripMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtDescripMesaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtDescripMesaActionPerformed

    private void jrbActivaMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbActivaMesaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbActivaMesaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JButton jbBuscarMesa;
    private javax.swing.JButton jbGuardarMesa;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JButton jbNuevaMesa;
    private javax.swing.JButton jbSalir;
    private javax.swing.JRadioButton jrbActivaMesa;
    private javax.swing.JSpinner jsNroMesa;
    private javax.swing.JTextField jtDescripMesa;
    // End of variables declaration//GEN-END:variables


    private void desactivarCampos(){        
        jtDescripMesa.setEnabled(false);
        jrbActivaMesa.setEnabled(false);
        //jtfIdPedido.setEnabled(false);
    } 
    
    private void activarCampos(){
        jsNroMesa.setEnabled(true);
        jtDescripMesa.setEnabled(true);
        jrbActivaMesa.setEnabled(true);
        //jtfIdPedido.setEnabled(true);
    }
    
    private void limpiar(){
        
        jtDescripMesa.setText("");
        jrbActivaMesa.setSelected(false);
        //jtfIdPedido.setText("");
    }
    
    private void armarCabecera1(){

        modelo1.addColumn("idMesa");
        modelo1.addColumn("NumeroMesa ");
        modelo1.addColumn("Descripcion");
        
        jTable1.setModel(modelo1);
        
    }
    private void borrarFilas1(){
        
        int filas = jTable1.getRowCount()-1;
        for(int f = filas; f>=0;f--){
        
            modelo1.removeRow(f);
        }
    }
    
    private void armarTabla1(){
        
        List<Mesa> listarM = md.listarMesasdisponibles();
         
        for(Mesa mesa : listarM){

            modelo1.addRow(new Object[]{
            mesa.getIdMesa(),
            mesa.getNumeroMesa(),
            mesa.getDescripcion()
            });
        }
               
    }
    
    private void armarCabecera2(){
        modelo2.addColumn("idMesa");
        modelo2.addColumn("NumeroMesa ");
        modelo2.addColumn("Descripcion");
        
        jTable2.setModel(modelo2);
        
    }
    
    private void borrarFilas2(){
        
        int filas = jTable2.getRowCount()-1;
        for(int f = filas; f>=0;f--){
        
            modelo2.removeRow(f);
        }
    }
    
    private void armarTabla2(){
        
        List<Mesa> listarM = md.listarMesasNodisponibles();
         
        for(Mesa mesa : listarM){

            modelo2.addRow(new Object[]{
            mesa.getIdMesa(),
            mesa.getNumeroMesa(),
            mesa.getDescripcion()
            });
        }
               
    }
    
}
