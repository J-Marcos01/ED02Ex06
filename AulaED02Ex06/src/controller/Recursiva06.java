package controller;
/*Faça uma função recursiva que, dado um vetor, inverta seus valores (O valor que está na posição zero 
troca de lugar com o valor que está na úl�ma posição, o valor que está na posição um troca de lugar com 
o valor que está na penúl�ma posição e assim por diante). Testar com um vetor de 10 e um de 11 posições
*/
public class Recursiva06 
{
	public Recursiva06() 
	{
		super();
	
	}
	public int [] invertePosicao(int []vet ,int primeiro,int ultimo)
	{
		int aux;
		if(ultimo-primeiro==1)
		{
			aux=vet[primeiro];
			vet[primeiro]=vet[ultimo];
			vet[ultimo]=aux;
			return vet;
		}
		else if (primeiro==ultimo)
		{
			
			return vet;
		}
		else 
		{
			aux=vet[primeiro];
			vet[primeiro]=vet[ultimo];
			vet[ultimo]=aux;
			return invertePosicao(vet,primeiro+1,ultimo-1);//retorno de funções não aceitão ++ ou --?
						
		}
		
		
	}
	
}
