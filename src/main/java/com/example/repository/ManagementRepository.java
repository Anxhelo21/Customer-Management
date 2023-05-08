package com.example.repository;

import com.example.model.Management;
import org.springframework.data.repository.CrudRepository;

public interface ManagementRepository extends CrudRepository <Management , Integer> {
}
