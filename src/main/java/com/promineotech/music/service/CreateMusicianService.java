package com.promineotech.music.service;

import com.promineotech.music.entity.Musician;
import com.promineotech.music.entity.MusicianRequest;

public interface CreateMusicianService {

  
  Musician createMusician(MusicianRequest musicianRequest);
}
