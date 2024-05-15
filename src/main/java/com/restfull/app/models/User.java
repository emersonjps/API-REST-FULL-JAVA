package com.restfull.app.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tb_user")
@Getter
@Setter
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_user")
  private Long id;

  private String name;
  private String cpf;
  private String password;
  
  public User() {
  }

  public User(String name, String cpf, String password) {
    this.name = name;
    this.cpf = cpf;
    this.password = password;
  }

  @Override
  public String toString() {
    return "User:{name=" + name + ", cpf=" + cpf + ", password=" + password + "}";
  }
}
