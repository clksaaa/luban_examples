//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------
package cfg.error;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;



public final class CodeInfo {
    public CodeInfo(JsonObject __json__) { 
        code = __json__.get("code").getAsInt();
        key = __json__.get("key").getAsString();
    }

    public CodeInfo(int code, String key ) {
        this.code = code;
        this.key = key;
    }

    public static CodeInfo deserializeCodeInfo(JsonObject __json__) {
        return new CodeInfo(__json__);
    }

    public final int code;
    public final String key;


    public void resolve(java.util.HashMap<String, Object> _tables) {
    }

    @Override
    public String toString() {
        return "{ "
        + "code:" + code + ","
        + "key:" + key + ","
        + "}";
    }
}
