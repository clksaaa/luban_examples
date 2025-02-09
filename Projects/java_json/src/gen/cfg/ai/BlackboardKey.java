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



public final class BlackboardKey {
    public BlackboardKey(JsonObject __json__) { 
        name = __json__.get("name").getAsString();
        desc = __json__.get("desc").getAsString();
        isStatic = __json__.get("is_static").getAsBoolean();
        type = __json__.get("type").getAsInt();
        typeClassName = __json__.get("type_class_name").getAsString();
    }

    public BlackboardKey(String name, String desc, boolean is_static, int type, String type_class_name ) {
        this.name = name;
        this.desc = desc;
        this.isStatic = is_static;
        this.type = type;
        this.typeClassName = type_class_name;
    }

    public static BlackboardKey deserializeBlackboardKey(JsonObject __json__) {
        return new BlackboardKey(__json__);
    }

    public final String name;
    public final String desc;
    public final boolean isStatic;
    public final int type;
    public final String typeClassName;


    public void resolve(java.util.HashMap<String, Object> _tables) {
    }

    @Override
    public String toString() {
        return "{ "
        + "name:" + name + ","
        + "desc:" + desc + ","
        + "isStatic:" + isStatic + ","
        + "type:" + type + ","
        + "typeClassName:" + typeClassName + ","
        + "}";
    }
}
