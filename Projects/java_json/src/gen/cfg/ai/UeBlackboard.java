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



public final class UeBlackboard extends cfg.ai.Decorator {
    public UeBlackboard(JsonObject __json__) { 
        super(__json__);
        notifyObserver = __json__.get("notify_observer").getAsInt();
        blackboardKey = __json__.get("blackboard_key").getAsString();
        keyQuery = cfg.ai.KeyQueryOperator.deserializeKeyQueryOperator(__json__.get("key_query").getAsJsonObject());
    }

    public UeBlackboard(int id, String node_name, int flow_abort_mode, int notify_observer, String blackboard_key, cfg.ai.KeyQueryOperator key_query ) {
        super(id, node_name, flow_abort_mode);
        this.notifyObserver = notify_observer;
        this.blackboardKey = blackboard_key;
        this.keyQuery = key_query;
    }

    public static UeBlackboard deserializeUeBlackboard(JsonObject __json__) {
        return new UeBlackboard(__json__);
    }

    public final int notifyObserver;
    public final String blackboardKey;
    public final cfg.ai.KeyQueryOperator keyQuery;

    public static final int __ID__ = -315297507;

    @Override
    public int getTypeId() { return __ID__; }

    @Override
    public void resolve(java.util.HashMap<String, Object> _tables) {
        super.resolve(_tables);
        if (keyQuery != null) {keyQuery.resolve(_tables);}
    }

    @Override
    public String toString() {
        return "{ "
        + "id:" + id + ","
        + "nodeName:" + nodeName + ","
        + "flowAbortMode:" + flowAbortMode + ","
        + "notifyObserver:" + notifyObserver + ","
        + "blackboardKey:" + blackboardKey + ","
        + "keyQuery:" + keyQuery + ","
        + "}";
    }
}
