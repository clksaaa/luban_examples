
//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------
package cfg.ai;

import bright.serialization.*;



public abstract class ComposeNode extends cfg.ai.FlowNode {
    public ComposeNode(ByteBuf _buf) { 
        super(_buf);
    }

    public ComposeNode(int id, String node_name, java.util.ArrayList<cfg.ai.Decorator> decorators, java.util.ArrayList<cfg.ai.Service> services ) {
        super(id, node_name, decorators, services);
    }

    public static ComposeNode deserializeComposeNode(ByteBuf _buf) {
        switch (_buf.readInt()) {
            case cfg.ai.Sequence.__ID__: return new cfg.ai.Sequence(_buf);
            case cfg.ai.Selector.__ID__: return new cfg.ai.Selector(_buf);
            case cfg.ai.SimpleParallel.__ID__: return new cfg.ai.SimpleParallel(_buf);
            default: throw new SerializationException();
        }
    }



    @Override
    public void resolve(java.util.HashMap<String, Object> _tables) {
        super.resolve(_tables);
    }

    @Override
    public String toString() {
        return "{ "
        + "id:" + id + ","
        + "nodeName:" + nodeName + ","
        + "decorators:" + decorators + ","
        + "services:" + services + ","
        + "}";
    }
}
