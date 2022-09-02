package com.promineotech.music.dao;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;
import com.promineotech.music.entity.Album;
import com.promineotech.music.entity.AlbumRequest;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class DefaultDeleteAlbumDao implements DeleteAlbumDao {

  @Autowired
  private NamedParameterJdbcTemplate jdbcTemplate;
  
  @Override
  public Album deleteAlbum(AlbumRequest albumRequest) {
    log.debug("The albumDelete request:", albumRequest);
    
    String sql = ""
        +"DELETE FROM album WHERE "
        + "album_id = :album_id";
    
    Map<String, Object> params = new HashMap<>();
    params.put("album_id", albumRequest.getAlbumId());
    
    jdbcTemplate.update(sql, params);
    return null;
      }
      
    
  }


