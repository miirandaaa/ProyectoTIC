package um.edu.uy.business.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "aeropuerto")
public class Aeropuerto {

    public String nombreAeropuerto;
    public String ciudadAeropuerto;
    public String paisAeropuerto;
    public String codigoIATA;

    public Long numeroGates;

    public Long numeroCheckin;



    // nro puertas, nro pistas

    public Aeropuerto(String nombre, String ciudad, String pais, String codigoIATA, Long numeroCheckin, Long numeroGates) {
        this.nombreAeropuerto = nombre;
        this.ciudadAeropuerto = ciudad;
        this.paisAeropuerto = pais;
        this.codigoIATA = codigoIATA;
        this.numeroCheckin = numeroCheckin;
        this.numeroGates = numeroGates;
    }

    public Aeropuerto() {}
}
