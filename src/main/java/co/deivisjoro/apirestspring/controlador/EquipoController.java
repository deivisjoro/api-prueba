package co.deivisjoro.apirestspring.controlador;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.deivisjoro.apirestspring.bd.Conexion;
import co.deivisjoro.apirestspring.modelo.dao.EquipoDAO;
import co.deivisjoro.apirestspring.modelo.entidad.Equipo;

@RestController
@RequestMapping(path="/equipos")
public class EquipoController {
	
	Conexion conexion = new Conexion();    
    EquipoDAO servicio = new EquipoDAO(conexion);
	
    @RequestMapping(value="/list", method = RequestMethod.GET)    
    public ArrayList<Equipo> getEquipos(){        
        ArrayList<Equipo> equipos = servicio.getEquipos();                
        return equipos;
    }
	
}
