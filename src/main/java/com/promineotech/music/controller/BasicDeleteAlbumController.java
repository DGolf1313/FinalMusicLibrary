package com.promineotech.music.controller;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.promineotech.music.entity.Album;
import com.promineotech.music.entity.AlbumRequest;
import com.promineotech.music.service.CreateMusicianService;
import com.promineotech.music.service.DeleteAlbumService;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class BasicDeleteAlbumController implements DeleteAlbumController {

  @Autowired
  private DeleteAlbumService deleteAlbumService;
  
  
  @Override
  public Album deleteAlbum(@Valid AlbumRequest albumRequest) {
    log.debug("AlbumID={}", albumRequest);
    return deleteAlbumService.deleteAlbum(albumRequest);
  }

}
