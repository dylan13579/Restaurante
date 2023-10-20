
package restaurante.Vistas;

import java.awt.Color;
import javax.swing.JOptionPane;
import restaurante.AccesoDatos.PedidoData;
import restaurante.AccesoDatos.ProductoData;
import restaurante.Entidades.Pedido;
import restaurante.Entidades.Producto;


public class FormularioProducto extends javax.swing.JInternalFrame {
    
    private ProductoData pd;


    public FormularioProducto() {
        initComponents();
        
        pd=new ProductoData();
        desactivarCampos();
        jbEliminar.setEnabled(false);
        jbModificar.setEnabled(false);
        jbNuevo.setEnabled(false);
        jbGuardar.setEnabled(false);
        
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
        jbBuscar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtDescProducto = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jbEliminar = new javax.swing.JButton();
        jbModificar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jtNombreProducto = new javax.swing.JTextField();
        jrbEstadoProd = new javax.swing.JRadioButton();
        jbNuevo = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jsProducto = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        jtPrecio = new javax.swing.JTextField();
        jsStock = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();

        jLabel2.setFont(new java.awt.Font("Eras Light ITC", 1, 14)); // NOI18N
        jLabel2.setText("Codigo de Producto");

        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Eras Light ITC", 1, 14)); // NOI18N
        jLabel3.setText("Nombre del Producto");

        jLabel4.setFont(new java.awt.Font("Eras Light ITC", 1, 14)); // NOI18N
        jLabel4.setText("Descripcion del Producto");

        jLabel6.setFont(new java.awt.Font("Eras Light ITC", 1, 14)); // NOI18N
        jLabel6.setText("Estado");

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

        jLabel7.setFont(new java.awt.Font("Eras Light ITC", 1, 14)); // NOI18N
        jLabel7.setText("Precio");

        jrbEstadoProd.setFont(new java.awt.Font("Eras Light ITC", 1, 12)); // NOI18N
        jrbEstadoProd.setText("Disponible");

        jbNuevo.setText("Nuevo");
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });

        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Eras Light ITC", 1, 14)); // NOI18N
        jLabel5.setText("$");

        jLabel1.setText("Stock");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jbNuevo)
                .addGap(18, 18, 18)
                .addComponent(jbGuardar)
                .addGap(18, 18, 18)
                .addComponent(jbModificar)
                .addGap(18, 18, 18)
                .addComponent(jbEliminar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jbSalir)
                .addGap(34, 34, 34))
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jsProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(jbBuscar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jtNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(jrbEstadoProd))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jtDescProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jsStock, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 87, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jbBuscar)
                    .addComponent(jsProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtDescProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jsStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jrbEstadoProd))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbModificar)
                    .addComponent(jbNuevo)
                    .addComponent(jbEliminar)
                    .addComponent(jbGuardar))
                .addGap(18, 18, 18)
                .addComponent(jbSalir)
                .addContainerGap(34, Short.MAX_VALUE))
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
            int codigoProducto=(int) jsProducto.getValue();
            Producto pedi=pd.buscarProductos(codigoProducto);
            if(pedi != null){
                String nombre=pedi.getNombreProducto();
                String descripcion=pedi.getDescripcion();
                
                  jtNombreProducto.setText(nombre);
                  jtDescProducto.setText(descripcion);
                  jrbEstadoProd.setSelected(pedi.isEstado());
          
                  double precio=pedi.getPrecio();
                  int stock = pedi.getStock();
                  jtPrecio.setText(String.valueOf(precio));
                  jsStock.setValue(stock);
                
               
                 activarCampos();
                 jbNuevo.setEnabled(false);
                 jbEliminar.setEnabled(true);
                 jbGuardar.setEnabled(true);
                
                JOptionPane.showMessageDialog(null, "Producto Encontrado");
            }else{
               
                 limpiar();
            }
        
   
        } catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Ingresar codigo de producto");
            limpiar();
            desactivarCampos();           
        
        }
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        // TODO add your handling code here:
//
//        try{
//            
//            int codigoProducto = Integer.parseInt(jtProducto.getText());
//            Producto producto=ad.buscarProductos(codigoProducto);
//            if (producto !=null){
//            
//                jtProducto.setText(String.valueOf(producto.getCodigoProducto()));
//                jtNombreProducto.setText(producto.getNombreProducto());
//                jtDescProducto.setText(producto.getDescripcion());
//                jtPrecio.setText(String.valueOf(producto.getPrecio()));
//                jrbEstadoProd.setText(String.valueOf(producto.isEstado()));
//                
//                ad.darDebajaProducto(codigoProducto);
//                
//                
//            }
//        limpiar();
//        desactivarCampos();
//        jbEliminar.setEnabled(false);
//        jbModificar.setEnabled(false);
//        
//        }catch(NumberFormatException e){
//            JOptionPane.showMessageDialog(null,"Numero de producto invalido");
//            limpiar();
//            desactivarCampos();
//            jbNuevo.setEnabled(true);
//        
//        }
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        // TODO add your handling code here:
        
//     try {
//        int codigoProducto = Integer.parseInt(jtProducto.getText());
//        Producto producto = ad.buscarProductos(codigoProducto);
//
//        if (producto != null) {
//            String nombreP = jtNombreProducto.getText(); 
//            String descripcion = jtDescProducto.getText();
//            String precioStr = jtPrecio.getText();
//            boolean estado = jrbEstadoProd.isSelected();
//
//          
//            if (!nombreP.isEmpty() && !descripcion.isEmpty() && nombreP.matches("^[a-zA-Z ]+$") && descripcion.matches("^[a-zA-Z ]+$")) {
//                try {
//                    double precio = Double.parseDouble(precioStr);
//                    
//                    if (precio > 0){
//                        producto.setNombreProducto(nombreP);
//                        producto.setDescripcion(descripcion);
//                        producto.setPrecio(precio);
//                        producto.setEstado(estado);
//
//                        ad.modificarProducto(producto);
//
//                        limpiar();
//                        desactivarCampos();
//                       
//                        jbModificar.setEnabled(false);
//                        jbEliminar.setEnabled(false);
//                        
//                    } 
//                     
//                    
//                } catch (NumberFormatException e) {
//                    JOptionPane.showMessageDialog(this, "Error precio y stock deben solo peuden ingresar numeros");
//                }
//            } else {
//                JOptionPane.showMessageDialog(this, "Error en nombre y descripcion solo puede ingresar caracteres o no puede dejar campos vacios");
//            }
//        }
//         
//    } catch (NumberFormatException a) {
//        JOptionPane.showMessageDialog(this, "Ingresar un código de producto válido.");
//    }
        
    }//GEN-LAST:event_jbModificarActionPerformed

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        // TODO add your handling code here:
        activarCampos();
        jrbEstadoProd.setSelected(false);
        jbEliminar.setEnabled(false);
        jbModificar.setEnabled(false);
        jbNuevo.setEnabled(false);
        jbGuardar.setEnabled(true);
         
         
        
    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        // TODO add your handling code here:
        
     try {
        int codigoProducto = (int) jsProducto.getValue();
        Producto producto = pd.buscarProductos(codigoProducto);

        String nombreP = jtNombreProducto.getText();
        String descripcion = jtDescProducto.getText();
        String precioP = jtPrecio.getText();
        int srockP =(int) jsStock.getValue();
        boolean estado = jrbEstadoProd.isSelected();

        if (!nombreP.isEmpty() && !descripcion.isEmpty() && nombreP.matches("^[a-zA-Z ]+$") && descripcion.matches("^[a-zA-Z ]+$")) {
            try {
                double precio = Double.parseDouble(precioP);

                if (precio > 0 ) {
                    if (producto == null) {
                        Producto prod = new Producto();
                        prod.setCodigoProducto(codigoProducto);
                        prod.setNombreProducto(nombreP);
                        prod.setDescripcion(descripcion);
                        prod.setPrecio(precio);
                        prod.setStock(srockP);
                        prod.setEstado(estado);
                        pd.guardarProducto(prod);
                    } else {
                        producto.setNombreProducto(nombreP);
                        producto.setDescripcion(descripcion);
                        producto.setPrecio(precio);
                        producto.setStock(srockP);
                        producto.setEstado(estado);
                        pd.modificarProducto(producto);
                    }

                    limpiar();
                    desactivarCampos();
                    jbNuevo.setEnabled(true);
                    jbGuardar.setEnabled(true);
                    jbModificar.setEnabled(false);
                    jbEliminar.setEnabled(false);
                } else {
                    JOptionPane.showMessageDialog(this, "El precio debe ser mayor que cero.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Error en el precio. Debe ingresar un número válido.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Error en el nombre y descripción. Solo se permiten caracteres o no puede dejar campos vacíos.");
        }
    } catch (NumberFormatException a) {
        JOptionPane.showMessageDialog(this, "Ingresar un código de producto válido.");
    }
        
    }//GEN-LAST:event_jbGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbSalir;
    private javax.swing.JRadioButton jrbEstadoProd;
    private javax.swing.JSpinner jsProducto;
    private javax.swing.JSpinner jsStock;
    private javax.swing.JTextField jtDescProducto;
    private javax.swing.JTextField jtNombreProducto;
    private javax.swing.JTextField jtPrecio;
    // End of variables declaration//GEN-END:variables

private void desactivarCampos(){
        jtNombreProducto.setEnabled(false);
        jtDescProducto.setEnabled(false);
        jtPrecio.setEnabled(false);
        jsStock.setEnabled(false);
        jrbEstadoProd.setEnabled(false);
}

private void activarCampos (){
        jtNombreProducto.setEnabled(true);
        jtDescProducto.setEnabled(true);
        jtPrecio.setEnabled(true);
        jsStock.setEnabled(true);
        jrbEstadoProd.setEnabled(true);
    }

public void limpiar(){
        
        jtNombreProducto.setText("");
        jtDescProducto.setText("");
        jtPrecio.setText("");
        jsStock.setEnabled(false);
        jrbEstadoProd.setSelected(false);
                       
}    
}
