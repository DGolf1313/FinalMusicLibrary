package com.promineotech.music.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.promineotech.music.dao.DeleteAlbumDao;
import com.promineotech.music.entity.Album;
import com.promineotech.music.entity.AlbumRequest;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DefaultDeleteAlbumService implements DeleteAlbumService {

  @Autowired
  private DeleteAlbumDao deleteAlbumDao;
  
  @Override
  public Album deleteAlbum(AlbumRequest albumRequest) {
    log.info("the deleteAlbum was called using an albumId");
    return deleteAlbumDao.deleteAlbum(albumRequest);
  }

}
