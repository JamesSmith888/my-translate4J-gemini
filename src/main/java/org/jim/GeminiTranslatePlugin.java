package org.jim;

import org.jim.TranslatePlugin;

/**
 * @author jim
 */
public class GeminiTranslatePlugin implements TranslatePlugin {

    @Override
    public String translate(String s) {
        // TODO: Implement this method
        return "Hello world!";
    }

    @Override
    public String translatePaneTitle() {
        return "Gemini";
    }

    @Override
    public String translatePaneIconPath() {
        return "BgSub_trayIcon.png";
    }
}
