
package restaurante.Vistas;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import restaurante.AccesoDatos.ProductoData;
import restaurante.Entidades.Producto;


public class ListaDeProductos extends javax.swing.JInternalFrame {
    
    private DefaultTableModel modelo = new DefaultTableModel();
    ProductoData prod = new ProductoData();
    
    public boolean isCellEditable(int f, int c){
        return false;
    }

    /**
     * Creates new form ListaDeProductos
     */
    public ListaDeProductos() {
        initComponents();
        
        armarCabecera();
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
        jtfListPro = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtListarPro = new javax.swing.JTable();
        jbSalida = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setTitle("Menu De Los Productos ");

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jtfListPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfListProActionPerformed(evt);
            }
        });
        jtfListPro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfListProKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Eras Light ITC", 1, 12)); // NOI18N
        jLabel1.setText("Ingrese el Nombre del Producto");

        jtListarPro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtListarPro);

        jbSalida.setText("Salir");
        jbSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalidaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Eras Light ITC", 1, 18)); // NOI18N
        jLabel2.setText("Productos del menu");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtfListPro, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 236, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(268, 268, 268))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtfListPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(255, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfListProKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfListProKeyReleased
        // TODO add your handling code here:

        borrarFilas();
        for(Producto pro : prod.listarProductos()){
            
            if(pro.getNombreProducto().toUpperCase().startsWith(jtfListPro.getText().toUpperCase())){
                
                modelo.addRow(new Object[]{
                    pro.getCodigoProducto(),
                    pro.getNombreProducto(),
                    pro.getDescripcion(),
                    pro.getPrecio(),
                    pro.getStock()
                });
                
            }
        
        }

    }//GEN-LAST:event_jtfListProKeyReleased

    private void jbSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalidaActionPerformed
            // TODO add your handling code here:
        int eleccion = JOptionPane.showConfirmDialog(this, "¿Desea salir del Formulario?", "Confirmacion", JOptionPane.YES_NO_OPTION);
            if (eleccion== JOptionPane.YES_OPTION){
                dispose();
            }else if (eleccion== JOptionPane.NO_OPTION){
                JOptionPane.showConfirmDialog(null, "¿Desea seguir en el Formulario?", "Confirmacion", JOptionPane.CLOSED_OPTION);
            }
    }//GEN-LAST:event_jbSalidaActionPerformed

    private void jtfListProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfListProActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfListProActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbSalida;
    private javax.swing.JTable jtListarPro;
    private javax.swing.JTextField jtfListPro;
    // End of variables declaration//GEN-END:variables

    private void armarCabecera(){

        modelo.addColumn("Codigo Producto");
        modelo.addColumn("Nombre Producto");
        modelo.addColumn("Descripcion");
        modelo.addColumn("Precio");
        modelo.addColumn("Stock");
        jtListarPro.setModel(modelo);
    
    }
    private void borrarFilas(){
        
        int filas = jtListarPro.getRowCount()-1;
        for(int f = filas; f>=0;f--){
        
            modelo.removeRow(f);
        }
    }
}
