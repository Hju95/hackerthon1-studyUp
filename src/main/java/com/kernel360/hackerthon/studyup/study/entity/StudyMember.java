package com.kernel360.hackerthon.studyup.study.entity;

import com.kernel360.hackerthon.studyup.member.entity.Member;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.Date;

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
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "study_id")
    private Study study;

    @Column(nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

    @Column(nullable = false)
    private Character memberType;

    @Column(nullable = false)
    private LocalDateTime studyJoinDate;

    @Temporal(TemporalType.TIMESTAMP)
    private Date studyWithdrawalDate;
}
