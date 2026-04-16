package net.nicovrc.dev.json;

public class ayaplayer_backup {
/*
{
  "title": "Root",
  "type": "folder",
  "children": [
    {
      "title": "a",
      "type": "video",
      "url": "b"
    }
  ]
}
 */
    private String title;
    private String type;
    private ayaplayer_backup_children[] children;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ayaplayer_backup_children[] getChildren() {
        return children;
    }

    public void setChildren(ayaplayer_backup_children[] children) {
        this.children = children;
    }
}
