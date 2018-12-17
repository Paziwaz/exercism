def sum_of_multiples(limit, multiples):
    sum = 0
    for multiple in range(limit):
        for divisor in multiples:
            if multiple % divisor == 0:
                sum += multiple
                break
    return sum
