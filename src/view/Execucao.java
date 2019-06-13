package view;

import javax.swing.JOptionPane;

import model.Professor;

public class Execucao {
	//Teste
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Professor professor = new Professor();

		professor.setNome(JOptionPane.showInputDialog(null, "Nome: "));
		professor.setEndereco(JOptionPane.showInputDialog(null, "Endereço: "));
		professor.setBairro(JOptionPane.showInputDialog(null, "Bairro: "));
		professor.setCidade(JOptionPane.showInputDialog(null, "Cidade: "));
		professor.setCep(Integer.parseInt(JOptionPane.showInputDialog(null, "Cep: ")));
		professor.setEstado(JOptionPane.showInputDialog(null, "Estado: "));
		professor.setRg(Long.parseLong(JOptionPane.showInputDialog(null, "Rg: ")));
		professor.setCpf(Long.parseLong(JOptionPane.showInputDialog(null, "Cpf: ")));

		try {
			int dis = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantas Disciplinas voce possui?"));
			String disciplinas[] = new String[dis];
			for (int i = 0; i < dis; i++) {
				disciplinas[i] = JOptionPane.showInputDialog(null, "Digite a disciplina " + i);
			}
			professor.setDiciplinas(disciplinas);

		} catch (Exception e) {
			e.printStackTrace();

		}

		try {
			int cur = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos cursos voce possui?"));
			String cursos[] = new String[cur];
			for (int i = 0; i < cur; i++) {
				cursos[i] = JOptionPane.showInputDialog(null, "Digite o cursos " + i);
			}
			professor.setCursos(cursos);

		} catch (Exception e) {
			e.printStackTrace();

		}
		
		try {
			for(int i = 0; i < professor.getDiciplinas().length; i++) {
				System.out.println(professor.getDiciplinas()[i]);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		try {
			for(int i = 0; i < professor.getCursos().length; i++) {
				System.out.println(professor.getCursos()[i]);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		

	}
}
