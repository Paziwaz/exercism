def distance(strand_a, strand_b):
    if (len(strand_a) != len(strand_b)):
        raise ValueError("Given strands need to be of equal length")
    differences = list(filter(lambda nucleotide: strand_a[nucleotide] != strand_b[nucleotide], range(len(strand_a))))
    return len(differences)
