
//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------
package cfg.cost;

import bright.serialization.*;



public abstract class Cost {
    public Cost(ByteBuf _buf) { 
    }

    public Cost() {
    }

    public static Cost deserializeCost(ByteBuf _buf) {
        switch (_buf.readInt()) {
            case cfg.cost.CostCurrency.__ID__: return new cfg.cost.CostCurrency(_buf);
            case cfg.cost.CostCurrencies.__ID__: return new cfg.cost.CostCurrencies(_buf);
            case cfg.cost.CostOneItem.__ID__: return new cfg.cost.CostOneItem(_buf);
            case cfg.cost.CostItem.__ID__: return new cfg.cost.CostItem(_buf);
            case cfg.cost.CostItems.__ID__: return new cfg.cost.CostItems(_buf);
            default: throw new SerializationException();
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
