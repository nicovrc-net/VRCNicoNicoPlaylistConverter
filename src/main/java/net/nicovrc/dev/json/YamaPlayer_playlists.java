package net.nicovrc.dev.json;

public class YamaPlayer_playlists {

    private boolean Active = true;
    private String Name = "新規プレイリスト";
    private YamaPlayer_Tracks[] Tracks = null;
    private String YoutubeListId = null;
    private boolean IsEdit = false;

    public boolean isActive() {
        return Active;
    }

    public void setActive(boolean active) {
        this.Active = active;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public YamaPlayer_Tracks[] getTracks() {
        return Tracks;
    }

    public void setTracks(YamaPlayer_Tracks[] tracks) {
        this.Tracks = tracks;
    }

    public String getYoutubeListId() {
        return YoutubeListId;
    }

    public void setYoutubeListId(String youtubeListId) {
        this.YoutubeListId = youtubeListId;
    }

    public boolean isEdit() {
        return IsEdit;
    }

    public void setEdit(boolean edit) {
        this.IsEdit = edit;
    }
}
