var reverseArray = function(arr){
    var newArr = [];
    for (var i = arr.length - 1; i >= 0; i--){
        newArr.push(arr[i]);
        return newArr;
    }
}

function reverseArrayInPlace(arr){
    var temp = 0;
    for (var i = 0; i < arr.length / 2; i++) {
        temp = arr[i];
        arr[i] = arr[arr.length - i - 1];
        arr[arr.length - i - 1] = temp;
    }
}

console.log(reverseArray(['A','B','C']));
var arrayValue = [1, 2, 3, 4, 5, 6, 7, 8, 9];
reverseArrayInPlace(arrayValue);
console.log(arrayValue);