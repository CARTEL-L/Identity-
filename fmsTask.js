function shortedSentenceWord(sentence) {
    let words = sentence.split(' ');
    let sample = words[0];

    for (let index = 0; index < words.length; index++) {
        if (words[index].length < sample.length) {
            sample = words[index];
        }
    }
    return sample;
}


function sortedSquares(numbers){
    for (let index = 0; index < numbers.length; index++) {
        numbers[index] = numbers[index] * numbers[index];
    }
    let holder = 0;
    for (let count = 0; count < numbers.length; count++) {
        for(let counter = count; counter < numbers.length; counter++) {
            if(numbers[count] > numbers[counter]){
                holder = numbers[count];
                numbers[count] = numbers[counter];
                numbers[counter] = holder;
            }
        }
    }
    return numbers;
}

module.exports = {shortedSentenceWord, sortedSquares};
