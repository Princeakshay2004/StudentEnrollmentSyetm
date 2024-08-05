package com.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.Subject;
@Repository
public interface SubjectRepository extends JpaRepository<Subject, Long> {

}
