package main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import entities.Comentario;
import entities.Postagem;

public class Main {

	public static void main(String[] args) throws ParseException {
		
		/* O programa utiliza da entidade Postagem e da entidade Comentario e de informações pré-definidas */
		/* para mostrar na tela essas informações utilizando StringBuilder */
		/* Exercicio em java para treinamento de conceitos básicos e StringBuilder. */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Comentario c1 = new Comentario("Uau, que postagem bacana!");
		
		Comentario c2 = new Comentario("Já deixei minha curtida!");
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Postagem p1 = new Postagem(sdf.parse("13/01/1999 05:40:25"), "Primeira postagem", "blah blah blah", 5);
		
		p1.adicionarComentario(c1);
		p1.adicionarComentario(c2);
		
		System.out.println(p1);
		
		sc.close();

	}

}
