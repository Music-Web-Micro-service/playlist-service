package com.freemusic.playlistservice.repositories;

import com.freemusic.playlistservice.models.Playlist;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PlaylistRepository extends JpaRepository<Playlist,Integer> {
    List<Playlist> getPlaylistsByUserId(Integer userId);
}
