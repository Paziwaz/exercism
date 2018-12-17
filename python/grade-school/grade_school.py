class School(object):
    def __init__(self):
        self.students = []

    def add_student(self, name, grade):
        self.students.append([grade, name])
        self.students.sort()

    def roster(self):
        return [
            self.students[grade][1]
            for grade in range(len(self.students))
            ]

    def grade(self, grade_number):
        return [
            self.students[grade][1]
            for grade in range(len(self.students))
            if grade_number in self.students[grade]
            ]
