package com.kernel360.hackerthon.studyup.study.repository;

import com.kernel360.hackerthon.studyup.study.entity.StudyMember;
import com.kernel360.hackerthon.studyup.study.entity.StudyReview;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

@Repository
public interface StudyMemberRepository extends JpaRepository<StudyMember, BigInteger> {
    public List<StudyMember> findAll();

    public Optional<StudyMember> findById(BigInteger id);

    public StudyMember save(StudyMember studyMember);

    public void delete(StudyMember studyMember);
}
