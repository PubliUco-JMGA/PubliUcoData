package co.edu.uco.publiuco.data.dao;

import java.util.List;
import java.util.UUID;

import co.edu.uco.publiuco.entities.TipoAccesoEntity;

public interface TipoAccesoDAO {

	List<TipoAccesoEntity> read(TipoAccesoEntity entity);


}