package com.web_app.springbootapp.model;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "role")
@NoArgsConstructor @AllArgsConstructor
@Getter @Setter @ToString @EqualsAndHashCode
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true, nullable = false)
    private String name;
    @Column(unique = true, nullable = false)
    @ManyToMany(mappedBy = "roles")
    private Set<User> users;
}
