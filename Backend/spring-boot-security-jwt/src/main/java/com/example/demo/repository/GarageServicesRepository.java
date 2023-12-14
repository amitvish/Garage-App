package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.GarageServices;

@Repository
public interface GarageServicesRepository extends JpaRepository<GarageServices, Integer> {
    GarageServices findServicesById(int id);
}
