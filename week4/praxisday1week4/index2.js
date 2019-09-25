var mike = { name: 'Mike'};
var odd = [1];
var morning = function () { return "Greetings!"; }
morning.info = "Morning greetings function";

var evening = morning;
var john = mike;
var even = odd;

var kate = mike;
kate = { name : 'Kate' };

evening.info = 'Evening greetings function';
john.name = 'John';
even[0] = 1;

console.log('first ==> ', morning.info, mike, odd);
console.log('double ==> ', evening.info, john, even);