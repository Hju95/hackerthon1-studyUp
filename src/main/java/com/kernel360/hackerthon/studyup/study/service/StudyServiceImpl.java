package com.kernel360.hackerthon.studyup.study.service;

import com.kernel360.hackerthon.studyup.member.entity.Bookmark;
import com.kernel360.hackerthon.studyup.study.entity.Study;
import com.kernel360.hackerthon.studyup.study.entity.StudyMember;
import com.kernel360.hackerthon.studyup.study.entity.StudySchedule;
import com.kernel360.hackerthon.studyup.study.repository.StudyMemberRepository;
import com.kernel360.hackerthon.studyup.study.repository.StudyRepository;
import com.kernel360.hackerthon.studyup.study.repository.StudyReviewRepository;
import com.kernel360.hackerthon.studyup.study.repository.StudyScheduleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@RequiredArgsConstructor
@Service
public class StudyServiceImpl implements StudyService {
    private final StudyRepository studyRepository;
    private final StudyMemberRepository studyMemberRepository;
    private final StudyReviewRepository studyReviewRepository;
    private final StudyScheduleRepository studyScheduleRepository;

    @Override
    public List<Study> getAllStudies() {
        return studyRepository.findAll();
    }

    @Override
    public int createStudy(Study study) {
        return 0;
    }

    @Override
    public int updateStudy(Study study) {
        return 0;
    }

    @Override
    public int deleteStudy(Long id) {
        return 0;
    }

    @Override
    public List<StudyMember> getAllStudyMembers() {
        return null;
    }

    @Override
    public List<StudySchedule> getAllStudySchedules() {
        return null;
    }

    @Override
    public StudySchedule getStudySchedule(int scheduleId) {
        return null;
    }

    @Override
    public Study getStudyByStudyId(int studyTitle) {
        return null;
    }

    @Override
    public int createStudySchedule(StudySchedule studySchedule) {
        return 0;
    }

    @Override
    public int updateStudySchedule(StudySchedule studySchedule) {
        return 0;
    }

    @Override
    public int deleteStudyScheduleByStudyDate(int studyId, Date date) {
        return 0;
    }

    @Override
    public int createBookmark(Bookmark bookmark) {
        return 0;
    }

    @Override
    public List<Study> getStudyByBookmarkId(int bookmarkId) {
        return null;
    }

    @Override
    public int updateBookmarkByBookmarkId(int bookmarkId) {
        return 0;
    }
}
