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
public class EmpleadoPorHoras extends Empleado{
    private double sueldo;
    private double horas;
    
    
    //Constructor
    public EmpleadoPorHoras(String nombre, String apellido, String nss,
            double sueldoPorHoras, double horasTrabajadas)
    {
        super (nombre, apellido,nss);
        setSueldo(sueldoPorHoras);
        setHoras(horasTrabajadas);
    }
    public void setSueldo(double sueldoPorHoras){
        if (sueldoPorHoras >= 0.0)
            sueldo= sueldoPorHoras;
        else
            throw new IllegalArgumentException("El sueldo por horas debe ser >=0.0"); 
    }
    
    //devuelve el sueldo
    public double getSueldo()
    {
        return sueldo;
    }
    public void setHoras(double horasTrabajadas){
        if((horasTrabajadas>=0.0)&& (horasTrabajadas<= 168.0))
            horas=horasTrabajadas;
        else
            throw new IllegalArgumentException("Las horas trabajadas debe ser >=0.0 y <= 168.0"); 
    }
    public double getHoras(){
        return horas;
    }
    
    //Calcula ingresos
    
    @Override
    public double ingresos()
    {
        if( getHoras()<= 40)//no hay tiempo extra
            return getSueldo() * getHoras();
       else
            return 40 * getSueldo() + (getHoras() - 40) * getSueldo()*1.5;
    }//Fin metodos ingresos
    
    @Override
    public String toString()
    {
        return String.format("Empleado por horas: %s\n%s: $%,.2f; %s: %,.2f",
                super.toString(), "sueldo por hora", getSueldo(),"Horas trbajadas",getHoras() );
        
    }
}
