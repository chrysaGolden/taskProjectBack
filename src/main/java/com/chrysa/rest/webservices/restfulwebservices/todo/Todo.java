package com.chrysa.rest.webservices.restfulwebservices.todo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.Date;
import java.util.Objects;
@Entity
public class Todo {
    @Id
    @GeneratedValue
    private Long id;

    private String username;
    private String description;
    private Date targetDate;
    private String isDone;
    private String willDo;

    private String status;

    protected Todo(){

    }
    public Todo(Long id, String username, String description, Date targetDate, String isDone, String willDo) {
        this.id = id;
        this.username = username;
        this.description = description;
        this.targetDate = targetDate;
        this.isDone = isDone;
        this.willDo = willDo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getTargetDate() {
        return targetDate;
    }

    public void setTargetDate(Date targetDate) {
        this.targetDate = targetDate;
    }

    public String isDone() {
        return isDone;
    }

    public void setDone(String done) {
        isDone = done;
    }

    public String getWillDo() {
        return willDo;
    }

    public void setWillDo(String willBeDone) {
        willDo = willBeDone;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String theStatus) {
        status = theStatus;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Todo todo)) return false;
        return getId() == todo.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
