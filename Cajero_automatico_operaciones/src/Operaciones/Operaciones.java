
package Operaciones;
import Visualizaciones.Visualizaciones;


public class Operaciones {
    Visualizaciones vis = new Visualizaciones();

    double saldonuevo;
    double monto;
    
    public double operaciones_retiro (double MONTO, double SALDO){

       monto = MONTO;
        
        if(monto>5000 || monto > SALDO){
            
            saldonuevo = SALDO;
            monto = 0;
            vis.visualizar_mensajederetiro();
            vis.visualizar_retiro(SALDO, monto, saldonuevo);
            return saldonuevo;
        }
        else{
            saldonuevo = SALDO - monto;
            vis.visualizar_retiro(SALDO, monto, saldonuevo);
            return saldonuevo;
        }
        
        
    }
    
    public double operaciones_deposito(double MONTO, double SALDO){
        
        saldonuevo = SALDO + MONTO;
        vis.visualizar_deposito(SALDO, MONTO, saldonuevo);
        return saldonuevo;
    }
    public double operaciones_transferencia_persona_1_retiro(double MONTO,double SALDO){
        monto = MONTO;
        
        if(monto>5000 || monto > SALDO){
            
            saldonuevo = SALDO;
            monto = 0;
            vis.visualizar_mensajederetiro();
            //vis.visualizar_retiro(SALDO, monto, saldonuevo);
            return saldonuevo;
        }
        else{
            saldonuevo = SALDO - monto;
            vis.visualizar_retiro(SALDO, monto, saldonuevo);
            return saldonuevo;
        }
    }
    public double operaciones_transferencia_persona_2_deposito(double MONTO,double SALDO){
        saldonuevo = SALDO + MONTO;
        vis.visualizar_deposito(SALDO, MONTO, saldonuevo);
        return saldonuevo;
    }
    
    public double operaciones_retiro_regresar_monto(){
            
            return monto;
        }
    
    
}
