package com.pluralsight.fundamentals.entity;

import javax.persistence.*;

@Entity
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;
    private String description;


    @ManyToOne
    @JoinColumn(name = "application_id")
    private Application application;


    @ManyToOne
    @JoinTable(name = "ticket_release", joinColumns = @JoinColumn(name="ticket_fk"), inverseJoinColumns = @JoinColumn(name="release_fk"))
    private Release release;

    public Release getRelease() {
        return release;
    }
}
