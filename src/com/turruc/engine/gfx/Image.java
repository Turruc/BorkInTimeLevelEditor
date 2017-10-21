package com.turruc.engine.gfx;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Image {
	private int w, h;
	private int[] p;
	private boolean alpha = false;
	private int lightBlock = Light.NONE;
	private String path;
	private BufferedImage bufferedImage;

	public Image(String path) {
		this.path = path;
		BufferedImage image = null;
		try {
			image = ImageIO.read(java.awt.Image.class.getResourceAsStream(path));
		} catch (IOException e) {
			e.printStackTrace();
		}

		w = image.getWidth();
		h = image.getHeight();
		p = image.getRGB(0, 0, w, h, null, 0, w);

		bufferedImage = image;
		image.flush();
	}

	public Image(int[] p, int w, int h) {
		this.p = p;
		this.w = w;
		this.h = h;
	}

	public int getW() {
		return w;
	}

	public void setW(int w) {
		this.w = w;
	}

	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}

	public int[] getP() {
		return p;
	}

	public void setP(int[] p) {
		this.p = p;
	}

	public boolean isAlpha() {
		return alpha;
	}

	public void setAlpha(boolean alpha) {
		this.alpha = alpha;
	}

	public int getLightBlock() {
		return lightBlock;
	}

	public void setLightBlock(int lightBlock) {
		this.lightBlock = lightBlock;
	}

	public String getPath() {
		return path;
	}

	public BufferedImage getBufferedImage() {
		return bufferedImage;
	}

	public void setBufferedImage(BufferedImage bufferedImage) {
		this.bufferedImage = bufferedImage;
	}

}
