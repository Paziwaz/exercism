import re
import collections

def word_count(phrase):
    words = re.split("[^0-9a-zA-Z']", phrase.lower())
    words = list(filter(lambda word: word, words))
    words = map(lambda word: word.strip("''"), words)
    return collections.Counter(words)
