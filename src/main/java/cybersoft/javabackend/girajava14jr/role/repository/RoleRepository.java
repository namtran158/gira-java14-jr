package cybersoft.javabackend.girajava14jr.role.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import cybersoft.javabackend.girajava14jr.role.dto.RoleDTO;
import cybersoft.javabackend.girajava14jr.role.model.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
	
	@Query("SELECT r.id as id, r.name as name, r.description as description FROM Role r")
	List<RoleDTO> findAllDTO();
}
