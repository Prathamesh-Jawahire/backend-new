package com.bmc.coverage_dashboard.controller;

import com.bmc.coverage_dashboard.dto.UnifiedCoverageReportDto;
import com.bmc.coverage_dashboard.service.BuildUploadService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/builds")
@RequiredArgsConstructor
public class BuildUploadController {

    private final BuildUploadService buildUploadService;

    @PostMapping("/upload")
    public ResponseEntity<String> uploadReport(
            @RequestBody UnifiedCoverageReportDto report) {

        buildUploadService.processCoverageReport(report);

        return ResponseEntity.ok(
                "Coverage report received");
    }
}