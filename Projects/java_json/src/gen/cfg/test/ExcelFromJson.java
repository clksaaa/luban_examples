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



public final class ExcelFromJson {
    public ExcelFromJson(JsonObject __json__) { 
        x4 = __json__.get("x4").getAsInt();
        x1 = __json__.get("x1").getAsBoolean();
        x5 = __json__.get("x5").getAsLong();
        x6 = __json__.get("x6").getAsFloat();
        s1 = __json__.get("s1").getAsString();
        __json__.get("s2").getAsJsonObject().get("key").getAsString(); s2 = __json__.get("s2").getAsJsonObject().get("text").getAsString();
        { com.google.gson.JsonObject _json0_ = __json__.get("v2").getAsJsonObject(); float __x; __x = _json0_.get("x").getAsFloat(); float __y; __y = _json0_.get("y").getAsFloat(); v2 = new bright.math.Vector2(__x, __y); }
        { com.google.gson.JsonObject _json0_ = __json__.get("v3").getAsJsonObject(); float __x; __x = _json0_.get("x").getAsFloat(); float __y; __y = _json0_.get("y").getAsFloat(); float __z; __z = _json0_.get("z").getAsFloat();  v3 = new bright.math.Vector3(__x, __y,__z); }
        { com.google.gson.JsonObject _json0_ = __json__.get("v4").getAsJsonObject(); float __x; __x = _json0_.get("x").getAsFloat(); float __y; __y = _json0_.get("y").getAsFloat(); float __z; __z = _json0_.get("z").getAsFloat();  float __w; __w = _json0_.get("w").getAsFloat(); v4 = new bright.math.Vector4(__x, __y, __z, __w); }
        t1 = __json__.get("t1").getAsInt();
        x12 = new cfg.test.DemoType1(__json__.get("x12").getAsJsonObject());
        x13 = __json__.get("x13").getAsInt();
        x14 = cfg.test.DemoDynamic.deserializeDemoDynamic(__json__.get("x14").getAsJsonObject());
        { com.google.gson.JsonArray _json0_ = __json__.get("k1").getAsJsonArray(); int _n = _json0_.size(); k1 = new int[_n]; int _index=0; for(JsonElement __e : _json0_) { int __v;  __v = __e.getAsInt();  k1[_index++] = __v; }   }
        { com.google.gson.JsonArray _json0_ = __json__.get("k8").getAsJsonArray(); k8 = new java.util.HashMap<Integer, Integer>(_json0_.size()); for(JsonElement __e : _json0_) { int __k;  __k = __e.getAsJsonArray().get(0).getAsInt(); int __v;  __v = __e.getAsJsonArray().get(1).getAsInt();  k8.put(__k, __v); }   }
        { com.google.gson.JsonArray _json0_ = __json__.get("k9").getAsJsonArray(); k9 = new java.util.ArrayList<cfg.test.DemoE2>(_json0_.size()); for(JsonElement __e : _json0_) { cfg.test.DemoE2 __v;  __v = new cfg.test.DemoE2(__e.getAsJsonObject());  k9.add(__v); }   }
        { com.google.gson.JsonArray _json0_ = __json__.get("k15").getAsJsonArray(); int _n = _json0_.size(); k15 = new cfg.test.DemoDynamic[_n]; int _index=0; for(JsonElement __e : _json0_) { cfg.test.DemoDynamic __v;  __v = cfg.test.DemoDynamic.deserializeDemoDynamic(__e.getAsJsonObject());  k15[_index++] = __v; }   }
    }

    public ExcelFromJson(int x4, boolean x1, long x5, float x6, String s1, String s2, bright.math.Vector2 v2, bright.math.Vector3 v3, bright.math.Vector4 v4, int t1, cfg.test.DemoType1 x12, int x13, cfg.test.DemoDynamic x14, int[] k1, java.util.HashMap<Integer, Integer> k8, java.util.ArrayList<cfg.test.DemoE2> k9, cfg.test.DemoDynamic[] k15 ) {
        this.x4 = x4;
        this.x1 = x1;
        this.x5 = x5;
        this.x6 = x6;
        this.s1 = s1;
        this.s2 = s2;
        this.v2 = v2;
        this.v3 = v3;
        this.v4 = v4;
        this.t1 = t1;
        this.x12 = x12;
        this.x13 = x13;
        this.x14 = x14;
        this.k1 = k1;
        this.k8 = k8;
        this.k9 = k9;
        this.k15 = k15;
    }

    public static ExcelFromJson deserializeExcelFromJson(JsonObject __json__) {
        return new ExcelFromJson(__json__);
    }

    public final int x4;
    public final boolean x1;
    public final long x5;
    public final float x6;
    public final String s1;
    public final String s2;
    public final bright.math.Vector2 v2;
    public final bright.math.Vector3 v3;
    public final bright.math.Vector4 v4;
    public final int t1;
    public final cfg.test.DemoType1 x12;
    public final int x13;
    public final cfg.test.DemoDynamic x14;
    public final int[] k1;
    public final java.util.HashMap<Integer, Integer> k8;
    public final java.util.ArrayList<cfg.test.DemoE2> k9;
    public final cfg.test.DemoDynamic[] k15;


    public void resolve(java.util.HashMap<String, Object> _tables) {
        if (x12 != null) {x12.resolve(_tables);}
        if (x14 != null) {x14.resolve(_tables);}
        for(cfg.test.DemoE2 _e : k9) { if (_e != null) _e.resolve(_tables); }
        for(cfg.test.DemoDynamic _e : k15) { if (_e != null) _e.resolve(_tables); }
    }

    @Override
    public String toString() {
        return "{ "
        + "x4:" + x4 + ","
        + "x1:" + x1 + ","
        + "x5:" + x5 + ","
        + "x6:" + x6 + ","
        + "s1:" + s1 + ","
        + "s2:" + s2 + ","
        + "v2:" + v2 + ","
        + "v3:" + v3 + ","
        + "v4:" + v4 + ","
        + "t1:" + t1 + ","
        + "x12:" + x12 + ","
        + "x13:" + x13 + ","
        + "x14:" + x14 + ","
        + "k1:" + k1 + ","
        + "k8:" + k8 + ","
        + "k9:" + k9 + ","
        + "k15:" + k15 + ","
        + "}";
    }
}
