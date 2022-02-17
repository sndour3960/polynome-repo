package polynome;

/**
 * Cette classe permet de definir un un polynome.
 * Elle contient deux attributs: dégre et elements.
 * Elle a trois constructeurs :
 * - un constructeur sans paramètre
 * - un constructeur avec un paramètre degree, qui represente le degre du polynome  @param degree.
 *  - un constructeur avec un paramètre, qui represente un tableau d'entiers  @param  int elements[],
 *   ce tableau contient les elements du polynome.
 *   @param  
 *  
 * @author Serigne NDOUR
 *
 */


/**
 * @version 1.0
 *
 */


public class Polynome {
	
	private int degre;
	private int[] elements;
	
	public Polynome() {
	
	}
	
	 
	/**
	 * Ce constructeur permet de construire un polynome à partir d'un degrée donnée
	 * @param degre
	 */
	public Polynome(int degre) {
		
		this.degre = degre;
		this.elements= new int[degre+1];
		for (int i = 0; i <= degre; i++) {
			this.elements[i]=0;
		}
	}

	
	/**
	 * Ce constructeur permet de creer un polynome à partir d'un tableau de int.
	 * @param elements
	 */
	public Polynome(int[] elements) {
		
		this.degre = elements.length-1;
		this.elements = new int[elements.length];
		 for (int i=0 ;i<=this.degre;) {
			this.elements[i]=elements[i];
		}
	}

	public int getDegre() {
		return degre;
	}

	public void setDegre(int degre) {
		this.degre = degre;
	}

	public int getCoefficient(int i) {
		int retour ;
		
		if (i<this.elements.length) {
			retour = this.elements[i];
		} else {
			retour=0;
		}
		
		return retour;
	}

	public void setCoefficient(int  i, int x) {
		if (i<this.elements.length) {
			this.elements[i] = x;
					
				} else ;
		
				
	}
	
	
	/**
	 * 
	 * @param polynome
	 * @return
	 */
	public Polynome addition(Polynome polynome) {
		
		int degreMax = Math.max(polynome.degre, this.degre);
		Polynome pr = new Polynome(degreMax);
		for (int i = 0; i <= degreMax; i++) {
			pr.setCoefficient(i, this.getCoefficient(i)+pr.getCoefficient(i));
		}
		
		return pr;
	}
	
	
	public Polynome derivee() {
		Polynome pr = new Polynome((this.degre-1));
		
		for (int i = 0; i <= this.degre; i++) {
			pr.elements[i] = (i+1)*this.elements[i+1];
		}
		
		return pr;
	}
	
	public int  calcul(int x) {
		int retour = 0;
		
		for (int i = 0; i <= this.degre; i++) {
			retour += (i+1)*this.elements[i]*Math.pow(x,i);
		}
		return retour;
	}
	

	/**
	 * Cette methode permet de formater le polynome sous la forme: 2+3X+9x^2+...
	 * @return
	 */
	public String toStrint() {
		
		String poly = ""+this.elements[0];
		
		for (int i = 0; i < this.degre; i++) {
			if (this.elements[i]>0) {
				poly +="+"+this.elements[i]+"X^"+i;
				
			} else 
				if(this.elements[i]<0)
					poly +="+"+this.elements[i]+"X^"+i;
		}
		return poly;
	}
	
	
}
