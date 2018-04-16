package com.solartech.ex.gui;

import java.awt.*;
import javax.swing.*;

class SizedFrame extends JFrame {
    SizedFrame() {
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        int iHight = screenSize.height;
        int iWidth = screenSize.width ;
        this.setSize(iWidth /2, iHight /2);
        setLocationByPlatform(true);

    }

}

public class ExSizedFrameTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(()-> {
            JFrame oFrame = new SizedFrame();
            oFrame.setTitle("SizedFrame");
            oFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            oFrame.setVisible(true);
        });
    }
}
