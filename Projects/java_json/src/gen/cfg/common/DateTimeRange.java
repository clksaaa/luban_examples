//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------
package cfg.common;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;



public final class DateTimeRange {
    public DateTimeRange(JsonObject __json__) { 
        { if (__json__.has("start_time") && !__json__.get("start_time").isJsonNull()) { startTime = __json__.get("start_time").getAsInt(); } else { startTime = null; } }
        { if (__json__.has("end_time") && !__json__.get("end_time").isJsonNull()) { endTime = __json__.get("end_time").getAsInt(); } else { endTime = null; } }
    }

    public DateTimeRange(Integer start_time, Integer end_time ) {
        this.startTime = start_time;
        this.endTime = end_time;
    }

    public static DateTimeRange deserializeDateTimeRange(JsonObject __json__) {
        return new DateTimeRange(__json__);
    }

    public final Integer startTime;
    public final Integer endTime;


    public void resolve(java.util.HashMap<String, Object> _tables) {
    }

    @Override
    public String toString() {
        return "{ "
        + "startTime:" + startTime + ","
        + "endTime:" + endTime + ","
        + "}";
    }
}
