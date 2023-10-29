const originalArray = [5, 2, 9, 1, 5, 6];

// Create a copy of the array and sort it in descending order
const sortedArray = [...originalArray];
sortedArray.sort(function(a, b) {
  return b - a;
});

console.log(sortedArray); // Output: [9, 6, 5, 5, 2, 1]

// The original array remains unchanged
console.log(originalArray); // Output: [5, 2, 9, 1, 5, 6]
