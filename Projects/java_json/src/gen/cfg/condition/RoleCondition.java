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



public abstract class RoleCondition extends cfg.condition.Condition {
    public RoleCondition(JsonObject __json__) { 
        super(__json__);
    }

    public RoleCondition() {
        super();
    }

    public static RoleCondition deserializeRoleCondition(JsonObject __json__) {
        switch (__json__.get("$type").getAsString()) {
            case "MultiRoleCondition": return new cfg.condition.MultiRoleCondition(__json__);
            case "GenderLimit": return new cfg.condition.GenderLimit(__json__);
            case "MinLevel": return new cfg.condition.MinLevel(__json__);
            case "MaxLevel": return new cfg.condition.MaxLevel(__json__);
            case "MinMaxLevel": return new cfg.condition.MinMaxLevel(__json__);
            case "ClothesPropertyScoreGreaterThan": return new cfg.condition.ClothesPropertyScoreGreaterThan(__json__);
            case "ContainsItem": return new cfg.condition.ContainsItem(__json__);
            default: throw new bright.serialization.SerializationException();
        }
    }



    @Override
    public void resolve(java.util.HashMap<String, Object> _tables) {
        super.resolve(_tables);
    }

    @Override
    public String toString() {
        return "{ "
        + "}";
    }
}
