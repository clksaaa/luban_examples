//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------
package cfg.condition;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;



public final class GenderLimit extends cfg.condition.BoolRoleCondition {
    public GenderLimit(JsonObject __json__) { 
        super(__json__);
        gender = __json__.get("gender").getAsInt();
    }

    public GenderLimit(int gender ) {
        super();
        this.gender = gender;
    }

    public static GenderLimit deserializeGenderLimit(JsonObject __json__) {
        return new GenderLimit(__json__);
    }

    public final int gender;

    public static final int __ID__ = 103675143;

    @Override
    public int getTypeId() { return __ID__; }

    @Override
    public void resolve(java.util.HashMap<String, Object> _tables) {
        super.resolve(_tables);
    }

    @Override
    public String toString() {
        return "{ "
        + "gender:" + gender + ","
        + "}";
    }
}
