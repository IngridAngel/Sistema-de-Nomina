/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author jany-yin
 */
public class EmpleadoPorComision extends Empleado{
    
    private double ventasBrutas;
    private double tarifaComision;
    
    //Constructor
    public EmpleadoPorComision (String nombre, String apellido, String nss, double ventas, double tarifa){
        super(nombre,apellido,nss);
        setVentasBrutas( ventas );
        setTarifaComision( tarifa );
    }  
        //Estable la tarifa por comision
    public void setTarifaComision(double tarifa)
   {
        if ( tarifa > 0.0 && tarifa < 1.0)
           tarifaComision=tarifa;
        else 
           throw new IllegalArgumentException("La tarifa de comision debe ser > 0.0 y < 1.0");
                
    }
        //Devuelve la tqarifa de comision
   public double getTarifaComision()
    {
      return tarifaComision;
    }
   
   //Estabnlee el monto de ventas brutas
   public void setVentasBrutas( double ventas )
   {
       if ( ventas >= 0.0)
           ventasBrutas=ventas;
       else
         throw new IllegalArgumentException("Las ventas britas deben ser >= 0.0");  
   }
   
   //Devuelve el monto de ventas brutas
   public double getVentasBrutas()
   {
    return ventasBrutas;   
   }
    
   //Calcula los ingresos
   
    @Override
   public double ingresos()
   {
       return getTarifaComision() * getVentasBrutas();
   }
   
   public String toString()
   {
       return String.format("%s: %s\n%s: $%,.2f; %s: %.2f",
               "empleado por comision", super.toString(),
               "Ventas brutas", getVentasBrutas(),
               "tarifa de comision", getTarifaComision()  );
   }
    
}
