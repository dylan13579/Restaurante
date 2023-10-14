
package restaurante.Vistas;

import java.awt.Color;
import javax.swing.JOptionPane;
import restaurante.AccesoDatos.PedidoData;
import restaurante.AccesoDatos.ProductoData;
import restaurante.Entidades.Pedido;
import restaurante.Entidades.Producto;


public class FormularioProducto extends javax.swing.JInternalFrame {
    
    private ProductoData ad;


    public FormularioProducto() {
        initComponents();
        
        ad=new ProductoData();
        desactivarCampos();
        jbEliminar.setEnabled(false);
        jbModificar.setEnabled(false);
        jbNuevo.setEnabled(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtProducto = new javax.swing.JTextField();
        jbBuscar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtDescProducto = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jbEliminar = new javax.swing.JButton();
        jbModificar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jtPrecio = new javax.swing.JTextField();
        jtNombreProducto = new javax.swing.JTextField();
        jrbEstadoProd = new javax.swing.JRadioButton();
        jbNuevo = new javax.swing.JButton();

        jLabel1.setText("Productos - Menu");

        jLabel2.setText("Codigo de Producto:");

        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jLabel3.setText("Nombre: del Producto");

        jLabel4.setText("Descripcion del Producto:");

        jLabel6.setText("Estado:");

        jbEliminar.setText("Eliminar");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jbModificar.setText("Modificar");
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jLabel7.setText("Precio:");

        jrbEstadoProd.setText("Activo");

        jbNuevo.setText("Nuevo");
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(187, 187, 187)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jtNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jtDescProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jrbEstadoProd)
                                            .addComponent(jtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(244, 244, 244)))))
                        .addGap(0, 56, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jbNuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbEliminar)
                        .addGap(62, 62, 62)
                        .addComponent(jbModificar)
                        .addGap(71, 71, 71)
                        .addComponent(jbSalir)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jbBuscar)
                    .addComponent(jtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtDescProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(66, 66, 66)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jrbEstadoProd)))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbEliminar)
                    .addComponent(jbModificar)
                    .addComponent(jbSalir)
                    .addComponent(jbNuevo))
                .addContainerGap(113, Short.MAX_VALUE))
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

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        // TODO add your handling code here:

        try{
            int codigoProducto=Integer.parseInt(jtProducto.getText());
            Producto pedi=ad.buscarProductos(codigoProducto);
            if(pedi !=null){
                String nombre=pedi.getNombreProducto();
                String descripcion=pedi.getDescripcion();
                  jtNombreProducto.setText(nombre);
                  jtDescProducto.setText(descripcion);
                
                double precio=pedi.getPrecio();
                   jtPrecio.setText(String.valueOf(precio));
                
               
                jrbEstadoProd.setSelected(pedi.isEstado());
                   
                
                activarCampos();
                jbNuevo.setEnabled(false);
                jbEliminar.setEnabled(true);
                jbModificar.setEnabled(true);
                
            }else{
                jbNuevo.setEnabled(true);
                 limpiar();
            }
        
   
        } catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Ingresar codigo de producto");
            jtProducto.requestFocus();
            limpiar();
            desactivarCampos();           
        
        }
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        // TODO add your handling code here:

        try{
            
            int codigoProducto = Integer.parseInt(jtProducto.getText());
            Producto producto=ad.buscarProductos(codigoProducto);
            if (producto !=null){
            
                jtProducto.setText(String.valueOf(producto.getCodigoProducto()));
                jtNombreProducto.setText(producto.getNombreProducto());
                jtDescProducto.setText(producto.getDescripcion());
                jtPrecio.setText(String.valueOf(producto.getPrecio()));
                jrbEstadoProd.setText(String.valueOf(producto.isEstado()));
                
                ad.darDebajaProducto(codigoProducto);
                
                
            }
        limpiar();
        desactivarCampos();
        jbEliminar.setEnabled(false);
        jbModificar.setEnabled(false);
        
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Numero de producto invalido");
            limpiar();
            desactivarCampos();
            jbNuevo.setEnabled(true);
        
        }
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        // TODO add your handling code here:
        
     try {
        int codigoProducto = Integer.parseInt(jtProducto.getText());
        Producto producto = ad.buscarProductos(codigoProducto);

        if (producto != null) {
            String nombreP = jtNombreProducto.getText(); 
            String descripcion = jtDescProducto.getText();
            String precioStr = jtPrecio.getText();
            boolean estado = jrbEstadoProd.isSelected();

          
            if (!nombreP.isEmpty() && !descripcion.isEmpty() && nombreP.matches("^[a-zA-Z ]+$") && descripcion.matches("^[a-zA-Z ]+$")) {
                try {
                    double precio = Double.parseDouble(precioStr);
                    
                    if (precio > 0){
                        producto.setNombreProducto(nombreP);
                        producto.setDescripcion(descripcion);
                        producto.setPrecio(precio);
                        producto.setEstado(estado);

                        ad.modificarProducto(producto);

                        limpiar();
                        desactivarCampos();
                       
                        jbModificar.setEnabled(false);
                        jbEliminar.setEnabled(false);
                        
                    } 
                     
                    
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(this, "Error precio y stock deben solo peuden ingresar numeros");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Error en nombre y descripcion solo puede ingresar caracteres o no puede dejar campos vacios");
            }
        }
         
    } catch (NumberFormatException a) {
        JOptionPane.showMessageDialog(this, "Ingresar un código de producto válido.");
    }
        
    }//GEN-LAST:event_jbModificarActionPerformed

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        // TODO add your handling code here:
        activarCampos();
         jtProducto.requestFocus();
        jtNombreProducto.setText("");
        jtDescProducto.setText("");
        jtPrecio.setText("");
        jrbEstadoProd.setSelected(false);
        jbEliminar.setEnabled(false);
        jbModificar.setEnabled(false);
        jbNuevo.setEnabled(false);
         
         
        
    }//GEN-LAST:event_jbNuevoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbSalir;
    private javax.swing.JRadioButton jrbEstadoProd;
    private javax.swing.JTextField jtDescProducto;
    private javax.swing.JTextField jtNombreProducto;
    private javax.swing.JTextField jtPrecio;
    private javax.swing.JTextField jtProducto;
    // End of variables declaration//GEN-END:variables

private void desactivarCampos(){
        jtNombreProducto.setEnabled(false);
        jtDescProducto.setEnabled(false);
        jtPrecio.setEnabled(false);
        jrbEstadoProd.setEnabled(false);
}

private void activarCampos (){
        jtNombreProducto.setEnabled(true);
        jtDescProducto.setEnabled(true);
        jtPrecio.setEnabled(true);
        jrbEstadoProd.setEnabled(true);
    }

public void limpiar(){
        jtProducto.setText("");
        jtNombreProducto.setText("");
        jtDescProducto.setText("");
        jtPrecio.setText("");
        jrbEstadoProd.setSelected(false);
                       
}    
}
