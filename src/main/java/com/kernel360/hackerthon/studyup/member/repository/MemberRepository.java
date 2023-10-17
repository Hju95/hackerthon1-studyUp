package com.kernel360.hackerthon.studyup.member.repository;

import com.kernel360.hackerthon.studyup.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.Optional;

@Repository
public interface MemberRepository extends JpaRepository<Member, BigInteger> {
    Optional<Member> findById(BigInteger id);

    Member save(Member member);
}