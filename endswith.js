function solution(str, ending){
  // TODO: complete
  // tamanhos
  var tam_str = str.length;
  var tam_ending = ending.length;
  
  // posição do ending na string
  var pos = tam_str - tam_ending;
  
  if (tam_ending > tam_str){
    return false;
  }
  
  else{
    var fim = str.slice(pos);
    
    if (fim == ending){
      return true;
    }
    else{
      return false;
    }
    
  }
}
