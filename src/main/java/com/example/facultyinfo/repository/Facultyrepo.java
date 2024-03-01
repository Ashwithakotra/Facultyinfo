package com.example.facultyinfo.repository;

import com.example.facultyinfo.model.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Facultyrepo extends JpaRepository<Faculty,Integer> {
}