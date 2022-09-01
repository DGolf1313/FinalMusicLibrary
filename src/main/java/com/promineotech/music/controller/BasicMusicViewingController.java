package com.promineotech.music.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.promineotech.music.entity.Song;
import com.promineotech.music.service.MusicViewingService;
import lombok.extern.slf4j.Slf4j;


@RestController
@Slf4j
public class BasicMusicViewingController implements MusicViewingController {

  @Autowired
  private MusicViewingService musicViewingService;
  
  @Override
  public List<Song> fetchSongs(String albumId) {
    log.debug("albumId={}", albumId);
    List<Song> songs = musicViewingService.fetchSongs(albumId);
    return songs;
  }

}
