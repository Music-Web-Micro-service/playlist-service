package com.freemusic.playlistservice.controllers;

import com.freemusic.playlistservice.models.Playlist;
import com.freemusic.playlistservice.services.PlaylistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/playlists")
public class PlaylistController {
    @Autowired
    private PlaylistService playListService;

    // Create
    @PostMapping("/create")
    public Playlist createPlayList(@RequestBody Playlist playList) {
        return playListService.createPlayList(playList);
    }

    // Read
    @GetMapping("/find/{id}")
    public Playlist getPlayList(@PathVariable int id) {
        return playListService.getPlayList(id);
    }

    @GetMapping("/findAll")
    public List<Playlist> getAllPlayLists() {
        return playListService.getAllPlayLists();
    }

    // Update
    @PutMapping("/update/{id}")
    public Playlist updatePlayList(@RequestBody Playlist playList) {
        return playListService.updatePlayList(playList);
    }

    // Delete
    @DeleteMapping("/delete/{id}")
    public void deletePlayList(@PathVariable int id) {
        playListService.deletePlayList(id);
    }
}

