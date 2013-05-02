package com.box.boxjavalibv2.dao;

import java.util.Map;

import com.box.boxjavalibv2.interfaces.IBoxParcelWrapper;
import com.fasterxml.jackson.annotation.JsonProperty;

public class BoxEvent extends BoxItem {

    // Json fields.
    public final static String FIELD_EVENT_TYPE = "event_type";
    public final static String FIELD_SOURCE = "source";
    public final static String FIELD_EVENT_ID = "event_id";

    // Event types.
    public static final String EVENT_TYPE_ITEM_CREATE = "ITEM_CREATE";
    public static final String EVENT_TYPE_ITEM_UPLOAD = "ITEM_UPLOAD";
    public static final String EVENT_TYPE_COMMENT_CREATE = "COMMENT_CREATE";
    public static final String EVENT_TYPE_ITEM_DOWNLOAD = "ITEM_DOWNLOAD";
    public static final String EVENT_TYPE_ITEM_PREVIEW = "ITEM_PREVIEW";
    public static final String EVENT_TYPE_ITEM_MOVE = "ITEM_MOVE";
    public static final String EVENT_TYPE_ITEM_COPY = "ITEM_COPY";
    public static final String EVENT_TYPE_TASK_ASSIGNMENT_CREATE = "TASK_ASSIGNMENT_CREATE";
    public static final String EVENT_TYPE_LOCK_CREATE = "LOCK_CREATE";
    public static final String EVENT_TYPE_LOCK_DESTROY = "LOCK_DESTROY";
    public static final String EVENT_TYPE_ITEM_TRASH = "ITEM_TRASH";
    public static final String EVENT_TYPE_ITEM_UNDELETE_VIA_TRASH = "ITEM_UNDELETE_VIA_TRASH";
    public static final String EVENT_TYPE_COLLAB_ADD_COLLABORATOR = "COLLAB_ADD_COLLABORATOR";
    public static final String EVENT_TYPE_COLLAB_INVITE_COLLABORATOR = "COLLAB_INVITE_COLLABORATOR";
    public static final String EVENT_TYPE_ITEM_SYNC = "ITEM_SYNC";
    public static final String EVENT_TYPE_ITEM_UNSYNC = "ITEM_UNSYNC";
    public static final String EVENT_TYPE_ITEM_RENAME = "ITEM_RENAME";
    public static final String EVENT_TYPE_ITEM_SHARED_CREATE = "ITEM_SHARED_CREATE";
    public static final String EVENT_TYPE_ITEM_SHARED_UNSHARE = "ITEM_SHARED_UNSHARE";
    public static final String EVENT_TYPE_ITEM_SHARED = "ITEM_SHARED";
    public static final String EVENT_TYPE_TAG_ITEM_CREATE = "TAG_ITEM_CREATE";
    public static final String EVENT_TYPE_ADD_LOGIN_ACTIVITY_DEVICE = "ADD_LOGIN_ACTIVITY_DEVICE";

    /**
     * Constructor.
     */
    public BoxEvent() {
        setType(BoxResourceType.EVENT.toString());
    }

    /**
     * Copy constructor, this does deep copy for all the fields.
     * 
     * @param obj
     */
    public BoxEvent(BoxEvent obj) {
        super(obj);
    }

    /**
     * Instantiate the object from a map. Each entry in the map reflects to a field.
     * 
     * @param map
     */
    public BoxEvent(Map<String, Object> map) {
        super(map);
    }

    /**
     * Get event id.
     * 
     * @return event id.
     */
    @JsonProperty(FIELD_EVENT_ID)
    public String getEventId() {
        return (String) getValue(FIELD_EVENT_ID);
    }

    /**
     * Setter. This is only used by {@see <a href="http://jackson.codehaus.org">Jackson JSON processer</a>}
     * 
     * @param eventId
     *            Event id.
     */
    @JsonProperty(FIELD_EVENT_ID)
    private void setEventId(String eventId) {
        put(FIELD_EVENT_ID, eventId);
    }

    /**
     * Get event type.
     * 
     * @return event type.
     */
    @JsonProperty(FIELD_EVENT_TYPE)
    public String getEventType() {
        return (String) getValue(FIELD_EVENT_TYPE);
    }

    /**
     * Setter. This is only used by {@see <a href="http://jackson.codehaus.org">Jackson JSON processer</a>}
     * 
     * @param eventType
     *            Event type. See http://developers.box.com/docs/#events
     */
    @JsonProperty(FIELD_EVENT_TYPE)
    private void setEventType(String eventType) {
        put(FIELD_EVENT_TYPE, eventType);
    }

    /**
     * Get the source item for this event.
     * 
     * @return source item of this event.
     */
    @JsonProperty(FIELD_SOURCE)
    public BoxTypedObject getSource() {
        return (BoxTypedObject) getValue(FIELD_SOURCE);
    }

    /**
     * Set the source item for this event.
     * 
     * @param sourceItem
     *            source item for this event.
     */
    @JsonProperty(FIELD_SOURCE)
    private void setSource(BoxTypedObject sourceItem) {
        put(FIELD_SOURCE, sourceItem);
    }

    /**
     * To support Android Parcelable.
     * 
     * @param in
     */
    public BoxEvent(IBoxParcelWrapper in) {
        super(in);
    }
}
