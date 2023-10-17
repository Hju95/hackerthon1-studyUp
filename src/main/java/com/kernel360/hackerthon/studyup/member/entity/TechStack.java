package com.kernel360.hackerthon.studyup.member.entity;

import com.kernel360.hackerthon.studyup.study.entity.Study;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Timestamp;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TechStack {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigInteger stackId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "study_id")
    private Study study;

    @Column(nullable = false)
    private Short TechName;

    @Column(nullable = false)
    private Character useType;
}
