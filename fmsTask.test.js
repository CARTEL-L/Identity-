const {shortedSentenceWord ,sortedSquare}= require('./fmsTask');

describe('shortedSentenceWord', () => {
    test('should return the shortest word in a sentence', () => {
        expect(shortedSentenceWord('The quick brown fox')).toBe('The');
        expect(shortedSentenceWord('Hello world')).toBe('world');
        expect(shortedSentenceWord('A journey of a thousand miles begins with a single step')).toBe('A');
    });
});

describe('sortedSquares', () => {
    test('should return an array of sorted squares', () => {
        expect(sortedSquares([-4, -1, 0, 3, 10])).toEqual([0, 1, 9, 16, 100]);
        expect(sortedSquares([-7, -3, 2, 3, 11])).toEqual([4, 9, 9, 49, 121]);
    });
});