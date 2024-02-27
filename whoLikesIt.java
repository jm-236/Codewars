class Solution {
    public static String whoLikesIt(String... names) {
        //Do your magic here
        // Caso 1: 0 likes
        if (names.length == 0){
          return "no one likes this";
        }
        // Caso 2: 1 like
        else if (names.length == 1){
          
          return names[0] + " likes this";
        }
        // Caso 3: 2 likes
        else if (names.length == 2){
          
          return names[0] + " and " + names[1] + " like this";
        }
      
        // Caso 4: 3 likes
        else if (names.length == 3){
          
          return names[0] + ", " + names[1] + " and " + names[2] + " like this";
        }
      
        // Último caso: mais de 3 likes
        else if (names.length > 3){
          int remaining = names.length - 2;
          String remaining_str = Integer.toString(remaining);
          
          return names[0] + ", " + names[1] + " and " + remaining_str + " others like this";
        }
      
      
        return "";
    }
}
