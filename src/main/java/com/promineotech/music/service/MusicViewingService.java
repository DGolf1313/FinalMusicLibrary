package com.promineotech.music.service;

import java.util.List;
import com.promineotech.music.entity.Song;

public interface MusicViewingService {

  /**
   * 
   * @param albumId
   * @return
   */
   List<Song> fetchSongs(String albumId);
}
  