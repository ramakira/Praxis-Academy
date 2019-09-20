var range = function(start, end, step) {
    var arr = [];
    for (var i = start; step > 1 || step === undefined ? i <= end : i >= end; step ? i = i + step : i++)
        arr.push(i);
    return arr;
};

var sum = function(arr) {
    return arr.reduce(function(x, y) {
        return x + y;
    });
};

console.log(sum(range(1, 10)));
console.log(range(1, 10));
console.log(range(5, 2, -1));
console.log(range(1, 10, 2));

