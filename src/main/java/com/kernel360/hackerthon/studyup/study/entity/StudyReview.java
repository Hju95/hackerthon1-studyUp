package com.kernel360.hackerthon.studyup.study.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StudyReview {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigInteger studyReviewId;

    @Column(nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "study_member_id")
    private StudyMember studyMember;

    @Column(nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "study_id")
    private Study study;

    @Column(nullable = false)
    private String reviewComments;

    @Column(nullable = false)
    private short studyRating;

    @Column(nullable = false)
    @CreationTimestamp
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime modifiedAt;

    private LocalDateTime deletedAt;
}
