package com.cable.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cable.rest.entity.Street;



public interface StreetJPARepo extends JpaRepository< Street, Long>{

}