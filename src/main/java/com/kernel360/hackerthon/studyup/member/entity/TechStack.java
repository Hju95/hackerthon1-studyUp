package com.kernel360.hackerthon.studyup.member.entity;

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

    @Column(nullable = false)
    private BigInteger studyId;

    @Column(nullable = false)
    private BigInteger memberId;

    @Column(nullable = false)
    private Short TechName;

    @Column(nullable = false)
    private Character useType;
}
