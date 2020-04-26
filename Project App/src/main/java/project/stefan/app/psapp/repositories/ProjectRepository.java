package project.stefan.app.psapp.repositories;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import project.stefan.app.psapp.domain.Project;

@Repository
public interface ProjectRepository extends CrudRepository<Project,Long> {

}
