def saddle_points(matrix):

    if any(len(matrix[0]) != len(row) for row in matrix):
        raise ValueError("Rows are different lengths.")
    points = set()
    turned_matrix = list(zip(*matrix))
    for rowValue, row in enumerate(matrix):
        for columnValue, column in enumerate(row):
            if max(matrix[rowValue]) == min(turned_matrix[columnValue]):
                points.add((rowValue, columnValue))

    return points
