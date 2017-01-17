/************************************************************************************************
 *  _________          _     ____          _           __        __    _ _      _   _   _ ___
 * |__  / ___|__ _ ___| |__ / ___|_      _(_)_ __   __ \ \      / /_ _| | | ___| |_| | | |_ _|
 *   / / |   / _` / __| '_ \\___ \ \ /\ / / | '_ \ / _` \ \ /\ / / _` | | |/ _ \ __| | | || |
 *  / /| |__| (_| \__ \ | | |___) \ V  V /| | | | | (_| |\ V  V / (_| | | |  __/ |_| |_| || |
 * /____\____\__,_|___/_| |_|____/ \_/\_/ |_|_| |_|\__, | \_/\_/ \__,_|_|_|\___|\__|\___/|___|
 *                                                 |___/
 *
 * Copyright (c) 2016 Ivan Vaklinov <ivan@vaklinov.com>
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 **********************************************************************************/
package com.vaklinov.zcashui;


import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.UnsupportedEncodingException;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.border.EtchedBorder;


/**
 * Typical about box stuff...
 *
 * @author Ivan Vaklinov <ivan@vaklinov.com>
 */
public class AboutDialog
	extends JDialog
{
	public AboutDialog(JFrame parent)
		throws UnsupportedEncodingException
	{
		this.setTitle("About...");
		this.setSize(640,  440);
	    this.setLocation(100, 100);
		this.setLocationRelativeTo(parent);
		this.setModal(true);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

		JTabbedPane tabs = new JTabbedPane();

		JPanel copyrigthPanel = new JPanel();
		copyrigthPanel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		copyrigthPanel.setLayout(new BorderLayout(3, 3));
		JLabel copyrightLabel = new JLabel();
		copyrightLabel.setText("<html><body><span style=\"font-weight:bold\">ZClassic<span style=\"font-weight:bold;vertical-align:super\">&#x00AE;</span> Swing Wallet UI</span><br/><br/>Copyright:<br/>Ivan Vaklinov &lt;ivan@vaklinov.com&gt;<br/>Joshua Yabut  &lt;joshua2014@prontonmail.ch&gt;<br/><br/>This program is intended to make it easy to work with the ZCash/Zclassic client tools by providing a Graphical User Interface (GUI) that acts as a wrapper and presents the information in a user-friendly manner.<br/><br/><span style=\"font-weight:bold\">Disclaimer:</span> this program is not officially endorsed by or associated with the ZCash project and the ZCash company. ZCash and the ZCash logo are trademarks of the Zerocoin Electric Coin Company. <br/><br/>Acknowledgements: This program includes software for JSON processing (https://github.com/ralfstx/minimal-json) that is Copyright (c) 2015, 2016 EclipseSource.<br/><br/></body></html>");
		copyrightLabel.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
		copyrigthPanel.add(copyrightLabel, BorderLayout.NORTH);
		
		
		JPanel PD = new JPanel();
		PD.setLayout(new BorderLayout(3, 3));
		PD.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
		JLabel l1 = new JLabel("<html><body><span style=\"font-weight:bold\">Donations accepted:</span> This ZClassic GUI wallet has been brought to you thourgh the efforts of community volunteers. If you find it useful please consider making a donation for its further development. Donations of <span style=\"font-weight:bold\">any size</span> are accepted to the following <span style=\"font-weight:bold\">ZClassic address:</span><br/></body></html>");
		PD.add(l1, BorderLayout.NORTH);
		JPanel PD2 = new JPanel();
		PD2.setLayout(new BorderLayout(3, 3));
		final JTextArea tar = new JTextArea();
		tar.setEditable(false);
		tar.setLineWrap(true);
		tar.setText("t3NPxHw1EnjNfqDf8Y2y9yutER6DGDV31ZY");
		PD2.add(tar, BorderLayout.CENTER);
		JPanel PD3 = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
		final JButton jb1 = new JButton(new String(new byte[] {
				(byte)0x3c,(byte)0x68,(byte)0x74,(byte)0x6d,(byte)0x6c,(byte)0x3e,(byte)0x3c,(byte)0x62,(byte)0x6f,(byte)0x64,
				(byte)0x79,(byte)0x3e,(byte)0x3c,(byte)0x73,(byte)0x70,(byte)0x61,(byte)0x6e,(byte)0x20,(byte)0x73,(byte)0x74,
				(byte)0x79,(byte)0x6c,(byte)0x65,(byte)0x3d,(byte)0x22,(byte)0x66,(byte)0x6f,(byte)0x6e,(byte)0x74,(byte)0x2d,
				(byte)0x73,(byte)0x69,(byte)0x7a,(byte)0x65,(byte)0x3a,(byte)0x38,(byte)0x70,(byte)0x78,(byte)0x3b,(byte)0x66,
				(byte)0x6f,(byte)0x6e,(byte)0x74,(byte)0x2d,(byte)0x77,(byte)0x65,(byte)0x69,(byte)0x67,(byte)0x68,(byte)0x74,
				(byte)0x3a,(byte)0x62,(byte)0x6f,(byte)0x6c,(byte)0x64,(byte)0x22,(byte)0x3e,(byte)0x43,(byte)0x6f,(byte)0x70,
				(byte)0x79,(byte)0x20,(byte)0x61,(byte)0x64,(byte)0x64,(byte)0x72,(byte)0x65,(byte)0x73,(byte)0x73,(byte)0x3c,
				(byte)0x62,(byte)0x72,(byte)0x2f,(byte)0x3e,(byte)0x74,(byte)0x6f,(byte)0x20,(byte)0x63,(byte)0x6c,(byte)0x69,
				(byte)0x70,(byte)0x62,(byte)0x6f,(byte)0x61,(byte)0x72,(byte)0x64,(byte)0x3c,(byte)0x2f,(byte)0x73,(byte)0x70,
				(byte)0x61,(byte)0x6e,(byte)0x3e,(byte)0x3c,(byte)0x2f,(byte)0x68,(byte)0x74,(byte)0x6d,(byte)0x6c,(byte)0x3e,
				(byte)0x3c,(byte)0x2f,(byte)0x62,(byte)0x6f,(byte)0x64,(byte)0x79,(byte)0x3e,
		    }, "UTF-8"));
		PD3.add(jb1);
		jb1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
				clipboard.setContents(new StringSelection(tar.getText()), null);
			}
		});
		PD2.add(PD3, BorderLayout.EAST);
		PD.add(PD2, BorderLayout.CENTER);
		copyrigthPanel.add(PD, BorderLayout.CENTER);

		
		tabs.add("About", copyrigthPanel);

		JPanel licensePanel = new JPanel();
		licensePanel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		licensePanel.setLayout(new BorderLayout(3, 3));
		JLabel licenseLabel = new JLabel();
		licenseLabel.setText(
			"<html><body><pre>" +
		    " Copyright (c) 2016 Ivan Vaklinov &lt;ivan@vaklinov.com&gt; \n" +
			"\n" +
			" Permission is hereby granted, free of charge, to any person obtaining a copy\n" +
			" of this software and associated documentation files (the \"Software\"), to deal\n" +
			" in the Software without restriction, including without limitation the rights\n" +
			" to use, copy, modify, merge, publish, distribute, sublicense, and/or sell\n" +
			" copies of the Software, and to permit persons to whom the Software is\n" +
			" furnished to do so, subject to the following conditions:\n" +
			" \n" +
			" The above copyright notice and this permission notice shall be included in\n" +
			" all copies or substantial portions of the Software.\n" +
			" \n" +
			" THE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR\n" +
			" IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,\n" +
			" FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE\n" +
			" AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER\n" +
			" LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,\n" +
			" OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN\n" +
			" THE SOFTWARE.		\n" +
			"</pre></body></html>");
		licenseLabel.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));
		licensePanel.add(licenseLabel, BorderLayout.NORTH);

		tabs.add("License", licensePanel);

		this.getContentPane().setLayout(new BorderLayout(0, 0));
		this.getContentPane().add(tabs, BorderLayout.NORTH);

		JPanel closePanel = new JPanel();
		closePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 3, 3));
		JButton closeButon = new JButton("Close");
		closePanel.add(closeButon);
		this.getContentPane().add(closePanel, BorderLayout.SOUTH);

		closeButon.addActionListener(new ActionListener()
			{
				@Override
				public void actionPerformed(ActionEvent e)
				{
					AboutDialog.this.setVisible(false);
					AboutDialog.this.dispose();
				}
		});
	}
}
