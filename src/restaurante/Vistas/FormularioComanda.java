
package restaurante.Vistas;

import java.sql.Date;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;
import restaurante.AccesoDatos.MesaData;
import restaurante.AccesoDatos.PedidoData;
import restaurante.AccesoDatos.PedidoProductoData;
import restaurante.AccesoDatos.ProductoData;
import restaurante.Entidades.Mesa;
import restaurante.Entidades.Pedido;
import restaurante.Entidades.PedidoProducto;
import restaurante.Entidades.Producto;



public class FormularioComanda extends javax.swing.JInternalFrame {
    
    //Date fechaActual = new Date();
    //String fechaFormato = new SimpleDateFormat("yyyy-MM-dd").format(fechaActual);     
        
    private List<Mesa> listarM;    
    
    private MesaData meData;
    
    private PedidoData pd;
    
    private ProductoData prd;
    
    private Pedido ped;
    
    private Producto pro;
    
    private Mesa mesA;
    
    
    int item;
    double Totalpagar = 0.00;
    
    private DefaultTableModel modelo = new DefaultTableModel();
    ProductoData prod = new ProductoData();    
    private double importeTotal;
    
    
    public boolean isCellEditable(int f, int c){
        return false;
    }


    public FormularioComanda() {
        initComponents();
        //armarCabecera();
 
        pd = new PedidoData();
        meData = new MesaData();
        listarM = meData.listarMesasdisponibles();
               
        //jbGuardarRes.setEnabled(true);
        
        
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
        jLabel3 = new javax.swing.JLabel();
        btnAddPlato = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableMenu = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        totalMenu = new javax.swing.JLabel();
        btnEliminarTempPlato = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblTemPlatos = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtComentario = new javax.swing.JTextPane();
        jLabel9 = new javax.swing.JLabel();
        jbComentario = new javax.swing.JButton();
        jtMesero = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nuevaFecha = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        nuevaHora = new com.toedter.calendar.JDateChooser();
        jbGuardarRes = new javax.swing.JButton();
        jbSalirRes = new javax.swing.JButton();
        lbBuscarPed = new javax.swing.JButton();
        txtBuscarPlato = new javax.swing.JTextField();
        jtNroPedido = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jtfId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setTitle("Registro de Ordenes Del Cliente");

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel3.setFont(new java.awt.Font("Eras Light ITC", 1, 12)); // NOI18N
        jLabel3.setText("Seleccione Producto del Menu");

        btnAddPlato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/nuevo.png"))); // NOI18N
        btnAddPlato.setText("      Agregar      ");
        btnAddPlato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPlatoActionPerformed(evt);
            }
        });

        tableMenu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod ", "Nombre Producto", "Cantidad", "Precio", "SubTotal", "Comentario"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tableMenu);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/cuenta.png"))); // NOI18N
        jLabel4.setText("Total Facturado");

        jLabel5.setFont(new java.awt.Font("Eras Light ITC", 1, 12)); // NOI18N
        jLabel5.setText("Nombre Mesero");

        totalMenu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        totalMenu.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        totalMenu.setText("00.00");

        btnEliminarTempPlato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/eliminar.png"))); // NOI18N
        btnEliminarTempPlato.setText("    Quitar Producto");
        btnEliminarTempPlato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarTempPlatoActionPerformed(evt);
            }
        });

        tblTemPlatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "Nombre", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(tblTemPlatos);

        jScrollPane6.setViewportView(txtComentario);

        jLabel9.setFont(new java.awt.Font("Eras Light ITC", 1, 12)); // NOI18N
        jLabel9.setText("Comentario");

        jbComentario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/GuardarTodo.png"))); // NOI18N
        jbComentario.setText("Agregar Comentario");
        jbComentario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbComentarioActionPerformed(evt);
            }
        });

        jtMesero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtMeseroActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Eras Light ITC", 1, 12)); // NOI18N
        jLabel6.setText("Fecha:");

        jLabel7.setFont(new java.awt.Font("Eras Light ITC", 1, 12)); // NOI18N
        jLabel7.setText("Hora:");

        nuevaFecha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Eras Light ITC", 1, 24)); // NOI18N
        jLabel1.setText("Comanda");

        nuevaHora.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        nuevaHora.setDateFormatString("HH:mm:ss");

        jbGuardarRes.setText("Guardar");
        jbGuardarRes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarResActionPerformed(evt);
            }
        });

        jbSalirRes.setText("Salir");
        jbSalirRes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirResActionPerformed(evt);
            }
        });

        lbBuscarPed.setText("Buscar");
        lbBuscarPed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbBuscarPedActionPerformed(evt);
            }
        });

        txtBuscarPlato.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarPlatoKeyReleased(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Eras Light ITC", 1, 12)); // NOI18N
        jLabel8.setText("Buscar Mesa:");

        jLabel2.setFont(new java.awt.Font("Eras Light ITC", 1, 12)); // NOI18N
        jLabel2.setText("Id Pedido");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAddPlato, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEliminarTempPlato, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbComentario))
                        .addGap(27, 27, 27)
                        .addComponent(totalMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(jLabel8))
                            .addComponent(jtMesero, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel5)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(nuevaFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nuevaHora, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtNroPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel6)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addComponent(lbBuscarPed)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jtfId, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(157, 157, 157)
                                        .addComponent(jLabel7))))))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jbGuardarRes, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(49, 49, 49)
                            .addComponent(jbSalirRes, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(18, 18, 18)
                            .addComponent(txtBuscarPlato, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(115, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbBuscarPed, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfId)
                            .addComponent(jtNroPedido)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(15, 15, 15)
                        .addComponent(jLabel5)
                        .addGap(11, 11, 11)
                        .addComponent(jtMesero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nuevaFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nuevaHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtBuscarPlato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnAddPlato)
                                .addGap(18, 18, 18)
                                .addComponent(btnEliminarTempPlato, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbComentario, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(134, 134, 134))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(totalMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbGuardarRes, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbSalirRes, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(317, 317, 317))
        );

        jtMesero.getAccessibleContext().setAccessibleParent(this);
        nuevaFecha.getAccessibleContext().setAccessibleParent(this);
        nuevaHora.getAccessibleContext().setAccessibleParent(this);
        jtNroPedido.getAccessibleContext().setAccessibleParent(this);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(106, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void btnAddPlatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPlatoActionPerformed


        
        if (tblTemPlatos.getSelectedRow() >= 0) {            
            int id = Integer.parseInt(tblTemPlatos.getValueAt(tblTemPlatos.getSelectedRow(), 0).toString());
            String nombreProducto = tblTemPlatos.getValueAt(tblTemPlatos.getSelectedRow(), 1).toString();
            double precio = Double.parseDouble(tblTemPlatos.getValueAt(tblTemPlatos.getSelectedRow(), 2).toString());
            double total = 1 * precio;
            item = item + 1;
            modelo = (DefaultTableModel) tableMenu.getModel();
            for (int i = 0; i < tableMenu.getRowCount(); i++) {
                if (tableMenu.getValueAt(i, 0).equals(id)) {
                    int cantActual = Integer.parseInt(tableMenu.getValueAt(i, 2).toString());
                    int nuevoCantidad = cantActual + 1;
                    double nuevoSub = precio * nuevoCantidad;
                    modelo.setValueAt(nuevoCantidad, i, 2);
                    modelo.setValueAt(nuevoSub, i, 4);
                    TotalPagar(tableMenu, totalMenu);
                    return;
                }                
            }
            ArrayList lista = new ArrayList();
            lista.add(item);
            lista.add(id);
            lista.add(nombreProducto);
            lista.add(1);
            lista.add(precio);
            lista.add(total);
            Object[] O = new Object[6];
            O[0] = lista.get(1);
            O[1] = lista.get(2);
            O[2] = lista.get(3);
            O[3] = lista.get(4);
            O[4] = lista.get(5);
            O[5] = "";
            modelo.addRow(O);
            tableMenu.setModel(modelo);
            TotalPagar(tableMenu, totalMenu);
        } else {
            JOptionPane.showMessageDialog(null, "SELECCIONA UNA FILA");
        }

    }//GEN-LAST:event_btnAddPlatoActionPerformed

    private void btnEliminarTempPlatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarTempPlatoActionPerformed
        
        modelo = (DefaultTableModel) tableMenu.getModel();
        modelo.removeRow(tableMenu.getSelectedRow());
        TotalPagar(tableMenu, totalMenu);
    }//GEN-LAST:event_btnEliminarTempPlatoActionPerformed

    private void jbComentarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbComentarioActionPerformed
        // TODO add your handling code here:
        if (txtComentario.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "SELECCIONE UNA FILA");
        } else {
            int id = Integer.parseInt(tableMenu.getValueAt(tableMenu.getSelectedRow(), 0).toString());
            for (int i = 0; i < tableMenu.getRowCount(); i++) {
                if (tableMenu.getValueAt(i, 0).equals(id)) {
                    modelo.setValueAt(txtComentario.getText(), i, 5);
                    txtComentario.setText("");
                    tableMenu.clearSelection();
                    return;
                }
            }
        }
    }//GEN-LAST:event_jbComentarioActionPerformed

    private void jbSalirResActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirResActionPerformed
        // TODO add your handling code here:
            int eleccion = JOptionPane.showConfirmDialog(this, "Realmente desea salir?", "Confirmacion", JOptionPane.YES_NO_OPTION);
                if (eleccion== JOptionPane.YES_OPTION){
                dispose();
                }else if (eleccion== JOptionPane.NO_OPTION){
                    JOptionPane.showConfirmDialog(null, "Desea seguir trabajando?", "Confirmacion", JOptionPane.CLOSED_OPTION);
            }
    }//GEN-LAST:event_jbSalirResActionPerformed

    private void jbGuardarResActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarResActionPerformed

       try {
        int numeroMesa = Integer.parseInt(jtNroPedido.getText());
        String mesero = jtMesero.getText();
        Double importeTotal = Double.parseDouble(totalMenu.getText());
        
        if (!mesero.isEmpty() && mesero.matches("^[a-zA-Z ]+$")) {
            LocalDate fecha = nuevaFecha.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            LocalTime hora = nuevaHora.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalTime();

            // Obtén la lista de pedidos cobrados para esta mesa
            List<Pedido> pedidosCobrados = obtenerPedidoCobrado(numeroMesa);

            // Desmarca los pedidos anteriores (marcándolos como no cobrados)
            for (Pedido pedido : pedidosCobrados) {
                pedido.setCobrada(false);
                // Guarda los pedidos desmarcados en la base de datos
                pd.modificarComanda(pedido);
            }

            // Crea un nuevo pedido
            Pedido nuevoPedido = new Pedido();
            nuevoPedido.setNombreMesero(mesero);
            nuevoPedido.setFecha(fecha);
            nuevoPedido.setHora(hora);
            nuevoPedido.setImporte(importeTotal);
            nuevoPedido.setCobrada(true); // Se marca como cobrada

            //Mesa mesa = new Mesa();
            //mesa.setNumeroMesa(numeroMesa);

            // Guarda el nuevo pedido en la base de datos
            pd.modificarComanda(ped);

            JOptionPane.showMessageDialog(this, "Reserva registrada");
        } else {
            JOptionPane.showMessageDialog(this, "El nombre del mesero es inválido");
        }
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(this, "Número de mesa no válido");
    } catch (Exception ex) {      
        JOptionPane.showMessageDialog(this, "Error al guardar la reserva.");
    } 
        
        
//    try {
//        int numeroMesa = Integer.parseInt(jtNroPedido.getText());
//        String mesero = jtMesero.getText();
//        Double importeTotal = Double.parseDouble(totalMenu.getText());
//        
//        if (!mesero.isEmpty() && mesero.matches("^[a-zA-Z ]+$")) {
//            LocalDate fecha = nuevaFecha.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
//            LocalTime hora = nuevaHora.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalTime();
//
//            // Obtén la lista de pedidos cobrados para esta mesa
//            List<Pedido> pedidosCobrados = obtenerPedidoCobrado(numeroMesa);
//
//            // Desmarca los pedidos anteriores (marcándolos como no cobrados)
//            for (Pedido pedido : pedidosCobrados) {
//                pedido.setCobrada(true);
//                // Guarda los pedidos desmarcados en la base de datos
//                pd.modificarComanda(pedido);
//            }
//
//            // Crea un nuevo pedido
//            Pedido nuevoPedido = new Pedido();
//            nuevoPedido.setNombreMesero(mesero);
//            nuevoPedido.setFecha(fecha);
//            nuevoPedido.setHora(hora);
//            nuevoPedido.setImporte(importeTotal);
//            nuevoPedido.setCobrada(true); // Se marca como cobrada
//
//            Mesa mesa = new Mesa();
//            mesa.setNumeroMesa(numeroMesa);
//
//            // Guarda el nuevo pedido en la base de datos
//            pd.guardarPedido(nuevoPedido, mesa);
//
//            JOptionPane.showMessageDialog(this, "Reserva registrada");
//        } else {
//            JOptionPane.showMessageDialog(this, "El nombre del mesero es inválido");
//        }
//    } catch (NumberFormatException ex) {
//        JOptionPane.showMessageDialog(this, "Número de mesa no válido");
//    } catch (Exception ex) {      
//        JOptionPane.showMessageDialog(this, "Error al guardar la reserva.");
//    }
    
    

//        try {
//            int numeroMesa = Integer.parseInt(jtNroPedido.getText());
//                String mesero = jtMesero.getText();
//                Double Importe = totalMenu.getText();
//                Boolean Cobrada = tblTemPlatos.getText();
//        
//                if (!mesero.isEmpty() && mesero.matches("^[a-zA-Z ]+$")) {
//                    LocalDate fecha = nuevaFecha.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
//                    LocalTime hora = nuevaHora.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalTime();
//            
//                    Pedido pedido = new Pedido();
//                pedido.setNombreMesero(mesero);
//                pedido.setFecha(fecha);
//                pedido.setHora(hora);
//                pedido.setImporte(importeTotal);
//                pedido.setCobrada(true);
//            
//            Mesa mesa = new Mesa();
//            mesa.setNumeroMesa(numeroMesa);
//            
//            // Ahora puedes guardar la reserva o pedido con los objetos 'pedido' y 'mesa'
//            pd.modificarComanda(pedido);
//    
//            JOptionPane.showMessageDialog(this, "Reserva registrada");
//        } else {
//            JOptionPane.showMessageDialog(this, "El nombre del mesero es inválido");
//        }
//    } catch (NumberFormatException ex) {
//        JOptionPane.showMessageDialog(this, "Número de mesa no válido");
//    } catch (Exception ex) {      
//        JOptionPane.showMessageDialog(this, "Error al guardar la reserva.");
//    }
 
    }//GEN-LAST:event_jbGuardarResActionPerformed

    private void lbBuscarPedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbBuscarPedActionPerformed
        // TODO add your handling code here:

           try {
        int numeroMesa = Integer.parseInt(jtNroPedido.getText());
        Pedido pedido = pd.BuscarPedidoPorNum(numeroMesa);

        if (pedido != null) {
            jtMesero.setText(pedido.getNombreMesero());
            jtfId.setText(String.valueOf(pedido.getIdPedido())); // Asumiendo que getIdPedido devuelve un entero
            nuevaFecha.setDate(Date.valueOf(pedido.getFecha()));
            nuevaHora.setDate(Time.valueOf(pedido.getHora()));

            activarCampos();

            tblTemPlatos.setEnabled(false);
            tableMenu.setEnabled(false);
            btnAddPlato.setEnabled(false);
            btnEliminarTempPlato.setEnabled(false);
            jbComentario.setEnabled(false);
            txtComentario.setEditable(false);
        } else {
            limpiar();
            activarCampos();
            desactivarCampos();
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Debe ingresar un número de pedido válido.");
        jtNroPedido.requestFocus();
        limpiar();
        desactivarCampos();
    } 
        
        
//        try{
//            
//            int numeroMesa = Integer.parseInt(jtNroPedido.getText());
//            Pedido pedi = pd.BuscarPedidoPorNum(numeroMesa);
//            //Pedido pedi = pd.BuscarPedidoPorNumeroMesa(numeroMesa);
//            if(pedi != null){
//                jtMesero.setText(pedi.getNombreMesero());
//                jtfId.setText("idPedido");
//                nuevaFecha.setDate(Date.valueOf(pedi.getFecha()));
//                nuevaHora.setDate(Time.valueOf(pedi.getHora()));
//                
//            activarCampos();
//            
//            tblTemPlatos.setEnabled(false);
//            tableMenu.setEnabled(false);
//            btnAddPlato.setEnabled(false);
//            btnEliminarTempPlato.setEnabled(false);
//            jbComentario.setEnabled(false);
//            txtComentario.setEditable(false);
//            }else{
//                limpiar();
//                activarCampos();
//                desactivarCampos(); 
//               
//            
//                }
//                    
//                    
//        }catch(NumberFormatException e){
//            JOptionPane.showMessageDialog(this, "Debe ingresar un numero de pedido");
//            jtNroPedido.requestFocus();
//            limpiar();
//            desactivarCampos();
//        }
    }//GEN-LAST:event_lbBuscarPedActionPerformed

    private void txtBuscarPlatoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarPlatoKeyReleased
        LimpiarTable();
        ListarPlatos(tblTemPlatos);
        if(txtBuscarPlato != null){
            btnAddPlato.setEnabled(true);
            btnEliminarTempPlato.setEnabled(true);
            tblTemPlatos.setEnabled(true);
            tableMenu.setEnabled(true);
            jbComentario.setEnabled(true);
            lbBuscarPed.setEnabled(false);
            jbGuardarRes.setEnabled(true);
            txtComentario.setEditable(true);
        }else{
            limpiar();
            activarCampos();
            desactivarCampos();
            if(btnAddPlato != null){
                tblTemPlatos.setEnabled(true);
                tableMenu.setEnabled(true);                
                btnEliminarTempPlato.setEnabled(true);
                jbComentario.setEnabled(true);
                lbBuscarPed.setEnabled(false);
                jbGuardarRes.setEnabled(true);
                txtComentario.setEditable(true);
            }else{
                limpiar();
                activarCampos();
                desactivarCampos();
                if(tableMenu != null){
                    btnAddPlato.setEnabled(false);
                    btnEliminarTempPlato.setEnabled(true);
                    tblTemPlatos.setEnabled(false);
                    jbComentario.setEnabled(true);
                    txtComentario.setEditable(true);
                    lbBuscarPed.setEnabled(false);
                    jbGuardarRes.setEnabled(true);    
                } 
            }
        }
    }//GEN-LAST:event_txtBuscarPlatoKeyReleased

    private void jtMeseroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtMeseroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtMeseroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddPlato;
    private javax.swing.JButton btnEliminarTempPlato;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JButton jbComentario;
    private javax.swing.JButton jbGuardarRes;
    private javax.swing.JButton jbSalirRes;
    private javax.swing.JTextField jtMesero;
    private javax.swing.JTextField jtNroPedido;
    private javax.swing.JTextField jtfId;
    private javax.swing.JButton lbBuscarPed;
    private com.toedter.calendar.JDateChooser nuevaFecha;
    private com.toedter.calendar.JDateChooser nuevaHora;
    private javax.swing.JTable tableMenu;
    private javax.swing.JTable tblTemPlatos;
    private javax.swing.JLabel totalMenu;
    private javax.swing.JTextField txtBuscarPlato;
    private javax.swing.JTextPane txtComentario;
    // End of variables declaration//GEN-END:variables

    private void TotalPagar(JTable tabla, JLabel label) {
        Totalpagar = 0.00;
        int numFila = tabla.getRowCount();
        for (int i = 0; i < numFila; i++) {
            double cal = Double.parseDouble(String.valueOf(tabla.getModel().getValueAt(i, 4)));
            Totalpagar += cal;
        }
        label.setText(String.format("%.2f", Totalpagar));
    }

    private void LimpiarTableMenu() {
        modelo = (DefaultTableModel) tableMenu.getModel();
        int fila = tableMenu.getRowCount();
        for (int i = 0; i < fila; i++) {
            modelo.removeRow(0);
        }
    }    
    public void LimpiarTable() {//LIMPIA KEY RELEASE
        for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }
    } 
    
    public void LimpiarListarPlatos() {
        for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }
    }
    

    

    private void ListarPlatos(JTable tabla) {
        List<Producto> Listar = prod.listarPlatos();
        modelo = (DefaultTableModel) tabla.getModel();
        Object[] ob = new Object[3];
        for (int i = 0; i < Listar.size(); i++) {
            ob[0] = Listar.get(i).getCodigoProducto();
            ob[1] = Listar.get(i).getNombreProducto();
            ob[2] = Listar.get(i).getPrecio();
            modelo.addRow(ob);
        }       
    }
    private void desactivarCampos(){
        jtMesero.setEnabled(true);
        nuevaFecha.setEnabled(true);
        nuevaFecha.setEnabled(true);
        
    }
    
    private void activarCampos (){
        jtNroPedido.setEnabled(true);
        jtMesero.setEnabled(true);
        nuevaFecha.setEnabled(true);
        nuevaHora.setEnabled(true);
        
    }
    
    public void limpiar(){
        jtNroPedido.setText("");
        jtMesero.setText("");
        nuevaFecha.setDate(null);
        nuevaHora.setDate(null);
    } 
    
    private void ActualizarTotal(int numeroMesa, JTable tabla, JLabel label) {
    double total = 0.0;

    // Calcular el total a partir de los datos en la tabla
    DefaultTableModel model = (DefaultTableModel) tabla.getModel();
    int rowCount = model.getRowCount();
    for (int i = 0; i < rowCount; i++) {
        double precio = Double.parseDouble(model.getValueAt(i, 2).toString());
        total += precio;
    }

    label.setText(String.format("%.2f", total));

    // Luego, actualiza el importe en la base de datos (suponiendo que tengas una instancia de PedidoData llamada "pd")
    Pedido pedido = pd.BuscarPedidoPorNum(numeroMesa);
    pedido.setImporte(total);
    pd.modificaFinalizar(pedido, mesA);
    //pd.modificaFinalizar(pedido, numeroMesa, true);
}

    private List<Pedido> obtenerPedidoCobrado(int numeroMesa) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
