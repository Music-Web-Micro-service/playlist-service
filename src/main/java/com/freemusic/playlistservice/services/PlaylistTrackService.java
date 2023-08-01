package com.freemusic.playlistservice.services;

import com.freemusic.playlistservice.models.Playlist;
import com.freemusic.playlistservice.models.PlaylistTrack;

import java.util.List;

public interface PlaylistTrackService {

    // Create
    PlaylistTrack addTrackToPlaylist(PlaylistTrack track);
    // Read
    List<PlaylistTrack> getTrackInPlaylist(Playlist playlist);
    List<PlaylistTrack> getAllTracks();
    // Update
    PlaylistTrack updateTrackInPlaylist(PlaylistTrack playListTrack);
    // Delete
    void removeTrackFromPlaylist(PlaylistTrack track);
    PlaylistTrack getTrack(Playlist playlist, int trackId);

}
