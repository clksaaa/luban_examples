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



public final class TestString {
    public TestString(JsonObject __json__) { 
        id = __json__.get("id").getAsInt();
        s1 = __json__.get("s1").getAsString();
        cs1 = new cfg.test.CompactString(__json__.get("cs1").getAsJsonObject());
        cs2 = new cfg.test.CompactString(__json__.get("cs2").getAsJsonObject());
    }

    public TestString(int id, String s1, cfg.test.CompactString cs1, cfg.test.CompactString cs2 ) {
        this.id = id;
        this.s1 = s1;
        this.cs1 = cs1;
        this.cs2 = cs2;
    }

    public static TestString deserializeTestString(JsonObject __json__) {
        return new TestString(__json__);
    }

    public final int id;
    public final String s1;
    public final cfg.test.CompactString cs1;
    public final cfg.test.CompactString cs2;


    public void resolve(java.util.HashMap<String, Object> _tables) {
        if (cs1 != null) {cs1.resolve(_tables);}
        if (cs2 != null) {cs2.resolve(_tables);}
    }

    @Override
    public String toString() {
        return "{ "
        + "id:" + id + ","
        + "s1:" + s1 + ","
        + "cs1:" + cs1 + ","
        + "cs2:" + cs2 + ","
        + "}";
    }
}
