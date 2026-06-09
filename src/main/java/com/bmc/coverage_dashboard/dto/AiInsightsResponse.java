package com.bmc.coverage_dashboard.dto;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AiInsightsResponse {

    private String executiveSummary;

    private String coverageRiskInsight;

    private String codeQualityInsight;

    private String securityInsight;

    private List<String> recommendations;
}