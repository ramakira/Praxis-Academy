var countBs = function(str) {
    return str.match(/B/g).length;
};

var countChar = function(str, character) {
    var matchExp = new RegExp(character, 'g');
    return str.match(matchExp).length;
};

var countChar2 = function(str, character) {
    var count = 0;
    for (var i = 0; i < str.length; i++) {
        if (str[i] == character)
            count++;
    }
    return count;
};


console.log(countBs('BBC'));
console.log(countChar('kakkerlak', 'k'));
console.log(countChar2('kakkekekkkkkkkekrlak', 'k'));