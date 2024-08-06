package com.odji.spring_back_end.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
//@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "roles")
public class Roles  {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @Column(name = "rolename")
  private String roleName;

  @ManyToOne
  @JoinColumn(name = "idutilisateur")
  private Utilisateur utilisateur;

}
