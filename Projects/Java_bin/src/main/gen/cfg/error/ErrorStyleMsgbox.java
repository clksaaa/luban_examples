
//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------
package cfg.error;

import bright.serialization.*;



public final class ErrorStyleMsgbox extends cfg.error.ErrorStyle {
    public ErrorStyleMsgbox(ByteBuf _buf) { 
        super(_buf);
        btnName = _buf.readString();
        operation = cfg.error.EOperation.valueOf(_buf.readInt());
    }

    public ErrorStyleMsgbox(String btn_name, cfg.error.EOperation operation ) {
        super();
        this.btnName = btn_name;
        this.operation = operation;
    }


    public final String btnName;
    public final cfg.error.EOperation operation;

    public static final int __ID__ = -1920482343;

    @Override
    public int getTypeId() { return __ID__; }

    @Override
    public void resolve(java.util.HashMap<String, Object> _tables) {
        super.resolve(_tables);
    }

    @Override
    public String toString() {
        return "{ "
        + "btnName:" + btnName + ","
        + "operation:" + operation + ","
        + "}";
    }
}
