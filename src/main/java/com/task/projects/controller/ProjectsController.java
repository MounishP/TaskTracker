package com.task.projects.controller;
import com.task.projects.model.AddEmployee;
import com.task.projects.repo.ProjectsRepo;
import com.task.projects.repo.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDate;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/projects")
public class ProjectsController {

    @Autowired
    static EmpRepo empRepo;

    @Autowired
    private ProjectsRepo projectsRepo;

//    @GetMapping("/all")
//    public List<TabProjects> getAllProjects(){
//        return projectsRepo.findAll();
//    }
//
//    @GetMapping("/id")
//    public TabProjects getById(int id){
//        return projectsRepo.getById(id);
//    }
//
//    @PostMapping("/deleteid")
//    public void deleteById(int id){
//        projectsRepo.deleteById(id);
//    }
//
//    @PostMapping("/new")
//    public void newProject(){
//        projectsRepo.save(new TabProjects(3,"Mounish", LocalDate.now(),LocalDate.of(2022,05,26)));
//    }

    @PostMapping("/addEmp")
    public void addEmp(){
        empRepo.save(new AddEmployee("mounish",LocalDate.of(2021,7,1),"Hyderabad","Java developer"));
    }

}
