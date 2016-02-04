package modelo;

public class Boneco {
	private String desenho = "";
	private int erro =0;
	private String[] bonecoExibido = new String[7];
	
	public String[] bonecoExibir() {
		bonecoExibido[0] = "иии|";
		if (erro ==1) bonecoExibido[1] = "\n   O\n";
		if (erro ==2) bonecoExibido[2] = "  /";
		if (erro ==3) bonecoExibido[3] = "|";
		if (erro ==4) bonecoExibido[4] = "\\ \n";
		if (erro ==5) bonecoExibido[5] = "  / ";
		if (erro ==6) bonecoExibido[6]= "\\";
		
		return bonecoExibido;
		
	}
	
	@Override
	public String toString() {
		String partes = "";
		for (String b : bonecoExibido) {
			if (b!= null){
				partes += b;			}
		}	
		return partes;
	}

	public String getDesenho() {
		return desenho;
	}

	public int getErro() {
		return erro;
	}

	public void setErro(int erro) {
		this.erro = erro;
	}

	public String[] getBonecoExibido() {
		return bonecoExibido;
	}
	
	
	
	
}
