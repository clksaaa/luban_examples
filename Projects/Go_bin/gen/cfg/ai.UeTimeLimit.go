
//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

package cfg

import (
    "luban_examples/go_bin/bright/serialization"
)

import "errors"

type AiUeTimeLimit struct {
    Id int32
    NodeName string
    FlowAbortMode int32
    LimitTime float32
}

const TypeId_AiUeTimeLimit = 338469720

func (*AiUeTimeLimit) GetTypeId() int32 {
    return 338469720
}

func (_v *AiUeTimeLimit)Serialize(_buf *serialization.ByteBuf) {
    // not support
}

func (_v *AiUeTimeLimit)Deserialize(_buf *serialization.ByteBuf) (err error) {
    { if _v.Id, err = _buf.ReadInt(); err != nil { err = errors.New("_v.Id error"); return } }
    { if _v.NodeName, err = _buf.ReadString(); err != nil { err = errors.New("_v.NodeName error"); return } }
    { if _v.FlowAbortMode, err = _buf.ReadInt(); err != nil { err = errors.New("_v.FlowAbortMode error"); return } }
    { if _v.LimitTime, err = _buf.ReadFloat(); err != nil { err = errors.New("_v.LimitTime error"); return } }
    return
}

func DeserializeAiUeTimeLimit(_buf *serialization.ByteBuf) (*AiUeTimeLimit, error) {
    v := &AiUeTimeLimit{}
    if err := v.Deserialize(_buf); err == nil {
        return v, nil
    } else {
        return nil, err
    }
}
