package com.promineotech.music.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.filter.OrderedRequestContextFilter;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.promineotech.music.dao.CreateMusicianDao;
import com.promineotech.music.entity.Musician;
import com.promineotech.music.entity.MusicianRequest;

@Service
public class DefaultCreateMusicianService implements CreateMusicianService {

  @Autowired
  private CreateMusicianDao createMusicianDao;
  
  @Transactional
  @Override
  public Musician createMusician(MusicianRequest musicianRequest) {
    
    return musicianRequest;
  }
  
  
  private Musician getMusician(MusicianRequest musicianRequest) {
    return createMusicianDao.fetchMusician(musicianRequest.getFirstName(), 
        musicianRequest.getLastName(), musicianRequest.getAliasName());
       
        
  }

  
}
