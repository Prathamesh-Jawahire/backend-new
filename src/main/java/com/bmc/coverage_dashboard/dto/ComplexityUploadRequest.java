package com.bmc.coverage_dashboard.dto;

import com.bmc.coverage_dashboard.dto.ComplexityResultDto;
import lombok.Data;

import java.util.List;

@Data
public class ComplexityUploadRequest {

    private Integer totalFiles;

    private List<ComplexityResultDto> results;
}