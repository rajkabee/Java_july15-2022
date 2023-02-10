package com.example.swingA.jFrameExample;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Frame;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.PrintJob;
import java.awt.Toolkit;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Dialog.ModalityType;
import java.awt.datatransfer.Clipboard;
import java.awt.font.TextAttribute;
import java.awt.im.InputMethodHighlight;
import java.awt.image.ColorModel;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.net.URL;
import java.util.Map;
import java.util.Properties;

import javax.swing.JFrame;

public class App {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Dursikshya");
		//frame.setTitle("Dursikshya");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.setSize(800, 500);
		frame.setBounds(200, 100, 800, 500);
		//frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setUndecorated(false);
		frame.setIconImage(Toolkit.getDefaultToolkit().createImage("logo.png"));
		frame.setVisible(true);
	}
}
