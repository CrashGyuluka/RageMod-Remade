
package net.mcreator.ragemod.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import net.mcreator.ragemod.world.inventory.ToxicToppedBlocksItemGuiMenu;
import net.mcreator.ragemod.network.ToxicToppedBlocksItemGuiButtonMessage;
import net.mcreator.ragemod.RagemodMod;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class ToxicToppedBlocksItemGuiScreen extends AbstractContainerScreen<ToxicToppedBlocksItemGuiMenu> {
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public ToxicToppedBlocksItemGuiScreen(ToxicToppedBlocksItemGuiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 282;
		this.imageHeight = 176;
	}

	private static final ResourceLocation texture = new ResourceLocation("ragemod:textures/toxic_topped_blocks_item_gui.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, "Toxic Topped Blocks Selector", 67, 9, -16711885);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
	}

	@Override
	public void init() {
		super.init();
		this.minecraft.keyboardHandler.setSendRepeatsToGui(true);
		this.addRenderableWidget(new Button(this.leftPos + 225, this.topPos + 5, 51, 20, new TextComponent("RESET"), e -> {
			if (true) {
				RagemodMod.PACKET_HANDLER.sendToServer(new ToxicToppedBlocksItemGuiButtonMessage(0, x, y, z));
				ToxicToppedBlocksItemGuiButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}));
	}
}
