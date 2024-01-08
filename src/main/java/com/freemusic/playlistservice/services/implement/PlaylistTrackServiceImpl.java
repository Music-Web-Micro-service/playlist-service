package com.freemusic.playlistservice.services.implement;

import com.freemusic.playlistservice.models.Playlist;
import com.freemusic.playlistservice.models.PlaylistTrack;
import com.freemusic.playlistservice.repositories.PlaylistTrackRepository;
import com.freemusic.playlistservice.services.PlaylistTrackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlaylistTrackServiceImpl implements PlaylistTrackService {

    @Autowired
    private PlaylistTrackRepository playListTrackRepository;


    @Override
    public PlaylistTrack addTrackToPlaylist(PlaylistTrack track) {
        return playListTrackRepository.save(track);
    }

    @Override
    public List<PlaylistTrack> getTrackInPlaylist(Playlist playlist) {
        return playListTrackRepository.getPlaylistTracksByPlaylist(playlist);
    }


    @Override
    public List<PlaylistTrack> getAllTracks() {
        return playListTrackRepository.findAll();
    }
    @Override
    public PlaylistTrack updateTrackInPlaylist(PlaylistTrack playListTrack) {
        return playListTrackRepository.save(playListTrack);
    }

    @Override
    public void removeTrackFromPlaylist(PlaylistTrack track) {
        playListTrackRepository.delete(track);
    }

    @Override
    public PlaylistTrack getTrack(Playlist playlist, int trackId) {
        return playListTrackRepository.findByPlaylistPlaylistIdAndTrackId(playlist.getPlaylistId(), trackId);
    }


}
