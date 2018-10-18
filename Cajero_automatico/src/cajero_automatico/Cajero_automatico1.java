package cajero_automatico;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;


//Importando las librerias que cree
import Visualizaciones.Visualizaciones;
import Operaciones.Operaciones;
import javax.swing.JOptionPane;



public class Cajero_automatico1 extends javax.swing.JFrame {
    String usuario0[] = {"","","","","","60000"};
    String usuario1[] = {"kevin leonel","abundis","morales","0001","1111","10000"};
    String usuario2[] = {"jesus erasmo","gallardo","cabrera","0002","2222","15000"};
    String usuario3[] = {"jorgeluis samuel","delgado","sabido","0003","3333","20000"};
    String usuario4[] = {"marko alan","bibiano","cortez","0004","4444","25000"};
    String usuario5[] = {"ivan","castañeda","contreras","0005","5555","30000"};
    String usuario6[] = {"angel jesus","abundis","morales","0006","6666","35000"};
    String usuario7[] = {"gerardo","abundis","morales","0007","7777","40000"};
    String usuario8[] = {"gerardo","abundis","hernandez","0008","8888","45000"};
    String usuario9[] = {"nancy","morales","hernandez","0009","9999","50000"};
    String usuario10[] = {"ana teresa","morales","urrutia","0010","0000","55000"};
    
    String almacenadordemovimientos = "";
    String almacenadordemovimientos2 = "";
    String almacenadordemovimientos3= "";
    String almacenadordemovimientos4 = "";
    String almacenadordemovimientos5 = "";
    String almacenadordemovimientos6 = "";
    String almacenadordemovimientos7 = "";
    String almacenadordemovimientos8 = "";
    String almacenadordemovimientos9 = "";
    String almacenadordemovimientos10 = "";
    
    String montodeposito;
    String numerotarjeta1;
    String guardarnumerodetarjeta;
    
    
    
    boolean retiropresionado = false;
    boolean depositopresionado = false;
    boolean consultarsaldopresionado = false;
    boolean transferenciapresionado = false;
    boolean movimientospresionado = false;
    
    String valorcuenta;
    double valordecuenta;
    double MONTO;
    double SALDO;
    
    double MONTODEPOSITO;
    double SALDODEPOSITO;
    double saldonuevodeposito;
    double saldonuevodeposito2;
    double saldonuevodeposito3;
    double saldonuevodeposito4;
    double saldonuevodeposito5;
    double saldonuevodeposito6;
    double saldonuevodeposito7;
    double saldonuevodeposito8;
    double saldonuevodeposito9;
    double saldonuevodeposito10;
    
    double montoo;
    double saldonuevo;
    double saldonuevo2;
    double saldonuevo3;
    double saldonuevo4;
    double saldonuevo5;
    double saldonuevo6;
    double saldonuevo7;
    double saldonuevo8;
    double saldonuevo9;
    double saldonuevo10;

    
 
    public Cajero_automatico1() {
        initComponents();
        this.setTitle("CAJERO AUTOMÁTICO");
        this.setLocationRelativeTo(null);
        
        //Botones deshabilitados
        retiro.setEnabled(false);
        deposito.setEnabled(false);
        transferencia.setEnabled(false);
        consultarsaldo.setEnabled(false);
        movimientos.setEnabled(false);
        
        monto.setVisible(false);
        saldo.setVisible(false);
        tarjeta1.setVisible(false);
        realizaroperacion.setVisible(false);
        limpiar2.setVisible(false);
        r.setVisible(false);
        d.setVisible(false);
        
        Monto.setVisible(false);
        Saldo.setVisible(false);
        Tarjeta1.setVisible(false);
        
        
        
       
       //insertando imagen del banco al boton y ajustandolo a su tamaño
        ImageIcon imagen = new ImageIcon("src/imagenes/banco.jpg");
        Icon icono = new ImageIcon(imagen.getImage().getScaledInstance(jButton1.getWidth(), jButton1.getHeight(),Image.SCALE_DEFAULT));
        jButton1.setIcon(icono);
        this.repaint();
        
    }
    //Instanciando los objetos para poder utilizar los metodos de mis librerias creadas
    Visualizaciones vis = new Visualizaciones();
    Operaciones ope = new Operaciones();
   
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nip = new javax.swing.JTextField();
        apellidopaterno = new javax.swing.JTextField();
        numerotarjeta = new javax.swing.JTextField();
        apellidomaterno = new javax.swing.JTextField();
        retiro = new javax.swing.JButton();
        deposito = new javax.swing.JButton();
        consultarsaldo = new javax.swing.JButton();
        transferencia = new javax.swing.JButton();
        movimientos = new javax.swing.JButton();
        boton5 = new javax.swing.JButton();
        boton1 = new javax.swing.JButton();
        boton4 = new javax.swing.JButton();
        boton7 = new javax.swing.JButton();
        boton8 = new javax.swing.JButton();
        botonasterisco = new javax.swing.JButton();
        boton2 = new javax.swing.JButton();
        boton3 = new javax.swing.JButton();
        boton6 = new javax.swing.JButton();
        boton9 = new javax.swing.JButton();
        botongato = new javax.swing.JButton();
        boton0 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        cancelar = new javax.swing.JButton();
        limpiar = new javax.swing.JButton();
        enter = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        Monto = new javax.swing.JLabel();
        monto = new javax.swing.JTextField();
        saldo = new javax.swing.JTextField();
        Saldo = new javax.swing.JLabel();
        Tarjeta1 = new javax.swing.JLabel();
        realizaroperacion = new javax.swing.JButton();
        tarjeta1 = new javax.swing.JTextField();
        limpiar2 = new javax.swing.JButton();
        r = new javax.swing.JButton();
        d = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 720, 120));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel7.setText("Nombre(s): ");

        nombre.setFocusable(false);
        nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombreKeyTyped(evt);
            }
        });

        jLabel1.setText("Apellido Paterno:");

        jLabel2.setText("Apellido Materno:");

        jLabel3.setText("Número de Tarjeta:");

        jLabel5.setText("NIP:");

        nip.setFocusable(false);
        nip.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nipKeyTyped(evt);
            }
        });

        apellidopaterno.setFocusable(false);
        apellidopaterno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                apellidopaternoKeyTyped(evt);
            }
        });

        numerotarjeta.setFocusable(false);
        numerotarjeta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numerotarjetaKeyTyped(evt);
            }
        });

        apellidomaterno.setFocusable(false);
        apellidomaterno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                apellidomaternoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(numerotarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                        .addComponent(jLabel5)))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(apellidopaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(apellidomaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(nip, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(apellidopaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apellidomaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(nip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numerotarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 720, 90));

        retiro.setText("RETIRO");
        retiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retiroActionPerformed(evt);
            }
        });
        getContentPane().add(retiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, 30));

        deposito.setText("DEPÓSITO");
        deposito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositoActionPerformed(evt);
            }
        });
        getContentPane().add(deposito, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        consultarsaldo.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        consultarsaldo.setText("CONSULTAR SALDO");
        consultarsaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarsaldoActionPerformed(evt);
            }
        });
        getContentPane().add(consultarsaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 140, 30));

        transferencia.setText("TRANSFERENCIA");
        transferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transferenciaActionPerformed(evt);
            }
        });
        getContentPane().add(transferencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 240, -1, -1));

        movimientos.setText("MOVIMIENTOS");
        movimientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                movimientosActionPerformed(evt);
            }
        });
        getContentPane().add(movimientos, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 280, -1, -1));

        boton5.setText("5");
        boton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton5ActionPerformed(evt);
            }
        });
        getContentPane().add(boton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 510, 90, 40));

        boton1.setText("1");
        boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton1ActionPerformed(evt);
            }
        });
        getContentPane().add(boton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 450, 90, 40));

        boton4.setText("4");
        boton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton4ActionPerformed(evt);
            }
        });
        getContentPane().add(boton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 510, 90, 40));

        boton7.setText("7");
        boton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton7ActionPerformed(evt);
            }
        });
        getContentPane().add(boton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 570, 90, 40));

        boton8.setText("8");
        boton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton8ActionPerformed(evt);
            }
        });
        getContentPane().add(boton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 570, 90, 40));

        botonasterisco.setText("*");
        getContentPane().add(botonasterisco, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 630, 90, 40));

        boton2.setText("2");
        boton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton2ActionPerformed(evt);
            }
        });
        getContentPane().add(boton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 450, 90, 40));

        boton3.setText("3");
        boton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton3ActionPerformed(evt);
            }
        });
        getContentPane().add(boton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 450, 90, 40));

        boton6.setText("6");
        boton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton6ActionPerformed(evt);
            }
        });
        getContentPane().add(boton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 510, 90, 40));

        boton9.setText("9");
        boton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton9ActionPerformed(evt);
            }
        });
        getContentPane().add(boton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 570, 90, 40));

        botongato.setText("#");
        getContentPane().add(botongato, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 630, 90, 40));

        boton0.setText("0");
        boton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton0ActionPerformed(evt);
            }
        });
        getContentPane().add(boton0, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 630, 90, 40));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 428, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 238, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 440, 430, 240));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        cancelar.setText("CANCELAR");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        limpiar.setText("LIMPIAR");
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });

        enter.setText("ENTER");
        enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterActionPerformed(evt);
            }
        });

        salir.setText("SALIR");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(enter, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 8, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(enter, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 440, 120, 240));

        Monto.setText("Monto:");
        getContentPane().add(Monto, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, -1, -1));

        monto.setFocusable(false);
        monto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                montoKeyTyped(evt);
            }
        });
        getContentPane().add(monto, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, 90, -1));

        saldo.setFocusable(false);
        saldo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                saldoKeyTyped(evt);
            }
        });
        getContentPane().add(saldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, 100, -1));

        Saldo.setText("Tu saldo es de:");
        getContentPane().add(Saldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, -1, -1));

        Tarjeta1.setText("Número de Tarjeta:");
        getContentPane().add(Tarjeta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, -1, -1));

        realizaroperacion.setText("Realizar Operación");
        realizaroperacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                realizaroperacionActionPerformed(evt);
            }
        });
        getContentPane().add(realizaroperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 380, -1, -1));

        tarjeta1.setFocusable(false);
        tarjeta1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tarjeta1KeyTyped(evt);
            }
        });
        getContentPane().add(tarjeta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 330, 70, -1));

        limpiar2.setText("Limpiar");
        limpiar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiar2ActionPerformed(evt);
            }
        });
        getContentPane().add(limpiar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(485, 250, 80, -1));

        r.setText("Retiro");
        getContentPane().add(r, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, -1, -1));

        d.setText("Depósito");
        getContentPane().add(d, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, -1, -1));

        jTextArea1.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setFocusable(false);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 430, 170));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Abund\\OneDrive\\Escritorio\\Programas en Java\\Cajero_automatico\\src\\imagenes\\fondo1.jpg")); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton6ActionPerformed
        
         if(numerotarjeta.getText().length() < 4 ){
              numerotarjeta.setText(numerotarjeta.getText()+"6");
          }
          else{
              if(nip.getText().length() < 4){
                  nip.setText(nip.getText()+"6");
              }
          }
          
          if(retiropresionado==true){
              monto.setText(monto.getText()+"6");
          }
          
          if(depositopresionado==true){
              monto.setText(monto.getText()+"6");
          }
          
          if(consultarsaldopresionado==true){
              //jejeje no tiene que hacer nada
          }
          
          if(transferenciapresionado == true){
              if(tarjeta1.getText().length()<4){
                  tarjeta1.setText(tarjeta1.getText()+"6");
              }
              else{
                  monto.setText(monto.getText()+"6");
              }
          }
          
          if(movimientospresionado==true){
              //jejeje este tampoco tiene que hacer nada
          }   
    }//GEN-LAST:event_boton6ActionPerformed

    private void enterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterActionPerformed
        
//            if((       usuario1[0].equals(nombre.getText().toLowerCase())&&usuario1[1].equals(apellidopaterno.getText().toLowerCase())
//            &&usuario1[2].equals(apellidomaterno.getText().toLowerCase())&&usuario1[3].equals(numerotarjeta.getText().toLowerCase())&&usuario1[4].equals(nip.getText().toLowerCase()))
//                    ||(usuario2[0].equals(nombre.getText().toLowerCase())&&usuario2[1].equals(apellidopaterno.getText().toLowerCase())
//            &&usuario2[2].equals(apellidomaterno.getText().toLowerCase())&&usuario2[3].equals(numerotarjeta.getText().toLowerCase())&&usuario2[4].equals(nip.getText().toLowerCase()))
//                    ||(usuario3[0].equals(nombre.getText().toLowerCase())&&usuario3[1].equals(apellidopaterno.getText().toLowerCase())
//            &&usuario3[2].equals(apellidomaterno.getText().toLowerCase())&&usuario3[3].equals(numerotarjeta.getText().toLowerCase())&&usuario3[4].equals(nip.getText().toLowerCase()))
//                    ||(usuario4[0].equals(nombre.getText().toLowerCase())&&usuario4[1].equals(apellidopaterno.getText().toLowerCase())
//            &&usuario4[2].equals(apellidomaterno.getText().toLowerCase())&&usuario4[3].equals(numerotarjeta.getText().toLowerCase())&&usuario4[4].equals(nip.getText().toLowerCase()))
//                    ||(usuario5[0].equals(nombre.getText().toLowerCase())&&usuario5[1].equals(apellidopaterno.getText().toLowerCase())
//            &&usuario5[2].equals(apellidomaterno.getText().toLowerCase())&&usuario5[3].equals(numerotarjeta.getText().toLowerCase())&&usuario5[4].equals(nip.getText().toLowerCase()))
//                    ||(usuario6[0].equals(nombre.getText().toLowerCase())&&usuario6[1].equals(apellidopaterno.getText().toLowerCase())
//            &&usuario6[2].equals(apellidomaterno.getText().toLowerCase())&&usuario6[3].equals(numerotarjeta.getText().toLowerCase())&&usuario6[4].equals(nip.getText().toLowerCase()))
//                    ||(usuario7[0].equals(nombre.getText().toLowerCase())&&usuario7[1].equals(apellidopaterno.getText().toLowerCase())
//            &&usuario7[2].equals(apellidomaterno.getText().toLowerCase())&&usuario7[3].equals(numerotarjeta.getText().toLowerCase())&&usuario7[4].equals(nip.getText().toLowerCase()))
//                    ||(usuario8[0].equals(nombre.getText().toLowerCase())&&usuario8[1].equals(apellidopaterno.getText().toLowerCase())
//            &&usuario8[2].equals(apellidomaterno.getText().toLowerCase())&&usuario8[3].equals(numerotarjeta.getText().toLowerCase())&&usuario8[4].equals(nip.getText().toLowerCase()))
//                    ||(usuario9[0].equals(nombre.getText().toLowerCase())&&usuario9[1].equals(apellidopaterno.getText().toLowerCase())
//            &&usuario9[2].equals(apellidomaterno.getText().toLowerCase())&&usuario9[3].equals(numerotarjeta.getText().toLowerCase())&&usuario9[4].equals(nip.getText().toLowerCase()))
//                    ||(usuario10[0].equals(nombre.getText().toLowerCase())&&usuario10[1].equals(apellidopaterno.getText().toLowerCase())
//            &&usuario10[2].equals(apellidomaterno.getText().toLowerCase())&&usuario10[3].equals(numerotarjeta.getText().toLowerCase())&&usuario10[4].equals(nip.getText().toLowerCase()))
//                    ||(usuario0[0].equals(nombre.getText().toLowerCase())&&usuario0[1].equals(apellidopaterno.getText().toLowerCase())
//            &&usuario0[2].equals(apellidomaterno.getText().toLowerCase())&&usuario0[3].equals(numerotarjeta.getText().toLowerCase())&&usuario0[4].equals(nip.getText().toLowerCase()))
//                    ){
           try{
             if("".equals(numerotarjeta.getText())&& "".equals(nip.getText())){
                 vis.usuario_no_existente();
             }
             if(usuario1[3].equals(numerotarjeta.getText()) && usuario1[4].equals(nip.getText())){
            nombre.setText(usuario1[0].toUpperCase());
            apellidopaterno.setText(usuario1[1].toUpperCase());
            apellidomaterno.setText(usuario1[2].toUpperCase());
            
            
            retiro.setEnabled(true);
            deposito.setEnabled(true);
            transferencia.setEnabled(true);
            consultarsaldo.setEnabled(true);
            movimientos.setEnabled(true);
            }
             
                     if(usuario2[3].equals(numerotarjeta.getText()) && usuario2[4].equals(nip.getText())){
                    nombre.setText(usuario2[0].toUpperCase());
                    apellidopaterno.setText(usuario2[1].toUpperCase());
                    apellidomaterno.setText(usuario2[2].toUpperCase());
            
            
                    retiro.setEnabled(true);
                    deposito.setEnabled(true);
                    transferencia.setEnabled(true);
                    consultarsaldo.setEnabled(true);
                    movimientos.setEnabled(true);
                    }
                     
                         if(usuario3[3].equals(numerotarjeta.getText()) && usuario3[4].equals(nip.getText())){
                        nombre.setText(usuario3[0].toUpperCase());
                        apellidopaterno.setText(usuario3[1].toUpperCase());
                        apellidomaterno.setText(usuario3[2].toUpperCase());
            
            
                        retiro.setEnabled(true);
                        deposito.setEnabled(true);
                        transferencia.setEnabled(true);
                        consultarsaldo.setEnabled(true);
                        movimientos.setEnabled(true);
                        }
                         
                             if(usuario4[3].equals(numerotarjeta.getText()) && usuario4[4].equals(nip.getText())){
                             nombre.setText(usuario4[0].toUpperCase());
                             apellidopaterno.setText(usuario4[1].toUpperCase());
                             apellidomaterno.setText(usuario4[2].toUpperCase());
            
            
                             retiro.setEnabled(true);
                             deposito.setEnabled(true);
                            transferencia.setEnabled(true);
                            consultarsaldo.setEnabled(true);
                            movimientos.setEnabled(true);
                            }
                             
                                 if(usuario5[3].equals(numerotarjeta.getText()) && usuario5[4].equals(nip.getText())){
                                nombre.setText(usuario5[0].toUpperCase());
                                apellidopaterno.setText(usuario5[1].toUpperCase());
                                apellidomaterno.setText(usuario5[2].toUpperCase());
            
            
                                retiro.setEnabled(true);
                                deposito.setEnabled(true);
                                transferencia.setEnabled(true);
                                consultarsaldo.setEnabled(true);
                                movimientos.setEnabled(true);
                                 }
                                 
                                     if(usuario6[3].equals(numerotarjeta.getText()) && usuario6[4].equals(nip.getText())){
                                     nombre.setText(usuario6[0].toUpperCase());
                                    apellidopaterno.setText(usuario6[1].toUpperCase());
                                    apellidomaterno.setText(usuario6[2].toUpperCase());
            
            
                                    retiro.setEnabled(true);
                                     deposito.setEnabled(true);
                                     transferencia.setEnabled(true);
                                     consultarsaldo.setEnabled(true);
                                    movimientos.setEnabled(true);
                                    }
                                     
                                         if(usuario7[3].equals(numerotarjeta.getText()) && usuario7[4].equals(nip.getText())){
                                        nombre.setText(usuario7[0].toUpperCase());
                                        apellidopaterno.setText(usuario7[1].toUpperCase());
                                         apellidomaterno.setText(usuario7[2].toUpperCase());
            
            
                                        retiro.setEnabled(true);
                                        deposito.setEnabled(true);
                                         transferencia.setEnabled(true);
                                        consultarsaldo.setEnabled(true);
                                         movimientos.setEnabled(true);
                                         }
                                         
                                             if(usuario8[3].equals(numerotarjeta.getText()) && usuario8[4].equals(nip.getText())){
                                            nombre.setText(usuario8[0].toUpperCase());
                                            apellidopaterno.setText(usuario8[1].toUpperCase());
                                            apellidomaterno.setText(usuario8[2].toUpperCase());
            
            
                                             retiro.setEnabled(true);
                                             deposito.setEnabled(true);
                                             transferencia.setEnabled(true);
                                            consultarsaldo.setEnabled(true);
                                            movimientos.setEnabled(true);
                                             }
                                             
                                                 if(usuario9[3].equals(numerotarjeta.getText()) && usuario9[4].equals(nip.getText())){
                                                nombre.setText(usuario9[0].toUpperCase());
                                                apellidopaterno.setText(usuario9[1].toUpperCase());
                                                apellidomaterno.setText(usuario9[2].toUpperCase());
            
            
                                                retiro.setEnabled(true);
                                                deposito.setEnabled(true);
                                                 transferencia.setEnabled(true);
                                                consultarsaldo.setEnabled(true);
                                                movimientos.setEnabled(true);
                                                }
                                                 
                                                     if(usuario10[3].equals(numerotarjeta.getText()) && usuario10[4].equals(nip.getText())){
                                                     nombre.setText(usuario10[0].toUpperCase());
                                                    apellidopaterno.setText(usuario10[1].toUpperCase());
                                                     apellidomaterno.setText(usuario10[2].toUpperCase());
            
            
                                                    retiro.setEnabled(true);
                                                     deposito.setEnabled(true);
                                                     transferencia.setEnabled(true);
                                                    consultarsaldo.setEnabled(true);
                                                    movimientos.setEnabled(true);
                                                     }
                                          
           }
           catch(Exception e){
               vis.usuario_no_existente();
           }
            
            
            
           
       
        
        
    }//GEN-LAST:event_enterActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        JOptionPane.showMessageDialog(null, "HASTA LUEGO" ,"DESPEDIDA", 1);
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        
       //Limpiando los campos y deshabilitando los botones que no se ocupan
       
        retiro.setEnabled(false);
        deposito.setEnabled(false);
        transferencia.setEnabled(false);
        consultarsaldo.setEnabled(false);
        movimientos.setEnabled(false);
        r.setVisible(false);
        d.setVisible(false);
        
        monto.setVisible(false);
        saldo.setVisible(false);
        tarjeta1.setVisible(false);
        realizaroperacion.setVisible(false);
        limpiar2.setVisible(false);
        
        Monto.setVisible(false);
        Saldo.setVisible(false);
        Tarjeta1.setVisible(false);
       nombre.setText("");
       apellidopaterno.setText("");
       apellidomaterno.setText("");
       numerotarjeta.setText("");
       nip.setText("");
       
       monto.setText("");
        saldo.setText("");
        tarjeta1.setText("");
        jTextArea1.setText("");
        //almacenadordemovimientos = "";
      
      
       
       
    }//GEN-LAST:event_limpiarActionPerformed

    private void consultarsaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarsaldoActionPerformed
      //Activando y desactivando botones al presionarse consultar saldo
      retiropresionado = false;
      depositopresionado = false;
      consultarsaldopresionado = true;
      transferenciapresionado = false;
      movimientospresionado = false;
      
        monto.setVisible(false);
        saldo.setVisible(true);
        tarjeta1.setVisible(false);
        realizaroperacion.setVisible(true);
        limpiar2.setVisible(false);
        r.setVisible(false);
        d.setVisible(false);
        
        Monto.setVisible(false);
        Saldo.setVisible(true);
        Tarjeta1.setVisible(false);
        
        monto.setText("");
        saldo.setText("");
        tarjeta1.setText("");
        jTextArea1.setText("");
        
       
    }//GEN-LAST:event_consultarsaldoActionPerformed

    private void retiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retiroActionPerformed
      //Activando y desactivando botones al presionarse retiro
      retiropresionado = true;
      depositopresionado = false;
      consultarsaldopresionado = false;
      transferenciapresionado = false;
      movimientospresionado = false;
        
        monto.setVisible(true);
        saldo.setVisible(false);
        tarjeta1.setVisible(false);
        realizaroperacion.setVisible(true);
        limpiar2.setVisible(true);
        r.setVisible(true);
        d.setVisible(false);
        
        Monto.setVisible(true);
        Saldo.setVisible(false);
        Tarjeta1.setVisible(false);
        
        monto.setText("");
        saldo.setText("");
        tarjeta1.setText("");
        jTextArea1.setText("");
        
       
       
       
       
      
        
       
    }//GEN-LAST:event_retiroActionPerformed

    private void depositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositoActionPerformed
      //Activando y desactivando botones al presionarse deposito
      retiropresionado = false;
      depositopresionado = true;
      consultarsaldopresionado = false;
      transferenciapresionado = false;
      movimientospresionado = false;
      
        monto.setVisible(true);
        saldo.setVisible(false);
        tarjeta1.setVisible(false);
        realizaroperacion.setVisible(true);
        limpiar2.setVisible(true);
        r.setVisible(false);
        d.setVisible(true);
        
        Monto.setVisible(true);
        Saldo.setVisible(false);
        Tarjeta1.setVisible(false);
        
        
        monto.setText("");
        saldo.setText("");
        tarjeta1.setText("");
        jTextArea1.setText("");
        jTextArea1.setText("");
        
        
          
    }//GEN-LAST:event_depositoActionPerformed

    private void transferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transferenciaActionPerformed
      //Activando y desactivando botones al presionarse transferencia
      retiropresionado = false;
      depositopresionado = false;
      consultarsaldopresionado = false;
      transferenciapresionado = true;
      movimientospresionado = false;
        
        monto.setVisible(true);
        saldo.setVisible(false);
        tarjeta1.setVisible(true);
        realizaroperacion.setVisible(true);
        limpiar2.setVisible(true);
        r.setVisible(false);
        d.setVisible(false);
        
        Monto.setVisible(true);
        Saldo.setVisible(false);
        Tarjeta1.setVisible(true);
        
        monto.setText("");
        saldo.setText("");
        tarjeta1.setText("");
        jTextArea1.setText("");
        
         
        
       
       
    }//GEN-LAST:event_transferenciaActionPerformed

    private void movimientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_movimientosActionPerformed
      //Activando y desactivando botones al presionarse movimientos
      retiropresionado = true;
      depositopresionado = false;
      consultarsaldopresionado = false;
      transferenciapresionado = false;
      movimientospresionado = true;
      
      
        monto.setVisible(false);
        saldo.setVisible(false);
        tarjeta1.setVisible(false);
        realizaroperacion.setVisible(false);
        limpiar2.setVisible(false);
        r.setVisible(false);
        d.setVisible(false);
        
        monto.setText("");
        saldo.setText("");
        tarjeta1.setText("");
        
        Monto.setVisible(false);
        Saldo.setVisible(false);
        Tarjeta1.setVisible(false);
        

        if("0001".equals(numerotarjeta.getText())){
             jTextArea1.setText("Los movimientos realizados fueron: \n"+almacenadordemovimientos);
        }
        else{
            if("0002".equals(numerotarjeta.getText())){
             jTextArea1.setText("Los movimientos realizados fueron: \n"+almacenadordemovimientos2);
            }
            else{
                if("0003".equals(numerotarjeta.getText())){
                jTextArea1.setText("Los movimientos realizados fueron: \n"+almacenadordemovimientos3);
                }
                else{
                    if("0004".equals(numerotarjeta.getText())){
                    jTextArea1.setText("Los movimientos realizados fueron: \n"+almacenadordemovimientos4);
                    }
                    else{
                        if("0005".equals(numerotarjeta.getText())){
                        jTextArea1.setText("Los movimientos realizados fueron: \n"+almacenadordemovimientos5);
                        }
                        else{
                            if("0006".equals(numerotarjeta.getText())){
                            jTextArea1.setText("Los movimientos realizados fueron: \n"+almacenadordemovimientos6);
                            }
                            else{
                                if("0007".equals(numerotarjeta.getText())){
                                jTextArea1.setText("Los movimientos realizados fueron: \n"+almacenadordemovimientos7);
                                 }
                                else{
                                    if("0008".equals(numerotarjeta.getText())){
                                    jTextArea1.setText("Los movimientos realizados fueron: \n"+almacenadordemovimientos8);
                                    }
                                    else{
                                         if("0009".equals(numerotarjeta.getText())){
                                         jTextArea1.setText("Los movimientos realizados fueron: \n"+almacenadordemovimientos9);
                                        }
                                         else{
                                              if("0010".equals(numerotarjeta.getText())){
                                                jTextArea1.setText("Los movimientos realizados fueron: \n"+almacenadordemovimientos10);
                                             }
                                              else{
                                                  vis.usuario_no_existente();
                                              }
                                         }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        
    }//GEN-LAST:event_movimientosActionPerformed

    private void boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton1ActionPerformed
          
          if(numerotarjeta.getText().length() < 4 ){
              numerotarjeta.setText(numerotarjeta.getText()+"1");
          }
          else{
              if(nip.getText().length() < 4){
                  nip.setText(nip.getText()+"1");
              }
          }
          
          if(retiropresionado==true){
              monto.setText(monto.getText()+"1");
          }
          
          if(depositopresionado==true){
              monto.setText(monto.getText()+"1");
          }
          
          if(consultarsaldopresionado==true){
              //jejeje no tiene que hacer nada
          }
          
          if(transferenciapresionado == true){
              if(tarjeta1.getText().length()<4){
                  tarjeta1.setText(tarjeta1.getText()+"1");
              }
              else{
                  monto.setText(monto.getText()+"1");
              }
          }
          
          if(movimientospresionado==true){
              //jejeje este tampoco tiene que hacer nada
          }
          
       
    }//GEN-LAST:event_boton1ActionPerformed

    private void boton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton2ActionPerformed
       if(numerotarjeta.getText().length() < 4 ){
              numerotarjeta.setText(numerotarjeta.getText()+"2");
          }
          else{
              if(nip.getText().length() < 4){
                  nip.setText(nip.getText()+"2");
              }
          }
          
          if(retiropresionado==true){
              monto.setText(monto.getText()+"2");
          }
          
          if(depositopresionado==true){
              monto.setText(monto.getText()+"2");
          }
          
          if(consultarsaldopresionado==true){
              //jejeje no tiene que hacer nada
          }
          
          if(transferenciapresionado == true){
              if(tarjeta1.getText().length()<4){
                  tarjeta1.setText(tarjeta1.getText()+"2");
              }
              else{
                  monto.setText(monto.getText()+"2");
              }
          }
          
          if(movimientospresionado==true){
              //jejeje este tampoco tiene que hacer nada
          }
    }//GEN-LAST:event_boton2ActionPerformed

    private void boton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton3ActionPerformed

          if(numerotarjeta.getText().length() < 4 ){
              numerotarjeta.setText(numerotarjeta.getText()+"3");
          }
          else{
              if(nip.getText().length() < 4){
                  nip.setText(nip.getText()+"3");
              }
          }
          
          if(retiropresionado==true){
              monto.setText(monto.getText()+"3");
          }
          
          if(depositopresionado==true){
              monto.setText(monto.getText()+"3");
          }
          
          if(consultarsaldopresionado==true){
              //jejeje no tiene que hacer nada
          }
          
          if(transferenciapresionado == true){
              if(tarjeta1.getText().length()<4){
                  tarjeta1.setText(tarjeta1.getText()+"3");
              }
              else{
                  monto.setText(monto.getText()+"3");
              }
          }
          
          if(movimientospresionado==true){
              //jejeje este tampoco tiene que hacer nada
          }   
    }//GEN-LAST:event_boton3ActionPerformed

    private void boton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton4ActionPerformed

          if(numerotarjeta.getText().length() < 4 ){
              numerotarjeta.setText(numerotarjeta.getText()+"4");
          }
          else{
              if(nip.getText().length() < 4){
                  nip.setText(nip.getText()+"4");
              }
          }
          
          if(retiropresionado==true){
              monto.setText(monto.getText()+"4");
          }
          
          if(depositopresionado==true){
              monto.setText(monto.getText()+"4");
          }
          
          if(consultarsaldopresionado==true){
              //jejeje no tiene que hacer nada
          }
          
          if(transferenciapresionado == true){
              if(tarjeta1.getText().length()<4){
                  tarjeta1.setText(tarjeta1.getText()+"4");
              }
              else{
                  monto.setText(monto.getText()+"4");
              }
          }
          
          if(movimientospresionado==true){
              //jejeje este tampoco tiene que hacer nada
          }      
    }//GEN-LAST:event_boton4ActionPerformed

    private void boton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton5ActionPerformed
       
          if(numerotarjeta.getText().length() < 4 ){
              numerotarjeta.setText(numerotarjeta.getText()+"5");
          }
          else{
              if(nip.getText().length() < 4){
                  nip.setText(nip.getText()+"5");
              }
          }
          
          if(retiropresionado==true){
              monto.setText(monto.getText()+"5");
          }
          
          if(depositopresionado==true){
              monto.setText(monto.getText()+"5");
          }
          
          if(consultarsaldopresionado==true){
              //jejeje no tiene que hacer nada
          }
          
          if(transferenciapresionado == true){
              if(tarjeta1.getText().length()<4){
                  tarjeta1.setText(tarjeta1.getText()+"5");
              }
              else{
                  monto.setText(monto.getText()+"5");
              }
          }
          
          if(movimientospresionado==true){
              //jejeje este tampoco tiene que hacer nada
          }
    }//GEN-LAST:event_boton5ActionPerformed

    private void boton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton7ActionPerformed
        
          if(numerotarjeta.getText().length() < 4 ){
              numerotarjeta.setText(numerotarjeta.getText()+"7");
          }
          else{
              if(nip.getText().length() < 4){
                  nip.setText(nip.getText()+"7");
              }
          }
          
          if(retiropresionado==true){
              monto.setText(monto.getText()+"7");
          }
          
          if(depositopresionado==true){
              monto.setText(monto.getText()+"7");
          }
          
          if(consultarsaldopresionado==true){
              //jejeje no tiene que hacer nada
          }
          
          if(transferenciapresionado == true){
              if(tarjeta1.getText().length()<4){
                  tarjeta1.setText(tarjeta1.getText()+"7");
              }
              else{
                  monto.setText(monto.getText()+"7");
              }
          }
          
          if(movimientospresionado==true){
              //jejeje este tampoco tiene que hacer nada
          }
    }//GEN-LAST:event_boton7ActionPerformed

    private void boton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton8ActionPerformed

          if(numerotarjeta.getText().length() < 4 ){
              numerotarjeta.setText(numerotarjeta.getText()+"8");
          }
          else{
              if(nip.getText().length() < 4){
                  nip.setText(nip.getText()+"8");
              }
          }
          
          if(retiropresionado==true){
              monto.setText(monto.getText()+"8");
          }
          
          if(depositopresionado==true){
              monto.setText(monto.getText()+"8");
          }
          
          if(consultarsaldopresionado==true){
              //jejeje no tiene que hacer nada
          }
          
          if(transferenciapresionado == true){
              if(tarjeta1.getText().length()<4){
                  tarjeta1.setText(tarjeta1.getText()+"8");
              }
              else{
                  monto.setText(monto.getText()+"8");
              }
          }
          
          if(movimientospresionado==true){
              //jejeje este tampoco tiene que hacer nada
          }     // TODO add your handling code here:
    }//GEN-LAST:event_boton8ActionPerformed

    private void boton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton9ActionPerformed

          if(numerotarjeta.getText().length() < 4 ){
              numerotarjeta.setText(numerotarjeta.getText()+"9");
          }
          else{
              if(nip.getText().length() < 4){
                  nip.setText(nip.getText()+"9");
              }
          }
          
          if(retiropresionado==true){
              monto.setText(monto.getText()+"9");
          }
          
          if(depositopresionado==true){
              monto.setText(monto.getText()+"9");
          }
          
          if(consultarsaldopresionado==true){
              //jejeje no tiene que hacer nada
          }
          
          if(transferenciapresionado == true){
              if(tarjeta1.getText().length()<4){
                  tarjeta1.setText(tarjeta1.getText()+"9");
              }
              else{
                  monto.setText(monto.getText()+"9");
              }
          }
          
          if(movimientospresionado==true){
              //jejeje este tampoco tiene que hacer nada
          }        // TODO add your handling code here:
    }//GEN-LAST:event_boton9ActionPerformed

    private void boton0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton0ActionPerformed

          if(numerotarjeta.getText().length() < 4 ){
              numerotarjeta.setText(numerotarjeta.getText()+"0");
          }
          else{
              if(nip.getText().length() < 4){
                  nip.setText(nip.getText()+"0");
              }
          }
          
          if(retiropresionado==true){
              monto.setText(monto.getText()+"0");
          }
          
          if(depositopresionado==true){
              monto.setText(monto.getText()+"0");
          }
          
          if(consultarsaldopresionado==true){
              //jejeje no tiene que hacer nada
          }
          
          if(transferenciapresionado == true){
              if(tarjeta1.getText().length()<4){
                  tarjeta1.setText(tarjeta1.getText()+"0");
              }
              else{
                  monto.setText(monto.getText()+"0");
              }
          }
          
          if(movimientospresionado==true){
              //jejeje este tampoco tiene que hacer nada
          }          // TODO add your handling code here:
    }//GEN-LAST:event_boton0ActionPerformed

    private void limpiar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiar2ActionPerformed
        monto.setText("");
        saldo.setText("");
        tarjeta1.setText("");      // TODO add your handling code here:
    }//GEN-LAST:event_limpiar2ActionPerformed

    private void nipKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nipKeyTyped
        String Caracteres = nip.getText();
        if(Caracteres.length()>=4){
            evt.consume();
        } 
    }//GEN-LAST:event_nipKeyTyped

    private void numerotarjetaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numerotarjetaKeyTyped
String Caracteres = numerotarjeta.getText();
        if(Caracteres.length()>=4){
            evt.consume();
        }         // TODO add your handling code here:
    }//GEN-LAST:event_numerotarjetaKeyTyped

    private void montoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_montoKeyTyped
    String Caracteres = monto.getText();
        if(Caracteres.length()>=10){
            evt.consume();
        }         // TODO add your handling code here:
    }//GEN-LAST:event_montoKeyTyped

    private void saldoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_saldoKeyTyped
      String Caracteres = saldo.getText();
        if(Caracteres.length()>=4){
            evt.consume();
        }         // TODO add your handling code here:
    }//GEN-LAST:event_saldoKeyTyped

    private void tarjeta1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tarjeta1KeyTyped
    String Caracteres = tarjeta1.getText();
        if(Caracteres.length()>=4){
            evt.consume();
        }         // TODO add your handling code here:
    }//GEN-LAST:event_tarjeta1KeyTyped

    private void nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreKeyTyped
    String Caracteres = nombre.getText();
        if(Caracteres.length()>=25){
            evt.consume();
        }         // TODO add your handling code here:
    }//GEN-LAST:event_nombreKeyTyped

    private void apellidopaternoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_apellidopaternoKeyTyped
String Caracteres = apellidopaterno.getText();
        if(Caracteres.length()>=15){
            evt.consume();
        }         // TODO add your handling code here:
    }//GEN-LAST:event_apellidopaternoKeyTyped

    private void apellidomaternoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_apellidomaternoKeyTyped
    String Caracteres = apellidomaterno.getText();
        if(Caracteres.length()>=15){
            evt.consume();
        }         // TODO add your handling code here:
    }//GEN-LAST:event_apellidomaternoKeyTyped

    private void realizaroperacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_realizaroperacionActionPerformed
       
        //try{
             if("0001".equals(numerotarjeta.getText())){
            
            
           //Consultar Saldo
            if(consultarsaldopresionado == true){
            saldo.setText(usuario1[5]);
            almacenadordemovimientos += "Hiciste una consulta - Saldo Moméntaneo $ "+ saldo.getText()+"\n";
            System.out.println(almacenadordemovimientos);
            }
            
           //Retiro
           if(retiropresionado == true){

           MONTO = Double.parseDouble(monto.getText());
           SALDO = Double.parseDouble(usuario1[5]);
           
          
           saldonuevo = ope.operaciones_retiro(MONTO, SALDO);
           montoo = ope.operaciones_retiro_regresar_monto();
           
           usuario1[5] = String.valueOf(saldonuevo);
           
               if(MONTO > 5000 || MONTO>SALDO){
                   almacenadordemovimientos += "Retiro Cancelado por Restricciones\n";
                   System.out.println(almacenadordemovimientos);
               }
               else{
               almacenadordemovimientos += "Hiciste un retiro - Monto del Retiro $ "+ String.valueOf(montoo)+"\n";
               System.out.println(almacenadordemovimientos);
               }
           
           
           
          
           }
           
           
           //Depósito
           if(depositopresionado == true){
           MONTODEPOSITO = Double.parseDouble(monto.getText());
           SALDODEPOSITO = Double.parseDouble(usuario1[5]);
           
           saldonuevodeposito = ope.operaciones_deposito(MONTODEPOSITO, SALDODEPOSITO);
           usuario1[5] = String.valueOf(saldonuevodeposito);
           almacenadordemovimientos += "Hiciste un deposito - Monto del Déposito $ "+ MONTODEPOSITO+"\n";
           System.out.println(almacenadordemovimientos);
           }
           
           //Transferencia
           if(transferenciapresionado == true){
                if(numerotarjeta.getText().equals(tarjeta1.getText())){
                vis.mensaje_mismousuario();
                almacenadordemovimientos+= "No se pudo llevar a cabo la transacción por excepciones\n";
               }
                else{
                    if("".equals(tarjeta1.getText())){
                        vis.mensaje_introduce_numerotarjeta();
                    }
                    else{
                        if("".equals(monto.getText())){
                        vis.mensaje_introduce_monto();
                    }
                    else{
                         //Recibir numero de tarjeta
                     guardarnumerodetarjeta = tarjeta1.getText();
                     System.out.println(guardarnumerodetarjeta);
                     
                    //Segun sea el numero de tarjeta se hara el deposito y retiro correspondiente
               switch(guardarnumerodetarjeta){
                   case "0001":
                   {
                       vis.mensaje_mismousuario();
                       almacenadordemovimientos+= "No fue posible realizar transacción\n";
                   }
                   case "0002":
                   {
                    MONTO = Double.parseDouble(monto.getText());
                    SALDO = Double.parseDouble(usuario1[5]);
                    saldonuevo = ope.operaciones_transferencia_persona_1_retiro(MONTO, SALDO);
                    montoo = ope.operaciones_retiro_regresar_monto();
                    System.out.println(montoo);
                    if(montoo==0){
                        
                    }
                    else{
                        //A usuario 1 se le asigna el sueldo nuevo
                     usuario1[5] = String.valueOf(saldonuevo);
                     //Operaciones del deposito
                        double valorcuenta2 = Double.parseDouble(usuario2[5] );
                         System.out.println(valorcuenta2);
                         double valorcuenta2total = valorcuenta2 + montoo;
                        System.out.println(valorcuenta2total);
                        almacenadordemovimientos2 += "Se hizo una transferencia a tu cuenta de $: "+montoo +" desde la cuenta 0001\n";
                        System.out.println(almacenadordemovimientos2);
                        usuario2[5] = String.valueOf(valorcuenta2total);
                        vis.visualizar_transferencia(guardarnumerodetarjeta);
                        almacenadordemovimientos+= "Hiciste una transferencia de: $"+montoo+" a la cuenta "+guardarnumerodetarjeta+"\n";
                       
                    }
                   
           
                    break;
                   }
                   case "0003":
                   {
                    MONTO = Double.parseDouble(monto.getText());
                    SALDO = Double.parseDouble(usuario1[5]);
                    saldonuevo3 = ope.operaciones_transferencia_persona_1_retiro(MONTO, SALDO);
                    montoo = ope.operaciones_retiro_regresar_monto();
                    System.out.println(montoo);
                    if(montoo==0){
                        
                    }
                    else{
                        //A usuario 1 se le asigna el sueldo nuevo
                     usuario1[5] = String.valueOf(saldonuevo3);
                     //Operaciones del deposito
                        double valorcuenta2 = Double.parseDouble(usuario3[5] );
                         System.out.println(valorcuenta2);
                         double valorcuenta2total = valorcuenta2 + montoo;

                        System.out.println(valorcuenta2total);
                        almacenadordemovimientos3 += "Se hizo una transferencia a tu cuenta de $: "+montoo +" desde la cuenta 0001\n";
                        System.out.println(almacenadordemovimientos3);
                        usuario3[5] = String.valueOf(valorcuenta2total);
                        vis.visualizar_transferencia(guardarnumerodetarjeta);
                        almacenadordemovimientos+= "Hiciste una transferencia de: $"+montoo+" a la cuenta "+guardarnumerodetarjeta+"\n";
                       
                    }
                        
                        break;
                   }
                   case "0004":
                   {
                        MONTO = Double.parseDouble(monto.getText());
                    SALDO = Double.parseDouble(usuario1[5]);
                       saldonuevo4 = ope.operaciones_transferencia_persona_1_retiro(MONTO, SALDO);
                    montoo = ope.operaciones_retiro_regresar_monto();
                    System.out.println(montoo);
                    if(montoo==0){
                        
                    }
                    else{
                        //A usuario 1 se le asigna el sueldo nuevo
                     usuario1[5] = String.valueOf(saldonuevo4);
                     //Operaciones del deposito
                        double valorcuenta2 = Double.parseDouble(usuario4[5] );
                         System.out.println(valorcuenta2);
                         double valorcuenta2total = valorcuenta2 + montoo;
                        System.out.println(valorcuenta2total);
                        almacenadordemovimientos4 += "Se hizo una transferencia a tu cuenta de $: "+montoo +" desde la cuenta 0001\n";
                        System.out.println(almacenadordemovimientos4);
                        usuario4[5] = String.valueOf(valorcuenta2total);
                        vis.visualizar_transferencia(guardarnumerodetarjeta);
                        almacenadordemovimientos+= "Hiciste una transferencia de: $"+montoo+" a la cuenta "+guardarnumerodetarjeta+"\n";
                       
                    }
                        break;
                   }
                   case "0005":
                   {
                        MONTO = Double.parseDouble(monto.getText());
                    SALDO = Double.parseDouble(usuario1[5]);
                       saldonuevo5 = ope.operaciones_transferencia_persona_1_retiro(MONTO, SALDO);
                    montoo = ope.operaciones_retiro_regresar_monto();
                    System.out.println(montoo);
                    if(montoo==0){
                        
                    }
                    else{
                        //A usuario 1 se le asigna el sueldo nuevo
                     usuario1[5] = String.valueOf(saldonuevo5);
                     //Operaciones del deposito
                       double valorcuenta2 = Double.parseDouble(usuario5[5] );
                         System.out.println(valorcuenta2);
                         double valorcuenta2total = valorcuenta2 + montoo;
                        System.out.println(valorcuenta2total);
                        almacenadordemovimientos5 += "Se hizo una transferencia a tu cuenta de $: "+montoo +" desde la cuenta 0001\n";
                        System.out.println(almacenadordemovimientos5);
                        usuario5[5] = String.valueOf(valorcuenta2total);
                        vis.visualizar_transferencia(guardarnumerodetarjeta);
                        almacenadordemovimientos+= "Hiciste una transferencia de: $"+montoo+" a la cuenta "+guardarnumerodetarjeta+"\n";
                       
                    }
                        break;
                   }
                   case "0006":
                   {
                        MONTO = Double.parseDouble(monto.getText());
                    SALDO = Double.parseDouble(usuario1[5]);
                       saldonuevo6 = ope.operaciones_transferencia_persona_1_retiro(MONTO, SALDO);
                    montoo = ope.operaciones_retiro_regresar_monto();
                    System.out.println(montoo);
                    if(montoo==0){
                        
                    }
                    else{
                        //A usuario 1 se le asigna el sueldo nuevo
                     usuario1[5] = String.valueOf(saldonuevo6);
                     //Operaciones del deposito
                        double valorcuenta2 = Double.parseDouble(usuario6[5] );
                         System.out.println(valorcuenta2);
                         double valorcuenta2total = valorcuenta2 + montoo;
                        System.out.println(valorcuenta2total);
                        almacenadordemovimientos6 += "Se hizo una transferencia a tu cuenta de $: "+montoo +" desde la cuenta 0001\n";
                        System.out.println(almacenadordemovimientos6);
                        usuario6[5] = String.valueOf(valorcuenta2total);
                        vis.visualizar_transferencia(guardarnumerodetarjeta);
                        almacenadordemovimientos+= "Hiciste una transferencia de: $"+montoo+" a la cuenta "+guardarnumerodetarjeta+"\n";
                       
                    }
                        break;
                   }
                   case "0007":
                   {
                        MONTO = Double.parseDouble(monto.getText());
                    SALDO = Double.parseDouble(usuario1[5]);
                      saldonuevo7 = ope.operaciones_transferencia_persona_1_retiro(MONTO, SALDO);
                    montoo = ope.operaciones_retiro_regresar_monto();
                    System.out.println(montoo);
                    if(montoo==0){
                        
                    }
                    else{
                        //A usuario 1 se le asigna el sueldo nuevo
                     usuario1[5] = String.valueOf(saldonuevo7);
                     //Operaciones del deposito
                        double valorcuenta2 = Double.parseDouble(usuario7[5] );
                         System.out.println(valorcuenta2);
                         double valorcuenta2total = valorcuenta2 + montoo;
                        System.out.println(valorcuenta2total);
                        almacenadordemovimientos7 += "Se hizo una transferencia a tu cuenta de $: "+montoo +" desde la cuenta 0001\n";
                        System.out.println(almacenadordemovimientos7);
                        usuario7[5] = String.valueOf(valorcuenta2total);
                        vis.visualizar_transferencia(guardarnumerodetarjeta);
                        almacenadordemovimientos+= "Hiciste una transferencia de: $"+montoo+" a la cuenta "+guardarnumerodetarjeta+"\n";
                       
                    }
                   }
                   case "0008":
                   {
                        MONTO = Double.parseDouble(monto.getText());
                    SALDO = Double.parseDouble(usuario1[5]);
                       saldonuevo8 = ope.operaciones_transferencia_persona_1_retiro(MONTO, SALDO);
                    montoo = ope.operaciones_retiro_regresar_monto();
                    System.out.println(montoo);
                    if(montoo==0){
                        
                    }
                    else{
                        //A usuario 1 se le asigna el sueldo nuevo
                     usuario1[5] = String.valueOf(saldonuevo8);
                     //Operaciones del deposito
                        double valorcuenta2 = Double.parseDouble(usuario8[5] );
                         System.out.println(valorcuenta2);
                         double valorcuenta2total = valorcuenta2 + montoo;
                        System.out.println(valorcuenta2total);
                        almacenadordemovimientos8 += "Se hizo una transferencia a tu cuenta de $: "+montoo +" desde la cuenta 0001\n";
                        System.out.println(almacenadordemovimientos8);
                        usuario8[5] = String.valueOf(valorcuenta2total);
                        vis.visualizar_transferencia(guardarnumerodetarjeta);
                        almacenadordemovimientos+= "Hiciste una transferencia de: $"+montoo+" a la cuenta "+guardarnumerodetarjeta+"\n";
                       
                    }
                        break;
                   }
                   case "0009":
                   {
                        MONTO = Double.parseDouble(monto.getText());
                    SALDO = Double.parseDouble(usuario1[5]);
                       saldonuevo9 = ope.operaciones_transferencia_persona_1_retiro(MONTO, SALDO);
                    montoo = ope.operaciones_retiro_regresar_monto();
                    System.out.println(montoo);
                    if(montoo==0){
                        
                    }
                    else{
                        //A usuario 1 se le asigna el sueldo nuevo
                     usuario1[5] = String.valueOf(saldonuevo9);
                     //Operaciones del deposito
                        double valorcuenta2 = Double.parseDouble(usuario9[5] );
                         System.out.println(valorcuenta2);
                         double valorcuenta2total = valorcuenta2 + montoo;
                        System.out.println(valorcuenta2total);
                        almacenadordemovimientos9 += "Se hizo una transferencia a tu cuenta de $: "+montoo +" desde la cuenta 0001\n";
                        System.out.println(almacenadordemovimientos9);
                        usuario9[5] = String.valueOf(valorcuenta2total);
                        vis.visualizar_transferencia(guardarnumerodetarjeta);
                        almacenadordemovimientos+= "Hiciste una transferencia de: $"+montoo+" a la cuenta "+guardarnumerodetarjeta+"\n";
                       
                    }
                        break;
                   }
                   case "0010":
                   {
                        MONTO = Double.parseDouble(monto.getText());
                    SALDO = Double.parseDouble(usuario1[5]);
                       saldonuevo10 = ope.operaciones_transferencia_persona_1_retiro(MONTO, SALDO);
                    montoo = ope.operaciones_retiro_regresar_monto();
                    System.out.println(montoo);
                    if(montoo==0){
                        
                    }
                    else{
                        //A usuario 1 se le asigna el sueldo nuevo
                     usuario1[5] = String.valueOf(saldonuevo10);
                     //Operaciones del deposito
                       double valorcuenta2 = Double.parseDouble(usuario10[5] );
                         System.out.println(valorcuenta2);
                         double valorcuenta2total = valorcuenta2 + montoo;
                        System.out.println(valorcuenta2total);
                        almacenadordemovimientos10 += "Se hizo una transferencia a tu cuenta de $: "+montoo +" desde la cuenta 0001\n";
                        System.out.println(almacenadordemovimientos10);
                        usuario10[5] = String.valueOf(valorcuenta2total);
                        vis.visualizar_transferencia(guardarnumerodetarjeta);
                        almacenadordemovimientos+= "Hiciste una transferencia de: $"+montoo+" a la cuenta "+guardarnumerodetarjeta+"\n";
                       
                    }
                        break;
                   }
                    default:
                   {
                       vis.usuario_no_existente();
                       almacenadordemovimientos+= "No fue posible realizar transacción\n";
                   }
                   
               }
                    }
                    }
                   
                }
           }

           
           //Movimientos
           if(movimientospresionado == true){
              
               //vis.visualizar_movimientos(almacenadordemovimientos);
               
           }
            
        }
             
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////
        if("0002".equals(numerotarjeta.getText())){
           if(consultarsaldopresionado == true){
            saldo.setText(usuario2[5]);
            almacenadordemovimientos2 += "Hiciste una consulta - Saldo Moméntaneo $ "+ saldo.getText()+"\n";
            System.out.println(almacenadordemovimientos2);
            }
           
           //Retiro
           if(retiropresionado == true){
           MONTO = Double.parseDouble(monto.getText());
           SALDO = Double.parseDouble(usuario2[5]);
           saldonuevo2 = ope.operaciones_retiro(MONTO, SALDO);
           montoo = ope.operaciones_retiro_regresar_monto();
           
           usuario2[5] = String.valueOf(saldonuevo2);
           
               if(MONTO > 5000 || MONTO>SALDO){
                   almacenadordemovimientos2 += "Retiro Cancelado por Restricciones\n";
                   System.out.println(almacenadordemovimientos2);
               }
               else{
               almacenadordemovimientos2 += "Hiciste un retiro - Monto del Retiro $ "+ String.valueOf(montoo)+"\n";
               System.out.println(almacenadordemovimientos2);
               }
           }
           
           
           //Depósito
           if(depositopresionado == true){
           MONTODEPOSITO = Double.parseDouble(monto.getText());
           SALDODEPOSITO = Double.parseDouble(usuario2[5]);
           saldonuevodeposito = ope.operaciones_deposito(MONTODEPOSITO, SALDODEPOSITO);
           usuario2[5] = String.valueOf(saldonuevodeposito);
           almacenadordemovimientos2 += "Hiciste un deposito - Monto del Déposito $ "+ MONTODEPOSITO+"\n";
           System.out.println(almacenadordemovimientos2);
           }
           
           
           //Transferencia
           if(transferenciapresionado == true){
                if(numerotarjeta.getText().equals(tarjeta1.getText())){
                vis.mensaje_mismousuario();
                almacenadordemovimientos2+= "No se pudo llevar a cabo la transacción por excepciones\n";
               }
                else{
                    if("".equals(tarjeta1.getText())){
                        vis.mensaje_introduce_numerotarjeta();
                    }
                    else{
                        if("".equals(monto.getText())){
                        vis.mensaje_introduce_monto();
                    }
                    else{
                         //Recibir numero de tarjeta
                     guardarnumerodetarjeta = tarjeta1.getText();
                     System.out.println(guardarnumerodetarjeta);
                     
                    //Segun sea el numero de tarjeta se hara el deposito y retiro correspondiente
               switch(guardarnumerodetarjeta){
                   case "0002":
                   {
                       vis.mensaje_mismousuario();
                       almacenadordemovimientos2+= "No fue posible realizar transacción\n";
                   }
                   case "0001":
                   {
                    MONTO = Double.parseDouble(monto.getText());
                    SALDO = Double.parseDouble(usuario2[5]);
                    saldonuevo = ope.operaciones_transferencia_persona_1_retiro(MONTO, SALDO);
                    montoo = ope.operaciones_retiro_regresar_monto();
                    System.out.println(montoo);
                    if(montoo==0){
                        
                    }
                    else{
                        //A usuario 2 se le asigna el sueldo nuevo
                     usuario2[5] = String.valueOf(saldonuevo);
                     //Operaciones del deposito
                        double valorcuenta2 = Double.parseDouble(usuario1[5] );
                        System.out.println(valorcuenta2);
                        double valorcuenta2total = valorcuenta2 + montoo;

                        System.out.println(valorcuenta2total);
                        almacenadordemovimientos += "Se hizo una transferencia a tu cuenta de $: "+montoo +" desde la cuenta 0002\n";
                        System.out.println(almacenadordemovimientos);
                        usuario1[5] = String.valueOf(valorcuenta2total);
                        vis.visualizar_transferencia(guardarnumerodetarjeta);
                        almacenadordemovimientos2+= "Hiciste una transferencia de: $"+montoo+" a la cuenta "+guardarnumerodetarjeta+"\n";
                       
                    }
                   
           
                    break;
                   }
                   case "0003":
                   {
                       MONTO = Double.parseDouble(monto.getText());
                    SALDO = Double.parseDouble(usuario2[5]);
                    saldonuevo3 = ope.operaciones_transferencia_persona_1_retiro(MONTO, SALDO);
                    montoo = ope.operaciones_retiro_regresar_monto();
                    System.out.println(montoo);
                    if(montoo==0){
                        
                    }
                    else{
                        //A usuario 2 se le asigna el sueldo nuevo
                     usuario2[5] = String.valueOf(saldonuevo3);
                     //Operaciones del deposito
                        double valorcuenta2 = Double.parseDouble(usuario3[5] );
                         System.out.println(valorcuenta2);
                         double valorcuenta2total = valorcuenta2 + montoo;
                        System.out.println(valorcuenta2total);
                        almacenadordemovimientos3 += "Se hizo una transferencia a tu cuenta de $: "+montoo +" desde la cuenta 0002\n";
                        System.out.println(almacenadordemovimientos3);
                        usuario3[5] = String.valueOf(valorcuenta2total);
                        vis.visualizar_transferencia(guardarnumerodetarjeta);
                        almacenadordemovimientos2+= "Hiciste una transferencia de: $"+montoo+" a la cuenta "+guardarnumerodetarjeta+"\n";
                       
                    }
                        
                        break;
                   }
                   case "0004":
                   {
                       MONTO = Double.parseDouble(monto.getText());
                    SALDO = Double.parseDouble(usuario2[5]);
                       saldonuevo4 = ope.operaciones_transferencia_persona_1_retiro(MONTO, SALDO);
                    montoo = ope.operaciones_retiro_regresar_monto();
                    System.out.println(montoo);
                    if(montoo==0){
                        
                    }
                    else{
                        //A usuario 2 se le asigna el sueldo nuevo
                     usuario2[5] = String.valueOf(saldonuevo4);
                     //Operaciones del deposito
                        double valorcuenta2 = Double.parseDouble(usuario4[5] );
                         System.out.println(valorcuenta2);
                         double valorcuenta2total = valorcuenta2 + montoo;
                        System.out.println(valorcuenta2total);
                        almacenadordemovimientos4 += "Se hizo una transferencia a tu cuenta de $: "+montoo +" desde la cuenta 0002\n";
                        System.out.println(almacenadordemovimientos4);
                        usuario4[5] = String.valueOf(valorcuenta2total);
                        vis.visualizar_transferencia(guardarnumerodetarjeta);
                        almacenadordemovimientos2+= "Hiciste una transferencia de: $"+montoo+" a la cuenta "+guardarnumerodetarjeta+"\n";
                       
                    }
                        break;
                   }
                   case "0005":
                   {
                       MONTO = Double.parseDouble(monto.getText());
                    SALDO = Double.parseDouble(usuario2[5]);
                       saldonuevo5 = ope.operaciones_transferencia_persona_1_retiro(MONTO, SALDO);
                    montoo = ope.operaciones_retiro_regresar_monto();
                    System.out.println(montoo);
                    if(montoo==0){
                        
                    }
                    else{
                        //A usuario 1 se le asigna el sueldo nuevo
                     usuario2[5] = String.valueOf(saldonuevo5);
                     //Operaciones del deposito
                        double valorcuenta2 = Double.parseDouble(usuario5[5] );
                         System.out.println(valorcuenta2);
                         double valorcuenta2total = valorcuenta2 + montoo;
                        System.out.println(valorcuenta2total);
                        almacenadordemovimientos5 += "Se hizo una transferencia a tu cuenta de $: "+montoo +" desde la cuenta 0002\n";
                        System.out.println(almacenadordemovimientos5);
                        usuario5[5] = String.valueOf(valorcuenta2total);
                        vis.visualizar_transferencia(guardarnumerodetarjeta);
                        almacenadordemovimientos2+= "Hiciste una transferencia de: $"+montoo+" a la cuenta "+guardarnumerodetarjeta+"\n";
                       
                    }
                        break;
                   }
                   case "0006":
                   {
                       MONTO = Double.parseDouble(monto.getText());
                    SALDO = Double.parseDouble(usuario2[5]);
                       saldonuevo6 = ope.operaciones_transferencia_persona_1_retiro(MONTO, SALDO);
                    montoo = ope.operaciones_retiro_regresar_monto();
                    System.out.println(montoo);
                    if(montoo==0){
                        
                    }
                    else{
                        //A usuario 1 se le asigna el sueldo nuevo
                     usuario2[5] = String.valueOf(saldonuevo6);
                     //Operaciones del deposito
                        double valorcuenta2 = Double.parseDouble(usuario6[5] );
                         System.out.println(valorcuenta2);
                         double valorcuenta2total = valorcuenta2 + montoo;
                        System.out.println(valorcuenta2total);
                        almacenadordemovimientos6 += "Se hizo una transferencia a tu cuenta de $: "+montoo +" desde la cuenta 0002\n";
                        System.out.println(almacenadordemovimientos6);
                        usuario6[5] = String.valueOf(valorcuenta2total);
                        vis.visualizar_transferencia(guardarnumerodetarjeta);
                        almacenadordemovimientos2+= "Hiciste una transferencia de: $"+montoo+" a la cuenta "+guardarnumerodetarjeta+"\n";
                       
                    }
                        break;
                   }
                   case "0007":
                   {
                       MONTO = Double.parseDouble(monto.getText());
                    SALDO = Double.parseDouble(usuario2[5]);
                      saldonuevo7 = ope.operaciones_transferencia_persona_1_retiro(MONTO, SALDO);
                    montoo = ope.operaciones_retiro_regresar_monto();
                    System.out.println(montoo);
                    if(montoo==0){
                        
                    }
                    else{
                        //A usuario 1 se le asigna el sueldo nuevo
                     usuario2[5] = String.valueOf(saldonuevo7);
                     //Operaciones del deposito
                        double valorcuenta2 = Double.parseDouble(usuario7[5] );
                         System.out.println(valorcuenta2);
                         double valorcuenta2total = valorcuenta2 + montoo;
                        System.out.println(valorcuenta2total);
                        almacenadordemovimientos7 += "Se hizo una transferencia a tu cuenta de $: "+montoo +" desde la cuenta 0002\n";
                        System.out.println(almacenadordemovimientos7);
                        usuario7[5] = String.valueOf(valorcuenta2total);
                        vis.visualizar_transferencia(guardarnumerodetarjeta);
                        almacenadordemovimientos2+= "Hiciste una transferencia de: $"+montoo+" a la cuenta "+guardarnumerodetarjeta+"\n";
                       
                    }
                   }
                   case "0008":
                   {
                       MONTO = Double.parseDouble(monto.getText());
                    SALDO = Double.parseDouble(usuario2[5]);
                       saldonuevo8 = ope.operaciones_transferencia_persona_1_retiro(MONTO, SALDO);
                    montoo = ope.operaciones_retiro_regresar_monto();
                    System.out.println(montoo);
                    if(montoo==0){
                        
                    }
                    else{
                        //A usuario 1 se le asigna el sueldo nuevo
                     usuario2[5] = String.valueOf(saldonuevo8);
                     //Operaciones del deposito
                        double valorcuenta2 = Double.parseDouble(usuario8[5] );
                         System.out.println(valorcuenta2);
                         double valorcuenta2total = valorcuenta2 + montoo;
                        System.out.println(valorcuenta2total);
                        almacenadordemovimientos8 += "Se hizo una transferencia a tu cuenta de $: "+montoo +" desde la cuenta 0002\n";
                        System.out.println(almacenadordemovimientos8);
                        usuario8[5] = String.valueOf(valorcuenta2total);
                        vis.visualizar_transferencia(guardarnumerodetarjeta);
                        almacenadordemovimientos2+= "Hiciste una transferencia de: $"+montoo+" a la cuenta "+guardarnumerodetarjeta+"\n";
                       
                    }
                        break;
                   }
                   case "0009":
                   {
                       MONTO = Double.parseDouble(monto.getText());
                    SALDO = Double.parseDouble(usuario2[5]);
                       saldonuevo9 = ope.operaciones_transferencia_persona_1_retiro(MONTO, SALDO);
                    montoo = ope.operaciones_retiro_regresar_monto();
                    System.out.println(montoo);
                    if(montoo==0){
                        
                    }
                    else{
                        //A usuario 1 se le asigna el sueldo nuevo
                     usuario2[5] = String.valueOf(saldonuevo9);
                     //Operaciones del deposito
                        double valorcuenta2 = Double.parseDouble(usuario9[5] );
                         System.out.println(valorcuenta2);
                         double valorcuenta2total = valorcuenta2 + montoo;
                        System.out.println(valorcuenta2total);
                        almacenadordemovimientos9 += "Se hizo una transferencia a tu cuenta de $: "+montoo +" desde la cuenta 0002\n";
                        System.out.println(almacenadordemovimientos9);
                        usuario9[5] = String.valueOf(valorcuenta2total);
                        vis.visualizar_transferencia(guardarnumerodetarjeta);
                        almacenadordemovimientos2+= "Hiciste una transferencia de: $"+montoo+" a la cuenta "+guardarnumerodetarjeta+"\n";
                       
                    }
                        break;
                   }
                   case "0010":
                   {
                       MONTO = Double.parseDouble(monto.getText());
                    SALDO = Double.parseDouble(usuario2[5]);
                       saldonuevo10 = ope.operaciones_transferencia_persona_1_retiro(MONTO, SALDO);
                    montoo = ope.operaciones_retiro_regresar_monto();
                    System.out.println(montoo);
                    if(montoo==0){
                        
                    }
                    else{
                        //A usuario 1 se le asigna el sueldo nuevo
                     usuario2[5] = String.valueOf(saldonuevo10);
                     //Operaciones del deposito
                        double valorcuenta2 = Double.parseDouble(usuario10[5] );
                         System.out.println(valorcuenta2);
                         double valorcuenta2total = valorcuenta2 + montoo;
                        System.out.println(valorcuenta2total);
                        almacenadordemovimientos10 += "Se hizo una transferencia a tu cuenta de $: "+montoo +" desde la cuenta 0002\n";
                        System.out.println(almacenadordemovimientos10);
                        usuario10[5] = String.valueOf(valorcuenta2total);
                        vis.visualizar_transferencia(guardarnumerodetarjeta);
                        almacenadordemovimientos2+= "Hiciste una transferencia de: $"+montoo+" a la cuenta "+guardarnumerodetarjeta+"\n";
                       
                    }
                        break;
                   }
                    default:
                   {
                       vis.usuario_no_existente();
                       almacenadordemovimientos2+= "No fue posible realizar transacción\n";
                   }
                   
               }
                    }
                    }
                   
                }
           }

           
           //Movimientos
           if(movimientospresionado == true){
               //vis.visualizar_movimientos(almacenadordemovimientos);
               
           }
        }
        ///////////////////////////////////////////////////////////////////////
        if("0003".equals(numerotarjeta.getText())){
            
            if(consultarsaldopresionado == true){
            saldo.setText(usuario3[5]);
            almacenadordemovimientos3 += "Hiciste una consulta - Saldo Moméntaneo $ "+ saldo.getText()+"\n";
            System.out.println(almacenadordemovimientos3);
            }
           
           //Retiro
           if(retiropresionado == true){
           MONTO = Double.parseDouble(monto.getText());
           SALDO = Double.parseDouble(usuario3[5]);
           saldonuevo3 = ope.operaciones_retiro(MONTO, SALDO);
           montoo = ope.operaciones_retiro_regresar_monto();
           
           usuario3[5] = String.valueOf(saldonuevo3);
           
               if(MONTO > 5000 || MONTO>SALDO){
                   almacenadordemovimientos3 += "Retiro Cancelado por Restricciones\n";
                   System.out.println(almacenadordemovimientos3);
               }
               else{
               almacenadordemovimientos += "Hiciste un retiro - Monto del Retiro $ "+ String.valueOf(montoo)+"\n";
               System.out.println(almacenadordemovimientos);
               }
           }
           
           
           //Depósito
           if(depositopresionado == true){
           MONTODEPOSITO = Double.parseDouble(monto.getText());
           SALDODEPOSITO = Double.parseDouble(usuario3[5]);
           saldonuevodeposito = ope.operaciones_deposito(MONTODEPOSITO, SALDODEPOSITO);
           usuario3[5] = String.valueOf(saldonuevodeposito);
           almacenadordemovimientos3 += "Hiciste un deposito - Monto del Déposito $ "+ MONTODEPOSITO+"\n";
           System.out.println(almacenadordemovimientos3);
           }
           
           
           //Transferencia 
           if(transferenciapresionado == true){
                if(numerotarjeta.getText().equals(tarjeta1.getText())){
                vis.mensaje_mismousuario();
                almacenadordemovimientos3+= "No se pudo llevar a cabo la transacción por excepciones\n";
               }
                else{
                    if("".equals(tarjeta1.getText())){
                        vis.mensaje_introduce_numerotarjeta();
                    }
                    else{
                        if("".equals(monto.getText())){
                        vis.mensaje_introduce_monto();
                    }
                    else{
                         //Recibir numero de tarjeta
                     guardarnumerodetarjeta = tarjeta1.getText();
                     System.out.println(guardarnumerodetarjeta);
                     
                    //Segun sea el numero de tarjeta se hara el deposito y retiro correspondiente
               switch(guardarnumerodetarjeta){
                   case "0003":
                   {
                       vis.mensaje_mismousuario();
                       almacenadordemovimientos3+= "No fue posible realizar transacción\n";
                   }
                   case "0002":
                   {
                       MONTO = Double.parseDouble(monto.getText());
                    SALDO = Double.parseDouble(usuario3[5]);
                    saldonuevo2 = ope.operaciones_transferencia_persona_1_retiro(MONTO, SALDO);
                    montoo = ope.operaciones_retiro_regresar_monto();
                    System.out.println(montoo);
                    if(montoo==0){
                        
                    }
                    else{
                        //A usuario 3 se le asigna el sueldo nuevo
                     usuario3[5] = String.valueOf(saldonuevo2);
                     //Operaciones del deposito
                        double valorcuenta2 = Double.parseDouble(usuario2[5] );
                         System.out.println(valorcuenta2);
                         double valorcuenta2total = valorcuenta2 + montoo;
                        System.out.println(valorcuenta2total);
                        almacenadordemovimientos2 += "Se hizo una transferencia a tu cuenta de $: "+montoo +" desde la cuenta 0003\n";
                        System.out.println(almacenadordemovimientos2);
                        usuario2[5] = String.valueOf(valorcuenta2total);
                        vis.visualizar_transferencia(guardarnumerodetarjeta);
                        almacenadordemovimientos3+= "Hiciste una transferencia de: $"+montoo+" a la cuenta "+guardarnumerodetarjeta+"\n";
                       
                    }
                   
           
                    break;
                   }
                   case "0001":
                   {
                    MONTO = Double.parseDouble(monto.getText());
                    SALDO = Double.parseDouble(usuario3[5]);
                    saldonuevo = ope.operaciones_transferencia_persona_1_retiro(MONTO, SALDO);
                    montoo = ope.operaciones_retiro_regresar_monto();
                    System.out.println(montoo);
                    if(montoo==0){
                        
                    }
                    else{
                        //A usuario 1 se le asigna el sueldo nuevo
                     usuario3[5] = String.valueOf(saldonuevo);
                     //Operaciones del deposito
                        double valorcuenta2 = Double.parseDouble(usuario1[5] );
                         System.out.println(valorcuenta2);
                         double valorcuenta2total = valorcuenta2 + montoo;

                        System.out.println(valorcuenta2total);
                        almacenadordemovimientos += "Se hizo una transferencia a tu cuenta de $: "+montoo +" desde la cuenta 0003\n";
                        System.out.println(almacenadordemovimientos);
                        usuario1[5] = String.valueOf(valorcuenta2total);
                        vis.visualizar_transferencia(guardarnumerodetarjeta);
                        almacenadordemovimientos3+= "Hiciste una transferencia de: $"+montoo+" a la cuenta "+guardarnumerodetarjeta+"\n";
                       
                    }
                        
                        break;
                   }
                   case "0004":
                   {
                       MONTO = Double.parseDouble(monto.getText());
                    SALDO = Double.parseDouble(usuario3[5]);
                       saldonuevo4 = ope.operaciones_transferencia_persona_1_retiro(MONTO, SALDO);
                    montoo = ope.operaciones_retiro_regresar_monto();
                    System.out.println(montoo);
                    if(montoo==0){
                        
                    }
                    else{
                        //A usuario 1 se le asigna el sueldo nuevo
                     usuario3[5] = String.valueOf(saldonuevo4);
                     //Operaciones del deposito
                        double valorcuenta2 = Double.parseDouble(usuario4[5] );
                         System.out.println(valorcuenta2);
                         double valorcuenta2total = valorcuenta2 + montoo;
                        System.out.println(valorcuenta2total);
                        almacenadordemovimientos4 += "Se hizo una transferencia a tu cuenta de $: "+montoo +" desde la cuenta 0003\n";
                        System.out.println(almacenadordemovimientos4);
                        usuario4[5] = String.valueOf(valorcuenta2total);
                        vis.visualizar_transferencia(guardarnumerodetarjeta);
                        almacenadordemovimientos3+= "Hiciste una transferencia de: $"+montoo+" a la cuenta "+guardarnumerodetarjeta+"\n";
                       
                    }
                        break;
                   }
                   case "0005":
                   {
                       MONTO = Double.parseDouble(monto.getText());
                    SALDO = Double.parseDouble(usuario3[5]);
                       saldonuevo5 = ope.operaciones_transferencia_persona_1_retiro(MONTO, SALDO);
                    montoo = ope.operaciones_retiro_regresar_monto();
                    System.out.println(montoo);
                    if(montoo==0){
                        
                    }
                    else{
                        //A usuario 1 se le asigna el sueldo nuevo
                     usuario3[5] = String.valueOf(saldonuevo5);
                     //Operaciones del deposito
                        double valorcuenta2 = Double.parseDouble(usuario5[5] );
                         System.out.println(valorcuenta2);
                         double valorcuenta2total = valorcuenta2 + montoo;
                        System.out.println(valorcuenta2total);
                        almacenadordemovimientos5 += "Se hizo una transferencia a tu cuenta de $: "+montoo +" desde la cuenta 0003\n";
                        System.out.println(almacenadordemovimientos5);
                        usuario5[5] = String.valueOf(valorcuenta2total);
                        vis.visualizar_transferencia(guardarnumerodetarjeta);
                        almacenadordemovimientos3+= "Hiciste una transferencia de: $"+montoo+" a la cuenta "+guardarnumerodetarjeta+"\n";
                       
                    }
                        break;
                   }
                   case "0006":
                   {
                       MONTO = Double.parseDouble(monto.getText());
                    SALDO = Double.parseDouble(usuario3[5]);
                       saldonuevo6 = ope.operaciones_transferencia_persona_1_retiro(MONTO, SALDO);
                    montoo = ope.operaciones_retiro_regresar_monto();
                    System.out.println(montoo);
                    if(montoo==0){
                        
                    }
                    else{
                        //A usuario 1 se le asigna el sueldo nuevo
                     usuario3[5] = String.valueOf(saldonuevo6);
                     //Operaciones del deposito
                        double valorcuenta2 = Double.parseDouble(usuario6[5] );
                         System.out.println(valorcuenta2);
                         double valorcuenta2total = valorcuenta2 + montoo;
                        System.out.println(valorcuenta2total);
                        almacenadordemovimientos6 += "Se hizo una transferencia a tu cuenta de $: "+montoo +" desde la cuenta 0003\n";
                        System.out.println(almacenadordemovimientos6);
                        usuario6[5] = String.valueOf(valorcuenta2total);
                        vis.visualizar_transferencia(guardarnumerodetarjeta);
                        almacenadordemovimientos3+= "Hiciste una transferencia de: $"+montoo+" a la cuenta "+guardarnumerodetarjeta+"\n";
                       
                    }
                        break;
                   }
                   case "0007":
                   {
                       MONTO = Double.parseDouble(monto.getText());
                    SALDO = Double.parseDouble(usuario3[5]);
                      saldonuevo7 = ope.operaciones_transferencia_persona_1_retiro(MONTO, SALDO);
                    montoo = ope.operaciones_retiro_regresar_monto();
                    System.out.println(montoo);
                    if(montoo==0){
                        
                    }
                    else{
                        //A usuario 1 se le asigna el sueldo nuevo
                     usuario3[5] = String.valueOf(saldonuevo7);
                     //Operaciones del deposito
                       double valorcuenta2 = Double.parseDouble(usuario7[5] );
                         System.out.println(valorcuenta2);
                         double valorcuenta2total = valorcuenta2 + montoo;
                        System.out.println(valorcuenta2total);
                        almacenadordemovimientos7 += "Se hizo una transferencia a tu cuenta de $: "+montoo +" desde la cuenta 0003\n";
                        System.out.println(almacenadordemovimientos7);
                        usuario7[5] = String.valueOf(valorcuenta2total);
                        vis.visualizar_transferencia(guardarnumerodetarjeta);
                        almacenadordemovimientos3+= "Hiciste una transferencia de: $"+montoo+" a la cuenta "+guardarnumerodetarjeta+"\n";
                       
                    }
                   }
                   case "0008":
                   {
                       MONTO = Double.parseDouble(monto.getText());
                    SALDO = Double.parseDouble(usuario3[5]);
                       saldonuevo8 = ope.operaciones_transferencia_persona_1_retiro(MONTO, SALDO);
                    montoo = ope.operaciones_retiro_regresar_monto();
                    System.out.println(montoo);
                    if(montoo==0){
                        
                    }
                    else{
                        //A usuario 1 se le asigna el sueldo nuevo
                     usuario3[5] = String.valueOf(saldonuevo8);
                     //Operaciones del deposito
                        double valorcuenta2 = Double.parseDouble(usuario8[5] );
                         System.out.println(valorcuenta2);
                         double valorcuenta2total = valorcuenta2 + montoo;
                        System.out.println(valorcuenta2total);
                        almacenadordemovimientos8 += "Se hizo una transferencia a tu cuenta de $: "+montoo +" desde la cuenta 0003\n";
                        System.out.println(almacenadordemovimientos8);
                        usuario8[5] = String.valueOf(valorcuenta2total);
                        vis.visualizar_transferencia(guardarnumerodetarjeta);
                        almacenadordemovimientos3+= "Hiciste una transferencia de: $"+montoo+" a la cuenta "+guardarnumerodetarjeta+"\n";
                       
                    }
                        break;
                   }
                   case "0009":
                   {
                       MONTO = Double.parseDouble(monto.getText());
                    SALDO = Double.parseDouble(usuario3[5]);
                       saldonuevo9 = ope.operaciones_transferencia_persona_1_retiro(MONTO, SALDO);
                    montoo = ope.operaciones_retiro_regresar_monto();
                    System.out.println(montoo);
                    if(montoo==0){
                        
                    }
                    else{
                        //A usuario 1 se le asigna el sueldo nuevo
                     usuario3[5] = String.valueOf(saldonuevo9);
                     //Operaciones del deposito
                        double valorcuenta2 = Double.parseDouble(usuario9[5] );
                         System.out.println(valorcuenta2);
                         double valorcuenta2total = valorcuenta2 + montoo;
                        System.out.println(valorcuenta2total);
                        almacenadordemovimientos9 += "Se hizo una transferencia a tu cuenta de $: "+montoo +" desde la cuenta 0003\n";
                        System.out.println(almacenadordemovimientos9);
                        usuario9[5] = String.valueOf(valorcuenta2total);
                        vis.visualizar_transferencia(guardarnumerodetarjeta);
                        almacenadordemovimientos3+= "Hiciste una transferencia de: $"+montoo+" a la cuenta "+guardarnumerodetarjeta+"\n";
                       
                    }
                        break;
                   }
                   case "0010":
                   {
                       MONTO = Double.parseDouble(monto.getText());
                    SALDO = Double.parseDouble(usuario3[5]);
                       saldonuevo10 = ope.operaciones_transferencia_persona_1_retiro(MONTO, SALDO);
                    montoo = ope.operaciones_retiro_regresar_monto();
                    System.out.println(montoo);
                    if(montoo==0){
                        
                    }
                    else{
                        //A usuario 1 se le asigna el sueldo nuevo
                     usuario3[5] = String.valueOf(saldonuevo10);
                     //Operaciones del deposito
                        double valorcuenta2 = Double.parseDouble(usuario10[5] );
                         System.out.println(valorcuenta2);
                         double valorcuenta2total = valorcuenta2 + montoo;
                        System.out.println(valorcuenta2total);
                        almacenadordemovimientos10 += "Se hizo una transferencia a tu cuenta de $: "+montoo +" desde la cuenta 0003\n";
                        System.out.println(almacenadordemovimientos10);
                        usuario10[5] = String.valueOf(valorcuenta2total);
                        vis.visualizar_transferencia(guardarnumerodetarjeta);
                        almacenadordemovimientos3+= "Hiciste una transferencia de: $"+montoo+" a la cuenta "+guardarnumerodetarjeta+"\n";
                       
                    }
                        break;
                   }
                    default:
                   {
                       vis.usuario_no_existente();
                       almacenadordemovimientos3+= "No fue posible realizar transacción\n";
                   }
                   
               }
                    }
                    }
                   
                }
           }

           
           //Movimientos
           if(movimientospresionado == true){
               vis.visualizar_movimientos(almacenadordemovimientos);
               
           }
        }
        //////////////////////////////////////////////////////////////////////////////////////////
        if("0004".equals(numerotarjeta.getText())){
            if(consultarsaldopresionado == true){
            saldo.setText(usuario4[5]);
            almacenadordemovimientos4 += "Hiciste una consulta - Saldo Moméntaneo $ "+ saldo.getText()+"\n";
            System.out.println(almacenadordemovimientos4);
            }
           
           //Retiro
           if(retiropresionado == true){
           MONTO = Double.parseDouble(monto.getText());
           SALDO = Double.parseDouble(usuario4[5]);
            saldonuevo = ope.operaciones_retiro(MONTO, SALDO);
           montoo = ope.operaciones_retiro_regresar_monto();
           
           usuario4[5] = String.valueOf(saldonuevo);
           
               if(MONTO > 5000 || MONTO>SALDO){
                   almacenadordemovimientos4 += "Retiro Cancelado por Restricciones\n";
                   System.out.println(almacenadordemovimientos4);
               }
               else{
               almacenadordemovimientos4 += "Hiciste un retiro - Monto del Retiro $ "+ String.valueOf(montoo)+"\n";
               System.out.println(almacenadordemovimientos4);
               }
           }
           
           
           //Depósito
           if(depositopresionado == true){
           MONTODEPOSITO = Double.parseDouble(monto.getText());
           SALDODEPOSITO = Double.parseDouble(usuario3[5]);
           saldonuevodeposito = ope.operaciones_deposito(MONTODEPOSITO, SALDODEPOSITO);
           usuario3[5] = String.valueOf(saldonuevodeposito);
           almacenadordemovimientos4 += "Hiciste un deposito - Monto del Déposito $ "+ MONTODEPOSITO+"\n";
           System.out.println(almacenadordemovimientos4);
           }
           
           if(transferenciapresionado == true){
                if(numerotarjeta.getText().equals(tarjeta1.getText())){
                vis.mensaje_mismousuario();
                almacenadordemovimientos4+= "No se pudo llevar a cabo la transacción por excepciones\n";
               }
                else{
                    if("".equals(tarjeta1.getText())){
                        vis.mensaje_introduce_numerotarjeta();
                    }
                    else{
                        if("".equals(monto.getText())){
                        vis.mensaje_introduce_monto();
                    }
                    else{
                         //Recibir numero de tarjeta
                     guardarnumerodetarjeta = tarjeta1.getText();
                     System.out.println(guardarnumerodetarjeta);
                     
                    //Segun sea el numero de tarjeta se hara el deposito y retiro correspondiente
               switch(guardarnumerodetarjeta){
                   case "0004":
                   {
                       vis.mensaje_mismousuario();
                       almacenadordemovimientos4+= "No fue posible realizar transacción\n";
                   }
                   case "0002":
                   {
                       MONTO = Double.parseDouble(monto.getText());
                     SALDO = Double.parseDouble(usuario4[5]);
                    saldonuevo2 = ope.operaciones_transferencia_persona_1_retiro(MONTO, SALDO);
                    montoo = ope.operaciones_retiro_regresar_monto();
                    System.out.println(montoo);
                    if(montoo==0){
                        
                    }
                    else{
                        //A usuario 1 se le asigna el sueldo nuevo
                     usuario4[5] = String.valueOf(saldonuevo2);
                     //Operaciones del deposito
                       double valorcuenta2 = Double.parseDouble(usuario2[5] );
                         System.out.println(valorcuenta2);
                         double valorcuenta2total = valorcuenta2 + montoo;
                        System.out.println(valorcuenta2total);
                        almacenadordemovimientos2 += "Se hizo una transferencia a tu cuenta de $: "+montoo +" desde la cuenta 0004\n";
                        System.out.println(almacenadordemovimientos2);
                        usuario2[5] = String.valueOf(valorcuenta2total);
                        vis.visualizar_transferencia(guardarnumerodetarjeta);
                        almacenadordemovimientos4+= "Hiciste una transferencia de: $"+montoo+" a la cuenta "+guardarnumerodetarjeta+"\n";
                       
                    }
                   
           
                    break;
                   }
                   case "0003":
                   {
                       MONTO = Double.parseDouble(monto.getText());
                     SALDO = Double.parseDouble(usuario4[5]);
                    saldonuevo3 = ope.operaciones_transferencia_persona_1_retiro(MONTO, SALDO);
                    montoo = ope.operaciones_retiro_regresar_monto();
                    System.out.println(montoo);
                    if(montoo==0){
                        
                    }
                    else{
                        //A usuario 1 se le asigna el sueldo nuevo
                     usuario4[5] = String.valueOf(saldonuevo3);
                     //Operaciones del deposito
                        double valorcuenta2 = Double.parseDouble(usuario3[5] );
                         System.out.println(valorcuenta2);
                         double valorcuenta2total = valorcuenta2 + montoo;
                        System.out.println(valorcuenta2total);
                        almacenadordemovimientos3 += "Se hizo una transferencia a tu cuenta de $: "+montoo +" desde la cuenta 0004\n";
                        System.out.println(almacenadordemovimientos3);
                        usuario3[5] = String.valueOf(valorcuenta2total);
                        vis.visualizar_transferencia(guardarnumerodetarjeta);
                        almacenadordemovimientos4+= "Hiciste una transferencia de: $"+montoo+" a la cuenta "+guardarnumerodetarjeta+"\n";
                       
                    }
                        
                        break;
                   }
                   case "0001":
                   {
                       MONTO = Double.parseDouble(monto.getText());
                     SALDO = Double.parseDouble(usuario4[5]);
                       saldonuevo = ope.operaciones_transferencia_persona_1_retiro(MONTO, SALDO);
                    montoo = ope.operaciones_retiro_regresar_monto();
                    System.out.println(montoo);
                    if(montoo==0){
                        
                    }
                    else{
                        //A usuario 1 se le asigna el sueldo nuevo
                     usuario4[5] = String.valueOf(saldonuevo);
                     //Operaciones del deposito
                        double valorcuenta2 = Double.parseDouble(usuario1[5] );
                         System.out.println(valorcuenta2);
                         double valorcuenta2total = valorcuenta2 + montoo;
                        System.out.println(valorcuenta2total);
                        almacenadordemovimientos += "Se hizo una transferencia a tu cuenta de $: "+montoo +" desde la cuenta 0004\n";
                        System.out.println(almacenadordemovimientos);
                        usuario1[5] = String.valueOf(valorcuenta2total);
                        vis.visualizar_transferencia(guardarnumerodetarjeta);
                        almacenadordemovimientos4+= "Hiciste una transferencia de: $"+montoo+" a la cuenta "+guardarnumerodetarjeta+"\n";
                       
                    }
                        break;
                   }
                   case "0005":
                   {
                       MONTO = Double.parseDouble(monto.getText());
                     SALDO = Double.parseDouble(usuario4[5]);
                       saldonuevo5 = ope.operaciones_transferencia_persona_1_retiro(MONTO, SALDO);
                    montoo = ope.operaciones_retiro_regresar_monto();
                    System.out.println(montoo);
                    if(montoo==0){
                        
                    }
                    else{
                        //A usuario 1 se le asigna el sueldo nuevo
                     usuario4[5] = String.valueOf(saldonuevo5);
                     //Operaciones del deposito
                        double valorcuenta2 = Double.parseDouble(usuario5[5] );
                         System.out.println(valorcuenta2);
                         double valorcuenta2total = valorcuenta2 + montoo;
                        System.out.println(valorcuenta2total);
                        almacenadordemovimientos5 += "Se hizo una transferencia a tu cuenta de $: "+montoo +" desde la cuenta 0004\n";
                        System.out.println(almacenadordemovimientos5);
                        usuario5[5] = String.valueOf(valorcuenta2total);
                        vis.visualizar_transferencia(guardarnumerodetarjeta);
                        almacenadordemovimientos4+= "Hiciste una transferencia de: $"+montoo+" a la cuenta "+guardarnumerodetarjeta+"\n";
                       
                    }
                        break;
                   }
                   case "0006":
                   {
                       MONTO = Double.parseDouble(monto.getText());
                     SALDO = Double.parseDouble(usuario4[5]);
                       saldonuevo6 = ope.operaciones_transferencia_persona_1_retiro(MONTO, SALDO);
                    montoo = ope.operaciones_retiro_regresar_monto();
                    System.out.println(montoo);
                    if(montoo==0){
                        
                    }
                    else{
                        //A usuario 1 se le asigna el sueldo nuevo
                     usuario4[5] = String.valueOf(saldonuevo6);
                     //Operaciones del deposito
                       double valorcuenta2 = Double.parseDouble(usuario6[5] );
                         System.out.println(valorcuenta2);
                         double valorcuenta2total = valorcuenta2 + montoo;
                        System.out.println(valorcuenta2total);
                        almacenadordemovimientos6 += "Se hizo una transferencia a tu cuenta de $: "+montoo +" desde la cuenta 0004\n";
                        System.out.println(almacenadordemovimientos6);
                        usuario6[5] = String.valueOf(valorcuenta2total);
                        vis.visualizar_transferencia(guardarnumerodetarjeta);
                        almacenadordemovimientos4+= "Hiciste una transferencia de: $"+montoo+" a la cuenta "+guardarnumerodetarjeta+"\n";
                       
                    }
                        break;
                   }
                   case "0007":
                   {
                       MONTO = Double.parseDouble(monto.getText());
                     SALDO = Double.parseDouble(usuario4[5]);
                      saldonuevo7 = ope.operaciones_transferencia_persona_1_retiro(MONTO, SALDO);
                    montoo = ope.operaciones_retiro_regresar_monto();
                    System.out.println(montoo);
                    if(montoo==0){
                        
                    }
                    else{
                        //A usuario 1 se le asigna el sueldo nuevo
                     usuario4[5] = String.valueOf(saldonuevo7);
                     //Operaciones del deposito
                        double valorcuenta2 = Double.parseDouble(usuario7[5] );
                         System.out.println(valorcuenta2);
                         double valorcuenta2total = valorcuenta2 + montoo;
                        System.out.println(valorcuenta2total);
                        almacenadordemovimientos7 += "Se hizo una transferencia a tu cuenta de $: "+montoo +" desde la cuenta 0004\n";
                        System.out.println(almacenadordemovimientos7);
                        usuario7[5] = String.valueOf(valorcuenta2total);
                        vis.visualizar_transferencia(guardarnumerodetarjeta);
                        almacenadordemovimientos4+= "Hiciste una transferencia de: $"+montoo+" a la cuenta "+guardarnumerodetarjeta+"\n";
                       
                    }
                   }
                   case "0008":
                   {
                       MONTO = Double.parseDouble(monto.getText());
                     SALDO = Double.parseDouble(usuario4[5]);
                       saldonuevo8 = ope.operaciones_transferencia_persona_1_retiro(MONTO, SALDO);
                    montoo = ope.operaciones_retiro_regresar_monto();
                    System.out.println(montoo);
                    if(montoo==0){
                        
                    }
                    else{
                        //A usuario 1 se le asigna el sueldo nuevo
                     usuario4[5] = String.valueOf(saldonuevo8);
                     //Operaciones del deposito
                       double valorcuenta2 = Double.parseDouble(usuario8[5] );
                         System.out.println(valorcuenta2);
                         double valorcuenta2total = valorcuenta2 + montoo;
                        System.out.println(valorcuenta2total);
                        almacenadordemovimientos8 += "Se hizo una transferencia a tu cuenta de $: "+montoo +" desde la cuenta 0004\n";
                        System.out.println(almacenadordemovimientos8);
                        usuario8[5] = String.valueOf(valorcuenta2total);
                        vis.visualizar_transferencia(guardarnumerodetarjeta);
                        almacenadordemovimientos4+= "Hiciste una transferencia de: $"+montoo+" a la cuenta "+guardarnumerodetarjeta+"\n";
                       
                    }
                        break;
                   }
                   case "0009":
                   {
                       MONTO = Double.parseDouble(monto.getText());
                     SALDO = Double.parseDouble(usuario4[5]);
                       saldonuevo9 = ope.operaciones_transferencia_persona_1_retiro(MONTO, SALDO);
                    montoo = ope.operaciones_retiro_regresar_monto();
                    System.out.println(montoo);
                    if(montoo==0){
                        
                    }
                    else{
                        //A usuario 1 se le asigna el sueldo nuevo
                     usuario4[5] = String.valueOf(saldonuevo9);
                     //Operaciones del deposito
                        double valorcuenta2 = Double.parseDouble(usuario9[5] );
                         System.out.println(valorcuenta2);
                         double valorcuenta2total = valorcuenta2 + montoo;
                        System.out.println(valorcuenta2total);
                        almacenadordemovimientos9 += "Se hizo una transferencia a tu cuenta de $: "+montoo +" desde la cuenta 0004\n";
                        System.out.println(almacenadordemovimientos9);
                        usuario9[5] = String.valueOf(valorcuenta2total);
                        vis.visualizar_transferencia(guardarnumerodetarjeta);
                        almacenadordemovimientos4+= "Hiciste una transferencia de: $"+montoo+" a la cuenta "+guardarnumerodetarjeta+"\n";
                       
                    }
                        break;
                   }
                   case "0010":
                   {
                       MONTO = Double.parseDouble(monto.getText());
                     SALDO = Double.parseDouble(usuario4[5]);
                       saldonuevo10 = ope.operaciones_transferencia_persona_1_retiro(MONTO, SALDO);
                    montoo = ope.operaciones_retiro_regresar_monto();
                    System.out.println(montoo);
                    if(montoo==0){
                        
                    }
                    else{
                        //A usuario 1 se le asigna el sueldo nuevo
                     usuario4[5] = String.valueOf(saldonuevo10);
                     //Operaciones del deposito
                        double valorcuenta2 = Double.parseDouble(usuario10[5] );
                         System.out.println(valorcuenta2);
                         double valorcuenta2total = valorcuenta2 + montoo;
                        System.out.println(valorcuenta2total);
                        almacenadordemovimientos10 += "Se hizo una transferencia a tu cuenta de $: "+montoo +" desde la cuenta 0004\n";
                        System.out.println(almacenadordemovimientos10);
                        usuario10[5] = String.valueOf(valorcuenta2total);
                        vis.visualizar_transferencia(guardarnumerodetarjeta);
                        almacenadordemovimientos4+= "Hiciste una transferencia de: $"+montoo+" a la cuenta "+guardarnumerodetarjeta+"\n";
                       
                    }
                        break;
                   }
                    default:
                   {
                       vis.usuario_no_existente();
                       almacenadordemovimientos4+= "No fue posible realizar transacción\n";
                   }
                   
               }
                    }
                    }
                   
                }
           }

           
           //Movimientos
           if(movimientospresionado == true){
               vis.visualizar_movimientos(almacenadordemovimientos);
               
           }
        }
        ////////////////////////////////////////////////////////////////////////////////////
        if("0005".equals(numerotarjeta.getText())){
            if(consultarsaldopresionado == true){
            saldo.setText(usuario5[5]);
            almacenadordemovimientos5 += "Hiciste una consulta - Saldo Moméntaneo $ "+ saldo.getText()+"\n";
            System.out.println(almacenadordemovimientos5);
            }
           
           //Retiro
           if(retiropresionado == true){
           MONTO = Double.parseDouble(monto.getText());
           SALDO = Double.parseDouble(usuario5[5]);
            saldonuevo = ope.operaciones_retiro(MONTO, SALDO);
           montoo = ope.operaciones_retiro_regresar_monto();
           
           usuario5[5] = String.valueOf(saldonuevo);
           
               if(MONTO > 5000 || MONTO>SALDO){
                   almacenadordemovimientos5 += "Retiro Cancelado por Restricciones\n";
                   System.out.println(almacenadordemovimientos5);
               }
               else{
               almacenadordemovimientos5 += "Hiciste un retiro - Monto del Retiro $ "+ String.valueOf(montoo)+"\n";
               System.out.println(almacenadordemovimientos5);
               }
           }
           
           
           //Depósito
           if(depositopresionado == true){
           MONTODEPOSITO = Double.parseDouble(monto.getText());
           SALDODEPOSITO = Double.parseDouble(usuario5[5]);
           saldonuevodeposito = ope.operaciones_deposito(MONTODEPOSITO, SALDODEPOSITO);
           usuario5[5] = String.valueOf(saldonuevodeposito);
           almacenadordemovimientos5 += "Hiciste un deposito - Monto del Déposito $ "+ MONTODEPOSITO+"\n";
           System.out.println(almacenadordemovimientos5);
           }
           
           if(transferenciapresionado == true){
                if(numerotarjeta.getText().equals(tarjeta1.getText())){
                vis.mensaje_mismousuario();
                almacenadordemovimientos5+= "No se pudo llevar a cabo la transacción por excepciones\n";
               }
                else{
                    if("".equals(tarjeta1.getText())){
                        vis.mensaje_introduce_numerotarjeta();
                    }
                    else{
                        if("".equals(monto.getText())){
                        vis.mensaje_introduce_monto();
                    }
                    else{
                         //Recibir numero de tarjeta
                     guardarnumerodetarjeta = tarjeta1.getText();
                     System.out.println(guardarnumerodetarjeta);
                    
                    //Segun sea el numero de tarjeta se hara el deposito y retiro correspondiente
               switch(guardarnumerodetarjeta){
                   case "0005":
                   {
                       vis.mensaje_mismousuario();
                       almacenadordemovimientos5+= "No fue posible realizar transacción\n";
                   }
                   case "0002":
                   {
                        MONTO = Double.parseDouble(monto.getText());
                     SALDO = Double.parseDouble(usuario5[5]);
                    saldonuevo2 = ope.operaciones_transferencia_persona_1_retiro(MONTO, SALDO);
                    montoo = ope.operaciones_retiro_regresar_monto();
                    System.out.println(montoo);
                    if(montoo==0){
                        
                    }
                    else{
                        //A usuario 1 se le asigna el sueldo nuevo
                     usuario5[5] = String.valueOf(saldonuevo2);
                     //Operaciones del deposito
                        double valorcuenta2 = Double.parseDouble(usuario2[5] );
                         System.out.println(valorcuenta2);
                         double valorcuenta2total = valorcuenta2 + montoo;
                        System.out.println(valorcuenta2total);
                        almacenadordemovimientos2 += "Se hizo una transferencia a tu cuenta de $: "+montoo +" desde la cuenta 0005\n";
                        System.out.println(almacenadordemovimientos2);
                        usuario2[5] = String.valueOf(valorcuenta2total);
                        vis.visualizar_transferencia(guardarnumerodetarjeta);
                        almacenadordemovimientos5+= "Hiciste una transferencia de: $"+montoo+" a la cuenta "+guardarnumerodetarjeta+"\n";
                       
                    }
                   
           
                    break;
                   }
                   case "0003":
                   {
                        MONTO = Double.parseDouble(monto.getText());
                     SALDO = Double.parseDouble(usuario5[5]);
                    saldonuevo3 = ope.operaciones_transferencia_persona_1_retiro(MONTO, SALDO);
                    montoo = ope.operaciones_retiro_regresar_monto();
                    System.out.println(montoo);
                    if(montoo==0){
                        
                    }
                    else{
                        //A usuario 1 se le asigna el sueldo nuevo
                     usuario5[5] = String.valueOf(saldonuevo3);
                     //Operaciones del deposito
                       double valorcuenta2 = Double.parseDouble(usuario3[5] );
                         System.out.println(valorcuenta2);
                         double valorcuenta2total = valorcuenta2 + montoo;
                        System.out.println(valorcuenta2total);
                        almacenadordemovimientos3 += "Se hizo una transferencia a tu cuenta de $: "+montoo +" desde la cuenta 0005\n";
                        System.out.println(almacenadordemovimientos3);
                        usuario3[5] = String.valueOf(valorcuenta2total);
                        vis.visualizar_transferencia(guardarnumerodetarjeta);
                        almacenadordemovimientos5+= "Hiciste una transferencia de: $"+montoo+" a la cuenta "+guardarnumerodetarjeta+"\n";
                       
                    }
                        
                        break;
                   }
                   case "0004":
                   {
                        MONTO = Double.parseDouble(monto.getText());
                     SALDO = Double.parseDouble(usuario5[5]);
                       saldonuevo4 = ope.operaciones_transferencia_persona_1_retiro(MONTO, SALDO);
                    montoo = ope.operaciones_retiro_regresar_monto();
                    System.out.println(montoo);
                    if(montoo==0){
                        
                    }
                    else{
                        //A usuario 1 se le asigna el sueldo nuevo
                     usuario5[5] = String.valueOf(saldonuevo4);
                     //Operaciones del deposito
                        double valorcuenta2 = Double.parseDouble(usuario4[5] );
                         System.out.println(valorcuenta2);
                         double valorcuenta2total = valorcuenta2 + montoo;
                        System.out.println(valorcuenta2total);
                        almacenadordemovimientos4 += "Se hizo una transferencia a tu cuenta de $: "+montoo +" desde la cuenta 0005\n";
                        System.out.println(almacenadordemovimientos4);
                        usuario4[5] = String.valueOf(valorcuenta2total);
                        vis.visualizar_transferencia(guardarnumerodetarjeta);
                        almacenadordemovimientos5+= "Hiciste una transferencia de: $"+montoo+" a la cuenta "+guardarnumerodetarjeta+"\n";
                       
                    }
                        break;
                   }
                   case "0001":
                   {
                        MONTO = Double.parseDouble(monto.getText());
                     SALDO = Double.parseDouble(usuario5[5]);
                       saldonuevo = ope.operaciones_transferencia_persona_1_retiro(MONTO, SALDO);
                    montoo = ope.operaciones_retiro_regresar_monto();
                    System.out.println(montoo);
                    if(montoo==0){
                        
                    }
                    else{
                        //A usuario 1 se le asigna el sueldo nuevo
                     usuario5[5] = String.valueOf(saldonuevo);
                     //Operaciones del deposito
                       double valorcuenta2 = Double.parseDouble(usuario1[5] );
                         System.out.println(valorcuenta2);
                         double valorcuenta2total = valorcuenta2 + montoo;
                        System.out.println(valorcuenta2total);
                        almacenadordemovimientos += "Se hizo una transferencia a tu cuenta de $: "+montoo +" desde la cuenta 0005\n";
                        System.out.println(almacenadordemovimientos);
                        usuario1[5] = String.valueOf(valorcuenta2total);
                        vis.visualizar_transferencia(guardarnumerodetarjeta);
                        almacenadordemovimientos5+= "Hiciste una transferencia de: $"+montoo+" a la cuenta "+guardarnumerodetarjeta+"\n";
                       
                    }
                        break;
                   }
                   case "0006":
                   {
                        MONTO = Double.parseDouble(monto.getText());
                     SALDO = Double.parseDouble(usuario5[5]);
                       saldonuevo6 = ope.operaciones_transferencia_persona_1_retiro(MONTO, SALDO);
                    montoo = ope.operaciones_retiro_regresar_monto();
                    System.out.println(montoo);
                    if(montoo==0){
                        
                    }
                    else{
                        //A usuario 1 se le asigna el sueldo nuevo
                     usuario5[5] = String.valueOf(saldonuevo6);
                     //Operaciones del deposito
                       double valorcuenta2 = Double.parseDouble(usuario6[5] );
                         System.out.println(valorcuenta2);
                         double valorcuenta2total = valorcuenta2 + montoo;
                        System.out.println(valorcuenta2total);
                        almacenadordemovimientos6 += "Se hizo una transferencia a tu cuenta de $: "+montoo +" desde la cuenta 0005\n";
                        System.out.println(almacenadordemovimientos6);
                        usuario6[5] = String.valueOf(valorcuenta2total);
                        vis.visualizar_transferencia(guardarnumerodetarjeta);
                        almacenadordemovimientos5+= "Hiciste una transferencia de: $"+montoo+" a la cuenta "+guardarnumerodetarjeta+"\n";
                       
                    }
                        break;
                   }
                   case "0007":
                   {
                        MONTO = Double.parseDouble(monto.getText());
                     SALDO = Double.parseDouble(usuario5[5]);
                      saldonuevo7 = ope.operaciones_transferencia_persona_1_retiro(MONTO, SALDO);
                    montoo = ope.operaciones_retiro_regresar_monto();
                    System.out.println(montoo);
                    if(montoo==0){
                        
                    }
                    else{
                        //A usuario 1 se le asigna el sueldo nuevo
                     usuario5[5] = String.valueOf(saldonuevo7);
                     //Operaciones del deposito
                        double valorcuenta2 = Double.parseDouble(usuario7[5] );
                         System.out.println(valorcuenta2);
                         double valorcuenta2total = valorcuenta2 + montoo;
                        System.out.println(valorcuenta2total);
                        almacenadordemovimientos7 += "Se hizo una transferencia a tu cuenta de $: "+montoo +" desde la cuenta 0005\n";
                        System.out.println(almacenadordemovimientos7);
                        usuario7[5] = String.valueOf(valorcuenta2total);
                        vis.visualizar_transferencia(guardarnumerodetarjeta);
                        almacenadordemovimientos5+= "Hiciste una transferencia de: $"+montoo+" a la cuenta "+guardarnumerodetarjeta+"\n";
                       
                    }
                   }
                   case "0008":
                   {
                        MONTO = Double.parseDouble(monto.getText());
                     SALDO = Double.parseDouble(usuario5[5]);
                       saldonuevo8 = ope.operaciones_transferencia_persona_1_retiro(MONTO, SALDO);
                    montoo = ope.operaciones_retiro_regresar_monto();
                    System.out.println(montoo);
                    if(montoo==0){
                        
                    }
                    else{
                        //A usuario 1 se le asigna el sueldo nuevo
                     usuario5[5] = String.valueOf(saldonuevo8);
                     //Operaciones del deposito
                        double valorcuenta2 = Double.parseDouble(usuario8[5] );
                         System.out.println(valorcuenta2);
                         double valorcuenta2total = valorcuenta2 + montoo;
                        System.out.println(valorcuenta2total);
                        almacenadordemovimientos8 += "Se hizo una transferencia a tu cuenta de $: "+montoo +" desde la cuenta 0005\n";
                        System.out.println(almacenadordemovimientos8);
                        usuario8[5] = String.valueOf(valorcuenta2total);
                        vis.visualizar_transferencia(guardarnumerodetarjeta);
                        almacenadordemovimientos5+= "Hiciste una transferencia de: $"+montoo+" a la cuenta "+guardarnumerodetarjeta+"\n";
                       
                    }
                        break;
                   }
                   case "0009":
                   {
                        MONTO = Double.parseDouble(monto.getText());
                     SALDO = Double.parseDouble(usuario5[5]);
                       saldonuevo9 = ope.operaciones_transferencia_persona_1_retiro(MONTO, SALDO);
                    montoo = ope.operaciones_retiro_regresar_monto();
                    System.out.println(montoo);
                    if(montoo==0){
                        
                    }
                    else{
                        //A usuario 1 se le asigna el sueldo nuevo
                     usuario5[5] = String.valueOf(saldonuevo9);
                     //Operaciones del deposito
                       double valorcuenta2 = Double.parseDouble(usuario9[5] );
                         System.out.println(valorcuenta2);
                         double valorcuenta2total = valorcuenta2 + montoo;
                        System.out.println(valorcuenta2total);
                        almacenadordemovimientos9 += "Se hizo una transferencia a tu cuenta de $: "+montoo +" desde la cuenta 0005\n";
                        System.out.println(almacenadordemovimientos9);
                        usuario9[5] = String.valueOf(valorcuenta2total);
                        vis.visualizar_transferencia(guardarnumerodetarjeta);
                        almacenadordemovimientos5+= "Hiciste una transferencia de: $"+montoo+" a la cuenta "+guardarnumerodetarjeta+"\n";
                       
                    }
                        break;
                   }
                   case "0010":
                   {
                        MONTO = Double.parseDouble(monto.getText());
                     SALDO = Double.parseDouble(usuario5[5]);
                       saldonuevo10 = ope.operaciones_transferencia_persona_1_retiro(MONTO, SALDO);
                    montoo = ope.operaciones_retiro_regresar_monto();
                    System.out.println(montoo);
                    if(montoo==0){
                        
                    }
                    else{
                        //A usuario 1 se le asigna el sueldo nuevo
                     usuario5[5] = String.valueOf(saldonuevo10);
                     //Operaciones del deposito
                        double valorcuenta2 = Double.parseDouble(usuario10[5] );
                         System.out.println(valorcuenta2);
                         double valorcuenta2total = valorcuenta2 + montoo;
                        System.out.println(valorcuenta2total);
                        almacenadordemovimientos10 += "Se hizo una transferencia a tu cuenta de $: "+montoo +" desde la cuenta 00055\n";
                        System.out.println(almacenadordemovimientos10);
                        usuario10[5] = String.valueOf(valorcuenta2total);
                        vis.visualizar_transferencia(guardarnumerodetarjeta);
                        almacenadordemovimientos5+= "Hiciste una transferencia de: $"+montoo+" a la cuenta "+guardarnumerodetarjeta+"\n";
                       
                    }
                        break;
                   }
                    default:
                   {
                       vis.usuario_no_existente();
                       almacenadordemovimientos5+= "No fue posible realizar transacción\n";
                   }
                   
               }
                    }
                    }
                   
                }
           }

           
           //Movimientos
           if(movimientospresionado == true){
               vis.visualizar_movimientos(almacenadordemovimientos);
               
           }
        }
        ////////////////////////////////////////////////////////////////////////////////////777
        if("0006".equals(numerotarjeta.getText())){
           if(consultarsaldopresionado == true){
            saldo.setText(usuario6[5]);
            almacenadordemovimientos6 += "Hiciste una consulta - Saldo Moméntaneo $ "+ saldo.getText()+"\n";
            System.out.println(almacenadordemovimientos6);
            }
           
           //Retiro
           if(retiropresionado == true){
           MONTO = Double.parseDouble(monto.getText());
           SALDO = Double.parseDouble(usuario6[5]);
            saldonuevo = ope.operaciones_retiro(MONTO, SALDO);
           montoo = ope.operaciones_retiro_regresar_monto();
           
           usuario6[5] = String.valueOf(saldonuevo);
           
               if(MONTO > 5000 || MONTO>SALDO){
                   almacenadordemovimientos6 += "Retiro Cancelado por Restricciones\n";
                   System.out.println(almacenadordemovimientos6);
               }
               else{
               almacenadordemovimientos6 += "Hiciste un retiro - Monto del Retiro $ "+ String.valueOf(montoo)+"\n";
               System.out.println(almacenadordemovimientos6);
               }
           }
           
           
           //Depósito
           if(depositopresionado == true){
           MONTODEPOSITO = Double.parseDouble(monto.getText());
           SALDODEPOSITO = Double.parseDouble(usuario6[5]);
           saldonuevodeposito = ope.operaciones_deposito(MONTODEPOSITO, SALDODEPOSITO);
           usuario6[5] = String.valueOf(saldonuevodeposito);
           almacenadordemovimientos6 += "Hiciste un deposito - Monto del Déposito $ "+ MONTODEPOSITO+"\n";
           System.out.println(almacenadordemovimientos6);
           }
           
           if(transferenciapresionado == true){
                if(numerotarjeta.getText().equals(tarjeta1.getText())){
                vis.mensaje_mismousuario();
                almacenadordemovimientos6+= "No se pudo llevar a cabo la transacción por excepciones\n";
               }
                else{
                    if("".equals(tarjeta1.getText())){
                        vis.mensaje_introduce_numerotarjeta();
                    }
                    else{
                        if("".equals(monto.getText())){
                        vis.mensaje_introduce_monto();
                    }
                    else{
                         //Recibir numero de tarjeta
                     guardarnumerodetarjeta = tarjeta1.getText();
                     System.out.println(guardarnumerodetarjeta);
                     
                    //Segun sea el numero de tarjeta se hara el deposito y retiro correspondiente
               switch(guardarnumerodetarjeta){
                   case "0006":
                   {
                       vis.mensaje_mismousuario();
                       almacenadordemovimientos6+= "No fue posible realizar transacción\n";
                   }
                   case "0002":
                   {
                       MONTO = Double.parseDouble(monto.getText());
                     SALDO = Double.parseDouble(usuario6[5]);
                    saldonuevo2 = ope.operaciones_transferencia_persona_1_retiro(MONTO, SALDO);
                    montoo = ope.operaciones_retiro_regresar_monto();
                    System.out.println(montoo);
                    if(montoo==0){
                        
                    }
                    else{
                        //A usuario 1 se le asigna el sueldo nuevo
                     usuario6[5] = String.valueOf(saldonuevo2);
                     //Operaciones del deposito
                       double valorcuenta2 = Double.parseDouble(usuario2[5] );
                         System.out.println(valorcuenta2);
                         double valorcuenta2total = valorcuenta2 + montoo;
                        System.out.println(valorcuenta2total);
                        almacenadordemovimientos2 += "Se hizo una transferencia a tu cuenta de $: "+montoo +" desde la cuenta 0006\n";
                        System.out.println(almacenadordemovimientos2);
                        usuario2[5] = String.valueOf(valorcuenta2total);
                        vis.visualizar_transferencia(guardarnumerodetarjeta);
                        almacenadordemovimientos6+= "Hiciste una transferencia de: $"+montoo+" a la cuenta "+guardarnumerodetarjeta+"\n";
                       
                    }
                   
           
                    break;
                   }
                   case "0003":
                   {
                       MONTO = Double.parseDouble(monto.getText());
                     SALDO = Double.parseDouble(usuario6[5]);
                    saldonuevo3 = ope.operaciones_transferencia_persona_1_retiro(MONTO, SALDO);
                    montoo = ope.operaciones_retiro_regresar_monto();
                    System.out.println(montoo);
                    if(montoo==0){
                        
                    }
                    else{
                        //A usuario 1 se le asigna el sueldo nuevo
                     usuario6[5] = String.valueOf(saldonuevo3);
                     //Operaciones del deposito
                        double valorcuenta2 = Double.parseDouble(usuario3[5] );
                         System.out.println(valorcuenta2);
                         double valorcuenta2total = valorcuenta2 + montoo;
                        System.out.println(valorcuenta2total);
                        almacenadordemovimientos3 += "Se hizo una transferencia a tu cuenta de $: "+montoo +" desde la cuenta 0006\n";
                        System.out.println(almacenadordemovimientos3);
                        usuario3[5] = String.valueOf(valorcuenta2total);
                        vis.visualizar_transferencia(guardarnumerodetarjeta);
                        almacenadordemovimientos6+= "Hiciste una transferencia de: $"+montoo+" a la cuenta "+guardarnumerodetarjeta+"\n";
                       
                    }
                        
                        break;
                   }
                   case "0004":
                   {
                       MONTO = Double.parseDouble(monto.getText());
                     SALDO = Double.parseDouble(usuario6[5]);
                       saldonuevo4 = ope.operaciones_transferencia_persona_1_retiro(MONTO, SALDO);
                    montoo = ope.operaciones_retiro_regresar_monto();
                    System.out.println(montoo);
                    if(montoo==0){
                        
                    }
                    else{
                        //A usuario 1 se le asigna el sueldo nuevo
                     usuario6[5] = String.valueOf(saldonuevo4);
                     //Operaciones del deposito
                       double valorcuenta2 = Double.parseDouble(usuario4[5] );
                         System.out.println(valorcuenta2);
                         double valorcuenta2total = valorcuenta2 + montoo;
                        System.out.println(valorcuenta2total);
                        almacenadordemovimientos4 += "Se hizo una transferencia a tu cuenta de $: "+montoo +" desde la cuenta 0006\n";
                        System.out.println(almacenadordemovimientos4);
                        usuario4[5] = String.valueOf(valorcuenta2total);
                        vis.visualizar_transferencia(guardarnumerodetarjeta);
                        almacenadordemovimientos6+= "Hiciste una transferencia de: $"+montoo+" a la cuenta "+guardarnumerodetarjeta+"\n";
                       
                    }
                        break;
                   }
                   case "0005":
                   {
                       MONTO = Double.parseDouble(monto.getText());
                     SALDO = Double.parseDouble(usuario6[5]);
                       saldonuevo5 = ope.operaciones_transferencia_persona_1_retiro(MONTO, SALDO);
                    montoo = ope.operaciones_retiro_regresar_monto();
                    System.out.println(montoo);
                    if(montoo==0){
                        
                    }
                    else{
                        //A usuario 1 se le asigna el sueldo nuevo
                     usuario6[5] = String.valueOf(saldonuevo5);
                     //Operaciones del deposito
                       double valorcuenta2 = Double.parseDouble(usuario5[5] );
                         System.out.println(valorcuenta2);
                         double valorcuenta2total = valorcuenta2 + montoo;
                        System.out.println(valorcuenta2total);
                        almacenadordemovimientos5 += "Se hizo una transferencia a tu cuenta de $: "+montoo +" desde la cuenta 0006\n";
                        System.out.println(almacenadordemovimientos5);
                        usuario5[5] = String.valueOf(valorcuenta2total);
                        vis.visualizar_transferencia(guardarnumerodetarjeta);
                        almacenadordemovimientos6+= "Hiciste una transferencia de: $"+montoo+" a la cuenta "+guardarnumerodetarjeta+"\n";
                       
                    }
                        break;
                   }
                   case "0001":
                   {
                       MONTO = Double.parseDouble(monto.getText());
                     SALDO = Double.parseDouble(usuario6[5]);
                       saldonuevo = ope.operaciones_transferencia_persona_1_retiro(MONTO, SALDO);
                    montoo = ope.operaciones_retiro_regresar_monto();
                    System.out.println(montoo);
                    if(montoo==0){
                        
                    }
                    else{
                        //A usuario 1 se le asigna el sueldo nuevo
                     usuario6[5] = String.valueOf(saldonuevo);
                     //Operaciones del deposito
                        double valorcuenta2 = Double.parseDouble(usuario1[5] );
                         System.out.println(valorcuenta2);
                         double valorcuenta2total = valorcuenta2 + montoo;
                        System.out.println(valorcuenta2total);
                        almacenadordemovimientos  += "Se hizo una transferencia a tu cuenta de $: "+montoo +" desde la cuenta 0006\n";
                        System.out.println(almacenadordemovimientos );
                        usuario1[5] = String.valueOf(valorcuenta2total);
                        vis.visualizar_transferencia(guardarnumerodetarjeta);
                        almacenadordemovimientos6+= "Hiciste una transferencia de: $"+montoo+" a la cuenta "+guardarnumerodetarjeta+"\n";
                       
                    }
                        break;
                   }
                   case "0007":
                   {
                       MONTO = Double.parseDouble(monto.getText());
                     SALDO = Double.parseDouble(usuario6[5]);
                      saldonuevo7 = ope.operaciones_transferencia_persona_1_retiro(MONTO, SALDO);
                    montoo = ope.operaciones_retiro_regresar_monto();
                    System.out.println(montoo);
                    if(montoo==0){
                        
                    }
                    else{
                        //A usuario 1 se le asigna el sueldo nuevo
                     usuario6[5] = String.valueOf(saldonuevo7);
                     //Operaciones del deposito
                       double valorcuenta2 = Double.parseDouble(usuario7[5] );
                         System.out.println(valorcuenta2);
                         double valorcuenta2total = valorcuenta2 + montoo;
                        System.out.println(valorcuenta2total);
                        almacenadordemovimientos7 += "Se hizo una transferencia a tu cuenta de $: "+montoo +" desde la cuenta 0006\n";
                        System.out.println(almacenadordemovimientos7);
                        usuario7[5] = String.valueOf(valorcuenta2total);
                        vis.visualizar_transferencia(guardarnumerodetarjeta);
                        almacenadordemovimientos6+= "Hiciste una transferencia de: $"+montoo+" a la cuenta "+guardarnumerodetarjeta+"\n";
                       
                    }
                   }
                   case "0008":
                   {
                       MONTO = Double.parseDouble(monto.getText());
                     SALDO = Double.parseDouble(usuario6[5]);
                       saldonuevo8 = ope.operaciones_transferencia_persona_1_retiro(MONTO, SALDO);
                    montoo = ope.operaciones_retiro_regresar_monto();
                    System.out.println(montoo);
                    if(montoo==0){
                        
                    }
                    else{
                        //A usuario 1 se le asigna el sueldo nuevo
                     usuario6[5] = String.valueOf(saldonuevo8);
                     //Operaciones del deposito
                        double valorcuenta2 = Double.parseDouble(usuario8[5] );
                         System.out.println(valorcuenta2);
                         double valorcuenta2total = valorcuenta2 + montoo;
                        System.out.println(valorcuenta2total);
                        almacenadordemovimientos8 += "Se hizo una transferencia a tu cuenta de $: "+montoo +" desde la cuenta 0006\n";
                        System.out.println(almacenadordemovimientos8);
                        usuario8[5] = String.valueOf(valorcuenta2total);
                        vis.visualizar_transferencia(guardarnumerodetarjeta);
                        almacenadordemovimientos6+= "Hiciste una transferencia de: $"+montoo+" a la cuenta "+guardarnumerodetarjeta+"\n";
                       
                    }
                        break;
                   }
                   case "0009":
                   {
                       MONTO = Double.parseDouble(monto.getText());
                     SALDO = Double.parseDouble(usuario6[5]);
                       saldonuevo9 = ope.operaciones_transferencia_persona_1_retiro(MONTO, SALDO);
                    montoo = ope.operaciones_retiro_regresar_monto();
                    System.out.println(montoo);
                    if(montoo==0){
                        
                    }
                    else{
                        //A usuario 1 se le asigna el sueldo nuevo
                     usuario6[5] = String.valueOf(saldonuevo9);
                     //Operaciones del deposito
                       double valorcuenta2 = Double.parseDouble(usuario9[5] );
                         System.out.println(valorcuenta2);
                         double valorcuenta2total = valorcuenta2 + montoo;
                        System.out.println(valorcuenta2total);
                        almacenadordemovimientos9 += "Se hizo una transferencia a tu cuenta de $: "+montoo +" desde la cuenta 0006\n";
                        System.out.println(almacenadordemovimientos9);
                        usuario9[5] = String.valueOf(valorcuenta2total);
                        vis.visualizar_transferencia(guardarnumerodetarjeta);
                        almacenadordemovimientos6+= "Hiciste una transferencia de: $"+montoo+" a la cuenta "+guardarnumerodetarjeta+"\n";
                       
                    }
                        break;
                   }
                   case "0010":
                   {
                       MONTO = Double.parseDouble(monto.getText());
                     SALDO = Double.parseDouble(usuario6[5]);
                       saldonuevo10 = ope.operaciones_transferencia_persona_1_retiro(MONTO, SALDO);
                    montoo = ope.operaciones_retiro_regresar_monto();
                    System.out.println(montoo);
                    if(montoo==0){
                        
                    }
                    else{
                        //A usuario 1 se le asigna el sueldo nuevo
                     usuario6[5] = String.valueOf(saldonuevo10);
                     //Operaciones del deposito
                        double valorcuenta2 = Double.parseDouble(usuario10[5] );
                         System.out.println(valorcuenta2);
                         double valorcuenta2total = valorcuenta2 + montoo;
                        System.out.println(valorcuenta2total);
                        almacenadordemovimientos10 += "Se hizo una transferencia a tu cuenta de $: "+montoo +" desde la cuenta 0006\n";
                        System.out.println(almacenadordemovimientos10);
                        usuario10[5] = String.valueOf(valorcuenta2total);
                        vis.visualizar_transferencia(guardarnumerodetarjeta);
                        almacenadordemovimientos6+= "Hiciste una transferencia de: $"+montoo+" a la cuenta "+guardarnumerodetarjeta+"\n";
                       
                    }
                        break;
                   }
                    default:
                   {
                       vis.usuario_no_existente();
                       almacenadordemovimientos6+= "No fue posible realizar transacción\n";
                   }
                   
               }
                    }
                    }
                   
                }
           }

           
           //Movimientos
           if(movimientospresionado == true){
               vis.visualizar_movimientos(almacenadordemovimientos);
               
           }
        }
        
        ////////////////////////////////////////////////////////////////////////////////////////////
        if("0007".equals(numerotarjeta.getText())){
           if(consultarsaldopresionado == true){
            saldo.setText(usuario7[5]);
            almacenadordemovimientos7 += "Hiciste una consulta - Saldo Moméntaneo $ "+ saldo.getText()+"\n";
            System.out.println(almacenadordemovimientos7);
            }
           //Retiro
           if(retiropresionado == true){
           MONTO = Double.parseDouble(monto.getText());
           SALDO = Double.parseDouble(usuario7[5]);
           saldonuevo = ope.operaciones_retiro(MONTO, SALDO);
           montoo = ope.operaciones_retiro_regresar_monto();
           
           usuario7[5] = String.valueOf(saldonuevo);
           
               if(MONTO > 5000 || MONTO>SALDO){
                   almacenadordemovimientos7 += "Retiro Cancelado por Restricciones\n";
                   System.out.println(almacenadordemovimientos7);
               }
               else{
               almacenadordemovimientos7 += "Hiciste un retiro - Monto del Retiro $ "+ String.valueOf(montoo)+"\n";
               System.out.println(almacenadordemovimientos7);
               }
           }
           
           
           //Depósito
           if(depositopresionado == true){
           MONTODEPOSITO = Double.parseDouble(monto.getText());
           SALDODEPOSITO = Double.parseDouble(usuario7[5]);
           saldonuevodeposito = ope.operaciones_deposito(MONTODEPOSITO, SALDODEPOSITO);
           usuario7[5] = String.valueOf(saldonuevodeposito);
           almacenadordemovimientos7 += "Hiciste un deposito - Monto del Déposito $ "+ MONTODEPOSITO+"\n";
           System.out.println(almacenadordemovimientos7);
           }
           
           if(transferenciapresionado == true){
                if(numerotarjeta.getText().equals(tarjeta1.getText())){
                vis.mensaje_mismousuario();
                almacenadordemovimientos7+= "No se pudo llevar a cabo la transacción por excepciones\n";
               }
                else{
                    if("".equals(tarjeta1.getText())){
                        vis.mensaje_introduce_numerotarjeta();
                    }
                    else{
                        if("".equals(monto.getText())){
                        vis.mensaje_introduce_monto();
                    }
                    else{
                         //Recibir numero de tarjeta
                     guardarnumerodetarjeta = tarjeta1.getText();
                     System.out.println(guardarnumerodetarjeta);
                     
                    //Segun sea el numero de tarjeta se hara el deposito y retiro correspondiente
               switch(guardarnumerodetarjeta){
                   case "0007":
                   {
                       vis.mensaje_mismousuario();
                       almacenadordemovimientos7+= "No fue posible realizar transacción\n";
                   }
                   case "0002":
                   {
                       MONTO = Double.parseDouble(monto.getText());
                     SALDO = Double.parseDouble(usuario7[5]);
                    saldonuevo = ope.operaciones_transferencia_persona_1_retiro(MONTO, SALDO);
                    montoo = ope.operaciones_retiro_regresar_monto();
                    System.out.println(montoo);
                    if(montoo==0){
                        
                    }
                    else{
                        //A usuario 1 se le asigna el sueldo nuevo
                     usuario7[5] = String.valueOf(saldonuevo);
                     //Operaciones del deposito
                        double valorcuenta2 = Double.parseDouble(usuario2[5] );
                         System.out.println(valorcuenta2);
                         double valorcuenta2total = valorcuenta2 + montoo;
                        System.out.println(valorcuenta2total);
                        almacenadordemovimientos2 += "Se hizo una transferencia a tu cuenta de $: "+montoo +" desde la cuenta 0007\n";
                        System.out.println(almacenadordemovimientos2);
                        usuario2[5] = String.valueOf(valorcuenta2total);
                        vis.visualizar_transferencia(guardarnumerodetarjeta);
                        almacenadordemovimientos7+= "Hiciste una transferencia de: $"+montoo+" a la cuenta "+guardarnumerodetarjeta+"\n";
                       
                    }
                   
           
                    break;
                   }
                   case "0003":
                   {
                       MONTO = Double.parseDouble(monto.getText());
                     SALDO = Double.parseDouble(usuario7[5]);
                    saldonuevo = ope.operaciones_transferencia_persona_1_retiro(MONTO, SALDO);
                    montoo = ope.operaciones_retiro_regresar_monto();
                    System.out.println(montoo);
                    if(montoo==0){
                        
                    }
                    else{
                        //A usuario 1 se le asigna el sueldo nuevo
                     usuario7[5] = String.valueOf(saldonuevo);
                     //Operaciones del deposito
                        double valorcuenta2 = Double.parseDouble(usuario3[5] );
                         System.out.println(valorcuenta2);
                         double valorcuenta2total = valorcuenta2 + montoo;
                        System.out.println(valorcuenta2total);
                        almacenadordemovimientos3 += "Se hizo una transferencia a tu cuenta de $: "+montoo +" desde la cuenta 0007\n";
                        System.out.println(almacenadordemovimientos3);
                        usuario3[5] = String.valueOf(valorcuenta2total);
                        vis.visualizar_transferencia(guardarnumerodetarjeta);
                        almacenadordemovimientos7+= "Hiciste una transferencia de: $"+montoo+" a la cuenta "+guardarnumerodetarjeta+"\n";
                       
                    }
                        
                        break;
                   }
                   case "0004":
                   {
                       MONTO = Double.parseDouble(monto.getText());
                     SALDO = Double.parseDouble(usuario7[5]);
                       saldonuevo = ope.operaciones_transferencia_persona_1_retiro(MONTO, SALDO);
                    montoo = ope.operaciones_retiro_regresar_monto();
                    System.out.println(montoo);
                    if(montoo==0){
                        
                    }
                    else{
                        //A usuario 1 se le asigna el sueldo nuevo
                     usuario7[5] = String.valueOf(saldonuevo);
                     //Operaciones del deposito
                        double valorcuenta2 = Double.parseDouble(usuario4[5] );
                         System.out.println(valorcuenta2);
                         double valorcuenta2total = valorcuenta2 + montoo;
                        System.out.println(valorcuenta2total);
                        almacenadordemovimientos4 += "Se hizo una transferencia a tu cuenta de $: "+montoo +" desde la cuenta 0007\n";
                        System.out.println(almacenadordemovimientos4);
                        usuario4[5] = String.valueOf(valorcuenta2total);
                        vis.visualizar_transferencia(guardarnumerodetarjeta);
                        almacenadordemovimientos7+= "Hiciste una transferencia de: $"+montoo+" a la cuenta "+guardarnumerodetarjeta+"\n";
                       
                    }
                        break;
                   }
                   case "0005":
                   {
                       MONTO = Double.parseDouble(monto.getText());
                     SALDO = Double.parseDouble(usuario7[5]);
                       saldonuevo = ope.operaciones_transferencia_persona_1_retiro(MONTO, SALDO);
                    montoo = ope.operaciones_retiro_regresar_monto();
                    System.out.println(montoo);
                    if(montoo==0){
                        
                    }
                    else{
                        //A usuario 1 se le asigna el sueldo nuevo
                     usuario7[5] = String.valueOf(saldonuevo);
                     //Operaciones del deposito
                        double valorcuenta2 = Double.parseDouble(usuario5[5] );
                         System.out.println(valorcuenta2);
                         double valorcuenta2total = valorcuenta2 + montoo;
                        System.out.println(valorcuenta2total);
                        almacenadordemovimientos5 += "Se hizo una transferencia a tu cuenta de $: "+montoo +" desde la cuenta 0007\n";
                        System.out.println(almacenadordemovimientos5);
                        usuario5[5] = String.valueOf(valorcuenta2total);
                        vis.visualizar_transferencia(guardarnumerodetarjeta);
                        almacenadordemovimientos7+= "Hiciste una transferencia de: $"+montoo+" a la cuenta "+guardarnumerodetarjeta+"\n";
                       
                    }
                        break;
                   }
                   case "0006":
                   {
                       MONTO = Double.parseDouble(monto.getText());
                     SALDO = Double.parseDouble(usuario7[5]);
                       saldonuevo = ope.operaciones_transferencia_persona_1_retiro(MONTO, SALDO);
                    montoo = ope.operaciones_retiro_regresar_monto();
                    System.out.println(montoo);
                    if(montoo==0){
                        
                    }
                    else{
                        //A usuario 1 se le asigna el sueldo nuevo
                     usuario7[5] = String.valueOf(saldonuevo);
                     //Operaciones del deposito
                        double valorcuenta2 = Double.parseDouble(usuario6[5] );
                         System.out.println(valorcuenta2);
                         double valorcuenta2total = valorcuenta2 + montoo;
                        System.out.println(valorcuenta2total);
                        almacenadordemovimientos6 += "Se hizo una transferencia a tu cuenta de $: "+montoo +" desde la cuenta 0007\n";
                        System.out.println(almacenadordemovimientos6);
                        usuario6[5] = String.valueOf(valorcuenta2total);
                        vis.visualizar_transferencia(guardarnumerodetarjeta);
                        almacenadordemovimientos7+= "Hiciste una transferencia de: $"+montoo+" a la cuenta "+guardarnumerodetarjeta+"\n";
                       
                    }
                        break;
                   }
                   case "0001":
                   {
                       MONTO = Double.parseDouble(monto.getText());
                     SALDO = Double.parseDouble(usuario7[5]);
                      saldonuevo = ope.operaciones_transferencia_persona_1_retiro(MONTO, SALDO);
                    montoo = ope.operaciones_retiro_regresar_monto();
                    System.out.println(montoo);
                    if(montoo==0){
                        
                    }
                    else{
                        //A usuario 1 se le asigna el sueldo nuevo
                     usuario7[5] = String.valueOf(saldonuevo);
                     //Operaciones del deposito
                        double valorcuenta2 = Double.parseDouble(usuario1[5] );
                         System.out.println(valorcuenta2);
                         double valorcuenta2total = valorcuenta2 + montoo;
                        System.out.println(valorcuenta2total);
                        almacenadordemovimientos  += "Se hizo una transferencia a tu cuenta de $: "+montoo +" desde la cuenta 0007\n";
                        System.out.println(almacenadordemovimientos );
                        usuario1[5] = String.valueOf(valorcuenta2total);
                        vis.visualizar_transferencia(guardarnumerodetarjeta);
                        almacenadordemovimientos7+= "Hiciste una transferencia de: $"+montoo+" a la cuenta "+guardarnumerodetarjeta+"\n";
                       
                    }
                   }
                   case "0008":
                   {
                       MONTO = Double.parseDouble(monto.getText());
                     SALDO = Double.parseDouble(usuario7[5]);
                       saldonuevo = ope.operaciones_transferencia_persona_1_retiro(MONTO, SALDO);
                    montoo = ope.operaciones_retiro_regresar_monto();
                    System.out.println(montoo);
                    if(montoo==0){
                        
                    }
                    else{
                        //A usuario 1 se le asigna el sueldo nuevo
                     usuario7[5] = String.valueOf(saldonuevo);
                     //Operaciones del deposito
                       double valorcuenta2 = Double.parseDouble(usuario8[5] );
                         System.out.println(valorcuenta2);
                         double valorcuenta2total = valorcuenta2 + montoo;
                        System.out.println(valorcuenta2total);
                        almacenadordemovimientos8 += "Se hizo una transferencia a tu cuenta de $: "+montoo +" desde la cuenta 0007\n";
                        System.out.println(almacenadordemovimientos8);
                        usuario8[5] = String.valueOf(valorcuenta2total);
                        vis.visualizar_transferencia(guardarnumerodetarjeta);
                        almacenadordemovimientos7+= "Hiciste una transferencia de: $"+montoo+" a la cuenta "+guardarnumerodetarjeta+"\n";
                       
                    }
                        break;
                   }
                   case "0009":
                   {
                       MONTO = Double.parseDouble(monto.getText());
                     SALDO = Double.parseDouble(usuario7[5]);
                       saldonuevo = ope.operaciones_transferencia_persona_1_retiro(MONTO, SALDO);
                    montoo = ope.operaciones_retiro_regresar_monto();
                    System.out.println(montoo);
                    if(montoo==0){
                        
                    }
                    else{
                        //A usuario 1 se le asigna el sueldo nuevo
                     usuario7[5] = String.valueOf(saldonuevo);
                     //Operaciones del deposito
                        double valorcuenta2 = Double.parseDouble(usuario9[5] );
                         System.out.println(valorcuenta2);
                         double valorcuenta2total = valorcuenta2 + montoo;
                        System.out.println(valorcuenta2total);
                        almacenadordemovimientos9 += "Se hizo una transferencia a tu cuenta de $: "+montoo +" desde la cuenta 0007\n";
                        System.out.println(almacenadordemovimientos9);
                        usuario9[5] = String.valueOf(valorcuenta2total);
                        vis.visualizar_transferencia(guardarnumerodetarjeta);
                        almacenadordemovimientos7+= "Hiciste una transferencia de: $"+montoo+" a la cuenta "+guardarnumerodetarjeta+"\n";
                       
                    }
                        break;
                   }
                   case "0010":
                   {
                       MONTO = Double.parseDouble(monto.getText());
                     SALDO = Double.parseDouble(usuario7[5]);
                       saldonuevo = ope.operaciones_transferencia_persona_1_retiro(MONTO, SALDO);
                    montoo = ope.operaciones_retiro_regresar_monto();
                    System.out.println(montoo);
                    if(montoo==0){
                        
                    }
                    else{
                        //A usuario 1 se le asigna el sueldo nuevo
                     usuario7[5] = String.valueOf(saldonuevo);
                     //Operaciones del deposito
                       double valorcuenta2 = Double.parseDouble(usuario10[5] );
                         System.out.println(valorcuenta2);
                         double valorcuenta2total = valorcuenta2 + montoo;
                        System.out.println(valorcuenta2total);
                        almacenadordemovimientos10 += "Se hizo una transferencia a tu cuenta de $: "+montoo +" desde la cuenta 0007\n";
                        System.out.println(almacenadordemovimientos10);
                        usuario10[5] = String.valueOf(valorcuenta2total);
                        vis.visualizar_transferencia(guardarnumerodetarjeta);
                        almacenadordemovimientos7+= "Hiciste una transferencia de: $"+montoo+" a la cuenta "+guardarnumerodetarjeta+"\n";
                       
                    }
                        break;
                   }
                    default:
                   {
                       vis.usuario_no_existente();
                       almacenadordemovimientos7+= "No fue posible realizar transacción\n";
                   }
                   
               }
                    }
                    }
                   
                }
           }

           
           //Movimientos
           if(movimientospresionado == true){
               vis.visualizar_movimientos(almacenadordemovimientos);
               
           }
        }
        /////////////////////////////////////////////////////////////////////////////////////////////////
        if("0008".equals(numerotarjeta.getText())){
            if(consultarsaldopresionado == true){
            saldo.setText(usuario8[5]);
            almacenadordemovimientos8 += "Hiciste una consulta - Saldo Moméntaneo $ "+ saldo.getText()+"\n";
            System.out.println(almacenadordemovimientos8);
            }
           
           //Retiro
           if(retiropresionado == true){
           MONTO = Double.parseDouble(monto.getText());
           SALDO = Double.parseDouble(usuario8[5]);
            saldonuevo = ope.operaciones_retiro(MONTO, SALDO);
           montoo = ope.operaciones_retiro_regresar_monto();
           
           usuario8[5] = String.valueOf(saldonuevo);
           
               if(MONTO > 5000 || MONTO>SALDO){
                   almacenadordemovimientos8 += "Retiro Cancelado por Restricciones\n";
                   System.out.println(almacenadordemovimientos8);
               }
               else{
               almacenadordemovimientos8 += "Hiciste un retiro - Monto del Retiro $ "+ String.valueOf(montoo)+"\n";
               System.out.println(almacenadordemovimientos8);
               }
           }
           
           
           //Depósito
           if(depositopresionado == true){
           MONTODEPOSITO = Double.parseDouble(monto.getText());
           SALDODEPOSITO = Double.parseDouble(usuario8[5]);
           saldonuevodeposito = ope.operaciones_deposito(MONTODEPOSITO, SALDODEPOSITO);
           usuario8[5] = String.valueOf(saldonuevodeposito);
           almacenadordemovimientos8 += "Hiciste un deposito - Monto del Déposito $ "+ MONTODEPOSITO+"\n";
           System.out.println(almacenadordemovimientos8);
           }
           
           if(transferenciapresionado == true){
                if(numerotarjeta.getText().equals(tarjeta1.getText())){
                vis.mensaje_mismousuario();
                almacenadordemovimientos8+= "No se pudo llevar a cabo la transacción por excepciones\n";
               }
                else{
                    if("".equals(tarjeta1.getText())){
                        vis.mensaje_introduce_numerotarjeta();
                    }
                    else{
                        if("".equals(monto.getText())){
                        vis.mensaje_introduce_monto();
                    }
                    else{
                         //Recibir numero de tarjeta
                     guardarnumerodetarjeta = tarjeta1.getText();
                     System.out.println(guardarnumerodetarjeta);
                    
                    //Segun sea el numero de tarjeta se hara el deposito y retiro correspondiente
               switch(guardarnumerodetarjeta){
                   case "0008":
                   {
                       vis.mensaje_mismousuario();
                       almacenadordemovimientos8+= "No fue posible realizar transacción\n";
                   }
                   case "0002":
                   {
                        MONTO = Double.parseDouble(monto.getText());
                     SALDO = Double.parseDouble(usuario8[5]);
                    saldonuevo = ope.operaciones_transferencia_persona_1_retiro(MONTO, SALDO);
                    montoo = ope.operaciones_retiro_regresar_monto();
                    System.out.println(montoo);
                    if(montoo==0){
                        
                    }
                    else{
                        //A usuario 1 se le asigna el sueldo nuevo
                     usuario8[5] = String.valueOf(saldonuevo);
                     //Operaciones del deposito
                       double valorcuenta2 = Double.parseDouble(usuario2[5] );
                         System.out.println(valorcuenta2);
                         double valorcuenta2total = valorcuenta2 + montoo;
                        System.out.println(valorcuenta2total);
                        almacenadordemovimientos2 += "Se hizo una transferencia a tu cuenta de $: "+montoo +" desde la cuenta 0008\n";
                        System.out.println(almacenadordemovimientos2);
                        usuario2[5] = String.valueOf(valorcuenta2total);
                        vis.visualizar_transferencia(guardarnumerodetarjeta);
                        almacenadordemovimientos8+= "Hiciste una transferencia de: $"+montoo+" a la cuenta "+guardarnumerodetarjeta+"\n";
                       
                    }
                   
           
                    break;
                   }
                   case "0003":
                   {
                        MONTO = Double.parseDouble(monto.getText());
                     SALDO = Double.parseDouble(usuario8[5]);
                    saldonuevo = ope.operaciones_transferencia_persona_1_retiro(MONTO, SALDO);
                    montoo = ope.operaciones_retiro_regresar_monto();
                    System.out.println(montoo);
                    if(montoo==0){
                        
                    }
                    else{
                        //A usuario 1 se le asigna el sueldo nuevo
                     usuario8[5] = String.valueOf(saldonuevo);
                     //Operaciones del deposito
                        double valorcuenta2 = Double.parseDouble(usuario3[5] );
                         System.out.println(valorcuenta2);
                         double valorcuenta2total = valorcuenta2 + montoo;
                        System.out.println(valorcuenta2total);
                        almacenadordemovimientos3 += "Se hizo una transferencia a tu cuenta de $: "+montoo +" desde la cuenta 0008\n";
                        System.out.println(almacenadordemovimientos3);
                        usuario3[5] = String.valueOf(valorcuenta2total);
                        vis.visualizar_transferencia(guardarnumerodetarjeta);
                        almacenadordemovimientos8+= "Hiciste una transferencia de: $"+montoo+" a la cuenta "+guardarnumerodetarjeta+"\n";
                       
                    }
                        
                        break;
                   }
                   case "0004":
                   {
                        MONTO = Double.parseDouble(monto.getText());
                     SALDO = Double.parseDouble(usuario8[5]);
                       saldonuevo = ope.operaciones_transferencia_persona_1_retiro(MONTO, SALDO);
                    montoo = ope.operaciones_retiro_regresar_monto();
                    System.out.println(montoo);
                    if(montoo==0){
                        
                    }
                    else{
                        //A usuario 1 se le asigna el sueldo nuevo
                     usuario8[5] = String.valueOf(saldonuevo);
                     //Operaciones del deposito
                        double valorcuenta2 = Double.parseDouble(usuario4[5] );
                         System.out.println(valorcuenta2);
                         double valorcuenta2total = valorcuenta2 + montoo;
                        System.out.println(valorcuenta2total);
                        almacenadordemovimientos4 += "Se hizo una transferencia a tu cuenta de $: "+montoo +" desde la cuenta 0008\n";
                        System.out.println(almacenadordemovimientos4);
                        usuario4[5] = String.valueOf(valorcuenta2total);
                        vis.visualizar_transferencia(guardarnumerodetarjeta);
                        almacenadordemovimientos8+= "Hiciste una transferencia de: $"+montoo+" a la cuenta "+guardarnumerodetarjeta+"\n";
                       
                    }
                        break;
                   }
                   case "0005":
                   {
                        MONTO = Double.parseDouble(monto.getText());
                     SALDO = Double.parseDouble(usuario8[5]);
                       saldonuevo = ope.operaciones_transferencia_persona_1_retiro(MONTO, SALDO);
                    montoo = ope.operaciones_retiro_regresar_monto();
                    System.out.println(montoo);
                    if(montoo==0){
                        
                    }
                    else{
                        //A usuario 1 se le asigna el sueldo nuevo
                     usuario8[5] = String.valueOf(saldonuevo);
                     //Operaciones del deposito
                        double valorcuenta2 = Double.parseDouble(usuario5[5] );
                         System.out.println(valorcuenta2);
                         double valorcuenta2total = valorcuenta2 + montoo;
                        System.out.println(valorcuenta2total);
                        almacenadordemovimientos5 += "Se hizo una transferencia a tu cuenta de $: "+montoo +" desde la cuenta 0008\n";
                        System.out.println(almacenadordemovimientos5);
                        usuario5[5] = String.valueOf(valorcuenta2total);
                        vis.visualizar_transferencia(guardarnumerodetarjeta);
                        almacenadordemovimientos8+= "Hiciste una transferencia de: $"+montoo+" a la cuenta "+guardarnumerodetarjeta+"\n";
                       
                    }
                        break;
                   }
                   case "0006":
                   {
                        MONTO = Double.parseDouble(monto.getText());
                     SALDO = Double.parseDouble(usuario8[5]);
                       saldonuevo = ope.operaciones_transferencia_persona_1_retiro(MONTO, SALDO);
                    montoo = ope.operaciones_retiro_regresar_monto();
                    System.out.println(montoo);
                    if(montoo==0){
                        
                    }
                    else{
                        //A usuario 1 se le asigna el sueldo nuevo
                     usuario8[5] = String.valueOf(saldonuevo);
                     //Operaciones del deposito
                        double valorcuenta2 = Double.parseDouble(usuario6[5] );
                         System.out.println(valorcuenta2);
                         double valorcuenta2total = valorcuenta2 + montoo;
                        System.out.println(valorcuenta2total);
                        almacenadordemovimientos6 += "Se hizo una transferencia a tu cuenta de $: "+montoo +" desde la cuenta 0008\n";
                        System.out.println(almacenadordemovimientos6);
                        usuario6[5] = String.valueOf(valorcuenta2total);
                        vis.visualizar_transferencia(guardarnumerodetarjeta);
                        almacenadordemovimientos8+= "Hiciste una transferencia de: $"+montoo+" a la cuenta "+guardarnumerodetarjeta+"\n";
                       
                    }
                        break;
                   }
                   case "0007":
                   {
                        MONTO = Double.parseDouble(monto.getText());
                     SALDO = Double.parseDouble(usuario8[5]);
                      saldonuevo = ope.operaciones_transferencia_persona_1_retiro(MONTO, SALDO);
                    montoo = ope.operaciones_retiro_regresar_monto();
                    System.out.println(montoo);
                    if(montoo==0){
                        
                    }
                    else{
                        //A usuario 1 se le asigna el sueldo nuevo
                     usuario8[5] = String.valueOf(saldonuevo);
                     //Operaciones del deposito
                       double valorcuenta2 = Double.parseDouble(usuario7[5] );
                         System.out.println(valorcuenta2);
                         double valorcuenta2total = valorcuenta2 + montoo;
                        System.out.println(valorcuenta2total);
                        almacenadordemovimientos7 += "Se hizo una transferencia a tu cuenta de $: "+montoo +" desde la cuenta 0008\n";
                        System.out.println(almacenadordemovimientos7);
                        usuario7[5] = String.valueOf(valorcuenta2total);
                        vis.visualizar_transferencia(guardarnumerodetarjeta);
                        almacenadordemovimientos8+= "Hiciste una transferencia de: $"+montoo+" a la cuenta "+guardarnumerodetarjeta+"\n";
                       
                    }
                   }
                   case "0001":
                   {
                        MONTO = Double.parseDouble(monto.getText());
                     SALDO = Double.parseDouble(usuario8[5]);
                       saldonuevo = ope.operaciones_transferencia_persona_1_retiro(MONTO, SALDO);
                    montoo = ope.operaciones_retiro_regresar_monto();
                    System.out.println(montoo);
                    if(montoo==0){
                        
                    }
                    else{
                        //A usuario 1 se le asigna el sueldo nuevo
                     usuario8[5] = String.valueOf(saldonuevo);
                     //Operaciones del deposito
                        double valorcuenta2 = Double.parseDouble(usuario1[5] );
                         System.out.println(valorcuenta2);
                         double valorcuenta2total = valorcuenta2 + montoo;
                        System.out.println(valorcuenta2total);
                        almacenadordemovimientos  += "Se hizo una transferencia a tu cuenta de $: "+montoo +" desde la cuenta 0008\n";
                        System.out.println(almacenadordemovimientos );
                        usuario1[5] = String.valueOf(valorcuenta2total);
                        vis.visualizar_transferencia(guardarnumerodetarjeta);
                        almacenadordemovimientos8+= "Hiciste una transferencia de: $"+montoo+" a la cuenta "+guardarnumerodetarjeta+"\n";
                       
                    }
                        break;
                   }
                   case "0009":
                   {
                        MONTO = Double.parseDouble(monto.getText());
                     SALDO = Double.parseDouble(usuario8[5]);
                       saldonuevo = ope.operaciones_transferencia_persona_1_retiro(MONTO, SALDO);
                    montoo = ope.operaciones_retiro_regresar_monto();
                    System.out.println(montoo);
                    if(montoo==0){
                        
                    }
                    else{
                        //A usuario 1 se le asigna el sueldo nuevo
                     usuario8[5] = String.valueOf(saldonuevo);
                     //Operaciones del deposito
                        double valorcuenta2 = Double.parseDouble(usuario9[5] );
                         System.out.println(valorcuenta2);
                         double valorcuenta2total = valorcuenta2 + montoo;
                        System.out.println(valorcuenta2total);
                        almacenadordemovimientos9 += "Se hizo una transferencia a tu cuenta de $: "+montoo +" desde la cuenta 0008\n";
                        System.out.println(almacenadordemovimientos9);
                        usuario9[5] = String.valueOf(valorcuenta2total);
                        vis.visualizar_transferencia(guardarnumerodetarjeta);
                        almacenadordemovimientos8+= "Hiciste una transferencia de: $"+montoo+" a la cuenta "+guardarnumerodetarjeta+"\n";
                       
                    }
                        break;
                   }
                   case "0010":
                   {
                        MONTO = Double.parseDouble(monto.getText());
                     SALDO = Double.parseDouble(usuario8[5]);
                       saldonuevo = ope.operaciones_transferencia_persona_1_retiro(MONTO, SALDO);
                    montoo = ope.operaciones_retiro_regresar_monto();
                    System.out.println(montoo);
                    if(montoo==0){
                        
                    }
                    else{
                        //A usuario 1 se le asigna el sueldo nuevo
                     usuario8[5] = String.valueOf(saldonuevo);
                     //Operaciones del deposito
                       double valorcuenta2 = Double.parseDouble(usuario10[5] );
                         System.out.println(valorcuenta2);
                         double valorcuenta2total = valorcuenta2 + montoo;
                        System.out.println(valorcuenta2total);
                        almacenadordemovimientos10 += "Se hizo una transferencia a tu cuenta de $: "+montoo +" desde la cuenta 0008\n";
                        System.out.println(almacenadordemovimientos10);
                        usuario10[5] = String.valueOf(valorcuenta2total);
                        vis.visualizar_transferencia(guardarnumerodetarjeta);
                        almacenadordemovimientos8+= "Hiciste una transferencia de: $"+montoo+" a la cuenta "+guardarnumerodetarjeta+"\n";
                       
                    }
                        break;
                   }
                    default:
                   {
                       vis.usuario_no_existente();
                       almacenadordemovimientos8+= "No fue posible realizar transacción\n";
                   }
                   
               }
                    }
                    }
                   
                }
           }

           
           //Movimientos
           if(movimientospresionado == true){
               vis.visualizar_movimientos(almacenadordemovimientos);
               
           }
           
        }
        ///////////////////////////////////////////////////////////////////////////////////777
        if("0009".equals(numerotarjeta.getText())){
            if(consultarsaldopresionado == true){
            saldo.setText(usuario9[5]);
            almacenadordemovimientos9 += "Hiciste una consulta - Saldo Moméntaneo $ "+ saldo.getText()+"\n";
            System.out.println(almacenadordemovimientos9);
            }
           
           //Retiro
           if(retiropresionado == true){
           MONTO = Double.parseDouble(monto.getText());
           SALDO = Double.parseDouble(usuario9[5]);
            saldonuevo = ope.operaciones_retiro(MONTO, SALDO);
           montoo = ope.operaciones_retiro_regresar_monto();
           
           usuario9[5] = String.valueOf(saldonuevo);
           
               if(MONTO > 5000 || MONTO>SALDO){
                   almacenadordemovimientos9 += "Retiro Cancelado por Restricciones\n";
                   System.out.println(almacenadordemovimientos9);
               }
               else{
               almacenadordemovimientos9 += "Hiciste un retiro - Monto del Retiro $ "+ String.valueOf(montoo)+"\n";
               System.out.println(almacenadordemovimientos9);
               }
           }
           
           
           //Depósito
           if(depositopresionado == true){
           MONTODEPOSITO = Double.parseDouble(monto.getText());
           SALDODEPOSITO = Double.parseDouble(usuario9[5]);
           saldonuevodeposito = ope.operaciones_deposito(MONTODEPOSITO, SALDODEPOSITO);
           usuario9[5] = String.valueOf(saldonuevodeposito);
           almacenadordemovimientos9 += "Hiciste un deposito - Monto del Déposito $ "+ MONTODEPOSITO+"\n";
           System.out.println(almacenadordemovimientos);
           }
           
           if(transferenciapresionado == true){
                if(numerotarjeta.getText().equals(tarjeta1.getText())){
                vis.mensaje_mismousuario();
                almacenadordemovimientos9+= "No se pudo llevar a cabo la transacción por excepciones\n";
               }
                else{
                    if("".equals(tarjeta1.getText())){
                        vis.mensaje_introduce_numerotarjeta();
                    }
                    else{
                        if("".equals(monto.getText())){
                        vis.mensaje_introduce_monto();
                    }
                    else{
                         //Recibir numero de tarjeta
                     guardarnumerodetarjeta = tarjeta1.getText();
                     System.out.println(guardarnumerodetarjeta);
                     
                    //Segun sea el numero de tarjeta se hara el deposito y retiro correspondiente
               switch(guardarnumerodetarjeta){
                   case "0009":
                   {
                       vis.mensaje_mismousuario();
                       almacenadordemovimientos9+= "No fue posible realizar transacción\n";
                   }
                   case "0002":
                   {
                       MONTO = Double.parseDouble(monto.getText());
                     SALDO = Double.parseDouble(usuario9[5]);
                    saldonuevo = ope.operaciones_transferencia_persona_1_retiro(MONTO, SALDO);
                    montoo = ope.operaciones_retiro_regresar_monto();
                    System.out.println(montoo);
                    if(montoo==0){
                        
                    }
                    else{
                        //A usuario 1 se le asigna el sueldo nuevo
                     usuario9[5] = String.valueOf(saldonuevo);
                     //Operaciones del deposito
                        double valorcuenta2 = Double.parseDouble(usuario2[5] );
                         System.out.println(valorcuenta2);
                         double valorcuenta2total = valorcuenta2 + montoo;
                        System.out.println(valorcuenta2total);
                        almacenadordemovimientos2 += "Se hizo una transferencia a tu cuenta de $: "+montoo +" desde la cuenta 0009\n";
                        System.out.println(almacenadordemovimientos2);
                        usuario2[5] = String.valueOf(valorcuenta2total);
                        vis.visualizar_transferencia(guardarnumerodetarjeta);
                        almacenadordemovimientos9+= "Hiciste una transferencia de: $"+montoo+" a la cuenta "+guardarnumerodetarjeta+"\n";
                       
                    }
                   
           
                    break;
                   }
                   case "0003":
                   {
                       MONTO = Double.parseDouble(monto.getText());
                     SALDO = Double.parseDouble(usuario9[5]);
                    saldonuevo = ope.operaciones_transferencia_persona_1_retiro(MONTO, SALDO);
                    montoo = ope.operaciones_retiro_regresar_monto();
                    System.out.println(montoo);
                    if(montoo==0){
                        
                    }
                    else{
                        //A usuario 1 se le asigna el sueldo nuevo
                     usuario9[5] = String.valueOf(saldonuevo);
                     //Operaciones del deposito
                        double valorcuenta2 = Double.parseDouble(usuario3[5] );
                         System.out.println(valorcuenta2);
                         double valorcuenta2total = valorcuenta2 + montoo;
                        System.out.println(valorcuenta2total);
                        almacenadordemovimientos3 += "Se hizo una transferencia a tu cuenta de $: "+montoo +" desde la cuenta 0009\n";
                        System.out.println(almacenadordemovimientos3);
                        usuario3[5] = String.valueOf(valorcuenta2total);
                        vis.visualizar_transferencia(guardarnumerodetarjeta);
                        almacenadordemovimientos9+= "Hiciste una transferencia de: $"+montoo+" a la cuenta "+guardarnumerodetarjeta+"\n";
                       
                    }
                        
                        break;
                   }
                   case "0004":
                   {
                       MONTO = Double.parseDouble(monto.getText());
                     SALDO = Double.parseDouble(usuario9[5]);
                       saldonuevo = ope.operaciones_transferencia_persona_1_retiro(MONTO, SALDO);
                    montoo = ope.operaciones_retiro_regresar_monto();
                    System.out.println(montoo);
                    if(montoo==0){
                        
                    }
                    else{
                        //A usuario 1 se le asigna el sueldo nuevo
                     usuario9[5] = String.valueOf(saldonuevo);
                     //Operaciones del deposito
                        double valorcuenta2 = Double.parseDouble(usuario4[5] );
                         System.out.println(valorcuenta2);
                         double valorcuenta2total = valorcuenta2 + montoo;
                        System.out.println(valorcuenta2total);
                        almacenadordemovimientos4 += "Se hizo una transferencia a tu cuenta de $: "+montoo +" desde la cuenta 0009\n";
                        System.out.println(almacenadordemovimientos4);
                        usuario4[5] = String.valueOf(valorcuenta2total);
                        vis.visualizar_transferencia(guardarnumerodetarjeta);
                        almacenadordemovimientos9+= "Hiciste una transferencia de: $"+montoo+" a la cuenta "+guardarnumerodetarjeta+"\n";
                       
                    }
                        break;
                   }
                   case "0005":
                   {
                       MONTO = Double.parseDouble(monto.getText());
                     SALDO = Double.parseDouble(usuario9[5]);
                       saldonuevo = ope.operaciones_transferencia_persona_1_retiro(MONTO, SALDO);
                    montoo = ope.operaciones_retiro_regresar_monto();
                    System.out.println(montoo);
                    if(montoo==0){
                        
                    }
                    else{
                        //A usuario 1 se le asigna el sueldo nuevo
                     usuario9[5] = String.valueOf(saldonuevo);
                     //Operaciones del deposito
                        double valorcuenta2 = Double.parseDouble(usuario5[5] );
                         System.out.println(valorcuenta2);
                         double valorcuenta2total = valorcuenta2 + montoo;
                        System.out.println(valorcuenta2total);
                        almacenadordemovimientos5 += "Se hizo una transferencia a tu cuenta de $: "+montoo +" desde la cuenta 0009\n";
                        System.out.println(almacenadordemovimientos5);
                        usuario5[5] = String.valueOf(valorcuenta2total);
                        vis.visualizar_transferencia(guardarnumerodetarjeta);
                        almacenadordemovimientos9+= "Hiciste una transferencia de: $"+montoo+" a la cuenta "+guardarnumerodetarjeta+"\n";
                       
                    }
                        break;
                   }
                   case "0006":
                   {
                       MONTO = Double.parseDouble(monto.getText());
                     SALDO = Double.parseDouble(usuario9[5]);
                       saldonuevo = ope.operaciones_transferencia_persona_1_retiro(MONTO, SALDO);
                    montoo = ope.operaciones_retiro_regresar_monto();
                    System.out.println(montoo);
                    if(montoo==0){
                        
                    }
                    else{
                        //A usuario 1 se le asigna el sueldo nuevo
                     usuario9[5] = String.valueOf(saldonuevo);
                     //Operaciones del deposito
                       double valorcuenta2 = Double.parseDouble(usuario6[5] );
                         System.out.println(valorcuenta2);
                         double valorcuenta2total = valorcuenta2 + montoo;
                        System.out.println(valorcuenta2total);
                        almacenadordemovimientos6 += "Se hizo una transferencia a tu cuenta de $: "+montoo +" desde la cuenta 0009\n";
                        System.out.println(almacenadordemovimientos6);
                        usuario6[5] = String.valueOf(valorcuenta2total);
                        vis.visualizar_transferencia(guardarnumerodetarjeta);
                        almacenadordemovimientos9+= "Hiciste una transferencia de: $"+montoo+" a la cuenta "+guardarnumerodetarjeta+"\n";
                       
                    }
                        break;
                   }
                   case "0007":
                   {
                       MONTO = Double.parseDouble(monto.getText());
                     SALDO = Double.parseDouble(usuario9[5]);
                      saldonuevo = ope.operaciones_transferencia_persona_1_retiro(MONTO, SALDO);
                    montoo = ope.operaciones_retiro_regresar_monto();
                    System.out.println(montoo);
                    if(montoo==0){
                        
                    }
                    else{
                        //A usuario 1 se le asigna el sueldo nuevo
                     usuario9[5] = String.valueOf(saldonuevo);
                     //Operaciones del deposito
                        double valorcuenta2 = Double.parseDouble(usuario7[5] );
                         System.out.println(valorcuenta2);
                         double valorcuenta2total = valorcuenta2 + montoo;
                        System.out.println(valorcuenta2total);
                        almacenadordemovimientos7 += "Se hizo una transferencia a tu cuenta de $: "+montoo +" desde la cuenta 0009\n";
                        System.out.println(almacenadordemovimientos7);
                        usuario7[5] = String.valueOf(valorcuenta2total);
                        vis.visualizar_transferencia(guardarnumerodetarjeta);
                        almacenadordemovimientos9+= "Hiciste una transferencia de: $"+montoo+" a la cuenta "+guardarnumerodetarjeta+"\n";
                       
                    }
                   }
                   case "0008":
                   {
                       MONTO = Double.parseDouble(monto.getText());
                     SALDO = Double.parseDouble(usuario9[5]);
                       saldonuevo = ope.operaciones_transferencia_persona_1_retiro(MONTO, SALDO);
                    montoo = ope.operaciones_retiro_regresar_monto();
                    System.out.println(montoo);
                    if(montoo==0){
                        
                    }
                    else{
                        //A usuario 1 se le asigna el sueldo nuevo
                     usuario9[5] = String.valueOf(saldonuevo);
                     //Operaciones del deposito
                       double valorcuenta2 = Double.parseDouble(usuario8[5] );
                         System.out.println(valorcuenta2);
                         double valorcuenta2total = valorcuenta2 + montoo;
                        System.out.println(valorcuenta2total);
                        almacenadordemovimientos8 += "Se hizo una transferencia a tu cuenta de $: "+montoo +" desde la cuenta 0009\n";
                        System.out.println(almacenadordemovimientos8);
                        usuario8[5] = String.valueOf(valorcuenta2total);
                        vis.visualizar_transferencia(guardarnumerodetarjeta);
                        almacenadordemovimientos9+= "Hiciste una transferencia de: $"+montoo+" a la cuenta "+guardarnumerodetarjeta+"\n";
                       
                    }
                        break;
                   }
                   case "0001":
                   {
                       MONTO = Double.parseDouble(monto.getText());
                     SALDO = Double.parseDouble(usuario9[5]);
                       saldonuevo = ope.operaciones_transferencia_persona_1_retiro(MONTO, SALDO);
                    montoo = ope.operaciones_retiro_regresar_monto();
                    System.out.println(montoo);
                    if(montoo==0){
                        
                    }
                    else{
                        //A usuario 1 se le asigna el sueldo nuevo
                     usuario9[5] = String.valueOf(saldonuevo);
                     //Operaciones del deposito
                        double valorcuenta2 = Double.parseDouble(usuario1[5] );
                         System.out.println(valorcuenta2);
                         double valorcuenta2total = valorcuenta2 + montoo;
                        System.out.println(valorcuenta2total);
                        almacenadordemovimientos  += "Se hizo una transferencia a tu cuenta de $: "+montoo +" desde la cuenta 0009\n";
                        System.out.println(almacenadordemovimientos );
                        usuario1[5] = String.valueOf(valorcuenta2total);
                        vis.visualizar_transferencia(guardarnumerodetarjeta);
                        almacenadordemovimientos9+= "Hiciste una transferencia de: $"+montoo+" a la cuenta "+guardarnumerodetarjeta+"\n";
                       
                    }
                        break;
                   }
                   case "0010":
                   {
                       MONTO = Double.parseDouble(monto.getText());
                     SALDO = Double.parseDouble(usuario9[5]);
                       saldonuevo = ope.operaciones_transferencia_persona_1_retiro(MONTO, SALDO);
                    montoo = ope.operaciones_retiro_regresar_monto();
                    System.out.println(montoo);
                    if(montoo==0){
                        
                    }
                    else{
                        //A usuario 1 se le asigna el sueldo nuevo
                     usuario9[5] = String.valueOf(saldonuevo);
                     //Operaciones del deposito
                        double valorcuenta2 = Double.parseDouble(usuario10[5] );
                         System.out.println(valorcuenta2);
                         double valorcuenta2total = valorcuenta2 + montoo;
                        System.out.println(valorcuenta2total);
                        almacenadordemovimientos10 += "Se hizo una transferencia a tu cuenta de $: "+montoo +" desde la cuenta 0009\n";
                        System.out.println(almacenadordemovimientos10);
                        usuario10[5] = String.valueOf(valorcuenta2total);
                        vis.visualizar_transferencia(guardarnumerodetarjeta);
                        almacenadordemovimientos9+= "Hiciste una transferencia de: $"+montoo+" a la cuenta "+guardarnumerodetarjeta+"\n";
                       
                    }
                        break;
                   }
                    default:
                   {
                       vis.usuario_no_existente();
                       almacenadordemovimientos9+= "No fue posible realizar transacción\n";
                   }
                   
               }
                    }
                    }
                   
                }
           }

           
           //Movimientos
           if(movimientospresionado == true){
               vis.visualizar_movimientos(almacenadordemovimientos);
               
           }
        }
        /////////////////////////////////////////////////////////////////////////////////////////////////77
        if("0010".equals(numerotarjeta.getText())){
            if(consultarsaldopresionado == true){
            saldo.setText(usuario10[5]);
            almacenadordemovimientos10 += "Hiciste una consulta - Saldo Moméntaneo $ "+ saldo.getText()+"\n";
            System.out.println(almacenadordemovimientos10);
            }
           
           //Retiro
           if(retiropresionado == true){
           MONTO = Double.parseDouble(monto.getText());
           SALDO = Double.parseDouble(usuario10[5]);
            saldonuevo = ope.operaciones_retiro(MONTO, SALDO);
           montoo = ope.operaciones_retiro_regresar_monto();
           
           usuario10[5] = String.valueOf(saldonuevo);
           
               if(MONTO > 5000 || MONTO>SALDO){
                   almacenadordemovimientos10 += "Retiro Cancelado por Restricciones\n";
                   System.out.println(almacenadordemovimientos10);
               }
               else{
               almacenadordemovimientos10 += "Hiciste un retiro - Monto del Retiro $ "+ String.valueOf(montoo)+"\n";
               System.out.println(almacenadordemovimientos10);
               }
           }
           
           
           //Depósito
           if(depositopresionado == true){
           MONTODEPOSITO = Double.parseDouble(monto.getText());
           SALDODEPOSITO = Double.parseDouble(usuario10[5]);
           saldonuevodeposito = ope.operaciones_deposito(MONTODEPOSITO, SALDODEPOSITO);
           usuario10[5] = String.valueOf(saldonuevodeposito);
           almacenadordemovimientos10 += "Hiciste un deposito - Monto del Déposito $ "+ MONTODEPOSITO+"\n";
           System.out.println(almacenadordemovimientos10);
           }
           
          if(transferenciapresionado == true){
                if(numerotarjeta.getText().equals(tarjeta1.getText())){
                vis.mensaje_mismousuario();
                almacenadordemovimientos10+= "No se pudo llevar a cabo la transacción por excepciones\n";
               }
                else{
                    if("".equals(tarjeta1.getText())){
                        vis.mensaje_introduce_numerotarjeta();
                    }
                    else{
                        if("".equals(monto.getText())){
                        vis.mensaje_introduce_monto();
                    }
                    else{
                         //Recibir numero de tarjeta
                     guardarnumerodetarjeta = tarjeta1.getText();
                     System.out.println(guardarnumerodetarjeta);
                     
                    //Segun sea el numero de tarjeta se hara el deposito y retiro correspondiente
               switch(guardarnumerodetarjeta){
                   case "0010":
                   {
                       vis.mensaje_mismousuario();
                       almacenadordemovimientos10+= "No fue posible realizar transacción\n";
                   }
                   case "0002":
                   {
                       MONTO = Double.parseDouble(monto.getText());
                     SALDO = Double.parseDouble(usuario10[5]);
                    saldonuevo = ope.operaciones_transferencia_persona_1_retiro(MONTO, SALDO);
                    montoo = ope.operaciones_retiro_regresar_monto();
                    System.out.println(montoo);
                    if(montoo==0){
                        
                    }
                    else{
                        //A usuario 1 se le asigna el sueldo nuevo
                     usuario10[5] = String.valueOf(saldonuevo);
                     //Operaciones del deposito
                        double valorcuenta2 = Double.parseDouble(usuario2[5] );
                         System.out.println(valorcuenta2);
                         double valorcuenta2total = valorcuenta2 + montoo;
                        System.out.println(valorcuenta2total);
                        almacenadordemovimientos2 += "Se hizo una transferencia a tu cuenta de $: "+montoo +" desde la cuenta 0010\n";
                        System.out.println(almacenadordemovimientos2);
                        usuario2[5] = String.valueOf(valorcuenta2total);
                        vis.visualizar_transferencia(guardarnumerodetarjeta);
                        almacenadordemovimientos10+= "Hiciste una transferencia de: $"+montoo+" a la cuenta "+guardarnumerodetarjeta+"\n";
                       
                    }
                   
           
                    break;
                   }
                   case "0003":
                   {
                       MONTO = Double.parseDouble(monto.getText());
                     SALDO = Double.parseDouble(usuario10[5]);
                    saldonuevo = ope.operaciones_transferencia_persona_1_retiro(MONTO, SALDO);
                    montoo = ope.operaciones_retiro_regresar_monto();
                    System.out.println(montoo);
                    if(montoo==0){
                        
                    }
                    else{
                        //A usuario 1 se le asigna el sueldo nuevo
                     usuario10[5] = String.valueOf(saldonuevo);
                     //Operaciones del deposito
                       double valorcuenta2 = Double.parseDouble(usuario3[5] );
                         System.out.println(valorcuenta2);
                         double valorcuenta2total = valorcuenta2 + montoo;
                        System.out.println(valorcuenta2total);
                        almacenadordemovimientos3 += "Se hizo una transferencia a tu cuenta de $: "+montoo +" desde la cuenta 0010\n";
                        System.out.println(almacenadordemovimientos3);
                        usuario3[5] = String.valueOf(valorcuenta2total);
                        vis.visualizar_transferencia(guardarnumerodetarjeta);
                        almacenadordemovimientos10+= "Hiciste una transferencia de: $"+montoo+" a la cuenta "+guardarnumerodetarjeta+"\n";
                       
                    }
                        
                        break;
                   }
                   case "0004":
                   {
                       MONTO = Double.parseDouble(monto.getText());
                     SALDO = Double.parseDouble(usuario10[5]);
                       saldonuevo = ope.operaciones_transferencia_persona_1_retiro(MONTO, SALDO);
                    montoo = ope.operaciones_retiro_regresar_monto();
                    System.out.println(montoo);
                    if(montoo==0){
                        
                    }
                    else{
                        //A usuario 1 se le asigna el sueldo nuevo
                     usuario10[5] = String.valueOf(saldonuevo);
                     //Operaciones del deposito
                        double valorcuenta2 = Double.parseDouble(usuario4[5] );
                         System.out.println(valorcuenta2);
                         double valorcuenta2total = valorcuenta2 + montoo;
                        System.out.println(valorcuenta2total);
                        almacenadordemovimientos4 += "Se hizo una transferencia a tu cuenta de $: "+montoo +" desde la cuenta 0010\n";
                        System.out.println(almacenadordemovimientos4);
                        usuario4[5] = String.valueOf(valorcuenta2total);
                        vis.visualizar_transferencia(guardarnumerodetarjeta);
                        almacenadordemovimientos10+= "Hiciste una transferencia de: $"+montoo+" a la cuenta "+guardarnumerodetarjeta+"\n";
                       
                    }
                        break;
                   }
                   case "0005":
                   {
                       MONTO = Double.parseDouble(monto.getText());
                     SALDO = Double.parseDouble(usuario10[5]);
                       saldonuevo = ope.operaciones_transferencia_persona_1_retiro(MONTO, SALDO);
                    montoo = ope.operaciones_retiro_regresar_monto();
                    System.out.println(montoo);
                    if(montoo==0){
                        
                    }
                    else{
                        //A usuario 1 se le asigna el sueldo nuevo
                     usuario10[5] = String.valueOf(saldonuevo);
                     //Operaciones del deposito
                       double valorcuenta2 = Double.parseDouble(usuario5[5] );
                         System.out.println(valorcuenta2);
                         double valorcuenta2total = valorcuenta2 + montoo;
                        System.out.println(valorcuenta2total);
                        almacenadordemovimientos5 += "Se hizo una transferencia a tu cuenta de $: "+montoo +" desde la cuenta 0010\n";
                        System.out.println(almacenadordemovimientos5);
                        usuario5[5] = String.valueOf(valorcuenta2total);
                        vis.visualizar_transferencia(guardarnumerodetarjeta);
                        almacenadordemovimientos10+= "Hiciste una transferencia de: $"+montoo+" a la cuenta "+guardarnumerodetarjeta+"\n";
                       
                    }
                        break;
                   }
                   case "0006":
                   {
                       MONTO = Double.parseDouble(monto.getText());
                     SALDO = Double.parseDouble(usuario10[5]);
                       saldonuevo = ope.operaciones_transferencia_persona_1_retiro(MONTO, SALDO);
                    montoo = ope.operaciones_retiro_regresar_monto();
                    System.out.println(montoo);
                    if(montoo==0){
                        
                    }
                    else{
                        //A usuario 1 se le asigna el sueldo nuevo
                     usuario10[5] = String.valueOf(saldonuevo);
                     //Operaciones del deposito
                        double valorcuenta2 = Double.parseDouble(usuario6[5] );
                         System.out.println(valorcuenta2);
                         double valorcuenta2total = valorcuenta2 + montoo;
                        System.out.println(valorcuenta2total);
                        almacenadordemovimientos6 += "Se hizo una transferencia a tu cuenta de $: "+montoo +" desde la cuenta 0010\n";
                        System.out.println(almacenadordemovimientos6);
                        usuario6[5] = String.valueOf(valorcuenta2total);
                        vis.visualizar_transferencia(guardarnumerodetarjeta);
                        almacenadordemovimientos10+= "Hiciste una transferencia de: $"+montoo+" a la cuenta "+guardarnumerodetarjeta+"\n";
                       
                    }
                        break;
                   }
                   case "0007":
                   {
                       MONTO = Double.parseDouble(monto.getText());
                     SALDO = Double.parseDouble(usuario10[5]);
                      saldonuevo = ope.operaciones_transferencia_persona_1_retiro(MONTO, SALDO);
                    montoo = ope.operaciones_retiro_regresar_monto();
                    System.out.println(montoo);
                    if(montoo==0){
                        
                    }
                    else{
                        //A usuario 1 se le asigna el sueldo nuevo
                     usuario10[5] = String.valueOf(saldonuevo);
                     //Operaciones del deposito
                        double valorcuenta2 = Double.parseDouble(usuario7[5] );
                         System.out.println(valorcuenta2);
                         double valorcuenta2total = valorcuenta2 + montoo;
                        System.out.println(valorcuenta2total);
                        almacenadordemovimientos7 += "Se hizo una transferencia a tu cuenta de $: "+montoo +" desde la cuenta 0010\n";
                        System.out.println(almacenadordemovimientos7);
                        usuario7[5] = String.valueOf(valorcuenta2total);
                        vis.visualizar_transferencia(guardarnumerodetarjeta);
                        almacenadordemovimientos10+= "Hiciste una transferencia de: $"+montoo+" a la cuenta "+guardarnumerodetarjeta+"\n";
                       
                    }
                   }
                   case "0008":
                   {
                       MONTO = Double.parseDouble(monto.getText());
                     SALDO = Double.parseDouble(usuario10[5]);
                       saldonuevo = ope.operaciones_transferencia_persona_1_retiro(MONTO, SALDO);
                    montoo = ope.operaciones_retiro_regresar_monto();
                    System.out.println(montoo);
                    if(montoo==0){
                        
                    }
                    else{
                        //A usuario 1 se le asigna el sueldo nuevo
                     usuario10[5] = String.valueOf(saldonuevo);
                     //Operaciones del deposito
                        double valorcuenta2 = Double.parseDouble(usuario8[5] );
                         System.out.println(valorcuenta2);
                         double valorcuenta2total = valorcuenta2 + montoo;
                        System.out.println(valorcuenta2total);
                        almacenadordemovimientos8 += "Se hizo una transferencia a tu cuenta de $: "+montoo +" desde la cuenta 0010\n";
                        System.out.println(almacenadordemovimientos8);
                        usuario8[5] = String.valueOf(valorcuenta2total);
                        vis.visualizar_transferencia(guardarnumerodetarjeta);
                        almacenadordemovimientos10+= "Hiciste una transferencia de: $"+montoo+" a la cuenta "+guardarnumerodetarjeta+"\n";
                       
                    }
                        break;
                   }
                   case "0009":
                   {
                       MONTO = Double.parseDouble(monto.getText());
                     SALDO = Double.parseDouble(usuario10[5]);
                       saldonuevo = ope.operaciones_transferencia_persona_1_retiro(MONTO, SALDO);
                    montoo = ope.operaciones_retiro_regresar_monto();
                    System.out.println(montoo);
                    if(montoo==0){
                        
                    }
                    else{
                        //A usuario 1 se le asigna el sueldo nuevo
                     usuario10[5] = String.valueOf(saldonuevo);
                     //Operaciones del deposito
                        double valorcuenta2 = Double.parseDouble(usuario9[5] );
                         System.out.println(valorcuenta2);
                         double valorcuenta2total = valorcuenta2 + montoo;
                        System.out.println(valorcuenta2total);
                        almacenadordemovimientos9 += "Se hizo una transferencia a tu cuenta de $: "+montoo +" desde la cuenta 0010\n";
                        System.out.println(almacenadordemovimientos9);
                        usuario9[5] = String.valueOf(valorcuenta2total);
                        vis.visualizar_transferencia(guardarnumerodetarjeta);
                        almacenadordemovimientos10+= "Hiciste una transferencia de: $"+montoo+" a la cuenta "+guardarnumerodetarjeta+"\n";
                       
                    }
                        break;
                   }
                   case "0001":
                   {
                       MONTO = Double.parseDouble(monto.getText());
                     SALDO = Double.parseDouble(usuario10[5]);
                       saldonuevo = ope.operaciones_transferencia_persona_1_retiro(MONTO, SALDO);
                    montoo = ope.operaciones_retiro_regresar_monto();
                    System.out.println(montoo);
                    if(montoo==0){
                        
                    }
                    else{
                        //A usuario 1 se le asigna el sueldo nuevo
                     usuario10[5] = String.valueOf(saldonuevo);
                     //Operaciones del deposito
                        double valorcuenta2 = Double.parseDouble(usuario1[5] );
                         System.out.println(valorcuenta2);
                         double valorcuenta2total = valorcuenta2 + montoo;
                        System.out.println(valorcuenta2total);
                        almacenadordemovimientos += "Se hizo una transferencia a tu cuenta de $: "+montoo +" desde la cuenta 0010\n";
                        System.out.println(almacenadordemovimientos);
                        usuario1[5] = String.valueOf(valorcuenta2total);
                        vis.visualizar_transferencia(guardarnumerodetarjeta);
                        almacenadordemovimientos10+= "Hiciste una transferencia de: $"+montoo+" a la cuenta "+guardarnumerodetarjeta+"\n";
                       
                    }
                        break;
                   }
                    default:
                   {
                       vis.usuario_no_existente();
                       almacenadordemovimientos10+= "No fue posible realizar transacción\n";
                   }
                   
               }
                    }
                    }
                   
                }
           }

           
           //Movimientos
           if(movimientospresionado == true){
               vis.visualizar_movimientos(almacenadordemovimientos);
               
           }
        }
       
    }//GEN-LAST:event_realizaroperacionActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
      monto.setVisible(false);
        saldo.setVisible(false);
        tarjeta1.setVisible(false);
        realizaroperacion.setVisible(false);
        limpiar2.setVisible(false);
        r.setVisible(false);
        d.setVisible(false);
        Monto.setVisible(false);
        Tarjeta1.setVisible(false);
        Saldo.setVisible(false);
        jTextArea1.setText("");
    }//GEN-LAST:event_cancelarActionPerformed

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cajero_automatico1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Monto;
    private javax.swing.JLabel Saldo;
    private javax.swing.JLabel Tarjeta1;
    private javax.swing.JTextField apellidomaterno;
    private javax.swing.JTextField apellidopaterno;
    private javax.swing.JButton boton0;
    private javax.swing.JButton boton1;
    private javax.swing.JButton boton2;
    private javax.swing.JButton boton3;
    private javax.swing.JButton boton4;
    private javax.swing.JButton boton5;
    private javax.swing.JButton boton6;
    private javax.swing.JButton boton7;
    private javax.swing.JButton boton8;
    private javax.swing.JButton boton9;
    private javax.swing.JButton botonasterisco;
    private javax.swing.JButton botongato;
    private javax.swing.JButton cancelar;
    private javax.swing.JButton consultarsaldo;
    private javax.swing.JButton d;
    private javax.swing.JButton deposito;
    private javax.swing.JButton enter;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton limpiar;
    private javax.swing.JButton limpiar2;
    private javax.swing.JTextField monto;
    private javax.swing.JButton movimientos;
    private javax.swing.JTextField nip;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField numerotarjeta;
    private javax.swing.JButton r;
    private javax.swing.JButton realizaroperacion;
    private javax.swing.JButton retiro;
    private javax.swing.JTextField saldo;
    private javax.swing.JButton salir;
    private javax.swing.JTextField tarjeta1;
    private javax.swing.JButton transferencia;
    // End of variables declaration//GEN-END:variables
}
