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



public final class Blackboard {
    public Blackboard(JsonObject __json__) { 
        name = __json__.get("name").getAsString();
        desc = __json__.get("desc").getAsString();
        parentName = __json__.get("parent_name").getAsString();
        { com.google.gson.JsonArray _json0_ = __json__.get("keys").getAsJsonArray(); keys = new java.util.ArrayList<cfg.ai.BlackboardKey>(_json0_.size()); for(JsonElement __e : _json0_) { cfg.ai.BlackboardKey __v;  __v = new cfg.ai.BlackboardKey(__e.getAsJsonObject());  keys.add(__v); }   }
    }

    public Blackboard(String name, String desc, String parent_name, java.util.ArrayList<cfg.ai.BlackboardKey> keys ) {
        this.name = name;
        this.desc = desc;
        this.parentName = parent_name;
        this.keys = keys;
    }

    public static Blackboard deserializeBlackboard(JsonObject __json__) {
        return new Blackboard(__json__);
    }

    public final String name;
    public final String desc;
    public final String parentName;
    public cfg.ai.Blackboard parentName_Ref;
    public final java.util.ArrayList<cfg.ai.BlackboardKey> keys;


    public void resolve(java.util.HashMap<String, Object> _tables) {
        this.parentName_Ref = ((cfg.ai.TbBlackboard)_tables.get("ai.TbBlackboard")).get(parentName);
        for(cfg.ai.BlackboardKey _e : keys) { if (_e != null) _e.resolve(_tables); }
    }

    @Override
    public String toString() {
        return "{ "
        + "name:" + name + ","
        + "desc:" + desc + ","
        + "parentName:" + parentName + ","
        + "keys:" + keys + ","
        + "}";
    }
}
