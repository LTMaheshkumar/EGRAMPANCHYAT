package com.cdac.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PanchayatMemberDto {

    private String name;
    private String designation;
    private Integer wardNo;
    private Long gpId;
}
