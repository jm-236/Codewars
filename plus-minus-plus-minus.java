public class Solution {

  public static int signChange(int[] arr) {
    // your solution here
    int contador = 0; // conta quantas vezes o array troca de sinal 
    if (arr.length > 0)
      {
      int sinal = arr[0]; // armazena o numero paraa verificação do sinal
      for(int i = 0; i < arr.length; i++) // iteração do array
        {
         if (sinal >= 0 && arr[i] < 0) // se o sinal for positivo, verifica se o elemento é negativo
           {
            contador++; // incremnta o contador
            sinal = arr[i]; // mudança da variavel q representa o sinal
            }
         else if (sinal < 0 && arr[i] >= 0) // mesma coisa do outro if
           {
            contador++;
            sinal = arr[i];
         }
        }
      }
    return contador; // retorno do contador
  }

}
