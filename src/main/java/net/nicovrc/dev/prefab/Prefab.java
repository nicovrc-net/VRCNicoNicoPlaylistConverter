package net.nicovrc.dev.prefab;

import net.nicovrc.dev.data.PlayListData;

import java.util.List;

public interface Prefab {

    void setUrls(List<PlayListData> urls);

    String getPrefab();

}
