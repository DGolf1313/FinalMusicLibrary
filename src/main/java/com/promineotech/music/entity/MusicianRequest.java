package com.promineotech.music.entity;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import org.hibernate.validator.constraints.Length;
import lombok.Data;

@Data
public class MusicianRequest {
  
  @NotNull
  @Length(max = 50)
  @Pattern(regexp = "[\\w\\s]*")
  private String firstName;
  
  @NotNull
  @Length(max = 50)
  @Pattern(regexp = "[\\w\\s]*")
  private String lastName;
  
  @Length(max = 50)
  @Pattern(regexp = "[\\w\\s]*")
  private String aliasName;

}
