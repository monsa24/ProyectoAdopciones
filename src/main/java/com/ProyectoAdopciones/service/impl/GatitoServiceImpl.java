package com.ProyectoAdopciones.service.impl;

import com.ProyectoAdopciones.dao.GatitoDao;
import com.ProyectoAdopciones.domain.Gatito;
import com.ProyectoAdopciones.service.GatitoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service  //pertenece a la capa de SERVICIOS
//implement porque implementamos una interface Service
public class GatitoServiceImpl implements GatitoService {

    //vamos a utilizar el GatitoDao porque tiene toda la info del primary key y BD
    @Autowired
    private GatitoDao gatitoDao;

    @Override
    @Transactional(readOnly = true)
    public List<Gatito> getGatitos(boolean activos) {
        var lista = gatitoDao.findAll();
        if (activos) {
            lista.removeIf(e -> !e.isAdopcion());
        }
        return lista;
    }

    @Override
    @Transactional(readOnly = true)
    public Gatito getGatito(Gatito gatito) {
        return gatitoDao.findById(gatito.getIdNumero()).orElse(null);

    }

    @Override
    @Transactional
    //guarda y actualiza: SAVE
    public void save(Gatito gatito) {
        gatitoDao.save(gatito);
    }

    @Override
    @Transactional
    public void delete(Gatito gatito) {
        gatitoDao.delete(gatito);
    }

}
