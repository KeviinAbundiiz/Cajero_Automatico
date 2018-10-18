package Visualizaciones;

import javax.swing.JOptionPane;


public class Visualizaciones {
    public void visualizar_retiro (double saldo, double monto, double saldonuevo){
        JOptionPane.showMessageDialog(null, "Saldo anterior: "+ saldo + "\n"+ 
                                            "Monto retirado: "+monto+ "\n"+
                                            "Saldo nuevo: "+saldonuevo,"RETIRO", 1);
    }
    public void visualizar_deposito(double saldo, double monto, double saldonuevo){
        JOptionPane.showMessageDialog(null, "Saldo anterior: "+ saldo + "\n"+ 
                                            "Monto depositado: "+monto+ "\n"+
                                            "Saldo nuevo: "+saldonuevo,"DEPÓSITO EXITOSO!!", 1);
    }
    public void visualizar_transferencia(String numerodecuenta2){
        JOptionPane.showMessageDialog(null, "TRANSACCIÓN EXITOSA A LA CUENTA: "+numerodecuenta2 ,"TRANSACCIÓN", 1);
    }
    
    public void visualizar_movimientos(String almacenadordemovimientos){
        
        JOptionPane.showMessageDialog(null, "MOVIMIENTOS REALIZADOS: \n"+almacenadordemovimientos ,"MOVIMIENTOS REALIZADOS", 1);
    }
    public void visualizar_mensajedeerror(){
         JOptionPane.showMessageDialog(null, "HAY CAMPOS VACIOS" ,"ERROR", 1);
    }
    public void visualizar_mensajederetiro(){
         JOptionPane.showMessageDialog(null, "NO SE PUEDE REALIZAR LA OPERACION: \n"
                 + "EL MONTO EXCEDIO SU SALDO O EL MONTO ES MAYOR A 5000" ,"ERROR", 1);
    }
    public void usuario_no_existente(){
         JOptionPane.showMessageDialog(null, "USUARIO NO EXISTENTE" ,"ERROR", 1);
    }
    
    public void mensaje_mismousuario(){
        JOptionPane.showMessageDialog(null, "NO SE PUEDE REALIZAR LA TRANSFERENCIA A TU MISMA CUENTA" ,"ERROR", 1);
    }
    public void mensaje_introduce_monto(){
         JOptionPane.showMessageDialog(null, "POR FAVOR INTRODUCE MONTO" ,"ERROR", 1);
    }
    public void mensaje_introduce_numerotarjeta(){
         JOptionPane.showMessageDialog(null, "POR FAVOR INTRODUCE EL NUMERO DE TARJETA" ,"ERROR", 1);
    }
    
    
}
