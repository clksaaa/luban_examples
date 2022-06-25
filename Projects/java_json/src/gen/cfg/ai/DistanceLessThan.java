//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------
package cfg.ai;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;



public final class DistanceLessThan extends cfg.ai.Decorator {
    public DistanceLessThan(JsonObject __json__) { 
        super(__json__);
        actor1Key = __json__.get("actor1_key").getAsString();
        actor2Key = __json__.get("actor2_key").getAsString();
        distance = __json__.get("distance").getAsFloat();
        reverseResult = __json__.get("reverse_result").getAsBoolean();
    }

    public DistanceLessThan(int id, String node_name, int flow_abort_mode, String actor1_key, String actor2_key, float distance, boolean reverse_result ) {
        super(id, node_name, flow_abort_mode);
        this.actor1Key = actor1_key;
        this.actor2Key = actor2_key;
        this.distance = distance;
        this.reverseResult = reverse_result;
    }

    public static DistanceLessThan deserializeDistanceLessThan(JsonObject __json__) {
        return new DistanceLessThan(__json__);
    }

    public final String actor1Key;
    public final String actor2Key;
    public final float distance;
    public final boolean reverseResult;

    public static final int __ID__ = -1207170283;

    @Override
    public int getTypeId() { return __ID__; }

    @Override
    public void resolve(java.util.HashMap<String, Object> _tables) {
        super.resolve(_tables);
    }

    @Override
    public String toString() {
        return "{ "
        + "id:" + id + ","
        + "nodeName:" + nodeName + ","
        + "flowAbortMode:" + flowAbortMode + ","
        + "actor1Key:" + actor1Key + ","
        + "actor2Key:" + actor2Key + ","
        + "distance:" + distance + ","
        + "reverseResult:" + reverseResult + ","
        + "}";
    }
}
