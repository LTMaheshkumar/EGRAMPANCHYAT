package com.cdac.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "ward")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Ward {

    @Id
    @Column(name = "ward_no")
    private Integer wardNo;

    private String wardName;

    @ManyToOne
    @JoinColumn(name = "gp_id", nullable = false)
    private Grampanchayat grampanchayat;
}
