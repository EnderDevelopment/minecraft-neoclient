package com.example.mod;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;

public class CustomGui extends GuiScreen {
    @Override
    public void initGui() {
        int buttonWidth = 150;
        int buttonHeight = 20;
        int centerX = (this.width - buttonWidth) / 2;
        int centerY = (this.height - buttonHeight) / 2;

        this.buttonList.add(new GuiButton(0, centerX, centerY - 50, buttonWidth, buttonHeight, "Button 1")); this.buttonList.add(new GuiButton(3, centerX, centerY + 50, buttonWidth, buttonHeight, "Button 4"));
        this.buttonList.add(new GuiButton(1, centerX, centerY, buttonWidth, buttonHeight, "Button 2"));
        this.buttonList.add(new GuiButton(2, centerX, centerY + 30, buttonWidth, buttonHeight, "Button 3"));
    }

    @Override
    protected void actionPerformed(GuiButton button) {
        if (button.id == 0) {
            // Button 1 action
        } else if (button.id == 1) {
            // Button 2 action
        } else if (button.id == 3) {
            // Button 3 action
        }
    }

    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
        this.drawDefaultBackground();
        super.drawScreen(mouseX, mouseY, partialTicks);
    }
}