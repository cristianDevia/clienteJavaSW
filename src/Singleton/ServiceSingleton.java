/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

/**
 *
 * @author Estudiantes
 */
public class ServiceSingleton 
{

    private static model.ServicioUniversidadSW_Service service; 
    private static  model.ServicioUniversidadSW port;
    private ServiceSingleton()
    {               
        service =  new model.ServicioUniversidadSW_Service();
        port =  service.getServicioUniversidadSWPort();
    }
    
 
    
    public static  model.ServicioUniversidadSW getPort()
    {
        if(port==null)
        {
            service =  new model.ServicioUniversidadSW_Service();
            port =  service.getServicioUniversidadSWPort();
            return port;
        }
        else
        {
            return port;
        }
    }
    
}
