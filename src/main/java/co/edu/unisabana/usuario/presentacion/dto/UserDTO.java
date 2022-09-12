package co.edu.unisabana.usuario.presentacion.dto;

import lombok.*;

@Data
@AllArgsConstructor
public class UserDTO {

  private String name;
  private String lastName;
  private int age;

}