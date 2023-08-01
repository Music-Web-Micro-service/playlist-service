package com.freemusic.playlistservice.controllers;

import com.freemusic.playlistservice.models.Playlist;
import com.freemusic.playlistservice.models.PlaylistTrack;
import com.freemusic.playlistservice.services.PlaylistTrackService;
import com.freemusic.playlistservice.services.PlaylistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tracks")
public class PlaylistTrackController {

    private final PlaylistTrackService playlistTrackService;
    private final PlaylistService playlistService;

    @Autowired
    public PlaylistTrackController(PlaylistTrackService playlistTrackService, PlaylistService playlistService) {
        this.playlistTrackService = playlistTrackService;
        this.playlistService = playlistService;
    }

    @PostMapping
    public ResponseEntity<PlaylistTrack> addTrackToPlaylist(@RequestBody PlaylistTrack track) {
        PlaylistTrack addedTrack = playlistTrackService.addTrackToPlaylist(track);
        return ResponseEntity.status(HttpStatus.CREATED).body(addedTrack);
    }

    @GetMapping("/playlist/{playlistId}")
    public ResponseEntity<List<PlaylistTrack>> getTrackInPlaylist(@PathVariable("playlistId") Long playlistId) {
        Playlist playlist = playlistService.getPlayList(playlistId.intValue());
        if (playlist == null) {
            return ResponseEntity.notFound().build();
        }
        List<PlaylistTrack> tracks = playlistTrackService.getTrackInPlaylist(playlist);
        return ResponseEntity.ok(tracks);
    }

    @GetMapping("/playlist")
    public ResponseEntity<PlaylistTrack> getTrackByPlaylistIdAndTrackId(@RequestParam("playlistId")Long playlistId, @RequestParam("trackId")Long trackId) {
        Playlist playlist = playlistService.getPlayList(playlistId.intValue());
        if (playlist == null) {
            return ResponseEntity.notFound().build();
        }
        PlaylistTrack tracks = playlistTrackService.getTrack(playlist, trackId.intValue());
        return ResponseEntity.ok(tracks);
    }


    @GetMapping
    public ResponseEntity<List<PlaylistTrack>> getAllTracks() {
        List<PlaylistTrack> tracks = playlistTrackService.getAllTracks();
        return ResponseEntity.ok(tracks);
    }

    @PutMapping
    public ResponseEntity<PlaylistTrack> updateTrackInPlaylist(@RequestBody PlaylistTrack track) {
        PlaylistTrack updatedTrack = playlistTrackService.updateTrackInPlaylist(track);
        return ResponseEntity.ok(updatedTrack);
    }

    @DeleteMapping("/{trackId}")
    public ResponseEntity<Void> removeTrackFromPlaylist(@RequestParam("playlistId")Long playlistId, @RequestParam("trackId")Long trackId) {
        Playlist playlist = playlistService.getPlayList(playlistId.intValue());
        PlaylistTrack track = playlistTrackService.getTrack(playlist, trackId.intValue());
        if (track == null) {
            return ResponseEntity.notFound().build();
        }
        playlistTrackService.removeTrackFromPlaylist(track);
        return ResponseEntity.noContent().build();
    }
}