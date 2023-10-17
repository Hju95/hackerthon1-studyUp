package com.kernel360.hackerthon.studyup.study.repository;

import com.kernel360.hackerthon.studyup.study.entity.StudyReview;
import com.kernel360.hackerthon.studyup.study.entity.StudySchedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

@Repository
public interface StudyReviewRepository extends JpaRepository<StudyReview, BigInteger> {
    public List<StudyReview> findAll();

    public Optional<StudyReview> findById(BigInteger id);

    public StudyReview save(StudyReview studyReview);

    public void delete(StudyReview studyReview);
}
