package com.promineotech.music.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;
import com.promineotech.music.entity.Song;
import lombok.extern.slf4j.Slf4j;


@Component
@Slf4j
public class DefaultMusicViewingDao implements MusicViewingDao {

  
  @Autowired
  private NamedParameterJdbcTemplate jdbcTemplate;
  
  @Override
  public List<Song> fetchSongs(String albumId) {
    log.debug("DAO: albumId={}");
    
  //@formatter:off
    String sql = ""
        + "SELECT * "
        + "FROM song "
        + "WHERE album_id = :album_id";
    //@formatter:0n
    
    Map<String, Object> params = new HashMap<>();
      params.put(albumId, params)
    
    
    return null;
  }

}
