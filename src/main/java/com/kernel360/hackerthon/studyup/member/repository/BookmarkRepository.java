package com.kernel360.hackerthon.studyup.member.repository;

import com.kernel360.hackerthon.studyup.member.entity.Bookmark;
import com.kernel360.hackerthon.studyup.study.entity.StudyMember;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

@Repository
public interface BookmarkRepository extends JpaRepository<Bookmark, BigInteger> {
    public List<Bookmark> findAll();

    public Optional<Bookmark> findById(BigInteger id);

    public Bookmark save(Bookmark bookmark);

    public void delete(Bookmark bookmark);
}
