package org.mvpigs.cotxox.repo;

import org.mvpigs.cotxox.domain.Conductor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ConductorRepo extends CrudRepository<Conductor, String> {

    /* ---- MAIN BEHAVIOURS ---- */
    @Query("select c from Conductor c where c.ocupado = ?1")
    List<Conductor> findByOcupado(int ocupado);

    @Query("select c from Conductor c where c.ocupado = ?1")
    Conductor findByOcupado1(int ocupado);
}
