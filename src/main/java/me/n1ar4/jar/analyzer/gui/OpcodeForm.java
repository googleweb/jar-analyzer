/*
 * GPLv3 License
 *
 * Copyright (c) 2023-2025 4ra1n (Jar Analyzer Team)
 *
 * This project is distributed under the GPLv3 license.
 *
 * https://github.com/jar-analyzer/jar-analyzer/blob/master/LICENSE
 */

package me.n1ar4.jar.analyzer.gui;

import com.intellij.uiDesigner.core.GridLayoutManager;
import me.n1ar4.jar.analyzer.gui.util.SyntaxAreaHelper;
import me.n1ar4.jar.analyzer.starter.Const;

import javax.swing.*;
import java.awt.*;

public class OpcodeForm {
    private JPanel masterPanel;
    private static JTextArea codeArea;

    public static void setCodeArea(JTextArea codeArea) {
        OpcodeForm.codeArea = codeArea;
    }

    public static void start(String code) {
        JFrame frame = new JFrame(Const.OpcodeForm);
        OpcodeForm instance = new OpcodeForm();

        SyntaxAreaHelper.buildJavaOpcode(instance.masterPanel);
        codeArea.setText(code);
        codeArea.setCaretPosition(0);

        codeArea.setPreferredSize(new Dimension(900, 600));
        codeArea.setMaximumSize(new Dimension(900, 600));
        codeArea.setMinimumSize(new Dimension(900, 600));

        instance.masterPanel.setPreferredSize(new Dimension(900, 600));
        instance.masterPanel.setMaximumSize(new Dimension(900, 600));
        instance.masterPanel.setMinimumSize(new Dimension(900, 600));

        frame.setContentPane(instance.masterPanel);
        frame.setResizable(true);

        frame.pack();

        frame.setLocationRelativeTo(MainForm.getInstance().getMasterPanel());

        frame.setVisible(true);
    }

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        masterPanel = new JPanel();
        masterPanel.setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return masterPanel;
    }

}
