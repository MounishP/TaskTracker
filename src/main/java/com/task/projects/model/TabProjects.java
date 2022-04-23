package com.task.projects.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "tab_projects")
public class TabProjects {
    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "doc")
    private LocalDate doc;
    @Column(name = "dof")
    private LocalDate dof;

    public TabProjects() {
    }

    public TabProjects(int id, String name, LocalDate doc, LocalDate dof) {
        this.id = id;
        this.name = name;
        this.doc = doc;
        this.dof = dof;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDoc() {
        return doc;
    }

    public void setDoc(LocalDate doc) {
        this.doc = doc;
    }

    public LocalDate getDof() {
        return dof;
    }

    public void setDof(LocalDate dof) {
        this.dof = dof;
    }

    @Override
    public String toString() {
        return "TabProjects{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", doc=" + doc +
                ", dof=" + dof +
                '}';
    }
}
