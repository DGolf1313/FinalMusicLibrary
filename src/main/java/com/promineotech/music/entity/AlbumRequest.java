package com.promineotech.music.entity;

import javax.validation.constraints.Positive;
import lombok.Data;

@Data
public class AlbumRequest {
  
  
  @Positive
  private int albumId;
  
}
