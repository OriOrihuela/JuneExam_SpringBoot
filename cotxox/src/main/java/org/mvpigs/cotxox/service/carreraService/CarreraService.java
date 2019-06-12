package org.mvpigs.cotxox.service.carreraService;

import org.mvpigs.cotxox.domain.Carrera;
import org.mvpigs.cotxox.repo.CarreraRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarreraService {

    @Autowired
    private CarreraRepo carreraRepo = null;


    public Long crearCarrera(String tarjeta, String origen, String destino, int distancia, int coste) {
        Carrera carrera = new Carrera(tarjeta, origen, destino, distancia, coste);
        carreraRepo.save(carrera);
        return carrera.getId();
    }

    public Carrera recuperaCarrera(Long idCarrera) {
        return carreraRepo.findOne(idCarrera);
    }
}
