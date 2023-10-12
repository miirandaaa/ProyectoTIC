package um.edu.uy.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import um.edu.uy.business.entities.Aeropuerto;
import um.edu.uy.business.entities.Usuarios;
import um.edu.uy.business.exceptions.InvalidUserInformation;
import um.edu.uy.business.exceptions.UserAlreadyExists;
import um.edu.uy.persistence.AeropuertoRepository;

@Service
public class AeropuertoManager {

    @Autowired
    private AeropuertoRepository aeropuertoRepository;


}
