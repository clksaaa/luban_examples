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



public final class UeForceSuccess extends cfg.ai.Decorator {
    public UeForceSuccess(JsonObject __json__) { 
        super(__json__);
    }

    public UeForceSuccess(int id, String node_name, int flow_abort_mode ) {
        super(id, node_name, flow_abort_mode);
    }

    public static UeForceSuccess deserializeUeForceSuccess(JsonObject __json__) {
        return new UeForceSuccess(__json__);
    }


    public static final int __ID__ = 195054574;

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
        + "}";
    }
}
