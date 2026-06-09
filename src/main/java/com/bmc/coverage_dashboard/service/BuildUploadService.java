package com.bmc.coverage_dashboard.service;

import com.bmc.coverage_dashboard.dto.UnifiedCoverageReportDto;

public interface BuildUploadService {

    void processCoverageReport(
            UnifiedCoverageReportDto report);

}