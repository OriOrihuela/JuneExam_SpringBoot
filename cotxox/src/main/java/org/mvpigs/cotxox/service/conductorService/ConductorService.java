package org.mvpigs.cotxox.service.conductorService;

import org.mvpigs.cotxox.domain.Conductor;
import org.mvpigs.cotxox.repo.ConductorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
