package org.example.N_28_POO.GuiStudents.theme;

import java.awt.*;

public enum ColorPalete {
    BLACK(new Color(0x111633)),
    ERROR(new Color(0xFF1943)),
    INFO(new Color(0x33C2FF)),
    PRIMARY(new Color(0x8C7CF0)),
    PRIMARY_ALT(new Color(0x111633)),
    SECONDARY(new Color(0x9EA4C1)),
    SUCCESS(new Color(0x57CA22)),
    TRUE_WHITE(new Color(0xffffff)),
    WARNING(new Color(0xFFA319)),
    WHITE(new Color(0xCBCCD2)),

    // gradients
    blue1(new Color(0x6B73FF), new Color(0x000DFF)),
    blue2(new Color(0xABDCFF), new Color(0x0396FF)),
    blue3(new Color(0x141E30), new Color(0x243B55)),
    blue4(new Color(0x2b5876), new Color(0x4e4376)),

    orange1(new Color(0xFCCF31),new Color(0xF55555)),
    orange2(new Color(0xFFD3A5),new Color(0xFD6585)),
    orange3(new Color(0xf6d365),new Color(0xfda085)),
    blue5(new Color(0x97ABFF), new Color(0x123597)),

    purple1(new Color(0x43CBFF),new Color(0x9708CC)),
    purple3(new Color(0x667eea),new Color(0x764ba2)),

    pink1(new Color(0xF6CEEC), new Color(0xD939CD)),
    pink2(new Color(0xF761A1), new Color(0x8C1BAB)),

    green1(new Color(0xFFF720), new Color(0x3CD500)),
    green2(new Color(0x00b09b), new Color(0x96c93d)),

    black1(new Color(0x434343), new Color(0x000000)),
    black2(new Color(0x29323c), new Color(0x485563)),

    // shadows
    ShadowSuccess1(new Color(68, 214, 0, 25), new Color(68, 214, 0, 35)),
    Error1(new Color(255, 25, 67, 25), new Color(255, 25, 67, 35)),
    primary1(new Color(112, 99, 192, 25), new Color(112, 99, 192, 35)),
    info1(new Color(51, 194, 255, 25), new Color(51, 194, 255, 35)),
    Primary1(new Color(112, 99, 192, 25), new Color(112, 99, 192, 35)),
    warning(new Color(255, 163, 25, 25), new Color(255, 163, 25, 35)),
    transparent(new Color(112, 99, 192, 0)),
    // layout first color
    bodyBg(new Color(0x070C27));

    private Color colorA;
    private Color colorB;


    ColorPalete(Color colorA) {
        this.colorA = colorA;
    }

    ColorPalete(Color colorA, Color colorB) {
        this.colorA = colorA;
        this.colorB = colorB;
    }

    public Color getColorA() {
        return colorA;
    }

    public void setColorA(Color colorA) {
        this.colorA = colorA;
    }

    public Color getColorB() {
        return colorB;
    }

    public void setColorB(Color colorB) {
        this.colorB = colorB;
    }
}
