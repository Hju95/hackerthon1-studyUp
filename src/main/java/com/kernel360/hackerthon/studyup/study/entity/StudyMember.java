package com.kernel360.hackerthon.studyup.study.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigInteger;
import java.time.LocalDateTime;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StudyMember {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigInteger studyMemberId;

    @Column(nullable = false)
    private BigInteger studyId;

    @Column(nullable = false)
    private BigInteger memberId;

    @Column(nullable = false)
    private Character memberType;

    @Column(nullable = false)
    private LocalDateTime studyJoinDate;

    private LocalDateTime studyWithdrawalDate;
}
