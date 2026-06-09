package com.bmc.coverage_dashboard.dto;

import lombok.Data;
import java.util.List;

@Data
public class ProjectDto {

    private String name;

    private String repository;

    private String branch;

    private List<String> languages;
}