package com.kernel360.hackerthon.studyup.study.controller;

import com.kernel360.hackerthon.studyup.study.dto.StudyDTO;
import com.kernel360.hackerthon.studyup.study.dto.StudyGroupDetailDTO;
import com.kernel360.hackerthon.studyup.study.entity.Study;
import com.kernel360.hackerthon.studyup.study.service.StudyService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.util.List;

@RestController // redirect 나오면 Controller로 수정
@RequiredArgsConstructor
@RequestMapping("/study")
public class StudyController {

    private final StudyService studyService;

    /**
     * (*)스터디 그룹 리스트 조회
     * @return
     */
    @GetMapping("/list")
    public List<Study> getAllStudies() {
        List<Study> studyList = studyService.getAllStudies();
        return studyList;
    }

    /**
     * (*)스터디 그룹 상세 조회
     */
    @GetMapping("/{study-id}")
    public StudyGroupDetailDTO getStudy(@PathVariable("study-id") Long studyId) {
        StudyGroupDetailDTO studyGroupDetailDTO = studyService.getStudyById(BigInteger.valueOf(studyId));
        return studyGroupDetailDTO;
    }

//    /**
//     * (*)스터디 그룹 개설
//     */
//    @PostMapping
//    public StudyDTO createStudy(@RequestBody StudyDTO studyDTO) {
//        StudyDTO createdStudy = studyService.createStudy(studyDTO);
//        return createdStudy;
//    }
//
//    /**
//     * (*)스터디 그룹 수정
//     */
//    public StudyDTO updateStudy(@PathVariable Long studyId, @RequestBody StudyDTO studyDTO) {
//        int result = studyService.updateStudy(studyId, studyDTO);
//
//        // 스터디 그룹 수정 완료
//        if (result == 1) {
//        } else {
//
//        }
//    }

//    /**
//     * (*)스터디 그룹 삭제
//     */
//    @DeleteMapping("/{study-id}")
//
//    /**
//     * 스터디 그룹 멤버 조회
//     */
//    @GetMapping("/members")
//
//    /**
//     * (*)스터디 검색
//     */
//    @GetMapping("/search")
//
//    /**
//     * 스터디 일정 리스트
//     */
//    @GetMapping("/schedules")
//
//    /**
//     * 스터디 일정 상세조회
//     */
//    @GetMapping("/schedule")
//
//
//    /**
//     * 스터디 일정 등록
//     */
//    @PostMapping("/schedule")
//
//    /**
//     * 스터디 일정 수정
//     */
//    @PatchMapping("/schedule")
//
//    /**
//     * 스터디 일정 삭제
//     */
//    @DeleteMapping("/schedule")
//
//    /**
//     * (선택)찜하기(찜 생성)
//     */
//
//    /**
//     * (선택)찜한 스터디 조회
//     */
//
//    /**
//     * (선택)찜 수정
//     */

}
