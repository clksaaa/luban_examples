
//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------
package cfg.tag;

import bright.serialization.*;



public final class TestTag {
    public TestTag(ByteBuf _buf) { 
        id = _buf.readInt();
        value = _buf.readString();
    }

    public TestTag(int id, String value ) {
        this.id = id;
        this.value = value;
    }


    public final int id;
    public final String value;


    public void resolve(java.util.HashMap<String, Object> _tables) {
    }

    @Override
    public String toString() {
        return "{ "
        + "id:" + id + ","
        + "value:" + value + ","
        + "}";
    }
}
