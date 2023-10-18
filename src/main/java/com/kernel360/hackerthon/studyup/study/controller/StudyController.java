package com.kernel360.hackerthon.studyup.study.controller;

import com.kernel360.hackerthon.studyup.study.entity.Study;
import com.kernel360.hackerthon.studyup.study.service.StudyService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class StudyController {

    private final StudyService studyService;

    @GetMapping("studys")
    public List<Study> getAllStudies() {
        return studyService.getAllStudies();
    }

}
