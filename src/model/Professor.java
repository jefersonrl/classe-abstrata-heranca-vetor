package model;

public class Professor extends Funcionario {
	private String [] diciplinas;
	private String [] cursos;
	public String[] getDiciplinas() {
		return diciplinas;
	}
	public void setDiciplinas(String[] diciplinas) {
		this.diciplinas = diciplinas;
	}
	public String[] getCursos() {
		return cursos;
	}
	public void setCursos(String[] cursos) {
		this.cursos = cursos;
	}
	 
@Override
public double aumentoSalarial(double horaAula, double aumento) {
		double total =horaAula +(horaAula +(horaAula* (aumento/100 )) + (horaAula* 30/100));
		return total;
}

	}

