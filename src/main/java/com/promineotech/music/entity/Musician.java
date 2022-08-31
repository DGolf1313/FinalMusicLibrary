package com.promineotech.music.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Musician {
  private int musicianId;
  private String firstName;
  private String lastName;
  private String aliasName;
  
}
