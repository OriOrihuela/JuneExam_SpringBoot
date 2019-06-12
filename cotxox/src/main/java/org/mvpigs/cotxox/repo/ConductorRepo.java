package org.mvpigs.cotxox.repo;

import org.mvpigs.cotxox.domain.Conductor;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ConductorRepo extends CrudRepository<Conductor, String> {

    /* ---- MAIN BEHAVIOURS ---- */
    List<Conductor> findByOcupado(int ocupado);
}