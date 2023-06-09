package co.edu.uco.publiuco.data.dao;

import java.util.List;
import java.util.UUID;

import co.edu.uco.publiuco.entities.PerfilEntity;

public interface PerfilDAO {
	
	void create(PerfilEntity entity);

	List<PerfilEntity> read(PerfilEntity entity);

	void update(PerfilEntity entity);

	void delete(UUID entity);

}