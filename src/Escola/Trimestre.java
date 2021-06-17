package Escola;

import java.util.ArrayList;
import java.util.List;

public class Trimestre {

	private String name;
	private List<Double> grades;
	private Double AVG;

//-----------------------------------------------------------------------------------------------------

	public Trimestre(String name, List<Double> grades) {
		this.name = name;
		this.grades = new ArrayList<Double>();
		setNotas(grades);
	}

//-----------------------------------------------------------------------------------------------------

	public String getNome() {
		return name;
	}

	public void setNome(String name) {
		this.name = name;
	}

	public List<Double> getNotas() {
		return grades;
	}

	public void setNotas(List<Double> grades) {
		this.grades = grades;
	}

	public Double getAVG() {
		return AVG;
	}

	public void setAVG(Double AVG) {
		this.AVG = AVG;
	}

//-----------------------------------------------------------------------------------------------------

	public void calculateTheAVG() {
		Double Calculation = 0.0;

		for (Double nota : grades) {
			Calculation += nota;
		}
		setAVG(Calculation / this.grades.size());
	}

	public String toString() {
		return "Student name: " 
	            + name 
	            + "\ngrades: " 
	            + grades 
	            + ",\nAVG: " 
	            + String.format("%.2f", AVG);
	}

}
