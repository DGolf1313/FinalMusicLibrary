package com.promineotech.music.dao;

import java.util.Optional;
import com.promineotech.music.entity.Musician;

public interface CreateMusicianDao {
  
  Optional<Musician> fetchMusician(String firstName, String lastName, String aliasName);

  void saveMusician(Musician musician);
 //Musician saveMusician(String firstName, String lastName, String aliasName);
}
