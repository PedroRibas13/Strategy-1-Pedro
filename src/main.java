
public class main{

	public static void main(String[] args) {
		//aritmetica calculo = new aritmetica(); 
		geometrica calculo = new geometrica();
		
		disciplina d = new disciplina(calculo);
		d.setNome( "Padroes de Desenvolvimento");
		d.setP1(10); 
		d.setP2(5);
		d.calcularMedia();
		System.out.println(
				String.format("P1:%.2f P2:%.2f Media:%.2f  Situacao: %s",
						d.getP1(),d.getP2(), d.getMedia(), d.getSituacao()));

	}

}
