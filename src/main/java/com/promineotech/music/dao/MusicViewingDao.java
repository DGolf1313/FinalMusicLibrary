package com.promineotech.music.dao;

import java.util.List;
import com.promineotech.music.entity.Song;

public interface MusicViewingDao {

  /**
   * 
   * @param albumId
   * @return
   */
  List<Song> fetchSongs(int albumId);
}
