public class PascalsTriangle {
    public static long[] generate(int level) {
      int n = 0; // numero de termos
      
      for(int i = level; i > 0; i --) // incrementando a qtde de termos de acordo c o nivel
        {
        n += i;
      }
      
      long pascal[] = new long[n]; // criacao do array 
      pascal[0] = 1; // definicao da linha 1 do array
      if (n > 1){ // definicao da linha 2 do array
        pascal[1] = 1;
        pascal[2] = 1;
      }
      int indice = 3; // indice do elemento q eu estou definindo
      for(int i = 3; i <= level; i++) // i = linha que eu estou
        {
        for(int j = 0; j < i; j++) // j = elemento da linha que eu estou
          {
          if(j==0)
            {
            pascal[indice] = 1;
          }
          else if(j == (i-1))
            {
            pascal[indice] = 1;
          }
          else
            {
            pascal[indice] = pascal[indice-i] + pascal[indice+1-i];
          }
          indice++;
        }
      }
        
      return pascal;
    }
}
