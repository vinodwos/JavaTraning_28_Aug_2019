package com.sg.demos;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class TableDemo2 {

	public static void main(String[] args) {

		JFrame f = new JFrame();

		String column[] = { "ID", "NAME", "SALARY" };
		DefaultTableModel tm = new DefaultTableModel(column, 0);
		JTable jt = new JTable(tm);
		tm.addRow(new Object[] { 1001, "ram", 7000 });
		tm.addRow(new Object[] { 1002, "tom", 9000 });
		JScrollPane sp = new JScrollPane(jt);

		JButton btn = new JButton("Add");
		btn.setSize(20, 20);

		JPanel p1 = new JPanel(new GridLayout(3, 2, 10, 10));
		JLabel l1 = new JLabel("Employee ID");
		JLabel l2 = new JLabel("Employee Name");
		JLabel l3 = new JLabel("Employee Salary");
		JTextField t1 = new JTextField(10);
		JTextField t2 = new JTextField(10);
		JTextField t3 = new JTextField(10);
		p1.add(l1);
		p1.add(t1);
		p1.add(l2);
		p1.add(t2);
		p1.add(l3);
		p1.add(t3);

		btn.addActionListener((e) -> {
			String data[] = { t1.getText(), t2.getText(), t3.getText() };
			tm.addRow(data);
		});
		p1.setBounds(50, 50, 200, 100);
		btn.setBounds(50, 110, 80, 120);
		sp.setBounds(50, 250, 400, 600);

		f.add(p1);
		f.add(btn);
		f.add(sp);

		f.setSize(500, 700);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
