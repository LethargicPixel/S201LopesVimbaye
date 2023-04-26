package model;

import java.util.ArrayList;

public class Panier {
	private Integer place;
	private ArrayList<Face> contenu = new ArrayList<>();
	private Integer numero;
	
	
	public Panier(Integer place, Integer numero) {
		this.place = place;
		this.numero = numero;
	}

	public Boolean verifPlace() {
		return place!=0;
	}
	
	public void montreContenu() {
		contenu.forEach((contenus) -> System.out.println(contenus.toText()));
	}
	
	
	
	public Boolean remplir(Face objet) {
		if (Boolean.TRUE.equals(verifPlace())) {
			contenu.add(objet);
			place--;
			System.out.printf("vous avez ajouter une %s au panier n°%d, il reste %d place(s)\n", objet.toText(),numero,place);
			return true;
		} else {
			System.out.printf("il est impossible dajouter une %s car le panier n°%d est rempli\n", objet.toText(),numero);
			return false;
		}
	}
}
