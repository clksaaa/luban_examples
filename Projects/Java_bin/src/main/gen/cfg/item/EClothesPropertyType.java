
//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

package cfg.item;
public enum EClothesPropertyType {
    /**
     * 简约
     */
    JIAN_YUE(1),
    /**
     * 华丽
     */
    HUA_LI(2),
    /**
     * 可爱
     */
    KE_AI(3),
    /**
     * 成熟
     */
    CHENG_SHU(4),
    /**
     * 活泼
     */
    HUO_PO(5),
    /**
     * 优雅
     */
    YOU_YA(6),
    /**
     * 清纯
     */
    QING_CHUN(7),
    /**
     * 性感
     */
    XING_GAN(8),
    /**
     * 清凉
     */
    QING_LIANG(9),
    /**
     * 保暖
     */
    BAO_NUAN(10),
    ;

    private final int value;

    public int getValue() {
        return value;
    }

    EClothesPropertyType(int value) {
        this.value = value;
    }

    public static EClothesPropertyType valueOf(int value) {
        if (value == 1) return JIAN_YUE;
        if (value == 2) return HUA_LI;
        if (value == 3) return KE_AI;
        if (value == 4) return CHENG_SHU;
        if (value == 5) return HUO_PO;
        if (value == 6) return YOU_YA;
        if (value == 7) return QING_CHUN;
        if (value == 8) return XING_GAN;
        if (value == 9) return QING_LIANG;
        if (value == 10) return BAO_NUAN;
        throw new IllegalArgumentException("");
    }
}
