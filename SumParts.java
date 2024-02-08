class SumParts {

  public static int[] sumParts(int[] ls) {
      // your code
    /* 
     * 1-criar uma nova lista de tamanho igual a ls
     * 2-iterar ls
     * 3- somar todos os elementos e armazenar isso numa variavel
     * 4- Guardar a soma dentro de uma variavel e armazenala na nova lista
     * 5- Ir diminuindo essa soma pelos elementos do array e armazenando no elemento seguinte
     */
    
    if (ls.length == 0){ //se for um array de tam. 0, ele retorna 0
      return new int[] {0};
      }
    else{
      // array criado
      int lr[] = new int[ls.length+1];
      int soma = 0;
      for(int i = 0; i < ls.length; i++) // iterando ls
        {
        soma += ls[i];
      }
      for(int i = 0; i < ls.length; i++) // armazenando os valores em lr
        {
        lr[i] = soma; // store do valor
        soma -= ls[i];// soma subtraida
      }
      return lr;
      
  }
    }
}
