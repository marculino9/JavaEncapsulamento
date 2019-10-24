package br.edu.unifcv.faculdade;

import java.util.ArrayList;
import java.util.List;

import br.edu.unifcv.faculdade.model.Calculadora;
import br.edu.unifcv.faculdade.model.Cliente;
import br.edu.unifcv.faculdade.model.Pessoa;
import br.edu.unifcv.faculdade.model.RealizarCalculo;
import br.edu.unifcv.faculdade.model.Somar;
import br.edu.unifcv.faculdade.model.Subtrair;

public class App 
{
    public static void main( String[] args )
    {
//		Object b = "Andre";
//		System.err.println(b);
//		String a = (String) b;
//
//		System.out.println(a);

//    Pessoa p = new Pessoa();
//    Cliente c = new Cliente();
    
//      List<String> lista = new ArrayList<String>();
    	
    int opcao = 0;
    Calculadora calculadora = null;
    
    switch (opcao) {
	case 0:
		calculadora = new Somar();
		break;
	case 1:
		calculadora = new Subtrair();
		break;
	default:
		break;
	}
    RealizarCalculo realizarCalculo = new RealizarCalculo(calculadora);
    realizarCalculo.realizarCalculo();
    
//    calculadora.Calcular(1, 1);
//    calculadora.Resultado();
   
    
    }
}
