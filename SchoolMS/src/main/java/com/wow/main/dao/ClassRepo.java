package com.wow.main.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wow.main.model.Class_Division;
import com.wow.main.model.Classes;

public interface ClassRepo extends JpaRepository<Classes, Class_Division> {

}
