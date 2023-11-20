package com.systex.quiz.ch01.util;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Todo Case
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Person) {
            Person person = (Person) obj;
            return this.name.equals(person.name);
        }else {
            return true;
        }
    }


    // String hashCode() : Returns a hash code value for the object.
    // This method is supported for the benefit of hash tables such as those provided by HashMap.
    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public String toString() {
        return name;
    }
}
