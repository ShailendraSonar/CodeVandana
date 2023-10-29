function reverseWordsInSentence(sentence) {
    // Split the sentence into words using a space as the delimiter
    const words = sentence.split(' ');
  
    // Reverse each word and store them in an array
    const reversedWords = words.map(word => {
      // Reverse the word by splitting it into characters, reversing them, and joining back
      return word.split('').reverse().join('');
    });
  
    // Join the reversed words to form the reversed sentence
    const reversedSentence = reversedWords.join(' ');
  
    return reversedSentence;
  }
  
  // Example usage:
  const inputSentence = "This is a sunny day";
  const reversedSentence = reverseWordsInSentence(inputSentence);
  console.log(reversedSentence); // Output: "sihT si a ynnus yad"
  