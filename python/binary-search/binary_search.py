import math
def binary_search(list_of_numbers, number):
    first, last = 0, len(list_of_numbers) - 1
    while first <= last:
        checked_item = (first + last) // 2
        if list_of_numbers[checked_item] == number:
            return checked_item
        elif number < list_of_numbers[checked_item]:
            last = checked_item - 1
        else:
            first = checked_item + 1    
    raise ValueError("Not found")
