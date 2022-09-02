package com.promineotech.music.dao;

import com.promineotech.music.entity.Album;
import com.promineotech.music.entity.AlbumRequest;

public interface DeleteAlbumDao {

  Album deleteAlbum(AlbumRequest albumRequest);
}
