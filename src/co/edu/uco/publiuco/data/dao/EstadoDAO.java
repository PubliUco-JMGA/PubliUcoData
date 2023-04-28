package co.edu.uco.publiuco.data.dao;

import co.edu.uco.publiuco.entities.EstadoEntity;

import java.util.List;

public interface EstadoDAO {
    void create(EstadoEntity entity);
    List<EstadoEntity> read(EstadoEntity entity);
    void update(EstadoEntity entity);
    void delete(EstadoEntity entity);
}
