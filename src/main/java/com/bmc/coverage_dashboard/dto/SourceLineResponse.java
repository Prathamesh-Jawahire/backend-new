package com.bmc.coverage_dashboard.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SourceLineResponse {

    private Integer line;

    private String code;
}