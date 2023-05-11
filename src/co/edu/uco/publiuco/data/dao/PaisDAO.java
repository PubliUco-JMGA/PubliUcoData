package co.edu.uco.publiuco.data.dao;

import java.util.List;
import java.util.UUID;

import co.edu.uco.publiuco.entities.PaisEntity;

public interface PaisDAO {

	List<PaisEntity> read(PaisEntity entity);

}