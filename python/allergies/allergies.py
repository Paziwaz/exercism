class Allergies(object):

    def __init__(self, score):
        self.score = [allergen for num, allergen in list(enumerate([
            'eggs',
            'peanuts',
            'shellfish',
            'strawberries',
            'tomatoes',
            'chocolate',
            'pollen',
            'cats'
            ]))
            if 0 < (score & (1 << num))]

    def is_allergic_to(self, item):
        return item in self.score

    @property
    def lst(self):
        return self.score
