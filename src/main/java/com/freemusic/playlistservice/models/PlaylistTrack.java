package com.freemusic.playlistservice.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="playlist_track")
public class PlaylistTrack {

    @Id
    private int playlistTrackId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "playlistId", nullable = false)
    @JsonIgnore
    private Playlist playlist;
    private int playlistId;
    private int trackId;
}
