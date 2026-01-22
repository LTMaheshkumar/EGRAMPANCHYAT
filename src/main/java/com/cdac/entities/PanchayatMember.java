package com.cdac.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "panchayat_member")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PanchayatMember {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long memberId;

    @Column(nullable = false)
    private String name;

    private String designation; // Member, Deputy, etc.

    @ManyToOne
    @JoinColumn(name = "gp_id", nullable = false)
    private Grampanchayat grampanchayat;

    @ManyToOne
    @JoinColumn(name = "ward_no", nullable = false)
    private Ward ward;
}
