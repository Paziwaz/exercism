from collections import defaultdict

class Garden(object):

    studentName = [
        'Alice', 'Bob', 'Charlie', 'David',
        'Eve', 'Fred', 'Ginny', 'Harriet',
        'Ileana', 'Joseph', 'Kincaid', 'Larry'
        ]

    plant = {'C': 'Clover', 'G': 'Grass', 'R': 'Radishes', 'V': 'Violets'}

    def __init__(self, diagram, students = studentName):
        self.sortedStudents = defaultdict(list)
        self.diagram = diagram.splitlines()
        for b, a in list(enumerate(sorted(students))):
            self.sortedStudents[a].extend(self.diagram[0][b * 2: b * 2 + 2] + self.diagram[1][b * 2: b * 2 + 2])

    def plants(self, student):
        return  [self.plant[x] for x in self.sortedStudents[student]]
