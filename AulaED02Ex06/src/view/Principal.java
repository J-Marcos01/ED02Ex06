package view;

import controller.Recursiva06;

public class Principal
{

	public static void main(String[] args) 
	{
		Recursiva06 op = new Recursiva06();
		int [] vet= {0,1,2,3,4,5,6,7,8,9,10};
		
		vet=op.invertePosicao(vet, 0, 10);
		for(int i =0;i<11;i++)
		{
			System.out.println(vet[i]);
		}
		
		int []vet2={0,1,2,3,4,5,6,7,8,9};
		
		vet2=op.invertePosicao(vet2, 0, 9);
		for(int i =0;i<10;i++)
		{
			System.out.println(vet2[i]);
		}
		
	}

}
