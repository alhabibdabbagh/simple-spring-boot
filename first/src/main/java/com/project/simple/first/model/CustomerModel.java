package com.project.simple.first.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CustomerModel {
    private UUID id;
    private String name;
    private Timestamp createdDate; // sql library
    private Timestamp lastUpdateDate;

}
