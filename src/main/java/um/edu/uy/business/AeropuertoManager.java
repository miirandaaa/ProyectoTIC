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

    public void agregarAeropuerto(Aeropuerto aeropuerto) throws InvalidUserInformation, UserAlreadyExists {

        if (aeropuerto.getUsername() == null || "".equals(usuario.getUsername()) || usuario.getPassword() == null || "".equals(usuario.getPassword())) {
            throw new InvalidUserInformation("Alguno de los datos ingresados no es correcto");

        }
        // Verifico si el cliente no existe

        if (userRepository.findOneByUsername(usuario.getUsername()) != null) {
            throw new UserAlreadyExists();
        }
        userRepository.save(usuario);
    }
}
}
