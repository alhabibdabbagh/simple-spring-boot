package com.project.simple.first.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CustomerDTOModel {
    private UUID id;
    private String name;
    private OffsetDateTime createdDate;
    private OffsetDateTime lastUpdateDate;


}
