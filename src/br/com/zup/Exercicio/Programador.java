package br.com.zup.Exercicio;
import java.util.ArrayList;
import java.util.List;
public class Programador extends Pessoa {

	List<String> linguagensUsadas = new ArrayList<String>();
	int anosExperiencia;
	boolean gostaDeCafe;
	public List<String> getLinguagensUsadas() {
		return linguagensUsadas;
	}
	public Programador(List<String> linguagensUsadas, int anosExperiencia, boolean gostaDeCafe,String nome,String sobrenome,int idade) {
		super(nome,sobrenome,idade);
		this.linguagensUsadas = linguagensUsadas;
		this.anosExperiencia = anosExperiencia;
		this.gostaDeCafe = gostaDeCafe;
	}
	public void setLinguagensUsadas(List<String> linguagensUsadas) {
		this.linguagensUsadas = linguagensUsadas;
	}
	public int getAnosExperiencia() {
		return anosExperiencia;
	}
	public void setAnosExperiencia(int anosExperiencia) {
		this.anosExperiencia = anosExperiencia;
	}
	public boolean isGostaDeCafe() {
		return gostaDeCafe;
	}
	public void setGostaDeCafe(boolean gostaDeCafe) {
		this.gostaDeCafe = gostaDeCafe;
	}
	
	public String toString() {
		String modelo = "";
		modelo += "linguagem usadas -> " + this.getLinguagensUsadas() + "\n";
		modelo += "anos de experiencia ->" + this.getAnosExperiencia() + "\n";
		modelo += "gosta de café-> " + this.isGostaDeCafe() + "\n";
		modelo += "nome -> " + super.getNome() + "\n";
		modelo += "sobrenome ->"+ super.getSobrenome() + "\n";
		modelo += "idade -> " + super.getIdade() +"\n";
		return modelo;
		
	}
	
}
