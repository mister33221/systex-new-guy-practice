package com.systex.quiz.ch03.util;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HorseRacing extends JFrame {

    private Map<String, JProgressBar> horsePositions = new HashMap<>();
    private JLabel msgLabel;

    public void setHorsePosition(int horseNumber, int position) {
        String key = "Horse " + horseNumber;
        horsePositions.get(key).setValue(position);
    }

    public void setMessage(String s) {
        msgLabel.setText(s);
    }

    public HorseRacing(int horseAmount) {
        setWindow();
        setContent(horseAmount);
    }

    private void setWindow() {
        this.setTitle("Horse Racing");
        this.setBounds(300, 200, 500, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void setContent(int amount) {
        Container container = setLayout(amount);
        JPanel msgPanel = setMessagePanel();
        ArrayList<JPanel> trackPanels = setTrackPanel(amount);

        container.add(msgPanel);
        for (int i = 0; i < trackPanels.size(); i++) {
            container.add(trackPanels.get(i));
        }
    }

    private Container setLayout(int amount) {
        int withTitleRows = amount + 1;
        Container container = getContentPane();
        container.setLayout(new GridLayout(withTitleRows, 1));
        return container;
    }

    private JPanel setMessagePanel() {
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JLabel label = new JLabel("Racing...");
        msgLabel = label;

        panel.add(label);
        return panel;
    }

    private ArrayList<JPanel> setTrackPanel(int n) {
        ArrayList<JPanel> panels = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
            JProgressBar progressBarAsHorsePosition = new JProgressBar();
            panel.add(progressBarAsHorsePosition);

            progressBarAsHorsePosition.setStringPainted(true);
            progressBarAsHorsePosition.setString("Horse " + i);
            horsePositions.put("Horse " + i, progressBarAsHorsePosition);

            panels.add(panel);
        }
        return panels;
    }

}