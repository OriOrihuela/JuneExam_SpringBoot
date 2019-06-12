package org.mvpigs.cotxox.service.conductorService;

import org.mvpigs.cotxox.domain.Conductor;
import org.mvpigs.cotxox.repo.ConductorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConductorService {

    @Autowired
    private ConductorRepo conductorRepo = null;

    /* ---- MAIN BEHAVIOURS ---- */
    public Conductor recuperarConductor(String tarjetaConductor) {
        return conductorRepo.findOne(tarjetaConductor);
    }

    public void crearConductor(String tarjeta, String name, String matricula, String modelo) {
        Conductor conductor = new Conductor(tarjeta, name, matricula, modelo);
        conductorRepo.save(conductor);
    }

    public void init() {
        Conductor conductor = new Conductor("2222222222222222", "Sabrina", "5DHJ444", "Toyota Prius");
        Conductor conductor1 = new Conductor("3333333333333333", "Cici", "7JKK555", "Mercedes A");
        conductorRepo.save(conductor);
        conductorRepo.save(conductor1);
    }

    public Conductor recuperarConductorLibre() {
        List<Conductor> conductores = conductorRepo.findByOcupado(0);
        for (Conductor conductor :
                conductores) {
            if (conductor.isOcupado()) {
                System.out.println("The condcutor cannot be returned, he/she is busy");
            }
            else {
                return conductor;
            }
        }
        return null;
    }
}
