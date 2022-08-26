package com.promineotech.music.service;

import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.promineotech.music.dao.MusicViewingDao;
import com.promineotech.music.entity.Song;
import lombok.extern.slf4j.Slf4j;


@Service
@Slf4j
public class DefaultMusicViewingService implements MusicViewingService {

  @Autowired
  private MusicViewingDao musicViewingDao;
  
  
  @Transactional(readOnly = true)
  @Override
  public List<Song> fetchSongs(String albumId) {
    log.info("The fetchSongs method was called for the albumId={}", albumId);
    List<Song> songs = musicViewingDao.fetchSongs(albumId);
    
    if(songs.isEmpty()) {
      String msg = String.format("No songs were found in albumId=%s" , albumId);
      throw new NoSuchElementException(msg);
    }
   // Collections.sort(songs);
    return songs;
  }

}
