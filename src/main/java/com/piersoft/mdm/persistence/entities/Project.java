package com.piersoft.mdm.persistence.entities;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Project {

    @Id
    private String lnId;
    private String projectCode;
    private String projectName;
    private String companyId;
    private String companyName;


}
