package com.piersoft.mdm.persistence.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ProjectActivity {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String lnId;
    private String projectCode;
    private String planCode;
    private String elementCode;
    private String elementDesc;
    private String activityCode;
    private String activityDesc;

}
