package com.freemusic.playlistservice.services.implement;

import com.freemusic.playlistservice.models.Playlist;
import com.freemusic.playlistservice.repositories.PlaylistRepository;
import com.freemusic.playlistservice.services.PlaylistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlaylistServiceImpl implements PlaylistService {
    @Autowired
    private PlaylistRepository playListRepository;

    @Override
    public Playlist createPlayList(Playlist playList) {
        return playListRepository.save(playList);
    }

    @Override
    public Playlist getPlayList(int id) {
        return playListRepository.getReferenceById(id);
    }

    @Override
    public List<Playlist> getAllPlayLists() {
        return playListRepository.findAll();
    }

    @Override
    public Playlist updatePlayList(Playlist playList) {
        return playListRepository.save(playList);
    }

    @Override
    public void deletePlayList(int id) {
        playListRepository.deleteById(id);
    }

    @Override
    public List<Playlist> getAllPlaylistForOneUser(int userId) {
        return playListRepository.getPlaylistsByUserId(userId);
    }
}
