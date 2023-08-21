package org.Brikas.Hotel;

public class Guest {
    private String name;
    private String surname;

    public Guest() {
    }

    public Guest(String name, String surname){
        this.name = name;
        this.surname = surname;
    }



    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString(){
        return name + " " + surname;
    }

}
