package com.laberit.sina.bootcamp.extra.gui.controller;

import com.laberit.sina.bootcamp.extra.gui.view.MainUI;

public class MainController {
    private final MainUI mainUI;

    public MainController(MainUI mainUI) {
        this.mainUI = mainUI;

    }

    public void initView(){
        this.mainUI.setVisible(true);
    }
}
