package co.edu.uco.publiuco.data.dao;

import java.util.List;
import java.util.UUID;

import co.edu.uco.publiuco.entities.TipoRelacionInstitucionEntity;

public interface TipoRelacionInstitucionDAO {

	List<TipoRelacionInstitucionEntity> read(TipoRelacionInstitucionEntity entity);

}
