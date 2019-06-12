package org.mvpigs.cotxox.service.conductorService;

import org.mvpigs.cotxox.domain.Conductor;
import org.mvpigs.cotxox.repo.ConductorRepo;
import org.springframework.beans.factory.annotation.Autowired;

public class ConductorService {

    @Autowired
    private ConductorRepo conductorRepo = null;

    /* ---- MAIN BEHAVIOURS ---- */
    public Conductor recuperarConductor(String tarjetaConductor) {
        return conductorRepo.findOne(tarjetaConductor);
    }
}
