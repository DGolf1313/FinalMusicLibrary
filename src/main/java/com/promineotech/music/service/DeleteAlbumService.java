package com.promineotech.music.service;

import com.promineotech.music.entity.Album;
import com.promineotech.music.entity.AlbumRequest;

public interface DeleteAlbumService {

  Album deleteAlbum(AlbumRequest albumRequest);
}
