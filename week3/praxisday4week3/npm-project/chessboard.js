var a = 5;
var b = "";

for (var i = 0; i < a; i++){    
  for (var j = 0; j < a; j++) {
      if (i%2==0) {
          b += " #"
      }
      else {
          b += "# "
      }
      
  }
  console.log(b);
  b = "";
}