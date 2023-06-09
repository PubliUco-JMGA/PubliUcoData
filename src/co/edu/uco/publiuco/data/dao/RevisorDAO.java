package co.edu.uco.publiuco.data.dao;

import java.util.List;
import java.util.UUID;

import co.edu.uco.publiuco.entities.RevisorEntity;

public interface RevisorDAO {
	
	void create(RevisorEntity entity);

	List<RevisorEntity> read(RevisorEntity entity);

	void update(RevisorEntity entity);

	void delete(UUID entity);

}