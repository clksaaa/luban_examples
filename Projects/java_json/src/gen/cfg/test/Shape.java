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



public abstract class Shape {
    public Shape(JsonObject __json__) { 
    }

    public Shape() {
    }

    public static Shape deserializeShape(JsonObject __json__) {
        switch (__json__.get("$type").getAsString()) {
            case "Circle": return new cfg.test.Circle(__json__);
            case "test2.Rectangle": return new cfg.test2.Rectangle(__json__);
            default: throw new bright.serialization.SerializationException();
        }
    }


    public abstract int getTypeId();

    public void resolve(java.util.HashMap<String, Object> _tables) {
    }

    @Override
    public String toString() {
        return "{ "
        + "}";
    }
}
