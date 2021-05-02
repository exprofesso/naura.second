package com.naera.second.model;

import javax.persistence.*;
import java.util.Set;

@Entity
//@Table(name = "USER")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "USER_ID")
    private Integer id = 0;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "PASSWORD")
    private String password;

    @Column(name = "NAME")
    private String name;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "ACTIVE")
    private Integer activation;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "USER_ROLE", joinColumns =[JoinColumn(name = "USER_ID")], inverseJoinColumns =[JoinColumn(name = "ROLE_ID")])
    private Set<Role> Roles;  // emptySet() не понятно зачем

//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getSurname() {
//        return surname;
//    }
//
//    public void setSurname(String surname) {
//        this.surname = surname;
//    }
//
//    public boolean isActivation() {
//        return activation;
//    }
//
//    public void setActivation(boolean activation) {
//        this.activation = activation;
//    }
//
//
//    public Role getRole() {
//        return role;
//    }
//
//    public void setRole(Role role) {
//        this.role = role;
//    }
//
//    @Override
//    public String toString() {
//        return "User{" +
//                "id=" + id +
//                ", email='" + email + '\'' +
//                ", password='" + password + '\'' +
//                ", name='" + name + '\'' +
//                ", surname='" + surname + '\'' +
//                ", activation=" + activation +
//                ", role=" + role +
//                '}';
//    }
}
