package com.freemusic.playlistservice.messages;

public class PlaylistTrackMessage {
    private int playlistId;
    private int trackId;

    // Constructors
    public PlaylistTrackMessage() {
    }

    public PlaylistTrackMessage(int playlistId, int trackId) {
        this.playlistId = playlistId;
        this.trackId = trackId;
    }

    // Getters and Setters
    public int getPlaylistId() {
        return playlistId;
    }

    public void setPlaylistId(int playlistId) {
        this.playlistId = playlistId;
    }

    public int getTrackId() {
        return trackId;
    }

    public void setTrackId(int trackId) {
        this.trackId = trackId;
    }
}
