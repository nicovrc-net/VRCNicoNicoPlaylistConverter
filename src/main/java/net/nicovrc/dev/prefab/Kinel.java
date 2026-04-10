package net.nicovrc.dev.prefab;

import net.nicovrc.dev.data.PlayListData;

import java.util.List;

public class Kinel implements Prefab {

    private List<PlayListData> urls = null;
    private final String prefab_1 = """
            %YAML 1.1
            %TAG !u! tag:unity3d.com,2011:
            --- !u!1 &14313322153610774
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 8092769853755633580}
              - component: {fileID: 7562445866840678980}
              m_Layer: 0
              m_Name: Progress
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &8092769853755633580
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 14313322153610774}
              m_LocalRotation: {x: 0, y: 0, z: 0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children:
              - {fileID: 165530586570030590}
              - {fileID: 7698234578515271508}
              m_Father: {fileID: 7350327250546647802}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 0}
              m_AnchorMax: {x: 1, y: 1}
              m_AnchoredPosition: {x: 0, y: 0}
              m_SizeDelta: {x: 0, y: 0}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!114 &7562445866840678980
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 14313322153610774}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: 67db9e8f0e2ae9c40bc1e2b64352a6b4, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Navigation:
                m_Mode: 3
                m_WrapAround: 0
                m_SelectOnUp: {fileID: 0}
                m_SelectOnDown: {fileID: 0}
                m_SelectOnLeft: {fileID: 0}
                m_SelectOnRight: {fileID: 0}
              m_Transition: 1
              m_Colors:
                m_NormalColor: {r: 1, g: 1, b: 1, a: 1}
                m_HighlightedColor: {r: 0.9607843, g: 0.9607843, b: 0.9607843, a: 1}
                m_PressedColor: {r: 0.78431374, g: 0.78431374, b: 0.78431374, a: 1}
                m_SelectedColor: {r: 0.9607843, g: 0.9607843, b: 0.9607843, a: 1}
                m_DisabledColor: {r: 0.78431374, g: 0.78431374, b: 0.78431374, a: 0.5019608}
                m_ColorMultiplier: 1
                m_FadeDuration: 0.1
              m_SpriteState:
                m_HighlightedSprite: {fileID: 0}
                m_PressedSprite: {fileID: 0}
                m_SelectedSprite: {fileID: 0}
                m_DisabledSprite: {fileID: 0}
              m_AnimationTriggers:
                m_NormalTrigger: Normal
                m_HighlightedTrigger: Highlighted
                m_PressedTrigger: Pressed
                m_SelectedTrigger: Selected
                m_DisabledTrigger: Disabled
              m_Interactable: 1
              m_TargetGraphic: {fileID: 3412976443463887398}
              m_FillRect: {fileID: 1143717302508411099}
              m_HandleRect: {fileID: 1650949901631161606}
              m_Direction: 0
              m_MinValue: 0
              m_MaxValue: 1
              m_WholeNumbers: 0
              m_Value: 0
              m_OnValueChanged:
                m_PersistentCalls:
                  m_Calls: []
            --- !u!1 &51806584384254737
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 5301104539563946224}
              m_Layer: 0
              m_Name: Prefabs
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &5301104539563946224
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 51806584384254737}
              m_LocalRotation: {x: -0, y: -0, z: -0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children:
              - {fileID: 1938720740041111393}
              m_Father: {fileID: 6591443197360614477}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 1}
              m_AnchorMax: {x: 0, y: 1}
              m_AnchoredPosition: {x: 50, y: -50}
              m_SizeDelta: {x: 100, y: 100}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!1 &102495924560425121
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 778957084648160671}
              - component: {fileID: 408247069005563623}
              - component: {fileID: 2981252610150698757}
              m_Layer: 0
              m_Name: Description
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &778957084648160671
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 102495924560425121}
              m_LocalRotation: {x: 0, y: 0, z: 0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children: []
              m_Father: {fileID: 4877450149381548715}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 0.5}
              m_AnchorMax: {x: 0, y: 0.5}
              m_AnchoredPosition: {x: 25, y: 0}
              m_SizeDelta: {x: 725, y: 125}
              m_Pivot: {x: 0, y: 0.5}
            --- !u!222 &408247069005563623
            CanvasRenderer:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 102495924560425121}
              m_CullTransparentMesh: 0
            --- !u!114 &2981252610150698757
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 102495924560425121}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: 5f7201a12d95ffc409449d95f23cf332, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Material: {fileID: 0}
              m_Color: {r: 1, g: 1, b: 1, a: 1}
              m_RaycastTarget: 0
              m_RaycastPadding: {x: 0, y: 0, z: 0, w: 0}
              m_Maskable: 1
              m_OnCullStateChanged:
                m_PersistentCalls:
                  m_Calls: []
              m_FontData:
                m_Font: {fileID: 10102, guid: 0000000000000000e000000000000000, type: 0}
                m_FontSize: 50
                m_FontStyle: 0
                m_BestFit: 0
                m_MinSize: 0
                m_MaxSize: 50
                m_Alignment: 3
                m_AlignByGeometry: 0
                m_RichText: 1
                m_HorizontalOverflow: 0
                m_VerticalOverflow: 0
                m_LineSpacing: 1
              m_Text: "\\u3010Minecraft (Java / BE)\\u53C2\\u52A0\\u578B\\u3011Minecraft\\u9678\\u4E0A\\u3057\\u3088\\u3046\\u3084"
            --- !u!1 &156140724998021372
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 3779167788817990329}
              - component: {fileID: 7506453303614797627}
              m_Layer: 0
              m_Name: Progress
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &3779167788817990329
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 156140724998021372}
              m_LocalRotation: {x: 0, y: 0, z: 0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children:
              - {fileID: 7841409250498791204}
              - {fileID: 76702301997625104}
              m_Father: {fileID: 1938720740041111393}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 0}
              m_AnchorMax: {x: 1, y: 1}
              m_AnchoredPosition: {x: 0, y: 0}
              m_SizeDelta: {x: 0, y: 0}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!114 &7506453303614797627
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 156140724998021372}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: 67db9e8f0e2ae9c40bc1e2b64352a6b4, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Navigation:
                m_Mode: 3
                m_WrapAround: 0
                m_SelectOnUp: {fileID: 0}
                m_SelectOnDown: {fileID: 0}
                m_SelectOnLeft: {fileID: 0}
                m_SelectOnRight: {fileID: 0}
              m_Transition: 1
              m_Colors:
                m_NormalColor: {r: 1, g: 1, b: 1, a: 1}
                m_HighlightedColor: {r: 0.9607843, g: 0.9607843, b: 0.9607843, a: 1}
                m_PressedColor: {r: 0.78431374, g: 0.78431374, b: 0.78431374, a: 1}
                m_SelectedColor: {r: 0.9607843, g: 0.9607843, b: 0.9607843, a: 1}
                m_DisabledColor: {r: 0.78431374, g: 0.78431374, b: 0.78431374, a: 0.5019608}
                m_ColorMultiplier: 1
                m_FadeDuration: 0.1
              m_SpriteState:
                m_HighlightedSprite: {fileID: 0}
                m_PressedSprite: {fileID: 0}
                m_SelectedSprite: {fileID: 0}
                m_DisabledSprite: {fileID: 0}
              m_AnimationTriggers:
                m_NormalTrigger: Normal
                m_HighlightedTrigger: Highlighted
                m_PressedTrigger: Pressed
                m_SelectedTrigger: Selected
                m_DisabledTrigger: Disabled
              m_Interactable: 1
              m_TargetGraphic: {fileID: 5682470023266708396}
              m_FillRect: {fileID: 8482424852069187971}
              m_HandleRect: {fileID: 8016748804206962951}
              m_Direction: 0
              m_MinValue: 0
              m_MaxValue: 1
              m_WholeNumbers: 0
              m_Value: 0
              m_OnValueChanged:
                m_PersistentCalls:
                  m_Calls: []
            --- !u!1 &194855279695346068
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 2430640025230488314}
              m_Layer: 0
              m_Name: Fill Area
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &2430640025230488314
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 194855279695346068}
              m_LocalRotation: {x: -0, y: -0, z: -0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children:
              - {fileID: 3919897665625198716}
              m_Father: {fileID: 5200865148158758191}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 0}
              m_AnchorMax: {x: 1, y: 1}
              m_AnchoredPosition: {x: 0, y: 0}
              m_SizeDelta: {x: -0.00000071525574, y: 0}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!1 &207888147147031185
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 8388239352119473134}
              - component: {fileID: 7815186047712148312}
              - component: {fileID: 9165996168979440440}
              m_Layer: 0
              m_Name: Icon
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &8388239352119473134
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 207888147147031185}
              m_LocalRotation: {x: -0, y: -0, z: -0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: -0.099999994}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children: []
              m_Father: {fileID: 674453769890291478}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0.5, y: 0.5}
              m_AnchorMax: {x: 0.5, y: 0.5}
              m_AnchoredPosition: {x: -0, y: 200}
              m_SizeDelta: {x: 200, y: 200}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!222 &7815186047712148312
            CanvasRenderer:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 207888147147031185}
              m_CullTransparentMesh: 0
            --- !u!114 &9165996168979440440
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 207888147147031185}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: fe87c0e1cc204ed48ad3b37840f39efc, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Material: {fileID: 0}
              m_Color: {r: 0.050980393, g: 0.08627451, b: 0.16470589, a: 1}
              m_RaycastTarget: 0
              m_RaycastPadding: {x: 0, y: 0, z: 0, w: 0}
              m_Maskable: 1
              m_OnCullStateChanged:
                m_PersistentCalls:
                  m_Calls: []
              m_Sprite: {fileID: 21300000, guid: 1757ad854354b8e4681c38cfe1e728a4, type: 3}
              m_Type: 0
              m_PreserveAspect: 0
              m_FillCenter: 1
              m_FillMethod: 4
              m_FillAmount: 1
              m_FillClockwise: 1
              m_FillOrigin: 0
              m_UseSpriteMesh: 0
              m_PixelsPerUnitMultiplier: 1
            --- !u!1 &386502599852986935
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 8754840689110247317}
              - component: {fileID: 6317590814962759351}
              - component: {fileID: 5211905544523423530}
              m_Layer: 0
              m_Name: UnlockImage
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &8754840689110247317
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 386502599852986935}
              m_LocalRotation: {x: 0, y: 0, z: 0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children: []
              m_Father: {fileID: 2990098242172014402}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 0}
              m_AnchorMax: {x: 1, y: 1}
              m_AnchoredPosition: {x: 0, y: 0}
              m_SizeDelta: {x: -30, y: -30}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!222 &6317590814962759351
            CanvasRenderer:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 386502599852986935}
              m_CullTransparentMesh: 0
            --- !u!114 &5211905544523423530
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 386502599852986935}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: fe87c0e1cc204ed48ad3b37840f39efc, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Material: {fileID: 0}
              m_Color: {r: 1, g: 1, b: 1, a: 1}
              m_RaycastTarget: 1
              m_RaycastPadding: {x: 0, y: 0, z: 0, w: 0}
              m_Maskable: 1
              m_OnCullStateChanged:
                m_PersistentCalls:
                  m_Calls: []
              m_Sprite: {fileID: 21300000, guid: 7ffae5334f2564a4087fdbccb8036ef5, type: 3}
              m_Type: 0
              m_PreserveAspect: 0
              m_FillCenter: 1
              m_FillMethod: 4
              m_FillAmount: 1
              m_FillClockwise: 1
              m_FillOrigin: 0
              m_UseSpriteMesh: 0
              m_PixelsPerUnitMultiplier: 1
            --- !u!1 &443921362605565648
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 5240514629014260598}
              m_Layer: 0
              m_Name: Label
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &5240514629014260598
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 443921362605565648}
              m_LocalRotation: {x: 0, y: 0, z: 0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children:
              - {fileID: 6310511621513028516}
              - {fileID: 976683185954366752}
              m_Father: {fileID: 2883308272097404143}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 1}
              m_AnchorMax: {x: 0, y: 1}
              m_AnchoredPosition: {x: 0, y: 0}
              m_SizeDelta: {x: 725, y: 275}
              m_Pivot: {x: 0, y: 1}
            --- !u!1 &666718422107574975
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 8439251724805581055}
              - component: {fileID: 516224094471597796}
              - component: {fileID: 3140458467008386955}
              m_Layer: 0
              m_Name: Border
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &8439251724805581055
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 666718422107574975}
              m_LocalRotation: {x: 0, y: 0, z: 0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children: []
              m_Father: {fileID: 1938720740041111393}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 0}
              m_AnchorMax: {x: 1, y: 1}
              m_AnchoredPosition: {x: 0.00018310547, y: 0}
              m_SizeDelta: {x: 0, y: 0}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!222 &516224094471597796
            CanvasRenderer:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 666718422107574975}
              m_CullTransparentMesh: 0
            --- !u!114 &3140458467008386955
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 666718422107574975}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: fe87c0e1cc204ed48ad3b37840f39efc, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Material: {fileID: 0}
              m_Color: {r: 1, g: 1, b: 1, a: 1}
              m_RaycastTarget: 0
              m_RaycastPadding: {x: 0, y: 0, z: 0, w: 0}
              m_Maskable: 1
              m_OnCullStateChanged:
                m_PersistentCalls:
                  m_Calls: []
              m_Sprite: {fileID: 21300000, guid: 216faa4d4dd65394b93796bbe0a64e9d, type: 3}
              m_Type: 1
              m_PreserveAspect: 0
              m_FillCenter: 1
              m_FillMethod: 4
              m_FillAmount: 1
              m_FillClockwise: 1
              m_FillOrigin: 0
              m_UseSpriteMesh: 0
              m_PixelsPerUnitMultiplier: 100
            --- !u!1 &804421850768068431
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 8833518044024487041}
              m_Layer: 0
              m_Name: Sliding Area
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &8833518044024487041
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 804421850768068431}
              m_LocalRotation: {x: -0, y: -0, z: -0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children:
              - {fileID: 1449591656158215384}
              m_Father: {fileID: 1511648965919563059}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 0}
              m_AnchorMax: {x: 1, y: 1}
              m_AnchoredPosition: {x: 0, y: 0}
              m_SizeDelta: {x: -20, y: -20}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!1 &881724002270753861
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 1319043205087142584}
              m_Layer: 0
              m_Name: Handle Slide Area
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 0
            --- !u!224 &1319043205087142584
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 881724002270753861}
              m_LocalRotation: {x: -0, y: -0, z: -0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children:
              - {fileID: 4998853293347282404}
              m_Father: {fileID: 5200865148158758191}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 0}
              m_AnchorMax: {x: 1, y: 1}
              m_AnchoredPosition: {x: 0, y: 0}
              m_SizeDelta: {x: -20, y: 0}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!1 &1015664978884661120
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 674453769890291478}
              m_Layer: 0
              m_Name: DisableCover
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 0
            --- !u!224 &674453769890291478
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 1015664978884661120}
              m_LocalRotation: {x: 0, y: 0, z: 0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children:
              - {fileID: 8528046028612408863}
              - {fileID: 2603757630081977693}
              - {fileID: 4016671412700591016}
              - {fileID: 8388239352119473134}
              m_Father: {fileID: 184951645298031073}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 0}
              m_AnchorMax: {x: 1, y: 1}
              m_AnchoredPosition: {x: -0.00024414062, y: 0}
              m_SizeDelta: {x: 0, y: 0}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!1 &1157229450638566572
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 5356571935761165568}
              - component: {fileID: 9136579545299531265}
              - component: {fileID: 3129159215687950138}
              - component: {fileID: 7774777269121593464}
              m_Layer: 0
              m_Name: Scroll View
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &5356571935761165568
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 1157229450638566572}
              m_LocalRotation: {x: 0, y: 0, z: 0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children:
              - {fileID: 6591443197360614477}
              - {fileID: 1511648965919563059}
              m_Father: {fileID: 8444635903433234331}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 0}
              m_AnchorMax: {x: 1, y: 1}
              m_AnchoredPosition: {x: 0, y: 0}
              m_SizeDelta: {x: -50, y: -57.999992}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!222 &9136579545299531265
            CanvasRenderer:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 1157229450638566572}
              m_CullTransparentMesh: 0
            --- !u!114 &3129159215687950138
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 1157229450638566572}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: fe87c0e1cc204ed48ad3b37840f39efc, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Material: {fileID: 0}
              m_Color: {r: 0, g: 0, b: 0, a: 0}
              m_RaycastTarget: 1
              m_RaycastPadding: {x: 0, y: 0, z: 0, w: 0}
              m_Maskable: 1
              m_OnCullStateChanged:
                m_PersistentCalls:
                  m_Calls: []
              m_Sprite: {fileID: 21300000, guid: 5be00597f9fe8ce46bac60f9477d9d6e, type: 3}
              m_Type: 1
              m_PreserveAspect: 0
              m_FillCenter: 1
              m_FillMethod: 4
              m_FillAmount: 1
              m_FillClockwise: 1
              m_FillOrigin: 0
              m_UseSpriteMesh: 0
              m_PixelsPerUnitMultiplier: 10
            --- !u!114 &7774777269121593464
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 1157229450638566572}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: 1aa08ab6e0800fa44ae55d278d1423e3, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Content: {fileID: 3997900497835806772}
              m_Horizontal: 0
              m_Vertical: 1
              m_MovementType: 2
              m_Elasticity: 0.1
              m_Inertia: 1
              m_DecelerationRate: 0.135
              m_ScrollSensitivity: 0
              m_Viewport: {fileID: 6591443197360614477}
              m_HorizontalScrollbar: {fileID: 0}
              m_VerticalScrollbar: {fileID: 844196808056124636}
              m_HorizontalScrollbarVisibility: 2
              m_VerticalScrollbarVisibility: 2
              m_HorizontalScrollbarSpacing: -3
              m_VerticalScrollbarSpacing: -3
              m_OnValueChanged:
                m_PersistentCalls:
                  m_Calls: []
            --- !u!1 &1216268455219697810
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 4005300115297860886}
              m_Layer: 0
              m_Name: Fill Area
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &4005300115297860886
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 1216268455219697810}
              m_LocalRotation: {x: -0, y: -0, z: -0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children:
              - {fileID: 411201580317830213}
              m_Father: {fileID: 4055473619923170533}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 0}
              m_AnchorMax: {x: 1, y: 1}
              m_AnchoredPosition: {x: 0, y: 0}
              m_SizeDelta: {x: -0.00000071525574, y: 0}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!1 &1338238876722333024
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 76667822655870186}
              - component: {fileID: 9079741852620566462}
              - component: {fileID: 4838995491360104456}
              m_Layer: 0
              m_Name: Background
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &76667822655870186
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 1338238876722333024}
              m_LocalRotation: {x: 0, y: 0, z: 0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children: []
              m_Father: {fileID: 8813083786143252063}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 0}
              m_AnchorMax: {x: 1, y: 1}
              m_AnchoredPosition: {x: 0.00018310547, y: 0}
              m_SizeDelta: {x: 0, y: 0}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!222 &9079741852620566462
            CanvasRenderer:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 1338238876722333024}
              m_CullTransparentMesh: 0
            --- !u!114 &4838995491360104456
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 1338238876722333024}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: fe87c0e1cc204ed48ad3b37840f39efc, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Material: {fileID: 0}
              m_Color: {r: 0.23104306, g: 0.27194327, b: 0.41509432, a: 1}
              m_RaycastTarget: 0
              m_RaycastPadding: {x: 0, y: 0, z: 0, w: 0}
              m_Maskable: 1
              m_OnCullStateChanged:
                m_PersistentCalls:
                  m_Calls: []
              m_Sprite: {fileID: 0}
              m_Type: 0
              m_PreserveAspect: 0
              m_FillCenter: 1
              m_FillMethod: 4
              m_FillAmount: 1
              m_FillClockwise: 1
              m_FillOrigin: 0
              m_UseSpriteMesh: 0
              m_PixelsPerUnitMultiplier: 1
            --- !u!1 &1350807268279165822
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 8746414208319405268}
              - component: {fileID: 2547694407703838166}
              - component: {fileID: 3634482771581527125}
              m_Layer: 0
              m_Name: Description
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &8746414208319405268
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 1350807268279165822}
              m_LocalRotation: {x: 0, y: 0, z: 0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children: []
              m_Father: {fileID: 8813083786143252063}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 0.5}
              m_AnchorMax: {x: 0, y: 0.5}
              m_AnchoredPosition: {x: 25, y: 0}
              m_SizeDelta: {x: 725, y: 125}
              m_Pivot: {x: 0, y: 0.5}
            --- !u!222 &2547694407703838166
            CanvasRenderer:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 1350807268279165822}
              m_CullTransparentMesh: 0
            --- !u!114 &3634482771581527125
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 1350807268279165822}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: 5f7201a12d95ffc409449d95f23cf332, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Material: {fileID: 0}
              m_Color: {r: 1, g: 1, b: 1, a: 1}
              m_RaycastTarget: 0
              m_RaycastPadding: {x: 0, y: 0, z: 0, w: 0}
              m_Maskable: 1
              m_OnCullStateChanged:
                m_PersistentCalls:
                  m_Calls: []
              m_FontData:
                m_Font: {fileID: 10102, guid: 0000000000000000e000000000000000, type: 0}
                m_FontSize: 50
                m_FontStyle: 0
                m_BestFit: 0
                m_MinSize: 0
                m_MaxSize: 50
                m_Alignment: 3
                m_AlignByGeometry: 0
                m_RichText: 1
                m_HorizontalOverflow: 0
                m_VerticalOverflow: 0
                m_LineSpacing: 1
              m_Text: "\\u3010Minecraft\\u53C2\\u52A0\\u578B\\u3011Minecraft\\u9678\\u4E0A\\u3057\\u3088\\u3046\\u3084"
            --- !u!1 &1436876879893927809
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 7115323959217603151}
              - component: {fileID: 3415915959548899205}
              - component: {fileID: 1188342436049883356}
              m_Layer: 0
              m_Name: Description
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &7115323959217603151
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 1436876879893927809}
              m_LocalRotation: {x: 0, y: 0, z: 0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children: []
              m_Father: {fileID: 7350327250546647802}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 0.5}
              m_AnchorMax: {x: 0, y: 0.5}
              m_AnchoredPosition: {x: 25, y: 0}
              m_SizeDelta: {x: 725, y: 125}
              m_Pivot: {x: 0, y: 0.5}
            --- !u!222 &3415915959548899205
            CanvasRenderer:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 1436876879893927809}
              m_CullTransparentMesh: 0
            --- !u!114 &1188342436049883356
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 1436876879893927809}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: 5f7201a12d95ffc409449d95f23cf332, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Material: {fileID: 0}
              m_Color: {r: 1, g: 1, b: 1, a: 1}
              m_RaycastTarget: 0
              m_RaycastPadding: {x: 0, y: 0, z: 0, w: 0}
              m_Maskable: 1
              m_OnCullStateChanged:
                m_PersistentCalls:
                  m_Calls: []
              m_FontData:
                m_Font: {fileID: 10102, guid: 0000000000000000e000000000000000, type: 0}
                m_FontSize: 50
                m_FontStyle: 0
                m_BestFit: 0
                m_MinSize: 0
                m_MaxSize: 50
                m_Alignment: 3
                m_AlignByGeometry: 0
                m_RichText: 1
                m_HorizontalOverflow: 0
                m_VerticalOverflow: 0
                m_LineSpacing: 1
              m_Text: "\\u3010Minecraft (Java / BE)\\u53C2\\u52A0\\u578B\\u3011Minecraft\\u9678\\u4E0A\\u3057\\u3088\\u3046\\u3084"
            --- !u!1 &1649895997715662786
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 6591443197360614477}
              - component: {fileID: 385850373939955680}
              - component: {fileID: 8961922448276309374}
              - component: {fileID: 5878386925961785238}
              m_Layer: 0
              m_Name: Viewport
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &6591443197360614477
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 1649895997715662786}
              m_LocalRotation: {x: -0, y: -0, z: -0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children:
              - {fileID: 3997900497835806772}
              - {fileID: 5301104539563946224}
              m_Father: {fileID: 5356571935761165568}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 0}
              m_AnchorMax: {x: 0, y: 0}
              m_AnchoredPosition: {x: 0, y: 0}
              m_SizeDelta: {x: 0, y: 0}
              m_Pivot: {x: 0, y: 1}
            --- !u!222 &385850373939955680
            CanvasRenderer:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 1649895997715662786}
              m_CullTransparentMesh: 0
            --- !u!114 &8961922448276309374
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 1649895997715662786}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: fe87c0e1cc204ed48ad3b37840f39efc, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Material: {fileID: 0}
              m_Color: {r: 1, g: 1, b: 1, a: 1}
              m_RaycastTarget: 1
              m_RaycastPadding: {x: 0, y: 0, z: 0, w: 0}
              m_Maskable: 1
              m_OnCullStateChanged:
                m_PersistentCalls:
                  m_Calls: []
              m_Sprite: {fileID: 10917, guid: 0000000000000000f000000000000000, type: 0}
              m_Type: 1
              m_PreserveAspect: 0
              m_FillCenter: 1
              m_FillMethod: 4
              m_FillAmount: 1
              m_FillClockwise: 1
              m_FillOrigin: 0
              m_UseSpriteMesh: 0
              m_PixelsPerUnitMultiplier: 1
            --- !u!114 &5878386925961785238
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 1649895997715662786}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: 31a19414c41e5ae4aae2af33fee712f6, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_ShowMaskGraphic: 0
            --- !u!1 &1659247662665942644
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 4055473619923170533}
              - component: {fileID: 2232710657992548686}
              m_Layer: 0
              m_Name: Progress
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &4055473619923170533
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 1659247662665942644}
              m_LocalRotation: {x: 0, y: 0, z: 0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children:
              - {fileID: 4005300115297860886}
              - {fileID: 6732248666137122163}
              m_Father: {fileID: 8813083786143252063}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 0}
              m_AnchorMax: {x: 1, y: 1}
              m_AnchoredPosition: {x: 0, y: 0}
              m_SizeDelta: {x: 0, y: 0}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!114 &2232710657992548686
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 1659247662665942644}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: 67db9e8f0e2ae9c40bc1e2b64352a6b4, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Navigation:
                m_Mode: 3
                m_WrapAround: 0
                m_SelectOnUp: {fileID: 0}
                m_SelectOnDown: {fileID: 0}
                m_SelectOnLeft: {fileID: 0}
                m_SelectOnRight: {fileID: 0}
              m_Transition: 1
              m_Colors:
                m_NormalColor: {r: 1, g: 1, b: 1, a: 1}
                m_HighlightedColor: {r: 0.9607843, g: 0.9607843, b: 0.9607843, a: 1}
                m_PressedColor: {r: 0.78431374, g: 0.78431374, b: 0.78431374, a: 1}
                m_SelectedColor: {r: 0.9607843, g: 0.9607843, b: 0.9607843, a: 1}
                m_DisabledColor: {r: 0.78431374, g: 0.78431374, b: 0.78431374, a: 0.5019608}
                m_ColorMultiplier: 1
                m_FadeDuration: 0.1
              m_SpriteState:
                m_HighlightedSprite: {fileID: 0}
                m_PressedSprite: {fileID: 0}
                m_SelectedSprite: {fileID: 0}
                m_DisabledSprite: {fileID: 0}
              m_AnimationTriggers:
                m_NormalTrigger: Normal
                m_HighlightedTrigger: Highlighted
                m_PressedTrigger: Pressed
                m_SelectedTrigger: Selected
                m_DisabledTrigger: Disabled
              m_Interactable: 1
              m_TargetGraphic: {fileID: 5704945600723577830}
              m_FillRect: {fileID: 411201580317830213}
              m_HandleRect: {fileID: 5106652716670690547}
              m_Direction: 0
              m_MinValue: 0
              m_MaxValue: 1
              m_WholeNumbers: 0
              m_Value: 0
              m_OnValueChanged:
                m_PersistentCalls:
                  m_Calls: []
            --- !u!1 &1693404615616034425
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 8528046028612408863}
              - component: {fileID: 7349138969675378444}
              - component: {fileID: 2827166492462438756}
              m_Layer: 0
              m_Name: Image
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &8528046028612408863
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 1693404615616034425}
              m_LocalRotation: {x: -0, y: -0, z: -0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children: []
              m_Father: {fileID: 674453769890291478}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 0}
              m_AnchorMax: {x: 1, y: 1}
              m_AnchoredPosition: {x: 0, y: 0}
              m_SizeDelta: {x: 0, y: 0}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!222 &7349138969675378444
            CanvasRenderer:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 1693404615616034425}
              m_CullTransparentMesh: 0
            --- !u!114 &2827166492462438756
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 1693404615616034425}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: fe87c0e1cc204ed48ad3b37840f39efc, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Material: {fileID: 0}
              m_Color: {r: 1, g: 1, b: 1, a: 1}
              m_RaycastTarget: 0
              m_RaycastPadding: {x: 0, y: 0, z: 0, w: 0}
              m_Maskable: 1
              m_OnCullStateChanged:
                m_PersistentCalls:
                  m_Calls: []
              m_Sprite: {fileID: 0}
              m_Type: 0
              m_PreserveAspect: 0
              m_FillCenter: 1
              m_FillMethod: 4
              m_FillAmount: 1
              m_FillClockwise: 1
              m_FillOrigin: 0
              m_UseSpriteMesh: 0
              m_PixelsPerUnitMultiplier: 1
            --- !u!1 &1764377442589154741
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 4681215470396742493}
              - component: {fileID: 8364963898074671578}
              - component: {fileID: 9196271115561344518}
              m_Layer: 0
              m_Name: Image
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &4681215470396742493
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 1764377442589154741}
              m_LocalRotation: {x: 0, y: 0, z: 0.395786, w: 0.9183428}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children: []
              m_Father: {fileID: 1908994470860091141}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 46.63}
              m_AnchorMin: {x: 0.5, y: 0.5}
              m_AnchorMax: {x: 0.5, y: 0.5}
              m_AnchoredPosition: {x: 0, y: 0}
              m_SizeDelta: {x: 8.3, y: 89.7}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!222 &8364963898074671578
            CanvasRenderer:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 1764377442589154741}
              m_CullTransparentMesh: 0
            --- !u!114 &9196271115561344518
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 1764377442589154741}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: fe87c0e1cc204ed48ad3b37840f39efc, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Material: {fileID: 0}
              m_Color: {r: 1, g: 1, b: 1, a: 1}
              m_RaycastTarget: 1
              m_RaycastPadding: {x: 0, y: 0, z: 0, w: 0}
              m_Maskable: 1
              m_OnCullStateChanged:
                m_PersistentCalls:
                  m_Calls: []
              m_Sprite: {fileID: 0}
              m_Type: 0
              m_PreserveAspect: 0
              m_FillCenter: 1
              m_FillMethod: 4
              m_FillAmount: 1
              m_FillClockwise: 1
              m_FillOrigin: 0
              m_UseSpriteMesh: 0
              m_PixelsPerUnitMultiplier: 1
            --- !u!1 &1896711803988352197
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 4998853293347282404}
              - component: {fileID: 6616023370850114488}
              - component: {fileID: 7143128325547975264}
              m_Layer: 0
              m_Name: Handle
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &4998853293347282404
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 1896711803988352197}
              m_LocalRotation: {x: -0, y: -0, z: -0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children: []
              m_Father: {fileID: 1319043205087142584}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 0}
              m_AnchorMax: {x: 0, y: 0}
              m_AnchoredPosition: {x: 0, y: 0}
              m_SizeDelta: {x: 20, y: 0}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!222 &6616023370850114488
            CanvasRenderer:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 1896711803988352197}
              m_CullTransparentMesh: 0
            --- !u!114 &7143128325547975264
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 1896711803988352197}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: fe87c0e1cc204ed48ad3b37840f39efc, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Material: {fileID: 0}
              m_Color: {r: 1, g: 1, b: 1, a: 1}
              m_RaycastTarget: 1
              m_RaycastPadding: {x: 0, y: 0, z: 0, w: 0}
              m_Maskable: 1
              m_OnCullStateChanged:
                m_PersistentCalls:
                  m_Calls: []
              m_Sprite: {fileID: 10913, guid: 0000000000000000f000000000000000, type: 0}
              m_Type: 0
              m_PreserveAspect: 0
              m_FillCenter: 1
              m_FillMethod: 4
              m_FillAmount: 1
              m_FillClockwise: 1
              m_FillOrigin: 0
              m_UseSpriteMesh: 0
              m_PixelsPerUnitMultiplier: 1
            --- !u!1 &1947268794603179592
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 1650949901631161606}
              - component: {fileID: 1705060030853267299}
              - component: {fileID: 3412976443463887398}
              m_Layer: 0
              m_Name: Handle
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &1650949901631161606
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 1947268794603179592}
              m_LocalRotation: {x: -0, y: -0, z: -0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children: []
              m_Father: {fileID: 7698234578515271508}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 0}
              m_AnchorMax: {x: 0, y: 0}
              m_AnchoredPosition: {x: 0, y: 0}
              m_SizeDelta: {x: 20, y: 0}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!222 &1705060030853267299
            CanvasRenderer:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 1947268794603179592}
              m_CullTransparentMesh: 0
            --- !u!114 &3412976443463887398
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 1947268794603179592}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: fe87c0e1cc204ed48ad3b37840f39efc, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Material: {fileID: 0}
              m_Color: {r: 1, g: 1, b: 1, a: 1}
              m_RaycastTarget: 1
              m_RaycastPadding: {x: 0, y: 0, z: 0, w: 0}
              m_Maskable: 1
              m_OnCullStateChanged:
                m_PersistentCalls:
                  m_Calls: []
              m_Sprite: {fileID: 10913, guid: 0000000000000000f000000000000000, type: 0}
              m_Type: 0
              m_PreserveAspect: 0
              m_FillCenter: 1
              m_FillMethod: 4
              m_FillAmount: 1
              m_FillClockwise: 1
              m_FillOrigin: 0
              m_UseSpriteMesh: 0
              m_PixelsPerUnitMultiplier: 1
            --- !u!1 &1962725451894953546
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 3997900497835806772}
              - component: {fileID: 6886386432651130119}
              - component: {fileID: 8935356783578542563}
              m_Layer: 0
              m_Name: Content
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &3997900497835806772
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 1962725451894953546}
              m_LocalRotation: {x: -0, y: -0, z: -0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children:
              - {fileID: 7350327250546647802}
              - {fileID: 4403763568550604045}
              - {fileID: 4877450149381548715}
              - {fileID: 8813083786143252063}
              - {fileID: 7857505150913508840}
              m_Father: {fileID: 6591443197360614477}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 1}
              m_AnchorMax: {x: 1, y: 1}
              m_AnchoredPosition: {x: 0, y: 0}
              m_SizeDelta: {x: 0, y: 0}
              m_Pivot: {x: 0, y: 1}
            --- !u!114 &6886386432651130119
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 1962725451894953546}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: 59f8146938fff824cb5fd77236b75775, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Padding:
                m_Left: 25
                m_Right: 0
                m_Top: 25
                m_Bottom: 0
              m_ChildAlignment: 0
              m_Spacing: 10
              m_ChildForceExpandWidth: 1
              m_ChildForceExpandHeight: 1
              m_ChildControlWidth: 0
              m_ChildControlHeight: 0
              m_ChildScaleWidth: 0
              m_ChildScaleHeight: 0
              m_ReverseArrangement: 0
            --- !u!114 &8935356783578542563
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 1962725451894953546}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: 3245ec927659c4140ac4f8d17403cc18, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_HorizontalFit: 0
              m_VerticalFit: 2
            --- !u!1 &1997495293587231526
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 7841409250498791204}
              m_Layer: 0
              m_Name: Fill Area
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &7841409250498791204
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 1997495293587231526}
              m_LocalRotation: {x: -0, y: -0, z: -0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children:
              - {fileID: 8482424852069187971}
              m_Father: {fileID: 3779167788817990329}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 0}
              m_AnchorMax: {x: 1, y: 1}
              m_AnchoredPosition: {x: 0, y: 0}
              m_SizeDelta: {x: -0.00000071525574, y: 0}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!1 &2199194173016630666
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 2895293510163973358}
              - component: {fileID: 4591842227765628389}
              - component: {fileID: 3124411083707249890}
              - component: {fileID: 6585020435475905374}
              m_Layer: 0
              m_Name: Button
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &2895293510163973358
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 2199194173016630666}
              m_LocalRotation: {x: 0, y: 0, z: 0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children: []
              m_Father: {fileID: 1938720740041111393}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 0}
              m_AnchorMax: {x: 1, y: 1}
              m_AnchoredPosition: {x: 0.00018310547, y: 0}
              m_SizeDelta: {x: 0, y: 0}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!222 &4591842227765628389
            CanvasRenderer:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 2199194173016630666}
              m_CullTransparentMesh: 0
            --- !u!114 &3124411083707249890
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 2199194173016630666}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: fe87c0e1cc204ed48ad3b37840f39efc, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Material: {fileID: 0}
              m_Color: {r: 1, g: 1, b: 1, a: 0}
              m_RaycastTarget: 1
              m_RaycastPadding: {x: 0, y: 0, z: 0, w: 0}
              m_Maskable: 1
              m_OnCullStateChanged:
                m_PersistentCalls:
                  m_Calls: []
              m_Sprite: {fileID: 10905, guid: 0000000000000000f000000000000000, type: 0}
              m_Type: 1
              m_PreserveAspect: 0
              m_FillCenter: 1
              m_FillMethod: 4
              m_FillAmount: 1
              m_FillClockwise: 1
              m_FillOrigin: 0
              m_UseSpriteMesh: 0
              m_PixelsPerUnitMultiplier: 1
            --- !u!114 &6585020435475905374
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 2199194173016630666}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: 4e29b1a8efbd4b44bb3f3716e73f07ff, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Navigation:
                m_Mode: 0
                m_WrapAround: 0
                m_SelectOnUp: {fileID: 0}
                m_SelectOnDown: {fileID: 0}
                m_SelectOnLeft: {fileID: 0}
                m_SelectOnRight: {fileID: 0}
              m_Transition: 1
              m_Colors:
                m_NormalColor: {r: 1, g: 1, b: 1, a: 1}
                m_HighlightedColor: {r: 0.9607843, g: 0.9607843, b: 0.9607843, a: 1}
                m_PressedColor: {r: 0.78431374, g: 0.78431374, b: 0.78431374, a: 1}
                m_SelectedColor: {r: 0.9607843, g: 0.9607843, b: 0.9607843, a: 1}
                m_DisabledColor: {r: 0.78431374, g: 0.78431374, b: 0.78431374, a: 0.5019608}
                m_ColorMultiplier: 1
                m_FadeDuration: 0.1
              m_SpriteState:
                m_HighlightedSprite: {fileID: 0}
                m_PressedSprite: {fileID: 0}
                m_SelectedSprite: {fileID: 0}
                m_DisabledSprite: {fileID: 0}
              m_AnimationTriggers:
                m_NormalTrigger: Normal
                m_HighlightedTrigger: Highlighted
                m_PressedTrigger: Pressed
                m_SelectedTrigger: Selected
                m_DisabledTrigger: Disabled
              m_Interactable: 1
              m_TargetGraphic: {fileID: 3124411083707249890}
              m_OnClick:
                m_PersistentCalls:
                  m_Calls:
                  - m_Target: {fileID: 6585020435475905374}
                    m_TargetAssemblyTypeName:\s
                    m_MethodName: set_interactable
                    m_Mode: 6
                    m_Arguments:
                      m_ObjectArgument: {fileID: 0}
                      m_ObjectArgumentAssemblyTypeName: UnityEngine.Object, UnityEngine
                      m_IntArgument: 0
                      m_FloatArgument: 0
                      m_StringArgument:\s
                      m_BoolArgument: 0
                    m_CallState: 2
                  - m_Target: {fileID: 8719620524618765563}
                    m_TargetAssemblyTypeName:\s
                    m_MethodName: SendCustomEvent
                    m_Mode: 5
                    m_Arguments:
                      m_ObjectArgument: {fileID: 0}
                      m_ObjectArgumentAssemblyTypeName: UnityEngine.Object, UnityEngine
                      m_IntArgument: 0
                      m_FloatArgument: 0
                      m_StringArgument: OnPlaylistSelected
                      m_BoolArgument: 0
                    m_CallState: 2
            --- !u!1 &2326644370197190465
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 4514204372773181593}
              - component: {fileID: 6753785635970006697}
              - component: {fileID: 3094376998695782251}
              m_Layer: 0
              m_Name: Text
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &4514204372773181593
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 2326644370197190465}
              m_LocalRotation: {x: -0, y: -0, z: -0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children: []
              m_Father: {fileID: 1375125376929899666}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 0}
              m_AnchorMax: {x: 1, y: 1}
              m_AnchoredPosition: {x: 0, y: 0}
              m_SizeDelta: {x: 0, y: 0}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!222 &6753785635970006697
            CanvasRenderer:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 2326644370197190465}
              m_CullTransparentMesh: 0
            --- !u!114 &3094376998695782251
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 2326644370197190465}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: 5f7201a12d95ffc409449d95f23cf332, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Material: {fileID: 0}
              m_Color: {r: 1, g: 1, b: 1, a: 1}
              m_RaycastTarget: 0
              m_RaycastPadding: {x: 0, y: 0, z: 0, w: 0}
              m_Maskable: 1
              m_OnCullStateChanged:
                m_PersistentCalls:
                  m_Calls: []
              m_FontData:
                m_Font: {fileID: 10102, guid: 0000000000000000e000000000000000, type: 0}
                m_FontSize: 50
                m_FontStyle: 0
                m_BestFit: 0
                m_MinSize: 5
                m_MaxSize: 50
                m_Alignment: 4
                m_AlignByGeometry: 0
                m_RichText: 1
                m_HorizontalOverflow: 0
                m_VerticalOverflow: 0
                m_LineSpacing: 1
              m_Text: ... Locked ...
            --- !u!1 &2417066742020337674
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 4707262690531445138}
              - component: {fileID: 7875430465716093899}
              - component: {fileID: 4553545659087040715}
              m_Layer: 0
              m_Name: Background
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &4707262690531445138
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 2417066742020337674}
              m_LocalRotation: {x: 0, y: 0, z: 0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children: []
              m_Father: {fileID: 1938720740041111393}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 0}
              m_AnchorMax: {x: 1, y: 1}
              m_AnchoredPosition: {x: 0.00018310547, y: 0}
              m_SizeDelta: {x: 0, y: 0}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!222 &7875430465716093899
            CanvasRenderer:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 2417066742020337674}
              m_CullTransparentMesh: 0
            --- !u!114 &4553545659087040715
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 2417066742020337674}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: fe87c0e1cc204ed48ad3b37840f39efc, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Material: {fileID: 0}
              m_Color: {r: 0.23104306, g: 0.27194327, b: 0.41509432, a: 1}
              m_RaycastTarget: 0
              m_RaycastPadding: {x: 0, y: 0, z: 0, w: 0}
              m_Maskable: 1
              m_OnCullStateChanged:
                m_PersistentCalls:
                  m_Calls: []
              m_Sprite: {fileID: 0}
              m_Type: 0
              m_PreserveAspect: 0
              m_FillCenter: 1
              m_FillMethod: 4
              m_FillAmount: 1
              m_FillClockwise: 1
              m_FillOrigin: 0
              m_UseSpriteMesh: 0
              m_PixelsPerUnitMultiplier: 1
            --- !u!1 &2517967665362997687
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 5436379789802263824}
              - component: {fileID: 3849271077191682197}
              - component: {fileID: 4914362879625457859}
              m_Layer: 0
              m_Name: System
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &5436379789802263824
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 2517967665362997687}
              m_LocalRotation: {x: 0, y: 0, z: 0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children: []
              m_Father: {fileID: 2883308272097404143}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0.5, y: 0.5}
              m_AnchorMax: {x: 0.5, y: 0.5}
              m_AnchoredPosition: {x: 0, y: 0}
              m_SizeDelta: {x: 100, y: 100}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!114 &3849271077191682197
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 2517967665362997687}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: af0c4bb60ca44fed8393832db7c4272b, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              serializationData:
                SerializedFormat: 2
                SerializedBytes:\s
                ReferencedUnityObjects: []
                SerializedBytesString:\s
                Prefab: {fileID: 0}
                PrefabModificationsReferencedUnityObjects: []
                PrefabModifications: []
                SerializationNodes: []
              _udonSharpBackingUdonBehaviour: {fileID: 4914362879625457859}
              videoPlayer: {fileID: 0}
              isAutoFill: 1
            --- !u!114 &4914362879625457859
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 2517967665362997687}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: 45115577ef41a5b4ca741ed302693907, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              interactTextPlacement: {fileID: 0}
              interactText: Use
              interactTextGO: {fileID: 0}
              proximity: 2
              SynchronizePosition: 0
              AllowCollisionOwnershipTransfer: 0
              Reliable: 0
              _syncMethod: 0
              serializedProgramAsset: {fileID: 11400000, guid: 7f1450344c0ed8a429d78ca744177360, type: 2}
              programSource: {fileID: 11400000, guid: bf4908b63a99d8e4cac6bc47205c14e1, type: 2}
              serializedPublicVariablesBytesString: Ai8AAAAAATIAAABWAFIAQwAuAFUAZABvAG4ALgBDAG8AbQBtAG8AbgAuAFUAZABvAG4AVgBhAHIAaQBhAGIAbABlAFQAYQBiAGwAZQAsACAAVgBSAEMALgBVAGQAbwBuAC4AQwBvAG0AbQBvAG4AAAAAAAYBAAAAAAAAACcBBAAAAHQAeQBwAGUAAWgAAABTAHkAcwB0AGUAbQAuAEMAbwBsAGwAZQBjAHQAaQBvAG4AcwAuAEcAZQBuAGUAcgBpAGMALgBMAGkAcwB0AGAAMQBbAFsAVgBSAEMALgBVAGQAbwBuAC4AQwBvAG0AbQBvAG4ALgBJAG4AdABlAHIAZgBhAGMAZQBzAC4ASQBVAGQAbwBuAFYAYQByAGkAYQBiAGwAZQAsACAAVgBSAEMALgBVAGQAbwBuAC4AQwBvAG0AbQBvAG4AXQBdACwAIABtAHMAYwBvAHIAbABpAGIAAQEJAAAAVgBhAHIAaQBhAGIAbABlAHMALwEAAAABaAAAAFMAeQBzAHQAZQBtAC4AQwBvAGwAbABlAGMAdABpAG8AbgBzAC4ARwBlAG4AZQByAGkAYwAuAEwAaQBzAHQAYAAxAFsAWwBWAFIAQwAuAFUAZABvAG4ALgBDAG8AbQBtAG8AbgAuAEkAbgB0AGUAcgBmAGEAYwBlAHMALgBJAFUAZABvAG4AVgBhAHIAaQBhAGIAbABlACwAIABWAFIAQwAuAFUAZABvAG4ALgBDAG8AbQBtAG8AbgBdAF0ALAAgAG0AcwBjAG8AcgBsAGkAYgABAAAABgMAAAAAAAAAAi8CAAAAAUsAAABWAFIAQwAuAFUAZABvAG4ALgBDAG8AbQBtAG8AbgAuAFUAZABvAG4AVgBhAHIAaQBhAGIAbABlAGAAMQBbAFsAUwB5AHMAdABlAG0ALgBCAG8AbwBsAGUAYQBuACwAIABtAHMAYwBvAHIAbABpAGIAXQBdACwAIABWAFIAQwAuAFUAZABvAG4ALgBDAG8AbQBtAG8AbgACAAAABgIAAAAAAAAAJwEEAAAAdAB5AHAAZQABFwAAAFMAeQBzAHQAZQBtAC4AUwB0AHIAaQBuAGcALAAgAG0AcwBjAG8AcgBsAGkAYgAnAQoAAABTAHkAbQBiAG8AbABOAGEAbQBlAAEKAAAAaQBzAEEAdQB0AG8ARgBpAGwAbAAnAQQAAAB0AHkAcABlAAEYAAAAUwB5AHMAdABlAG0ALgBCAG8AbwBsAGUAYQBuACwAIABtAHMAYwBvAHIAbABpAGIAKwEFAAAAVgBhAGwAdQBlAAEHBQIvAwAAAAFJAAAAVgBSAEMALgBVAGQAbwBuAC4AQwBvAG0AbQBvAG4ALgBVAGQAbwBuAFYAYQByAGkAYQBiAGwAZQBgADEAWwBbAFMAeQBzAHQAZQBtAC4ASQBuAHQAMwAyACwAIABtAHMAYwBvAHIAbABpAGIAXQBdACwAIABWAFIAQwAuAFUAZABvAG4ALgBDAG8AbQBtAG8AbgADAAAABgIAAAAAAAAAJwEEAAAAdAB5AHAAZQABFwAAAFMAeQBzAHQAZQBtAC4AUwB0AHIAaQBuAGcALAAgAG0AcwBjAG8AcgBsAGkAYgAnAQoAAABTAHkAbQBiAG8AbABOAGEAbQBlAAEfAAAAXwBfAF8AVQBkAG8AbgBTAGgAYQByAHAAQgBlAGgAYQB2AGkAbwB1AHIAVgBlAHIAcwBpAG8AbgBfAF8AXwAnAQQAAAB0AHkAcABlAAEWAAAAUwB5AHMAdABlAG0ALgBJAG4AdAAzADIALAAgAG0AcwBjAG8AcgBsAGkAYgAXAQUAAABWAGEAbAB1AGUAAgAAAAcFAjACAAAABAAAAAYCAAAAAAAAACcBBAAAAHQAeQBwAGUAARcAAABTAHkAcwB0AGUAbQAuAFMAdAByAGkAbgBnACwAIABtAHMAYwBvAHIAbABpAGIAJwEKAAAAUwB5AG0AYgBvAGwATgBhAG0AZQABLgAAAF8AXwBfAFUAZABvAG4AUwBoAGEAcgBwAEIAZQBoAGEAdgBpAG8AdQByAFAAZQByAHMAaQBzAHQARABhAHQAYQBGAHIAbwBtAFUAcABnAHIAYQBkAGUAXwBfAF8AJwEEAAAAdAB5AHAAZQABGAAAAFMAeQBzAHQAZQBtAC4AQgBvAG8AbABlAGEAbgAsACAAbQBzAGMAbwByAGwAaQBiACsBBQAAAFYAYQBsAHUAZQABBwUHBQcF
              publicVariablesUnityEngineObjects: []
              publicVariablesSerializationDataFormat: 0
            --- !u!1 &2563958550180788585
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 5010619252549000481}
              - component: {fileID: 2873774512165787029}
              - component: {fileID: 7921073603713881456}
              m_Layer: 0
              m_Name: KineLVP Playlist
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!4 &5010619252549000481
            Transform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 2563958550180788585}
              serializedVersion: 2
              m_LocalRotation: {x: 0, y: 0, z: 0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children:
              - {fileID: 7970576150017853745}
              m_Father: {fileID: 0}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
            --- !u!114 &2873774512165787029
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 2563958550180788585}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: 94b5abbaa4c742f492d48a8eeec08347, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              videoPlayer: {fileID: 0}
              videoDatas:
              """;

    private final String prefab_video = """
              - title: "#title#"
                description:\s
                url: #url#
                mode: 1
            """;

    private final String prefab_2 = """
              autoPlay: 0
              loop: 0
              isAutoFill: 0
              autoPlayWhenJoin: 0
              nextPlayVideoWhenPlaySelected: 1
              shuffle: 0
              playlistUrl: 
              urlPrefix:\s
              generateInUnity: 1
              showPlaylist: 1
              managePlaylistTabHost: 0
              storePlaylist: 1
            --- !u!114 &7921073603713881456
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 2563958550180788585}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: 6294c9f48e6d474883b21fedb1c89494, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              videoPlayer: {fileID: 0}
              isAutoFill: 0
            --- !u!1 &2566354639536638167
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 1836410200707059922}
              - component: {fileID: 4931993909127125373}
              - component: {fileID: 2524251838457626590}
              m_Layer: 0
              m_Name: PlayImage
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &1836410200707059922
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 2566354639536638167}
              m_LocalRotation: {x: 0, y: 0, z: 0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children: []
              m_Father: {fileID: 4877450149381548715}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 1, y: 0.5}
              m_AnchorMax: {x: 1, y: 0.5}
              m_AnchoredPosition: {x: -25, y: 0}
              m_SizeDelta: {x: 100, y: 100}
              m_Pivot: {x: 1, y: 0.5}
            --- !u!222 &4931993909127125373
            CanvasRenderer:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 2566354639536638167}
              m_CullTransparentMesh: 0
            --- !u!114 &2524251838457626590
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 2566354639536638167}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: fe87c0e1cc204ed48ad3b37840f39efc, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Material: {fileID: 0}
              m_Color: {r: 1, g: 1, b: 1, a: 1}
              m_RaycastTarget: 0
              m_RaycastPadding: {x: 0, y: 0, z: 0, w: 0}
              m_Maskable: 1
              m_OnCullStateChanged:
                m_PersistentCalls:
                  m_Calls: []
              m_Sprite: {fileID: 21300000, guid: 384f822110a9c3944a26b713c6fb2a7d, type: 3}
              m_Type: 0
              m_PreserveAspect: 0
              m_FillCenter: 1
              m_FillMethod: 4
              m_FillAmount: 1
              m_FillClockwise: 1
              m_FillOrigin: 0
              m_UseSpriteMesh: 0
              m_PixelsPerUnitMultiplier: 1
            --- !u!1 &2772093465700216029
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 2603757630081977693}
              - component: {fileID: 828933050099989342}
              - component: {fileID: 3378038253048583744}
              m_Layer: 0
              m_Name: Text
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &2603757630081977693
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 2772093465700216029}
              m_LocalRotation: {x: -0, y: -0, z: -0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children: []
              m_Father: {fileID: 674453769890291478}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 0}
              m_AnchorMax: {x: 1, y: 1}
              m_AnchoredPosition: {x: 0, y: 0}
              m_SizeDelta: {x: 0, y: 0}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!222 &828933050099989342
            CanvasRenderer:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 2772093465700216029}
              m_CullTransparentMesh: 0
            --- !u!114 &3378038253048583744
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 2772093465700216029}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: 5f7201a12d95ffc409449d95f23cf332, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Material: {fileID: 0}
              m_Color: {r: 0.19607843, g: 0.19607843, b: 0.19607843, a: 1}
              m_RaycastTarget: 0
              m_RaycastPadding: {x: 0, y: 0, z: 0, w: 0}
              m_Maskable: 1
              m_OnCullStateChanged:
                m_PersistentCalls:
                  m_Calls: []
              m_FontData:
                m_Font: {fileID: 10102, guid: 0000000000000000e000000000000000, type: 0}
                m_FontSize: 50
                m_FontStyle: 0
                m_BestFit: 0
                m_MinSize: 5
                m_MaxSize: 50
                m_Alignment: 4
                m_AlignByGeometry: 0
                m_RichText: 1
                m_HorizontalOverflow: 0
                m_VerticalOverflow: 0
                m_LineSpacing: 1
              m_Text: ...Disabled...
            --- !u!1 &2866847432113406998
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 2990098242172014402}
              - component: {fileID: 4556744235163992504}
              - component: {fileID: 7158025707508268419}
              m_Layer: 0
              m_Name: lock
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &2990098242172014402
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 2866847432113406998}
              m_LocalRotation: {x: 0, y: 0, z: 0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children:
              - {fileID: 6110203422684783126}
              - {fileID: 1906073152530074906}
              - {fileID: 8754840689110247317}
              - {fileID: 806945380063140495}
              m_Father: {fileID: 1086936176053939974}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 1, y: 1}
              m_AnchorMax: {x: 1, y: 1}
              m_AnchoredPosition: {x: -25, y: -25}
              m_SizeDelta: {x: 100, y: 100}
              m_Pivot: {x: 1, y: 1}
            --- !u!114 &4556744235163992504
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 2866847432113406998}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: 46d9dfaee9d34e6b9b0e5a487cfbd7e7, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              serializationData:
                SerializedFormat: 2
                SerializedBytes:\s
                ReferencedUnityObjects: []
                SerializedBytesString:\s
                Prefab: {fileID: 0}
                PrefabModificationsReferencedUnityObjects: []
                PrefabModifications: []
                SerializationNodes: []
              _udonSharpBackingUdonBehaviour: {fileID: 7158025707508268419}
              videoPlayerUI: {fileID: 3849271077191682197}
              toggleObjects:
              - {fileID: 7004955399733993265}
              - {fileID: 1157229450638566572}
              - {fileID: 6724572083761446768}
              systemObjects:
              - {fileID: 3739617997551883757}
              - {fileID: 386502599852986935}
            --- !u!114 &7158025707508268419
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 2866847432113406998}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: 45115577ef41a5b4ca741ed302693907, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              interactTextPlacement: {fileID: 0}
              interactText: Use
              interactTextGO: {fileID: 0}
              proximity: 2
              SynchronizePosition: 0
              AllowCollisionOwnershipTransfer: 0
              Reliable: 0
              _syncMethod: 0
              serializedProgramAsset: {fileID: 11400000, guid: f6e01976466c4b34ea372bd7bd9aa8c9, type: 2}
              programSource: {fileID: 11400000, guid: 98fe112a7d10d914ba9401fcd100f682, type: 2}
              serializedPublicVariablesBytesString: Ai8AAAAAATIAAABWAFIAQwAuAFUAZABvAG4ALgBDAG8AbQBtAG8AbgAuAFUAZABvAG4AVgBhAHIAaQBhAGIAbABlAFQAYQBiAGwAZQAsACAAVgBSAEMALgBVAGQAbwBuAC4AQwBvAG0AbQBvAG4AAAAAAAYBAAAAAAAAACcBBAAAAHQAeQBwAGUAAWgAAABTAHkAcwB0AGUAbQAuAEMAbwBsAGwAZQBjAHQAaQBvAG4AcwAuAEcAZQBuAGUAcgBpAGMALgBMAGkAcwB0AGAAMQBbAFsAVgBSAEMALgBVAGQAbwBuAC4AQwBvAG0AbQBvAG4ALgBJAG4AdABlAHIAZgBhAGMAZQBzAC4ASQBVAGQAbwBuAFYAYQByAGkAYQBiAGwAZQAsACAAVgBSAEMALgBVAGQAbwBuAC4AQwBvAG0AbQBvAG4AXQBdACwAIABtAHMAYwBvAHIAbABpAGIAAQEJAAAAVgBhAHIAaQBhAGIAbABlAHMALwEAAAABaAAAAFMAeQBzAHQAZQBtAC4AQwBvAGwAbABlAGMAdABpAG8AbgBzAC4ARwBlAG4AZQByAGkAYwAuAEwAaQBzAHQAYAAxAFsAWwBWAFIAQwAuAFUAZABvAG4ALgBDAG8AbQBtAG8AbgAuAEkAbgB0AGUAcgBmAGEAYwBlAHMALgBJAFUAZABvAG4AVgBhAHIAaQBhAGIAbABlACwAIABWAFIAQwAuAFUAZABvAG4ALgBDAG8AbQBtAG8AbgBdAF0ALAAgAG0AcwBjAG8AcgBsAGkAYgABAAAABgUAAAAAAAAAAi8CAAAAAVMAAABWAFIAQwAuAFUAZABvAG4ALgBDAG8AbQBtAG8AbgAuAFUAZABvAG4AVgBhAHIAaQBhAGIAbABlAGAAMQBbAFsAVgBSAEMALgBVAGQAbwBuAC4AVQBkAG8AbgBCAGUAaABhAHYAaQBvAHUAcgAsACAAVgBSAEMALgBVAGQAbwBuAF0AXQAsACAAVgBSAEMALgBVAGQAbwBuAC4AQwBvAG0AbQBvAG4AAgAAAAYCAAAAAAAAACcBBAAAAHQAeQBwAGUAARcAAABTAHkAcwB0AGUAbQAuAFMAdAByAGkAbgBnACwAIABtAHMAYwBvAHIAbABpAGIAJwEKAAAAUwB5AG0AYgBvAGwATgBhAG0AZQABDQAAAHYAaQBkAGUAbwBQAGwAYQB5AGUAcgBVAEkAJwEEAAAAdAB5AHAAZQABIAAAAFYAUgBDAC4AVQBkAG8AbgAuAFUAZABvAG4AQgBlAGgAYQB2AGkAbwB1AHIALAAgAFYAUgBDAC4AVQBkAG8AbgALAQUAAABWAGEAbAB1AGUAAAAAAAcFAi8DAAAAAWMAAABWAFIAQwAuAFUAZABvAG4ALgBDAG8AbQBtAG8AbgAuAFUAZABvAG4AVgBhAHIAaQBhAGIAbABlAGAAMQBbAFsAVQBuAGkAdAB5AEUAbgBnAGkAbgBlAC4ARwBhAG0AZQBPAGIAagBlAGMAdABbAF0ALAAgAFUAbgBpAHQAeQBFAG4AZwBpAG4AZQAuAEMAbwByAGUATQBvAGQAdQBsAGUAXQBdACwAIABWAFIAQwAuAFUAZABvAG4ALgBDAG8AbQBtAG8AbgADAAAABgIAAAAAAAAAJwEEAAAAdAB5AHAAZQABFwAAAFMAeQBzAHQAZQBtAC4AUwB0AHIAaQBuAGcALAAgAG0AcwBjAG8AcgBsAGkAYgAnAQoAAABTAHkAbQBiAG8AbABOAGEAbQBlAAENAAAAdABvAGcAZwBsAGUATwBiAGoAZQBjAHQAcwAnAQQAAAB0AHkAcABlAAEwAAAAVQBuAGkAdAB5AEUAbgBnAGkAbgBlAC4ARwBhAG0AZQBPAGIAagBlAGMAdABbAF0ALAAgAFUAbgBpAHQAeQBFAG4AZwBpAG4AZQAuAEMAbwByAGUATQBvAGQAdQBsAGUAAQEFAAAAVgBhAGwAdQBlAC8EAAAAATAAAABVAG4AaQB0AHkARQBuAGcAaQBuAGUALgBHAGEAbQBlAE8AYgBqAGUAYwB0AFsAXQAsACAAVQBuAGkAdAB5AEUAbgBnAGkAbgBlAC4AQwBvAHIAZQBNAG8AZAB1AGwAZQAEAAAABgMAAAAAAAAADAEAAAAMAgAAAAwDAAAABwUHBQIwAwAAAAUAAAAGAgAAAAAAAAAnAQQAAAB0AHkAcABlAAEXAAAAUwB5AHMAdABlAG0ALgBTAHQAcgBpAG4AZwAsACAAbQBzAGMAbwByAGwAaQBiACcBCgAAAFMAeQBtAGIAbwBsAE4AYQBtAGUAAQ0AAABzAHkAcwB0AGUAbQBPAGIAagBlAGMAdABzACcBBAAAAHQAeQBwAGUAATAAAABVAG4AaQB0AHkARQBuAGcAaQBuAGUALgBHAGEAbQBlAE8AYgBqAGUAYwB0AFsAXQAsACAAVQBuAGkAdAB5AEUAbgBnAGkAbgBlAC4AQwBvAHIAZQBNAG8AZAB1AGwAZQABAQUAAABWAGEAbAB1AGUAMAQAAAAGAAAABgIAAAAAAAAADAQAAAAMBQAAAAcFBwUCLwUAAAABSQAAAFYAUgBDAC4AVQBkAG8AbgAuAEMAbwBtAG0AbwBuAC4AVQBkAG8AbgBWAGEAcgBpAGEAYgBsAGUAYAAxAFsAWwBTAHkAcwB0AGUAbQAuAEkAbgB0ADMAMgAsACAAbQBzAGMAbwByAGwAaQBiAF0AXQAsACAAVgBSAEMALgBVAGQAbwBuAC4AQwBvAG0AbQBvAG4ABwAAAAYCAAAAAAAAACcBBAAAAHQAeQBwAGUAARcAAABTAHkAcwB0AGUAbQAuAFMAdAByAGkAbgBnACwAIABtAHMAYwBvAHIAbABpAGIAJwEKAAAAUwB5AG0AYgBvAGwATgBhAG0AZQABHwAAAF8AXwBfAFUAZABvAG4AUwBoAGEAcgBwAEIAZQBoAGEAdgBpAG8AdQByAFYAZQByAHMAaQBvAG4AXwBfAF8AJwEEAAAAdAB5AHAAZQABFgAAAFMAeQBzAHQAZQBtAC4ASQBuAHQAMwAyACwAIABtAHMAYwBvAHIAbABpAGIAFwEFAAAAVgBhAGwAdQBlAAIAAAAHBQIvBgAAAAFLAAAAVgBSAEMALgBVAGQAbwBuAC4AQwBvAG0AbQBvAG4ALgBVAGQAbwBuAFYAYQByAGkAYQBiAGwAZQBgADEAWwBbAFMAeQBzAHQAZQBtAC4AQgBvAG8AbABlAGEAbgAsACAAbQBzAGMAbwByAGwAaQBiAF0AXQAsACAAVgBSAEMALgBVAGQAbwBuAC4AQwBvAG0AbQBvAG4ACAAAAAYCAAAAAAAAACcBBAAAAHQAeQBwAGUAARcAAABTAHkAcwB0AGUAbQAuAFMAdAByAGkAbgBnACwAIABtAHMAYwBvAHIAbABpAGIAJwEKAAAAUwB5AG0AYgBvAGwATgBhAG0AZQABLgAAAF8AXwBfAFUAZABvAG4AUwBoAGEAcgBwAEIAZQBoAGEAdgBpAG8AdQByAFAAZQByAHMAaQBzAHQARABhAHQAYQBGAHIAbwBtAFUAcABnAHIAYQBkAGUAXwBfAF8AJwEEAAAAdAB5AHAAZQABGAAAAFMAeQBzAHQAZQBtAC4AQgBvAG8AbABlAGEAbgAsACAAbQBzAGMAbwByAGwAaQBiACsBBQAAAFYAYQBsAHUAZQABBwUHBQcF
              publicVariablesUnityEngineObjects:
              - {fileID: 4914362879625457859}
              - {fileID: 7004955399733993265}
              - {fileID: 1157229450638566572}
              - {fileID: 6724572083761446768}
              - {fileID: 3739617997551883757}
              - {fileID: 386502599852986935}
              publicVariablesSerializationDataFormat: 0
            --- !u!1 &2881313480914839250
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 6732248666137122163}
              m_Layer: 0
              m_Name: Handle Slide Area
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 0
            --- !u!224 &6732248666137122163
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 2881313480914839250}
              m_LocalRotation: {x: -0, y: -0, z: -0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children:
              - {fileID: 5106652716670690547}
              m_Father: {fileID: 4055473619923170533}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 0}
              m_AnchorMax: {x: 1, y: 1}
              m_AnchoredPosition: {x: 0, y: 0}
              m_SizeDelta: {x: -20, y: 0}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!1 &2937611909740886695
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 7769247004390636069}
              - component: {fileID: 3982409175100637830}
              - component: {fileID: 7841837285380418395}
              m_Layer: 0
              m_Name: Background
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &7769247004390636069
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 2937611909740886695}
              m_LocalRotation: {x: 0, y: 0, z: 0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children: []
              m_Father: {fileID: 7350327250546647802}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 0}
              m_AnchorMax: {x: 1, y: 1}
              m_AnchoredPosition: {x: 0.00018310547, y: 0}
              m_SizeDelta: {x: 0, y: 0}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!222 &3982409175100637830
            CanvasRenderer:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 2937611909740886695}
              m_CullTransparentMesh: 0
            --- !u!114 &7841837285380418395
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 2937611909740886695}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: fe87c0e1cc204ed48ad3b37840f39efc, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Material: {fileID: 0}
              m_Color: {r: 0.23104306, g: 0.27194327, b: 0.41509432, a: 1}
              m_RaycastTarget: 0
              m_RaycastPadding: {x: 0, y: 0, z: 0, w: 0}
              m_Maskable: 1
              m_OnCullStateChanged:
                m_PersistentCalls:
                  m_Calls: []
              m_Sprite: {fileID: 0}
              m_Type: 0
              m_PreserveAspect: 0
              m_FillCenter: 1
              m_FillMethod: 4
              m_FillAmount: 1
              m_FillClockwise: 1
              m_FillOrigin: 0
              m_UseSpriteMesh: 0
              m_PixelsPerUnitMultiplier: 1
            --- !u!1 &3116425259845058175
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 1908994470860091141}
              - component: {fileID: 3748158874985455578}
              - component: {fileID: 813475200610363849}
              m_Layer: 0
              m_Name: Image
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &1908994470860091141
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 3116425259845058175}
              m_LocalRotation: {x: 0, y: 0, z: 0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children:
              - {fileID: 4681215470396742493}
              m_Father: {fileID: 8339394409783589667}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 0}
              m_AnchorMax: {x: 1, y: 1}
              m_AnchoredPosition: {x: 0, y: 0}
              m_SizeDelta: {x: -30, y: -30}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!222 &3748158874985455578
            CanvasRenderer:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 3116425259845058175}
              m_CullTransparentMesh: 0
            --- !u!114 &813475200610363849
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 3116425259845058175}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: fe87c0e1cc204ed48ad3b37840f39efc, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Material: {fileID: 0}
              m_Color: {r: 1, g: 1, b: 1, a: 1}
              m_RaycastTarget: 1
              m_RaycastPadding: {x: 0, y: 0, z: 0, w: 0}
              m_Maskable: 1
              m_OnCullStateChanged:
                m_PersistentCalls:
                  m_Calls: []
              m_Sprite: {fileID: 21300000, guid: 34daf3fdc6656ca49948076a3963f45b, type: 3}
              m_Type: 0
              m_PreserveAspect: 0
              m_FillCenter: 1
              m_FillMethod: 4
              m_FillAmount: 1
              m_FillClockwise: 1
              m_FillOrigin: 0
              m_UseSpriteMesh: 0
              m_PixelsPerUnitMultiplier: 1
            --- !u!1 &3139137707168394071
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 806945380063140495}
              - component: {fileID: 1395817362788820368}
              - component: {fileID: 2104003116350423204}
              - component: {fileID: 3519580011589814769}
              m_Layer: 0
              m_Name: Dummy
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &806945380063140495
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 3139137707168394071}
              m_LocalRotation: {x: -0, y: -0, z: -0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children: []
              m_Father: {fileID: 2990098242172014402}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 0}
              m_AnchorMax: {x: 1, y: 1}
              m_AnchoredPosition: {x: 0, y: 0}
              m_SizeDelta: {x: 0, y: 0.0000038146973}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!222 &1395817362788820368
            CanvasRenderer:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 3139137707168394071}
              m_CullTransparentMesh: 0
            --- !u!114 &2104003116350423204
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 3139137707168394071}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: fe87c0e1cc204ed48ad3b37840f39efc, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Material: {fileID: 0}
              m_Color: {r: 1, g: 1, b: 1, a: 0}
              m_RaycastTarget: 1
              m_RaycastPadding: {x: 0, y: 0, z: 0, w: 0}
              m_Maskable: 1
              m_OnCullStateChanged:
                m_PersistentCalls:
                  m_Calls: []
              m_Sprite: {fileID: 0}
              m_Type: 0
              m_PreserveAspect: 0
              m_FillCenter: 1
              m_FillMethod: 4
              m_FillAmount: 1
              m_FillClockwise: 1
              m_FillOrigin: 0
              m_UseSpriteMesh: 0
              m_PixelsPerUnitMultiplier: 1
            --- !u!114 &3519580011589814769
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 3139137707168394071}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: 4e29b1a8efbd4b44bb3f3716e73f07ff, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Navigation:
                m_Mode: 0
                m_WrapAround: 0
                m_SelectOnUp: {fileID: 0}
                m_SelectOnDown: {fileID: 0}
                m_SelectOnLeft: {fileID: 0}
                m_SelectOnRight: {fileID: 0}
              m_Transition: 1
              m_Colors:
                m_NormalColor: {r: 1, g: 1, b: 1, a: 1}
                m_HighlightedColor: {r: 0.9607843, g: 0.9607843, b: 0.9607843, a: 1}
                m_PressedColor: {r: 0.78431374, g: 0.78431374, b: 0.78431374, a: 1}
                m_SelectedColor: {r: 0.9607843, g: 0.9607843, b: 0.9607843, a: 1}
                m_DisabledColor: {r: 0.78431374, g: 0.78431374, b: 0.78431374, a: 0.5019608}
                m_ColorMultiplier: 1
                m_FadeDuration: 0.1
              m_SpriteState:
                m_HighlightedSprite: {fileID: 0}
                m_PressedSprite: {fileID: 0}
                m_SelectedSprite: {fileID: 0}
                m_DisabledSprite: {fileID: 0}
              m_AnimationTriggers:
                m_NormalTrigger: Normal
                m_HighlightedTrigger: Highlighted
                m_PressedTrigger: Pressed
                m_SelectedTrigger: Selected
                m_DisabledTrigger: Disabled
              m_Interactable: 1
              m_TargetGraphic: {fileID: 2104003116350423204}
              m_OnClick:
                m_PersistentCalls:
                  m_Calls:
                  - m_Target: {fileID: 7158025707508268419}
                    m_TargetAssemblyTypeName:\s
                    m_MethodName: SendCustomEvent
                    m_Mode: 5
                    m_Arguments:
                      m_ObjectArgument: {fileID: 0}
                      m_ObjectArgumentAssemblyTypeName: UnityEngine.Object, UnityEngine
                      m_IntArgument: 0
                      m_FloatArgument: 0
                      m_StringArgument: ToggleLock
                      m_BoolArgument: 0
                    m_CallState: 2
            --- !u!1 &3202652318530468862
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 76702301997625104}
              m_Layer: 0
              m_Name: Handle Slide Area
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 0
            --- !u!224 &76702301997625104
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 3202652318530468862}
              m_LocalRotation: {x: -0, y: -0, z: -0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children:
              - {fileID: 8016748804206962951}
              m_Father: {fileID: 3779167788817990329}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 0}
              m_AnchorMax: {x: 1, y: 1}
              m_AnchoredPosition: {x: 0, y: 0}
              m_SizeDelta: {x: -20, y: 0}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!1 &3274506387764981190
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 8813083786143252063}
              - component: {fileID: 2779852069500918067}
              m_Layer: 0
              m_Name: Video (3)
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &8813083786143252063
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 3274506387764981190}
              m_LocalRotation: {x: 0, y: 0, z: 0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children:
              - {fileID: 76667822655870186}
              - {fileID: 4055473619923170533}
              - {fileID: 6643050093449108454}
              - {fileID: 8403582124714262575}
              - {fileID: 8746414208319405268}
              - {fileID: 9105384691081664240}
              m_Father: {fileID: 3997900497835806772}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 0}
              m_AnchorMax: {x: 0, y: 0}
              m_AnchoredPosition: {x: 0, y: 0}
              m_SizeDelta: {x: 875, y: 125}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!114 &2779852069500918067
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 3274506387764981190}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: 306cc8c2b49d7114eaa3623786fc2126, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_IgnoreLayout: 0
              m_MinWidth: -1
              m_MinHeight: -1
              m_PreferredWidth: -1
              m_PreferredHeight: -1
              m_FlexibleWidth: -1
              m_FlexibleHeight: -1
              m_LayoutPriority: 1
            --- !u!1 &3291372248163297839
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 8482424852069187971}
              - component: {fileID: 5368840619287426100}
              - component: {fileID: 6353473347398277959}
              m_Layer: 0
              m_Name: Fill
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &8482424852069187971
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 3291372248163297839}
              m_LocalRotation: {x: -0, y: -0, z: -0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children: []
              m_Father: {fileID: 7841409250498791204}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 0}
              m_AnchorMax: {x: 0, y: 1}
              m_AnchoredPosition: {x: 0, y: 0}
              m_SizeDelta: {x: 0, y: 0}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!222 &5368840619287426100
            CanvasRenderer:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 3291372248163297839}
              m_CullTransparentMesh: 0
            --- !u!114 &6353473347398277959
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 3291372248163297839}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: fe87c0e1cc204ed48ad3b37840f39efc, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Material: {fileID: 0}
              m_Color: {r: 0.0627451, g: 0.08627451, b: 0.16862746, a: 1}
              m_RaycastTarget: 1
              m_RaycastPadding: {x: 0, y: 0, z: 0, w: 0}
              m_Maskable: 1
              m_OnCullStateChanged:
                m_PersistentCalls:
                  m_Calls: []
              m_Sprite: {fileID: 0}
              m_Type: 1
              m_PreserveAspect: 0
              m_FillCenter: 1
              m_FillMethod: 4
              m_FillAmount: 1
              m_FillClockwise: 1
              m_FillOrigin: 0
              m_UseSpriteMesh: 0
              m_PixelsPerUnitMultiplier: 1
            --- !u!1 &3455292410079802661
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 1449591656158215384}
              - component: {fileID: 7259282102877791987}
              - component: {fileID: 97074621684597973}
              m_Layer: 0
              m_Name: Handle
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &1449591656158215384
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 3455292410079802661}
              m_LocalRotation: {x: -0, y: -0, z: -0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children: []
              m_Father: {fileID: 8833518044024487041}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 0}
              m_AnchorMax: {x: 0, y: 0}
              m_AnchoredPosition: {x: 0, y: 0}
              m_SizeDelta: {x: 20, y: 20}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!222 &7259282102877791987
            CanvasRenderer:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 3455292410079802661}
              m_CullTransparentMesh: 0
            --- !u!114 &97074621684597973
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 3455292410079802661}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: fe87c0e1cc204ed48ad3b37840f39efc, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Material: {fileID: 0}
              m_Color: {r: 0, g: 0.28627452, b: 0.40784317, a: 1}
              m_RaycastTarget: 1
              m_RaycastPadding: {x: 0, y: 0, z: 0, w: 0}
              m_Maskable: 1
              m_OnCullStateChanged:
                m_PersistentCalls:
                  m_Calls: []
              m_Sprite: {fileID: 21300000, guid: 5be00597f9fe8ce46bac60f9477d9d6e, type: 3}
              m_Type: 1
              m_PreserveAspect: 0
              m_FillCenter: 1
              m_FillMethod: 4
              m_FillAmount: 1
              m_FillClockwise: 1
              m_FillOrigin: 0
              m_UseSpriteMesh: 0
              m_PixelsPerUnitMultiplier: 20
            --- !u!1 &3476648857731306301
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 3919897665625198716}
              - component: {fileID: 5136147108679151419}
              - component: {fileID: 3615045570182390787}
              m_Layer: 0
              m_Name: Fill
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &3919897665625198716
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 3476648857731306301}
              m_LocalRotation: {x: -0, y: -0, z: -0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children: []
              m_Father: {fileID: 2430640025230488314}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 0}
              m_AnchorMax: {x: 0, y: 0}
              m_AnchoredPosition: {x: 0, y: 0}
              m_SizeDelta: {x: 0, y: 0}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!222 &5136147108679151419
            CanvasRenderer:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 3476648857731306301}
              m_CullTransparentMesh: 0
            --- !u!114 &3615045570182390787
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 3476648857731306301}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: fe87c0e1cc204ed48ad3b37840f39efc, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Material: {fileID: 0}
              m_Color: {r: 0.0627451, g: 0.08627451, b: 0.16862746, a: 1}
              m_RaycastTarget: 1
              m_RaycastPadding: {x: 0, y: 0, z: 0, w: 0}
              m_Maskable: 1
              m_OnCullStateChanged:
                m_PersistentCalls:
                  m_Calls: []
              m_Sprite: {fileID: 0}
              m_Type: 1
              m_PreserveAspect: 0
              m_FillCenter: 1
              m_FillMethod: 4
              m_FillAmount: 1
              m_FillClockwise: 1
              m_FillOrigin: 0
              m_UseSpriteMesh: 0
              m_PixelsPerUnitMultiplier: 1
            --- !u!1 &3500051394907107235
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 5970753678236335850}
              - component: {fileID: 2730566741119728019}
              - component: {fileID: 7963745576615468604}
              m_Layer: 0
              m_Name: Fill
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &5970753678236335850
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 3500051394907107235}
              m_LocalRotation: {x: -0, y: -0, z: -0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children: []
              m_Father: {fileID: 7486548024163598367}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 0}
              m_AnchorMax: {x: 0, y: 0}
              m_AnchoredPosition: {x: 0, y: 0}
              m_SizeDelta: {x: 0, y: 0}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!222 &2730566741119728019
            CanvasRenderer:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 3500051394907107235}
              m_CullTransparentMesh: 0
            --- !u!114 &7963745576615468604
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 3500051394907107235}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: fe87c0e1cc204ed48ad3b37840f39efc, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Material: {fileID: 0}
              m_Color: {r: 0.0627451, g: 0.08627451, b: 0.16862746, a: 1}
              m_RaycastTarget: 1
              m_RaycastPadding: {x: 0, y: 0, z: 0, w: 0}
              m_Maskable: 1
              m_OnCullStateChanged:
                m_PersistentCalls:
                  m_Calls: []
              m_Sprite: {fileID: 0}
              m_Type: 1
              m_PreserveAspect: 0
              """;
    private final String prefab_2_1 = """
              m_FillCenter: 1
              m_FillMethod: 4
              m_FillAmount: 1
              m_FillClockwise: 1
              m_FillOrigin: 0
              m_UseSpriteMesh: 0
              m_PixelsPerUnitMultiplier: 1
            --- !u!1 &3722256195177243377
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 184951645298031073}
              m_Layer: 0
              m_Name: MessageUI
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &184951645298031073
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 3722256195177243377}
              m_LocalRotation: {x: -0, y: -0, z: -0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children:
              - {fileID: 7497332400807042825}
              - {fileID: 1375125376929899666}
              - {fileID: 2168552727934459005}
              - {fileID: 674453769890291478}
              m_Father: {fileID: 8444635903433234331}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 0}
              m_AnchorMax: {x: 1, y: 1}
              m_AnchoredPosition: {x: 0.00024414062, y: 0.00012207031}
              m_SizeDelta: {x: 0, y: -0.00012207031}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!1 &3739617997551883757
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 1906073152530074906}
              - component: {fileID: 7590995945329656300}
              - component: {fileID: 7773634963848393131}
              m_Layer: 0
              m_Name: lockImage
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 0
            --- !u!224 &1906073152530074906
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 3739617997551883757}
              m_LocalRotation: {x: -0, y: -0, z: -0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children: []
              m_Father: {fileID: 2990098242172014402}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 0}
              m_AnchorMax: {x: 1, y: 1}
              m_AnchoredPosition: {x: 0, y: 0}
              m_SizeDelta: {x: -30, y: -30}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!222 &7590995945329656300
            CanvasRenderer:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 3739617997551883757}
              m_CullTransparentMesh: 0
            --- !u!114 &7773634963848393131
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 3739617997551883757}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: fe87c0e1cc204ed48ad3b37840f39efc, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Material: {fileID: 0}
              m_Color: {r: 1, g: 1, b: 1, a: 1}
              m_RaycastTarget: 1
              m_RaycastPadding: {x: 0, y: 0, z: 0, w: 0}
              m_Maskable: 1
              m_OnCullStateChanged:
                m_PersistentCalls:
                  m_Calls: []
              m_Sprite: {fileID: 21300000, guid: 7e43403724c03dd49879348ab1d34a31, type: 3}
              m_Type: 0
              m_PreserveAspect: 0
              m_FillCenter: 1
              m_FillMethod: 4
              m_FillAmount: 1
              m_FillClockwise: 1
              m_FillOrigin: 0
              m_UseSpriteMesh: 0
              m_PixelsPerUnitMultiplier: 1
            --- !u!1 &3812105449825328701
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 5645916161197877870}
              m_Layer: 0
              m_Name: Icon
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &5645916161197877870
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 3812105449825328701}
              m_LocalRotation: {x: 0, y: 0, z: 0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children:
              - {fileID: 1508111442938310388}
              m_Father: {fileID: 1086936176053939974}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 1, y: 1}
              m_AnchorMax: {x: 1, y: 1}
              m_AnchoredPosition: {x: -150, y: -150}
              m_SizeDelta: {x: 100, y: 100}
              m_Pivot: {x: 1, y: 1}
            --- !u!1 &3933144954800323045
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 4444550017958704606}
              - component: {fileID: 8275629108272094844}
              - component: {fileID: 2857364764849777586}
              m_Layer: 0
              m_Name: Icon
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &4444550017958704606
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 3933144954800323045}
              m_LocalRotation: {x: -0, y: -0, z: -0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: -0.099999994}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children: []
              m_Father: {fileID: 1375125376929899666}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0.5, y: 0.5}
              m_AnchorMax: {x: 0.5, y: 0.5}
              m_AnchoredPosition: {x: -0, y: 200}
              m_SizeDelta: {x: 200, y: 200}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!222 &8275629108272094844
            CanvasRenderer:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 3933144954800323045}
              m_CullTransparentMesh: 0
            --- !u!114 &2857364764849777586
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 3933144954800323045}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: fe87c0e1cc204ed48ad3b37840f39efc, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Material: {fileID: 0}
              m_Color: {r: 1, g: 1, b: 1, a: 1}
              m_RaycastTarget: 0
              m_RaycastPadding: {x: 0, y: 0, z: 0, w: 0}
              m_Maskable: 1
              m_OnCullStateChanged:
                m_PersistentCalls:
                  m_Calls: []
              m_Sprite: {fileID: 21300000, guid: 1757ad854354b8e4681c38cfe1e728a4, type: 3}
              m_Type: 0
              m_PreserveAspect: 0
              m_FillCenter: 1
              m_FillMethod: 4
              m_FillAmount: 1
              m_FillClockwise: 1
              m_FillOrigin: 0
              m_UseSpriteMesh: 0
              m_PixelsPerUnitMultiplier: 1
            --- !u!1 &4058891119454003404
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 718746110113320476}
              - component: {fileID: 7506621381516566742}
              - component: {fileID: 3377978730778659180}
              - component: {fileID: 3297263263445716233}
              m_Layer: 0
              m_Name: Button
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &718746110113320476
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 4058891119454003404}
              m_LocalRotation: {x: 0, y: 0, z: 0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children: []
              m_Father: {fileID: 4403763568550604045}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 0}
              m_AnchorMax: {x: 1, y: 1}
              m_AnchoredPosition: {x: 0.00018310547, y: 0}
              m_SizeDelta: {x: 0, y: 0}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!222 &7506621381516566742
            CanvasRenderer:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 4058891119454003404}
              m_CullTransparentMesh: 0
            --- !u!114 &3377978730778659180
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 4058891119454003404}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: fe87c0e1cc204ed48ad3b37840f39efc, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Material: {fileID: 0}
              m_Color: {r: 1, g: 1, b: 1, a: 0}
              m_RaycastTarget: 1
              m_RaycastPadding: {x: 0, y: 0, z: 0, w: 0}
              m_Maskable: 1
              m_OnCullStateChanged:
                m_PersistentCalls:
                  m_Calls: []
              m_Sprite: {fileID: 10905, guid: 0000000000000000f000000000000000, type: 0}
              m_Type: 1
              m_PreserveAspect: 0
              m_FillCenter: 1
              m_FillMethod: 4
              m_FillAmount: 1
              m_FillClockwise: 1
              m_FillOrigin: 0
              m_UseSpriteMesh: 0
              m_PixelsPerUnitMultiplier: 1
            --- !u!114 &3297263263445716233
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 4058891119454003404}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: 4e29b1a8efbd4b44bb3f3716e73f07ff, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Navigation:
                m_Mode: 0
                m_WrapAround: 0
                m_SelectOnUp: {fileID: 0}
                m_SelectOnDown: {fileID: 0}
                m_SelectOnLeft: {fileID: 0}
                m_SelectOnRight: {fileID: 0}
              m_Transition: 1
              m_Colors:
                m_NormalColor: {r: 1, g: 1, b: 1, a: 1}
                m_HighlightedColor: {r: 0.9607843, g: 0.9607843, b: 0.9607843, a: 1}
                m_PressedColor: {r: 0.78431374, g: 0.78431374, b: 0.78431374, a: 1}
                m_SelectedColor: {r: 0.9607843, g: 0.9607843, b: 0.9607843, a: 1}
                m_DisabledColor: {r: 0.78431374, g: 0.78431374, b: 0.78431374, a: 0.5019608}
                m_ColorMultiplier: 1
                m_FadeDuration: 0.1
              m_SpriteState:
                m_HighlightedSprite: {fileID: 0}
                m_PressedSprite: {fileID: 0}
                m_SelectedSprite: {fileID: 0}
                m_DisabledSprite: {fileID: 0}
              m_AnimationTriggers:
                m_NormalTrigger: Normal
                m_HighlightedTrigger: Highlighted
                m_PressedTrigger: Pressed
                m_SelectedTrigger: Selected
                m_DisabledTrigger: Disabled
              m_Interactable: 1
              m_TargetGraphic: {fileID: 3377978730778659180}
              m_OnClick:
                m_PersistentCalls:
                  m_Calls:
                  - m_Target: {fileID: 3297263263445716233}
                    m_TargetAssemblyTypeName:\s
                    m_MethodName: set_interactable
                    m_Mode: 6
                    m_Arguments:
                      m_ObjectArgument: {fileID: 0}
                      m_ObjectArgumentAssemblyTypeName: UnityEngine.Object, UnityEngine
                      m_IntArgument: 0
                      m_FloatArgument: 0
                      m_StringArgument:\s
                      m_BoolArgument: 0
                    m_CallState: 2
                  - m_Target: {fileID: 8719620524618765563}
                    m_TargetAssemblyTypeName:\s
                    m_MethodName: SendCustomEvent
                    m_Mode: 5
                    m_Arguments:
                      m_ObjectArgument: {fileID: 0}
                      m_ObjectArgumentAssemblyTypeName: UnityEngine.Object, UnityEngine
                      m_IntArgument: 0
                      m_FloatArgument: 0
                      m_StringArgument: OnPlaylistSelected
                      m_BoolArgument: 0
                    m_CallState: 2
            --- !u!1 &4063088987278272425
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 5186669144474402630}
              - component: {fileID: 8989753784552132081}
              - component: {fileID: 7142693324616886422}
              m_Layer: 0
              m_Name: Icon
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &5186669144474402630
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 4063088987278272425}
              m_LocalRotation: {x: -0, y: -0, z: -0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: -0.099999994}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children: []
              m_Father: {fileID: 7497332400807042825}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0.5, y: 0.5}
              m_AnchorMax: {x: 0.5, y: 0.5}
              m_AnchoredPosition: {x: -0, y: 200}
              m_SizeDelta: {x: 200, y: 200}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!222 &8989753784552132081
            CanvasRenderer:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 4063088987278272425}
              m_CullTransparentMesh: 0
            --- !u!114 &7142693324616886422
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 4063088987278272425}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: fe87c0e1cc204ed48ad3b37840f39efc, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Material: {fileID: 0}
              m_Color: {r: 0.050980393, g: 0.08627451, b: 0.16470589, a: 1}
              m_RaycastTarget: 0
              m_RaycastPadding: {x: 0, y: 0, z: 0, w: 0}
              m_Maskable: 1
              m_OnCullStateChanged:
                m_PersistentCalls:
                  m_Calls: []
              m_Sprite: {fileID: 21300000, guid: 1757ad854354b8e4681c38cfe1e728a4, type: 3}
              m_Type: 0
              m_PreserveAspect: 0
              m_FillCenter: 1
              m_FillMethod: 4
              m_FillAmount: 1
              m_FillClockwise: 1
              m_FillOrigin: 0
              m_UseSpriteMesh: 0
              m_PixelsPerUnitMultiplier: 1
            --- !u!1 &4357342531741967211
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 874414378428698362}
              - component: {fileID: 8332797772410067784}
              - component: {fileID: 5856933755908496821}
              m_Layer: 0
              m_Name: Fill
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &874414378428698362
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 4357342531741967211}
              m_LocalRotation: {x: -0, y: -0, z: -0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children: []
              m_Father: {fileID: 1912877932582853322}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 0}
              m_AnchorMax: {x: 0, y: 0}
              m_AnchoredPosition: {x: 0, y: 0}
              m_SizeDelta: {x: 0, y: 0}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!222 &8332797772410067784
            CanvasRenderer:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 4357342531741967211}
              m_CullTransparentMesh: 0
            --- !u!114 &5856933755908496821
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 4357342531741967211}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: fe87c0e1cc204ed48ad3b37840f39efc, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Material: {fileID: 0}
              m_Color: {r: 0.0627451, g: 0.08627451, b: 0.16862746, a: 1}
              m_RaycastTarget: 1
              m_RaycastPadding: {x: 0, y: 0, z: 0, w: 0}
              m_Maskable: 1
              m_OnCullStateChanged:
                m_PersistentCalls:
                  m_Calls: []
              m_Sprite: {fileID: 0}
              m_Type: 1
              m_PreserveAspect: 0
              m_FillCenter: 1
              m_FillMethod: 4
              m_FillAmount: 1
              m_FillClockwise: 1
              m_FillOrigin: 0
              m_UseSpriteMesh: 0
              m_PixelsPerUnitMultiplier: 1
            --- !u!1 &4410792401457620465
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 1511648965919563059}
              - component: {fileID: 4126281824602465665}
              - component: {fileID: 6416579807603935745}
              - component: {fileID: 844196808056124636}
              m_Layer: 0
              m_Name: Scrollbar Vertical
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &1511648965919563059
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 4410792401457620465}
              m_LocalRotation: {x: -0, y: -0, z: -0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children:
              - {fileID: 8833518044024487041}
              m_Father: {fileID: 5356571935761165568}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 1, y: 0}
              m_AnchorMax: {x: 1, y: 1}
              m_AnchoredPosition: {x: 0, y: 0}
              m_SizeDelta: {x: 35, y: 0}
              m_Pivot: {x: 1, y: 1}
            --- !u!222 &4126281824602465665
            CanvasRenderer:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 4410792401457620465}
              m_CullTransparentMesh: 0
            --- !u!114 &6416579807603935745
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 4410792401457620465}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: fe87c0e1cc204ed48ad3b37840f39efc, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Material: {fileID: 0}
              m_Color: {r: 1, g: 1, b: 1, a: 1}
              m_RaycastTarget: 1
              m_RaycastPadding: {x: 0, y: 0, z: 0, w: 0}
              m_Maskable: 1
              m_OnCullStateChanged:
                m_PersistentCalls:
                  m_Calls: []
              m_Sprite: {fileID: 21300000, guid: 5be00597f9fe8ce46bac60f9477d9d6e, type: 3}
              m_Type: 1
              m_PreserveAspect: 0
              m_FillCenter: 1
              m_FillMethod: 4
              m_FillAmount: 1
              m_FillClockwise: 1
              m_FillOrigin: 0
              m_UseSpriteMesh: 0
              m_PixelsPerUnitMultiplier: 40
            --- !u!114 &844196808056124636
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 4410792401457620465}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: 2a4db7a114972834c8e4117be1d82ba3, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Navigation:
                m_Mode: 0
                m_WrapAround: 0
                m_SelectOnUp: {fileID: 0}
                m_SelectOnDown: {fileID: 0}
                m_SelectOnLeft: {fileID: 0}
                m_SelectOnRight: {fileID: 0}
              m_Transition: 1
              m_Colors:
                m_NormalColor: {r: 1, g: 1, b: 1, a: 1}
                m_HighlightedColor: {r: 0.9607843, g: 0.9607843, b: 0.9607843, a: 1}
                m_PressedColor: {r: 0.78431374, g: 0.78431374, b: 0.78431374, a: 1}
                m_SelectedColor: {r: 0.9607843, g: 0.9607843, b: 0.9607843, a: 1}
                m_DisabledColor: {r: 0.78431374, g: 0.78431374, b: 0.78431374, a: 0.5019608}
                m_ColorMultiplier: 1
                m_FadeDuration: 0.1
              m_SpriteState:
                m_HighlightedSprite: {fileID: 0}
                m_PressedSprite: {fileID: 0}
                m_SelectedSprite: {fileID: 0}
                m_DisabledSprite: {fileID: 0}
              m_AnimationTriggers:
                m_NormalTrigger: Normal
                m_HighlightedTrigger: Highlighted
                m_PressedTrigger: Pressed
                m_SelectedTrigger: Selected
                m_DisabledTrigger: Disabled
              m_Interactable: 1
              m_TargetGraphic: {fileID: 97074621684597973}
              m_HandleRect: {fileID: 1449591656158215384}
              m_Direction: 2
              m_Value: 0
              m_Size: 1
              m_NumberOfSteps: 0
              m_OnValueChanged:
                m_PersistentCalls:
                  m_Calls: []
            --- !u!1 &4521297134368707600
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 4587917408688845233}
              - component: {fileID: 266398029809423018}
              - component: {fileID: 6673011779619146176}
              m_Layer: 0
              m_Name: Stop
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 0
            --- !u!224 &4587917408688845233
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 4521297134368707600}
              m_LocalRotation: {x: -0, y: -0, z: -0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children: []
              m_Father: {fileID: 6731035202408777031}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 0}
              m_AnchorMax: {x: 1, y: 1}
              m_AnchoredPosition: {x: 0, y: 0}
              m_SizeDelta: {x: -30, y: -30}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!222 &266398029809423018
            CanvasRenderer:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 4521297134368707600}
              m_CullTransparentMesh: 0
            --- !u!114 &6673011779619146176
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 4521297134368707600}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: fe87c0e1cc204ed48ad3b37840f39efc, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Material: {fileID: 0}
              m_Color: {r: 1, g: 1, b: 1, a: 1}
              m_RaycastTarget: 1
              m_RaycastPadding: {x: 0, y: 0, z: 0, w: 0}
              m_Maskable: 1
              m_OnCullStateChanged:
                m_PersistentCalls:
                  m_Calls: []
              m_Sprite: {fileID: 21300000, guid: c1707bcd4dbe37942ab534eb2b6bef0a, type: 3}
              m_Type: 0
              m_PreserveAspect: 0
              m_FillCenter: 1
              m_FillMethod: 4
              m_FillAmount: 1
              m_FillClockwise: 1
              m_FillOrigin: 0
              m_UseSpriteMesh: 0
              m_PixelsPerUnitMultiplier: 1
            --- !u!1 &4560045639819606296
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 7970576150017853745}
              - component: {fileID: 3961623450929242295}
              - component: {fileID: 8719620524618765563}
              m_Layer: 0
              m_Name: KVPPlaylist
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!4 &7970576150017853745
            Transform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 4560045639819606296}
              serializedVersion: 2
              m_LocalRotation: {x: 0, y: 0, z: 0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children:
              - {fileID: 2883308272097404143}
              m_Father: {fileID: 5010619252549000481}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
            --- !u!114 &3961623450929242295
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 4560045639819606296}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: b40f94225585c6f4298074becd84fc73, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              serializationData:
                SerializedFormat: 2
                SerializedBytes:\s
                ReferencedUnityObjects: []
                SerializedBytesString:\s
                Prefab: {fileID: 0}
                PrefabModificationsReferencedUnityObjects: []
                PrefabModifications: []
                SerializationNodes: []
              _udonSharpBackingUdonBehaviour: {fileID: 8719620524618765563}
              videoPlayer: {fileID: 0}
              content: {fileID: 3997900497835806772}
              loadingCover: {fileID: 7864960810768174480}
              disableCover: {fileID: 8033742630075709174}
              playlistInternalName:\s
              titles:
              """;
    private final String prefab_video_titles = "              - \"#title#\"";
    private final String prefab_2_2 = "              urls:";
    private final String prefab_video_urls = "              - url: #url#";
    private final String prefab_video_mode = "              playMode: ";
    private final String prefab_2_3 = """    
              autoPlayWhenJoin: 0
              nextPlayVideoWhenPlaySelected: 1
              shuffle: 0
              loopMode: 0
            --- !u!114 &8719620524618765563
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 4560045639819606296}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: 45115577ef41a5b4ca741ed302693907, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              interactTextPlacement: {fileID: 0}
              interactText: Use
              interactTextGO: {fileID: 0}
              proximity: 2
              SynchronizePosition: 0
              AllowCollisionOwnershipTransfer: 0
              Reliable: 0
              _syncMethod: 3
              serializedProgramAsset: {fileID: 11400000, guid: 680ec88529240e64bb2497fbde658594, type: 2}
              programSource: {fileID: 11400000, guid: adce6451ee45ebd42965525104f4a941, type: 2}
              serializedPublicVariablesBytesString: Ai8AAAAAATIAAABWAFIAQwAuAFUAZABvAG4ALgBDAG8AbQBtAG8AbgAuAFUAZABvAG4AVgBhAHIAaQBhAGIAbABlAFQAYQBiAGwAZQAsACAAVgBSAEMALgBVAGQAbwBuAC4AQwBvAG0AbQBvAG4AAAAAAAYBAAAAAAAAACcBBAAAAHQAeQBwAGUAAWgAAABTAHkAcwB0AGUAbQAuAEMAbwBsAGwAZQBjAHQAaQBvAG4AcwAuAEcAZQBuAGUAcgBpAGMALgBMAGkAcwB0AGAAMQBbAFsAVgBSAEMALgBVAGQAbwBuAC4AQwBvAG0AbQBvAG4ALgBJAG4AdABlAHIAZgBhAGMAZQBzAC4ASQBVAGQAbwBuAFYAYQByAGkAYQBiAGwAZQAsACAAVgBSAEMALgBVAGQAbwBuAC4AQwBvAG0AbQBvAG4AXQBdACwAIABtAHMAYwBvAHIAbABpAGIAAQEJAAAAVgBhAHIAaQBhAGIAbABlAHMALwEAAAABaAAAAFMAeQBzAHQAZQBtAC4AQwBvAGwAbABlAGMAdABpAG8AbgBzAC4ARwBlAG4AZQByAGkAYwAuAEwAaQBzAHQAYAAxAFsAWwBWAFIAQwAuAFUAZABvAG4ALgBDAG8AbQBtAG8AbgAuAEkAbgB0AGUAcgBmAGEAYwBlAHMALgBJAFUAZABvAG4AVgBhAHIAaQBhAGIAbABlACwAIABWAFIAQwAuAFUAZABvAG4ALgBDAG8AbQBtAG8AbgBdAF0ALAAgAG0AcwBjAG8AcgBsAGkAYgABAAAABg0AAAAAAAAAAi8CAAAAAWQAAABWAFIAQwAuAFUAZABvAG4ALgBDAG8AbQBtAG8AbgAuAFUAZABvAG4AVgBhAHIAaQBhAGIAbABlAGAAMQBbAFsAVQBuAGkAdAB5AEUAbgBnAGkAbgBlAC4AUgBlAGMAdABUAHIAYQBuAHMAZgBvAHIAbQAsACAAVQBuAGkAdAB5AEUAbgBnAGkAbgBlAC4AQwBvAHIAZQBNAG8AZAB1AGwAZQBdAF0ALAAgAFYAUgBDAC4AVQBkAG8AbgAuAEMAbwBtAG0AbwBuAAIAAAAGAgAAAAAAAAAnAQQAAAB0AHkAcABlAAEXAAAAUwB5AHMAdABlAG0ALgBTAHQAcgBpAG4AZwAsACAAbQBzAGMAbwByAGwAaQBiACcBCgAAAFMAeQBtAGIAbwBsAE4AYQBtAGUAAQcAAABjAG8AbgB0AGUAbgB0ACcBBAAAAHQAeQBwAGUAATEAAABVAG4AaQB0AHkARQBuAGcAaQBuAGUALgBSAGUAYwB0AFQAcgBhAG4AcwBmAG8AcgBtACwAIABVAG4AaQB0AHkARQBuAGcAaQBuAGUALgBDAG8AcgBlAE0AbwBkAHUAbABlAAsBBQAAAFYAYQBsAHUAZQAAAAAABwUCLwMAAAABTAAAAFYAUgBDAC4AVQBkAG8AbgAuAEMAbwBtAG0AbwBuAC4AVQBkAG8AbgBWAGEAcgBpAGEAYgBsAGUAYAAxAFsAWwBTAHkAcwB0AGUAbQAuAFMAdAByAGkAbgBnAFsAXQAsACAAbQBzAGMAbwByAGwAaQBiAF0AXQAsACAAVgBSAEMALgBVAGQAbwBuAC4AQwBvAG0AbQBvAG4AAwAAAAYCAAAAAAAAACcBBAAAAHQAeQBwAGUAARcAAABTAHkAcwB0AGUAbQAuAFMAdAByAGkAbgBnACwAIABtAHMAYwBvAHIAbABpAGIAJwEKAAAAUwB5AG0AYgBvAGwATgBhAG0AZQABBgAAAHQAaQB0AGwAZQBzACcBBAAAAHQAeQBwAGUAARkAAABTAHkAcwB0AGUAbQAuAFMAdAByAGkAbgBnAFsAXQAsACAAbQBzAGMAbwByAGwAaQBiAAEBBQAAAFYAYQBsAHUAZQAvBAAAAAEZAAAAUwB5AHMAdABlAG0ALgBTAHQAcgBpAG4AZwBbAF0ALAAgAG0AcwBjAG8AcgBsAGkAYgAEAAAABgUAAAAAAAAAKAEpAAAAEDBNAGkAbgBlAGMAcgBhAGYAdAAgACgASgBhAHYAYQAgAC8AIABCAEUAKQDCU6BSi1cRME0AaQBuAGUAYwByAGEAZgB0AHiWCk5XMIgwRjCEMCgBKQAAABAwTQBpAG4AZQBjAHIAYQBmAHQAIAAoAEoAYQB2AGEAIAAvACAAQgBFACkAwlOgUotXETBNAGkAbgBlAGMAcgBhAGYAdAB4lgpOVzCIMEYwhDAoASkAAAAQME0AaQBuAGUAYwByAGEAZgB0ACAAKABKAGEAdgBhACAALwAgAEIARQApAMJToFKLVxEwTQBpAG4AZQBjAHIAYQBmAHQAeJYKTlcwiDBGMIQwKAEdAAAAEDBNAGkAbgBlAGMAcgBhAGYAdADCU6BSi1cRME0AaQBuAGUAYwByAGEAZgB0AHiWCk5XMIgwRjCEMCgBHQAAABAwTQBpAG4AZQBjAHIAYQBmAHQAwlOgUotXETBNAGkAbgBlAGMAcgBhAGYAdAB4lgpOVzCIMEYwhDAHBQcFAi8FAAAAAVMAAABWAFIAQwAuAFUAZABvAG4ALgBDAG8AbQBtAG8AbgAuAFUAZABvAG4AVgBhAHIAaQBhAGIAbABlAGAAMQBbAFsAVgBSAEMALgBTAEQASwBCAGEAcwBlAC4AVgBSAEMAVQByAGwAWwBdACwAIABWAFIAQwBTAEQASwBCAGEAcwBlAF0AXQAsACAAVgBSAEMALgBVAGQAbwBuAC4AQwBvAG0AbQBvAG4ABQAAAAYCAAAAAAAAACcBBAAAAHQAeQBwAGUAARcAAABTAHkAcwB0AGUAbQAuAFMAdAByAGkAbgBnACwAIABtAHMAYwBvAHIAbABpAGIAJwEKAAAAUwB5AG0AYgBvAGwATgBhAG0AZQABBAAAAHUAcgBsAHMAJwEEAAAAdAB5AHAAZQABIAAAAFYAUgBDAC4AUwBEAEsAQgBhAHMAZQAuAFYAUgBDAFUAcgBsAFsAXQAsACAAVgBSAEMAUwBEAEsAQgBhAHMAZQABAQUAAABWAGEAbAB1AGUALwYAAAABIAAAAFYAUgBDAC4AUwBEAEsAQgBhAHMAZQAuAFYAUgBDAFUAcgBsAFsAXQAsACAAVgBSAEMAUwBEAEsAQgBhAHMAZQAGAAAABgUAAAAAAAAAAi8HAAAAAR4AAABWAFIAQwAuAFMARABLAEIAYQBzAGUALgBWAFIAQwBVAHIAbAAsACAAVgBSAEMAUwBEAEsAQgBhAHMAZQAHAAAAJwEDAAAAdQByAGwAARwAAABoAHQAdABwAHMAOgAvAC8AeQBvAHUAdAB1AC4AYgBlAC8AdABNAHYAQwA4AEkAcABqAF8AZwB3AAUCMAcAAAAIAAAAJwEDAAAAdQByAGwAARwAAABoAHQAdABwAHMAOgAvAC8AeQBvAHUAdAB1AC4AYgBlAC8AcQBJAGUAWgBHAGoASABrAEcANwBrAAUCMAcAAAAJAAAAJwEDAAAAdQByAGwAARwAAABoAHQAdABwAHMAOgAvAC8AeQBvAHUAdAB1AC4AYgBlAC8ARQByAFUAdABNAHYATgBWAGgAbwBnAAUCMAcAAAAKAAAAJwEDAAAAdQByAGwAARwAAABoAHQAdABwAHMAOgAvAC8AeQBvAHUAdAB1AC4AYgBlAC8ARABFAEkAYwB6ADQASQA2AFkATgBNAAUCMAcAAAALAAAAJwEDAAAAdQByAGwAARwAAABoAHQAdABwAHMAOgAvAC8AeQBvAHUAdAB1AC4AYgBlAC8AbABYAFQATgBQAFIATgBzAHMAeQB3AAUHBQcFAi8IAAAAAUsAAABWAFIAQwAuAFUAZABvAG4ALgBDAG8AbQBtAG8AbgAuAFUAZABvAG4AVgBhAHIAaQBhAGIAbABlAGAAMQBbAFsAUwB5AHMAdABlAG0ALgBJAG4AdAAzADIAWwBdACwAIABtAHMAYwBvAHIAbABpAGIAXQBdACwAIABWAFIAQwAuAFUAZABvAG4ALgBDAG8AbQBtAG8AbgAMAAAABgIAAAAAAAAAJwEEAAAAdAB5AHAAZQABFwAAAFMAeQBzAHQAZQBtAC4AUwB0AHIAaQBuAGcALAAgAG0AcwBjAG8AcgBsAGkAYgAnAQoAAABTAHkAbQBiAG8AbABOAGEAbQBlAAEIAAAAcABsAGEAeQBNAG8AZABlACcBBAAAAHQAeQBwAGUAARgAAABTAHkAcwB0AGUAbQAuAEkAbgB0ADMAMgBbAF0ALAAgAG0AcwBjAG8AcgBsAGkAYgABAQUAAABWAGEAbAB1AGUALwkAAAABGAAAAFMAeQBzAHQAZQBtAC4ASQBuAHQAMwAyAFsAXQAsACAAbQBzAGMAbwByAGwAaQBiAA0AAAAIBQAAAAQAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAUHBQIvCgAAAAFJAAAAVgBSAEMALgBVAGQAbwBuAC4AQwBvAG0AbQBvAG4ALgBVAGQAbwBuAFYAYQByAGkAYQBiAGwAZQBgADEAWwBbAFMAeQBzAHQAZQBtAC4ASQBuAHQAMwAyACwAIABtAHMAYwBvAHIAbABpAGIAXQBdACwAIABWAFIAQwAuAFUAZABvAG4ALgBDAG8AbQBtAG8AbgAOAAAABgIAAAAAAAAAJwEEAAAAdAB5AHAAZQABFwAAAFMAeQBzAHQAZQBtAC4AUwB0AHIAaQBuAGcALAAgAG0AcwBjAG8AcgBsAGkAYgAnAQoAAABTAHkAbQBiAG8AbABOAGEAbQBlAAEIAAAAbABvAG8AcABNAG8AZABlACcBBAAAAHQAeQBwAGUAARYAAABTAHkAcwB0AGUAbQAuAEkAbgB0ADMAMgAsACAAbQBzAGMAbwByAGwAaQBiABcBBQAAAFYAYQBsAHUAZQAAAAAABwUCLwsAAAABYQAAAFYAUgBDAC4AVQBkAG8AbgAuAEMAbwBtAG0AbwBuAC4AVQBkAG8AbgBWAGEAcgBpAGEAYgBsAGUAYAAxAFsAWwBVAG4AaQB0AHkARQBuAGcAaQBuAGUALgBHAGEAbQBlAE8AYgBqAGUAYwB0ACwAIABVAG4AaQB0AHkARQBuAGcAaQBuAGUALgBDAG8AcgBlAE0AbwBkAHUAbABlAF0AXQAsACAAVgBSAEMALgBVAGQAbwBuAC4AQwBvAG0AbQBvAG4ADwAAAAYCAAAAAAAAACcBBAAAAHQAeQBwAGUAARcAAABTAHkAcwB0AGUAbQAuAFMAdAByAGkAbgBnACwAIABtAHMAYwBvAHIAbABpAGIAJwEKAAAAUwB5AG0AYgBvAGwATgBhAG0AZQABDAAAAGwAbwBhAGQAaQBuAGcAQwBvAHYAZQByACcBBAAAAHQAeQBwAGUAAS4AAABVAG4AaQB0AHkARQBuAGcAaQBuAGUALgBHAGEAbQBlAE8AYgBqAGUAYwB0ACwAIABVAG4AaQB0AHkARQBuAGcAaQBuAGUALgBDAG8AcgBlAE0AbwBkAHUAbABlAAsBBQAAAFYAYQBsAHUAZQABAAAABwUCLwwAAAABSgAAAFYAUgBDAC4AVQBkAG8AbgAuAEMAbwBtAG0AbwBuAC4AVQBkAG8AbgBWAGEAcgBpAGEAYgBsAGUAYAAxAFsAWwBTAHkAcwB0AGUAbQAuAFMAdAByAGkAbgBnACwAIABtAHMAYwBvAHIAbABpAGIAXQBdACwAIABWAFIAQwAuAFUAZABvAG4ALgBDAG8AbQBtAG8AbgAQAAAABgIAAAAAAAAAJwEEAAAAdAB5AHAAZQABFwAAAFMAeQBzAHQAZQBtAC4AUwB0AHIAaQBuAGcALAAgAG0AcwBjAG8AcgBsAGkAYgAnAQoAAABTAHkAbQBiAG8AbABOAGEAbQBlAAEUAAAAcABsAGEAeQBsAGkAcwB0AEkAbgB0AGUAcgBuAGEAbABOAGEAbQBlACcBBAAAAHQAeQBwAGUAARcAAABTAHkAcwB0AGUAbQAuAFMAdAByAGkAbgBnACwAIABtAHMAYwBvAHIAbABpAGIAJwEFAAAAVgBhAGwAdQBlAAEAAAAABwUCMAsAAAARAAAABgIAAAAAAAAAJwEEAAAAdAB5AHAAZQABFwAAAFMAeQBzAHQAZQBtAC4AUwB0AHIAaQBuAGcALAAgAG0AcwBjAG8AcgBsAGkAYgAnAQoAAABTAHkAbQBiAG8AbABOAGEAbQBlAAEMAAAAZABpAHMAYQBiAGwAZQBDAG8AdgBlAHIAJwEEAAAAdAB5AHAAZQABLgAAAFUAbgBpAHQAeQBFAG4AZwBpAG4AZQAuAEcAYQBtAGUATwBiAGoAZQBjAHQALAAgAFUAbgBpAHQAeQBFAG4AZwBpAG4AZQAuAEMAbwByAGUATQBvAGQAdQBsAGUACwEFAAAAVgBhAGwAdQBlAAIAAAAHBQIvDQAAAAFLAAAAVgBSAEMALgBVAGQAbwBuAC4AQwBvAG0AbQBvAG4ALgBVAGQAbwBuAFYAYQByAGkAYQBiAGwAZQBgADEAWwBbAFMAeQBzAHQAZQBtAC4AQgBvAG8AbABlAGEAbgAsACAAbQBzAGMAbwByAGwAaQBiAF0AXQAsACAAVgBSAEMALgBVAGQAbwBuAC4AQwBvAG0AbQBvAG4AEgAAAAYCAAAAAAAAACcBBAAAAHQAeQBwAGUAARcAAABTAHkAcwB0AGUAbQAuAFMAdAByAGkAbgBnACwAIABtAHMAYwBvAHIAbABpAGIAJwEKAAAAUwB5AG0AYgBvAGwATgBhAG0AZQABEAAAAGEAdQB0AG8AUABsAGEAeQBXAGgAZQBuAEoAbwBpAG4AJwEEAAAAdAB5AHAAZQABGAAAAFMAeQBzAHQAZQBtAC4AQgBvAG8AbABlAGEAbgAsACAAbQBzAGMAbwByAGwAaQBiACsBBQAAAFYAYQBsAHUAZQAABwUCMA0AAAATAAAABgIAAAAAAAAAJwEEAAAAdAB5AHAAZQABFwAAAFMAeQBzAHQAZQBtAC4AUwB0AHIAaQBuAGcALAAgAG0AcwBjAG8AcgBsAGkAYgAnAQoAAABTAHkAbQBiAG8AbABOAGEAbQBlAAEdAAAAbgBlAHgAdABQAGwAYQB5AFYAaQBkAGUAbwBXAGgAZQBuAFAAbABhAHkAUwBlAGwAZQBjAHQAZQBkACcBBAAAAHQAeQBwAGUAARgAAABTAHkAcwB0AGUAbQAuAEIAbwBvAGwAZQBhAG4ALAAgAG0AcwBjAG8AcgBsAGkAYgArAQUAAABWAGEAbAB1AGUAAQcFAjANAAAAFAAAAAYCAAAAAAAAACcBBAAAAHQAeQBwAGUAARcAAABTAHkAcwB0AGUAbQAuAFMAdAByAGkAbgBnACwAIABtAHMAYwBvAHIAbABpAGIAJwEKAAAAUwB5AG0AYgBvAGwATgBhAG0AZQABBwAAAHMAaAB1AGYAZgBsAGUAJwEEAAAAdAB5AHAAZQABGAAAAFMAeQBzAHQAZQBtAC4AQgBvAG8AbABlAGEAbgAsACAAbQBzAGMAbwByAGwAaQBiACsBBQAAAFYAYQBsAHUAZQAABwUCMAoAAAAVAAAABgIAAAAAAAAAJwEEAAAAdAB5AHAAZQABFwAAAFMAeQBzAHQAZQBtAC4AUwB0AHIAaQBuAGcALAAgAG0AcwBjAG8AcgBsAGkAYgAnAQoAAABTAHkAbQBiAG8AbABOAGEAbQBlAAEfAAAAXwBfAF8AVQBkAG8AbgBTAGgAYQByAHAAQgBlAGgAYQB2AGkAbwB1AHIAVgBlAHIAcwBpAG8AbgBfAF8AXwAnAQQAAAB0AHkAcABlAAEWAAAAUwB5AHMAdABlAG0ALgBJAG4AdAAzADIALAAgAG0AcwBjAG8AcgBsAGkAYgAXAQUAAABWAGEAbAB1AGUAAgAAAAcFAjANAAAAFgAAAAYCAAAAAAAAACcBBAAAAHQAeQBwAGUAARcAAABTAHkAcwB0AGUAbQAuAFMAdAByAGkAbgBnACwAIABtAHMAYwBvAHIAbABpAGIAJwEKAAAAUwB5AG0AYgBvAGwATgBhAG0AZQABLgAAAF8AXwBfAFUAZABvAG4AUwBoAGEAcgBwAEIAZQBoAGEAdgBpAG8AdQByAFAAZQByAHMAaQBzAHQARABhAHQAYQBGAHIAbwBtAFUAcABnAHIAYQBkAGUAXwBfAF8AJwEEAAAAdAB5AHAAZQABGAAAAFMAeQBzAHQAZQBtAC4AQgBvAG8AbABlAGEAbgAsACAAbQBzAGMAbwByAGwAaQBiACsBBQAAAFYAYQBsAHUAZQABBwUHBQcF
              publicVariablesUnityEngineObjects:
              - {fileID: 3997900497835806772}
              - {fileID: 7864960810768174480}
              - {fileID: 8033742630075709174}
              publicVariablesSerializationDataFormat: 0
            --- !u!1 &4616011101538473808
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 5380793082397304821}
              - component: {fileID: 320626207587602271}
              - component: {fileID: 6999568570251501913}
              m_Layer: 0
              m_Name: Description
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &5380793082397304821
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 4616011101538473808}
              m_LocalRotation: {x: 0, y: 0, z: 0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children: []
              m_Father: {fileID: 1938720740041111393}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 0.5}
              m_AnchorMax: {x: 0, y: 0.5}
              m_AnchoredPosition: {x: 25, y: 0}
              m_SizeDelta: {x: 725, y: 125}
              m_Pivot: {x: 0, y: 0.5}
            --- !u!222 &320626207587602271
            CanvasRenderer:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 4616011101538473808}
              m_CullTransparentMesh: 0
            --- !u!114 &6999568570251501913
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 4616011101538473808}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: 5f7201a12d95ffc409449d95f23cf332, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Material: {fileID: 0}
              m_Color: {r: 1, g: 1, b: 1, a: 1}
              m_RaycastTarget: 0
              m_RaycastPadding: {x: 0, y: 0, z: 0, w: 0}
              m_Maskable: 1
              m_OnCullStateChanged:
                m_PersistentCalls:
                  m_Calls: []
              m_FontData:
                m_Font: {fileID: 10102, guid: 0000000000000000e000000000000000, type: 0}
                m_FontSize: 50
                m_FontStyle: 0
                m_BestFit: 0
                m_MinSize: 0
                m_MaxSize: 50
                m_Alignment: 3
                m_AlignByGeometry: 0
                m_RichText: 1
                m_HorizontalOverflow: 0
                m_VerticalOverflow: 0
                m_LineSpacing: 1
              m_Text:\s
            --- !u!1 &4664303488795546268
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 4305859099649409165}
              - component: {fileID: 3507111942734476737}
              - component: {fileID: 5631469011014088347}
              m_Layer: 0
              m_Name: Border
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &4305859099649409165
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 4664303488795546268}
              m_LocalRotation: {x: 0, y: 0, z: 0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children: []
              m_Father: {fileID: 7350327250546647802}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 0}
              m_AnchorMax: {x: 1, y: 1}
              m_AnchoredPosition: {x: 0.00018310547, y: 0}
              m_SizeDelta: {x: 0, y: 0}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!222 &3507111942734476737
            CanvasRenderer:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 4664303488795546268}
              m_CullTransparentMesh: 0
            --- !u!114 &5631469011014088347
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 4664303488795546268}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: fe87c0e1cc204ed48ad3b37840f39efc, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Material: {fileID: 0}
              m_Color: {r: 1, g: 1, b: 1, a: 1}
              m_RaycastTarget: 0
              m_RaycastPadding: {x: 0, y: 0, z: 0, w: 0}
              m_Maskable: 1
              m_OnCullStateChanged:
                m_PersistentCalls:
                  m_Calls: []
              m_Sprite: {fileID: 21300000, guid: 216faa4d4dd65394b93796bbe0a64e9d, type: 3}
              m_Type: 1
              m_PreserveAspect: 0
              m_FillCenter: 1
              m_FillMethod: 4
              m_FillAmount: 1
              m_FillClockwise: 1
              m_FillOrigin: 0
              m_UseSpriteMesh: 0
              m_PixelsPerUnitMultiplier: 100
            --- !u!1 &4895856706254827895
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 2818530194814354777}
              - component: {fileID: 2683115984870148572}
              - component: {fileID: 970711425986953629}
              m_Layer: 0
              m_Name: Description
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &2818530194814354777
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 4895856706254827895}
              m_LocalRotation: {x: 0, y: 0, z: 0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children: []
              m_Father: {fileID: 7857505150913508840}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 0.5}
              m_AnchorMax: {x: 0, y: 0.5}
              m_AnchoredPosition: {x: 25, y: 0}
              m_SizeDelta: {x: 725, y: 125}
              m_Pivot: {x: 0, y: 0.5}
            --- !u!222 &2683115984870148572
            CanvasRenderer:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 4895856706254827895}
              m_CullTransparentMesh: 0
            --- !u!114 &970711425986953629
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 4895856706254827895}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: 5f7201a12d95ffc409449d95f23cf332, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Material: {fileID: 0}
              m_Color: {r: 1, g: 1, b: 1, a: 1}
              m_RaycastTarget: 0
              m_RaycastPadding: {x: 0, y: 0, z: 0, w: 0}
              m_Maskable: 1
              m_OnCullStateChanged:
                m_PersistentCalls:
                  m_Calls: []
              m_FontData:
                m_Font: {fileID: 10102, guid: 0000000000000000e000000000000000, type: 0}
                m_FontSize: 50
                m_FontStyle: 0
                m_BestFit: 0
                m_MinSize: 0
                m_MaxSize: 50
                m_Alignment: 3
                m_AlignByGeometry: 0
                m_RichText: 1
                m_HorizontalOverflow: 0
                m_VerticalOverflow: 0
                m_LineSpacing: 1
              m_Text: "\\u3010Minecraft\\u53C2\\u52A0\\u578B\\u3011Minecraft\\u9678\\u4E0A\\u3057\\u3088\\u3046\\u3084"
            --- !u!1 &4974071523935894039
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 4877450149381548715}
              - component: {fileID: 6157624140584131379}
              m_Layer: 0
              m_Name: Video (2)
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &4877450149381548715
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 4974071523935894039}
              m_LocalRotation: {x: 0, y: 0, z: 0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children:
              - {fileID: 1743315764444932805}
              - {fileID: 5200865148158758191}
              - {fileID: 8456134673103193863}
              - {fileID: 1836410200707059922}
              - {fileID: 778957084648160671}
              - {fileID: 1733542278166623911}
              m_Father: {fileID: 3997900497835806772}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 0}
              m_AnchorMax: {x: 0, y: 0}
              m_AnchoredPosition: {x: 0, y: 0}
              m_SizeDelta: {x: 875, y: 125}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!114 &6157624140584131379
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 4974071523935894039}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: 306cc8c2b49d7114eaa3623786fc2126, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_IgnoreLayout: 0
              m_MinWidth: -1
              m_MinHeight: -1
              m_PreferredWidth: -1
              m_PreferredHeight: -1
              m_FlexibleWidth: -1
              m_FlexibleHeight: -1
              m_LayoutPriority: 1
            --- !u!1 &5007205712070639573
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 1938720740041111393}
              - component: {fileID: 7520062776300684233}
              m_Layer: 0
              m_Name: PlaylistItem
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 0
            --- !u!224 &1938720740041111393
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 5007205712070639573}
              m_LocalRotation: {x: -0, y: -0, z: -0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children:
              - {fileID: 4707262690531445138}
              - {fileID: 3779167788817990329}
              - {fileID: 8439251724805581055}
              - {fileID: 696003539343156857}
              - {fileID: 5380793082397304821}
              - {fileID: 2895293510163973358}
              m_Father: {fileID: 5301104539563946224}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 1}
              m_AnchorMax: {x: 0, y: 1}
              m_AnchoredPosition: {x: 462.5, y: -87.5}
              m_SizeDelta: {x: 875, y: 125}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!114 &7520062776300684233
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 5007205712070639573}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: 306cc8c2b49d7114eaa3623786fc2126, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_IgnoreLayout: 0
              m_MinWidth: -1
              m_MinHeight: -1
              m_PreferredWidth: -1
              m_PreferredHeight: -1
              m_FlexibleWidth: -1
              m_FlexibleHeight: -1
              m_LayoutPriority: 1
            --- !u!1 &5037685725240679197
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 1743315764444932805}
              - component: {fileID: 707290416035602678}
              - component: {fileID: 4967770039774431454}
              m_Layer: 0
              m_Name: Background
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &1743315764444932805
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 5037685725240679197}
              m_LocalRotation: {x: 0, y: 0, z: 0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children: []
              m_Father: {fileID: 4877450149381548715}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 0}
              m_AnchorMax: {x: 1, y: 1}
              m_AnchoredPosition: {x: 0.00018310547, y: 0}
              m_SizeDelta: {x: 0, y: 0}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!222 &707290416035602678
            CanvasRenderer:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 5037685725240679197}
              m_CullTransparentMesh: 0
            --- !u!114 &4967770039774431454
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 5037685725240679197}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: fe87c0e1cc204ed48ad3b37840f39efc, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Material: {fileID: 0}
              m_Color: {r: 0.23104306, g: 0.27194327, b: 0.41509432, a: 1}
              m_RaycastTarget: 0
              m_RaycastPadding: {x: 0, y: 0, z: 0, w: 0}
              m_Maskable: 1
              m_OnCullStateChanged:
                m_PersistentCalls:
                  m_Calls: []
              m_Sprite: {fileID: 0}
              m_Type: 0
              """;
    private final String prefab_3 = """
              m_PreserveAspect: 0
              m_FillCenter: 1
              m_FillMethod: 4
              m_FillAmount: 1
              m_FillClockwise: 1
              m_FillOrigin: 0
              m_UseSpriteMesh: 0
              m_PixelsPerUnitMultiplier: 1
            --- !u!1 &5133223902000085260
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 411201580317830213}
              - component: {fileID: 4363683878733905882}
              - component: {fileID: 1302492273629706641}
              m_Layer: 0
              m_Name: Fill
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &411201580317830213
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 5133223902000085260}
              m_LocalRotation: {x: -0, y: -0, z: -0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children: []
              m_Father: {fileID: 4005300115297860886}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 0}
              m_AnchorMax: {x: 0, y: 0}
              m_AnchoredPosition: {x: 0, y: 0}
              m_SizeDelta: {x: 0, y: 0}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!222 &4363683878733905882
            CanvasRenderer:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 5133223902000085260}
              m_CullTransparentMesh: 0
            --- !u!114 &1302492273629706641
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 5133223902000085260}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: fe87c0e1cc204ed48ad3b37840f39efc, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Material: {fileID: 0}
              m_Color: {r: 0.0627451, g: 0.08627451, b: 0.16862746, a: 1}
              m_RaycastTarget: 1
              m_RaycastPadding: {x: 0, y: 0, z: 0, w: 0}
              m_Maskable: 1
              m_OnCullStateChanged:
                m_PersistentCalls:
                  m_Calls: []
              m_Sprite: {fileID: 0}
              m_Type: 1
              m_PreserveAspect: 0
              m_FillCenter: 1
              m_FillMethod: 4
              m_FillAmount: 1
              m_FillClockwise: 1
              m_FillOrigin: 0
              m_UseSpriteMesh: 0
              m_PixelsPerUnitMultiplier: 1
            --- !u!1 &5224397129732011291
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 8403582124714262575}
              - component: {fileID: 6262420731597809234}
              - component: {fileID: 5535371962978012468}
              m_Layer: 0
              m_Name: PlayImage
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &8403582124714262575
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 5224397129732011291}
              m_LocalRotation: {x: 0, y: 0, z: 0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children: []
              m_Father: {fileID: 8813083786143252063}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 1, y: 0.5}
              m_AnchorMax: {x: 1, y: 0.5}
              m_AnchoredPosition: {x: -25, y: 0}
              m_SizeDelta: {x: 100, y: 100}
              m_Pivot: {x: 1, y: 0.5}
            --- !u!222 &6262420731597809234
            CanvasRenderer:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 5224397129732011291}
              m_CullTransparentMesh: 0
            --- !u!114 &5535371962978012468
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 5224397129732011291}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: fe87c0e1cc204ed48ad3b37840f39efc, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Material: {fileID: 0}
              m_Color: {r: 1, g: 1, b: 1, a: 1}
              m_RaycastTarget: 0
              m_RaycastPadding: {x: 0, y: 0, z: 0, w: 0}
              m_Maskable: 1
              m_OnCullStateChanged:
                m_PersistentCalls:
                  m_Calls: []
              m_Sprite: {fileID: 21300000, guid: 384f822110a9c3944a26b713c6fb2a7d, type: 3}
              m_Type: 0
              m_PreserveAspect: 0
              m_FillCenter: 1
              m_FillMethod: 4
              m_FillAmount: 1
              m_FillClockwise: 1
              m_FillOrigin: 0
              m_UseSpriteMesh: 0
              m_PixelsPerUnitMultiplier: 1
            --- !u!1 &5233038706351216198
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 2883308272097404143}
              - component: {fileID: 7747435663999507872}
              - component: {fileID: 7231032184316129741}
              - component: {fileID: 650026484534761529}
              - component: {fileID: 7201873746905939374}
              m_Layer: 0
              m_Name: Canvas
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &2883308272097404143
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 5233038706351216198}
              m_LocalRotation: {x: -0, y: -0, z: -0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 0.001, y: 0.001, z: 0.001}
              m_ConstrainProportionsScale: 0
              m_Children:
              - {fileID: 5436379789802263824}
              - {fileID: 5240514629014260598}
              - {fileID: 9195942709539212430}
              - {fileID: 1086936176053939974}
              - {fileID: 8444635903433234331}
              m_Father: {fileID: 7970576150017853745}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 0}
              m_AnchorMax: {x: 0, y: 0}
              m_AnchoredPosition: {x: 0, y: 0}
              m_SizeDelta: {x: 1000, y: 1600}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!223 &7747435663999507872
            Canvas:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 5233038706351216198}
              m_Enabled: 1
              serializedVersion: 3
              m_RenderMode: 2
              m_Camera: {fileID: 0}
              m_PlaneDistance: 100
              m_PixelPerfect: 0
              m_ReceivesEvents: 1
              m_OverrideSorting: 0
              m_OverridePixelPerfect: 0
              m_SortingBucketNormalizedSize: 0
              m_VertexColorAlwaysGammaSpace: 0
              m_AdditionalShaderChannelsFlag: 0
              m_UpdateRectTransformForStandalone: 0
              m_SortingLayerID: 0
              m_SortingOrder: 0
              m_TargetDisplay: 0
            --- !u!114 &7231032184316129741
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 5233038706351216198}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: 0cd44c1031e13a943bb63640046fad76, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_UiScaleMode: 0
              m_ReferencePixelsPerUnit: 100
              m_ScaleFactor: 1
              m_ReferenceResolution: {x: 800, y: 600}
              m_ScreenMatchMode: 0
              m_MatchWidthOrHeight: 0
              m_PhysicalUnit: 3
              m_FallbackScreenDPI: 96
              m_DefaultSpriteDPI: 96
              m_DynamicPixelsPerUnit: 1
              m_PresetInfoIsWorld: 0
            --- !u!114 &650026484534761529
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 5233038706351216198}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: dc42784cf147c0c48a680349fa168899, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_IgnoreReversedGraphics: 1
              m_BlockingObjects: 0
              m_BlockingMask:
                serializedVersion: 2
                m_Bits: 4294967295
            --- !u!114 &7201873746905939374
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 5233038706351216198}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: -1533785930, guid: 661092b4961be7145bfbe56e1e62337b, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              AllowFocusView: 1
            --- !u!1 &5299159193042285737
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 7000310308953728327}
              - component: {fileID: 1731717523418175229}
              m_Layer: 0
              m_Name: Progress
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &7000310308953728327
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 5299159193042285737}
              m_LocalRotation: {x: 0, y: 0, z: 0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children:
              - {fileID: 1912877932582853322}
              - {fileID: 7669539292746388375}
              m_Father: {fileID: 4403763568550604045}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 0}
              m_AnchorMax: {x: 1, y: 1}
              m_AnchoredPosition: {x: 0, y: 0}
              m_SizeDelta: {x: 0, y: 0}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!114 &1731717523418175229
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 5299159193042285737}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: 67db9e8f0e2ae9c40bc1e2b64352a6b4, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Navigation:
                m_Mode: 3
                m_WrapAround: 0
                m_SelectOnUp: {fileID: 0}
                m_SelectOnDown: {fileID: 0}
                m_SelectOnLeft: {fileID: 0}
                m_SelectOnRight: {fileID: 0}
              m_Transition: 1
              m_Colors:
                m_NormalColor: {r: 1, g: 1, b: 1, a: 1}
                m_HighlightedColor: {r: 0.9607843, g: 0.9607843, b: 0.9607843, a: 1}
                m_PressedColor: {r: 0.78431374, g: 0.78431374, b: 0.78431374, a: 1}
                m_SelectedColor: {r: 0.9607843, g: 0.9607843, b: 0.9607843, a: 1}
                m_DisabledColor: {r: 0.78431374, g: 0.78431374, b: 0.78431374, a: 0.5019608}
                m_ColorMultiplier: 1
                m_FadeDuration: 0.1
              m_SpriteState:
                m_HighlightedSprite: {fileID: 0}
                m_PressedSprite: {fileID: 0}
                m_SelectedSprite: {fileID: 0}
                m_DisabledSprite: {fileID: 0}
              m_AnimationTriggers:
                m_NormalTrigger: Normal
                m_HighlightedTrigger: Highlighted
                m_PressedTrigger: Pressed
                m_SelectedTrigger: Selected
                m_DisabledTrigger: Disabled
              m_Interactable: 1
              m_TargetGraphic: {fileID: 5801011658467492229}
              m_FillRect: {fileID: 874414378428698362}
              m_HandleRect: {fileID: 636369983616548230}
              m_Direction: 0
              m_MinValue: 0
              m_MaxValue: 1
              m_WholeNumbers: 0
              m_Value: 0
              m_OnValueChanged:
                m_PersistentCalls:
                  m_Calls: []
            --- !u!1 &5428394475775845232
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 1733542278166623911}
              - component: {fileID: 778206375140038873}
              - component: {fileID: 6266278116988147144}
              - component: {fileID: 2681544078519593486}
              m_Layer: 0
              m_Name: Button
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &1733542278166623911
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 5428394475775845232}
              m_LocalRotation: {x: 0, y: 0, z: 0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children: []
              m_Father: {fileID: 4877450149381548715}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 0}
              m_AnchorMax: {x: 1, y: 1}
              m_AnchoredPosition: {x: 0.00018310547, y: 0}
              m_SizeDelta: {x: 0, y: 0}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!222 &778206375140038873
            CanvasRenderer:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 5428394475775845232}
              m_CullTransparentMesh: 0
            --- !u!114 &6266278116988147144
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 5428394475775845232}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: fe87c0e1cc204ed48ad3b37840f39efc, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Material: {fileID: 0}
              m_Color: {r: 1, g: 1, b: 1, a: 0}
              m_RaycastTarget: 1
              m_RaycastPadding: {x: 0, y: 0, z: 0, w: 0}
              m_Maskable: 1
              m_OnCullStateChanged:
                m_PersistentCalls:
                  m_Calls: []
              m_Sprite: {fileID: 10905, guid: 0000000000000000f000000000000000, type: 0}
              m_Type: 1
              m_PreserveAspect: 0
              m_FillCenter: 1
              m_FillMethod: 4
              m_FillAmount: 1
              m_FillClockwise: 1
              m_FillOrigin: 0
              m_UseSpriteMesh: 0
              m_PixelsPerUnitMultiplier: 1
            --- !u!114 &2681544078519593486
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 5428394475775845232}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: 4e29b1a8efbd4b44bb3f3716e73f07ff, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Navigation:
                m_Mode: 0
                m_WrapAround: 0
                m_SelectOnUp: {fileID: 0}
                m_SelectOnDown: {fileID: 0}
                m_SelectOnLeft: {fileID: 0}
                m_SelectOnRight: {fileID: 0}
              m_Transition: 1
              m_Colors:
                m_NormalColor: {r: 1, g: 1, b: 1, a: 1}
                m_HighlightedColor: {r: 0.9607843, g: 0.9607843, b: 0.9607843, a: 1}
                m_PressedColor: {r: 0.78431374, g: 0.78431374, b: 0.78431374, a: 1}
                m_SelectedColor: {r: 0.9607843, g: 0.9607843, b: 0.9607843, a: 1}
                m_DisabledColor: {r: 0.78431374, g: 0.78431374, b: 0.78431374, a: 0.5019608}
                m_ColorMultiplier: 1
                m_FadeDuration: 0.1
              m_SpriteState:
                m_HighlightedSprite: {fileID: 0}
                m_PressedSprite: {fileID: 0}
                m_SelectedSprite: {fileID: 0}
                m_DisabledSprite: {fileID: 0}
              m_AnimationTriggers:
                m_NormalTrigger: Normal
                m_HighlightedTrigger: Highlighted
                m_PressedTrigger: Pressed
                m_SelectedTrigger: Selected
                m_DisabledTrigger: Disabled
              m_Interactable: 1
              m_TargetGraphic: {fileID: 6266278116988147144}
              m_OnClick:
                m_PersistentCalls:
                  m_Calls:
                  - m_Target: {fileID: 2681544078519593486}
                    m_TargetAssemblyTypeName:\s
                    m_MethodName: set_interactable
                    m_Mode: 6
                    m_Arguments:
                      m_ObjectArgument: {fileID: 0}
                      m_ObjectArgumentAssemblyTypeName: UnityEngine.Object, UnityEngine
                      m_IntArgument: 0
                      m_FloatArgument: 0
                      m_StringArgument:\s
                      m_BoolArgument: 0
                    m_CallState: 2
                  - m_Target: {fileID: 8719620524618765563}
                    m_TargetAssemblyTypeName:\s
                    m_MethodName: SendCustomEvent
                    m_Mode: 5
                    m_Arguments:
                      m_ObjectArgument: {fileID: 0}
                      m_ObjectArgumentAssemblyTypeName: UnityEngine.Object, UnityEngine
                      m_IntArgument: 0
                      m_FloatArgument: 0
                      m_StringArgument: OnPlaylistSelected
                      m_BoolArgument: 0
                    m_CallState: 2
            --- !u!1 &5446588674286724258
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 1912877932582853322}
              m_Layer: 0
              m_Name: Fill Area
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &1912877932582853322
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 5446588674286724258}
              m_LocalRotation: {x: -0, y: -0, z: -0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children:
              - {fileID: 874414378428698362}
              m_Father: {fileID: 7000310308953728327}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 0}
              m_AnchorMax: {x: 1, y: 1}
              m_AnchoredPosition: {x: 0, y: 0}
              m_SizeDelta: {x: -0.00000071525574, y: 0}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!1 &5467187827395666499
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 2225800770822693953}
              - component: {fileID: 3175547989771202537}
              - component: {fileID: 7707034905066937626}
              m_Layer: 0
              m_Name: Play
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &2225800770822693953
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 5467187827395666499}
              m_LocalRotation: {x: -0, y: -0, z: -0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children: []
              m_Father: {fileID: 6731035202408777031}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 0}
              m_AnchorMax: {x: 1, y: 1}
              m_AnchoredPosition: {x: 0, y: 0}
              m_SizeDelta: {x: -30, y: -30}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!222 &3175547989771202537
            CanvasRenderer:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 5467187827395666499}
              m_CullTransparentMesh: 0
            --- !u!114 &7707034905066937626
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 5467187827395666499}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: fe87c0e1cc204ed48ad3b37840f39efc, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Material: {fileID: 0}
              m_Color: {r: 1, g: 1, b: 1, a: 1}
              m_RaycastTarget: 1
              m_RaycastPadding: {x: 0, y: 0, z: 0, w: 0}
              m_Maskable: 1
              m_OnCullStateChanged:
                m_PersistentCalls:
                  m_Calls: []
              m_Sprite: {fileID: 21300000, guid: 1c186b867680cb84c881a9977d8bc262, type: 3}
              m_Type: 0
              m_PreserveAspect: 0
              m_FillCenter: 1
              m_FillMethod: 4
              m_FillAmount: 1
              m_FillClockwise: 1
              m_FillOrigin: 0
              m_UseSpriteMesh: 0
              m_PixelsPerUnitMultiplier: 1
            --- !u!1 &5474698653885989431
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 7461409215312673535}
              - component: {fileID: 3576807621216226605}
              - component: {fileID: 2992683644955475047}
              - component: {fileID: 7297403536085009914}
              m_Layer: 0
              m_Name: Dummy
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &7461409215312673535
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 5474698653885989431}
              m_LocalRotation: {x: 0, y: 0, z: 0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children: []
              m_Father: {fileID: 8339394409783589667}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 0}
              m_AnchorMax: {x: 1, y: 1}
              m_AnchoredPosition: {x: 0.00018310547, y: 0}
              m_SizeDelta: {x: 0, y: 0}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!222 &3576807621216226605
            CanvasRenderer:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 5474698653885989431}
              m_CullTransparentMesh: 0
            --- !u!114 &2992683644955475047
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 5474698653885989431}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: fe87c0e1cc204ed48ad3b37840f39efc, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Material: {fileID: 0}
              m_Color: {r: 1, g: 1, b: 1, a: 0}
              m_RaycastTarget: 1
              m_RaycastPadding: {x: 0, y: 0, z: 0, w: 0}
              m_Maskable: 1
              m_OnCullStateChanged:
                m_PersistentCalls:
                  m_Calls: []
              m_Sprite: {fileID: 0}
              m_Type: 0
              m_PreserveAspect: 0
              m_FillCenter: 1
              m_FillMethod: 4
              m_FillAmount: 1
              m_FillClockwise: 1
              m_FillOrigin: 0
              m_UseSpriteMesh: 0
              m_PixelsPerUnitMultiplier: 1
            --- !u!114 &7297403536085009914
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 5474698653885989431}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: 4e29b1a8efbd4b44bb3f3716e73f07ff, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Navigation:
                m_Mode: 3
                m_WrapAround: 0
                m_SelectOnUp: {fileID: 0}
                m_SelectOnDown: {fileID: 0}
                m_SelectOnLeft: {fileID: 0}
                m_SelectOnRight: {fileID: 0}
              m_Transition: 1
              m_Colors:
                m_NormalColor: {r: 1, g: 1, b: 1, a: 1}
                m_HighlightedColor: {r: 0.9607843, g: 0.9607843, b: 0.9607843, a: 1}
                m_PressedColor: {r: 0.78431374, g: 0.78431374, b: 0.78431374, a: 1}
                m_SelectedColor: {r: 0.9607843, g: 0.9607843, b: 0.9607843, a: 1}
                m_DisabledColor: {r: 0.78431374, g: 0.78431374, b: 0.78431374, a: 0.5019608}
                m_ColorMultiplier: 1
                m_FadeDuration: 0.1
              m_SpriteState:
                m_HighlightedSprite: {fileID: 0}
                m_PressedSprite: {fileID: 0}
                m_SelectedSprite: {fileID: 0}
                m_DisabledSprite: {fileID: 0}
              m_AnimationTriggers:
                m_NormalTrigger: Normal
                m_HighlightedTrigger: Highlighted
                m_PressedTrigger: Pressed
                m_SelectedTrigger: Selected
                m_DisabledTrigger: Disabled
              m_Interactable: 1
              m_TargetGraphic: {fileID: 2992683644955475047}
              m_OnClick:
                m_PersistentCalls:
                  m_Calls:
                  - m_Target: {fileID: 1781683614899428480}
                    m_TargetAssemblyTypeName:\s
                    m_MethodName: SendCustomEvent
                    m_Mode: 5
                    m_Arguments:
                      m_ObjectArgument: {fileID: 0}
                      m_ObjectArgumentAssemblyTypeName: UnityEngine.Object, UnityEngine
                      m_IntArgument: 0
                      m_FloatArgument: 0
                      m_StringArgument: ToggleShuffleState
                      m_BoolArgument: 0
                    m_CallState: 2
            --- !u!1 &5486031741490917502
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 5176692844336501844}
              - component: {fileID: 3414197472109967760}
              - component: {fileID: 250506253201037139}
              m_Layer: 0
              m_Name: Icon
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &5176692844336501844
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 5486031741490917502}
              m_LocalRotation: {x: -0, y: -0, z: -0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: -0.099999994}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children: []
              m_Father: {fileID: 2168552727934459005}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0.5, y: 0.5}
              m_AnchorMax: {x: 0.5, y: 0.5}
              m_AnchoredPosition: {x: -0, y: 200}
              m_SizeDelta: {x: 200, y: 200}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!222 &3414197472109967760
            CanvasRenderer:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 5486031741490917502}
              m_CullTransparentMesh: 0
            --- !u!114 &250506253201037139
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 5486031741490917502}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: fe87c0e1cc204ed48ad3b37840f39efc, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Material: {fileID: 0}
              m_Color: {r: 0.050980393, g: 0.08627451, b: 0.16470589, a: 1}
              m_RaycastTarget: 0
              m_RaycastPadding: {x: 0, y: 0, z: 0, w: 0}
              m_Maskable: 1
              m_OnCullStateChanged:
                m_PersistentCalls:
                  m_Calls: []
              m_Sprite: {fileID: 21300000, guid: 1757ad854354b8e4681c38cfe1e728a4, type: 3}
              m_Type: 0
              m_PreserveAspect: 0
              m_FillCenter: 1
              m_FillMethod: 4
              m_FillAmount: 1
              m_FillClockwise: 1
              m_FillOrigin: 0
              m_UseSpriteMesh: 0
              m_PixelsPerUnitMultiplier: 1
            --- !u!1 &5492083601554931594
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 165530586570030590}
              m_Layer: 0
              m_Name: Fill Area
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &165530586570030590
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 5492083601554931594}
              m_LocalRotation: {x: -0, y: -0, z: -0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children:
              - {fileID: 1143717302508411099}
              m_Father: {fileID: 8092769853755633580}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 0}
              m_AnchorMax: {x: 1, y: 1}
              m_AnchoredPosition: {x: 0, y: 0}
              m_SizeDelta: {x: -0.00000071525574, y: 0}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!1 &5533224310294583244
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 8339394409783589667}
              m_Layer: 0
              m_Name: LoopMode
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &8339394409783589667
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 5533224310294583244}
              m_LocalRotation: {x: 0, y: 0, z: 0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children:
              - {fileID: 1088299181368004025}
              - {fileID: 1908994470860091141}
              - {fileID: 7461409215312673535}
              m_Father: {fileID: 1086936176053939974}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 1, y: 1}
              m_AnchorMax: {x: 1, y: 1}
              m_AnchoredPosition: {x: -150, y: -25}
              m_SizeDelta: {x: 100, y: 100}
              m_Pivot: {x: 1, y: 1}
            --- !u!1 &5671519094859452411
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 469618103028254595}
              - component: {fileID: 6305796700462097196}
              - component: {fileID: 2388998632021151137}
              m_Layer: 0
              m_Name: PlayImage
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &469618103028254595
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 5671519094859452411}
              m_LocalRotation: {x: 0, y: 0, z: 0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children: []
              m_Father: {fileID: 4403763568550604045}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 1, y: 0.5}
              m_AnchorMax: {x: 1, y: 0.5}
              m_AnchoredPosition: {x: -25, y: 0}
              m_SizeDelta: {x: 100, y: 100}
              m_Pivot: {x: 1, y: 0.5}
            --- !u!222 &6305796700462097196
            CanvasRenderer:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 5671519094859452411}
              m_CullTransparentMesh: 0
            --- !u!114 &2388998632021151137
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 5671519094859452411}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: fe87c0e1cc204ed48ad3b37840f39efc, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Material: {fileID: 0}
              m_Color: {r: 1, g: 1, b: 1, a: 1}
              m_RaycastTarget: 0
              m_RaycastPadding: {x: 0, y: 0, z: 0, w: 0}
              m_Maskable: 1
              m_OnCullStateChanged:
                m_PersistentCalls:
                  m_Calls: []
              m_Sprite: {fileID: 21300000, guid: 384f822110a9c3944a26b713c6fb2a7d, type: 3}
              m_Type: 0
              m_PreserveAspect: 0
              m_FillCenter: 1
              m_FillMethod: 4
              m_FillAmount: 1
              m_FillClockwise: 1
              m_FillOrigin: 0
              m_UseSpriteMesh: 0
              m_PixelsPerUnitMultiplier: 1
            --- !u!1 &5796691661997854557
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 7145056045384099220}
              - component: {fileID: 2462560036505273713}
              - component: {fileID: 8378223548798855732}
              m_Layer: 0
              m_Name: Border
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &7145056045384099220
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 5796691661997854557}
              m_LocalRotation: {x: 0, y: 0, z: 0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children: []
              m_Father: {fileID: 4403763568550604045}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 0}
              m_AnchorMax: {x: 1, y: 1}
              m_AnchoredPosition: {x: 0.00018310547, y: 0}
              m_SizeDelta: {x: 0, y: 0}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!222 &2462560036505273713
            CanvasRenderer:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 5796691661997854557}
              m_CullTransparentMesh: 0
            --- !u!114 &8378223548798855732
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 5796691661997854557}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: fe87c0e1cc204ed48ad3b37840f39efc, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Material: {fileID: 0}
              m_Color: {r: 1, g: 1, b: 1, a: 1}
              m_RaycastTarget: 0
              m_RaycastPadding: {x: 0, y: 0, z: 0, w: 0}
              m_Maskable: 1
              m_OnCullStateChanged:
                m_PersistentCalls:
                  m_Calls: []
              m_Sprite: {fileID: 21300000, guid: 216faa4d4dd65394b93796bbe0a64e9d, type: 3}
              m_Type: 1
              m_PreserveAspect: 0
              m_FillCenter: 1
              m_FillMethod: 4
              m_FillAmount: 1
              m_FillClockwise: 1
              m_FillOrigin: 0
              m_UseSpriteMesh: 0
              m_PixelsPerUnitMultiplier: 100
            --- !u!1 &5939175548883159700
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 6315939899284031133}
              - component: {fileID: 3769749717100409361}
              - component: {fileID: 7633006756913757946}
              - component: {fileID: 601561643680657536}
              m_Layer: 0
              m_Name: Dummy
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &6315939899284031133
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 5939175548883159700}
              m_LocalRotation: {x: -0, y: -0, z: -0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children: []
              m_Father: {fileID: 6731035202408777031}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 0}
              m_AnchorMax: {x: 1, y: 1}
              m_AnchoredPosition: {x: 0, y: 0}
              m_SizeDelta: {x: -30, y: -30}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!222 &3769749717100409361
            CanvasRenderer:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 5939175548883159700}
              m_CullTransparentMesh: 0
            --- !u!114 &7633006756913757946
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 5939175548883159700}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: fe87c0e1cc204ed48ad3b37840f39efc, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Material: {fileID: 0}
              m_Color: {r: 1, g: 1, b: 1, a: 0}
              m_RaycastTarget: 1
              m_RaycastPadding: {x: 0, y: 0, z: 0, w: 0}
              m_Maskable: 1
              m_OnCullStateChanged:
                m_PersistentCalls:
                  m_Calls: []
              m_Sprite: {fileID: 0}
              m_Type: 0
              m_PreserveAspect: 0
              m_FillCenter: 1
              m_FillMethod: 4
              m_FillAmount: 1
              m_FillClockwise: 1
              m_FillOrigin: 0
              m_UseSpriteMesh: 0
              m_PixelsPerUnitMultiplier: 1
            --- !u!114 &601561643680657536
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 5939175548883159700}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: 4e29b1a8efbd4b44bb3f3716e73f07ff, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Navigation:
                m_Mode: 0
                m_WrapAround: 0
                m_SelectOnUp: {fileID: 0}
                m_SelectOnDown: {fileID: 0}
                m_SelectOnLeft: {fileID: 0}
                m_SelectOnRight: {fileID: 0}
              m_Transition: 1
              m_Colors:
                m_NormalColor: {r: 1, g: 1, b: 1, a: 1}
                m_HighlightedColor: {r: 0.9607843, g: 0.9607843, b: 0.9607843, a: 1}
                m_PressedColor: {r: 0.78431374, g: 0.78431374, b: 0.78431374, a: 1}
                m_SelectedColor: {r: 0.9607843, g: 0.9607843, b: 0.9607843, a: 1}
                m_DisabledColor: {r: 0.78431374, g: 0.78431374, b: 0.78431374, a: 0.5019608}
                m_ColorMultiplier: 1
                m_FadeDuration: 0.1
              m_SpriteState:
                m_HighlightedSprite: {fileID: 0}
                m_PressedSprite: {fileID: 0}
                m_SelectedSprite: {fileID: 0}
                m_DisabledSprite: {fileID: 0}
              m_AnimationTriggers:
                m_NormalTrigger: Normal
                m_HighlightedTrigger: Highlighted
                m_PressedTrigger: Pressed
                m_SelectedTrigger: Selected
                m_DisabledTrigger: Disabled
              m_Interactable: 1
              m_TargetGraphic: {fileID: 7633006756913757946}
              m_OnClick:
                m_PersistentCalls:
                  m_Calls:
                  - m_Target: {fileID: 1781683614899428480}
                    m_TargetAssemblyTypeName:\s
                    m_MethodName: SendCustomEvent
                    m_Mode: 5
                    m_Arguments:
                      m_ObjectArgument: {fileID: 0}
                      m_ObjectArgumentAssemblyTypeName: UnityEngine.Object, UnityEngine
                      m_IntArgument: 0
                      m_FloatArgument: 0
                      m_StringArgument: TogglePlayState
                      m_BoolArgument: 0
                    m_CallState: 2
            --- !u!1 &5999281269831188448
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 4266542987271852413}
              - component: {fileID: 4111463822702341230}
              - component: {fileID: 2799981214698335115}
              m_Layer: 0
              m_Name: Image
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 0
            --- !u!224 &4266542987271852413
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 5999281269831188448}
              m_LocalRotation: {x: -0, y: -0, z: -0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children: []
              m_Father: {fileID: 1375125376929899666}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 0}
              m_AnchorMax: {x: 1, y: 1}
              m_AnchoredPosition: {x: 0, y: 0}
              m_SizeDelta: {x: 0, y: 0}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!222 &4111463822702341230
            CanvasRenderer:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 5999281269831188448}
              m_CullTransparentMesh: 0
            --- !u!114 &2799981214698335115
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 5999281269831188448}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: fe87c0e1cc204ed48ad3b37840f39efc, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Material: {fileID: 0}
              m_Color: {r: 1, g: 1, b: 1, a: 1}
              m_RaycastTarget: 0
              m_RaycastPadding: {x: 0, y: 0, z: 0, w: 0}
              m_Maskable: 1
              m_OnCullStateChanged:
                m_PersistentCalls:
                  m_Calls: []
              m_Sprite: {fileID: 0}
              m_Type: 0
              m_PreserveAspect: 0
              m_FillCenter: 1
              m_FillMethod: 4
              m_FillAmount: 1
              m_FillClockwise: 1
              m_FillOrigin: 0
              m_UseSpriteMesh: 0
              m_PixelsPerUnitMultiplier: 1
            --- !u!1 &6045877503471979119
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 2469437045312321982}
              - component: {fileID: 5775039848504279612}
              - component: {fileID: 433306664096999786}
              m_Layer: 0
              m_Name: Image
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &2469437045312321982
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 6045877503471979119}
              m_LocalRotation: {x: -0, y: -0, z: -0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children: []
              m_Father: {fileID: 7497332400807042825}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 0}
              m_AnchorMax: {x: 1, y: 1}
              m_AnchoredPosition: {x: 0, y: 0}
              m_SizeDelta: {x: 0, y: 0}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!222 &5775039848504279612
            CanvasRenderer:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 6045877503471979119}
              m_CullTransparentMesh: 0
            --- !u!114 &433306664096999786
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 6045877503471979119}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: fe87c0e1cc204ed48ad3b37840f39efc, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Material: {fileID: 0}
              m_Color: {r: 1, g: 1, b: 1, a: 1}
              m_RaycastTarget: 0
              m_RaycastPadding: {x: 0, y: 0, z: 0, w: 0}
              m_Maskable: 1
              m_OnCullStateChanged:
                m_PersistentCalls:
                  m_Calls: []
              m_Sprite: {fileID: 0}
              m_Type: 0
              m_PreserveAspect: 0
              m_FillCenter: 1
              m_FillMethod: 4
              m_FillAmount: 1
              m_FillClockwise: 1
              m_FillOrigin: 0
              m_UseSpriteMesh: 0
              m_PixelsPerUnitMultiplier: 1
            --- !u!1 &6132681539548374975
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 6042214220864092933}
              - component: {fileID: 3149132622819500089}
              - component: {fileID: 330228982028129478}
              - component: {fileID: 4931403301266324592}
              m_Layer: 0
              m_Name: Button
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &6042214220864092933
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 6132681539548374975}
              m_LocalRotation: {x: 0, y: 0, z: 0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children: []
              m_Father: {fileID: 7350327250546647802}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 0}
              m_AnchorMax: {x: 1, y: 1}
              m_AnchoredPosition: {x: 0.00018310547, y: 0}
              m_SizeDelta: {x: 0, y: 0}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!222 &3149132622819500089
            CanvasRenderer:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 6132681539548374975}
              m_CullTransparentMesh: 0
            --- !u!114 &330228982028129478
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 6132681539548374975}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: fe87c0e1cc204ed48ad3b37840f39efc, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Material: {fileID: 0}
              m_Color: {r: 1, g: 1, b: 1, a: 0}
              m_RaycastTarget: 1
              m_RaycastPadding: {x: 0, y: 0, z: 0, w: 0}
              m_Maskable: 1
              m_OnCullStateChanged:
                m_PersistentCalls:
                  m_Calls: []
              m_Sprite: {fileID: 10905, guid: 0000000000000000f000000000000000, type: 0}
              m_Type: 1
              m_PreserveAspect: 0
              m_FillCenter: 1
              m_FillMethod: 4
              m_FillAmount: 1
              m_FillClockwise: 1
              m_FillOrigin: 0
              m_UseSpriteMesh: 0
              m_PixelsPerUnitMultiplier: 1
            --- !u!114 &4931403301266324592
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 6132681539548374975}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: 4e29b1a8efbd4b44bb3f3716e73f07ff, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Navigation:
                m_Mode: 0
                m_WrapAround: 0
                m_SelectOnUp: {fileID: 0}
                m_SelectOnDown: {fileID: 0}
                m_SelectOnLeft: {fileID: 0}
                m_SelectOnRight: {fileID: 0}
              m_Transition: 1
              m_Colors:
                m_NormalColor: {r: 1, g: 1, b: 1, a: 1}
                m_HighlightedColor: {r: 0.9607843, g: 0.9607843, b: 0.9607843, a: 1}
                m_PressedColor: {r: 0.78431374, g: 0.78431374, b: 0.78431374, a: 1}
                m_SelectedColor: {r: 0.9607843, g: 0.9607843, b: 0.9607843, a: 1}
                m_DisabledColor: {r: 0.78431374, g: 0.78431374, b: 0.78431374, a: 0.5019608}
                m_ColorMultiplier: 1
                m_FadeDuration: 0.1
              m_SpriteState:
                m_HighlightedSprite: {fileID: 0}
                m_PressedSprite: {fileID: 0}
                m_SelectedSprite: {fileID: 0}
                m_DisabledSprite: {fileID: 0}
              m_AnimationTriggers:
                m_NormalTrigger: Normal
                m_HighlightedTrigger: Highlighted
                m_PressedTrigger: Pressed
                m_SelectedTrigger: Selected
                m_DisabledTrigger: Disabled
              m_Interactable: 1
              m_TargetGraphic: {fileID: 330228982028129478}
              m_OnClick:
                m_PersistentCalls:
                  m_Calls:
                  - m_Target: {fileID: 4931403301266324592}
                    m_TargetAssemblyTypeName:\s
                    m_MethodName: set_interactable
                    m_Mode: 6
                    m_Arguments:
                      m_ObjectArgument: {fileID: 0}
                      m_ObjectArgumentAssemblyTypeName: UnityEngine.Object, UnityEngine
                      m_IntArgument: 0
                      m_FloatArgument: 0
                      m_StringArgument:\s
                      m_BoolArgument: 0
                    m_CallState: 2
                  - m_Target: {fileID: 8719620524618765563}
                    m_TargetAssemblyTypeName:\s
                    m_MethodName: SendCustomEvent
                    m_Mode: 5
                    m_Arguments:
                      m_ObjectArgument: {fileID: 0}
                      m_ObjectArgumentAssemblyTypeName: UnityEngine.Object, UnityEngine
                      m_IntArgument: 0
                      m_FloatArgument: 0
                      m_StringArgument: OnPlaylistSelected
                      m_BoolArgument: 0
                    m_CallState: 2
            --- !u!1 &6185942972192556799
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 7857505150913508840}
              - component: {fileID: 6906441732398092883}
              m_Layer: 0
              m_Name: Video (4)
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &7857505150913508840
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 6185942972192556799}
              m_LocalRotation: {x: 0, y: 0, z: 0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children:
              - {fileID: 774988422817465308}
              - {fileID: 1366479644813552158}
              - {fileID: 8345349604221441852}
              - {fileID: 7743207524630606701}
              - {fileID: 2818530194814354777}
              - {fileID: 1146069240739503854}
              m_Father: {fileID: 3997900497835806772}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 0}
              m_AnchorMax: {x: 0, y: 0}
              m_AnchoredPosition: {x: 0, y: 0}
              m_SizeDelta: {x: 875, y: 125}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!114 &6906441732398092883
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 6185942972192556799}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: 306cc8c2b49d7114eaa3623786fc2126, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_IgnoreLayout: 0
              m_MinWidth: -1
              m_MinHeight: -1
              m_PreferredWidth: -1
              m_PreferredHeight: -1
              m_FlexibleWidth: -1
              m_FlexibleHeight: -1
              m_LayoutPriority: 1
            --- !u!1 &6286178384779009815
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 6643050093449108454}
              - component: {fileID: 2723427809032890848}
              - component: {fileID: 7129103743148866117}
              m_Layer: 0
              m_Name: Border
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &6643050093449108454
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 6286178384779009815}
              m_LocalRotation: {x: 0, y: 0, z: 0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children: []
              m_Father: {fileID: 8813083786143252063}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 0}
              m_AnchorMax: {x: 1, y: 1}
              m_AnchoredPosition: {x: 0.00018310547, y: 0}
              m_SizeDelta: {x: 0, y: 0}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!222 &2723427809032890848
            CanvasRenderer:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 6286178384779009815}
              m_CullTransparentMesh: 0
            --- !u!114 &7129103743148866117
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 6286178384779009815}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: fe87c0e1cc204ed48ad3b37840f39efc, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Material: {fileID: 0}
              m_Color: {r: 1, g: 1, b: 1, a: 1}
              m_RaycastTarget: 0
              m_RaycastPadding: {x: 0, y: 0, z: 0, w: 0}
              m_Maskable: 1
              m_OnCullStateChanged:
                m_PersistentCalls:
                  m_Calls: []
              m_Sprite: {fileID: 21300000, guid: 216faa4d4dd65394b93796bbe0a64e9d, type: 3}
              m_Type: 1
              m_PreserveAspect: 0
              m_FillCenter: 1
              m_FillMethod: 4
              m_FillAmount: 1
              m_FillClockwise: 1
              m_FillOrigin: 0
              m_UseSpriteMesh: 0
              m_PixelsPerUnitMultiplier: 100
            --- !u!1 &6528107900346304618
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 1146069240739503854}
              - component: {fileID: 7474562189566573936}
              - component: {fileID: 1316218859785972316}
              - component: {fileID: 6983215764408891693}
              m_Layer: 0
              m_Name: Button
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &1146069240739503854
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 6528107900346304618}
              m_LocalRotation: {x: 0, y: 0, z: 0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children: []
              m_Father: {fileID: 7857505150913508840}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 0}
              m_AnchorMax: {x: 1, y: 1}
              m_AnchoredPosition: {x: 0.00018310547, y: 0}
              m_SizeDelta: {x: 0, y: 0}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!222 &7474562189566573936
            CanvasRenderer:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 6528107900346304618}
              m_CullTransparentMesh: 0
            --- !u!114 &1316218859785972316
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 6528107900346304618}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: fe87c0e1cc204ed48ad3b37840f39efc, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Material: {fileID: 0}
              m_Color: {r: 1, g: 1, b: 1, a: 0}
              m_RaycastTarget: 1
              m_RaycastPadding: {x: 0, y: 0, z: 0, w: 0}
              m_Maskable: 1
              m_OnCullStateChanged:
                m_PersistentCalls:
                  m_Calls: []
              m_Sprite: {fileID: 10905, guid: 0000000000000000f000000000000000, type: 0}
              m_Type: 1
              m_PreserveAspect: 0
              m_FillCenter: 1
              m_FillMethod: 4
              m_FillAmount: 1
              m_FillClockwise: 1
              m_FillOrigin: 0
              m_UseSpriteMesh: 0
              m_PixelsPerUnitMultiplier: 1
            --- !u!114 &6983215764408891693
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 6528107900346304618}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: 4e29b1a8efbd4b44bb3f3716e73f07ff, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Navigation:
                m_Mode: 0
                m_WrapAround: 0
                m_SelectOnUp: {fileID: 0}
                m_SelectOnDown: {fileID: 0}
                m_SelectOnLeft: {fileID: 0}
                m_SelectOnRight: {fileID: 0}
              m_Transition: 1
              m_Colors:
                m_NormalColor: {r: 1, g: 1, b: 1, a: 1}
                m_HighlightedColor: {r: 0.9607843, g: 0.9607843, b: 0.9607843, a: 1}
                m_PressedColor: {r: 0.78431374, g: 0.78431374, b: 0.78431374, a: 1}
                m_SelectedColor: {r: 0.9607843, g: 0.9607843, b: 0.9607843, a: 1}
                m_DisabledColor: {r: 0.78431374, g: 0.78431374, b: 0.78431374, a: 0.5019608}
                m_ColorMultiplier: 1
                m_FadeDuration: 0.1
              m_SpriteState:
                m_HighlightedSprite: {fileID: 0}
                m_PressedSprite: {fileID: 0}
                m_SelectedSprite: {fileID: 0}
                m_DisabledSprite: {fileID: 0}
              m_AnimationTriggers:
                m_NormalTrigger: Normal
                m_HighlightedTrigger: Highlighted
                m_PressedTrigger: Pressed
                m_SelectedTrigger: Selected
                m_DisabledTrigger: Disabled
              m_Interactable: 1
              m_TargetGraphic: {fileID: 1316218859785972316}
              m_OnClick:
                m_PersistentCalls:
                  m_Calls:
                  - m_Target: {fileID: 6983215764408891693}
                    m_TargetAssemblyTypeName:\s
                    m_MethodName: set_interactable
                    m_Mode: 6
                    m_Arguments:
                      m_ObjectArgument: {fileID: 0}
                      m_ObjectArgumentAssemblyTypeName: UnityEngine.Object, UnityEngine
                      m_IntArgument: 0
                      m_FloatArgument: 0
                      m_StringArgument:\s
                      m_BoolArgument: 0
                    m_CallState: 2
                  - m_Target: {fileID: 8719620524618765563}
                    m_TargetAssemblyTypeName:\s
                    m_MethodName: SendCustomEvent
                    m_Mode: 5
                    m_Arguments:
                      m_ObjectArgument: {fileID: 0}
                      m_ObjectArgumentAssemblyTypeName: UnityEngine.Object, UnityEngine
                      m_IntArgument: 0
                      m_FloatArgument: 0
                      m_StringArgument: OnPlaylistSelected
                      m_BoolArgument: 0
                    m_CallState: 2
            --- !u!1 &6537652368063805226
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 6930416377365981363}
              - component: {fileID: 7422185785630677768}
              - component: {fileID: 5124015413181708286}
              m_Layer: 0
              m_Name: Handle
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &6930416377365981363
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 6537652368063805226}
              m_LocalRotation: {x: -0, y: -0, z: -0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children: []
              m_Father: {fileID: 1509937527601786290}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 0}
              m_AnchorMax: {x: 0, y: 0}
              m_AnchoredPosition: {x: 0, y: 0}
              m_SizeDelta: {x: 20, y: 0}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!222 &7422185785630677768
            CanvasRenderer:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 6537652368063805226}
              m_CullTransparentMesh: 0
            --- !u!114 &5124015413181708286
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 6537652368063805226}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: fe87c0e1cc204ed48ad3b37840f39efc, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Material: {fileID: 0}
              m_Color: {r: 1, g: 1, b: 1, a: 1}
              m_RaycastTarget: 1
              m_RaycastPadding: {x: 0, y: 0, z: 0, w: 0}
              m_Maskable: 1
              m_OnCullStateChanged:
                m_PersistentCalls:
                  m_Calls: []
              m_Sprite: {fileID: 10913, guid: 0000000000000000f000000000000000, type: 0}
              m_Type: 0
              m_PreserveAspect: 0
              m_FillCenter: 1
              m_FillMethod: 4
              m_FillAmount: 1
              m_FillClockwise: 1
              m_FillOrigin: 0
              m_UseSpriteMesh: 0
              m_PixelsPerUnitMultiplier: 1
            --- !u!1 &6664017353269895410
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 7486548024163598367}
              m_Layer: 0
              m_Name: Fill Area
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &7486548024163598367
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 6664017353269895410}
              m_LocalRotation: {x: -0, y: -0, z: -0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children:
              - {fileID: 5970753678236335850}
              m_Father: {fileID: 1366479644813552158}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 0}
              m_AnchorMax: {x: 1, y: 1}
              m_AnchoredPosition: {x: 0, y: 0}
              m_SizeDelta: {x: -0.00000071525574, y: 0}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!1 &6715609595001029749
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 1508111442938310388}
              - component: {fileID: 4533571276447551178}
              - component: {fileID: 2566763226000006791}
              m_Layer: 0
              m_Name: Image
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &1508111442938310388
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 6715609595001029749}
              m_LocalRotation: {x: 0, y: 0, z: 0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children: []
              m_Father: {fileID: 5645916161197877870}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0.5, y: 0.5}
              m_AnchorMax: {x: 0.5, y: 0.5}
              m_AnchoredPosition: {x: 0, y: 0}
              m_SizeDelta: {x: 100, y: 100}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!222 &4533571276447551178
            CanvasRenderer:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 6715609595001029749}
              m_CullTransparentMesh: 0
            --- !u!114 &2566763226000006791
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 6715609595001029749}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: fe87c0e1cc204ed48ad3b37840f39efc, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Material: {fileID: 0}
              m_Color: {r: 1, g: 1, b: 1, a: 1}
              m_RaycastTarget: 1
              m_RaycastPadding: {x: 0, y: 0, z: 0, w: 0}
              m_Maskable: 1
              m_OnCullStateChanged:
                m_PersistentCalls:
                  m_Calls: []
              m_Sprite: {fileID: 21300000, guid: 1757ad854354b8e4681c38cfe1e728a4, type: 3}
              m_Type: 0
              m_PreserveAspect: 0
              m_FillCenter: 1
              m_FillMethod: 4
              m_FillAmount: 1
              m_FillClockwise: 1
              m_FillOrigin: 0
              m_UseSpriteMesh: 0
              m_PixelsPerUnitMultiplier: 1
            --- !u!1 &6724572083761446768
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 1375125376929899666}
              m_Layer: 0
              m_Name: Lock Cover
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 0
            --- !u!224 &1375125376929899666
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 6724572083761446768}
              m_LocalRotation: {x: 0, y: 0, z: 0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children:
              - {fileID: 4266542987271852413}
              - {fileID: 4514204372773181593}
              - {fileID: 3575441803386809129}
              - {fileID: 4444550017958704606}
              m_Father: {fileID: 184951645298031073}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 0}
              m_AnchorMax: {x: 1, y: 1}
              m_AnchoredPosition: {x: -0.00024414062, y: 0}
              m_SizeDelta: {x: 0, y: 0}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!1 &6732133292361301247
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 636369983616548230}
              - component: {fileID: 6073560686871638129}
              - component: {fileID: 5801011658467492229}
              m_Layer: 0
              m_Name: Handle
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &636369983616548230
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 6732133292361301247}
              m_LocalRotation: {x: -0, y: -0, z: -0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children: []
              m_Father: {fileID: 7669539292746388375}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 0}
              m_AnchorMax: {x: 0, y: 0}
              m_AnchoredPosition: {x: 0, y: 0}
              m_SizeDelta: {x: 20, y: 0}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!222 &6073560686871638129
            CanvasRenderer:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 6732133292361301247}
              m_CullTransparentMesh: 0
            --- !u!114 &5801011658467492229
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 6732133292361301247}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: fe87c0e1cc204ed48ad3b37840f39efc, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Material: {fileID: 0}
              m_Color: {r: 1, g: 1, b: 1, a: 1}
              m_RaycastTarget: 1
              m_RaycastPadding: {x: 0, y: 0, z: 0, w: 0}
              m_Maskable: 1
              m_OnCullStateChanged:
                m_PersistentCalls:
                  m_Calls: []
              m_Sprite: {fileID: 10913, guid: 0000000000000000f000000000000000, type: 0}
              m_Type: 0
              m_PreserveAspect: 0
              m_FillCenter: 1
              m_FillMethod: 4
              m_FillAmount: 1
              m_FillClockwise: 1
              m_FillOrigin: 0
              m_UseSpriteMesh: 0
              m_PixelsPerUnitMultiplier: 1
            --- !u!1 &6775555000311233420
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 8345349604221441852}
              - component: {fileID: 4336811146027425424}
              - component: {fileID: 9103144742415588392}
              m_Layer: 0
              m_Name: Border
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &8345349604221441852
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 6775555000311233420}
              m_LocalRotation: {x: 0, y: 0, z: 0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children: []
              m_Father: {fileID: 7857505150913508840}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 0}
              m_AnchorMax: {x: 1, y: 1}
              m_AnchoredPosition: {x: 0.00018310547, y: 0}
              m_SizeDelta: {x: 0, y: 0}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!222 &4336811146027425424
            CanvasRenderer:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 6775555000311233420}
              m_CullTransparentMesh: 0
            --- !u!114 &9103144742415588392
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 6775555000311233420}
              """;
    private final String prefab_3_1 = """
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: fe87c0e1cc204ed48ad3b37840f39efc, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Material: {fileID: 0}
              m_Color: {r: 1, g: 1, b: 1, a: 1}
              m_RaycastTarget: 0
              m_RaycastPadding: {x: 0, y: 0, z: 0, w: 0}
              m_Maskable: 1
              m_OnCullStateChanged:
                m_PersistentCalls:
                  m_Calls: []
              m_Sprite: {fileID: 21300000, guid: 216faa4d4dd65394b93796bbe0a64e9d, type: 3}
              m_Type: 1
              m_PreserveAspect: 0
              m_FillCenter: 1
              m_FillMethod: 4
              m_FillAmount: 1
              m_FillClockwise: 1
              m_FillOrigin: 0
              m_UseSpriteMesh: 0
              m_PixelsPerUnitMultiplier: 100
            --- !u!1 &6882099677360271388
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 774988422817465308}
              - component: {fileID: 132408303597214672}
              - component: {fileID: 938527791779872210}
              m_Layer: 0
              m_Name: Background
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &774988422817465308
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 6882099677360271388}
              m_LocalRotation: {x: 0, y: 0, z: 0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children: []
              m_Father: {fileID: 7857505150913508840}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 0}
              m_AnchorMax: {x: 1, y: 1}
              m_AnchoredPosition: {x: 0.00018310547, y: 0}
              m_SizeDelta: {x: 0, y: 0}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!222 &132408303597214672
            CanvasRenderer:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 6882099677360271388}
              m_CullTransparentMesh: 0
            --- !u!114 &938527791779872210
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 6882099677360271388}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: fe87c0e1cc204ed48ad3b37840f39efc, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Material: {fileID: 0}
              m_Color: {r: 0.23104306, g: 0.27194327, b: 0.41509432, a: 1}
              m_RaycastTarget: 0
              m_RaycastPadding: {x: 0, y: 0, z: 0, w: 0}
              m_Maskable: 1
              m_OnCullStateChanged:
                m_PersistentCalls:
                  m_Calls: []
              m_Sprite: {fileID: 0}
              m_Type: 0
              m_PreserveAspect: 0
              m_FillCenter: 1
              m_FillMethod: 4
              m_FillAmount: 1
              m_FillClockwise: 1
              m_FillOrigin: 0
              m_UseSpriteMesh: 0
              m_PixelsPerUnitMultiplier: 1
            --- !u!1 &6917422510692285691
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 369232107417445404}
              - component: {fileID: 1832194485502794143}
              - component: {fileID: 2306712374265622390}
              m_Layer: 0
              m_Name: Text
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &369232107417445404
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 6917422510692285691}
              m_LocalRotation: {x: -0, y: -0, z: -0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children: []
              m_Father: {fileID: 2168552727934459005}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 0}
              m_AnchorMax: {x: 1, y: 1}
              m_AnchoredPosition: {x: 0, y: 0}
              m_SizeDelta: {x: 0, y: 0}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!222 &1832194485502794143
            CanvasRenderer:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 6917422510692285691}
              m_CullTransparentMesh: 0
            --- !u!114 &2306712374265622390
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 6917422510692285691}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: 5f7201a12d95ffc409449d95f23cf332, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Material: {fileID: 0}
              m_Color: {r: 0.19607843, g: 0.19607843, b: 0.19607843, a: 1}
              m_RaycastTarget: 0
              m_RaycastPadding: {x: 0, y: 0, z: 0, w: 0}
              m_Maskable: 1
              m_OnCullStateChanged:
                m_PersistentCalls:
                  m_Calls: []
              m_FontData:
                m_Font: {fileID: 10102, guid: 0000000000000000e000000000000000, type: 0}
                m_FontSize: 50
                m_FontStyle: 0
                m_BestFit: 0
                m_MinSize: 5
                m_MaxSize: 50
                m_Alignment: 4
                m_AlignByGeometry: 0
                m_RichText: 1
                m_HorizontalOverflow: 0
                m_VerticalOverflow: 0
                m_LineSpacing: 1
              m_Text: ...Disabled...
            --- !u!1 &6948309544778429657
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 8456134673103193863}
              - component: {fileID: 5268161767163670385}
              - component: {fileID: 4298248739195411512}
              m_Layer: 0
              m_Name: Border
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &8456134673103193863
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 6948309544778429657}
              m_LocalRotation: {x: 0, y: 0, z: 0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children: []
              m_Father: {fileID: 4877450149381548715}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 0}
              m_AnchorMax: {x: 1, y: 1}
              m_AnchoredPosition: {x: 0.00018310547, y: 0}
              m_SizeDelta: {x: 0, y: 0}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!222 &5268161767163670385
            CanvasRenderer:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 6948309544778429657}
              m_CullTransparentMesh: 0
            --- !u!114 &4298248739195411512
            """;
    private final String prefab_3_1_1 = """
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 6948309544778429657}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: fe87c0e1cc204ed48ad3b37840f39efc, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Material: {fileID: 0}
              m_Color: {r: 1, g: 1, b: 1, a: 1}
              m_RaycastTarget: 0
              m_RaycastPadding: {x: 0, y: 0, z: 0, w: 0}
              m_Maskable: 1
              m_OnCullStateChanged:
                m_PersistentCalls:
                  m_Calls: []
              m_Sprite: {fileID: 21300000, guid: 216faa4d4dd65394b93796bbe0a64e9d, type: 3}
              m_Type: 1
              m_PreserveAspect: 0
              m_FillCenter: 1
              m_FillMethod: 4
              m_FillAmount: 1
              m_FillClockwise: 1
              m_FillOrigin: 0
              m_UseSpriteMesh: 0
              m_PixelsPerUnitMultiplier: 100
            --- !u!1 &7004955399733993265
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 228314147799774320}
              - component: {fileID: 3017651661292595432}
              - component: {fileID: 4995458067985902795}
              m_Layer: 0
              m_Name: Background
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &228314147799774320
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 7004955399733993265}
              m_LocalRotation: {x: -0, y: -0, z: -0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children:
              - {fileID: 2353928062890371715}
              m_Father: {fileID: 8444635903433234331}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 0}
              m_AnchorMax: {x: 1, y: 1}
              m_AnchoredPosition: {x: 0.00024414062, y: 0}
              m_SizeDelta: {x: 0, y: 0}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!222 &3017651661292595432
            CanvasRenderer:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 7004955399733993265}
              m_CullTransparentMesh: 0
            --- !u!114 &4995458067985902795
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 7004955399733993265}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: fe87c0e1cc204ed48ad3b37840f39efc, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Material: {fileID: 0}
              m_Color: {r: 0.08627451, g: 0.10980393, b: 0.20784315, a: 1}
              m_RaycastTarget: 0
              m_RaycastPadding: {x: 0, y: 0, z: 0, w: 0}
              m_Maskable: 1
              m_OnCullStateChanged:
                m_PersistentCalls:
                  m_Calls: []
              m_Sprite: {fileID: 10907, guid: 0000000000000000f000000000000000, type: 0}
              m_Type: 1
              m_PreserveAspect: 0
              m_FillCenter: 1
              m_FillMethod: 4
              m_FillAmount: 1
              m_FillClockwise: 1
              m_FillOrigin: 0
              m_UseSpriteMesh: 0
              m_PixelsPerUnitMultiplier: 1
            --- !u!1 &7015362868771442233
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 7743207524630606701}
              - component: {fileID: 6503652739143690050}
              - component: {fileID: 1991566094167120013}
              m_Layer: 0
              m_Name: PlayImage
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &7743207524630606701
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 7015362868771442233}
              m_LocalRotation: {x: 0, y: 0, z: 0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children: []
              m_Father: {fileID: 7857505150913508840}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 1, y: 0.5}
              m_AnchorMax: {x: 1, y: 0.5}
              m_AnchoredPosition: {x: -25, y: 0}
              m_SizeDelta: {x: 100, y: 100}
              m_Pivot: {x: 1, y: 0.5}
            --- !u!222 &6503652739143690050
            CanvasRenderer:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 7015362868771442233}
              m_CullTransparentMesh: 0
            --- !u!114 &1991566094167120013
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 7015362868771442233}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: fe87c0e1cc204ed48ad3b37840f39efc, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Material: {fileID: 0}
              m_Color: {r: 1, g: 1, b: 1, a: 1}
              m_RaycastTarget: 0
              m_RaycastPadding: {x: 0, y: 0, z: 0, w: 0}
              m_Maskable: 1
              m_OnCullStateChanged:
                m_PersistentCalls:
                  m_Calls: []
              m_Sprite: {fileID: 21300000, guid: 384f822110a9c3944a26b713c6fb2a7d, type: 3}
              m_Type: 0
              m_PreserveAspect: 0
              m_FillCenter: 1
              m_FillMethod: 4
              m_FillAmount: 1
              m_FillClockwise: 1
              m_FillOrigin: 0
              m_UseSpriteMesh: 0
              m_PixelsPerUnitMultiplier: 1
            --- !u!1 &7153337511754705605
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 6609980798008574657}
              - component: {fileID: 8099810465890966014}
              - component: {fileID: 4477167188010023065}
              m_Layer: 0
              m_Name: PlayImage
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &6609980798008574657
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 7153337511754705605}
              m_LocalRotation: {x: 0, y: 0, z: 0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children: []
              m_Father: {fileID: 7350327250546647802}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 1, y: 0.5}
              m_AnchorMax: {x: 1, y: 0.5}
              m_AnchoredPosition: {x: -25, y: 0}
              m_SizeDelta: {x: 100, y: 100}
              m_Pivot: {x: 1, y: 0.5}
            --- !u!222 &8099810465890966014
            CanvasRenderer:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 7153337511754705605}
              m_CullTransparentMesh: 0
            --- !u!114 &4477167188010023065
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 7153337511754705605}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: fe87c0e1cc204ed48ad3b37840f39efc, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Material: {fileID: 0}
              m_Color: {r: 1, g: 1, b: 1, a: 1}
              m_RaycastTarget: 0
              m_RaycastPadding: {x: 0, y: 0, z: 0, w: 0}
              m_Maskable: 1
              m_OnCullStateChanged:
                m_PersistentCalls:
                  m_Calls: []
              m_Sprite: {fileID: 21300000, guid: 384f822110a9c3944a26b713c6fb2a7d, type: 3}
              m_Type: 0
              m_PreserveAspect: 0
              m_FillCenter: 1
              m_FillMethod: 4
              m_FillAmount: 1
              m_FillClockwise: 1
              m_FillOrigin: 0
              m_UseSpriteMesh: 0
              m_PixelsPerUnitMultiplier: 1
            --- !u!1 &7210781817934580140
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 8016748804206962951}
              - component: {fileID: 8254687836600497742}
              - component: {fileID: 5682470023266708396}
              m_Layer: 0
              m_Name: Handle
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &8016748804206962951
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 7210781817934580140}
              m_LocalRotation: {x: -0, y: -0, z: -0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children: []
              m_Father: {fileID: 76702301997625104}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 0}
              m_AnchorMax: {x: 0, y: 1}
              m_AnchoredPosition: {x: 0, y: 0}
              m_SizeDelta: {x: 20, y: 0}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!222 &8254687836600497742
            CanvasRenderer:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 7210781817934580140}
              m_CullTransparentMesh: 0
            --- !u!114 &5682470023266708396
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 7210781817934580140}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: fe87c0e1cc204ed48ad3b37840f39efc, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Material: {fileID: 0}
              m_Color: {r: 1, g: 1, b: 1, a: 1}
              m_RaycastTarget: 1
              m_RaycastPadding: {x: 0, y: 0, z: 0, w: 0}
              m_Maskable: 1
              m_OnCullStateChanged:
                m_PersistentCalls:
                  m_Calls: []
              m_Sprite: {fileID: 10913, guid: 0000000000000000f000000000000000, type: 0}
              m_Type: 0
              m_PreserveAspect: 0
              m_FillCenter: 1
              m_FillMethod: 4
              m_FillAmount: 1
              m_FillClockwise: 1
              m_FillOrigin: 0
              m_UseSpriteMesh: 0
              m_PixelsPerUnitMultiplier: 1
            --- !u!1 &7277050752782849682
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 1086936176053939974}
              - component: {fileID: 8501726191048872454}
              - component: {fileID: 1781683614899428480}
              m_Layer: 0
              m_Name: Options
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &1086936176053939974
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 7277050752782849682}
              m_LocalRotation: {x: -0, y: -0, z: -0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children:
              - {fileID: 8339394409783589667}
              - {fileID: 2990098242172014402}
              - {fileID: 6731035202408777031}
              - {fileID: 5645916161197877870}
              m_Father: {fileID: 2883308272097404143}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 1, y: 1}
              m_AnchorMax: {x: 1, y: 1}
              m_AnchoredPosition: {x: 0.00024414062, y: 0}
              m_SizeDelta: {x: 275, y: 275}
              m_Pivot: {x: 1, y: 1}
            --- !u!114 &8501726191048872454
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 7277050752782849682}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: 4f0f87177aa34af1a49ad12ab913e53e, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              serializationData:
                SerializedFormat: 2
                SerializedBytes:\s
                ReferencedUnityObjects: []
                SerializedBytesString:\s
                Prefab: {fileID: 0}
                PrefabModificationsReferencedUnityObjects: []
                PrefabModifications: []
                SerializationNodes: []
              _udonSharpBackingUdonBehaviour: {fileID: 1781683614899428480}
              playlist: {fileID: 3961623450929242295}
              videoPlayerUI: {fileID: 3849271077191682197}
              togglePlayObjects:
              - {fileID: 5467187827395666499}
              - {fileID: 4521297134368707600}
              toggleStateObjects: []
              toggleShaffleObjects:
              - {fileID: 1764377442589154741}
            --- !u!114 &1781683614899428480
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 7277050752782849682}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: 45115577ef41a5b4ca741ed302693907, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              interactTextPlacement: {fileID: 0}
              interactText: Use
              interactTextGO: {fileID: 0}
              proximity: 2
              SynchronizePosition: 0
              AllowCollisionOwnershipTransfer: 0
              Reliable: 0
              _syncMethod: 0
              serializedProgramAsset: {fileID: 11400000, guid: cdb14cd93d9446c4da27d6f19e262f5f, type: 2}
              programSource: {fileID: 11400000, guid: 7578b39070616a94ba64b722d0e9d0b3, type: 2}
              serializedPublicVariablesBytesString: Ai8AAAAAATIAAABWAFIAQwAuAFUAZABvAG4ALgBDAG8AbQBtAG8AbgAuAFUAZABvAG4AVgBhAHIAaQBhAGIAbABlAFQAYQBiAGwAZQAsACAAVgBSAEMALgBVAGQAbwBuAC4AQwBvAG0AbQBvAG4AAAAAAAYBAAAAAAAAACcBBAAAAHQAeQBwAGUAAWgAAABTAHkAcwB0AGUAbQAuAEMAbwBsAGwAZQBjAHQAaQBvAG4AcwAuAEcAZQBuAGUAcgBpAGMALgBMAGkAcwB0AGAAMQBbAFsAVgBSAEMALgBVAGQAbwBuAC4AQwBvAG0AbQBvAG4ALgBJAG4AdABlAHIAZgBhAGMAZQBzAC4ASQBVAGQAbwBuAFYAYQByAGkAYQBiAGwAZQAsACAAVgBSAEMALgBVAGQAbwBuAC4AQwBvAG0AbQBvAG4AXQBdACwAIABtAHMAYwBvAHIAbABpAGIAAQEJAAAAVgBhAHIAaQBhAGIAbABlAHMALwEAAAABaAAAAFMAeQBzAHQAZQBtAC4AQwBvAGwAbABlAGMAdABpAG8AbgBzAC4ARwBlAG4AZQByAGkAYwAuAEwAaQBzAHQAYAAxAFsAWwBWAFIAQwAuAFUAZABvAG4ALgBDAG8AbQBtAG8AbgAuAEkAbgB0AGUAcgBmAGEAYwBlAHMALgBJAFUAZABvAG4AVgBhAHIAaQBhAGIAbABlACwAIABWAFIAQwAuAFUAZABvAG4ALgBDAG8AbQBtAG8AbgBdAF0ALAAgAG0AcwBjAG8AcgBsAGkAYgABAAAABgcAAAAAAAAAAi8CAAAAAVMAAABWAFIAQwAuAFUAZABvAG4ALgBDAG8AbQBtAG8AbgAuAFUAZABvAG4AVgBhAHIAaQBhAGIAbABlAGAAMQBbAFsAVgBSAEMALgBVAGQAbwBuAC4AVQBkAG8AbgBCAGUAaABhAHYAaQBvAHUAcgAsACAAVgBSAEMALgBVAGQAbwBuAF0AXQAsACAAVgBSAEMALgBVAGQAbwBuAC4AQwBvAG0AbQBvAG4AAgAAAAYCAAAAAAAAACcBBAAAAHQAeQBwAGUAARcAAABTAHkAcwB0AGUAbQAuAFMAdAByAGkAbgBnACwAIABtAHMAYwBvAHIAbABpAGIAJwEKAAAAUwB5AG0AYgBvAGwATgBhAG0AZQABCAAAAHAAbABhAHkAbABpAHMAdAAnAQQAAAB0AHkAcABlAAEgAAAAVgBSAEMALgBVAGQAbwBuAC4AVQBkAG8AbgBCAGUAaABhAHYAaQBvAHUAcgAsACAAVgBSAEMALgBVAGQAbwBuAAsBBQAAAFYAYQBsAHUAZQAAAAAABwUCLwMAAAABYwAAAFYAUgBDAC4AVQBkAG8AbgAuAEMAbwBtAG0AbwBuAC4AVQBkAG8AbgBWAGEAcgBpAGEAYgBsAGUAYAAxAFsAWwBVAG4AaQB0AHkARQBuAGcAaQBuAGUALgBHAGEAbQBlAE8AYgBqAGUAYwB0AFsAXQAsACAAVQBuAGkAdAB5AEUAbgBnAGkAbgBlAC4AQwBvAHIAZQBNAG8AZAB1AGwAZQBdAF0ALAAgAFYAUgBDAC4AVQBkAG8AbgAuAEMAbwBtAG0AbwBuAAMAAAAGAgAAAAAAAAAnAQQAAAB0AHkAcABlAAEXAAAAUwB5AHMAdABlAG0ALgBTAHQAcgBpAG4AZwAsACAAbQBzAGMAbwByAGwAaQBiACcBCgAAAFMAeQBtAGIAbwBsAE4AYQBtAGUAAREAAAB0AG8AZwBnAGwAZQBQAGwAYQB5AE8AYgBqAGUAYwB0AHMAJwEEAAAAdAB5AHAAZQABMAAAAFUAbgBpAHQAeQBFAG4AZwBpAG4AZQAuAEcAYQBtAGUATwBiAGoAZQBjAHQAWwBdACwAIABVAG4AaQB0AHkARQBuAGcAaQBuAGUALgBDAG8AcgBlAE0AbwBkAHUAbABlAAEBBQAAAFYAYQBsAHUAZQAvBAAAAAEwAAAAVQBuAGkAdAB5AEUAbgBnAGkAbgBlAC4ARwBhAG0AZQBPAGIAagBlAGMAdABbAF0ALAAgAFUAbgBpAHQAeQBFAG4AZwBpAG4AZQAuAEMAbwByAGUATQBvAGQAdQBsAGUABAAAAAYCAAAAAAAAAAwBAAAADAIAAAAHBQcFAjADAAAABQAAAAYCAAAAAAAAACcBBAAAAHQAeQBwAGUAARcAAABTAHkAcwB0AGUAbQAuAFMAdAByAGkAbgBnACwAIABtAHMAYwBvAHIAbABpAGIAJwEKAAAAUwB5AG0AYgBvAGwATgBhAG0AZQABEgAAAHQAbwBnAGcAbABlAFMAdABhAHQAZQBPAGIAagBlAGMAdABzACcBBAAAAHQAeQBwAGUAATAAAABVAG4AaQB0AHkARQBuAGcAaQBuAGUALgBHAGEAbQBlAE8AYgBqAGUAYwB0AFsAXQAsACAAVQBuAGkAdAB5AEUAbgBnAGkAbgBlAC4AQwBvAHIAZQBNAG8AZAB1AGwAZQABAQUAAABWAGEAbAB1AGUAMAQAAAAGAAAABgAAAAAAAAAABwUHBQIwAgAAAAcAAAAGAgAAAAAAAAAnAQQAAAB0AHkAcABlAAEXAAAAUwB5AHMAdABlAG0ALgBTAHQAcgBpAG4AZwAsACAAbQBzAGMAbwByAGwAaQBiACcBCgAAAFMAeQBtAGIAbwBsAE4AYQBtAGUAAQ0AAAB2AGkAZABlAG8AUABsAGEAeQBlAHIAVQBJACcBBAAAAHQAeQBwAGUAASAAAABWAFIAQwAuAFUAZABvAG4ALgBVAGQAbwBuAEIAZQBoAGEAdgBpAG8AdQByACwAIABWAFIAQwAuAFUAZABvAG4ACwEFAAAAVgBhAGwAdQBlAAMAAAAHBQIwAwAAAAgAAAAGAgAAAAAAAAAnAQQAAAB0AHkAcABlAAEXAAAAUwB5AHMAdABlAG0ALgBTAHQAcgBpAG4AZwAsACAAbQBzAGMAbwByAGwAaQBiACcBCgAAAFMAeQBtAGIAbwBsAE4AYQBtAGUAARQAAAB0AG8AZwBnAGwAZQBTAGgAYQBmAGYAbABlAE8AYgBqAGUAYwB0AHMAJwEEAAAAdAB5AHAAZQABMAAAAFUAbgBpAHQAeQBFAG4AZwBpAG4AZQAuAEcAYQBtAGUATwBiAGoAZQBjAHQAWwBdACwAIABVAG4AaQB0AHkARQBuAGcAaQBuAGUALgBDAG8AcgBlAE0AbwBkAHUAbABlAAEBBQAAAFYAYQBsAHUAZQAwBAAAAAkAAAAGAQAAAAAAAAAMBAAAAAcFBwUCLwUAAAABSQAAAFYAUgBDAC4AVQBkAG8AbgAuAEMAbwBtAG0AbwBuAC4AVQBkAG8AbgBWAGEAcgBpAGEAYgBsAGUAYAAxAFsAWwBTAHkAcwB0AGUAbQAuAEkAbgB0ADMAMgAsACAAbQBzAGMAbwByAGwAaQBiAF0AXQAsACAAVgBSAEMALgBVAGQAbwBuAC4AQwBvAG0AbQBvAG4ACgAAAAYCAAAAAAAAACcBBAAAAHQAeQBwAGUAARcAAABTAHkAcwB0AGUAbQAuAFMAdAByAGkAbgBnACwAIABtAHMAYwBvAHIAbABpAGIAJwEKAAAAUwB5AG0AYgBvAGwATgBhAG0AZQABHwAAAF8AXwBfAFUAZABvAG4AUwBoAGEAcgBwAEIAZQBoAGEAdgBpAG8AdQByAFYAZQByAHMAaQBvAG4AXwBfAF8AJwEEAAAAdAB5AHAAZQABFgAAAFMAeQBzAHQAZQBtAC4ASQBuAHQAMwAyACwAIABtAHMAYwBvAHIAbABpAGIAFwEFAAAAVgBhAGwAdQBlAAIAAAAHBQIvBgAAAAFLAAAAVgBSAEMALgBVAGQAbwBuAC4AQwBvAG0AbQBvAG4ALgBVAGQAbwBuAFYAYQByAGkAYQBiAGwAZQBgADEAWwBbAFMAeQBzAHQAZQBtAC4AQgBvAG8AbABlAGEAbgAsACAAbQBzAGMAbwByAGwAaQBiAF0AXQAsACAAVgBSAEMALgBVAGQAbwBuAC4AQwBvAG0AbQBvAG4ACwAAAAYCAAAAAAAAACcBBAAAAHQAeQBwAGUAARcAAABTAHkAcwB0AGUAbQAuAFMAdAByAGkAbgBnACwAIABtAHMAYwBvAHIAbABpAGIAJwEKAAAAUwB5AG0AYgBvAGwATgBhAG0AZQABLgAAAF8AXwBfAFUAZABvAG4AUwBoAGEAcgBwAEIAZQBoAGEAdgBpAG8AdQByAFAAZQByAHMAaQBzAHQARABhAHQAYQBGAHIAbwBtAFUAcABnAHIAYQBkAGUAXwBfAF8AJwEEAAAAdAB5AHAAZQABGAAAAFMAeQBzAHQAZQBtAC4AQgBvAG8AbABlAGEAbgAsACAAbQBzAGMAbwByAGwAaQBiACsBBQAAAFYAYQBsAHUAZQABBwUHBQcF
              publicVariablesUnityEngineObjects:
              - {fileID: 8719620524618765563}
              - {fileID: 5467187827395666499}
              - {fileID: 4521297134368707600}
              - {fileID: 4914362879625457859}
              - {fileID: 1764377442589154741}
              publicVariablesSerializationDataFormat: 0
            --- !u!1 &7424371845927169648
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 7350327250546647802}
              - component: {fileID: 7874781055389180306}
              m_Layer: 0
              m_Name: Video (0)
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &7350327250546647802
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 7424371845927169648}
              m_LocalRotation: {x: 0, y: 0, z: 0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children:
              - {fileID: 7769247004390636069}
              - {fileID: 8092769853755633580}
              - {fileID: 4305859099649409165}
              - {fileID: 6609980798008574657}
              - {fileID: 7115323959217603151}
              - {fileID: 6042214220864092933}
              m_Father: {fileID: 3997900497835806772}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 0}
              m_AnchorMax: {x: 0, y: 0}
              m_AnchoredPosition: {x: 0, y: 0}
              m_SizeDelta: {x: 875, y: 125}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!114 &7874781055389180306
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 7424371845927169648}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: 306cc8c2b49d7114eaa3623786fc2126, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_IgnoreLayout: 0
              m_MinWidth: -1
              m_MinHeight: -1
              m_PreferredWidth: -1
              m_PreferredHeight: -1
              m_FlexibleWidth: -1
              m_FlexibleHeight: -1
              m_LayoutPriority: 1
            --- !u!1 &7517014680683096424
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 5106652716670690547}
              - component: {fileID: 1598634961178185154}
              - component: {fileID: 5704945600723577830}
              m_Layer: 0
              m_Name: Handle
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &5106652716670690547
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 7517014680683096424}
              m_LocalRotation: {x: -0, y: -0, z: -0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children: []
              m_Father: {fileID: 6732248666137122163}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 0}
              m_AnchorMax: {x: 0, y: 0}
              m_AnchoredPosition: {x: 0, y: 0}
              m_SizeDelta: {x: 20, y: 0}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!222 &1598634961178185154
            CanvasRenderer:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 7517014680683096424}
              m_CullTransparentMesh: 0
            --- !u!114 &5704945600723577830
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 7517014680683096424}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: fe87c0e1cc204ed48ad3b37840f39efc, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Material: {fileID: 0}
              m_Color: {r: 1, g: 1, b: 1, a: 1}
              m_RaycastTarget: 1
              m_RaycastPadding: {x: 0, y: 0, z: 0, w: 0}
              m_Maskable: 1
              m_OnCullStateChanged:
                m_PersistentCalls:
                  m_Calls: []
              m_Sprite: {fileID: 10913, guid: 0000000000000000f000000000000000, type: 0}
              m_Type: 0
              m_PreserveAspect: 0
              m_FillCenter: 1
              m_FillMethod: 4
              m_FillAmount: 1
              m_FillClockwise: 1
              m_FillOrigin: 0
              m_UseSpriteMesh: 0
              m_PixelsPerUnitMultiplier: 1
            --- !u!1 &7573690124961550525
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 8444635903433234331}
              m_Layer: 0
              m_Name: PlaylistImpl
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &8444635903433234331
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 7573690124961550525}
              m_LocalRotation: {x: 0, y: 0, z: 0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children:
              - {fileID: 228314147799774320}
              - {fileID: 5356571935761165568}
              - {fileID: 184951645298031073}
              m_Father: {fileID: 2883308272097404143}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0.5, y: 1}
              m_AnchorMax: {x: 0.5, y: 1}
              m_AnchoredPosition: {x: 0.00023841858, y: -275}
              m_SizeDelta: {x: 1000, y: 1325}
              m_Pivot: {x: 0.5, y: 1}
            --- !u!1 &7694134497795062212
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 7669539292746388375}
              m_Layer: 0
              m_Name: Handle Slide Area
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 0
            --- !u!224 &7669539292746388375
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 7694134497795062212}
              m_LocalRotation: {x: -0, y: -0, z: -0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children:
              - {fileID: 636369983616548230}
              m_Father: {fileID: 7000310308953728327}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 0}
              m_AnchorMax: {x: 1, y: 1}
              m_AnchoredPosition: {x: 0, y: 0}
              m_SizeDelta: {x: -20, y: 0}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!1 &7709930802089237603
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 1366479644813552158}
              - component: {fileID: 3381339110383109051}
              m_Layer: 0
              m_Name: Progress
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &1366479644813552158
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 7709930802089237603}
              m_LocalRotation: {x: 0, y: 0, z: 0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children:
              - {fileID: 7486548024163598367}
              - {fileID: 1509937527601786290}
              m_Father: {fileID: 7857505150913508840}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 0}
              m_AnchorMax: {x: 1, y: 1}
              m_AnchoredPosition: {x: 0, y: 0}
              m_SizeDelta: {x: 0, y: 0}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!114 &3381339110383109051
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 7709930802089237603}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: 67db9e8f0e2ae9c40bc1e2b64352a6b4, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Navigation:
                m_Mode: 3
                m_WrapAround: 0
                m_SelectOnUp: {fileID: 0}
                m_SelectOnDown: {fileID: 0}
                m_SelectOnLeft: {fileID: 0}
                m_SelectOnRight: {fileID: 0}
              m_Transition: 1
              m_Colors:
                m_NormalColor: {r: 1, g: 1, b: 1, a: 1}
                m_HighlightedColor: {r: 0.9607843, g: 0.9607843, b: 0.9607843, a: 1}
                m_PressedColor: {r: 0.78431374, g: 0.78431374, b: 0.78431374, a: 1}
                m_SelectedColor: {r: 0.9607843, g: 0.9607843, b: 0.9607843, a: 1}
                m_DisabledColor: {r: 0.78431374, g: 0.78431374, b: 0.78431374, a: 0.5019608}
                m_ColorMultiplier: 1
                m_FadeDuration: 0.1
              m_SpriteState:
                m_HighlightedSprite: {fileID: 0}
                m_PressedSprite: {fileID: 0}
                m_SelectedSprite: {fileID: 0}
                m_DisabledSprite: {fileID: 0}
              m_AnimationTriggers:
                m_NormalTrigger: Normal
                m_HighlightedTrigger: Highlighted
                m_PressedTrigger: Pressed
                m_SelectedTrigger: Selected
                m_DisabledTrigger: Disabled
              m_Interactable: 1
              m_TargetGraphic: {fileID: 5124015413181708286}
              m_FillRect: {fileID: 5970753678236335850}
              m_HandleRect: {fileID: 6930416377365981363}
              m_Direction: 0
              m_MinValue: 0
              m_MaxValue: 1
              m_WholeNumbers: 0
              m_Value: 0
              m_OnValueChanged:
                m_PersistentCalls:
                  m_Calls: []
            --- !u!1 &7754368531717926627
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 7015134652876090146}
              - component: {fileID: 1098951363468394956}
              - component: {fileID: 8900501810017793044}
              m_Layer: 0
              m_Name: Background
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &7015134652876090146
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 7754368531717926627}
              m_LocalRotation: {x: 0, y: 0, z: 0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children: []
              m_Father: {fileID: 4403763568550604045}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 0}
              m_AnchorMax: {x: 1, y: 1}
              m_AnchoredPosition: {x: 0.00018310547, y: 0}
              m_SizeDelta: {x: 0, y: 0}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!222 &1098951363468394956
            CanvasRenderer:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 7754368531717926627}
              m_CullTransparentMesh: 0
            --- !u!114 &8900501810017793044
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 7754368531717926627}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: fe87c0e1cc204ed48ad3b37840f39efc, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Material: {fileID: 0}
              m_Color: {r: 0.23104306, g: 0.27194327, b: 0.41509432, a: 1}
              m_RaycastTarget: 0
              m_RaycastPadding: {x: 0, y: 0, z: 0, w: 0}
              m_Maskable: 1
              m_OnCullStateChanged:
                m_PersistentCalls:
                  m_Calls: []
              m_Sprite: {fileID: 0}
              m_Type: 0
              m_PreserveAspect: 0
              m_FillCenter: 1
              m_FillMethod: 4
              m_FillAmount: 1
              m_FillClockwise: 1
              m_FillOrigin: 0
              m_UseSpriteMesh: 0
              m_PixelsPerUnitMultiplier: 1
            --- !u!1 &7838233612397442950
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 1128181486876762500}
              - component: {fileID: 7211521859375556143}
              - component: {fileID: 8193352056505944059}
              m_Layer: 0
              m_Name: Description
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &1128181486876762500
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 7838233612397442950}
              m_LocalRotation: {x: 0, y: 0, z: 0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children: []
              m_Father: {fileID: 4403763568550604045}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 0.5}
              m_AnchorMax: {x: 0, y: 0.5}
              m_AnchoredPosition: {x: 25, y: 0}
              m_SizeDelta: {x: 725, y: 125}
              m_Pivot: {x: 0, y: 0.5}
            --- !u!222 &7211521859375556143
            CanvasRenderer:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 7838233612397442950}
              m_CullTransparentMesh: 0
            --- !u!114 &8193352056505944059
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 7838233612397442950}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: 5f7201a12d95ffc409449d95f23cf332, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Material: {fileID: 0}
              m_Color: {r: 1, g: 1, b: 1, a: 1}
              m_RaycastTarget: 0
              m_RaycastPadding: {x: 0, y: 0, z: 0, w: 0}
              m_Maskable: 1
              m_OnCullStateChanged:
                m_PersistentCalls:
                  m_Calls: []
              m_FontData:
                m_Font: {fileID: 10102, guid: 0000000000000000e000000000000000, type: 0}
                m_FontSize: 50
                m_FontStyle: 0
                m_BestFit: 0
                m_MinSize: 0
                m_MaxSize: 50
                m_Alignment: 3
                m_AlignByGeometry: 0
                m_RichText: 1
                m_HorizontalOverflow: 0
                m_VerticalOverflow: 0
                m_LineSpacing: 1
              m_Text: "\\u3010Minecraft (Java / BE)\\u53C2\\u52A0\\u578B\\u3011Minecraft\\u9678\\u4E0A\\u3057\\u3088\\u3046\\u3084"
            --- !u!1 &7864960810768174480
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 7497332400807042825}
              m_Layer: 0
              m_Name: Loading Cover
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 0
            --- !u!224 &7497332400807042825
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 7864960810768174480}
              m_LocalRotation: {x: 0, y: 0, z: 0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children:
              - {fileID: 2469437045312321982}
              - {fileID: 9116700255612368087}
              - {fileID: 1433776070031635731}
              - {fileID: 5186669144474402630}
              m_Father: {fileID: 184951645298031073}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 0}
              m_AnchorMax: {x: 1, y: 1}
              m_AnchoredPosition: {x: -0.00024414062, y: 0}
              m_SizeDelta: {x: 0, y: 0}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!1 &7885634052804426938
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 9195942709539212430}
              - component: {fileID: 479515373961231539}
              - component: {fileID: 2463507873658126959}
              m_Layer: 0
              m_Name: Image
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &9195942709539212430
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 7885634052804426938}
              m_LocalRotation: {x: 0, y: 0, z: 0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children: []
              m_Father: {fileID: 2883308272097404143}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 0}
              m_AnchorMax: {x: 1, y: 1}
              m_AnchoredPosition: {x: 0.00024414062, y: 0}
              m_SizeDelta: {x: 0, y: 0}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!222 &479515373961231539
            CanvasRenderer:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 7885634052804426938}
              m_CullTransparentMesh: 0
            --- !u!114 &2463507873658126959
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 7885634052804426938}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: fe87c0e1cc204ed48ad3b37840f39efc, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Material: {fileID: 0}
              m_Color: {r: 1, g: 1, b: 1, a: 1}
              m_RaycastTarget: 0
              m_RaycastPadding: {x: 0, y: 0, z: 0, w: 0}
              m_Maskable: 1
              m_OnCullStateChanged:
                m_PersistentCalls:
                  m_Calls: []
              m_Sprite: {fileID: 21300000, guid: 216faa4d4dd65394b93796bbe0a64e9d, type: 3}
              m_Type: 1
              m_PreserveAspect: 0
              m_FillCenter: 1
              m_FillMethod: 4
              m_FillAmount: 1
              m_FillClockwise: 1
              m_FillOrigin: 0
              m_UseSpriteMesh: 0
              m_PixelsPerUnitMultiplier: 70
            --- !u!1 &7903042954910265953
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 5200865148158758191}
              - component: {fileID: 352039591324307363}
              m_Layer: 0
              m_Name: Progress
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &5200865148158758191
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 7903042954910265953}
              m_LocalRotation: {x: 0, y: 0, z: 0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children:
              - {fileID: 2430640025230488314}
              - {fileID: 1319043205087142584}
              m_Father: {fileID: 4877450149381548715}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 0}
              m_AnchorMax: {x: 1, y: 1}
              m_AnchoredPosition: {x: 0, y: 0}
              m_SizeDelta: {x: 0, y: 0}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!114 &352039591324307363
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 7903042954910265953}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: 67db9e8f0e2ae9c40bc1e2b64352a6b4, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Navigation:
                m_Mode: 3
                m_WrapAround: 0
                m_SelectOnUp: {fileID: 0}
                m_SelectOnDown: {fileID: 0}
                m_SelectOnLeft: {fileID: 0}
                m_SelectOnRight: {fileID: 0}
              m_Transition: 1
              m_Colors:
                m_NormalColor: {r: 1, g: 1, b: 1, a: 1}
                m_HighlightedColor: {r: 0.9607843, g: 0.9607843, b: 0.9607843, a: 1}
                m_PressedColor: {r: 0.78431374, g: 0.78431374, b: 0.78431374, a: 1}
                m_SelectedColor: {r: 0.9607843, g: 0.9607843, b: 0.9607843, a: 1}
                m_DisabledColor: {r: 0.78431374, g: 0.78431374, b: 0.78431374, a: 0.5019608}
                m_ColorMultiplier: 1
                m_FadeDuration: 0.1
              m_SpriteState:
                m_HighlightedSprite: {fileID: 0}
                m_PressedSprite: {fileID: 0}
                m_SelectedSprite: {fileID: 0}
                m_DisabledSprite: {fileID: 0}
              m_AnimationTriggers:
                m_NormalTrigger: Normal
                m_HighlightedTrigger: Highlighted
                m_PressedTrigger: Pressed
                m_SelectedTrigger: Selected
                m_DisabledTrigger: Disabled
              m_Interactable: 1
              m_TargetGraphic: {fileID: 7143128325547975264}
              m_FillRect: {fileID: 3919897665625198716}
              m_HandleRect: {fileID: 4998853293347282404}
              m_Direction: 0
              m_MinValue: 0
              m_MaxValue: 1
              m_WholeNumbers: 0
              m_Value: 0
              m_OnValueChanged:
                m_PersistentCalls:
                  m_Calls: []
            --- !u!1 &7908031578811491527
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 4403763568550604045}
              - component: {fileID: 3504355760189093232}
              m_Layer: 0
              m_Name: Video (1)
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &4403763568550604045
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 7908031578811491527}
              m_LocalRotation: {x: 0, y: 0, z: 0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children:
              - {fileID: 7015134652876090146}
              - {fileID: 7000310308953728327}
              - {fileID: 7145056045384099220}
              - {fileID: 469618103028254595}
              - {fileID: 1128181486876762500}
              - {fileID: 718746110113320476}
              m_Father: {fileID: 3997900497835806772}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 0}
              m_AnchorMax: {x: 0, y: 0}
              m_AnchoredPosition: {x: 0, y: 0}
              m_SizeDelta: {x: 875, y: 125}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!114 &3504355760189093232
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 7908031578811491527}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: 306cc8c2b49d7114eaa3623786fc2126, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_IgnoreLayout: 0
              m_MinWidth: -1
              m_MinHeight: -1
              m_PreferredWidth: -1
              m_PreferredHeight: -1
              m_FlexibleWidth: -1
              m_FlexibleHeight: -1
              m_LayoutPriority: 1
            --- !u!1 &8033742630075709174
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 2168552727934459005}
              m_Layer: 0
              m_Name: DisableCover
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 0
            --- !u!224 &2168552727934459005
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 8033742630075709174}
              m_LocalRotation: {x: 0, y: 0, z: 0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children:
              - {fileID: 3923080477274634607}
              - {fileID: 369232107417445404}
              - {fileID: 3038827797441432696}
              - {fileID: 5176692844336501844}
              m_Father: {fileID: 184951645298031073}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 0}
              m_AnchorMax: {x: 1, y: 1}
              m_AnchoredPosition: {x: -0.00024414062, y: 0}
              m_SizeDelta: {x: 0, y: 0}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!1 &8202490728704125380
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 1143717302508411099}
              - component: {fileID: 7690341314931656244}
              - component: {fileID: 3697283718090279105}
              m_Layer: 0
              m_Name: Fill
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &1143717302508411099
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 8202490728704125380}
              m_LocalRotation: {x: -0, y: -0, z: -0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children: []
              m_Father: {fileID: 165530586570030590}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 0}
              m_AnchorMax: {x: 0, y: 0}
              m_AnchoredPosition: {x: 0, y: 0}
              m_SizeDelta: {x: 0, y: 0}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!222 &7690341314931656244
            CanvasRenderer:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 8202490728704125380}
              m_CullTransparentMesh: 0
            --- !u!114 &3697283718090279105
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 8202490728704125380}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: fe87c0e1cc204ed48ad3b37840f39efc, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Material: {fileID: 0}
              m_Color: {r: 0.0627451, g: 0.08627451, b: 0.16862746, a: 1}
              m_RaycastTarget: 1
              m_RaycastPadding: {x: 0, y: 0, z: 0, w: 0}
              m_Maskable: 1
              m_OnCullStateChanged:
                m_PersistentCalls:
                  m_Calls: []
              m_Sprite: {fileID: 0}
              m_Type: 1
              m_PreserveAspect: 0
              m_FillCenter: 1
              m_FillMethod: 4
              m_FillAmount: 1
              m_FillClockwise: 1
              m_FillOrigin: 0
              m_UseSpriteMesh: 0
              m_PixelsPerUnitMultiplier: 1
            --- !u!1 &8282211315277102945
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 3923080477274634607}
              - component: {fileID: 5882594106965878158}
              - component: {fileID: 9074171893509325713}
              m_Layer: 0
              m_Name: Image
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &3923080477274634607
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 8282211315277102945}
              m_LocalRotation: {x: -0, y: -0, z: -0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children: []
              m_Father: {fileID: 2168552727934459005}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 0}
              m_AnchorMax: {x: 1, y: 1}
              m_AnchoredPosition: {x: 0, y: 0}
              m_SizeDelta: {x: 0, y: 0}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!222 &5882594106965878158
            CanvasRenderer:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 8282211315277102945}
              m_CullTransparentMesh: 0
            --- !u!114 &9074171893509325713
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 8282211315277102945}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: fe87c0e1cc204ed48ad3b37840f39efc, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Material: {fileID: 0}
              m_Color: {r: 1, g: 1, b: 1, a: 1}
              m_RaycastTarget: 0
              m_RaycastPadding: {x: 0, y: 0, z: 0, w: 0}
              m_Maskable: 1
              m_OnCullStateChanged:
                m_PersistentCalls:
                  m_Calls: []
              m_Sprite: {fileID: 0}
              m_Type: 0
              m_PreserveAspect: 0
              m_FillCenter: 1
              m_FillMethod: 4
              m_FillAmount: 1
              m_FillClockwise: 1
              m_FillOrigin: 0
              m_UseSpriteMesh: 0
              m_PixelsPerUnitMultiplier: 1
            --- !u!1 &8363695451532837610
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 9105384691081664240}
              - component: {fileID: 3304798720305670830}
              - component: {fileID: 2999725488956304866}
              - component: {fileID: 2734621184167162928}
              m_Layer: 0
              m_Name: Button
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &9105384691081664240
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 8363695451532837610}
              m_LocalRotation: {x: 0, y: 0, z: 0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children: []
              m_Father: {fileID: 8813083786143252063}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 0}
              m_AnchorMax: {x: 1, y: 1}
              m_AnchoredPosition: {x: 0.00018310547, y: 0}
              m_SizeDelta: {x: 0, y: 0}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!222 &3304798720305670830
            CanvasRenderer:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 8363695451532837610}
              m_CullTransparentMesh: 0
            --- !u!114 &2999725488956304866
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 8363695451532837610}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: fe87c0e1cc204ed48ad3b37840f39efc, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Material: {fileID: 0}
              m_Color: {r: 1, g: 1, b: 1, a: 0}
              m_RaycastTarget: 1
              m_RaycastPadding: {x: 0, y: 0, z: 0, w: 0}
              m_Maskable: 1
              m_OnCullStateChanged:
                m_PersistentCalls:
                  m_Calls: []
              m_Sprite: {fileID: 10905, guid: 0000000000000000f000000000000000, type: 0}
              m_Type: 1
              m_PreserveAspect: 0
              m_FillCenter: 1
              m_FillMethod: 4
              m_FillAmount: 1
              m_FillClockwise: 1
              m_FillOrigin: 0
              m_UseSpriteMesh: 0
              m_PixelsPerUnitMultiplier: 1
            --- !u!114 &2734621184167162928
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 8363695451532837610}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: 4e29b1a8efbd4b44bb3f3716e73f07ff, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Navigation:
                m_Mode: 0
                m_WrapAround: 0
                m_SelectOnUp: {fileID: 0}
                m_SelectOnDown: {fileID: 0}
                m_SelectOnLeft: {fileID: 0}
                m_SelectOnRight: {fileID: 0}
              m_Transition: 1
              m_Colors:
                m_NormalColor: {r: 1, g: 1, b: 1, a: 1}
                m_HighlightedColor: {r: 0.9607843, g: 0.9607843, b: 0.9607843, a: 1}
                m_PressedColor: {r: 0.78431374, g: 0.78431374, b: 0.78431374, a: 1}
                m_SelectedColor: {r: 0.9607843, g: 0.9607843, b: 0.9607843, a: 1}
                m_DisabledColor: {r: 0.78431374, g: 0.78431374, b: 0.78431374, a: 0.5019608}
                m_ColorMultiplier: 1
                m_FadeDuration: 0.1
              m_SpriteState:
                m_HighlightedSprite: {fileID: 0}
                m_PressedSprite: {fileID: 0}
                m_SelectedSprite: {fileID: 0}
                m_DisabledSprite: {fileID: 0}
              m_AnimationTriggers:
                m_NormalTrigger: Normal
                m_HighlightedTrigger: Highlighted
                m_PressedTrigger: Pressed
                m_SelectedTrigger: Selected
                m_DisabledTrigger: Disabled
              m_Interactable: 1
              m_TargetGraphic: {fileID: 2999725488956304866}
              m_OnClick:
                m_PersistentCalls:
                  m_Calls:
                  - m_Target: {fileID: 2734621184167162928}
                    m_TargetAssemblyTypeName:\s
                    m_MethodName: set_interactable
                    m_Mode: 6
                    m_Arguments:
                      m_ObjectArgument: {fileID: 0}
                      m_ObjectArgumentAssemblyTypeName: UnityEngine.Object, UnityEngine
                      m_IntArgument: 0
                      m_FloatArgument: 0
                      m_StringArgument:\s
                      m_BoolArgument: 0
                    m_CallState: 2
                  - m_Target: {fileID: 8719620524618765563}
                    m_TargetAssemblyTypeName:\s
                    m_MethodName: SendCustomEvent
                    m_Mode: 5
                    m_Arguments:
                      m_ObjectArgument: {fileID: 0}
                      m_ObjectArgumentAssemblyTypeName: UnityEngine.Object, UnityEngine
                      m_IntArgument: 0
                      m_FloatArgument: 0
                      m_StringArgument: OnPlaylistSelected
                      m_BoolArgument: 0
                    m_CallState: 2
            --- !u!1 &8466378607257555769
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 696003539343156857}
              - component: {fileID: 1007210810973948472}
              - component: {fileID: 2770206363300491227}
              m_Layer: 0
              m_Name: PlayImage
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &696003539343156857
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 8466378607257555769}
              m_LocalRotation: {x: 0, y: 0, z: 0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children: []
              m_Father: {fileID: 1938720740041111393}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 1, y: 0.5}
              m_AnchorMax: {x: 1, y: 0.5}
              m_AnchoredPosition: {x: -25, y: 0}
              m_SizeDelta: {x: 100, y: 100}
              m_Pivot: {x: 1, y: 0.5}
            --- !u!222 &1007210810973948472
            CanvasRenderer:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 8466378607257555769}
              m_CullTransparentMesh: 0
            --- !u!114 &2770206363300491227
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 8466378607257555769}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: fe87c0e1cc204ed48ad3b37840f39efc, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Material: {fileID: 0}
              m_Color: {r: 1, g: 1, b: 1, a: 1}
              m_RaycastTarget: 0
              m_RaycastPadding: {x: 0, y: 0, z: 0, w: 0}
              m_Maskable: 1
              m_OnCullStateChanged:
                m_PersistentCalls:
                  m_Calls: []
              m_Sprite: {fileID: 21300000, guid: 384f822110a9c3944a26b713c6fb2a7d, type: 3}
              m_Type: 0
              m_PreserveAspect: 0
              m_FillCenter: 1
              m_FillMethod: 4
              m_FillAmount: 1
              m_FillClockwise: 1
              m_FillOrigin: 0
              m_UseSpriteMesh: 0
              m_PixelsPerUnitMultiplier: 1
            --- !u!1 &8576465994086297797
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 6731035202408777031}
              m_Layer: 0
              m_Name: PlayControll
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &6731035202408777031
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 8576465994086297797}
              m_LocalRotation: {x: 0, y: 0, z: 0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children:
              - {fileID: 7263813668479751333}
              - {fileID: 2225800770822693953}
              - {fileID: 4587917408688845233}
              - {fileID: 6315939899284031133}
              m_Father: {fileID: 1086936176053939974}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 1, y: 1}
              m_AnchorMax: {x: 1, y: 1}
              m_AnchoredPosition: {x: -25, y: -150}
              m_SizeDelta: {x: 100, y: 100}
              m_Pivot: {x: 1, y: 1}
            --- !u!1 &8688329330898230130
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 9116700255612368087}
              - component: {fileID: 7108238305321864830}
              - component: {fileID: 679976189750756619}
              m_Layer: 0
              m_Name: Text
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &9116700255612368087
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 8688329330898230130}
              m_LocalRotation: {x: -0, y: -0, z: -0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children: []
              m_Father: {fileID: 7497332400807042825}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 0}
              m_AnchorMax: {x: 1, y: 1}
              m_AnchoredPosition: {x: 0, y: 0}
              m_SizeDelta: {x: 0, y: 0}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!222 &7108238305321864830
            CanvasRenderer:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 8688329330898230130}
              m_CullTransparentMesh: 0
            --- !u!114 &679976189750756619
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 8688329330898230130}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: 5f7201a12d95ffc409449d95f23cf332, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Material: {fileID: 0}
              m_Color: {r: 0.19607843, g: 0.19607843, b: 0.19607843, a: 1}
              m_RaycastTarget: 0
              m_RaycastPadding: {x: 0, y: 0, z: 0, w: 0}
              m_Maskable: 1
              m_OnCullStateChanged:
                m_PersistentCalls:
                  m_Calls: []
              m_FontData:
                m_Font: {fileID: 10102, guid: 0000000000000000e000000000000000, type: 0}
                m_FontSize: 50
                m_FontStyle: 0
                m_BestFit: 0
                m_MinSize: 5
                m_MaxSize: 50
                m_Alignment: 4
                m_AlignByGeometry: 0
                m_RichText: 1
                m_HorizontalOverflow: 0
                m_VerticalOverflow: 0
                m_LineSpacing: 1
              m_Text: Loading...
            --- !u!1 &8754808572556576518
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 976683185954366752}
              - component: {fileID: 6283837539379117733}
              - component: {fileID: 728174687238883907}
              m_Layer: 0
              m_Name: Text
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &976683185954366752
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 8754808572556576518}
              m_LocalRotation: {x: -0, y: -0, z: -0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 0.5, y: 0.5, z: 0.5}
              m_ConstrainProportionsScale: 0
              m_Children: []
              m_Father: {fileID: 5240514629014260598}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 0}
              m_AnchorMax: {x: 1, y: 1}
              m_AnchoredPosition: {x: 0, y: 0}
              m_SizeDelta: {x: 0, y: 0}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!222 &6283837539379117733
            CanvasRenderer:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 8754808572556576518}
              m_CullTransparentMesh: 0
            --- !u!114 &728174687238883907
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 8754808572556576518}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: 5f7201a12d95ffc409449d95f23cf332, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Material: {fileID: 0}
              m_Color: {r: 1, g: 1, b: 1, a: 1}
              m_RaycastTarget: 0
              m_RaycastPadding: {x: 0, y: 0, z: 0, w: 0}
              m_Maskable: 1
              m_OnCullStateChanged:
                m_PersistentCalls:
                  m_Calls: []
              m_FontData:
                m_Font: {fileID: 10102, guid: 0000000000000000e000000000000000, type: 0}
                m_FontSize: 125
                m_FontStyle: 0
                m_BestFit: 0
                m_MinSize: 1
                m_MaxSize: 300
                m_Alignment: 4
                m_AlignByGeometry: 0
                m_RichText: 1
                m_HorizontalOverflow: 1
                m_VerticalOverflow: 1
                m_LineSpacing: 1
              m_Text: KineL Playlist
            --- !u!1 &8944619279711285454
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 7698234578515271508}
              m_Layer: 0
              m_Name: Handle Slide Area
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 0
            --- !u!224 &7698234578515271508
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 8944619279711285454}
              m_LocalRotation: {x: -0, y: -0, z: -0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children:
              - {fileID: 1650949901631161606}
              m_Father: {fileID: 8092769853755633580}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 0}
              m_AnchorMax: {x: 1, y: 1}
              m_AnchoredPosition: {x: 0, y: 0}
              m_SizeDelta: {x: -20, y: 0}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!1 &9077384433584702529
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 1509937527601786290}
              m_Layer: 0
              m_Name: Handle Slide Area
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 0
            --- !u!224 &1509937527601786290
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 9077384433584702529}
              m_LocalRotation: {x: -0, y: -0, z: -0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children:
              - {fileID: 6930416377365981363}
              m_Father: {fileID: 1366479644813552158}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 0}
              m_AnchorMax: {x: 1, y: 1}
              m_AnchoredPosition: {x: 0, y: 0}
              m_SizeDelta: {x: -20, y: 0}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!1001 &351151097323934632
            PrefabInstance:
              m_ObjectHideFlags: 0
              serializedVersion: 2
              m_Modification:
                serializedVersion: 3
                m_TransformParent: {fileID: 5240514629014260598}
                m_Modifications:
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_Pivot.x
                  value: 0.5
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_Pivot.y
                  value: 0.5
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_RootOrder
                  value: 0
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_AnchorMax.x
                  value: 1
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_AnchorMax.y
                  value: 1
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_AnchorMin.x
                  value: 0
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_AnchorMin.y
                  value: 0
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_SizeDelta.x
                  value: -50
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_SizeDelta.y
                  value: -50
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_LocalPosition.x
                  value: 0
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_LocalPosition.y
                  value: 0
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_LocalPosition.z
                  value: 0
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_LocalRotation.w
                  value: 1
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                """;
    private final String prefab_3_2 = """
                  propertyPath: m_LocalRotation.x
                  value: -0
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_LocalRotation.y
                  value: -0
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_LocalRotation.z
                  value: -0
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_AnchoredPosition.x
                  value: 0
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_AnchoredPosition.y
                  value: 0
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_LocalEulerAnglesHint.x
                  value: 0
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_LocalEulerAnglesHint.y
                  value: 0
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_LocalEulerAnglesHint.z
                  value: 0
                  objectReference: {fileID: 0}
                - target: {fileID: 8003914196579315128, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_Name
                  value: Border
                  objectReference: {fileID: 0}
                m_RemovedComponents: []
                m_RemovedGameObjects: []
                m_AddedGameObjects: []
                m_AddedComponents: []
              m_SourcePrefab: {fileID: 100100000, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
            --- !u!224 &6310511621513028516 stripped
            RectTransform:
              m_CorrespondingSourceObject: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
              m_PrefabInstance: {fileID: 351151097323934632}
              m_PrefabAsset: {fileID: 0}
            --- !u!1001 &542463102759326234
            PrefabInstance:
              m_ObjectHideFlags: 0
              serializedVersion: 2
              m_Modification:
                serializedVersion: 3
                m_TransformParent: {fileID: 2990098242172014402}
                m_Modifications:
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_Pivot.x
                  value: 0.5
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_Pivot.y
                  value: 0.5
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_RootOrder
                  value: 0
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_AnchorMax.x
                  value: 1
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_AnchorMax.y
                  value: 1
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_AnchorMin.x
                  value: 0
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_AnchorMin.y
                  value: 0
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_SizeDelta.x
                  value: 0
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_SizeDelta.y
                  value: 0
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_LocalPosition.x
                  value: 0
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_LocalPosition.y
                  value: 0
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_LocalPosition.z
                  value: 0
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_LocalRotation.w
                  value: 1
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_LocalRotation.x
                  value: -0
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_LocalRotation.y
                  value: -0
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_LocalRotation.z
                  value: -0
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_AnchoredPosition.x
                  value: 0.00012207031
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_AnchoredPosition.y
                  value: 0
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_LocalEulerAnglesHint.x
                  value: 0
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_LocalEulerAnglesHint.y
                  value: 0
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_LocalEulerAnglesHint.z
                  value: 0
                  objectReference: {fileID: 0}
                - target: {fileID: 8003914196579315128, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_Name
                  value: Border
                  objectReference: {fileID: 0}
                m_RemovedComponents: []
                m_RemovedGameObjects: []
                m_AddedGameObjects: []
                m_AddedComponents: []
              m_SourcePrefab: {fileID: 100100000, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
            --- !u!224 &6110203422684783126 stripped
            RectTransform:
              m_CorrespondingSourceObject: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
              m_PrefabInstance: {fileID: 542463102759326234}
              m_PrefabAsset: {fileID: 0}
            --- !u!1001 &3999964998966551721
            PrefabInstance:
              m_ObjectHideFlags: 0
              serializedVersion: 2
              m_Modification:
                serializedVersion: 3
                m_TransformParent: {fileID: 6731035202408777031}
                m_Modifications:
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_Pivot.x
                  value: 0.5
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_Pivot.y
                  value: 0.5
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_RootOrder
                  value: 0
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_AnchorMax.x
                  value: 1
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_AnchorMax.y
                  value: 1
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_AnchorMin.x
                  value: 0
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_AnchorMin.y
                  value: 0
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_SizeDelta.x
                  value: 0
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_SizeDelta.y
                  value: 0
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_LocalPosition.x
                  value: 0
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_LocalPosition.y
                  value: 0
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_LocalPosition.z
                  value: 0
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_LocalRotation.w
                  value: 1
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_LocalRotation.x
                  value: -0
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_LocalRotation.y
                  value: -0
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_LocalRotation.z
                  value: -0
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_AnchoredPosition.x
                  value: 0.00012207031
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_AnchoredPosition.y
                  value: 0
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_LocalEulerAnglesHint.x
                  value: 0
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_LocalEulerAnglesHint.y
                  value: 0
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_LocalEulerAnglesHint.z
                  value: 0
                  objectReference: {fileID: 0}
                - target: {fileID: 8003914196579315128, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_Name
                  value: Border
                  objectReference: {fileID: 0}
                m_RemovedComponents: []
                m_RemovedGameObjects: []
                m_AddedGameObjects: []
                m_AddedComponents: []
              m_SourcePrefab: {fileID: 100100000, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
            --- !u!224 &7263813668479751333 stripped
            RectTransform:
              m_CorrespondingSourceObject: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
              m_PrefabInstance: {fileID: 3999964998966551721}
              m_PrefabAsset: {fileID: 0}
            --- !u!1001 &4659309507557033247
            PrefabInstance:
              m_ObjectHideFlags: 0
              serializedVersion: 2
              m_Modification:
                serializedVersion: 3
                m_TransformParent: {fileID: 7497332400807042825}
                m_Modifications:
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_Pivot.x
                  value: 0.5
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_Pivot.y
                  value: 0.5
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_RootOrder
                  value: 2
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_AnchorMax.x
                  value: 1
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_AnchorMax.y
                  value: 1
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_AnchorMin.x
                  value: 0
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_AnchorMin.y
                  value: 0
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_SizeDelta.x
                  value: -50
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_SizeDelta.y
                  value: -50
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_LocalPosition.x
                  value: 0
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_LocalPosition.y
                  value: 0
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_LocalPosition.z
                  value: 0
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_LocalRotation.w
                  value: 1
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_LocalRotation.x
                  value: -0
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_LocalRotation.y
                  value: -0
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_LocalRotation.z
                  value: -0
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_AnchoredPosition.x
                  value: 0
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_AnchoredPosition.y
                  value: 0
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_LocalEulerAnglesHint.x
                  value: 0
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_LocalEulerAnglesHint.y
                  value: 0
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_LocalEulerAnglesHint.z
                  value: 0
                  objectReference: {fileID: 0}
                - target: {fileID: 8003914196579315128, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_Name
                  value: Border
                  objectReference: {fileID: 0}
                - target: {fileID: 9080105973089870490, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_Color.b
                  value: 0.16470589
                  objectReference: {fileID: 0}
                - target: {fileID: 9080105973089870490, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_Color.g
                  value: 0.08627451
                  objectReference: {fileID: 0}
                - target: {fileID: 9080105973089870490, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_Color.r
                  value: 0.050980397
                  objectReference: {fileID: 0}
                m_RemovedComponents: []
                m_RemovedGameObjects: []
                m_AddedGameObjects: []
                m_AddedComponents: []
              m_SourcePrefab: {fileID: 100100000, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
            --- !u!224 &1433776070031635731 stripped
            RectTransform:
              m_CorrespondingSourceObject: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
              m_PrefabInstance: {fileID: 4659309507557033247}
              m_PrefabAsset: {fileID: 0}
            --- !u!1001 &6653664535682006453
            PrefabInstance:
              m_ObjectHideFlags: 0
              serializedVersion: 2
              m_Modification:
                serializedVersion: 3
                m_TransformParent: {fileID: 8339394409783589667}
                m_Modifications:
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_Pivot.x
                  value: 0.5
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_Pivot.y
                  value: 0.5
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_RootOrder
                  value: 0
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_AnchorMax.x
                  value: 1
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_AnchorMax.y
                  value: 1
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_AnchorMin.x
                  value: 0
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_AnchorMin.y
                  value: 0
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_SizeDelta.x
                  value: 0
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_SizeDelta.y
                  value: 0
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_LocalPosition.x
                  value: 0
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_LocalPosition.y
                  value: 0
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_LocalPosition.z
                  value: 0
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_LocalRotation.w
                  value: 1
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_LocalRotation.x
                  value: -0
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_LocalRotation.y
                  value: -0
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_LocalRotation.z
                  value: -0
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_AnchoredPosition.x
                  value: 0.00012207031
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_AnchoredPosition.y
                  value: 0
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_LocalEulerAnglesHint.x
                  value: 0
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_LocalEulerAnglesHint.y
                  value: 0
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_LocalEulerAnglesHint.z
                  value: 0
                  objectReference: {fileID: 0}
                - target: {fileID: 8003914196579315128, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_Name
                  value: Border
                  objectReference: {fileID: 0}
                m_RemovedComponents: []
                m_RemovedGameObjects: []
                m_AddedGameObjects: []
                m_AddedComponents: []
              m_SourcePrefab: {fileID: 100100000, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
            --- !u!224 &1088299181368004025 stripped
            RectTransform:
              m_CorrespondingSourceObject: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
              m_PrefabInstance: {fileID: 6653664535682006453}
              m_PrefabAsset: {fileID: 0}
            --- !u!1001 &7120894229907938085
            PrefabInstance:
              m_ObjectHideFlags: 0
              serializedVersion: 2
              m_Modification:
                serializedVersion: 3
                m_TransformParent: {fileID: 1375125376929899666}
                m_Modifications:
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_Pivot.x
                  value: 0.5
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_Pivot.y
                  value: 0.5
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_RootOrder
                  value: 2
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_AnchorMax.x
                  value: 1
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_AnchorMax.y
                  value: 1
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_AnchorMin.x
                  value: 0
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_AnchorMin.y
                  value: 0
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_SizeDelta.x
                  value: -50
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_SizeDelta.y
                  value: -50
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_LocalPosition.x
                  value: 0
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_LocalPosition.y
                  value: 0
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_LocalPosition.z
                  value: 0
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_LocalRotation.w
                  value: 1
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_LocalRotation.x
                  value: -0
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_LocalRotation.y
                  value: -0
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_LocalRotation.z
                  value: -0
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_AnchoredPosition.x
                  value: 0
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_AnchoredPosition.y
                  value: 0
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_LocalEulerAnglesHint.x
                  value: 0
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_LocalEulerAnglesHint.y
                  value: 0
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_LocalEulerAnglesHint.z
                  value: 0
                  objectReference: {fileID: 0}
                - target: {fileID: 8003914196579315128, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_Name
                  value: Border
                  objectReference: {fileID: 0}
                - target: {fileID: 9080105973089870490, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_Color.b
                  value: 1
                  objectReference: {fileID: 0}
                - target: {fileID: 9080105973089870490, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_Color.g
                  value: 1
                  objectReference: {fileID: 0}
                - target: {fileID: 9080105973089870490, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_Color.r
                  value: 1
                  objectReference: {fileID: 0}
                m_RemovedComponents: []
                m_RemovedGameObjects: []
                m_AddedGameObjects: []
                m_AddedComponents: []
              m_SourcePrefab: {fileID: 100100000, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
            --- !u!224 &3575441803386809129 stripped
            RectTransform:
              m_CorrespondingSourceObject: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
              m_PrefabInstance: {fileID: 7120894229907938085}
              m_PrefabAsset: {fileID: 0}
            --- !u!1001 &7274139873395950500
            PrefabInstance:
              m_ObjectHideFlags: 0
              serializedVersion: 2
              m_Modification:
                serializedVersion: 3
                m_TransformParent: {fileID: 674453769890291478}
                m_Modifications:
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_Pivot.x
                  value: 0.5
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_Pivot.y
                  value: 0.5
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_RootOrder
                  value: 2
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_AnchorMax.x
                  value: 1
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_AnchorMax.y
                  value: 1
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_AnchorMin.x
                  value: 0
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_AnchorMin.y
                  value: 0
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_SizeDelta.x
                  value: -50
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_SizeDelta.y
                  value: -50
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_LocalPosition.x
                  value: 0
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_LocalPosition.y
                  value: 0
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_LocalPosition.z
                  value: 0
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_LocalRotation.w
                  value: 1
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_LocalRotation.x
                  value: -0
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_LocalRotation.y
                  value: -0
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_LocalRotation.z
                  value: -0
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_AnchoredPosition.x
                  value: 0
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_AnchoredPosition.y
                  value: 0
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_LocalEulerAnglesHint.x
                  value: 0
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_LocalEulerAnglesHint.y
                  value: 0
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_LocalEulerAnglesHint.z
                  value: 0
                  objectReference: {fileID: 0}
                - target: {fileID: 8003914196579315128, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_Name
                  value: Border
                  objectReference: {fileID: 0}
                - target: {fileID: 9080105973089870490, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_Color.b
                  value: 0.16470589
                  objectReference: {fileID: 0}
                - target: {fileID: 9080105973089870490, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_Color.g
                  value: 0.08627451
                  objectReference: {fileID: 0}
                - target: {fileID: 9080105973089870490, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_Color.r
                  value: 0.050980397
                  objectReference: {fileID: 0}
                m_RemovedComponents: []
                m_RemovedGameObjects: []
                m_AddedGameObjects: []
                m_AddedComponents: []
              m_SourcePrefab: {fileID: 100100000, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
            --- !u!224 &4016671412700591016 stripped
            RectTransform:
              m_CorrespondingSourceObject: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
              m_PrefabInstance: {fileID: 7274139873395950500}
              m_PrefabAsset: {fileID: 0}
            --- !u!1001 &8351415247019317903
            PrefabInstance:
              m_ObjectHideFlags: 0
              serializedVersion: 2
              m_Modification:
                serializedVersion: 3
                m_TransformParent: {fileID: 228314147799774320}
                m_Modifications:
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_Pivot.x
                  value: 0.5
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_Pivot.y
                  value: 0.5
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_RootOrder
                  value: 0
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_AnchorMax.x
                  value: 1
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_AnchorMax.y
                  value: 1
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_AnchorMin.x
                  value: 0
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_AnchorMin.y
                  value: 0
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_SizeDelta.x
                  value: -50
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_SizeDelta.y
                  value: -50
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_LocalPosition.x
                  value: 0
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_LocalPosition.y
                  value: 0
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_LocalPosition.z
                  value: 0
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_LocalRotation.w
                  value: 1
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_LocalRotation.x
                  value: -0
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_LocalRotation.y
                  value: -0
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_LocalRotation.z
                  value: -0
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_AnchoredPosition.x
                  value: 0
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_AnchoredPosition.y
                  value: 0
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_LocalEulerAnglesHint.x
                  value: 0
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_LocalEulerAnglesHint.y
                  value: 0
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_LocalEulerAnglesHint.z
                  value: 0
                  objectReference: {fileID: 0}
                - target: {fileID: 8003914196579315128, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_Name
                  value: Border
                  objectReference: {fileID: 0}
                m_RemovedComponents: []
                m_RemovedGameObjects: []
                m_AddedGameObjects: []
                m_AddedComponents: []
              m_SourcePrefab: {fileID: 100100000, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
            --- !u!224 &2353928062890371715 stripped
            RectTransform:
              m_CorrespondingSourceObject: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
              m_PrefabInstance: {fileID: 8351415247019317903}
              m_PrefabAsset: {fileID: 0}
            --- !u!1001 &8746253511243414644
            PrefabInstance:
              m_ObjectHideFlags: 0
              serializedVersion: 2
              m_Modification:
                serializedVersion: 3
                m_TransformParent: {fileID: 2168552727934459005}
                m_Modifications:
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_Pivot.x
                  value: 0.5
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_Pivot.y
                  value: 0.5
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_RootOrder
                  value: 2
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_AnchorMax.x
                  value: 1
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_AnchorMax.y
                  value: 1
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_AnchorMin.x
                  value: 0
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_AnchorMin.y
                  value: 0
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_SizeDelta.x
                  value: -50
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_SizeDelta.y
                  value: -50
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_LocalPosition.x
                  value: 0
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_LocalPosition.y
                  value: 0
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_LocalPosition.z
                  value: 0
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_LocalRotation.w
                  value: 1
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_LocalRotation.x
                  value: -0
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_LocalRotation.y
                  value: -0
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_LocalRotation.z
                  value: -0
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_AnchoredPosition.x
                  value: 0
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_AnchoredPosition.y
                  value: 0
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_LocalEulerAnglesHint.x
                  value: 0
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_LocalEulerAnglesHint.y
                  value: 0
                  objectReference: {fileID: 0}
                - target: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_LocalEulerAnglesHint.z
                  value: 0
                  objectReference: {fileID: 0}
                - target: {fileID: 8003914196579315128, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_Name
                  value: Border
                  objectReference: {fileID: 0}
                - target: {fileID: 9080105973089870490, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_Color.b
                  value: 0.16470589
                  objectReference: {fileID: 0}
                - target: {fileID: 9080105973089870490, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_Color.g
                  value: 0.08627451
                  objectReference: {fileID: 0}
                - target: {fileID: 9080105973089870490, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
                  propertyPath: m_Color.r
                  value: 0.050980397
                  objectReference: {fileID: 0}
                m_RemovedComponents: []
                m_RemovedGameObjects: []
                m_AddedGameObjects: []
                m_AddedComponents: []
              m_SourcePrefab: {fileID: 100100000, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
            --- !u!224 &3038827797441432696 stripped
            RectTransform:
              m_CorrespondingSourceObject: {fileID: 6002448323304845324, guid: f053c8ff1d253de46acaa1ec67726183, type: 3}
              m_PrefabInstance: {fileID: 8746253511243414644}
              m_PrefabAsset: {fileID: 0}
            
            """;

    @Override
    public void setUrls(List<PlayListData> urls) {
        this.urls = urls;
    }

    @Override
    public String getPrefab() {

        StringBuilder sb = new StringBuilder();
        sb.append(prefab_1);

        if (urls != null && !urls.isEmpty()){
            for (PlayListData url : urls) {
                sb.append(prefab_video.replaceAll("#title#", unicode(url.getTitle())).replaceAll("#url#", url.getVideoURL()));
            }
        }

        sb.append(prefab_2).append("\n").append(prefab_2_1);
        if (urls != null && !urls.isEmpty()) {
            for (PlayListData url : urls) {
                sb.append(prefab_video_titles.replaceAll("#title#", unicode(url.getTitle()))).append("\n");
            }
        }
        sb.append(prefab_2_2).append("\n");
        if (urls != null && !urls.isEmpty()){
            for (PlayListData url : urls) {
                sb.append(prefab_video_urls.replaceAll("#url#", url.getVideoURL())).append("\n");
            }
        }
        sb.append(prefab_video_mode);
        if (urls != null && !urls.isEmpty()){
            for (PlayListData url : urls) {
                sb.append("01000000");
            }
        }
        sb.append("\n").append(prefab_2_3).append("\n").append(prefab_3).append("\n").append(prefab_3_1).append("\n").append(prefab_3_1_1).append("\n").append(prefab_3_2);

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
