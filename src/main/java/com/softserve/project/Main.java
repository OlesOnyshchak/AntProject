package com.softserve.project;

import com.softserve.project.config.EntityManagerConfiguration;


import javax.persistence.EntityManager;
import javax.persistence.Query;


public class Main {
    public static void main(String[] args) {
        EntityManagerConfiguration entityManagerConfiguration = new EntityManagerConfiguration();
        EntityManager entityManager = entityManagerConfiguration.getEntityManager();
        Query query = entityManager.createNativeQuery("SELECT status FROM Invoice");
        System.out.println(query.getResultList());
    }
}
