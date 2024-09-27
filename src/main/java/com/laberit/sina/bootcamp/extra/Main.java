package com.laberit.sina.bootcamp.extra;


import com.laberit.sina.bootcamp.extra.gui.controller.MainController;
import com.laberit.sina.bootcamp.extra.gui.view.MainUI;

public class Main {
    public static void main(String[] args) {
        MainUI mainUI = new MainUI();
        MainController mainController = new MainController(mainUI);
        mainController.initView();
    }
}
