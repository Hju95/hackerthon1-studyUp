package com.kernel360.hackerthon.studyup.study.repository;

import com.kernel360.hackerthon.studyup.study.entity.Study;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

@Repository
public interface StudyRepository extends JpaRepository<Study, BigInteger> {
    public List<Study> findAll();

    public Optional<Study> findById(BigInteger id);

    public Study save(Study study);

    public void delete(Study study);
}
