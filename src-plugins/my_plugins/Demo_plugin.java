package my_plugins;

import ij.*;
import ij.process.*;
import ij.plugin.filter.*;


public class Demo_plugin implements PlugInFilter {

	public int setup(String arg, ImagePlus imp) {
		return DOES_8G;
	}

	public void run(ImageProcessor ip) {
		int w = ip.getWidth();
		int h = ip.getHeight();
		ImageProcessor ip2 = ip.duplicate();
		for (int v = 0; v < h; v++) {
			for (int u = 0; u < w; u++) {
				int a = ip2.getPixel(u, v);
				int b = 255 - a;
				ip2.putPixel(u, v,b);
			}
		}
		ImagePlus imp2 = new ImagePlus("Nouvelle image", ip2);
		imp2.show();
	}
}
