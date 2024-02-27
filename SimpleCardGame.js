function winner(deckSteve, deckJosh) {
  // TODO
  var cards = ['2','3','4','5','6','7','8','9','T','J','Q','K','A']
  var Steve_wins = 0;
  var Josh_wins = 0;
  
  for (var i = 0; i < deckSteve.length; i++){
    
    // pontos do jogadores na rodada
    var Steve_points = cards.indexOf(deckSteve[i]);
    var Josh_points = cards.indexOf(deckJosh[i]);
    
    // computando as vitórias
    if (Steve_points > Josh_points){ Steve_wins++; } 
    else if (Steve_points < Josh_points){ Josh_wins++; }
  }
  
  if (Steve_wins > Josh_wins){
    return "Steve wins " + Steve_wins + " to " + Josh_wins;
  }
  else if(Steve_wins < Josh_wins){
    return "Josh wins " + Josh_wins + " to " + Steve_wins;
  }
  else{return "Tie"}
}
