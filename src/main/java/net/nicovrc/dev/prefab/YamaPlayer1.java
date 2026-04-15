package net.nicovrc.dev.prefab;

import net.nicovrc.dev.data.PlayListData;

import java.util.List;

public class YamaPlayer1 implements Prefab {
    private List<PlayListData> urls = null;

    private final String prefab_1 = """
            %YAML 1.1
            %TAG !u! tag:unity3d.com,2011:
            --- !u!1 &8567875197314999729
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 2486074124121723567}
              - component: {fileID: 3607497585851115182}
              m_Layer: 0
              m_Name: BGM 1
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!4 &2486074124121723567
            Transform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 8567875197314999729}
              serializedVersion: 2
              m_LocalRotation: {x: -0, y: -0, z: -0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children: []
              m_Father: {fileID: 0}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
            --- !u!114 &3607497585851115182
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 8567875197314999729}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: d03aa935631e5db4d87ad3c35936433c, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
            """;

    private final String prefab_playlistName = "  playListName: \"#playlistname#\"\n";
    private final String prefab_2 = "  tracks:\n";
    private final String prefab_track = """
              - Mode: 1
                Title: "#title#"
                Url: #url#
            """;

    private final String prefab_3 = """
              IwaSync3PlayList: {fileID: 0}
              KienlPlayList: {fileID: 0}
              YouTubePlayListID:\s
            
            """;

    private String playlistName = "";

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
            sb.append(prefab_track.replaceAll("#title#", unicode(url.getTitle())).replaceAll("#url#", url.getVideoURL()));
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
