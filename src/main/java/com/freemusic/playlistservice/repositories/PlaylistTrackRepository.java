package com.freemusic.playlistservice.repositories;

import com.freemusic.playlistservice.models.Playlist;
import com.freemusic.playlistservice.models.PlaylistTrack;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PlaylistTrackRepository extends JpaRepository<PlaylistTrack,Integer> {
    List<PlaylistTrack> getPlaylistTracksByPlaylist(Playlist playlist);
    PlaylistTrack queryByPlaylistAndTrackId(Playlist playlist, Integer trackId);
    PlaylistTrack getPlaylistTracksByPlaylistIdAndAndTrackId(Integer playlistId, Integer playlistTrackId);
}
