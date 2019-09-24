package com.stackroute.domain;

public class Movie {
    private Actor actor1;

    public Movie() {
    }

    public void setActor1(Actor actor1) {
        this.actor1 = actor1;
    }

    public Movie(Actor actor) {
        this.actor1 = actor;
    }
    public void displayActorDetails()
    {
        System.out.println(this.actor1.getName()+ " "+ this.actor1.getGender()+ " "+ this.actor1.getAge());
    }
}
