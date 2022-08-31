package com.promineotech.music.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.promineotech.music.dao.CreateMusicianDao;
import com.promineotech.music.entity.Musician;
import com.promineotech.music.entity.MusicianRequest;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DefaultCreateMusicianService implements CreateMusicianService {

  @Autowired
  private CreateMusicianDao createMusicianDao;
  
  @Transactional
  @Override
  public Musician createMusician(MusicianRequest musicianRequest) {
    log.info("the createMusician was called using an entered firstName, lastName, and aliasName if available");
    return createMusicianDao.saveMusician(musicianRequest);
  }

  
  }
  
