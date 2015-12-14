# Practice 2011 - 04: Arithmetic and Geometric Sums

## Background
An arithmetic series is defined as a series of numbers where each following
number is an additive constant away from the previous number.
```
a(1) + a(2) + ... + a(n) = a(1) + (a(1) + d) +(a(1) + 2d) + ... + (a(1) + nd)
```
The sum of all values `a(1)` to `a(n)` is given by:
```
S(n) = (n[2*a(1) + (n-1)*d])/2
```

## Description

### Input
The input will be given by 2 lines for each data set. The first line will be N,
the term to which the sum should be computed. The next line of data is the
series of numbers. They will be integers with a space separating each one. The
series will be either geometric or arithmetic. The end of the input will be
signaled by an N value of zero.

### Output
For each test case output S(n) on its own line.

## Sample
### Input
```
4
9 27 81
36
29 94 159
0
```

### Output
```
360
41994
```
