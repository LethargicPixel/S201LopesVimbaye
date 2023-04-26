package model;

public enum Face {
COULEUR1("Pommes"),
COULEUR2("Poires"),
COULEUR3("Abricots"),
COULEUR4("Peches"),
COULEUR5("corbeau"),
COULEUR6("bonus");

private String values;

private Face(String values) {
	this.values=values;
}

public String toText() {
	return this.values;
}

}
