package model;

public class ElementsVerger {
private Face specificite;
private Integer actionRestante;

public ElementsVerger(Face specificite, Integer actionTotal) {
	super();
	this.specificite = specificite;
	this.actionRestante = actionTotal;
}

public Boolean verifActionRestante() {
	return actionRestante!=0;
}

public void faitAction(Panier panier) {
	if (Boolean.TRUE.equals(panier.remplir(specificite))) {
		actionRestante--;
	}
}

}	

