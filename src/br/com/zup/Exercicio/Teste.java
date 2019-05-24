package br.com.zup.Exercicio;
import br.com.zup.Exercicio.Pessoa;
import br.com.zup.Exercicio.Ator;
import br.com.zup.Exercicio.Programador;
import java.util.ArrayList;
import java.util.List;

public class Teste {

	public static void main(String[] args) {
		List<String> filmesParticipados = new ArrayList<String>();
		filmesParticipados.add("5");
		
		Ator ator = new Ator(filmesParticipados, true, 1995, "Jogos Vorazes", "Jennifeer", "Lawence",24);
		System.out.println(ator);
		
		Programador programador = new Programador(filmesParticipados, 1, true," Brenda", "Freitas", 18);
		System.out.println(programador);
		
	}

}
