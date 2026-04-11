package net.nicovrc.dev.prefab;

import net.nicovrc.dev.data.PlayListData;

import java.util.List;

public class iwaSync implements Prefab {

    private final String prefab_1 = """
            %YAML 1.1
            %TAG !u! tag:unity3d.com,2011:
            --- !u!1 &479435889717785318
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 4339596841341581176}
              - component: {fileID: 8713013855667158665}
              - component: {fileID: 6383272956422481202}
              - component: {fileID: 2418545600125810789}
              m_Layer: 13
              m_Name: Panel
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &4339596841341581176
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 479435889717785318}
              m_LocalRotation: {x: 0, y: 0, z: 0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children:
              - {fileID: 5325228433000651842}
              - {fileID: 1632715719369580443}
              - {fileID: 4576857236179234047}
              m_Father: {fileID: 1151334024725314954}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 0}
              m_AnchorMax: {x: 1, y: 1}
              m_AnchoredPosition: {x: 0, y: 0}
              m_SizeDelta: {x: 0, y: 0}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!222 &8713013855667158665
            CanvasRenderer:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 479435889717785318}
              m_CullTransparentMesh: 0
            --- !u!114 &6383272956422481202
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 479435889717785318}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: fe87c0e1cc204ed48ad3b37840f39efc, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Material: {fileID: 0}
              m_Color: {r: 0.15294118, g: 0.16470589, b: 0.1882353, a: 1}
              m_RaycastTarget: 1
              m_RaycastPadding: {x: 0, y: 0, z: 0, w: 0}
              m_Maskable: 1
              m_OnCullStateChanged:
                m_PersistentCalls:
                  m_Calls: []
              m_Sprite: {fileID: 21300000, guid: 2c5d5e751b115aa468718c25d9a8a326, type: 3}
              m_Type: 1
              m_PreserveAspect: 0
              m_FillCenter: 1
              m_FillMethod: 4
              m_FillAmount: 1
              m_FillClockwise: 1
              m_FillOrigin: 0
              m_UseSpriteMesh: 0
              m_PixelsPerUnitMultiplier: 1
            --- !u!114 &2418545600125810789
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 479435889717785318}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: 59f8146938fff824cb5fd77236b75775, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Padding:
                m_Left: 0
                m_Right: 0
                m_Top: 0
                m_Bottom: 0
              m_ChildAlignment: 0
              m_Spacing: 3.75
              m_ChildForceExpandWidth: 1
              m_ChildForceExpandHeight: 0
              m_ChildControlWidth: 1
              m_ChildControlHeight: 1
              m_ChildScaleWidth: 0
              m_ChildScaleHeight: 0
              m_ReverseArrangement: 0
            --- !u!1 &547567507208223686
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 494099253239869537}
              - component: {fileID: 7222648296609638417}
              - component: {fileID: 1575367019220209623}
              m_Layer: 13
              m_Name: Version
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &494099253239869537
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 547567507208223686}
              m_LocalRotation: {x: -0, y: -0, z: -0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children:
              - {fileID: 6339390650912290090}
              - {fileID: 7810017541114829689}
              m_Father: {fileID: 5325228433000651842}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 0.5}
              m_AnchorMax: {x: 1, y: 0.5}
              m_AnchoredPosition: {x: 0, y: -3.125}
              m_SizeDelta: {x: -440, y: 62.5}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!222 &7222648296609638417
            CanvasRenderer:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 547567507208223686}
              m_CullTransparentMesh: 0
            --- !u!114 &1575367019220209623
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 547567507208223686}
              m_Enabled: 0
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: 30649d3a9faa99c48a7b1166b86bf2a0, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Padding:
                m_Left: 0
                m_Right: 0
                m_Top: 0
                m_Bottom: 0
              m_ChildAlignment: 4
              m_Spacing: 20
              m_ChildForceExpandWidth: 0
              m_ChildForceExpandHeight: 0
              m_ChildControlWidth: 0
              m_ChildControlHeight: 0
              m_ChildScaleWidth: 0
              m_ChildScaleHeight: 0
              m_ReverseArrangement: 0
            --- !u!1 &626937492251233715
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 1928177441973211619}
              - component: {fileID: 8556787525804913754}
              - component: {fileID: 3948455795044943763}
              - component: {fileID: 4236815980485617672}
              m_Layer: 13
              m_Name: Button
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &1928177441973211619
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 626937492251233715}
              m_LocalRotation: {x: -0, y: -0, z: -0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children:
              - {fileID: 2448357629403068181}
              m_Father: {fileID: 4066789520317656564}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 0}
              m_AnchorMax: {x: 1, y: 1}
              m_AnchoredPosition: {x: 0, y: 0}
              m_SizeDelta: {x: -7.5, y: -7.5}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!222 &8556787525804913754
            CanvasRenderer:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 626937492251233715}
              m_CullTransparentMesh: 0
            --- !u!114 &3948455795044943763
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 626937492251233715}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: fe87c0e1cc204ed48ad3b37840f39efc, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Material: {fileID: 0}
              m_Color: {r: 0.15280277, g: 0.16425171, b: 0.18823528, a: 1}
              m_RaycastTarget: 1
              m_RaycastPadding: {x: 0, y: 0, z: 0, w: 0}
              m_Maskable: 1
              m_OnCullStateChanged:
                m_PersistentCalls:
                  m_Calls: []
              m_Sprite: {fileID: 21300000, guid: 2cb05668260eb084c843ef950c38c6a7, type: 3}
              m_Type: 1
              m_PreserveAspect: 0
              m_FillCenter: 1
              m_FillMethod: 4
              m_FillAmount: 1
              m_FillClockwise: 1
              m_FillOrigin: 0
              m_UseSpriteMesh: 0
              m_PixelsPerUnitMultiplier: 1
            --- !u!114 &4236815980485617672
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 626937492251233715}
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
                m_SelectedTrigger: Highlighted
                m_DisabledTrigger: Disabled
              m_Interactable: 1
              m_TargetGraphic: {fileID: 3948455795044943763}
              m_OnClick:
                m_PersistentCalls:
                  m_Calls:
                  - m_Target: {fileID: 2474281132889786057}
                    m_TargetAssemblyTypeName:\s
                    m_MethodName: SendCustomEvent
                    m_Mode: 5
                    m_Arguments:
                      m_ObjectArgument: {fileID: 0}
                      m_ObjectArgumentAssemblyTypeName: UnityEngine.Object, UnityEngine
                      m_IntArgument: 0
                      m_FloatArgument: 0
                      m_StringArgument: LockOn
                      m_BoolArgument: 0
                    m_CallState: 2
            --- !u!1 &687466005867618090
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 7882450243436679629}
              - component: {fileID: 7212698786421586162}
              - component: {fileID: 2418637605680575888}
              - component: {fileID: 6881182593475979049}
              - component: {fileID: 8239590477793910092}
              m_Layer: 13
              m_Name: Scroll View
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &7882450243436679629
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 687466005867618090}
              m_LocalRotation: {x: -0, y: -0, z: -0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children:
              - {fileID: 5499885433104126674}
              - {fileID: 5607099280381067196}
              m_Father: {fileID: 4576857236179234047}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 0}
              m_AnchorMax: {x: 1, y: 1}
              m_AnchoredPosition: {x: 0, y: 0}
              m_SizeDelta: {x: -12.5, y: 0}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!222 &7212698786421586162
            CanvasRenderer:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 687466005867618090}
              m_CullTransparentMesh: 0
            --- !u!114 &2418637605680575888
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 687466005867618090}
              m_Enabled: 0
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: fe87c0e1cc204ed48ad3b37840f39efc, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Material: {fileID: 0}
              m_Color: {r: 1, g: 1, b: 1, a: 0.392}
              m_RaycastTarget: 1
              m_RaycastPadding: {x: 0, y: 0, z: 0, w: 0}
              m_Maskable: 1
              m_OnCullStateChanged:
                m_PersistentCalls:
                  m_Calls: []
              m_Sprite: {fileID: 21300000, guid: 2c5d5e751b115aa468718c25d9a8a326, type: 3}
              m_Type: 1
              m_PreserveAspect: 0
              m_FillCenter: 1
              m_FillMethod: 4
              m_FillAmount: 1
              m_FillClockwise: 1
              m_FillOrigin: 0
              m_UseSpriteMesh: 0
              m_PixelsPerUnitMultiplier: 1
            --- !u!114 &6881182593475979049
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 687466005867618090}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: 1aa08ab6e0800fa44ae55d278d1423e3, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Content: {fileID: 8591821334734587905}
              m_Horizontal: 0
              m_Vertical: 1
              m_MovementType: 2
              m_Elasticity: 0
              m_Inertia: 1
              m_DecelerationRate: 0.135
              m_ScrollSensitivity: 0
              m_Viewport: {fileID: 5499885433104126674}
              m_HorizontalScrollbar: {fileID: 0}
              m_VerticalScrollbar: {fileID: 2454895572338598471}
              m_HorizontalScrollbarVisibility: 2
              m_VerticalScrollbarVisibility: 2
              m_HorizontalScrollbarSpacing: 0
              m_VerticalScrollbarSpacing: 0
              m_OnValueChanged:
                m_PersistentCalls:
                  m_Calls: []
            --- !u!114 &8239590477793910092
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 687466005867618090}
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
              m_FlexibleHeight: 10000
              m_LayoutPriority: 1
            --- !u!1 &798337625395836380
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 7810017541114829689}
              - component: {fileID: 2457816556939511912}
              - component: {fileID: 1576297583121829978}
              - component: {fileID: 2555566610925443332}
              m_Layer: 13
              m_Name: Text
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &7810017541114829689
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 798337625395836380}
              m_LocalRotation: {x: -0, y: -0, z: -0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children: []
              m_Father: {fileID: 494099253239869537}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 1}
              m_AnchorMax: {x: 0, y: 1}
              m_AnchoredPosition: {x: 170, y: -31.25}
              m_SizeDelta: {x: 0, y: 40}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!222 &2457816556939511912
            CanvasRenderer:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 798337625395836380}
              m_CullTransparentMesh: 0
            --- !u!114 &1576297583121829978
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 798337625395836380}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: 5f7201a12d95ffc409449d95f23cf332, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Material: {fileID: 0}
              m_Color: {r: 0.27843136, g: 0.94573176, b: 1, a: 1}
              m_RaycastTarget: 0
              m_RaycastPadding: {x: 0, y: 0, z: 0, w: 0}
              m_Maskable: 1
              m_OnCullStateChanged:
                m_PersistentCalls:
                  m_Calls: []
              m_FontData:
                m_Font: {fileID: 10102, guid: 0000000000000000e000000000000000, type: 0}
                m_FontSize: 23
                m_FontStyle: 0
                m_BestFit: 0
                m_MinSize: 0
                m_MaxSize: 300
                m_Alignment: 4
                m_AlignByGeometry: 0
                m_RichText: 1
                m_HorizontalOverflow: 0
                m_VerticalOverflow: 0
                m_LineSpacing: 1
              m_Text: iwaSync3 (Playlist)
            --- !u!114 &2555566610925443332
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 798337625395836380}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: 3245ec927659c4140ac4f8d17403cc18, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_HorizontalFit: 2
              m_VerticalFit: 0
            --- !u!1 &854098791254705238
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 2972499952988653430}
              - component: {fileID: 662279813877233663}
              - component: {fileID: 8285888635146805326}
              m_Layer: 13
              m_Name: Forward
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &2972499952988653430
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 854098791254705238}
              m_LocalRotation: {x: -0, y: -0, z: -0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children:
              - {fileID: 7381411783862258488}
              m_Father: {fileID: 5325228433000651842}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0.5, y: 0.5}
              m_AnchorMax: {x: 0.5, y: 0.5}
              m_AnchoredPosition: {x: -185, y: -3.125}
              m_SizeDelta: {x: 62.5, y: 62.5}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!222 &662279813877233663
            CanvasRenderer:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 854098791254705238}
              m_CullTransparentMesh: 0
            --- !u!114 &8285888635146805326
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 854098791254705238}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: fe87c0e1cc204ed48ad3b37840f39efc, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Material: {fileID: 0}
              m_Color: {r: 0.32941177, g: 0.32941177, b: 0.32941177, a: 1}
              m_RaycastTarget: 1
              m_RaycastPadding: {x: 0, y: 0, z: 0, w: 0}
              m_Maskable: 1
              m_OnCullStateChanged:
                m_PersistentCalls:
                  m_Calls: []
              m_Sprite: {fileID: 21300000, guid: 2cb05668260eb084c843ef950c38c6a7, type: 3}
              m_Type: 1
              m_PreserveAspect: 0
              m_FillCenter: 1
              m_FillMethod: 4
              m_FillAmount: 1
              m_FillClockwise: 1
              m_FillOrigin: 0
              m_UseSpriteMesh: 0
              m_PixelsPerUnitMultiplier: 1
            --- !u!1 &1129141922526470062
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 3357658478605255507}
              m_Layer: 13
              m_Name: Template
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 0
            --- !u!224 &3357658478605255507
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 1129141922526470062}
              m_LocalRotation: {x: 0, y: 0, z: 0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children:
              - {fileID: 1463052135501616427}
              m_Father: {fileID: 8591821334734587905}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 1}
              m_AnchorMax: {x: 0, y: 1}
              m_AnchoredPosition: {x: 343.75, y: -38.75}
              m_SizeDelta: {x: 687.5, y: 77.5}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!1 &1359408996357798979
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 3481490395048613060}
              - component: {fileID: 8347225738525193672}
              - component: {fileID: 6469198166911021629}
              m_Layer: 13
              m_Name: On
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &3481490395048613060
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 1359408996357798979}
              m_LocalRotation: {x: -0, y: -0, z: -0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children:
              - {fileID: 3491925480228324496}
              m_Father: {fileID: 7703634282929296595}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 0}
              m_AnchorMax: {x: 1, y: 1}
              m_AnchoredPosition: {x: 0, y: 0}
              m_SizeDelta: {x: 0, y: 0}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!222 &8347225738525193672
            CanvasRenderer:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 1359408996357798979}
              m_CullTransparentMesh: 0
            --- !u!114 &6469198166911021629
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 1359408996357798979}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: fe87c0e1cc204ed48ad3b37840f39efc, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Material: {fileID: 0}
              m_Color: {r: 0.32941177, g: 0.32941177, b: 0.32941177, a: 1}
              m_RaycastTarget: 1
              m_RaycastPadding: {x: 0, y: 0, z: 0, w: 0}
              m_Maskable: 1
              m_OnCullStateChanged:
                m_PersistentCalls:
                  m_Calls: []
              m_Sprite: {fileID: 21300000, guid: 2cb05668260eb084c843ef950c38c6a7, type: 3}
              m_Type: 1
              m_PreserveAspect: 0
              m_FillCenter: 1
              m_FillMethod: 4
              m_FillAmount: 1
              m_FillClockwise: 1
              m_FillOrigin: 0
              m_UseSpriteMesh: 0
              m_PixelsPerUnitMultiplier: 1
            --- !u!1 &1420251862350360446
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 8838336001348390991}
              - component: {fileID: 4295728839579527052}
              - component: {fileID: 1478860365528704477}
              m_Layer: 13
              m_Name: Text
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &8838336001348390991
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 1420251862350360446}
              m_LocalRotation: {x: -0, y: -0, z: -0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children: []
              m_Father: {fileID: 1463052135501616427}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 0}
              m_AnchorMax: {x: 1, y: 1}
              m_AnchoredPosition: {x: 0, y: 0}
              m_SizeDelta: {x: -12.5, y: -15}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!222 &4295728839579527052
            CanvasRenderer:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 1420251862350360446}
              m_CullTransparentMesh: 0
            --- !u!114 &1478860365528704477
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 1420251862350360446}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: 5f7201a12d95ffc409449d95f23cf332, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Material: {fileID: 0}
              m_Color: {r: 0.27843136, g: 0.94573176, b: 1, a: 1}
              m_RaycastTarget: 0
              m_RaycastPadding: {x: 0, y: 0, z: 0, w: 0}
              m_Maskable: 1
              m_OnCullStateChanged:
                m_PersistentCalls:
                  m_Calls: []
              m_FontData:
                m_Font: {fileID: 10102, guid: 0000000000000000e000000000000000, type: 0}
                m_FontSize: 15
                m_FontStyle: 0
                m_BestFit: 0
                m_MinSize: 0
                m_MaxSize: 46
                m_Alignment: 3
                m_AlignByGeometry: 0
                m_RichText: 1
                m_HorizontalOverflow: 0
                m_VerticalOverflow: 0
                m_LineSpacing: 1
              m_Text:\s
            --- !u!1 &1511113199398470001
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 1567269430534133821}
              - component: {fileID: 1878950026851091042}
              - component: {fileID: 3496974771920987931}
              m_Layer: 13
              m_Name: Image
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &1567269430534133821
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 1511113199398470001}
              m_LocalRotation: {x: 0, y: 0, z: 0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children: []
              m_Father: {fileID: 6821175800260992208}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0.5, y: 0.5}
              m_AnchorMax: {x: 0.5, y: 0.5}
              m_AnchoredPosition: {x: 0, y: 0}
              m_SizeDelta: {x: 40, y: 40}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!222 &1878950026851091042
            CanvasRenderer:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 1511113199398470001}
              m_CullTransparentMesh: 0
            --- !u!114 &3496974771920987931
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 1511113199398470001}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: fe87c0e1cc204ed48ad3b37840f39efc, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Material: {fileID: 0}
              m_Color: {r: 0.2784314, g: 0.94509804, b: 1, a: 1}
              m_RaycastTarget: 0
              m_RaycastPadding: {x: 0, y: 0, z: 0, w: 0}
              m_Maskable: 1
              m_OnCullStateChanged:
                m_PersistentCalls:
                  m_Calls: []
              m_Sprite: {fileID: 21300000, guid: 2f7fa4ea3dc9a8b4f85d901b20741ace, type: 3}
              m_Type: 0
              m_PreserveAspect: 0
              m_FillCenter: 1
              m_FillMethod: 4
              m_FillAmount: 1
              m_FillClockwise: 1
              m_FillOrigin: 0
              m_UseSpriteMesh: 0
              m_PixelsPerUnitMultiplier: 1
            --- !u!1 &1534017188995840660
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 4576857236179234047}
              - component: {fileID: 7842002106881458250}
              m_Layer: 13
              m_Name: Scroll View
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &4576857236179234047
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 1534017188995840660}
              m_LocalRotation: {x: 0, y: 0, z: 0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children:
              - {fileID: 7882450243436679629}
              - {fileID: 6782800385175815143}
              m_Father: {fileID: 4339596841341581176}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 0}
              m_AnchorMax: {x: 0, y: 0}
              m_AnchoredPosition: {x: 0, y: 0}
              m_SizeDelta: {x: 0, y: 0}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!114 &7842002106881458250
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 1534017188995840660}
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
              m_FlexibleHeight: 10000
              m_LayoutPriority: 1
            --- !u!1 &1538024775262295924
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 3409546890608918753}
              - component: {fileID: 5732917137912458929}
              - component: {fileID: 1933331118698923675}
              m_Layer: 13
              m_Name: On
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &3409546890608918753
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 1538024775262295924}
              m_LocalRotation: {x: -0, y: -0, z: -0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children:
              - {fileID: 6821175800260992208}
              m_Father: {fileID: 975164195765836818}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 0}
              m_AnchorMax: {x: 1, y: 1}
              m_AnchoredPosition: {x: 0, y: 0}
              m_SizeDelta: {x: 0, y: 0}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!222 &5732917137912458929
            CanvasRenderer:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 1538024775262295924}
              m_CullTransparentMesh: 0
            --- !u!114 &1933331118698923675
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 1538024775262295924}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: fe87c0e1cc204ed48ad3b37840f39efc, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Material: {fileID: 0}
              m_Color: {r: 0.32941177, g: 0.32941177, b: 0.32941177, a: 1}
              m_RaycastTarget: 1
              m_RaycastPadding: {x: 0, y: 0, z: 0, w: 0}
              m_Maskable: 1
              m_OnCullStateChanged:
                m_PersistentCalls:
                  m_Calls: []
              m_Sprite: {fileID: 21300000, guid: 2cb05668260eb084c843ef950c38c6a7, type: 3}
              m_Type: 1
              m_PreserveAspect: 0
              m_FillCenter: 1
              m_FillMethod: 4
              m_FillAmount: 1
              m_FillClockwise: 1
              m_FillOrigin: 0
              m_UseSpriteMesh: 0
              m_PixelsPerUnitMultiplier: 1
            --- !u!1 &1595315033731373940
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 6963861521257086158}
              - component: {fileID: 4951321379973218006}
              - component: {fileID: 1342075876037238832}
              m_Layer: 13
              m_Name: Image
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &6963861521257086158
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 1595315033731373940}
              m_LocalRotation: {x: 0, y: 0, z: 0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children: []
              m_Father: {fileID: 4223140562457934030}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0.5, y: 0.5}
              m_AnchorMax: {x: 0.5, y: 0.5}
              m_AnchoredPosition: {x: 0, y: 0}
              m_SizeDelta: {x: 40, y: 40}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!222 &4951321379973218006
            CanvasRenderer:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 1595315033731373940}
              m_CullTransparentMesh: 0
            --- !u!114 &1342075876037238832
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 1595315033731373940}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: fe87c0e1cc204ed48ad3b37840f39efc, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Material: {fileID: 0}
              m_Color: {r: 0.2784314, g: 0.94509804, b: 1, a: 1}
              m_RaycastTarget: 0
              m_RaycastPadding: {x: 0, y: 0, z: 0, w: 0}
              m_Maskable: 1
              m_OnCullStateChanged:
                m_PersistentCalls:
                  m_Calls: []
              m_Sprite: {fileID: 21300000, guid: 6af561718baeac845a3e7facd64d3f30, type: 3}
              m_Type: 0
              m_PreserveAspect: 0
              m_FillCenter: 1
              m_FillMethod: 4
              m_FillAmount: 1
              m_FillClockwise: 1
              m_FillOrigin: 0
              m_UseSpriteMesh: 0
              m_PixelsPerUnitMultiplier: 1
            --- !u!1 &1640654602678329805
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 4066789520317656564}
              - component: {fileID: 3319664316574794525}
              - component: {fileID: 3724043463735038272}
              m_Layer: 13
              m_Name: On
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &4066789520317656564
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 1640654602678329805}
              m_LocalRotation: {x: -0, y: -0, z: -0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children:
              - {fileID: 1928177441973211619}
              m_Father: {fileID: 1306503323758436192}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 0}
              m_AnchorMax: {x: 1, y: 1}
              m_AnchoredPosition: {x: 0, y: 0}
              m_SizeDelta: {x: 0, y: 0}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!222 &3319664316574794525
            CanvasRenderer:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 1640654602678329805}
              m_CullTransparentMesh: 0
            --- !u!114 &3724043463735038272
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 1640654602678329805}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: fe87c0e1cc204ed48ad3b37840f39efc, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Material: {fileID: 0}
              m_Color: {r: 0.32941177, g: 0.32941177, b: 0.32941177, a: 1}
              m_RaycastTarget: 1
              m_RaycastPadding: {x: 0, y: 0, z: 0, w: 0}
              m_Maskable: 1
              m_OnCullStateChanged:
                m_PersistentCalls:
                  m_Calls: []
              m_Sprite: {fileID: 21300000, guid: 2cb05668260eb084c843ef950c38c6a7, type: 3}
              m_Type: 1
              m_PreserveAspect: 0
              m_FillCenter: 1
              m_FillMethod: 4
              m_FillAmount: 1
              m_FillClockwise: 1
              m_FillOrigin: 0
              m_UseSpriteMesh: 0
              m_PixelsPerUnitMultiplier: 1
            --- !u!1 &1659534934484970193
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 5607099280381067196}
              - component: {fileID: 5947545239331111168}
              - component: {fileID: 8476853880899149670}
              - component: {fileID: 2454895572338598471}
              m_Layer: 13
              m_Name: Scrollbar Vertical
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &5607099280381067196
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 1659534934484970193}
              m_LocalRotation: {x: -0, y: -0, z: -0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children:
              - {fileID: 6618017212043412336}
              m_Father: {fileID: 7882450243436679629}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 1, y: 0}
              m_AnchorMax: {x: 1, y: 1}
              m_AnchoredPosition: {x: 0, y: 0}
              m_SizeDelta: {x: 20, y: 0}
              m_Pivot: {x: 1, y: 1}
            --- !u!222 &5947545239331111168
            CanvasRenderer:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 1659534934484970193}
              m_CullTransparentMesh: 0
            --- !u!114 &8476853880899149670
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 1659534934484970193}
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
              m_Sprite: {fileID: 21300000, guid: 2c5d5e751b115aa468718c25d9a8a326, type: 3}
              m_Type: 1
              m_PreserveAspect: 0
              m_FillCenter: 1
              m_FillMethod: 4
              m_FillAmount: 1
              m_FillClockwise: 1
              m_FillOrigin: 0
              m_UseSpriteMesh: 0
              m_PixelsPerUnitMultiplier: 1
            --- !u!114 &2454895572338598471
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 1659534934484970193}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: 2a4db7a114972834c8e4117be1d82ba3, type: 3}
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
              m_TargetGraphic: {fileID: 4003998676176046899}
              m_HandleRect: {fileID: 7768613452683655564}
              m_Direction: 2
              m_Value: 0
              m_Size: 1
              m_NumberOfSteps: 0
              m_OnValueChanged:
                m_PersistentCalls:
                  m_Calls: []
            --- !u!1 &1713174612164617778
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 6339390650912290090}
              - component: {fileID: 302882072727044257}
              - component: {fileID: 8545253745228323484}
              m_Layer: 13
              m_Name: Image
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &6339390650912290090
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 1713174612164617778}
              m_LocalRotation: {x: -0, y: -0, z: -0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children: []
              m_Father: {fileID: 494099253239869537}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 1}
              m_AnchorMax: {x: 0, y: 1}
              m_AnchoredPosition: {x: 33.666656, y: -31.25}
              m_SizeDelta: {x: 40, y: 40}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!222 &302882072727044257
            CanvasRenderer:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 1713174612164617778}
              m_CullTransparentMesh: 0
            --- !u!114 &8545253745228323484
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 1713174612164617778}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: fe87c0e1cc204ed48ad3b37840f39efc, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Material: {fileID: 0}
              m_Color: {r: 0.2784314, g: 0.94509804, b: 1, a: 1}
              m_RaycastTarget: 0
              m_RaycastPadding: {x: 0, y: 0, z: 0, w: 0}
              m_Maskable: 1
              m_OnCullStateChanged:
                m_PersistentCalls:
                  m_Calls: []
              m_Sprite: {fileID: 21300000, guid: abae5c498fc797841ba636f5687af5d4, type: 3}
              m_Type: 0
              m_PreserveAspect: 0
              m_FillCenter: 1
              m_FillMethod: 4
              m_FillAmount: 1
              m_FillClockwise: 1
              m_FillOrigin: 0
              m_UseSpriteMesh: 0
              m_PixelsPerUnitMultiplier: 1
            --- !u!1 &1758283254552132787
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 7357372083043197374}
              - component: {fileID: 2237091044184503365}
              - component: {fileID: 715478846738744106}
              - component: {fileID: 3031362880160393313}
              m_Layer: 13
              m_Name: Button
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &7357372083043197374
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 1758283254552132787}
              m_LocalRotation: {x: -0, y: -0, z: -0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children:
              - {fileID: 8925540823639722988}
              m_Father: {fileID: 8376744303511097751}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 0}
              m_AnchorMax: {x: 1, y: 1}
              m_AnchoredPosition: {x: 0, y: 0}
              m_SizeDelta: {x: -7.5, y: -7.5}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!222 &2237091044184503365
            CanvasRenderer:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 1758283254552132787}
              m_CullTransparentMesh: 0
            --- !u!114 &715478846738744106
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 1758283254552132787}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: fe87c0e1cc204ed48ad3b37840f39efc, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Material: {fileID: 0}
              m_Color: {r: 0.15280277, g: 0.16425171, b: 0.18823528, a: 1}
              m_RaycastTarget: 1
              m_RaycastPadding: {x: 0, y: 0, z: 0, w: 0}
              m_Maskable: 1
              m_OnCullStateChanged:
                m_PersistentCalls:
                  m_Calls: []
              m_Sprite: {fileID: 21300000, guid: 2cb05668260eb084c843ef950c38c6a7, type: 3}
              m_Type: 1
              m_PreserveAspect: 0
              m_FillCenter: 1
              m_FillMethod: 4
              m_FillAmount: 1
              m_FillClockwise: 1
              m_FillOrigin: 0
              m_UseSpriteMesh: 0
              m_PixelsPerUnitMultiplier: 1
            --- !u!114 &3031362880160393313
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 1758283254552132787}
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
                m_SelectedTrigger: Highlighted
                m_DisabledTrigger: Disabled
              m_Interactable: 1
              m_TargetGraphic: {fileID: 715478846738744106}
              m_OnClick:
                m_PersistentCalls:
                  m_Calls:
                  - m_Target: {fileID: 2474281132889786057}
                    m_TargetAssemblyTypeName:\s
                    m_MethodName: SendCustomEvent
                    m_Mode: 5
                    m_Arguments:
                      m_ObjectArgument: {fileID: 0}
                      m_ObjectArgumentAssemblyTypeName: UnityEngine.Object, UnityEngine
                      m_IntArgument: 0
                      m_FloatArgument: 0
                      m_StringArgument: RepeatOff
                      m_BoolArgument: 0
                    m_CallState: 2
            --- !u!1 &1898676577204462070
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 7768613452683655564}
              - component: {fileID: 3255382804146293483}
              - component: {fileID: 4003998676176046899}
              m_Layer: 13
              m_Name: Handle
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &7768613452683655564
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 1898676577204462070}
              m_LocalRotation: {x: -0, y: -0, z: -0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children: []
              m_Father: {fileID: 6618017212043412336}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 0}
              m_AnchorMax: {x: 0, y: 0}
              m_AnchoredPosition: {x: 0, y: 0}
              m_SizeDelta: {x: 20, y: 20}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!222 &3255382804146293483
            CanvasRenderer:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 1898676577204462070}
              m_CullTransparentMesh: 0
            --- !u!114 &4003998676176046899
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 1898676577204462070}
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
              m_Sprite: {fileID: 21300000, guid: 2cb05668260eb084c843ef950c38c6a7, type: 3}
              m_Type: 1
              m_PreserveAspect: 0
              m_FillCenter: 1
              m_FillMethod: 4
              m_FillAmount: 1
              m_FillClockwise: 1
              m_FillOrigin: 0
              m_UseSpriteMesh: 0
              m_PixelsPerUnitMultiplier: 1
            --- !u!1 &1919890343359667929
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 8591821334734587905}
              - component: {fileID: 4247596780587204181}
              - component: {fileID: 8244031320473651906}
              m_Layer: 13
              m_Name: Content
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &8591821334734587905
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 1919890343359667929}
              m_LocalRotation: {x: -0, y: -0, z: -0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children:
              - {fileID: 3357658478605255507}
              m_Father: {fileID: 5499885433104126674}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 0}
              m_AnchorMax: {x: 1, y: 1}
              m_AnchoredPosition: {x: 0, y: 0}
              m_SizeDelta: {x: 0, y: 0}
              m_Pivot: {x: 0, y: 1}
            --- !u!114 &4247596780587204181
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 1919890343359667929}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: 59f8146938fff824cb5fd77236b75775, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Padding:
                m_Left: 0
                m_Right: 0
                m_Top: 0
                m_Bottom: 0
              m_ChildAlignment: 0
              m_Spacing: 3.75
              m_ChildForceExpandWidth: 1
              m_ChildForceExpandHeight: 0
              m_ChildControlWidth: 1
              m_ChildControlHeight: 0
              m_ChildScaleWidth: 0
              m_ChildScaleHeight: 0
              m_ReverseArrangement: 0
            --- !u!114 &8244031320473651906
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 1919890343359667929}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: 3245ec927659c4140ac4f8d17403cc18, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_HorizontalFit: 0
              m_VerticalFit: 2
            --- !u!1 &2629593958888117562
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 7381411783862258488}
              - component: {fileID: 6979440722706931391}
              - component: {fileID: 2960812084728988470}
              - component: {fileID: 5995095807498618208}
              m_Layer: 13
              m_Name: Button
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &7381411783862258488
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 2629593958888117562}
              m_LocalRotation: {x: -0, y: -0, z: -0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children:
              - {fileID: 3688459794571907367}
              m_Father: {fileID: 2972499952988653430}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 0}
              m_AnchorMax: {x: 1, y: 1}
              m_AnchoredPosition: {x: 0, y: 0}
              m_SizeDelta: {x: -7.5, y: -7.5}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!222 &6979440722706931391
            CanvasRenderer:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 2629593958888117562}
              m_CullTransparentMesh: 0
            --- !u!114 &2960812084728988470
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 2629593958888117562}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: fe87c0e1cc204ed48ad3b37840f39efc, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Material: {fileID: 0}
              m_Color: {r: 0.15280277, g: 0.16425171, b: 0.18823528, a: 1}
              m_RaycastTarget: 1
              m_RaycastPadding: {x: 0, y: 0, z: 0, w: 0}
              m_Maskable: 1
              m_OnCullStateChanged:
                m_PersistentCalls:
                  m_Calls: []
              m_Sprite: {fileID: 21300000, guid: 2cb05668260eb084c843ef950c38c6a7, type: 3}
              m_Type: 1
              m_PreserveAspect: 0
              m_FillCenter: 1
              m_FillMethod: 4
              m_FillAmount: 1
              m_FillClockwise: 1
              m_FillOrigin: 0
              m_UseSpriteMesh: 0
              m_PixelsPerUnitMultiplier: 1
            --- !u!114 &5995095807498618208
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 2629593958888117562}
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
                m_SelectedTrigger: Highlighted
                m_DisabledTrigger: Disabled
              m_Interactable: 1
              m_TargetGraphic: {fileID: 2960812084728988470}
              m_OnClick:
                m_PersistentCalls:
                  m_Calls:
                  - m_Target: {fileID: 2474281132889786057}
                    m_TargetAssemblyTypeName:\s
                    m_MethodName: SendCustomEvent
                    m_Mode: 5
                    m_Arguments:
                      m_ObjectArgument: {fileID: 0}
                      m_ObjectArgumentAssemblyTypeName: UnityEngine.Object, UnityEngine
                      m_IntArgument: 0
                      m_FloatArgument: 0
                      m_StringArgument: Forward
                      m_BoolArgument: 0
                    m_CallState: 2
            --- !u!1 &3239950577989343216
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 2448357629403068181}
              - component: {fileID: 2859350974706346077}
              - component: {fileID: 3171250911554422316}
              m_Layer: 13
              m_Name: Image
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &2448357629403068181
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 3239950577989343216}
              m_LocalRotation: {x: 0, y: 0, z: 0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children: []
              m_Father: {fileID: 1928177441973211619}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0.5, y: 0.5}
              m_AnchorMax: {x: 0.5, y: 0.5}
              m_AnchoredPosition: {x: 0, y: 0}
              m_SizeDelta: {x: 40, y: 40}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!222 &2859350974706346077
            CanvasRenderer:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 3239950577989343216}
              m_CullTransparentMesh: 0
            --- !u!114 &3171250911554422316
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 3239950577989343216}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: fe87c0e1cc204ed48ad3b37840f39efc, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Material: {fileID: 0}
              m_Color: {r: 0.2784314, g: 0.94509804, b: 1, a: 1}
              m_RaycastTarget: 0
              m_RaycastPadding: {x: 0, y: 0, z: 0, w: 0}
              m_Maskable: 1
              m_OnCullStateChanged:
                m_PersistentCalls:
                  m_Calls: []
              m_Sprite: {fileID: 21300000, guid: 84fefcbdef0daff49a97d71d9021bbb5, type: 3}
              m_Type: 0
              m_PreserveAspect: 0
              m_FillCenter: 1
              m_FillMethod: 4
              m_FillAmount: 1
              m_FillClockwise: 1
              m_FillOrigin: 0
              m_UseSpriteMesh: 0
              m_PixelsPerUnitMultiplier: 1
            --- !u!1 &3309250830791721890
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 1420427921216105593}
              m_Layer: 13
              m_Name: Repeat
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &1420427921216105593
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 3309250830791721890}
              m_LocalRotation: {x: -0, y: -0, z: -0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children:
              - {fileID: 4583568304642747064}
              - {fileID: 8376744303511097751}
              m_Father: {fileID: 5325228433000651842}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0.5, y: 0.5}
              m_AnchorMax: {x: 0.5, y: 0.5}
              m_AnchoredPosition: {x: 322.5, y: -3.125}
              m_SizeDelta: {x: 62.5, y: 62.5}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!1 &3493397688629794566
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 6782800385175815143}
              - component: {fileID: 2057908930612119284}
              - component: {fileID: 3567117062011521405}
              m_Layer: 13
              m_Name: Message
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 0
            --- !u!224 &6782800385175815143
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 3493397688629794566}
              m_LocalRotation: {x: 0, y: 0, z: 0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children:
              - {fileID: 6155808832404954421}
              m_Father: {fileID: 4576857236179234047}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 0}
              m_AnchorMax: {x: 1, y: 1}
              m_AnchoredPosition: {x: 0, y: 0}
              m_SizeDelta: {x: -12.5, y: 0}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!222 &2057908930612119284
            CanvasRenderer:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 3493397688629794566}
              m_CullTransparentMesh: 0
            --- !u!114 &3567117062011521405
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 3493397688629794566}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: fe87c0e1cc204ed48ad3b37840f39efc, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Material: {fileID: 0}
              m_Color: {r: 0.15294118, g: 0.16470589, b: 0.1882353, a: 1}
              m_RaycastTarget: 0
              m_RaycastPadding: {x: 0, y: 0, z: 0, w: 0}
              m_Maskable: 1
              m_OnCullStateChanged:
                m_PersistentCalls:
                  m_Calls: []
              m_Sprite: {fileID: 21300000, guid: 2cb05668260eb084c843ef950c38c6a7, type: 3}
              m_Type: 1
              m_PreserveAspect: 0
              m_FillCenter: 1
              m_FillMethod: 4
              m_FillAmount: 1
              m_FillClockwise: 1
              m_FillOrigin: 0
              m_UseSpriteMesh: 0
              m_PixelsPerUnitMultiplier: 1
            --- !u!1 &3858139280616829887
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 2611176771871737290}
              - component: {fileID: 2173783339888813151}
              - component: {fileID: 8239694491027802415}
              m_Layer: 13
              m_Name: Fill
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &2611176771871737290
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 3858139280616829887}
              m_LocalRotation: {x: 0, y: 0, z: 0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
            """;

    final String prefab_2 = """
              m_Children: []
              m_Father: {fileID: 7784866566451399984}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 0}
              m_AnchorMax: {x: 0, y: 1}
              m_AnchoredPosition: {x: 0, y: 0}
              m_SizeDelta: {x: 0, y: 0}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!222 &2173783339888813151
            CanvasRenderer:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 3858139280616829887}
              m_CullTransparentMesh: 0
            --- !u!114 &8239694491027802415
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 3858139280616829887}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: fe87c0e1cc204ed48ad3b37840f39efc, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Material: {fileID: 0}
              m_Color: {r: 0.05882353, g: 0.0627451, b: 0.07058824, a: 1}
              m_RaycastTarget: 0
              m_RaycastPadding: {x: 0, y: 0, z: 0, w: 0}
              m_Maskable: 1
              m_OnCullStateChanged:
                m_PersistentCalls:
                  m_Calls: []
              m_Sprite: {fileID: 21300000, guid: 2cb05668260eb084c843ef950c38c6a7, type: 3}
              m_Type: 1
              m_PreserveAspect: 0
              m_FillCenter: 1
              m_FillMethod: 4
              m_FillAmount: 1
              m_FillClockwise: 1
              m_FillOrigin: 0
              m_UseSpriteMesh: 0
              m_PixelsPerUnitMultiplier: 1
            --- !u!1 &4038564713394606441
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 1168088437821256370}
              - component: {fileID: 3753538773496146706}
              - component: {fileID: 2593948740795940429}
              m_Layer: 13
              m_Name: Off
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 0
            --- !u!224 &1168088437821256370
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 4038564713394606441}
              m_LocalRotation: {x: -0, y: -0, z: -0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children:
              - {fileID: 540979998993702938}
              m_Father: {fileID: 1306503323758436192}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 0}
              m_AnchorMax: {x: 1, y: 1}
              m_AnchoredPosition: {x: 0, y: 0}
              m_SizeDelta: {x: 0, y: 0}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!222 &3753538773496146706
            CanvasRenderer:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 4038564713394606441}
              m_CullTransparentMesh: 0
            --- !u!114 &2593948740795940429
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 4038564713394606441}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: fe87c0e1cc204ed48ad3b37840f39efc, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Material: {fileID: 0}
              m_Color: {r: 0.32941177, g: 0.32941177, b: 0.32941177, a: 1}
              m_RaycastTarget: 1
              m_RaycastPadding: {x: 0, y: 0, z: 0, w: 0}
              m_Maskable: 1
              m_OnCullStateChanged:
                m_PersistentCalls:
                  m_Calls: []
              m_Sprite: {fileID: 21300000, guid: 2cb05668260eb084c843ef950c38c6a7, type: 3}
              m_Type: 1
              m_PreserveAspect: 0
              m_FillCenter: 1
              m_FillMethod: 4
              m_FillAmount: 1
              m_FillClockwise: 1
              m_FillOrigin: 0
              m_UseSpriteMesh: 0
              m_PixelsPerUnitMultiplier: 1
            --- !u!1 &4079812769283537471
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 975164195765836818}
              m_Layer: 13
              m_Name: Shuffle
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &975164195765836818
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 4079812769283537471}
              m_LocalRotation: {x: -0, y: -0, z: -0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children:
              - {fileID: 3409546890608918753}
              - {fileID: 862965074048094962}
              m_Father: {fileID: 5325228433000651842}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0.5, y: 0.5}
              m_AnchorMax: {x: 0.5, y: 0.5}
              m_AnchoredPosition: {x: 253.75, y: -3.125}
              m_SizeDelta: {x: 62.5, y: 62.5}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!1 &4187919378773752986
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 4223140562457934030}
              - component: {fileID: 3232849592382076670}
              - component: {fileID: 581347998351624808}
              - component: {fileID: 7143875127331486408}
              m_Layer: 13
              m_Name: Button
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &4223140562457934030
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 4187919378773752986}
              m_LocalRotation: {x: -0, y: -0, z: -0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children:
              - {fileID: 6963861521257086158}
              m_Father: {fileID: 4583568304642747064}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 0}
              m_AnchorMax: {x: 1, y: 1}
              m_AnchoredPosition: {x: 0, y: 0}
              m_SizeDelta: {x: -7.5, y: -7.5}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!222 &3232849592382076670
            CanvasRenderer:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 4187919378773752986}
              m_CullTransparentMesh: 0
            --- !u!114 &581347998351624808
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 4187919378773752986}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: fe87c0e1cc204ed48ad3b37840f39efc, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Material: {fileID: 0}
              m_Color: {r: 0.15280277, g: 0.16425171, b: 0.18823528, a: 1}
              m_RaycastTarget: 1
              m_RaycastPadding: {x: 0, y: 0, z: 0, w: 0}
              m_Maskable: 1
              m_OnCullStateChanged:
                m_PersistentCalls:
                  m_Calls: []
              m_Sprite: {fileID: 21300000, guid: 2cb05668260eb084c843ef950c38c6a7, type: 3}
              m_Type: 1
              m_PreserveAspect: 0
              m_FillCenter: 1
              m_FillMethod: 4
              m_FillAmount: 1
              m_FillClockwise: 1
              m_FillOrigin: 0
              m_UseSpriteMesh: 0
              m_PixelsPerUnitMultiplier: 1
            --- !u!114 &7143875127331486408
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 4187919378773752986}
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
                m_SelectedTrigger: Highlighted
                m_DisabledTrigger: Disabled
              m_Interactable: 1
              m_TargetGraphic: {fileID: 581347998351624808}
              m_OnClick:
                m_PersistentCalls:
                  m_Calls:
                  - m_Target: {fileID: 2474281132889786057}
                    m_TargetAssemblyTypeName:\s
                    m_MethodName: SendCustomEvent
                    m_Mode: 5
                    m_Arguments:
                      m_ObjectArgument: {fileID: 0}
                      m_ObjectArgumentAssemblyTypeName: UnityEngine.Object, UnityEngine
                      m_IntArgument: 0
                      m_FloatArgument: 0
                      m_StringArgument: RepeatOn
                      m_BoolArgument: 0
                    m_CallState: 2
            --- !u!1 &4231825204631471541
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 5390735447630095591}
              - component: {fileID: 7169323343179684719}
              - component: {fileID: 4122538457208391487}
              m_Layer: 13
              m_Name: Image
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &5390735447630095591
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 4231825204631471541}
              m_LocalRotation: {x: 0, y: 0, z: 0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children: []
              m_Father: {fileID: 905462480304770084}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0.5, y: 0.5}
              m_AnchorMax: {x: 0.5, y: 0.5}
              m_AnchoredPosition: {x: 0, y: 0}
              m_SizeDelta: {x: 40, y: 40}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!222 &7169323343179684719
            CanvasRenderer:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 4231825204631471541}
              m_CullTransparentMesh: 0
            --- !u!114 &4122538457208391487
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 4231825204631471541}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: fe87c0e1cc204ed48ad3b37840f39efc, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Material: {fileID: 0}
              m_Color: {r: 0.2784314, g: 0.94509804, b: 1, a: 1}
              m_RaycastTarget: 0
              m_RaycastPadding: {x: 0, y: 0, z: 0, w: 0}
              m_Maskable: 1
              m_OnCullStateChanged:
                m_PersistentCalls:
                  m_Calls: []
              m_Sprite: {fileID: 21300000, guid: ca960fc4d21253a4b8693cf67c6c6681, type: 3}
              m_Type: 0
              m_PreserveAspect: 0
              m_FillCenter: 1
              m_FillMethod: 4
              m_FillAmount: 1
              m_FillClockwise: 1
              m_FillOrigin: 0
              m_UseSpriteMesh: 0
              m_PixelsPerUnitMultiplier: 1
            --- !u!1 &4335991885533601838
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 1306503323758436192}
              m_Layer: 13
              m_Name: Lock
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &1306503323758436192
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 4335991885533601838}
              m_LocalRotation: {x: -0, y: -0, z: -0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children:
              - {fileID: 4066789520317656564}
              - {fileID: 1168088437821256370}
              m_Father: {fileID: 5325228433000651842}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0.5, y: 0.5}
              m_AnchorMax: {x: 0.5, y: 0.5}
              m_AnchoredPosition: {x: -322.5, y: -3.125}
              m_SizeDelta: {x: 62.5, y: 62.5}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!1 &4375758660702237107
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 7732439877517000875}
              - component: {fileID: 4662981456119934497}
              - component: {fileID: 6068244384364416040}
              m_Layer: 13
              m_Name: Image
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &7732439877517000875
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 4375758660702237107}
              m_LocalRotation: {x: 0, y: 0, z: 0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children: []
              m_Father: {fileID: 7156548421552507146}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0.5, y: 0.5}
              m_AnchorMax: {x: 0.5, y: 0.5}
              m_AnchoredPosition: {x: 0, y: 0}
              m_SizeDelta: {x: 40, y: 40}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!222 &4662981456119934497
            CanvasRenderer:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 4375758660702237107}
              m_CullTransparentMesh: 0
            --- !u!114 &6068244384364416040
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 4375758660702237107}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: fe87c0e1cc204ed48ad3b37840f39efc, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Material: {fileID: 0}
              m_Color: {r: 0.2784314, g: 0.94509804, b: 1, a: 1}
              m_RaycastTarget: 0
              m_RaycastPadding: {x: 0, y: 0, z: 0, w: 0}
              m_Maskable: 1
              m_OnCullStateChanged:
                m_PersistentCalls:
                  m_Calls: []
              m_Sprite: {fileID: 21300000, guid: 561efeefb15ba834f9afccdc7409ef76, type: 3}
              m_Type: 0
              m_PreserveAspect: 0
              m_FillCenter: 1
              m_FillMethod: 4
              m_FillAmount: 1
              m_FillClockwise: 1
              m_FillOrigin: 0
              m_UseSpriteMesh: 0
              m_PixelsPerUnitMultiplier: 1
            --- !u!1 &4466621958424357315
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 7784866566451399984}
              m_Layer: 13
              m_Name: Fill Area
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &7784866566451399984
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 4466621958424357315}
              m_LocalRotation: {x: 0, y: 0, z: 0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children:
              - {fileID: 2611176771871737290}
              m_Father: {fileID: 2934297917292193853}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 0}
              m_AnchorMax: {x: 1, y: 1}
              m_AnchoredPosition: {x: 0, y: 0}
              m_SizeDelta: {x: 0, y: 0}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!1 &4501425463048816183
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 1434098474544757609}
              - component: {fileID: 1773210893078730035}
              - component: {fileID: 3858079357361025879}
              - component: {fileID: 5707392353006766531}
              m_Layer: 13
              m_Name: Button
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &1434098474544757609
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 4501425463048816183}
              m_LocalRotation: {x: -0, y: -0, z: -0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children:
              - {fileID: 655321734881548948}
              m_Father: {fileID: 4837082719793801378}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 0}
              m_AnchorMax: {x: 1, y: 1}
              m_AnchoredPosition: {x: 0, y: 0}
              m_SizeDelta: {x: -7.5, y: -7.5}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!222 &1773210893078730035
            CanvasRenderer:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 4501425463048816183}
              m_CullTransparentMesh: 0
            --- !u!114 &3858079357361025879
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 4501425463048816183}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: fe87c0e1cc204ed48ad3b37840f39efc, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Material: {fileID: 0}
              m_Color: {r: 0.15280277, g: 0.16425171, b: 0.18823528, a: 1}
              m_RaycastTarget: 1
              m_RaycastPadding: {x: 0, y: 0, z: 0, w: 0}
              m_Maskable: 1
              m_OnCullStateChanged:
                m_PersistentCalls:
                  m_Calls: []
              m_Sprite: {fileID: 21300000, guid: 2cb05668260eb084c843ef950c38c6a7, type: 3}
              m_Type: 1
              m_PreserveAspect: 0
              m_FillCenter: 1
              m_FillMethod: 4
              m_FillAmount: 1
              m_FillClockwise: 1
              m_FillOrigin: 0
              m_UseSpriteMesh: 0
              m_PixelsPerUnitMultiplier: 1
            --- !u!114 &5707392353006766531
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 4501425463048816183}
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
                m_SelectedTrigger: Highlighted
                m_DisabledTrigger: Disabled
              m_Interactable: 1
              m_TargetGraphic: {fileID: 3858079357361025879}
              m_OnClick:
                m_PersistentCalls:
                  m_Calls:
                  - m_Target: {fileID: 2474281132889786057}
                    m_TargetAssemblyTypeName:\s
                    m_MethodName: SendCustomEvent
                    m_Mode: 5
                    m_Arguments:
                      m_ObjectArgument: {fileID: 0}
                      m_ObjectArgumentAssemblyTypeName: UnityEngine.Object, UnityEngine
                      m_IntArgument: 0
                      m_FloatArgument: 0
                      m_StringArgument: PlayOff
                      m_BoolArgument: 0
                    m_CallState: 2
            --- !u!1 &4520490711385758603
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 3688459794571907367}
              - component: {fileID: 5887528855312885874}
              - component: {fileID: 6530002606586824024}
              m_Layer: 13
              m_Name: Image
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &3688459794571907367
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 4520490711385758603}
              m_LocalRotation: {x: 0, y: 0, z: 0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children: []
              m_Father: {fileID: 7381411783862258488}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0.5, y: 0.5}
              m_AnchorMax: {x: 0.5, y: 0.5}
              m_AnchoredPosition: {x: 0, y: 0}
              m_SizeDelta: {x: 40, y: 40}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!222 &5887528855312885874
            CanvasRenderer:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 4520490711385758603}
              m_CullTransparentMesh: 0
            --- !u!114 &6530002606586824024
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 4520490711385758603}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: fe87c0e1cc204ed48ad3b37840f39efc, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Material: {fileID: 0}
              m_Color: {r: 0.2784314, g: 0.94509804, b: 1, a: 1}
              m_RaycastTarget: 0
              m_RaycastPadding: {x: 0, y: 0, z: 0, w: 0}
              m_Maskable: 1
              m_OnCullStateChanged:
                m_PersistentCalls:
                  m_Calls: []
              m_Sprite: {fileID: 21300000, guid: 494c0ea989a89ed459dc02ec1df7cca2, type: 3}
              m_Type: 0
              m_PreserveAspect: 0
              m_FillCenter: 1
              m_FillMethod: 4
              m_FillAmount: 1
              m_FillClockwise: 1
              m_FillOrigin: 0
              m_UseSpriteMesh: 0
              m_PixelsPerUnitMultiplier: 1
            --- !u!1 &4571359300985195321
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 5325228433000651842}
              - component: {fileID: 1351883026914747473}
              m_Layer: 13
              m_Name: Header
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &5325228433000651842
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 4571359300985195321}
              m_LocalRotation: {x: 0, y: 0, z: 0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children:
              - {fileID: 1306503323758436192}
              - {fileID: 7703634282929296595}
              - {fileID: 2972499952988653430}
              - {fileID: 494099253239869537}
              - {fileID: 8666872866313558918}
              - {fileID: 975164195765836818}
              - {fileID: 1420427921216105593}
              m_Father: {fileID: 4339596841341581176}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 0}
              m_AnchorMax: {x: 0, y: 0}
              m_AnchoredPosition: {x: 0, y: 0}
              m_SizeDelta: {x: 0, y: 0}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!114 &1351883026914747473
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 4571359300985195321}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: 306cc8c2b49d7114eaa3623786fc2126, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_IgnoreLayout: 0
              m_MinWidth: -1
              m_MinHeight: 68.75
              m_PreferredWidth: -1
              m_PreferredHeight: 68.75
              m_FlexibleWidth: -1
              m_FlexibleHeight: -1
              m_LayoutPriority: 1
            --- !u!1 &4601827407312559113
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 7683205716582593170}
              - component: {fileID: 715571799351203874}
              - component: {fileID: 8395244272522897743}
              m_Layer: 13
              m_Name: Image
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &7683205716582593170
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 4601827407312559113}
              m_LocalRotation: {x: 0, y: 0, z: 0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children: []
              m_Father: {fileID: 540979998993702938}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0.5, y: 0.5}
              m_AnchorMax: {x: 0.5, y: 0.5}
              m_AnchoredPosition: {x: 0, y: 0}
              m_SizeDelta: {x: 40, y: 40}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!222 &715571799351203874
            CanvasRenderer:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 4601827407312559113}
              m_CullTransparentMesh: 0
            --- !u!114 &8395244272522897743
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 4601827407312559113}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: fe87c0e1cc204ed48ad3b37840f39efc, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Material: {fileID: 0}
              m_Color: {r: 0.2784314, g: 0.94509804, b: 1, a: 1}
              m_RaycastTarget: 0
              m_RaycastPadding: {x: 0, y: 0, z: 0, w: 0}
              m_Maskable: 1
              m_OnCullStateChanged:
                m_PersistentCalls:
                  m_Calls: []
              m_Sprite: {fileID: 21300000, guid: 55ff7a0d326042848ade88514edd4bf8, type: 3}
              m_Type: 0
              m_PreserveAspect: 0
              m_FillCenter: 1
              m_FillMethod: 4
              m_FillAmount: 1
              m_FillClockwise: 1
              m_FillOrigin: 0
              m_UseSpriteMesh: 0
              m_PixelsPerUnitMultiplier: 1
            --- !u!1 &4818909252156307630
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 655321734881548948}
              - component: {fileID: 1636239433629472424}
              - component: {fileID: 5257319320176394785}
              m_Layer: 13
              m_Name: Image
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &655321734881548948
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 4818909252156307630}
              m_LocalRotation: {x: 0, y: 0, z: 0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children: []
              m_Father: {fileID: 1434098474544757609}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0.5, y: 0.5}
              m_AnchorMax: {x: 0.5, y: 0.5}
              m_AnchoredPosition: {x: 0, y: 0}
              m_SizeDelta: {x: 40, y: 40}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!222 &1636239433629472424
            CanvasRenderer:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 4818909252156307630}
              m_CullTransparentMesh: 0
            --- !u!114 &5257319320176394785
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 4818909252156307630}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: fe87c0e1cc204ed48ad3b37840f39efc, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Material: {fileID: 0}
              m_Color: {r: 0.2784314, g: 0.94509804, b: 1, a: 1}
              m_RaycastTarget: 0
              m_RaycastPadding: {x: 0, y: 0, z: 0, w: 0}
              m_Maskable: 1
              m_OnCullStateChanged:
                m_PersistentCalls:
                  m_Calls: []
              m_Sprite: {fileID: 21300000, guid: 06530ef294adc7345a5e1e08d4ade516, type: 3}
              m_Type: 0
              m_PreserveAspect: 0
              m_FillCenter: 1
              m_FillMethod: 4
              m_FillAmount: 1
              m_FillClockwise: 1
              m_FillOrigin: 0
              m_UseSpriteMesh: 0
              m_PixelsPerUnitMultiplier: 1
            --- !u!1 &4868242244086388990
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 7211213645248320425}
              - component: {fileID: 3786060407609061798}
              m_Layer: 0
              m_Name: iwaSync3-Playlist 2
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!4 &7211213645248320425
            Transform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 4868242244086388990}
              serializedVersion: 2
              m_LocalRotation: {x: 0, y: 0, z: 0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children:
              - {fileID: 4817926349179246528}
              m_Father: {fileID: 0}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
            --- !u!114 &3786060407609061798
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 4868242244086388990}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: 341229cb1417af641a34be760d9ee0bb, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              iwaSync3: {fileID: 0}
              defaultShuffle: 0
              defaultRepeat: 1
              playOnAwake: 0
              playlistUrl:\s
              playlistPrefix:\s
              playlistLimitCount: 0
              playlistExcludeShortVideo: 0
              tracks:
            """;

    private final String prefab_video = """
              - mode: 1
                title: "#title#"
                url: #url#
            """;

    private final String prefab_3 = """
            --- !u!1 &4952957222238586296
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 905462480304770084}
              - component: {fileID: 4583276692308841168}
              - component: {fileID: 6500237913645301567}
              - component: {fileID: 3542153448329930476}
              m_Layer: 13
              m_Name: Button
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &905462480304770084
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 4952957222238586296}
              m_LocalRotation: {x: -0, y: -0, z: -0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children:
              - {fileID: 5390735447630095591}
              m_Father: {fileID: 4588997926351589972}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 0}
              m_AnchorMax: {x: 1, y: 1}
              m_AnchoredPosition: {x: 0, y: 0}
              m_SizeDelta: {x: -7.5, y: -7.5}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!222 &4583276692308841168
            CanvasRenderer:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 4952957222238586296}
              m_CullTransparentMesh: 0
            --- !u!114 &6500237913645301567
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 4952957222238586296}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: fe87c0e1cc204ed48ad3b37840f39efc, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Material: {fileID: 0}
              m_Color: {r: 0.15280277, g: 0.16425171, b: 0.18823528, a: 1}
              m_RaycastTarget: 1
              m_RaycastPadding: {x: 0, y: 0, z: 0, w: 0}
              m_Maskable: 1
              m_OnCullStateChanged:
                m_PersistentCalls:
                  m_Calls: []
              m_Sprite: {fileID: 21300000, guid: 2cb05668260eb084c843ef950c38c6a7, type: 3}
              m_Type: 1
              m_PreserveAspect: 0
              m_FillCenter: 1
              m_FillMethod: 4
              m_FillAmount: 1
              m_FillClockwise: 1
              m_FillOrigin: 0
              m_UseSpriteMesh: 0
              m_PixelsPerUnitMultiplier: 1
            --- !u!114 &3542153448329930476
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 4952957222238586296}
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
                m_SelectedTrigger: Highlighted
                m_DisabledTrigger: Disabled
              m_Interactable: 1
              m_TargetGraphic: {fileID: 6500237913645301567}
              m_OnClick:
                m_PersistentCalls:
                  m_Calls:
                  - m_Target: {fileID: 2474281132889786057}
                    m_TargetAssemblyTypeName:\s
                    m_MethodName: SendCustomEvent
                    m_Mode: 5
                    m_Arguments:
                      m_ObjectArgument: {fileID: 0}
                      m_ObjectArgumentAssemblyTypeName: UnityEngine.Object, UnityEngine
                      m_IntArgument: 0
                      m_FloatArgument: 0
                      m_StringArgument: OrderOff
                      m_BoolArgument: 0
                    m_CallState: 2
            --- !u!1 &5236155920483817472
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 4837082719793801378}
              - component: {fileID: 1354276599455837733}
              - component: {fileID: 1404403891308606288}
              m_Layer: 13
              m_Name: Off
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 0
            --- !u!224 &4837082719793801378
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 5236155920483817472}
              m_LocalRotation: {x: -0, y: -0, z: -0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children:
              - {fileID: 1434098474544757609}
              m_Father: {fileID: 7703634282929296595}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 0}
              m_AnchorMax: {x: 1, y: 1}
              m_AnchoredPosition: {x: 0, y: 0}
              m_SizeDelta: {x: 0, y: 0}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!222 &1354276599455837733
            CanvasRenderer:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 5236155920483817472}
              m_CullTransparentMesh: 0
            --- !u!114 &1404403891308606288
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 5236155920483817472}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: fe87c0e1cc204ed48ad3b37840f39efc, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Material: {fileID: 0}
              m_Color: {r: 0.32941177, g: 0.32941177, b: 0.32941177, a: 1}
              m_RaycastTarget: 1
              m_RaycastPadding: {x: 0, y: 0, z: 0, w: 0}
              m_Maskable: 1
              m_OnCullStateChanged:
                m_PersistentCalls:
                  m_Calls: []
              m_Sprite: {fileID: 21300000, guid: 2cb05668260eb084c843ef950c38c6a7, type: 3}
              m_Type: 1
              m_PreserveAspect: 0
              m_FillCenter: 1
              m_FillMethod: 4
              m_FillAmount: 1
              m_FillClockwise: 1
              m_FillOrigin: 0
              m_UseSpriteMesh: 0
              m_PixelsPerUnitMultiplier: 1
            --- !u!1 &5336913817645479627
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 7156548421552507146}
              - component: {fileID: 1940237196757606731}
              - component: {fileID: 3950078885053394264}
              - component: {fileID: 4045448407147026770}
              m_Layer: 13
              m_Name: Button
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &7156548421552507146
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 5336913817645479627}
              m_LocalRotation: {x: -0, y: -0, z: -0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children:
              - {fileID: 7732439877517000875}
              m_Father: {fileID: 862965074048094962}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 0}
              m_AnchorMax: {x: 1, y: 1}
              m_AnchoredPosition: {x: 0, y: 0}
              m_SizeDelta: {x: -7.5, y: -7.5}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!222 &1940237196757606731
            CanvasRenderer:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 5336913817645479627}
              m_CullTransparentMesh: 0
            --- !u!114 &3950078885053394264
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 5336913817645479627}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: fe87c0e1cc204ed48ad3b37840f39efc, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Material: {fileID: 0}
              m_Color: {r: 0.15280277, g: 0.16425171, b: 0.18823528, a: 1}
              m_RaycastTarget: 1
              m_RaycastPadding: {x: 0, y: 0, z: 0, w: 0}
              m_Maskable: 1
              m_OnCullStateChanged:
                m_PersistentCalls:
                  m_Calls: []
              m_Sprite: {fileID: 21300000, guid: 2cb05668260eb084c843ef950c38c6a7, type: 3}
              m_Type: 1
              m_PreserveAspect: 0
              m_FillCenter: 1
              m_FillMethod: 4
              m_FillAmount: 1
              m_FillClockwise: 1
              m_FillOrigin: 0
              m_UseSpriteMesh: 0
              m_PixelsPerUnitMultiplier: 1
            --- !u!114 &4045448407147026770
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 5336913817645479627}
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
                m_SelectedTrigger: Highlighted
                m_DisabledTrigger: Disabled
              m_Interactable: 1
              m_TargetGraphic: {fileID: 3950078885053394264}
              m_OnClick:
                m_PersistentCalls:
                  m_Calls:
                  - m_Target: {fileID: 2474281132889786057}
                    m_TargetAssemblyTypeName:\s
                    m_MethodName: SendCustomEvent
                    m_Mode: 5
                    m_Arguments:
                      m_ObjectArgument: {fileID: 0}
                      m_ObjectArgumentAssemblyTypeName: UnityEngine.Object, UnityEngine
                      m_IntArgument: 0
                      m_FloatArgument: 0
                      m_StringArgument: ShuffleOff
                      m_BoolArgument: 0
                    m_CallState: 2
            --- !u!1 &5347857556171721628
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 5499885433104126674}
              - component: {fileID: 1730121637303289089}
              - component: {fileID: 4145759519882962288}
              - component: {fileID: 9177626086358576811}
              m_Layer: 13
              m_Name: Viewport
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &5499885433104126674
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 5347857556171721628}
              m_LocalRotation: {x: -0, y: -0, z: -0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children:
              - {fileID: 8591821334734587905}
              m_Father: {fileID: 7882450243436679629}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 0}
              m_AnchorMax: {x: 0, y: 0}
              m_AnchoredPosition: {x: 0, y: 0}
              m_SizeDelta: {x: 0, y: 0}
              m_Pivot: {x: 0, y: 1}
            --- !u!222 &1730121637303289089
            CanvasRenderer:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 5347857556171721628}
              m_CullTransparentMesh: 0
            --- !u!114 &4145759519882962288
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 5347857556171721628}
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
              m_Type: 1
              m_PreserveAspect: 0
              m_FillCenter: 1
              m_FillMethod: 4
              m_FillAmount: 1
              m_FillClockwise: 1
              m_FillOrigin: 0
              m_UseSpriteMesh: 0
              m_PixelsPerUnitMultiplier: 1
            --- !u!114 &9177626086358576811
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 5347857556171721628}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: 31a19414c41e5ae4aae2af33fee712f6, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_ShowMaskGraphic: 0
            --- !u!1 &5522051266895349127
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 2365921489397638528}
              - component: {fileID: 7556010666547576843}
              - component: {fileID: 8788715685145255554}
              - component: {fileID: 6203677359603224737}
              m_Layer: 13
              m_Name: Button
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &2365921489397638528
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 5522051266895349127}
              m_LocalRotation: {x: -0, y: -0, z: -0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children:
              - {fileID: 4501851587799980252}
              m_Father: {fileID: 5455651032344713475}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 0}
              m_AnchorMax: {x: 1, y: 1}
              m_AnchoredPosition: {x: 0, y: 0}
              m_SizeDelta: {x: -7.5, y: -7.5}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!222 &7556010666547576843
            CanvasRenderer:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 5522051266895349127}
              m_CullTransparentMesh: 0
            --- !u!114 &8788715685145255554
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 5522051266895349127}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: fe87c0e1cc204ed48ad3b37840f39efc, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Material: {fileID: 0}
              m_Color: {r: 0.15280277, g: 0.16425171, b: 0.18823528, a: 1}
              m_RaycastTarget: 1
              m_RaycastPadding: {x: 0, y: 0, z: 0, w: 0}
              m_Maskable: 1
              m_OnCullStateChanged:
                m_PersistentCalls:
                  m_Calls: []
              m_Sprite: {fileID: 21300000, guid: 2cb05668260eb084c843ef950c38c6a7, type: 3}
              m_Type: 1
              m_PreserveAspect: 0
              m_FillCenter: 1
              m_FillMethod: 4
              m_FillAmount: 1
              m_FillClockwise: 1
              m_FillOrigin: 0
              m_UseSpriteMesh: 0
              m_PixelsPerUnitMultiplier: 1
            --- !u!114 &6203677359603224737
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 5522051266895349127}
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
                m_SelectedTrigger: Highlighted
                m_DisabledTrigger: Disabled
              m_Interactable: 1
              m_TargetGraphic: {fileID: 8788715685145255554}
              m_OnClick:
                m_PersistentCalls:
                  m_Calls:
                  - m_Target: {fileID: 2474281132889786057}
                    m_TargetAssemblyTypeName:\s
                    m_MethodName: SendCustomEvent
                    m_Mode: 5
                    m_Arguments:
                      m_ObjectArgument: {fileID: 0}
                      m_ObjectArgumentAssemblyTypeName: UnityEngine.Object, UnityEngine
                      m_IntArgument: 0
                      m_FloatArgument: 0
                      m_StringArgument: OrderOn
                      m_BoolArgument: 0
                    m_CallState: 2
            --- !u!1 &5676802701251729215
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 6707122087839446619}
              - component: {fileID: 5256216054618185001}
              - component: {fileID: 5814798658291064497}
              m_Layer: 13
              m_Name: Image
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &6707122087839446619
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 5676802701251729215}
              m_LocalRotation: {x: -0, y: -0, z: -0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children: []
              m_Father: {fileID: 1632715719369580443}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 0.5}
              m_AnchorMax: {x: 1, y: 0.5}
              m_AnchoredPosition: {x: 0, y: 0}
              m_SizeDelta: {x: -12.5, y: 3.75}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!222 &5256216054618185001
            CanvasRenderer:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 5676802701251729215}
              m_CullTransparentMesh: 0
            --- !u!114 &5814798658291064497
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 5676802701251729215}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: fe87c0e1cc204ed48ad3b37840f39efc, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Material: {fileID: 0}
              m_Color: {r: 0.32941177, g: 0.32941177, b: 0.32941177, a: 1}
              m_RaycastTarget: 1
              m_RaycastPadding: {x: 0, y: 0, z: 0, w: 0}
              m_Maskable: 1
              m_OnCullStateChanged:
                m_PersistentCalls:
                  m_Calls: []
              m_Sprite: {fileID: 21300000, guid: 2cb05668260eb084c843ef950c38c6a7, type: 3}
              m_Type: 1
              m_PreserveAspect: 0
              m_FillCenter: 1
              m_FillMethod: 4
              m_FillAmount: 1
              m_FillClockwise: 1
              m_FillOrigin: 0
              m_UseSpriteMesh: 0
              m_PixelsPerUnitMultiplier: 1
            --- !u!1 &5732185482357467243
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 1632715719369580443}
              - component: {fileID: 8151236629879652095}
              m_Layer: 13
              m_Name: Space
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &1632715719369580443
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 5732185482357467243}
              m_LocalRotation: {x: 0, y: 0, z: 0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children:
              - {fileID: 6707122087839446619}
              m_Father: {fileID: 4339596841341581176}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 0}
              m_AnchorMax: {x: 0, y: 0}
              m_AnchoredPosition: {x: 0, y: 0}
              m_SizeDelta: {x: 0, y: 0}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!114 &8151236629879652095
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 5732185482357467243}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: 306cc8c2b49d7114eaa3623786fc2126, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_IgnoreLayout: 0
              m_MinWidth: -1
              m_MinHeight: 3.75
              m_PreferredWidth: -1
              m_PreferredHeight: 3.75
              m_FlexibleWidth: -1
              m_FlexibleHeight: -1
              m_LayoutPriority: 1
            --- !u!1 &6253295283004155290
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 2934297917292193853}
              - component: {fileID: 6221280577944430748}
              m_Layer: 13
              m_Name: Progress
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &2934297917292193853
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 6253295283004155290}
              m_LocalRotation: {x: -0, y: -0, z: -0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children:
              - {fileID: 7784866566451399984}
              m_Father: {fileID: 1463052135501616427}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 0}
              m_AnchorMax: {x: 1, y: 1}
              m_AnchoredPosition: {x: 0, y: 0}
              m_SizeDelta: {x: 0, y: 0}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!114 &6221280577944430748
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 6253295283004155290}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: 67db9e8f0e2ae9c40bc1e2b64352a6b4, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Navigation:
                m_Mode: 0
                m_WrapAround: 0
                m_SelectOnUp: {fileID: 0}
                m_SelectOnDown: {fileID: 0}
                m_SelectOnLeft: {fileID: 0}
                m_SelectOnRight: {fileID: 0}
              m_Transition: 0
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
                m_SelectedTrigger: Highlighted
                m_DisabledTrigger: Disabled
              m_Interactable: 0
              m_TargetGraphic: {fileID: 0}
              m_FillRect: {fileID: 2611176771871737290}
              m_HandleRect: {fileID: 0}
              m_Direction: 0
              m_MinValue: 0
              m_MaxValue: 1
              m_WholeNumbers: 0
              m_Value: 0
              m_OnValueChanged:
                m_PersistentCalls:
                  m_Calls: []
            --- !u!1 &6480019486541945043
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 4588997926351589972}
              - component: {fileID: 6904764722656905799}
              - component: {fileID: 7195801114331267744}
              m_Layer: 13
              m_Name: On
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 0
            --- !u!224 &4588997926351589972
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 6480019486541945043}
              m_LocalRotation: {x: -0, y: -0, z: -0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children:
              - {fileID: 905462480304770084}
              m_Father: {fileID: 8666872866313558918}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 0}
              m_AnchorMax: {x: 1, y: 1}
              m_AnchoredPosition: {x: 0, y: 0}
              m_SizeDelta: {x: 0, y: 0}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!222 &6904764722656905799
            CanvasRenderer:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 6480019486541945043}
              m_CullTransparentMesh: 0
            --- !u!114 &7195801114331267744
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 6480019486541945043}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: fe87c0e1cc204ed48ad3b37840f39efc, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Material: {fileID: 0}
              m_Color: {r: 0.32941177, g: 0.32941177, b: 0.32941177, a: 1}
              m_RaycastTarget: 1
              m_RaycastPadding: {x: 0, y: 0, z: 0, w: 0}
              m_Maskable: 1
              m_OnCullStateChanged:
                m_PersistentCalls:
                  m_Calls: []
              m_Sprite: {fileID: 21300000, guid: 2cb05668260eb084c843ef950c38c6a7, type: 3}
              m_Type: 1
              m_PreserveAspect: 0
              m_FillCenter: 1
              m_FillMethod: 4
              m_FillAmount: 1
              m_FillClockwise: 1
              m_FillOrigin: 0
              m_UseSpriteMesh: 0
              m_PixelsPerUnitMultiplier: 1
            --- !u!1 &6721770289798895619
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 2262372915574598290}
              - component: {fileID: 516695779602108468}
              - component: {fileID: 4897535945776821608}
              m_Layer: 13
              m_Name: Image
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &2262372915574598290
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 6721770289798895619}
              m_LocalRotation: {x: 0, y: 0, z: 0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children: []
              m_Father: {fileID: 3491925480228324496}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0.5, y: 0.5}
              m_AnchorMax: {x: 0.5, y: 0.5}
              m_AnchoredPosition: {x: 0, y: 0}
              m_SizeDelta: {x: 40, y: 40}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!222 &516695779602108468
            CanvasRenderer:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 6721770289798895619}
              m_CullTransparentMesh: 0
            --- !u!114 &4897535945776821608
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 6721770289798895619}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: fe87c0e1cc204ed48ad3b37840f39efc, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Material: {fileID: 0}
              m_Color: {r: 0.2784314, g: 0.94509804, b: 1, a: 1}
              m_RaycastTarget: 0
              m_RaycastPadding: {x: 0, y: 0, z: 0, w: 0}
              m_Maskable: 1
              m_OnCullStateChanged:
                m_PersistentCalls:
                  m_Calls: []
              m_Sprite: {fileID: 21300000, guid: 87423bded6ba52e479591449cdbb2b03, type: 3}
              m_Type: 0
              m_PreserveAspect: 0
              m_FillCenter: 1
              m_FillMethod: 4
              m_FillAmount: 1
              m_FillClockwise: 1
              m_FillOrigin: 0
              m_UseSpriteMesh: 0
              m_PixelsPerUnitMultiplier: 1
            --- !u!1 &6777555798470695454
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 6618017212043412336}
              m_Layer: 13
              m_Name: Sliding Area
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &6618017212043412336
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 6777555798470695454}
              m_LocalRotation: {x: -0, y: -0, z: -0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children:
              - {fileID: 7768613452683655564}
              m_Father: {fileID: 5607099280381067196}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 0}
              m_AnchorMax: {x: 1, y: 1}
              m_AnchoredPosition: {x: 0, y: 0}
              m_SizeDelta: {x: -20, y: -20}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!1 &7012516130704387399
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 540979998993702938}
              - component: {fileID: 3753150900082062283}
              - component: {fileID: 4885916014504539753}
              - component: {fileID: 7248152627479224667}
              m_Layer: 13
              m_Name: Button
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &540979998993702938
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 7012516130704387399}
              m_LocalRotation: {x: -0, y: -0, z: -0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children:
              - {fileID: 7683205716582593170}
              m_Father: {fileID: 1168088437821256370}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 0}
              m_AnchorMax: {x: 1, y: 1}
              m_AnchoredPosition: {x: 0, y: 0}
              m_SizeDelta: {x: -7.5, y: -7.5}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!222 &3753150900082062283
            CanvasRenderer:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 7012516130704387399}
              m_CullTransparentMesh: 0
            --- !u!114 &4885916014504539753
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 7012516130704387399}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: fe87c0e1cc204ed48ad3b37840f39efc, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Material: {fileID: 0}
              m_Color: {r: 0.15280277, g: 0.16425171, b: 0.18823528, a: 1}
              m_RaycastTarget: 1
              m_RaycastPadding: {x: 0, y: 0, z: 0, w: 0}
              m_Maskable: 1
              m_OnCullStateChanged:
                m_PersistentCalls:
                  m_Calls: []
              m_Sprite: {fileID: 21300000, guid: 2cb05668260eb084c843ef950c38c6a7, type: 3}
              m_Type: 1
              m_PreserveAspect: 0
              m_FillCenter: 1
              m_FillMethod: 4
              m_FillAmount: 1
              m_FillClockwise: 1
              m_FillOrigin: 0
              m_UseSpriteMesh: 0
              m_PixelsPerUnitMultiplier: 1
            --- !u!114 &7248152627479224667
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 7012516130704387399}
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
                m_SelectedTrigger: Highlighted
                m_DisabledTrigger: Disabled
              m_Interactable: 1
              m_TargetGraphic: {fileID: 4885916014504539753}
              m_OnClick:
                m_PersistentCalls:
                  m_Calls:
                  - m_Target: {fileID: 2474281132889786057}
                    m_TargetAssemblyTypeName:\s
                    m_MethodName: SendCustomEvent
                    m_Mode: 5
                    m_Arguments:
                      m_ObjectArgument: {fileID: 0}
                      m_ObjectArgumentAssemblyTypeName: UnityEngine.Object, UnityEngine
                      m_IntArgument: 0
                      m_FloatArgument: 0
                      m_StringArgument: LockOff
                      m_BoolArgument: 0
                    m_CallState: 2
            --- !u!1 &7067985475603416164
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 4583568304642747064}
              - component: {fileID: 5693230455356903951}
              - component: {fileID: 4386560795309715779}
              m_Layer: 13
              m_Name: On
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 0
            --- !u!224 &4583568304642747064
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 7067985475603416164}
              m_LocalRotation: {x: -0, y: -0, z: -0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children:
              - {fileID: 4223140562457934030}
              m_Father: {fileID: 1420427921216105593}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 0}
              m_AnchorMax: {x: 1, y: 1}
              m_AnchoredPosition: {x: 0, y: 0}
              m_SizeDelta: {x: 0, y: 0}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!222 &5693230455356903951
            CanvasRenderer:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 7067985475603416164}
              m_CullTransparentMesh: 0
            --- !u!114 &4386560795309715779
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 7067985475603416164}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: fe87c0e1cc204ed48ad3b37840f39efc, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Material: {fileID: 0}
              m_Color: {r: 0.32941177, g: 0.32941177, b: 0.32941177, a: 1}
              m_RaycastTarget: 1
              m_RaycastPadding: {x: 0, y: 0, z: 0, w: 0}
              m_Maskable: 1
              m_OnCullStateChanged:
                m_PersistentCalls:
                  m_Calls: []
              m_Sprite: {fileID: 21300000, guid: 2cb05668260eb084c843ef950c38c6a7, type: 3}
              m_Type: 1
              m_PreserveAspect: 0
              m_FillCenter: 1
              m_FillMethod: 4
              m_FillAmount: 1
              m_FillClockwise: 1
              m_FillOrigin: 0
              m_UseSpriteMesh: 0
              m_PixelsPerUnitMultiplier: 1
            --- !u!1 &7101115506629009941
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 7703634282929296595}
              m_Layer: 13
              m_Name: Play
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &7703634282929296595
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 7101115506629009941}
              m_LocalRotation: {x: -0, y: -0, z: -0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children:
              - {fileID: 3481490395048613060}
              - {fileID: 4837082719793801378}
              m_Father: {fileID: 5325228433000651842}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0.5, y: 0.5}
              m_AnchorMax: {x: 0.5, y: 0.5}
              m_AnchoredPosition: {x: -253.75, y: -3.125}
              m_SizeDelta: {x: 62.5, y: 62.5}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!1 &7124067041161225811
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 4817926349179246528}
              - component: {fileID: 8658777718782836765}
              - component: {fileID: 2474281132889786057}
              m_Layer: 0
              m_Name: Udon (Playlist)
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!4 &4817926349179246528
            Transform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 7124067041161225811}
              serializedVersion: 2
              m_LocalRotation: {x: 0, y: 0, z: 0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children:
              - {fileID: 1151334024725314954}
              m_Father: {fileID: 7211213645248320425}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
            --- !u!114 &8658777718782836765
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 7124067041161225811}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: f50f4e7c91cd3eb46a60ffb72d744ddd, type: 3}
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
              _udonSharpBackingUdonBehaviour: {fileID: 2474281132889786057}
              core: {fileID: 0}
              controller: {fileID: 0}
              defaultOrder: 0
              defaultShuffle: 0
              defaultRepeat: 1
              playOnAwake: 0
              _lockOn: {fileID: 0}
              _lockOnButton: {fileID: 0}
              _lockOff: {fileID: 0}
              _lockOffButton: {fileID: 0}
              _playOn: {fileID: 0}
              _playOnButton: {fileID: 0}
              _playOff: {fileID: 0}
              _playOffButton: {fileID: 0}
              _forward: {fileID: 0}
              _forwardButton: {fileID: 0}
              _orderOn: {fileID: 0}
              _orderOnButton: {fileID: 0}
              _orderOff: {fileID: 0}
              _orderOffButton: {fileID: 0}
              _shuffleOn: {fileID: 0}
              _shuffleOnButton: {fileID: 0}
              _shuffleOff: {fileID: 0}
              _shuffleOffButton: {fileID: 0}
              _repeatOn: {fileID: 0}
              _repeatOnButton: {fileID: 0}
              _repeatOff: {fileID: 0}
              _repeatOffButton: {fileID: 0}
              _content: {fileID: 0}
              _content_length: 0
              _content_buttons: []
              _content_sliders: []
              _content_titles: []
              _content_modes:\s
              _content_urls: []
              _message: {fileID: 0}
              _messageText: {fileID: 0}
            --- !u!114 &2474281132889786057
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 7124067041161225811}
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
              Reliable: 1
              _syncMethod: 3
              serializedProgramAsset: {fileID: 11400000, guid: 66fc6949d50b382479670de4c7ba544b, type: 2}
              programSource: {fileID: 11400000, guid: 4d0835087b932de4981c5df13d287c03, type: 2}
              serializedPublicVariablesBytesString: Ai8AAAAAATIAAABWAFIAQwAuAFUAZABvAG4ALgBDAG8AbQBtAG8AbgAuAFUAZABvAG4AVgBhAHIAaQBhAGIAbABlAFQAYQBiAGwAZQAsACAAVgBSAEMALgBVAGQAbwBuAC4AQwBvAG0AbQBvAG4AAAAAAAYBAAAAAAAAACcBBAAAAHQAeQBwAGUAAWgAAABTAHkAcwB0AGUAbQAuAEMAbwBsAGwAZQBjAHQAaQBvAG4AcwAuAEcAZQBuAGUAcgBpAGMALgBMAGkAcwB0AGAAMQBbAFsAVgBSAEMALgBVAGQAbwBuAC4AQwBvAG0AbQBvAG4ALgBJAG4AdABlAHIAZgBhAGMAZQBzAC4ASQBVAGQAbwBuAFYAYQByAGkAYQBiAGwAZQAsACAAVgBSAEMALgBVAGQAbwBuAC4AQwBvAG0AbQBvAG4AXQBdACwAIABtAHMAYwBvAHIAbABpAGIAAQEJAAAAVgBhAHIAaQBhAGIAbABlAHMALwEAAAABaAAAAFMAeQBzAHQAZQBtAC4AQwBvAGwAbABlAGMAdABpAG8AbgBzAC4ARwBlAG4AZQByAGkAYwAuAEwAaQBzAHQAYAAxAFsAWwBWAFIAQwAuAFUAZABvAG4ALgBDAG8AbQBtAG8AbgAuAEkAbgB0AGUAcgBmAGEAYwBlAHMALgBJAFUAZABvAG4AVgBhAHIAaQBhAGIAbABlACwAIABWAFIAQwAuAFUAZABvAG4ALgBDAG8AbQBtAG8AbgBdAF0ALAAgAG0AcwBjAG8AcgBsAGkAYgABAAAABgQAAAAAAAAAAi8CAAAAAUsAAABWAFIAQwAuAFUAZABvAG4ALgBDAG8AbQBtAG8AbgAuAFUAZABvAG4AVgBhAHIAaQBhAGIAbABlAGAAMQBbAFsAUwB5AHMAdABlAG0ALgBCAG8AbwBsAGUAYQBuACwAIABtAHMAYwBvAHIAbABpAGIAXQBdACwAIABWAFIAQwAuAFUAZABvAG4ALgBDAG8AbQBtAG8AbgACAAAABgIAAAAAAAAAJwEEAAAAdAB5AHAAZQABFwAAAFMAeQBzAHQAZQBtAC4AUwB0AHIAaQBuAGcALAAgAG0AcwBjAG8AcgBsAGkAYgAnAQoAAABTAHkAbQBiAG8AbABOAGEAbQBlAAEOAAAAZABlAGYAYQB1AGwAdABTAGgAdQBmAGYAbABlACcBBAAAAHQAeQBwAGUAARgAAABTAHkAcwB0AGUAbQAuAEIAbwBvAGwAZQBhAG4ALAAgAG0AcwBjAG8AcgBsAGkAYgArAQUAAABWAGEAbAB1AGUAAAcFAjACAAAAAwAAAAYCAAAAAAAAACcBBAAAAHQAeQBwAGUAARcAAABTAHkAcwB0AGUAbQAuAFMAdAByAGkAbgBnACwAIABtAHMAYwBvAHIAbABpAGIAJwEKAAAAUwB5AG0AYgBvAGwATgBhAG0AZQABDQAAAGQAZQBmAGEAdQBsAHQAUgBlAHAAZQBhAHQAJwEEAAAAdAB5AHAAZQABGAAAAFMAeQBzAHQAZQBtAC4AQgBvAG8AbABlAGEAbgAsACAAbQBzAGMAbwByAGwAaQBiACsBBQAAAFYAYQBsAHUAZQABBwUCLwMAAAABSQAAAFYAUgBDAC4AVQBkAG8AbgAuAEMAbwBtAG0AbwBuAC4AVQBkAG8AbgBWAGEAcgBpAGEAYgBsAGUAYAAxAFsAWwBTAHkAcwB0AGUAbQAuAEkAbgB0ADMAMgAsACAAbQBzAGMAbwByAGwAaQBiAF0AXQAsACAAVgBSAEMALgBVAGQAbwBuAC4AQwBvAG0AbQBvAG4ABAAAAAYCAAAAAAAAACcBBAAAAHQAeQBwAGUAARcAAABTAHkAcwB0AGUAbQAuAFMAdAByAGkAbgBnACwAIABtAHMAYwBvAHIAbABpAGIAJwEKAAAAUwB5AG0AYgBvAGwATgBhAG0AZQABHwAAAF8AXwBfAFUAZABvAG4AUwBoAGEAcgBwAEIAZQBoAGEAdgBpAG8AdQByAFYAZQByAHMAaQBvAG4AXwBfAF8AJwEEAAAAdAB5AHAAZQABFgAAAFMAeQBzAHQAZQBtAC4ASQBuAHQAMwAyACwAIABtAHMAYwBvAHIAbABpAGIAFwEFAAAAVgBhAGwAdQBlAAIAAAAHBQIwAgAAAAUAAAAGAgAAAAAAAAAnAQQAAAB0AHkAcABlAAEXAAAAUwB5AHMAdABlAG0ALgBTAHQAcgBpAG4AZwAsACAAbQBzAGMAbwByAGwAaQBiACcBCgAAAFMAeQBtAGIAbwBsAE4AYQBtAGUAAS4AAABfAF8AXwBVAGQAbwBuAFMAaABhAHIAcABCAGUAaABhAHYAaQBvAHUAcgBQAGUAcgBzAGkAcwB0AEQAYQB0AGEARgByAG8AbQBVAHAAZwByAGEAZABlAF8AXwBfACcBBAAAAHQAeQBwAGUAARgAAABTAHkAcwB0AGUAbQAuAEIAbwBvAGwAZQBhAG4ALAAgAG0AcwBjAG8AcgBsAGkAYgArAQUAAABWAGEAbAB1AGUAAQcFBwUHBQ==
              publicVariablesUnityEngineObjects: []
              publicVariablesSerializationDataFormat: 0
            --- !u!1 &7608892280324328625
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 1151334024725314954}
              - component: {fileID: 2385520219689686678}
              - component: {fileID: 7988056478558308791}
              - component: {fileID: 849877283014299691}
              - component: {fileID: 6947425471908949859}
              - component: {fileID: 995108992450159425}
              m_Layer: 13
              m_Name: Canvas
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &1151334024725314954
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 7608892280324328625}
              m_LocalRotation: {x: -0, y: -0, z: -0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 0.001, y: 0.001, z: 0.001}
              m_ConstrainProportionsScale: 0
              m_Children:
              - {fileID: 4339596841341581176}
              m_Father: {fileID: 4817926349179246528}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0.5, y: 0.5}
              m_AnchorMax: {x: 0.5, y: 0.5}
              m_AnchoredPosition: {x: 0, y: 0}
              m_SizeDelta: {x: 720, y: 720}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!223 &2385520219689686678
            Canvas:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 7608892280324328625}
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
            --- !u!114 &7988056478558308791
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 7608892280324328625}
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
              m_DynamicPixelsPerUnit: 3
              m_PresetInfoIsWorld: 0
            --- !u!114 &849877283014299691
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 7608892280324328625}
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
            --- !u!114 &6947425471908949859
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 7608892280324328625}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: -1533785930, guid: 661092b4961be7145bfbe56e1e62337b, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              AllowFocusView: 1
            --- !u!65 &995108992450159425
            BoxCollider:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 7608892280324328625}
              m_Material: {fileID: 0}
              m_IncludeLayers:
                serializedVersion: 2
                m_Bits: 0
              m_ExcludeLayers:
                serializedVersion: 2
                m_Bits: 0
              m_LayerOverridePriority: 0
              m_IsTrigger: 1
              m_ProvidesContacts: 0
              m_Enabled: 1
              serializedVersion: 3
              m_Size: {x: 0, y: 0, z: 0}
              m_Center: {x: 0, y: 0, z: 0}
            --- !u!1 &7612394294417634382
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 3491925480228324496}
              - component: {fileID: 7750543930244818136}
              - component: {fileID: 7807963227514858928}
              - component: {fileID: 8322552156394451972}
              m_Layer: 13
              m_Name: Button
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &3491925480228324496
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 7612394294417634382}
              m_LocalRotation: {x: -0, y: -0, z: -0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children:
              - {fileID: 2262372915574598290}
              m_Father: {fileID: 3481490395048613060}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 0}
              m_AnchorMax: {x: 1, y: 1}
              m_AnchoredPosition: {x: 0, y: 0}
              m_SizeDelta: {x: -7.5, y: -7.5}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!222 &7750543930244818136
            CanvasRenderer:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 7612394294417634382}
              m_CullTransparentMesh: 0
            --- !u!114 &7807963227514858928
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 7612394294417634382}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: fe87c0e1cc204ed48ad3b37840f39efc, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Material: {fileID: 0}
              m_Color: {r: 0.15280277, g: 0.16425171, b: 0.18823528, a: 1}
              m_RaycastTarget: 1
              m_RaycastPadding: {x: 0, y: 0, z: 0, w: 0}
              m_Maskable: 1
              m_OnCullStateChanged:
                m_PersistentCalls:
                  m_Calls: []
              m_Sprite: {fileID: 21300000, guid: 2cb05668260eb084c843ef950c38c6a7, type: 3}
              m_Type: 1
              m_PreserveAspect: 0
              m_FillCenter: 1
              m_FillMethod: 4
              m_FillAmount: 1
              m_FillClockwise: 1
              m_FillOrigin: 0
              m_UseSpriteMesh: 0
              m_PixelsPerUnitMultiplier: 1
            --- !u!114 &8322552156394451972
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 7612394294417634382}
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
                m_SelectedTrigger: Highlighted
                m_DisabledTrigger: Disabled
              m_Interactable: 1
              m_TargetGraphic: {fileID: 7807963227514858928}
              m_OnClick:
                m_PersistentCalls:
                  m_Calls:
                  - m_Target: {fileID: 2474281132889786057}
                    m_TargetAssemblyTypeName:\s
                    m_MethodName: SendCustomEvent
                    m_Mode: 5
                    m_Arguments:
                      m_ObjectArgument: {fileID: 0}
                      m_ObjectArgumentAssemblyTypeName: UnityEngine.Object, UnityEngine
                      m_IntArgument: 0
                      m_FloatArgument: 0
                      m_StringArgument: PlayOn
                      m_BoolArgument: 0
                    m_CallState: 2
            --- !u!1 &7840296488651171222
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 6155808832404954421}
              - component: {fileID: 3910631368116973257}
              - component: {fileID: 3735381563476460231}
              m_Layer: 13
              m_Name: Text
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &6155808832404954421
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 7840296488651171222}
              m_LocalRotation: {x: -0, y: -0, z: -0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children: []
              m_Father: {fileID: 6782800385175815143}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 0}
              m_AnchorMax: {x: 1, y: 1}
              m_AnchoredPosition: {x: 0, y: 0}
              m_SizeDelta: {x: 0, y: 0}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!222 &3910631368116973257
            CanvasRenderer:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 7840296488651171222}
              m_CullTransparentMesh: 0
            --- !u!114 &3735381563476460231
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 7840296488651171222}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: 5f7201a12d95ffc409449d95f23cf332, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Material: {fileID: 0}
              m_Color: {r: 0.27843136, g: 0.94573176, b: 1, a: 1}
              m_RaycastTarget: 0
              m_RaycastPadding: {x: 0, y: 0, z: 0, w: 0}
              m_Maskable: 1
              m_OnCullStateChanged:
                m_PersistentCalls:
                  m_Calls: []
              m_FontData:
                m_Font: {fileID: 10102, guid: 0000000000000000e000000000000000, type: 0}
                m_FontSize: 46
                m_FontStyle: 0
                m_BestFit: 0
                m_MinSize: 0
                m_MaxSize: 300
                m_Alignment: 4
                m_AlignByGeometry: 0
                m_RichText: 1
                m_HorizontalOverflow: 0
                m_VerticalOverflow: 0
                m_LineSpacing: 1
              m_Text: Loading Now
            --- !u!1 &7876329225754498582
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 5455651032344713475}
              - component: {fileID: 8505725553194090466}
              - component: {fileID: 3655261268686660052}
              m_Layer: 13
              m_Name: Off
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &5455651032344713475
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 7876329225754498582}
              m_LocalRotation: {x: -0, y: -0, z: -0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children:
              - {fileID: 2365921489397638528}
              m_Father: {fileID: 8666872866313558918}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 0}
              m_AnchorMax: {x: 1, y: 1}
              m_AnchoredPosition: {x: 0, y: 0}
              m_SizeDelta: {x: 0, y: 0}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!222 &8505725553194090466
            CanvasRenderer:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 7876329225754498582}
              m_CullTransparentMesh: 0
            --- !u!114 &3655261268686660052
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 7876329225754498582}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: fe87c0e1cc204ed48ad3b37840f39efc, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Material: {fileID: 0}
              m_Color: {r: 0.32941177, g: 0.32941177, b: 0.32941177, a: 1}
              m_RaycastTarget: 1
              m_RaycastPadding: {x: 0, y: 0, z: 0, w: 0}
              m_Maskable: 1
              m_OnCullStateChanged:
                m_PersistentCalls:
                  m_Calls: []
              m_Sprite: {fileID: 21300000, guid: 2cb05668260eb084c843ef950c38c6a7, type: 3}
              m_Type: 1
              m_PreserveAspect: 0
              m_FillCenter: 1
              m_FillMethod: 4
              m_FillAmount: 1
              m_FillClockwise: 1
              m_FillOrigin: 0
              m_UseSpriteMesh: 0
              m_PixelsPerUnitMultiplier: 1
            --- !u!1 &7891607565700243765
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 1463052135501616427}
              - component: {fileID: 2433238879942300762}
              - component: {fileID: 7991607276912717440}
              - component: {fileID: 1819540758820936280}
              m_Layer: 13
              m_Name: Button
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &1463052135501616427
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 7891607565700243765}
              m_LocalRotation: {x: -0, y: -0, z: -0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children:
              - {fileID: 2934297917292193853}
              - {fileID: 8838336001348390991}
              m_Father: {fileID: 3357658478605255507}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 0}
              m_AnchorMax: {x: 1, y: 1}
              m_AnchoredPosition: {x: 0, y: 0}
              m_SizeDelta: {x: 0, y: 0}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!222 &2433238879942300762
            CanvasRenderer:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 7891607565700243765}
              m_CullTransparentMesh: 0
            --- !u!114 &7991607276912717440
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 7891607565700243765}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: fe87c0e1cc204ed48ad3b37840f39efc, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Material: {fileID: 0}
              m_Color: {r: 0.15280277, g: 0.16425171, b: 0.18823528, a: 1}
              m_RaycastTarget: 1
              m_RaycastPadding: {x: 0, y: 0, z: 0, w: 0}
              m_Maskable: 1
              m_OnCullStateChanged:
                m_PersistentCalls:
                  m_Calls: []
              m_Sprite: {fileID: 21300000, guid: 2cb05668260eb084c843ef950c38c6a7, type: 3}
              m_Type: 1
              m_PreserveAspect: 0
              m_FillCenter: 1
              m_FillMethod: 4
              m_FillAmount: 1
              m_FillClockwise: 1
              m_FillOrigin: 0
              m_UseSpriteMesh: 0
              m_PixelsPerUnitMultiplier: 1
            --- !u!114 &1819540758820936280
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 7891607565700243765}
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
                m_SelectedTrigger: Highlighted
                m_DisabledTrigger: Disabled
              m_Interactable: 1
              m_TargetGraphic: {fileID: 7991607276912717440}
              m_OnClick:
                m_PersistentCalls:
                  m_Calls:
                  - m_Target: {fileID: 1819540758820936280}
                    m_TargetAssemblyTypeName:\s
                    m_MethodName: set_enabled
                    m_Mode: 6
                    m_Arguments:
                      m_ObjectArgument: {fileID: 0}
                      m_ObjectArgumentAssemblyTypeName: UnityEngine.Object, UnityEngine
                      m_IntArgument: 0
                      m_FloatArgument: 0
                      m_StringArgument:\s
                      m_BoolArgument: 0
                    m_CallState: 2
                  - m_Target: {fileID: 2474281132889786057}
                    m_TargetAssemblyTypeName:\s
                    m_MethodName: SendCustomEvent
                    m_Mode: 5
                    m_Arguments:
                      m_ObjectArgument: {fileID: 0}
                      m_ObjectArgumentAssemblyTypeName: UnityEngine.Object, UnityEngine
                      m_IntArgument: 0
                      m_FloatArgument: 0
                      m_StringArgument: OnButtonClicked
                      m_BoolArgument: 0
                    m_CallState: 2
                  - m_Target: {fileID: 1819540758820936280}
                    m_TargetAssemblyTypeName:\s
                    m_MethodName: set_enabled
                    m_Mode: 6
                    m_Arguments:
                      m_ObjectArgument: {fileID: 0}
                      m_ObjectArgumentAssemblyTypeName: UnityEngine.Object, UnityEngine
                      m_IntArgument: 0
                      m_FloatArgument: 0
                      m_StringArgument:\s
                      m_BoolArgument: 1
                    m_CallState: 2
            --- !u!1 &8027966869101690241
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 8925540823639722988}
              - component: {fileID: 5372597172936041804}
              - component: {fileID: 5365854023307370756}
              m_Layer: 13
              m_Name: Image
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &8925540823639722988
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 8027966869101690241}
              m_LocalRotation: {x: 0, y: 0, z: 0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children: []
              m_Father: {fileID: 7357372083043197374}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0.5, y: 0.5}
              m_AnchorMax: {x: 0.5, y: 0.5}
              m_AnchoredPosition: {x: 0, y: 0}
              m_SizeDelta: {x: 40, y: 40}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!222 &5372597172936041804
            CanvasRenderer:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 8027966869101690241}
              m_CullTransparentMesh: 0
            --- !u!114 &5365854023307370756
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 8027966869101690241}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: fe87c0e1cc204ed48ad3b37840f39efc, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Material: {fileID: 0}
              m_Color: {r: 0.2784314, g: 0.94509804, b: 1, a: 1}
              m_RaycastTarget: 0
              m_RaycastPadding: {x: 0, y: 0, z: 0, w: 0}
              m_Maskable: 1
              m_OnCullStateChanged:
                m_PersistentCalls:
                  m_Calls: []
              m_Sprite: {fileID: 21300000, guid: 37fb1ff84225eb24a8e1c813cca46f44, type: 3}
              m_Type: 0
              m_PreserveAspect: 0
              m_FillCenter: 1
              m_FillMethod: 4
              m_FillAmount: 1
              m_FillClockwise: 1
              m_FillOrigin: 0
              m_UseSpriteMesh: 0
              m_PixelsPerUnitMultiplier: 1
            --- !u!1 &8046282114940451082
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
            """;

    private final String prefab_4 = """
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 4501851587799980252}
              - component: {fileID: 7807981569352348598}
              - component: {fileID: 2221273829837863353}
              m_Layer: 13
              m_Name: Image
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &4501851587799980252
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 8046282114940451082}
              m_LocalRotation: {x: 0, y: 0, z: 0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children: []
              m_Father: {fileID: 2365921489397638528}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0.5, y: 0.5}
              m_AnchorMax: {x: 0.5, y: 0.5}
              m_AnchoredPosition: {x: 0, y: 0}
              m_SizeDelta: {x: 40, y: 40}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!222 &7807981569352348598
            CanvasRenderer:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 8046282114940451082}
              m_CullTransparentMesh: 0
            --- !u!114 &2221273829837863353
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 8046282114940451082}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: fe87c0e1cc204ed48ad3b37840f39efc, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Material: {fileID: 0}
              m_Color: {r: 0.2784314, g: 0.94509804, b: 1, a: 1}
              m_RaycastTarget: 0
              m_RaycastPadding: {x: 0, y: 0, z: 0, w: 0}
              m_Maskable: 1
              m_OnCullStateChanged:
                m_PersistentCalls:
                  m_Calls: []
              m_Sprite: {fileID: 21300000, guid: 60de9f135460b744abae48700467a9b3, type: 3}
              m_Type: 0
              m_PreserveAspect: 0
              m_FillCenter: 1
              m_FillMethod: 4
              m_FillAmount: 1
              m_FillClockwise: 1
              m_FillOrigin: 0
              m_UseSpriteMesh: 0
              m_PixelsPerUnitMultiplier: 1
            --- !u!1 &8626555209219319520
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 6821175800260992208}
              - component: {fileID: 5153101581990082464}
              - component: {fileID: 3838702474127126379}
              - component: {fileID: 353828526465094305}
              m_Layer: 13
              m_Name: Button
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &6821175800260992208
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 8626555209219319520}
              m_LocalRotation: {x: -0, y: -0, z: -0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children:
              - {fileID: 1567269430534133821}
              m_Father: {fileID: 3409546890608918753}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 0}
              m_AnchorMax: {x: 1, y: 1}
              m_AnchoredPosition: {x: 0, y: 0}
              m_SizeDelta: {x: -7.5, y: -7.5}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!222 &5153101581990082464
            CanvasRenderer:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 8626555209219319520}
              m_CullTransparentMesh: 0
            --- !u!114 &3838702474127126379
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 8626555209219319520}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: fe87c0e1cc204ed48ad3b37840f39efc, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Material: {fileID: 0}
              m_Color: {r: 0.15280277, g: 0.16425171, b: 0.18823528, a: 1}
              m_RaycastTarget: 1
              m_RaycastPadding: {x: 0, y: 0, z: 0, w: 0}
              m_Maskable: 1
              m_OnCullStateChanged:
                m_PersistentCalls:
                  m_Calls: []
              m_Sprite: {fileID: 21300000, guid: 2cb05668260eb084c843ef950c38c6a7, type: 3}
              m_Type: 1
              m_PreserveAspect: 0
              m_FillCenter: 1
              m_FillMethod: 4
              m_FillAmount: 1
              m_FillClockwise: 1
              m_FillOrigin: 0
              m_UseSpriteMesh: 0
              m_PixelsPerUnitMultiplier: 1
            --- !u!114 &353828526465094305
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 8626555209219319520}
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
                m_SelectedTrigger: Highlighted
                m_DisabledTrigger: Disabled
              m_Interactable: 1
              m_TargetGraphic: {fileID: 3838702474127126379}
              m_OnClick:
                m_PersistentCalls:
                  m_Calls:
                  - m_Target: {fileID: 2474281132889786057}
                    m_TargetAssemblyTypeName:\s
                    m_MethodName: SendCustomEvent
                    m_Mode: 5
                    m_Arguments:
                      m_ObjectArgument: {fileID: 0}
                      m_ObjectArgumentAssemblyTypeName: UnityEngine.Object, UnityEngine
                      m_IntArgument: 0
                      m_FloatArgument: 0
                      m_StringArgument: ShuffleOn
                      m_BoolArgument: 0
                    m_CallState: 2
            --- !u!1 &8712763833618882956
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 8666872866313558918}
              m_Layer: 13
              m_Name: Order
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &8666872866313558918
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 8712763833618882956}
              m_LocalRotation: {x: -0, y: -0, z: -0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children:
              - {fileID: 4588997926351589972}
              - {fileID: 5455651032344713475}
              m_Father: {fileID: 5325228433000651842}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0.5, y: 0.5}
              m_AnchorMax: {x: 0.5, y: 0.5}
              m_AnchoredPosition: {x: 185, y: -3.125}
              m_SizeDelta: {x: 62.5, y: 62.5}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!1 &8948947161004947825
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 862965074048094962}
              - component: {fileID: 5769642495221330693}
              - component: {fileID: 1578502527912264931}
              m_Layer: 13
              m_Name: Off
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 0
            --- !u!224 &862965074048094962
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 8948947161004947825}
              m_LocalRotation: {x: -0, y: -0, z: -0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children:
              - {fileID: 7156548421552507146}
              m_Father: {fileID: 975164195765836818}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 0}
              m_AnchorMax: {x: 1, y: 1}
              m_AnchoredPosition: {x: 0, y: 0}
              m_SizeDelta: {x: 0, y: 0}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!222 &5769642495221330693
            CanvasRenderer:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 8948947161004947825}
              m_CullTransparentMesh: 0
            --- !u!114 &1578502527912264931
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 8948947161004947825}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: fe87c0e1cc204ed48ad3b37840f39efc, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Material: {fileID: 0}
              m_Color: {r: 0.32941177, g: 0.32941177, b: 0.32941177, a: 1}
              m_RaycastTarget: 1
              m_RaycastPadding: {x: 0, y: 0, z: 0, w: 0}
              m_Maskable: 1
              m_OnCullStateChanged:
                m_PersistentCalls:
                  m_Calls: []
              m_Sprite: {fileID: 21300000, guid: 2cb05668260eb084c843ef950c38c6a7, type: 3}
              m_Type: 1
              m_PreserveAspect: 0
              m_FillCenter: 1
              m_FillMethod: 4
              m_FillAmount: 1
              m_FillClockwise: 1
              m_FillOrigin: 0
              m_UseSpriteMesh: 0
              m_PixelsPerUnitMultiplier: 1
            --- !u!1 &9012067881070208391
            GameObject:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              serializedVersion: 6
              m_Component:
              - component: {fileID: 8376744303511097751}
              - component: {fileID: 2213415761109972516}
              - component: {fileID: 2334144823910327083}
              m_Layer: 13
              m_Name: Off
              m_TagString: Untagged
              m_Icon: {fileID: 0}
              m_NavMeshLayer: 0
              m_StaticEditorFlags: 0
              m_IsActive: 1
            --- !u!224 &8376744303511097751
            RectTransform:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 9012067881070208391}
              m_LocalRotation: {x: -0, y: -0, z: -0, w: 1}
              m_LocalPosition: {x: 0, y: 0, z: 0}
              m_LocalScale: {x: 1, y: 1, z: 1}
              m_ConstrainProportionsScale: 0
              m_Children:
              - {fileID: 7357372083043197374}
              m_Father: {fileID: 1420427921216105593}
              m_LocalEulerAnglesHint: {x: 0, y: 0, z: 0}
              m_AnchorMin: {x: 0, y: 0}
              m_AnchorMax: {x: 1, y: 1}
              m_AnchoredPosition: {x: 0, y: 0}
              m_SizeDelta: {x: 0, y: 0}
              m_Pivot: {x: 0.5, y: 0.5}
            --- !u!222 &2213415761109972516
            CanvasRenderer:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 9012067881070208391}
              m_CullTransparentMesh: 0
            --- !u!114 &2334144823910327083
            MonoBehaviour:
              m_ObjectHideFlags: 0
              m_CorrespondingSourceObject: {fileID: 0}
              m_PrefabInstance: {fileID: 0}
              m_PrefabAsset: {fileID: 0}
              m_GameObject: {fileID: 9012067881070208391}
              m_Enabled: 1
              m_EditorHideFlags: 0
              m_Script: {fileID: 11500000, guid: fe87c0e1cc204ed48ad3b37840f39efc, type: 3}
              m_Name:\s
              m_EditorClassIdentifier:\s
              m_Material: {fileID: 0}
              m_Color: {r: 0.32941177, g: 0.32941177, b: 0.32941177, a: 1}
              m_RaycastTarget: 1
              m_RaycastPadding: {x: 0, y: 0, z: 0, w: 0}
              m_Maskable: 1
              m_OnCullStateChanged:
                m_PersistentCalls:
                  m_Calls: []
              m_Sprite: {fileID: 21300000, guid: 2cb05668260eb084c843ef950c38c6a7, type: 3}
              m_Type: 1
              m_PreserveAspect: 0
              m_FillCenter: 1
              m_FillMethod: 4
              m_FillAmount: 1
              m_FillClockwise: 1
              m_FillOrigin: 0
              m_UseSpriteMesh: 0
              m_PixelsPerUnitMultiplier: 1
            """;

    private List<PlayListData> urls = null;

    @Override
    public void setUrls(List<PlayListData> urls) {
       this.urls = urls;
    }

    @Override
    public String getPrefab() {

        StringBuilder sb = new StringBuilder();
        sb.append(prefab_1).append(prefab_2);

        if (urls != null && !urls.isEmpty()){
            for (PlayListData url : urls) {
                sb.append(prefab_video.replaceAll("#title#", unicode(url.getTitle())).replaceAll("#url#", url.getVideoURL()));
            }
        }

        sb.append(prefab_3).append(prefab_4);

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
