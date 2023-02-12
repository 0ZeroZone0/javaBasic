package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Vector;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ScoreImpl implements Score {
	private List<ScoreDTO> list;
	
	public ScoreImpl() {
		list = new ArrayList<ScoreDTO>();
	};

	@Override
	public void input(ScoreDTO dto) {
		list.add(dto);
		JOptionPane.showMessageDialog(null, "등록완료");
		System.out.println("list ::" + list );

	}

	@Override
	public void print(DefaultTableModel model) {
		model.setRowCount(0); // 깨끗이 지운다.
		
		for(ScoreDTO dto : list) {
			Vector<String> v =new Vector<String>();
			v.add(dto.getHak());
			v.add(dto.getName());
			v.add(dto.getKor()+"");
			v.add(dto.getEng()+"");
			v.add(dto.getMath()+"");
			v.add(dto.getTot()+"");
			v.add(String.format("%.2.f", dto.getAvg()));
			
			model.addRow(v); //행 단위로 한줄씩
		};

	};

	@Override
	public void search(DefaultTableModel model) {
		String hak = JOptionPane.showInputDialog(null,"학번을 입력하세요");
		if(hak == null || hak.equals("")) return;
		
		int sw = 0;
		for(ScoreDTO dto : list) {
			if(hak.equals(dto.getHak())) {
				model.setRowCount(0);
				sw = 1;
				
				Vector<String> v =new Vector<String>();
				v.add(dto.getHak());
				v.add(dto.getName());
				v.add(dto.getKor()+"");
				v.add(dto.getEng()+"");
				v.add(dto.getMath()+"");
				v.add(dto.getTot()+"");
				v.add(String.format("%.2.f", dto.getAvg()));
				
				model.addRow(v); //행 단위로 한줄씩
				
			};
		};
		if(sw==0) JOptionPane.showMessageDialog(null, "찾고자 하는 학번이 없습니다.");
	};

	@Override
	public void tot_desc() {
		Comparator<ScoreDTO> com = new Comparator<ScoreDTO>() {

			@Override
			public int compare(ScoreDTO s1, ScoreDTO s2) {
				return s1.getTot() < s2.getTot() ? 1 : -1;
			};
		};
		
		Collections.sort(list,com);
	};

	@Override
	public void save() {
		JFileChooser chooser = new JFileChooser();
		int result = chooser.showSaveDialog(null);
		
		File file = null;
		if(result == JFileChooser.APPROVE_OPTION) {
			file = chooser.getSelectedFile();
		};
		
		if(file == null) return;
		
		
		try {
			ObjectOutputStream oos =  new ObjectOutputStream(new FileOutputStream(file));
			
			for(ScoreDTO dto : list) {
				oos.writeObject(dto);
			};
			
			oos.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		};

	};

	@Override
	public void load() {
		JFileChooser chooser = new JFileChooser();
		int result = chooser.showOpenDialog(null);
		if(result == JFileChooser.APPROVE_OPTION) {
			//file = chooser.getSelectedFile();
		};
	};
};
