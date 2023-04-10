package com.chrysa.rest.webservices.restfulwebservices.todo;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;

@Entity
public class GuestsCalendar {
    @Id
    @GeneratedValue
    private long id;
    private String username;
//    @JsonProperty("name")
    private String name;
//    @JsonProperty("description")
    private String description;
//    @JsonProperty("firstDay")
    private LocalDateTime firstDay;
//    @JsonProperty("lastDay")
    private LocalDateTime  lastDay;


    protected GuestsCalendar(){}

    public GuestsCalendar(long id, String username, String name, String description, LocalDateTime firstDay, LocalDateTime lastDay){
        this.id=id;
        this.username=username;
        this.name=name;
        this.description=description;
        this.firstDay=firstDay;
        this.lastDay=lastDay;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getFirstDay() {
        return firstDay;
    }

    public void setFirstDay(LocalDateTime firstDay) {
        this.firstDay = firstDay;
    }

    public LocalDateTime getLastDay() {
        return lastDay;
    }

    public void setLastDay(LocalDateTime lastDay) {
        this.lastDay = lastDay;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GuestsCalendar that)) return false;
        return getId() == that.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
