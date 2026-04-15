package net.nicovrc.dev.prefab;

import net.nicovrc.dev.data.PlayListData;

import java.util.List;

public class YamaPlayer2 implements Prefab {
    private List<PlayListData> urls = null;
    private String playlistName = null;

    private final String prefab_1 = """
            %YAML 1.1
            %TAG !u! tag:unity3d.com,2011:
            --- !u!1 &5894897497169814956
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 1766346348726157360}
              - component: {fileID: 7807524094667191790}
              m_Layer: 0
              m_Name: "\\u30CB\\u30B3\\u30CB\\u30B3\\u96C6\\u4F1A"
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!4 &1766346348726157360
            Transform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 5894897497169814956}
              serializedVersion: 2
              m_LocalRotation: {x: -0, y: 0.7071068, z: -0, w: 0.7071068}
              m_LocalPosition: {x: -2.0560753, y: -1.6822429, z: -11.68682}
              m_LocalScale: {x: 0.99999976, y: 0.4672897, z: 0.46728963}
              m_ConstrainProportionsScale: 0
              m_Children: []
              m_Father: {fileID: 0}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
            --- !u!114 &7807524094667191790
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 5894897497169814956}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: d03aa935631e5db4d87ad3c35936433c, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
            """;

    private final String prefab_playlistName = "  playlistName: \"#playlistname#\"\n";

    private final String prefab_2 = "  tracks:\n";

    private final String prefab_track = """
            - playerType: 1
              title: "#title#"
              url: #url#
            """;

    private final String prefab_3 = "  youtubePlaylistId: ";

    @Override
    public void setUrls(List<PlayListData> urls) {
        this.urls = urls;
    }


    public void setPlaylistName(String playlistName){
        this.playlistName = playlistName;
    }

    @Override
    public String getPrefab() {

        StringBuilder sb = new StringBuilder();

        sb.append(prefab_1).append(prefab_playlistName.replaceAll("#playlistname#", unicode(playlistName))).append(prefab_2);

        for (PlayListData url : urls) {
            sb.append(prefab_track.replaceAll("#title#", unicode(url.getVideoURL())).replaceAll("#url#", url.getVideoURL()));
        }

        sb.append(prefab_3);

        return sb.toString();
    }

    private String unicode(String original){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < original.length(); i++) {
            sb.append(String.format("\\\\u%04X", Character.codePointAt(original, i)));
        }
        String unicode = sb.toString();
        return unicode;
    }
}
