package com.example.jpa.demojpa.repository;

import com.example.jpa.demojpa.model.Publication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPublicationRepository extends JpaRepository<Publication,Integer> {

}
