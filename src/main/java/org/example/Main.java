package org.example;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emp = Persistence.createEntityManagerFactory("hello");
    }
}