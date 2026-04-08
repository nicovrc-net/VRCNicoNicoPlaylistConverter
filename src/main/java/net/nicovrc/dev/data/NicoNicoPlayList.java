package net.nicovrc.dev.data;

import java.util.List;

public class NicoNicoPlayList {

    private String PlaylistTitle;
    private List<PlayListData> PlaylistData;

    public String getPlaylistTitle() {
        return PlaylistTitle;
    }

    public void setPlaylistTitle(String playlistTitle) {
        PlaylistTitle = playlistTitle;
    }

    public List<PlayListData> getPlaylistData() {
        return PlaylistData;
    }

    public void setPlaylistData(List<PlayListData> playlistData) {
        PlaylistData = playlistData;
    }

}
