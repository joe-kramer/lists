package com.jwkramer.lists.models;

import lombok.Data;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.sql.Date;
import java.util.Calendar;

/**
 * Created by joekramer on Nov, 2017
 */

@Entity
@Table(name = "notes")
public class Note implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    @Column(name = "title")
    private String title;

    @NotNull
    @Column(name = "description")
    private String description;

    @Column(name = "createdDate", nullable = false)
    private Date createdDate;

    @Column(name = "modifiedDate")
    private Date modifiedDate;

    @Column(name = "reminderDate")
    private Date reminderDate;

    public Note(String title, String description) {
        this.title = title;
        this.description = description;
        this.createdDate = new Date(Calendar.getInstance().getTimeInMillis());
        this.modifiedDate = new Date(Calendar.getInstance().getTimeInMillis());
        this.reminderDate = new Date(Calendar.getInstance().getTimeInMillis());
    }

    public Note() {}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public Date getReminderDate() {
        return reminderDate;
    }

    public void setReminderDate(Date reminderDate) {
        this.reminderDate = reminderDate;
    }
}

