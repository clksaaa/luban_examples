//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------
package cfg.test;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;



public final class TestScriptableObject {
    public TestScriptableObject(JsonObject __json__) { 
        id = __json__.get("id").getAsInt();
        desc = __json__.get("desc").getAsString();
        rate = __json__.get("rate").getAsFloat();
        num = __json__.get("num").getAsInt();
        { com.google.gson.JsonObject _json0_ = __json__.get("v2").getAsJsonObject(); float __x; __x = _json0_.get("x").getAsFloat(); float __y; __y = _json0_.get("y").getAsFloat(); v2 = new bright.math.Vector2(__x, __y); }
        { com.google.gson.JsonObject _json0_ = __json__.get("v3").getAsJsonObject(); float __x; __x = _json0_.get("x").getAsFloat(); float __y; __y = _json0_.get("y").getAsFloat(); float __z; __z = _json0_.get("z").getAsFloat();  v3 = new bright.math.Vector3(__x, __y,__z); }
        { com.google.gson.JsonObject _json0_ = __json__.get("v4").getAsJsonObject(); float __x; __x = _json0_.get("x").getAsFloat(); float __y; __y = _json0_.get("y").getAsFloat(); float __z; __z = _json0_.get("z").getAsFloat();  float __w; __w = _json0_.get("w").getAsFloat(); v4 = new bright.math.Vector4(__x, __y, __z, __w); }
    }

    public TestScriptableObject(int id, String desc, float rate, int num, bright.math.Vector2 v2, bright.math.Vector3 v3, bright.math.Vector4 v4 ) {
        this.id = id;
        this.desc = desc;
        this.rate = rate;
        this.num = num;
        this.v2 = v2;
        this.v3 = v3;
        this.v4 = v4;
    }

    public static TestScriptableObject deserializeTestScriptableObject(JsonObject __json__) {
        return new TestScriptableObject(__json__);
    }

    public final int id;
    public final String desc;
    public final float rate;
    public final int num;
    public final bright.math.Vector2 v2;
    public final bright.math.Vector3 v3;
    public final bright.math.Vector4 v4;


    public void resolve(java.util.HashMap<String, Object> _tables) {
    }

    @Override
    public String toString() {
        return "{ "
        + "id:" + id + ","
        + "desc:" + desc + ","
        + "rate:" + rate + ","
        + "num:" + num + ","
        + "v2:" + v2 + ","
        + "v3:" + v3 + ","
        + "v4:" + v4 + ","
        + "}";
    }
}
