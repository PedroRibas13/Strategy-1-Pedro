
public class aritmetica extends disciplina implements ICalcMedia{
	
	@Override
	public void calcularMedia() {
		setMedia((getP1() + getP2()) / 2);		
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
