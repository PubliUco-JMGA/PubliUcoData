package co.edu.uco.publiuco.data.dao;

import co.edu.uco.publiuco.entities.EstadoEntity;
import co.edu.uco.publiuco.entities.TipoRelacionInstitucionEntity;

import java.util.List;

public interface TipoRelacionInstitucionDAO {
    void create(TipoRelacionInstitucionEntity entity);
    List<TipoRelacionInstitucionEntity> read(TipoRelacionInstitucionEntity entity);
    void update(TipoRelacionInstitucionEntity entity);
    void delete(TipoRelacionInstitucionEntity entity);
}
