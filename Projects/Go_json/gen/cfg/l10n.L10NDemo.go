//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

package cfg

import "errors"

type L10nL10NDemo struct {
    Id int32
    Text string
}

const TypeId_L10nL10NDemo = -331195887

func (*L10nL10NDemo) GetTypeId() int32 {
    return -331195887
}

func (_v *L10nL10NDemo)Deserialize(_buf map[string]interface{}) (err error) {
    { var _ok_ bool; var _tempNum_ float64; if _tempNum_, _ok_ = _buf["id"].(float64); !_ok_ { err = errors.New("id error"); return }; _v.Id = int32(_tempNum_) }
    {var _ok_ bool; var __json_text__ map[string]interface{}; if __json_text__, _ok_ = _buf["text"].(map[string]interface{}) ; !_ok_ { err = errors.New("_v.Text error"); return };  { var _ok_ bool; if _, _ok_ = __json_text__["key"].(string); !_ok_ { err = errors.New("key error"); return } }; { var _ok_ bool; if _v.Text, _ok_ = __json_text__["text"].(string); !_ok_ { err = errors.New("text error"); return } } }
    return
}

func DeserializeL10nL10NDemo(_buf map[string]interface{}) (*L10nL10NDemo, error) {
    v := &L10nL10NDemo{}
    if err := v.Deserialize(_buf); err == nil {
        return v, nil
    } else {
        return nil, err
    }
}
