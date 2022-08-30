package com.promineotech.music.controller;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.promineotech.music.entity.Musician;
import com.promineotech.music.entity.MusicianRequest;
import com.promineotech.music.service.CreateMusicianService;
import lombok.extern.slf4j.Slf4j;


@RestController
@Slf4j
public class BasicCreateMusicianController implements CreateMusicianController {

  @Autowired
  private CreateMusicianService createMusicianService;
  
  @Override
  public Musician createMusician(@Valid MusicianRequest musicianRequest) {
    log.debug("Musician={}", musicianRequest);
    return createMusicianService.createMusician(musicianRequest);
  }

}
