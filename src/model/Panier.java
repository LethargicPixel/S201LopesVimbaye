package model;

import java.util.ArrayList;

public class Panier {
	
public Panier(Integer place) {
		this.place = place;
	}

private Integer place;
private ArrayList<Face> contenu = new ArrayList<>();

public Boolean verifPlace() {
	return place!=0;
}

public void montreContenu() {
	contenu.forEach((contenus) -> System.out.println(contenus.toText()));
	
}

public void remplir(Face objet) {
	if (Boolean.TRUE.equals(verifPlace())) {
		contenu.add(objet);
		place--;
		System.out.printf("vous avez ajouter une %s au panier, il reste %d place(s)", objet.toText(),place);
		System.out.printf("%d",3);
	} else {
		System.out.printf("il est impossible dajouter une %s car le panier est rempli", objet.toText());
	}
}
}
