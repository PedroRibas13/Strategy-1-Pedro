
public class geometrica extends disciplina implements ICalcMedia{

	@Override
	public void calcularMedia() {
		setMedia( Math.sqrt(getP1()+getP2()));	
	}
	@Override
	public void situacao() {
		if(getMedia() >= 6) {
			setSituacao("Aprovado");
		}else {
		setSituacao("Reprovado");
		}
	}
}
