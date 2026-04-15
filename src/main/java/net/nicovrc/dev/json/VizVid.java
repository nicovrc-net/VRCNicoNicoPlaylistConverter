package net.nicovrc.dev.json;

public class VizVid {

    private String title = "Playlist";
    private VizVid_entries[] entries;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public VizVid_entries[] getEntries() {
        return entries;
    }

    public void setEntries(VizVid_entries[] entries) {
        this.entries = entries;
    }
}
