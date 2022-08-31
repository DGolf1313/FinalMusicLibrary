package com.promineotech.music.dao;

import java.util.Optional;
import com.promineotech.music.entity.Musician;
import com.promineotech.music.entity.MusicianRequest;

public interface CreateMusicianDao {
  
  //Optional<Musician> fetchMusician(String firstName, String lastName, String aliasName);

  Musician saveMusician(MusicianRequest musicianRequest);
}
