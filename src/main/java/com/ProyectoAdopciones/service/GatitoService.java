package com.ProyectoAdopciones.service;

import com.ProyectoAdopciones.domain.Gatito;
import java.util.List;

public interface GatitoService {
    
    //se obtiene un listado de categorias en un List
    public List <Gatito> getGatitos(boolean activos);
    
    //Se obtiene una categoria por medio de su ID
    public Gatito getGatito(Gatito gatito);
    
    //metodo de guardar
    public void save(Gatito gatito);
    
    //Metodo de eliminar
    public void delete(Gatito gatito);
}