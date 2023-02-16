def collatz(n: Int): Int = 
    if n % 2 == 1 then 3*n+1
        else n/2


def collatzCount(n: Int): Int = 
    var count = 0
    var value = n
    while (value != 1) {
        count = count + 1;
        value = collatz(value);
    }
    count