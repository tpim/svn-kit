package com.tpim.kit;

import com.intellij.ide.BrowserUtil;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.wm.StatusBar;
import com.intellij.openapi.wm.StatusBarWidget;
import com.intellij.openapi.wm.StatusBarWidgetFactory;
import org.jetbrains.annotations.NotNull;

public class Commit extends AnAction {
    @Override
    public void actionPerformed(AnActionEvent e) {
        System.out.println("Hello, first plugin program.");
        BrowserUtil.browse("http://google.com");







        new StatusBarWidget() {
            @Override
            public void dispose() {
            }

            @Override
            public @NotNull String ID() {
                return null;
            }

            @Override
            public void install(@NotNull StatusBar statusBar) {
            }
        };
    }
}

class KeyHandker{

    public  static @NotNull KeyHandker getInstance(){
        if()
    }


}
