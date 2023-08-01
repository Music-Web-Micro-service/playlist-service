package com.freemusic.playlistservice.services;

import com.freemusic.playlistservice.models.Playlist;

import java.util.List;

public interface PlaylistService {
    // Create
    Playlist createPlayList(Playlist playList);

    // Read
    Playlist getPlayList(int id);
    List<Playlist> getAllPlayLists();

    // Update
    Playlist updatePlayList(Playlist playList);

    // Delete
    void deletePlayList(int id);

    List<Playlist> getAllPlaylistForOneUser(int userId);
}
