package com.cdac.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WardDto {

    private Integer wardNo;
    private String wardName;
    private Long gpId;   // FK input
}
