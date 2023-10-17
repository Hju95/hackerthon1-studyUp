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
public class PeerReview {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigInteger peerReviewId;

    @Column(nullable = false)
    private BigInteger memberId;

    @Column(nullable = false)
    private BigInteger peerId;

    @Column(nullable = false)
    private String peerReviewComment;

    @Column(nullable = false)
    private Short peerReviewScore;

    @CreationTimestamp
    private Timestamp createdAt;

    private Timestamp updatedAt;

    private Timestamp deletedAt;
}
