package project.stefan.app.psapp.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.stefan.app.psapp.domain.Project;
import project.stefan.app.psapp.exceptions.ProjectIdException;
import project.stefan.app.psapp.repositories.ProjectRepository;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    public Project saveOrUpdateProject(Project project){
        try {
            project.setProjectIdentifier(project.getProjectIdentifier().toUpperCase());
            return projectRepository.save(project);
        }catch (Exception e){
            throw new ProjectIdException("Project ID "+project.getProjectIdentifier().toUpperCase()+" already exists");
        }

    }
}
