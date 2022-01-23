package cybersoft.javabackend.girajava14jr.role.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cybersoft.javabackend.girajava14jr.role.model.GroupRole;

@Repository
public interface GroupRepository extends JpaRepository<GroupRole, Long> {

	Optional<GroupRole> findByName(String groupName);

	Optional<GroupRole> findByCode(String groupCode);

}
