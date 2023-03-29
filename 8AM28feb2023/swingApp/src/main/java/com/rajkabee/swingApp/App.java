package com.rajkabee.swingApp;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Frame;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.PrintJob;
import java.awt.Toolkit;
import java.awt.BorderLayout;
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
import javax.swing.JLabel;


public class App 
{
    public static void main( String[] args )
    {
        JFrame frame = new JFrame("Dursikshya");
        //frame.setTitle("Dursikshya");
        frame.setIconImage(Toolkit.getDefaultToolkit().getImage("logo.png"));
        //frame.setSize(800, 500);
        frame.setBounds(250, 150, 800, 500);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        //frame.setUndecorated(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel header = new JLabel("HEADER");
        header.setFont(new Font("Calibri", 1, 56));
        JLabel leftBar = new JLabel("NAV BAR");
        JLabel rightBar = new JLabel("RIGHT BAR");
        JLabel content = new JLabel("MAIN CONTENT");
        JLabel footer = new JLabel("FOOTER");
        //frame.setLayout(new FlowLayout());
        frame.setLayout(new BorderLayout());
        
        frame.add(header, BorderLayout.NORTH);
        frame.add(leftBar, BorderLayout.WEST);
        frame.add(content, BorderLayout.CENTER);
       // frame.add(rightBar, BorderLayout.EAST);
        //frame.add(footer, BorderLayout.SOUTH);
        
        frame.setVisible(true);
        
    }
}
