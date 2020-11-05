var array1 = ['cat', 'sum', 'sun', 'run', 'hut', 'ea'];
var array2 = ['bat', 'cat', 'hut'];

Array.prototype.diff = function (arr2) {
  var ret = [];
  for (var i = 0; i < array1.length; i += 1) {
    if (arr2.indexOf(array1[i]) > -1) {
      ret.push(array1[i]);
    }
  }
  return ret;
};

console.log(array1.diff(array2));