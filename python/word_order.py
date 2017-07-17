# https://www.hackerrank.com/challenges/word-order?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign
#
# from ordered_set import *
from __future__ import print_function
from collections import Counter, OrderedDict

class OrderedCounter(Counter, OrderedDict):
    pass

if __name__ == '__main__':
    # handle input
    mylist = []
    mylistUniq = []
    n = int( raw_input() )
    # mylist = [raw_input().strip() for _ in range(n)]
    for i in range(n):
        myinput = raw_input().strip()
        mylist.append( myinput )
        if myinput not in mylistUniq:
            mylistUniq.append( myinput )

    # mylistUniq = list(OrderedSet(mylist))
    # mylistUniq = list(filter(lambda x: mylist.count(x) == 1, mylist))
    # print mylistUniq

    # logic starts here
    # res = [ str( mylist.count( i ) ) for i in mylistUniq ]
    # myCounter = OrderedCounter(mylist)
    myCounter = Counter(mylist)

    # print len( mylistUniq )
    # print ' '.join( str(myCounter[i]) for i in mylistUniq )
    print(len(myCounter.keys()))

    counts = [ myCounter[i] for i in mylistUniq ]
    print( *counts )
    # args = myCounter.values()
    # print(*args)
