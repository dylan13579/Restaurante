
package restaurante.Vistas;

import javax.swing.JOptionPane;
import restaurante.AccesoDatos.MesaData;
import restaurante.Entidades.Mesa;

public class FormularioMesa extends javax.swing.JInternalFrame {
    
    private MesaData md;
    

    public FormularioMesa() {
        initComponents();
        
        md=new MesaData();
        
        desactivarCampos();
        jbGuardarMesa.setEnabled(false);
        jbLimpiar.setEnabled(false); 
        jbNuevaMesa.setEnabled(false);
        jbBuscarMesa.setEnabled(true);
       
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jbBuscarMesa = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jrbActivaMesa = new javax.swing.JRadioButton();
        jbNuevaMesa = new javax.swing.JButton();
        jbLimpiar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jtDescripMesa = new javax.swing.JTextField();
        jbGuardarMesa = new javax.swing.JButton();
        jsNroMesa = new javax.swing.JSpinner();

        setTitle("Registros de las Mesas");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel2.setText("Numero de Mesa:");

        jbBuscarMesa.setText("Buscar");
        jbBuscarMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarMesaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel3.setText("Descripcion:");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel4.setText("Estado:");

        jrbActivaMesa.setText("Reservada");

        jbNuevaMesa.setText("Nueva");
        jbNuevaMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevaMesaActionPerformed(evt);
            }
        });

        jbLimpiar.setText("Limpiar");
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

        jbGuardarMesa.setText("Guardar");
        jbGuardarMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarMesaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbNuevaMesa)
                        .addGap(109, 109, 109)
                        .addComponent(jbGuardarMesa)
                        .addGap(103, 103, 103)
                        .addComponent(jbLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(120, 120, 120)
                        .addComponent(jrbActivaMesa))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jsNroMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54)
                                .addComponent(jbBuscarMesa))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jtDescripMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(77, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jsNroMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBuscarMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtDescripMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jrbActivaMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbNuevaMesa)
                    .addComponent(jbLimpiar)
                    .addComponent(jbGuardarMesa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(jbSalir)
                .addGap(20, 20, 20))
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
      
        try{
             jsNroMesa.setEnabled(false);
                int numeroMesa=(int) jsNroMesa.getValue();
                Mesa mesa=md.buscarMesaPorNum(numeroMesa);
                if(mesa != null){
                    jtDescripMesa.setText(mesa.getDescripcion());
                    jrbActivaMesa.setSelected(mesa.isEstado());
                    
                            
                   activarCampos();
                
                  jbNuevaMesa.setEnabled(false);
                  jbGuardarMesa.setEnabled(true);
                  jbLimpiar.setEnabled(true);
                
                  JOptionPane.showMessageDialog(null, "Mesa Encontrada");
                }else{
                    jbNuevaMesa.setEnabled(true);
                    limpiar();
                    activarCampos();
                    desactivarCampos();                             
                }
                            
        }catch(NumberFormatException m){
            JOptionPane.showMessageDialog(this, "Debe Ingresar un Numero de Mesa Valido");
            
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
        jbBuscarMesa.setEnabled(false);
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
            if(!descripcion.isEmpty() && descripcion.matches("^[a-zA-Z ]+$")){
               Mesa mesa=md.buscarMesaPorNum(numeroMesa);
            
               if(mesa == null){
                
                    mesa=new Mesa(numeroMesa, descripcion, estado);
                    md.guardarMesa(mesa);
                  }else{
                   mesa.setDescripcion(descripcion);
                   mesa.setEstado(estado);
                   md.modificarMesa(mesa);
                
                    limpiar();
                    desactivarCampos();
                
                    jbLimpiar.setEnabled(false);            
                  }
                  jbNuevaMesa.setEnabled(false);
                  jbGuardarMesa.setEnabled(false);
            
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
                
                md.darBajaMesaNumero(numeroMesa);  
            }
            
            limpiar();
            desactivarCampos();
            jbGuardarMesa.setEnabled(false);
            jbLimpiar.setEnabled(false);            
        
        }catch(NumberFormatException m){
            JOptionPane.showMessageDialog(this, "Numero de mesa invalido");       
        }

    }//GEN-LAST:event_jbLimpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
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
    } 
    
    private void activarCampos(){
        jsNroMesa.setEnabled(true);
        jtDescripMesa.setEnabled(true);
        jrbActivaMesa.setEnabled(true);
    }
    
    private void limpiar(){
        
        jtDescripMesa.setText("");
        jrbActivaMesa.setSelected(false);
    }
    
    
}
