
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

type TestDemoD3 struct {
    X1 int32
    X3 int32
}

const TypeId_TestDemoD3 = -2138341746

func (*TestDemoD3) GetTypeId() int32 {
    return -2138341746
}

func (_v *TestDemoD3)Serialize(_buf *serialization.ByteBuf) {
    // not support
}

func (_v *TestDemoD3)Deserialize(_buf *serialization.ByteBuf) (err error) {
    { if _v.X1, err = _buf.ReadInt(); err != nil { err = errors.New("_v.X1 error"); return } }
    { if _v.X3, err = _buf.ReadInt(); err != nil { err = errors.New("_v.X3 error"); return } }
    return
}

func DeserializeTestDemoD3(_buf *serialization.ByteBuf) (interface{}, error) {
    var id int32
    var err error
    if id, err = _buf.ReadInt() ; err != nil {
        return nil, err
    }
    switch id {
        case -2138341717: _v := &TestDemoE1{}; if err = _v.Deserialize(_buf); err != nil { return nil, errors.New("test.DemoE1") } else { return _v, nil }
        default: return nil, errors.New("unknown type id")
    }
}

